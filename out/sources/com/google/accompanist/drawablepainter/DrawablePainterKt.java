package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: DrawablePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DrawablePainterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25209a = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<Handler>() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        @Override // Ia.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });
}
