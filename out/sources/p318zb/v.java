package p318zb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static final B a(F f10) {
        i.e(f10, "<this>");
        return new B(f10);
    }

    public static final C b(H h8) {
        i.e(h8, "<this>");
        return new C(h8);
    }

    public static final boolean c(AssertionError assertionError) {
        Logger logger = w.f49117a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? n.J(message, "getsockname failed", false) : false;
    }

    public static final C2836c d(Socket socket) throws IOException {
        Logger logger = w.f49117a;
        G g10 = new G(socket);
        OutputStream outputStream = socket.getOutputStream();
        i.d(outputStream, "getOutputStream(...)");
        return new C2836c(g10, new y(outputStream, g10));
    }

    public static final C2837d e(Socket socket) throws IOException {
        Logger logger = w.f49117a;
        G g10 = new G(socket);
        InputStream inputStream = socket.getInputStream();
        i.d(inputStream, "getInputStream(...)");
        return new C2837d(g10, new r(inputStream, g10));
    }

    public static final r f(File file) throws FileNotFoundException {
        Logger logger = w.f49117a;
        i.e(file, "<this>");
        return new r(new FileInputStream(file), I.f49052d);
    }

    public static final r g(InputStream inputStream) {
        Logger logger = w.f49117a;
        i.e(inputStream, "<this>");
        return new r(inputStream, new I());
    }
}
