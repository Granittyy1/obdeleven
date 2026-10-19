package org.aspectj.lang;

/* JADX INFO: loaded from: classes2.dex */
public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    public NoAspectBoundException(Throwable th) {
        String str;
        if (th == null) {
            str = "org.mp4parser.support.RequiresParseDetailAspect";
        } else {
            str = "Exception while initializing org.mp4parser.support.RequiresParseDetailAspect: " + th;
        }
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public NoAspectBoundException() {
    }
}
