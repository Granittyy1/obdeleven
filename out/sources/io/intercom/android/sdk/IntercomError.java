package io.intercom.android.sdk;

/* JADX INFO: compiled from: IntercomStatusCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomError() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i10, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final IntercomError copy(int i10, String errorMessage) {
        kotlin.jvm.internal.i.e(errorMessage, "errorMessage");
        return new IntercomError(i10, errorMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) obj;
        return this.errorCode == intercomError.errorCode && kotlin.jvm.internal.i.a(this.errorMessage, intercomError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntercomError(errorCode=");
        sb2.append(this.errorCode);
        sb2.append(", errorMessage=");
        return B7.b.g(sb2, this.errorMessage, ')');
    }

    public IntercomError(int i10, String errorMessage) {
        kotlin.jvm.internal.i.e(errorMessage, "errorMessage");
        this.errorCode = i10;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ IntercomError(int i10, String str, int i11, kotlin.jvm.internal.e eVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str);
    }
}
