package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p114j1.A;
import p140l1.a;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f17922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17925h;

    public static class FileDataSourceException extends DataSourceException {
    }

    @Override // p140l1.d
    public final void close() throws FileDataSourceException {
        this.f17923f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f17922e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f17922e = null;
                if (this.f17925h) {
                    this.f17925h = false;
                    l();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(2000, e10);
            }
        } catch (Throwable th) {
            this.f17922e = null;
            if (this.f17925h) {
                this.f17925h = false;
                l();
            }
            throw th;
        }
    }

    @Override // p140l1.d
    public final long f(e eVar) throws FileDataSourceException {
        Uri uri = eVar.f44168a;
        long j = eVar.f44172e;
        this.f17923f = uri;
        m(eVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f17922e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = eVar.f44173f;
                if (length == -1) {
                    length = this.f17922e.length() - j;
                }
                this.f17924g = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.f17925h = true;
                n(eVar);
                return this.f17924g;
            } catch (IOException e10) {
                throw new FileDataSourceException(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbC = B6.a.c("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbC.append(fragment);
            throw new FileDataSourceException(sbC.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(2006, e12);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(2000, e13);
        }
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f17923f;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.f17924g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f17922e;
            int i12 = A.f40996a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j, i11));
            if (i13 > 0) {
                this.f17924g -= (long) i13;
                k(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new FileDataSourceException(2000, e10);
        }
    }
}
