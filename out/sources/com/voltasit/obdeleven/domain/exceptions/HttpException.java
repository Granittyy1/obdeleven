package com.voltasit.obdeleven.domain.exceptions;

import androidx.compose.foundation.gestures.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HttpException.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HttpException extends Exception {

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class BadRequest extends HttpException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BadRequest f30405b = new BadRequest();

        private BadRequest() {
            super(0);
        }
    }

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class Forbidden extends HttpException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Forbidden f30406b = new Forbidden();

        private Forbidden() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Forbidden);
        }

        public final int hashCode() {
            return -1491785741;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "Forbidden";
        }
    }

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class NotFound extends HttpException {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotFound(String message) {
            super(0);
            i.e(message, "message");
            this.message = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotFound) && i.a(this.message, ((NotFound) obj).message);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return d.b("NotFound(message=", this.message, ")");
        }
    }

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class TooManyRequests extends HttpException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TooManyRequests f30407b = new TooManyRequests();

        private TooManyRequests() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TooManyRequests);
        }

        public final int hashCode() {
            return 1288035121;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "TooManyRequests";
        }
    }

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class Unauthorized extends HttpException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Unauthorized f30408b = new Unauthorized();

        private Unauthorized() {
            super(0);
        }
    }

    /* JADX INFO: compiled from: HttpException.kt */
    public static final class Unknown extends HttpException {
        private final int code;

        public Unknown(int i10) {
            super(0);
            this.code = i10;
        }

        public final int a() {
            return this.code;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && this.code == ((Unknown) obj).code;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return J4.i.c(this.code, "Unknown(code=", ")");
        }
    }

    public /* synthetic */ HttpException(int i10) {
        this();
    }

    private HttpException() {
    }
}
