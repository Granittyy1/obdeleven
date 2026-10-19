package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends Handler {
    public f(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
