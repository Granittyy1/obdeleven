package com.braze.events;

import bo.app.j5;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeSdkAuthenticationErrorEvent {
    private final j5 sdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(j5 sdkAuthError) {
        i.e(sdkAuthError, "sdkAuthError");
        this.sdkAuthError = sdkAuthError;
    }

    private final j5 component1() {
        return this.sdkAuthError;
    }

    public static /* synthetic */ BrazeSdkAuthenticationErrorEvent copy$default(BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent, j5 j5Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j5Var = brazeSdkAuthenticationErrorEvent.sdkAuthError;
        }
        return brazeSdkAuthenticationErrorEvent.copy(j5Var);
    }

    public final BrazeSdkAuthenticationErrorEvent copy(j5 sdkAuthError) {
        i.e(sdkAuthError, "sdkAuthError");
        return new BrazeSdkAuthenticationErrorEvent(sdkAuthError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrazeSdkAuthenticationErrorEvent) && i.a(this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) obj).sdkAuthError);
    }

    public final int getErrorCode() {
        return this.sdkAuthError.d();
    }

    public final String getErrorReason() {
        return this.sdkAuthError.b();
    }

    public final Long getRequestInitiationTime() {
        return this.sdkAuthError.a().g();
    }

    public final String getSignature() {
        return this.sdkAuthError.a().h();
    }

    public final String getUserId() {
        return this.sdkAuthError.a().a();
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }
}
