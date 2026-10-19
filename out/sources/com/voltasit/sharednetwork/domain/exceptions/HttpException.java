package com.voltasit.sharednetwork.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HttpException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpException extends Throwable {
    private final int code;
    private final String error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i10, String error) {
        super(error);
        i.e(error, "error");
        this.code = i10;
        this.error = error;
    }

    public final int a() {
        return this.code;
    }

    public final String b() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpException)) {
            return false;
        }
        HttpException httpException = (HttpException) obj;
        return this.code == httpException.code && i.a(this.error, httpException.error);
    }

    public final int hashCode() {
        return this.error.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HttpException(code=" + this.code + ", error=" + this.error + ")";
    }
}
