package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p114j1.A;
import p140l1.a;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f17911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f17913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17915i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f17911e = context.getAssets();
    }

    @Override // p140l1.d
    public final void close() throws AssetDataSourceException {
        this.f17912f = null;
        try {
            try {
                InputStream inputStream = this.f17913g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f17913g = null;
                if (this.f17915i) {
                    this.f17915i = false;
                    l();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(2000, e10);
            }
        } catch (Throwable th) {
            this.f17913g = null;
            if (this.f17915i) {
                this.f17915i = false;
                l();
            }
            throw th;
        }
    }

    @Override // p140l1.d
    public final long f(e eVar) throws AssetDataSourceException {
        try {
            Uri uri = eVar.f44168a;
            long j = eVar.f44172e;
            this.f17912f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m(eVar);
            InputStream inputStreamOpen = this.f17911e.open(path, 1);
            this.f17913g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(2008, null);
            }
            long j10 = eVar.f44173f;
            if (j10 != -1) {
                this.f17914h = j10;
            } else {
                long jAvailable = this.f17913g.available();
                this.f17914h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f17914h = -1L;
                }
            }
            this.f17915i = true;
            n(eVar);
            return this.f17914h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f17912f;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.f17914h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i11 = (int) Math.min(j, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(2000, e10);
            }
        }
        InputStream inputStream = this.f17913g;
        int i12 = A.f40996a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j10 = this.f17914h;
        if (j10 != -1) {
            this.f17914h = j10 - ((long) i13);
        }
        k(i13);
        return i13;
    }
}
