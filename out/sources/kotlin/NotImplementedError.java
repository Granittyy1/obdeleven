package kotlin;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String message) {
        super(message);
        i.e(message, "message");
    }
}
