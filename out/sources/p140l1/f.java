package p140l1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p114j1.A;
import p114j1.k;
import p241t7.b;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f44177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileDataSource f44178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AssetDataSource f44179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ContentDataSource f44180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f44181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UdpDataSource f44182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f44183i;
    public RawResourceDataSource j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f44184k;

    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f44185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g.a f44186b;

        public a(Context context) {
            g.a aVar = new g.a();
            this.f44185a = context.getApplicationContext();
            this.f44186b = aVar;
        }
    }

    public f(Context context, d dVar) {
        this.f44175a = context.getApplicationContext();
        dVar.getClass();
        this.f44177c = dVar;
        this.f44176b = new ArrayList();
    }

    public static void l(d dVar, l lVar) {
        if (dVar != null) {
            dVar.b(lVar);
        }
    }

    @Override // p140l1.d
    public final void b(l lVar) {
        lVar.getClass();
        this.f44177c.b(lVar);
        this.f44176b.add(lVar);
        l(this.f44178d, lVar);
        l(this.f44179e, lVar);
        l(this.f44180f, lVar);
        l(this.f44181g, lVar);
        l(this.f44182h, lVar);
        l(this.f44183i, lVar);
        l(this.j, lVar);
    }

    @Override // p140l1.d
    public final void close() throws IOException {
        d dVar = this.f44184k;
        if (dVar != null) {
            try {
                dVar.close();
            } finally {
                this.f44184k = null;
            }
        }
    }

    @Override // p140l1.d
    public final long f(e eVar) throws IOException {
        b.k(this.f44184k == null);
        String scheme = eVar.f44168a.getScheme();
        int i10 = A.f40996a;
        Uri uri = eVar.f44168a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f44175a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f44178d == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.f44178d = fileDataSource;
                    k(fileDataSource);
                }
                this.f44184k = this.f44178d;
            } else {
                if (this.f44179e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f44179e = assetDataSource;
                    k(assetDataSource);
                }
                this.f44184k = this.f44179e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f44179e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f44179e = assetDataSource2;
                k(assetDataSource2);
            }
            this.f44184k = this.f44179e;
        } else if ("content".equals(scheme)) {
            if (this.f44180f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f44180f = contentDataSource;
                k(contentDataSource);
            }
            this.f44184k = this.f44180f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            d dVar = this.f44177c;
            if (zEquals) {
                if (this.f44181g == null) {
                    try {
                        d dVar2 = (d) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f44181g = dVar2;
                        k(dVar2);
                    } catch (ClassNotFoundException unused) {
                        k.f("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f44181g == null) {
                        this.f44181g = dVar;
                    }
                }
                this.f44184k = this.f44181g;
            } else if ("udp".equals(scheme)) {
                if (this.f44182h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f44182h = udpDataSource;
                    k(udpDataSource);
                }
                this.f44184k = this.f44182h;
            } else if ("data".equals(scheme)) {
                if (this.f44183i == null) {
                    c cVar = new c(false);
                    this.f44183i = cVar;
                    k(cVar);
                }
                this.f44184k = this.f44183i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.j = rawResourceDataSource;
                    k(rawResourceDataSource);
                }
                this.f44184k = this.j;
            } else {
                this.f44184k = dVar;
            }
        }
        return this.f44184k.f(eVar);
    }

    @Override // p140l1.d
    public final Map<String, List<String>> g() {
        d dVar = this.f44184k;
        return dVar == null ? Collections.emptyMap() : dVar.g();
    }

    @Override // p140l1.d
    public final Uri getUri() {
        d dVar = this.f44184k;
        if (dVar == null) {
            return null;
        }
        return dVar.getUri();
    }

    public final void k(d dVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f44176b;
            if (i10 >= arrayList.size()) {
                return;
            }
            dVar.b((l) arrayList.get(i10));
            i10++;
        }
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        d dVar = this.f44184k;
        dVar.getClass();
        return dVar.read(bArr, i10, i11);
    }
}
