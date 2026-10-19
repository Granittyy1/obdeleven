package com.facebook;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FacebookServiceException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError requestError, String str) {
        super(str);
        i.e(requestError, "requestError");
        this.requestError = requestError;
    }

    public final FacebookRequestError a() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.requestError.f24759b + ", facebookErrorCode: " + this.requestError.f24760c + ", facebookErrorType: " + this.requestError.f24762e + ", message: " + this.requestError.a() + "}";
        i.d(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
