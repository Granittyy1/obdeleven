package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final e dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(e eVar) {
        super(2008);
        this.dataSpec = eVar;
        this.type = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, e eVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !I.e.l(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, eVar, 2007) : new HttpDataSource$HttpDataSourceException(iOException, eVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, e eVar, int i10, int i11) {
        super(a(i10, i11), iOException);
        this.dataSpec = eVar;
        this.type = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, e eVar, int i10) {
        super(str, iOException, a(i10, 1));
        this.dataSpec = eVar;
        this.type = 1;
    }
}
