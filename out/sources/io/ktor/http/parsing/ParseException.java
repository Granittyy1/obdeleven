package io.ktor.http.parsing;

/* JADX INFO: compiled from: ParseException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ParseException extends IllegalArgumentException {
    private final Throwable cause;
    private final String message;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
