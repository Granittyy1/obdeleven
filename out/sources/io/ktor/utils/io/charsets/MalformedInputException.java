package io.ktor.utils.io.charsets;

/* JADX INFO: compiled from: CharsetJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {
    private final String _message;

    public MalformedInputException(String str) {
        super(0);
        this._message = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this._message;
    }
}
