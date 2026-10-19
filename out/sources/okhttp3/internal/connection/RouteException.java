package okhttp3.internal.connection;

import D2.V;
import java.io.IOException;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void a(IOException iOException) {
        V.e(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException b() {
        return this.firstConnectException;
    }

    public final IOException c() {
        return this.lastConnectException;
    }
}
