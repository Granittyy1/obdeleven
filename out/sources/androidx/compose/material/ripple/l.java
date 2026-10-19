package androidx.compose.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.graphics.H;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f12007g = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f12008h = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f12009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f12010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f12011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f12012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lambda f12013f;

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f12012e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f12011d;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f12007g : f12008h;
            p pVar = this.f12009b;
            if (pVar != null) {
                pVar.setState(iArr);
            }
        } else {
            k kVar = new k(0, this);
            this.f12012e = kVar;
            postDelayed(kVar, 50L);
        }
        this.f12011d = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(l lVar) {
        p pVar = lVar.f12009b;
        if (pVar != null) {
            pVar.setState(f12008h);
        }
        lVar.f12012e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(androidx.compose.foundation.interaction.m.b bVar, boolean z10, long j, int i10, long j10, float f10, Ia.a<r> aVar) {
        if (this.f12009b == null || !Boolean.valueOf(z10).equals(this.f12010c)) {
            p pVar = new p(z10);
            setBackground(pVar);
            this.f12009b = pVar;
            this.f12010c = Boolean.valueOf(z10);
        }
        p pVar2 = this.f12009b;
        kotlin.jvm.internal.i.b(pVar2);
        this.f12013f = (Lambda) aVar;
        e(j, i10, j10, f10);
        if (z10) {
            pVar2.setHotspot(I.d.d(bVar.f10075a), I.d.e(bVar.f10075a));
        } else {
            pVar2.setHotspot(pVar2.getBounds().centerX(), pVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f12013f = null;
        k kVar = this.f12012e;
        if (kVar != null) {
            removeCallbacks(kVar);
            k kVar2 = this.f12012e;
            kotlin.jvm.internal.i.b(kVar2);
            kVar2.run();
        } else {
            p pVar = this.f12009b;
            if (pVar != null) {
                pVar.setState(f12008h);
            }
        }
        p pVar2 = this.f12009b;
        if (pVar2 == null) {
            return;
        }
        pVar2.setVisible(false, false);
        unscheduleDrawable(pVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i10, long j10, float f10) {
        p pVar = this.f12009b;
        if (pVar == null) {
            return;
        }
        Integer num = pVar.f12019d;
        if (num == null || num.intValue() != i10) {
            pVar.f12019d = Integer.valueOf(i10);
            pVar.setRadius(i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long jB = H.b(Na.l.z(f10, 1.0f), j10);
        H h8 = pVar.f12018c;
        if (!(h8 == null ? false : H.c(h8.f13506a, jB))) {
            pVar.f12018c = new H(jB);
            pVar.setColor(ColorStateList.valueOf(Q3.d.K(jB)));
        }
        Rect rect = new Rect(0, 0, Ka.a.b(I.h.d(j)), Ka.a.b(I.h.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pVar.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r10 = this.f12013f;
        if (r10 != 0) {
            r10.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
