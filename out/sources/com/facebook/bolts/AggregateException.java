package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AggregateException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AggregateException extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream err) {
        i.e(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter err) {
        i.e(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
