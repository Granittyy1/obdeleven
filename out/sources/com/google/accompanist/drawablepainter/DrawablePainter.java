package com.google.accompanist.drawablepainter;

import I.h;
import J.e;
import Na.l;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.t0;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import p293xa.g;

/* JADX INFO: compiled from: DrawablePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DrawablePainter extends Painter implements t0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f25206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1085f0 f25207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f25208i;
    public final g j;

    public DrawablePainter(Drawable drawable) {
        i.e(drawable, "drawable");
        this.f25206g = drawable;
        this.f25207h = J0.f(0);
        Object obj = DrawablePainterKt.f25209a;
        this.f25208i = J0.f(new h((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : Cb.a.b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.j = kotlin.a.a(new Ia.a<a>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            {
                super(0);
            }

            @Override // Ia.a
            public final a invoke() {
                return new a(this.this$0);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f10) {
        this.f25206g.setAlpha(l.D(Ka.a.b(f10 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.t0
    public final void c() {
        Drawable drawable = this.f25206g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.t0
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.j.getValue();
        Drawable drawable = this.f25206g;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean e(I i10) {
        this.f25206g.setColorFilter(i10 != null ? i10.f13507a : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void f(LayoutDirection layoutDirection) {
        int i10;
        i.e(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        this.f25206g.setLayoutDirection(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        return ((h) this.f25208i.getValue()).f3769a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(e eVar) {
        i.e(eVar, "<this>");
        E eA = eVar.W0().a();
        ((Number) this.f25207h.getValue()).intValue();
        int iB = Ka.a.b(h.d(eVar.j()));
        int iB2 = Ka.a.b(h.b(eVar.j()));
        Drawable drawable = this.f25206g;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            eA.g();
            drawable.draw(C1139o.a(eA));
        } finally {
            eA.o();
        }
    }
}
