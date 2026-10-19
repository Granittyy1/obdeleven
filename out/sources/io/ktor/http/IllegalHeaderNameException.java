package io.ktor.http;

import A1.C0575j;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {
    private final String headerName;
    private final int position;

    public IllegalHeaderNameException(String headerName, int i10) {
        kotlin.jvm.internal.i.e(headerName, "headerName");
        StringBuilder sb2 = new StringBuilder("Header name '");
        sb2.append(headerName);
        sb2.append("' contains illegal character '");
        sb2.append(headerName.charAt(i10));
        sb2.append("' (code ");
        super(C0575j.b(sb2, headerName.charAt(i10) & 255, ')'));
        this.headerName = headerName;
        this.position = i10;
    }
}
