package androidx.compose.foundation;

import D2.X;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC1187h implements InterfaceC1191l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidEdgeEffectOverscrollEffect f9779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f9780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RenderNode f9781t;

    public M(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, o oVar) {
        this.f9779r = androidEdgeEffectOverscrollEffect;
        this.f9780s = oVar;
        Q1(suspendingPointerInputModifierNodeImpl);
    }

    public static boolean T1(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode U1() {
        RenderNode renderNode = this.f9781t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeC = X.c();
        this.f9781t = renderNodeC;
        return renderNodeC;
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        boolean zT1;
        float f10;
        J.a aVar = c1202x.f14624b;
        long j = aVar.j();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f9779r;
        androidEdgeEffectOverscrollEffect.k(j);
        Canvas canvasA = C1139o.a(aVar.f3941c.a());
        androidEdgeEffectOverscrollEffect.f9699d.getValue();
        if (I.h.e(aVar.j())) {
            c1202x.A1();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        o oVar = this.f9780s;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = oVar.f10909d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = oVar.f10910e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = oVar.f10911f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = oVar.f10912g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = oVar.f10913h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = oVar.f10914i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = oVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = oVar.f10915k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            c1202x.A1();
            return;
        }
        float fT0 = c1202x.T0(C0940l.f10079a);
        boolean z10 = o.f(oVar.f10909d) || o.g(oVar.f10913h) || o.f(oVar.f10910e) || o.g(oVar.f10914i);
        boolean z11 = o.f(oVar.f10911f) || o.g(oVar.j) || o.f(oVar.f10912g) || o.g(oVar.f10915k);
        if (z10 && z11) {
            U1().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z10) {
            U1().setPosition(0, 0, (Ka.a.b(fT0) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z11) {
                c1202x.A1();
                return;
            }
            U1().setPosition(0, 0, canvasA.getWidth(), (Ka.a.b(fT0) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = U1().beginRecording();
        if (o.g(oVar.j)) {
            EdgeEffect edgeEffectA = oVar.j;
            if (edgeEffectA == null) {
                edgeEffectA = oVar.a(Orientation.f9958c);
                oVar.j = edgeEffectA;
            }
            T1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (o.f(oVar.f10911f)) {
            EdgeEffect edgeEffectC = oVar.c();
            zT1 = T1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (o.g(oVar.f10911f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.e() & 4294967295L));
                EdgeEffect edgeEffectA2 = oVar.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = oVar.a(Orientation.f9958c);
                    oVar.j = edgeEffectA2;
                }
                int i10 = Build.VERSION.SDK_INT;
                float fB = i10 >= 31 ? C0931c.b(edgeEffectC) : 0.0f;
                float f11 = 1 - fIntBitsToFloat;
                if (i10 >= 31) {
                    C0931c.c(edgeEffectA2, fB, f11);
                } else {
                    edgeEffectA2.onPull(fB, f11);
                }
            }
        } else {
            zT1 = false;
        }
        if (o.g(oVar.f10913h)) {
            EdgeEffect edgeEffectA3 = oVar.f10913h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = oVar.a(Orientation.f9957b);
                oVar.f10913h = edgeEffectA3;
            }
            T1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (o.f(oVar.f10909d)) {
            EdgeEffect edgeEffectE = oVar.e();
            zT1 = T1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zT1;
            if (o.g(oVar.f10909d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.e() >> 32));
                EdgeEffect edgeEffectA4 = oVar.f10913h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = oVar.a(Orientation.f9957b);
                    oVar.f10913h = edgeEffectA4;
                }
                int i11 = Build.VERSION.SDK_INT;
                float fB2 = i11 >= 31 ? C0931c.b(edgeEffectE) : 0.0f;
                if (i11 >= 31) {
                    C0931c.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            }
        }
        if (o.g(oVar.f10915k)) {
            EdgeEffect edgeEffectA5 = oVar.f10915k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = oVar.a(Orientation.f9958c);
                oVar.f10915k = edgeEffectA5;
            }
            T1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (o.f(oVar.f10912g)) {
            EdgeEffect edgeEffectD = oVar.d();
            zT1 = T1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zT1;
            if (o.g(oVar.f10912g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.e() & 4294967295L));
                EdgeEffect edgeEffectA6 = oVar.f10915k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = oVar.a(Orientation.f9958c);
                    oVar.f10915k = edgeEffectA6;
                }
                int i12 = Build.VERSION.SDK_INT;
                float fB3 = i12 >= 31 ? C0931c.b(edgeEffectD) : 0.0f;
                if (i12 >= 31) {
                    C0931c.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
        }
        if (o.g(oVar.f10914i)) {
            EdgeEffect edgeEffectA7 = oVar.f10914i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = oVar.a(Orientation.f9957b);
                oVar.f10914i = edgeEffectA7;
            }
            f10 = 0.0f;
            T1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f10 = 0.0f;
        }
        if (o.f(oVar.f10910e)) {
            EdgeEffect edgeEffectB = oVar.b();
            boolean z12 = T1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zT1;
            if (o.g(oVar.f10910e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.e() >> 32));
                EdgeEffect edgeEffectA8 = oVar.f10914i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = oVar.a(Orientation.f9957b);
                    oVar.f10914i = edgeEffectA8;
                }
                int i13 = Build.VERSION.SDK_INT;
                float fB4 = i13 >= 31 ? C0931c.b(edgeEffectB) : f10;
                float f12 = 1 - fIntBitsToFloat4;
                if (i13 >= 31) {
                    C0931c.c(edgeEffectA8, fB4, f12);
                } else {
                    edgeEffectA8.onPull(fB4, f12);
                }
            }
            zT1 = z12;
        }
        if (zT1) {
            androidEdgeEffectOverscrollEffect.f();
        }
        float f13 = z11 ? 0.0f : fT0;
        if (z10) {
            fT0 = 0.0f;
        }
        LayoutDirection layoutDirection = c1202x.getLayoutDirection();
        C1138n c1138n = new C1138n();
        c1138n.f13771a = recordingCanvasBeginRecording;
        long j10 = aVar.j();
        p013b0.c cVarB = aVar.f3941c.b();
        LayoutDirection layoutDirectionD = aVar.f3941c.d();
        androidx.compose.ui.graphics.E eA = aVar.f3941c.a();
        long jE = aVar.f3941c.e();
        J.a.b bVar = aVar.f3941c;
        androidx.compose.ui.graphics.layer.b bVar2 = bVar.f3949b;
        bVar.g(c1202x);
        bVar.i(layoutDirection);
        bVar.f(c1138n);
        bVar.j(j10);
        bVar.f3949b = null;
        c1138n.g();
        try {
            aVar.f3941c.f3948a.g(f13, fT0);
            try {
                c1202x.A1();
                float f14 = -f13;
                float f15 = -fT0;
                aVar.f3941c.f3948a.g(f14, f15);
                c1138n.o();
                J.a.b bVar3 = aVar.f3941c;
                bVar3.g(cVarB);
                bVar3.i(layoutDirectionD);
                bVar3.f(eA);
                bVar3.j(jE);
                bVar3.f3949b = bVar2;
                U1().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f14, f15);
                canvasA.drawRenderNode(U1());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th) {
                aVar.f3941c.f3948a.g(-f13, -fT0);
                throw th;
            }
        } catch (Throwable th2) {
            c1138n.o();
            J.a.b bVar4 = aVar.f3941c;
            bVar4.g(cVarB);
            bVar4.i(layoutDirectionD);
            bVar4.f(eA);
            bVar4.j(jE);
            bVar4.f3949b = bVar2;
            throw th2;
        }
    }
}
