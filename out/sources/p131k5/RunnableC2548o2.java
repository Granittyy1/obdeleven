package p131k5;

import R2.m;
import U4.C0804l;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: k5.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2548o2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f42322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f42323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2540m2 f42324d;

    public RunnableC2548o2(C2540m2 c2540m2, String str, URL url, m mVar) {
        this.f42324d = c2540m2;
        C0804l.e(str);
        this.f42322b = url;
        this.f42323c = mVar;
    }

    public final void a(int i10, IOException iOException, byte[] bArr, Map map) {
        C2493c1 c2493c1I = this.f42324d.i();
        RunnableC2556q2 runnableC2556q2 = new RunnableC2556q2();
        runnableC2556q2.f42412b = this;
        runnableC2556q2.f42413c = i10;
        runnableC2556q2.f42414d = iOException;
        runnableC2556q2.f42415e = bArr;
        runnableC2556q2.f42416f = map;
        c2493c1I.z(runnableC2556q2);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        C2493c1 c2493c1 = ((C2523i1) this.f42324d.f3968a).j;
        C2523i1.g(c2493c1);
        c2493c1.C();
        int responseCode = 0;
        try {
            URL url = this.f42322b;
            try {
                synchronized (C1787c0.class) {
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    responseCode = httpURLConnection.getResponseCode();
                    headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byte[] bArrT = C2540m2.t(httpURLConnection);
                        httpURLConnection.disconnect();
                        a(responseCode, null, bArrT, headerFields);
                    } catch (IOException e10) {
                        e = e10;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(responseCode, e, null, headerFields);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(responseCode, null, null, headerFields);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    headerFields = null;
                } catch (Throwable th2) {
                    th = th2;
                    headerFields = null;
                }
            } catch (IOException e12) {
                e = e12;
                httpURLConnection = null;
                headerFields = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(responseCode, e, null, headerFields);
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                headerFields = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(responseCode, null, null, headerFields);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
