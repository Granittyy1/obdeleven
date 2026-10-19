package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC1187h implements InterfaceC1191l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidEdgeEffectOverscrollEffect f11028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f11029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f11030t;

    public s(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, o oVar, androidx.compose.foundation.layout.L l10) {
        this.f11028r = androidEdgeEffectOverscrollEffect;
        this.f11029s = oVar;
        this.f11030t = l10;
        Q1(suspendingPointerInputModifierNodeImpl);
    }

    public static boolean T1(float f10, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        boolean zT1;
        C1202x c1202x2;
        J.a aVar;
        J.a aVar2 = c1202x.f14624b;
        long j = aVar2.j();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f11028r;
        androidEdgeEffectOverscrollEffect.k(j);
        if (I.h.e(aVar2.j())) {
            c1202x.A1();
            return;
        }
        c1202x.A1();
        androidEdgeEffectOverscrollEffect.f9699d.getValue();
        Canvas canvasA = C1139o.a(aVar2.f3941c.a());
        o oVar = this.f11029s;
        boolean zF = o.f(oVar.f10911f);
        androidx.compose.foundation.layout.L l10 = this.f11030t;
        if (zF) {
            zT1 = T1(270.0f, (((long) Float.floatToRawIntBits(c1202x.T0(l10.b(c1202x.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar2.j() & 4294967295L)))) << 32), oVar.c(), canvasA);
        } else {
            zT1 = false;
        }
        if (o.f(oVar.f10909d)) {
            zT1 = T1(0.0f, (((long) Float.floatToRawIntBits(c1202x.T0(l10.d()))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), oVar.e(), canvasA) || zT1;
        }
        if (o.f(oVar.f10912g)) {
            EdgeEffect edgeEffectD = oVar.d();
            c1202x2 = c1202x;
            float fT0 = c1202x2.T0(l10.c(c1202x.getLayoutDirection())) + (-Ka.a.b(Float.intBitsToFloat((int) (aVar2.j() >> 32))));
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            int iFloatToRawIntBits = Float.floatToRawIntBits(fT0);
            aVar = aVar2;
            zT1 = T1(90.0f, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32), edgeEffectD, canvasA) || zT1;
        } else {
            c1202x2 = c1202x;
            aVar = aVar2;
        }
        if (o.f(oVar.f10910e)) {
            EdgeEffect edgeEffectB = oVar.b();
            zT1 = T1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (aVar.j() & 4294967295L))) + c1202x2.T0(l10.a()))) & 4294967295L), edgeEffectB, canvasA) || zT1;
        }
        if (zT1) {
            androidEdgeEffectOverscrollEffect.f();
        }
    }
}
