package B3;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H3.i f1511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f1513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f1514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f1515f;

    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public static class a {
    }

    public j(H3.i iVar, int i10) {
        this.f1511b = iVar;
        this.f1512c = i10;
    }

    @Override // B3.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // B3.d
    public final void b() {
        InputStream inputStream = this.f1514e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1513d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1513d = null;
    }

    public final InputStream c(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f1513d = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f1513d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f1513d.setConnectTimeout(this.f1512c);
        this.f1513d.setReadTimeout(this.f1512c);
        this.f1513d.setUseCaches(false);
        this.f1513d.setDoInput(true);
        this.f1513d.setInstanceFollowRedirects(false);
        this.f1513d.connect();
        this.f1514e = this.f1513d.getInputStream();
        if (this.f1515f) {
            return null;
        }
        int responseCode = this.f1513d.getResponseCode();
        int i11 = responseCode / 100;
        if (i11 == 2) {
            HttpURLConnection httpURLConnection = this.f1513d;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f1514e = new X3.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f1514e = httpURLConnection.getInputStream();
            }
            return this.f1514e;
        }
        if (i11 != 3) {
            if (responseCode == -1) {
                throw new HttpException(J4.i.b(responseCode, "Http request failed with status code: "), responseCode);
            }
            throw new HttpException(this.f1513d.getResponseMessage(), responseCode);
        }
        String headerField = this.f1513d.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url", -1);
        }
        URL url3 = new URL(url, headerField);
        b();
        return c(url3, i10 + 1, url, map);
    }

    @Override // B3.d
    public final void cancel() {
        this.f1515f = true;
    }

    @Override // B3.d
    public final void e(Priority priority, d.a<? super InputStream> aVar) {
        H3.i iVar = this.f1511b;
        int i10 = X3.f.f7206a;
        SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(c(iVar.d(), 0, null, iVar.f3646b.b()));
        } catch (IOException e10) {
            Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // B3.d
    public final DataSource getDataSource() {
        return DataSource.f24512c;
    }
}
