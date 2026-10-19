package com.facebook;

import Z3.x;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FacebookGraphResponseException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final x graphResponse;

    public FacebookGraphResponseException(x xVar, String str) {
        super(str);
        this.graphResponse = xVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        x xVar = this.graphResponse;
        FacebookRequestError facebookRequestError = xVar == null ? null : xVar.f7905c;
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (facebookRequestError != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(facebookRequestError.f24759b);
            sb2.append(", facebookErrorCode: ");
            sb2.append(facebookRequestError.f24760c);
            sb2.append(", facebookErrorType: ");
            sb2.append(facebookRequestError.f24762e);
            sb2.append(", message: ");
            sb2.append(facebookRequestError.a());
            sb2.append("}");
        }
        String string = sb2.toString();
        i.d(string, "errorStringBuilder.toString()");
        return string;
    }
}
