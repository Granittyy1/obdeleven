package com.braze.support;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerUtils {
    public static final HandlerUtils INSTANCE = new HandlerUtils();

    private HandlerUtils() {
    }

    public static final Handler createHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
