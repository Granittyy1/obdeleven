package coil.network;

import okhttp3.z;

/* JADX INFO: compiled from: HttpException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends RuntimeException {
    private final z response;

    public HttpException(z zVar) {
        super("HTTP " + zVar.f45683e + ": " + zVar.f45682d);
        this.response = zVar;
    }
}
