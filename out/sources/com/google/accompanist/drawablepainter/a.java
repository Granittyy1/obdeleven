package com.google.accompanist.drawablepainter;

import I.h;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DrawablePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawablePainter f25211b;

    public a(DrawablePainter drawablePainter) {
        this.f25211b = drawablePainter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d10) {
        i.e(d10, "d");
        DrawablePainter drawablePainter = this.f25211b;
        drawablePainter.f25207h.setValue(Integer.valueOf(((Number) drawablePainter.f25207h.getValue()).intValue() + 1));
        Object obj = DrawablePainterKt.f25209a;
        Drawable drawable = drawablePainter.f25206g;
        drawablePainter.f25208i.setValue(new h((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : Cb.a.b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xa.g] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d10, Runnable what, long j) {
        i.e(d10, "d");
        i.e(what, "what");
        ((Handler) DrawablePainterKt.f25209a.getValue()).postAtTime(what, j);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xa.g] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d10, Runnable what) {
        i.e(d10, "d");
        i.e(what, "what");
        ((Handler) DrawablePainterKt.f25209a.getValue()).removeCallbacks(what);
    }
}
