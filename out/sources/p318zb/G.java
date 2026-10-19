package p318zb;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends C2835b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f49051m;

    public G(Socket socket) {
        this.f49051m = socket;
    }

    @Override // p318zb.C2835b
    public final void k() {
        Socket socket = this.f49051m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!v.c(e10)) {
                throw e10;
            }
            w.f49117a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            w.f49117a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
