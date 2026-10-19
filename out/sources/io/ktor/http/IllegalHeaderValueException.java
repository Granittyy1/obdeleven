package io.ktor.http;

import A1.C0575j;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {
    private final String headerValue;
    private final int position;

    public IllegalHeaderValueException(String headerValue, int i10) {
        kotlin.jvm.internal.i.e(headerValue, "headerValue");
        StringBuilder sb2 = new StringBuilder("Header value '");
        sb2.append(headerValue);
        sb2.append("' contains illegal character '");
        sb2.append(headerValue.charAt(i10));
        sb2.append("' (code ");
        super(C0575j.b(sb2, headerValue.charAt(i10) & 255, ')'));
        this.headerValue = headerValue;
        this.position = i10;
    }
}
