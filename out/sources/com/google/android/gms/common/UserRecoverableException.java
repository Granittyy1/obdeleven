package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(Intent intent) {
        super("Google Play Services not available");
        this.zza = intent;
    }
}
