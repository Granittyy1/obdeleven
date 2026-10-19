package io.intercom.android.sdk.helpcenter.utils.networking;

import A1.C0575j;
import B6.c;
import java.io.IOException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NetworkResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: NetworkResponse.kt */
    public static final class ClientError extends NetworkResponse {
        public static final int $stable = 8;
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientError(Throwable error) {
            super(null);
            i.e(error, "error");
            this.error = error;
        }

        public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = clientError.error;
            }
            return clientError.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final ClientError copy(Throwable error) {
            i.e(error, "error");
            return new ClientError(error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientError) && i.a(this.error, ((ClientError) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ClientError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: NetworkResponse.kt */
    public static final class NetworkError extends NetworkResponse {
        public static final int $stable = 8;
        private final IOException error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(IOException error) {
            super(null);
            i.e(error, "error");
            this.error = error;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iOException = networkError.error;
            }
            return networkError.copy(iOException);
        }

        public final IOException component1() {
            return this.error;
        }

        public final NetworkError copy(IOException error) {
            i.e(error, "error");
            return new NetworkError(error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && i.a(this.error, ((NetworkError) obj).error);
        }

        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "NetworkError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: NetworkResponse.kt */
    public static final class ServerError extends NetworkResponse {
        public static final int $stable = 0;
        private final int code;

        public ServerError(int i10) {
            super(null);
            this.code = i10;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = serverError.code;
            }
            return serverError.copy(i10);
        }

        public final int component1() {
            return this.code;
        }

        public final ServerError copy(int i10) {
            return new ServerError(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && this.code == ((ServerError) obj).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        public String toString() {
            return C0575j.b(new StringBuilder("ServerError(code="), this.code, ')');
        }
    }

    /* JADX INFO: compiled from: NetworkResponse.kt */
    public static final class Success<T> extends NetworkResponse<T> {
        public static final int $stable = 0;
        private final T body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(T body) {
            super(null);
            i.e(body, "body");
            this.body = body;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.body;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.body;
        }

        public final Success<T> copy(T body) {
            i.e(body, "body");
            return new Success<>(body);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && i.a(this.body, ((Success) obj).body);
        }

        public final T getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        public String toString() {
            return c.e(new StringBuilder("Success(body="), this.body, ')');
        }
    }

    public /* synthetic */ NetworkResponse(e eVar) {
        this();
    }

    private NetworkResponse() {
    }
}
