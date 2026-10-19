package com.google.android.gms.common.api;

import S4.C0762d;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final C0762d zza;

    public UnsupportedApiCallException(C0762d c0762d) {
        this.zza = c0762d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
