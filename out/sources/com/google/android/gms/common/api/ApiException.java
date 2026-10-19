package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status status) {
        int i10 = status.f25308b;
        String str = status.f25309c;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + String.valueOf(str).length());
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.mStatus = status;
    }

    public final Status a() {
        return this.mStatus;
    }

    public final int b() {
        return this.mStatus.f25308b;
    }
}
