package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class SoftException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f45744b;
    Throwable inner;

    static {
        boolean z10;
        try {
            Class.forName("java.nio.Buffer");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f45744b = z10;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.inner;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th = this.inner;
        if (f45744b || th == null) {
            return;
        }
        printStream.print("Caused by: ");
        th.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th = this.inner;
        if (f45744b || th == null) {
            return;
        }
        printWriter.print("Caused by: ");
        th.printStackTrace(printWriter);
    }
}
