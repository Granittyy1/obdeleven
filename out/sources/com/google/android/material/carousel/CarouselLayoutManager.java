package com.google.android.material.carousel;

import C4.v;
import J4.i;
import S4.o;
import Z3.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import p312z5.d;
import p312z5.e;
import p312z5.f;
import p312z5.g;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.l implements RecyclerView.w.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f26876A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f26877B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f26878C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f26882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f26883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.google.android.material.carousel.c f26884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.google.android.material.carousel.b f26885v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f26887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f26888y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View.OnLayoutChangeListener f26889z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f26890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f26891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f26892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f26893d;

        public a(View view, float f10, float f11, c cVar) {
            this.f26890a = view;
            this.f26891b = f10;
            this.f26892c = f11;
            this.f26893d = cVar;
        }
    }

    public static class b extends RecyclerView.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f26894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<com.google.android.material.carousel.b.C0268b> f26895b;

        public b() {
            Paint paint = new Paint();
            this.f26894a = paint;
            this.f26895b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
            super.onDrawOver(canvas, recyclerView, xVar);
            Paint paint = this.f26894a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.b.C0268b c0268b : this.f26895b) {
                float f10 = c0268b.f26913c;
                ThreadLocal<double[]> threadLocal = p222s0.a.f46849a;
                float f11 = 1.0f - f10;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f10) + (Color.alpha(-65281) * f11)), (int) ((Color.red(-16776961) * f10) + (Color.red(-65281) * f11)), (int) ((Color.green(-16776961) * f10) + (Color.green(-65281) * f11)), (int) ((Color.blue(-16776961) * f10) + (Color.blue(-65281) * f11))));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).T0()) {
                    canvas.drawLine(c0268b.f26912b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f26888y.i(), c0268b.f26912b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f26888y.d(), paint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f26888y.f(), c0268b.f26912b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f26888y.g(), c0268b.f26912b, paint);
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.material.carousel.b.C0268b f26896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.material.carousel.b.C0268b f26897b;

        public c(com.google.android.material.carousel.b.C0268b c0268b, com.google.android.material.carousel.b.C0268b c0268b2) {
            if (c0268b.f26911a > c0268b2.f26911a) {
                throw new IllegalArgumentException();
            }
            this.f26896a = c0268b;
            this.f26897b = c0268b2;
        }
    }

    public CarouselLayoutManager() {
        g gVar = new g();
        this.f26882s = new b();
        this.f26886w = 0;
        this.f26889z = new p128k2.c(1, this);
        this.f26877B = -1;
        this.f26878C = 0;
        this.f26883t = gVar;
        a1();
        c1(0);
    }

    public static c S0(List<com.google.android.material.carousel.b.C0268b> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.google.android.material.carousel.b.C0268b c0268b = list.get(i14);
            float f15 = z10 ? c0268b.f26912b : c0268b.f26911a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new c(list.get(i10), list.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void B(Rect rect, View view) {
        RecyclerView.O(rect, view);
        float fCenterY = rect.centerY();
        if (T0()) {
            fCenterY = rect.centerX();
        }
        c cVarS0 = S0(this.f26885v.f26899b, fCenterY, true);
        com.google.android.material.carousel.b.C0268b c0268b = cVarS0.f26896a;
        float f10 = c0268b.f26914d;
        com.google.android.material.carousel.b.C0268b c0268b2 = cVarS0.f26897b;
        float fB = p216r5.a.b(f10, c0268b2.f26914d, c0268b.f26912b, c0268b2.f26912b, fCenterY);
        float fWidth = T0() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = T0() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void D0(RecyclerView recyclerView, int i10) {
        p312z5.b bVar = new p312z5.b(this, recyclerView.getContext());
        bVar.f19722a = i10;
        E0(bVar);
    }

    public final void G0(View view, int i10, a aVar) {
        float f10 = this.f26885v.f26898a / 2.0f;
        c(view, i10, false);
        float f11 = aVar.f26892c;
        this.f26888y.j(view, (int) (f11 - f10), (int) (f11 + f10));
        d1(view, aVar.f26891b, aVar.f26893d);
    }

    public final float H0(float f10, float f11) {
        return U0() ? f10 - f11 : f10 + f11;
    }

    public final void I0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        float fL0 = L0(i10);
        while (i10 < xVar.b()) {
            a aVarX0 = X0(sVar, fL0, i10);
            float f10 = aVarX0.f26892c;
            c cVar = aVarX0.f26893d;
            if (V0(f10, cVar)) {
                return;
            }
            fL0 = H0(fL0, this.f26885v.f26898a);
            if (!W0(f10, cVar)) {
                G0(aVarX0.f26890a, -1, aVarX0);
            }
            i10++;
        }
    }

    public final void J0(RecyclerView.s sVar, int i10) {
        float fL0 = L0(i10);
        while (i10 >= 0) {
            a aVarX0 = X0(sVar, fL0, i10);
            c cVar = aVarX0.f26893d;
            float f10 = aVarX0.f26892c;
            if (W0(f10, cVar)) {
                return;
            }
            float f11 = this.f26885v.f26898a;
            fL0 = U0() ? fL0 + f11 : fL0 - f11;
            if (!V0(f10, cVar)) {
                G0(aVarX0.f26890a, 0, aVarX0);
            }
            i10--;
        }
    }

    public final float K0(View view, float f10, c cVar) {
        com.google.android.material.carousel.b.C0268b c0268b = cVar.f26896a;
        float f11 = c0268b.f26912b;
        com.google.android.material.carousel.b.C0268b c0268b2 = cVar.f26897b;
        float f12 = c0268b2.f26912b;
        float f13 = c0268b.f26911a;
        float f14 = c0268b2.f26911a;
        float fB = p216r5.a.b(f11, f12, f13, f14, f10);
        if (c0268b2 != this.f26885v.b() && c0268b != this.f26885v.d()) {
            return fB;
        }
        return fB + (((1.0f - c0268b2.f26913c) + (this.f26888y.b((RecyclerView.m) view.getLayoutParams()) / this.f26885v.f26898a)) * (f10 - f14));
    }

    public final float L0(int i10) {
        return H0(this.f26888y.h() - this.f26879p, this.f26885v.f26898a * i10);
    }

    public final void M0(RecyclerView.s sVar, RecyclerView.x xVar) {
        while (x() > 0) {
            View viewW = w(0);
            float fO0 = O0(viewW);
            if (!W0(fO0, S0(this.f26885v.f26899b, fO0, true))) {
                break;
            } else {
                o0(viewW, sVar);
            }
        }
        while (x() - 1 >= 0) {
            View viewW2 = w(x() - 1);
            float fO1 = O0(viewW2);
            if (!V0(fO1, S0(this.f26885v.f26899b, fO1, true))) {
                break;
            } else {
                o0(viewW2, sVar);
            }
        }
        if (x() == 0) {
            J0(sVar, this.f26886w - 1);
            I0(this.f26886w, sVar, xVar);
        } else {
            int iL = RecyclerView.l.L(w(0));
            int iL2 = RecyclerView.l.L(w(x() - 1));
            J0(sVar, iL - 1);
            I0(iL2 + 1, sVar, xVar);
        }
    }

    public final int N0() {
        return T0() ? this.f19693n : this.f19694o;
    }

    public final float O0(View view) {
        Rect rect = new Rect();
        RecyclerView.O(rect, view);
        return T0() ? rect.centerX() : rect.centerY();
    }

    public final com.google.android.material.carousel.b P0(int i10) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.f26887x;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(o.d(i10, 0, Math.max(0, F() + (-1)))))) == null) ? this.f26884u.f26917a : bVar;
    }

    public final int Q0(int i10, com.google.android.material.carousel.b bVar) {
        if (!U0()) {
            return (int) ((bVar.f26898a / 2.0f) + ((i10 * bVar.f26898a) - bVar.a().f26911a));
        }
        float fN0 = N0() - bVar.c().f26911a;
        float f10 = bVar.f26898a;
        return (int) ((fN0 - (i10 * f10)) - (f10 / 2.0f));
    }

    public final int R0(int i10, com.google.android.material.carousel.b bVar) {
        int i11 = BrazeLogger.SUPPRESS;
        for (com.google.android.material.carousel.b.C0268b c0268b : bVar.f26899b.subList(bVar.f26900c, bVar.f26901d + 1)) {
            float f10 = bVar.f26898a;
            float f11 = (f10 / 2.0f) + (i10 * f10);
            int iN0 = (U0() ? (int) ((N0() - c0268b.f26911a) - f11) : (int) (f11 - c0268b.f26911a)) - this.f26879p;
            if (Math.abs(i11) > Math.abs(iN0)) {
                i11 = iN0;
            }
        }
        return i11;
    }

    public final boolean T0() {
        return this.f26888y.f48843a == 0;
    }

    public final boolean U0() {
        return T0() && G() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void V(RecyclerView recyclerView) {
        a1();
        recyclerView.addOnLayoutChangeListener(this.f26889z);
    }

    public final boolean V0(float f10, c cVar) {
        com.google.android.material.carousel.b.C0268b c0268b = cVar.f26896a;
        float f11 = c0268b.f26914d;
        com.google.android.material.carousel.b.C0268b c0268b2 = cVar.f26897b;
        float fB = p216r5.a.b(f11, c0268b2.f26914d, c0268b.f26912b, c0268b2.f26912b, f10) / 2.0f;
        float f12 = U0() ? f10 + fB : f10 - fB;
        if (U0()) {
            if (f12 >= 0.0f) {
                return false;
            }
        } else if (f12 <= N0()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f26889z);
    }

    public final boolean W0(float f10, c cVar) {
        com.google.android.material.carousel.b.C0268b c0268b = cVar.f26896a;
        float f11 = c0268b.f26914d;
        com.google.android.material.carousel.b.C0268b c0268b2 = cVar.f26897b;
        float fH0 = H0(f10, p216r5.a.b(f11, c0268b2.f26914d, c0268b.f26912b, c0268b2.f26912b, f10) / 2.0f);
        if (U0()) {
            if (fH0 <= N0()) {
                return false;
            }
        } else if (fH0 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:29:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0040  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final View X(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        byte b10;
        if (x() == 0) {
            return null;
        }
        int i11 = this.f26888y.f48843a;
        if (i10 == 1) {
            b10 = -1;
        } else if (i10 == 2) {
            b10 = 1;
        } else if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130 && i11 == 1) {
                        b10 = 1;
                    } else {
                        b10 = -2147483648;
                    }
                } else if (i11 != 0) {
                    b10 = -2147483648;
                } else if (U0()) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
            } else if (i11 == 1) {
                b10 = -1;
            } else {
                b10 = -2147483648;
            }
        } else if (i11 != 0) {
            b10 = -2147483648;
        } else if (U0()) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == -2147483648) {
            return null;
        }
        if (b10 == -1) {
            if (RecyclerView.l.L(view) == 0) {
                return null;
            }
            int iL = RecyclerView.l.L(w(0)) - 1;
            if (iL >= 0 && iL < F()) {
                a aVarX0 = X0(sVar, L0(iL), iL);
                G0(aVarX0.f26890a, 0, aVarX0);
            }
            return w(U0() ? x() - 1 : 0);
        }
        if (RecyclerView.l.L(view) == F() - 1) {
            return null;
        }
        int iL2 = RecyclerView.l.L(w(x() - 1)) + 1;
        if (iL2 >= 0 && iL2 < F()) {
            a aVarX1 = X0(sVar, L0(iL2), iL2);
            G0(aVarX1.f26890a, -1, aVarX1);
        }
        return w(U0() ? 0 : x() - 1);
    }

    public final a X0(RecyclerView.s sVar, float f10, int i10) {
        View view = sVar.k(i10, Long.MAX_VALUE).itemView;
        Y0(view);
        float fH0 = H0(f10, this.f26885v.f26898a / 2.0f);
        c cVarS0 = S0(this.f26885v.f26899b, fH0, false);
        return new a(view, fH0, K0(view, fH0, cVarS0), cVarS0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.l.L(w(0)));
            accessibilityEvent.setToIndex(RecyclerView.l.L(w(x() - 1)));
        }
    }

    public final void Y0(View view) {
        if (!(view instanceof f)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        Rect rect = new Rect();
        e(rect, view);
        int i10 = rect.left + rect.right;
        int i11 = rect.top + rect.bottom;
        com.google.android.material.carousel.c cVar = this.f26884u;
        view.measure(RecyclerView.l.y(T0(), this.f19693n, this.f19691l, J() + I() + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin + i10, (int) ((cVar == null || this.f26888y.f48843a != 0) ? ((ViewGroup.MarginLayoutParams) mVar).width : cVar.f26917a.f26898a)), RecyclerView.l.y(g(), this.f19694o, this.f19692m, H() + K() + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin + i11, (int) ((cVar == null || this.f26888y.f48843a != 1) ? ((ViewGroup.MarginLayoutParams) mVar).height : cVar.f26917a.f26898a)));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0462 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0464  */
    /* JADX WARN: Code duplicated, block: B:116:0x046a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0472  */
    /* JADX WARN: Code duplicated, block: B:120:0x0478  */
    /* JADX WARN: Code duplicated, block: B:126:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:128:0x04be  */
    /* JADX WARN: Code duplicated, block: B:130:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x04fa A[LOOP:14: B:131:0x04e3->B:136:0x04fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x0506  */
    /* JADX WARN: Code duplicated, block: B:162:0x0583 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0587  */
    /* JADX WARN: Code duplicated, block: B:166:0x058f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0595  */
    /* JADX WARN: Code duplicated, block: B:174:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:176:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:178:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:183:0x0607 A[LOOP:12: B:179:0x05f4->B:183:0x0607, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0610  */
    /* JADX WARN: Code duplicated, block: B:218:0x060a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0604 A[EDGE_INSN: B:219:0x0604->B:182:0x0604 BREAK  A[LOOP:12: B:179:0x05f4->B:183:0x0607], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x04f7 A[SYNTHETIC] */
    public final void Z0(RecyclerView.s sVar) {
        int[] iArr;
        int[] iArr2;
        com.google.android.material.carousel.b bVarD;
        List<com.google.android.material.carousel.b.C0268b> list;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        int i14;
        com.google.android.material.carousel.b bVar;
        int size;
        int i15;
        int i16;
        float f13;
        int i17;
        List<com.google.android.material.carousel.b.C0268b> list2;
        int size2;
        int i18;
        int i19;
        float f14;
        float f15;
        int i20;
        com.google.android.material.carousel.b bVar2;
        int i21;
        int i22;
        float f16;
        int i23;
        com.google.android.material.carousel.b.C0268b c0268b;
        com.google.android.material.carousel.b.C0268b c0268b2;
        View view = sVar.k(0, Long.MAX_VALUE).itemView;
        Y0(view);
        g gVar = this.f26883t;
        gVar.getClass();
        float f17 = this.f19694o;
        if (T0()) {
            f17 = this.f19693n;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        float f18 = ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (T0()) {
            f18 = ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f19 = f18;
        float dimension = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f19;
        float dimension2 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f19;
        float fMin = Math.min(measuredHeight + f19, f17);
        float f20 = (measuredHeight / 3.0f) + f19;
        float dimension3 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f19;
        float dimension4 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f19;
        float f21 = f20 < dimension3 ? dimension3 : f20 > dimension4 ? dimension4 : f20;
        float f22 = (fMin + f21) / 2.0f;
        int[] iArr3 = g.f48844d;
        if (f17 < dimension * 2.0f) {
            iArr3 = new int[]{0};
        }
        int[] iArr4 = g.f48845e;
        if (this.f26878C == 1) {
            int length = iArr3.length;
            int[] iArr5 = new int[length];
            for (int i24 = 0; i24 < length; i24++) {
                iArr5[i24] = iArr3[i24] * 2;
            }
            int[] iArr6 = new int[2];
            for (int i25 = 0; i25 < 2; i25++) {
                iArr6[i25] = iArr4[i25] * 2;
            }
            iArr2 = iArr6;
            iArr = iArr5;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        int i26 = Integer.MIN_VALUE;
        int i27 = Integer.MIN_VALUE;
        for (int i28 : iArr2) {
            if (i28 > i27) {
                i27 = i28;
            }
        }
        float f23 = f17 - (i27 * f22);
        for (int i29 : iArr) {
            if (i29 > i26) {
                i26 = i29;
            }
        }
        int iMax = (int) Math.max(1.0d, Math.floor((f23 - (i26 * dimension2)) / fMin));
        int iCeil = (int) Math.ceil(f17 / fMin);
        int i30 = (iCeil - iMax) + 1;
        int[] iArr7 = new int[i30];
        for (int i31 = 0; i31 < i30; i31++) {
            iArr7[i31] = iCeil - i31;
        }
        p312z5.a aVarA = p312z5.a.a(f17, f21, dimension, dimension2, iArr, f22, iArr2, fMin, iArr7);
        int i32 = aVarA.f48834c + aVarA.f48835d;
        int i33 = aVarA.f48838g;
        gVar.f48846c = i32 + i33;
        int iF = F();
        int i34 = aVarA.f48834c;
        int i35 = aVarA.f48835d;
        int i36 = ((i34 + i35) + i33) - iF;
        boolean z10 = i36 > 0 && (i34 > 0 || i35 > 1);
        while (i36 > 0) {
            int i37 = aVarA.f48834c;
            if (i37 > 0) {
                aVarA.f48834c = i37 - 1;
            } else {
                int i38 = aVarA.f48835d;
                if (i38 > 1) {
                    aVarA.f48835d = i38 - 1;
                }
            }
            i36--;
        }
        if (z10) {
            aVarA = p312z5.a.a(f17, f21, dimension, dimension2, new int[]{aVarA.f48834c}, f22, new int[]{aVarA.f48835d}, fMin, new int[]{i33});
        }
        Context context = view.getContext();
        float f24 = 0.0f;
        if (this.f26878C == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f19, aVarA.f48837f);
            float f25 = fMin2 / 2.0f;
            float f26 = 0.0f - f25;
            float fB = com.google.android.material.carousel.a.b(0.0f, aVarA.f48833b, aVarA.f48834c);
            float fC = com.google.android.material.carousel.a.c(aVarA.f48834c, 0.0f, com.google.android.material.carousel.a.a(fB, aVarA.f48833b, (int) Math.floor(aVarA.f48834c / 2.0f)), aVarA.f48833b);
            float fB2 = com.google.android.material.carousel.a.b(fC, aVarA.f48836e, aVarA.f48835d);
            float fC2 = com.google.android.material.carousel.a.c(aVarA.f48835d, fC, com.google.android.material.carousel.a.a(fB2, aVarA.f48836e, (int) Math.floor(aVarA.f48835d / 2.0f)), aVarA.f48836e);
            float f27 = aVarA.f48837f;
            int i39 = aVarA.f48838g;
            float fB3 = com.google.android.material.carousel.a.b(fC2, f27, i39);
            float fC3 = com.google.android.material.carousel.a.c(i39, fC2, com.google.android.material.carousel.a.a(fB3, aVarA.f48837f, i39), aVarA.f48837f);
            float fB4 = com.google.android.material.carousel.a.b(fC3, aVarA.f48836e, aVarA.f48835d);
            float f28 = f17;
            float fB5 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(aVarA.f48835d, fC3, com.google.android.material.carousel.a.a(fB4, aVarA.f48836e, (int) Math.ceil(aVarA.f48835d / 2.0f)), aVarA.f48836e), aVarA.f48833b, aVarA.f48834c);
            float f29 = f28 + f25;
            float fN = C.g.N(fMin2, aVarA.f48837f, f19);
            float fN2 = C.g.N(aVarA.f48833b, aVarA.f48837f, f19);
            float fN3 = C.g.N(aVarA.f48836e, aVarA.f48837f, f19);
            com.google.android.material.carousel.b.a aVar = new com.google.android.material.carousel.b.a(aVarA.f48837f, f28);
            aVar.a(f26, fN, fMin2, false, true);
            int i40 = aVarA.f48834c;
            if (i40 > 0) {
                aVar.c(fB, fN2, aVarA.f48833b, (int) Math.floor(i40 / 2.0f), false);
            }
            int i41 = aVarA.f48835d;
            if (i41 > 0) {
                aVar.c(fB2, fN3, aVarA.f48836e, (int) Math.floor(i41 / 2.0f), false);
            }
            aVar.c(fB3, 0.0f, aVarA.f48837f, aVarA.f48838g, true);
            int i42 = aVarA.f48835d;
            if (i42 > 0) {
                aVar.c(fB4, fN3, aVarA.f48836e, (int) Math.ceil(i42 / 2.0f), false);
            }
            int i43 = aVarA.f48834c;
            if (i43 > 0) {
                aVar.c(fB5, fN2, aVarA.f48833b, (int) Math.ceil(i43 / 2.0f), false);
            }
            aVar.a(f29, fN, fMin2, false, true);
            bVarD = aVar.d();
        } else {
            float f30 = f17;
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f19, aVarA.f48837f);
            float f31 = fMin3 / 2.0f;
            float f32 = 0.0f - f31;
            float f33 = aVarA.f48837f;
            int i44 = aVarA.f48838g;
            float fB6 = com.google.android.material.carousel.a.b(0.0f, f33, i44);
            float fC4 = com.google.android.material.carousel.a.c(i44, 0.0f, com.google.android.material.carousel.a.a(fB6, aVarA.f48837f, i44), aVarA.f48837f);
            float fB7 = com.google.android.material.carousel.a.b(fC4, aVarA.f48836e, aVarA.f48835d);
            float fB8 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(aVarA.f48835d, fC4, fB7, aVarA.f48836e), aVarA.f48833b, aVarA.f48834c);
            float f34 = f31 + f30;
            float fN4 = C.g.N(fMin3, aVarA.f48837f, f19);
            float fN5 = C.g.N(aVarA.f48833b, aVarA.f48837f, f19);
            float fN6 = C.g.N(aVarA.f48836e, aVarA.f48837f, f19);
            com.google.android.material.carousel.b.a aVar2 = new com.google.android.material.carousel.b.a(aVarA.f48837f, f30);
            aVar2.a(f32, fN4, fMin3, false, true);
            aVar2.c(fB6, 0.0f, aVarA.f48837f, aVarA.f48838g, true);
            if (aVarA.f48835d > 0) {
                aVar2.a(fB7, fN6, aVarA.f48836e, false, false);
            }
            int i45 = aVarA.f48834c;
            if (i45 > 0) {
                aVar2.c(fB8, fN5, aVarA.f48833b, i45, false);
            }
            aVar2.a(f34, fN4, fMin3, false, true);
            bVarD = aVar2.d();
        }
        if (U0()) {
            float fN0 = N0();
            com.google.android.material.carousel.b.a aVar3 = new com.google.android.material.carousel.b.a(bVarD.f26898a, fN0);
            float f35 = (fN0 - bVarD.d().f26912b) - (bVarD.d().f26914d / 2.0f);
            List<com.google.android.material.carousel.b.C0268b> list3 = bVarD.f26899b;
            int size3 = list3.size() - 1;
            while (size3 >= 0) {
                com.google.android.material.carousel.b.C0268b c0268b3 = list3.get(size3);
                float f36 = c0268b3.f26914d;
                aVar3.a((f36 / 2.0f) + f35, c0268b3.f26913c, f36, size3 >= bVarD.f26900c && size3 <= bVarD.f26901d, c0268b3.f26915e);
                f35 += c0268b3.f26914d;
                size3--;
            }
            bVarD = aVar3.d();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVarD);
        int i46 = 0;
        while (true) {
            list = bVarD.f26899b;
            if (i46 >= list.size()) {
                i46 = -1;
                break;
            } else if (!list.get(i46).f26915e) {
                break;
            } else {
                i46++;
            }
        }
        float f37 = bVarD.a().f26912b - (bVarD.a().f26914d / 2.0f);
        int i47 = bVarD.f26901d;
        int i48 = bVarD.f26900c;
        if (f37 >= 0.0f) {
            com.google.android.material.carousel.b.C0268b c0268bA = bVarD.a();
            int i49 = 0;
            while (true) {
                if (i49 >= list.size()) {
                    c0268b2 = null;
                    break;
                }
                c0268b2 = list.get(i49);
                if (!c0268b2.f26915e) {
                    break;
                } else {
                    i49++;
                }
            }
            if (c0268bA == c0268b2) {
                i12 = i48;
                i13 = i47;
            } else if (i46 == -1) {
                i12 = i48;
                i13 = i47;
            } else {
                i10 = i48 - i46;
                if (T0()) {
                    i11 = this.f19693n;
                } else {
                    i11 = this.f19694o;
                }
                f10 = i11;
                f11 = bVarD.b().f26912b - (bVarD.b().f26914d / 2.0f);
                if (i10 <= 0 || bVarD.a().f26916f <= 0.0f) {
                    i12 = i48;
                    i13 = i47;
                    f12 = 0.0f;
                    i14 = 0;
                    while (i14 < i10) {
                        bVar = (com.google.android.material.carousel.b) n.f(1, arrayList);
                        int i50 = i46 + i14;
                        size = list.size() - 1;
                        float f38 = f12 + list.get(i50).f26916f;
                        i15 = i50 - 1;
                        if (i15 >= 0) {
                            f13 = list.get(i15).f26913c;
                            i17 = bVar.f26901d;
                            while (true) {
                                list2 = bVar.f26899b;
                                if (i17 >= list2.size()) {
                                    i16 = 1;
                                    size2 = list2.size() - 1;
                                    break;
                                } else {
                                    if (f13 == list2.get(i17).f26913c) {
                                        size2 = i17;
                                        i16 = 1;
                                        break;
                                    }
                                    i17++;
                                }
                            }
                            size = size2 - i16;
                        } else {
                            i16 = 1;
                        }
                        arrayList.add(com.google.android.material.carousel.c.c(bVar, i46, size, f11 + f38, (i12 - i14) - i16, (i13 - i14) - 1, f10));
                        i14++;
                        f12 = f38;
                    }
                } else {
                    i12 = i48;
                    i13 = i47;
                    arrayList.add(com.google.android.material.carousel.c.c(bVarD, 0, 0, f11 + bVarD.a().f26916f, bVarD.f26900c, bVarD.f26901d, f10));
                }
            }
        } else if (i46 == -1) {
            i12 = i48;
            i13 = i47;
        } else {
            i10 = i48 - i46;
            if (T0()) {
                i11 = this.f19693n;
            } else {
                i11 = this.f19694o;
            }
            f10 = i11;
            f11 = bVarD.b().f26912b - (bVarD.b().f26914d / 2.0f);
            if (i10 <= 0) {
                i12 = i48;
                i13 = i47;
                f12 = 0.0f;
                i14 = 0;
                while (i14 < i10) {
                    bVar = (com.google.android.material.carousel.b) n.f(1, arrayList);
                    int i51 = i46 + i14;
                    size = list.size() - 1;
                    float f39 = f12 + list.get(i51).f26916f;
                    i15 = i51 - 1;
                    if (i15 >= 0) {
                        f13 = list.get(i15).f26913c;
                        i17 = bVar.f26901d;
                        while (true) {
                            list2 = bVar.f26899b;
                            if (i17 >= list2.size()) {
                                i16 = 1;
                                size2 = list2.size() - 1;
                                break;
                            } else {
                                if (f13 == list2.get(i17).f26913c) {
                                    size2 = i17;
                                    i16 = 1;
                                    break;
                                }
                                i17++;
                            }
                        }
                        size = size2 - i16;
                    } else {
                        i16 = 1;
                    }
                    arrayList.add(com.google.android.material.carousel.c.c(bVar, i46, size, f11 + f39, (i12 - i14) - i16, (i13 - i14) - 1, f10));
                    i14++;
                    f12 = f39;
                }
            } else {
                i12 = i48;
                i13 = i47;
                f12 = 0.0f;
                i14 = 0;
                while (i14 < i10) {
                    bVar = (com.google.android.material.carousel.b) n.f(1, arrayList);
                    int i52 = i46 + i14;
                    size = list.size() - 1;
                    float f310 = f12 + list.get(i52).f26916f;
                    i15 = i52 - 1;
                    if (i15 >= 0) {
                        f13 = list.get(i15).f26913c;
                        i17 = bVar.f26901d;
                        while (true) {
                            list2 = bVar.f26899b;
                            if (i17 >= list2.size()) {
                                i16 = 1;
                                size2 = list2.size() - 1;
                                break;
                            } else {
                                if (f13 == list2.get(i17).f26913c) {
                                    size2 = i17;
                                    i16 = 1;
                                    break;
                                }
                                i17++;
                            }
                        }
                        size = size2 - i16;
                    } else {
                        i16 = 1;
                    }
                    arrayList.add(com.google.android.material.carousel.c.c(bVar, i46, size, f11 + f310, (i12 - i14) - i16, (i13 - i14) - 1, f10));
                    i14++;
                    f12 = f310;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVarD);
        int size4 = list.size() - 1;
        while (true) {
            if (size4 < 0) {
                size4 = -1;
                break;
            } else if (!list.get(size4).f26915e) {
                break;
            } else {
                size4--;
            }
        }
        int i53 = this.f19694o;
        if (T0()) {
            i53 = this.f19693n;
        }
        if ((bVarD.c().f26914d / 2.0f) + bVarD.c().f26912b <= i53) {
            com.google.android.material.carousel.b.C0268b c0268bC = bVarD.c();
            int size5 = list.size() - 1;
            while (true) {
                if (size5 < 0) {
                    c0268b = null;
                    break;
                }
                c0268b = list.get(size5);
                if (!c0268b.f26915e) {
                    break;
                } else {
                    size5--;
                }
            }
            if (c0268bC != c0268b) {
                if (size4 != -1) {
                    i18 = size4 - i13;
                    if (T0()) {
                        i19 = this.f19693n;
                    } else {
                        i19 = this.f19694o;
                    }
                    f14 = i19;
                    f15 = bVarD.b().f26912b - (bVarD.b().f26914d / 2.0f);
                    if (i18 <= 0 || bVarD.c().f26916f <= 0.0f) {
                        for (i20 = 0; i20 < i18; i20++) {
                            bVar2 = (com.google.android.material.carousel.b) n.f(1, arrayList2);
                            int i54 = size4 - i20;
                            f24 += list.get(i54).f26916f;
                            i21 = i54 + 1;
                            if (i21 < list.size()) {
                                f16 = list.get(i21).f26913c;
                                i23 = bVar2.f26900c - 1;
                                while (true) {
                                    if (i23 < 0) {
                                        i23 = 0;
                                        break;
                                    } else if (f16 == bVar2.f26899b.get(i23).f26913c) {
                                        break;
                                    } else {
                                        i23--;
                                    }
                                }
                                i22 = i23 + 1;
                            } else {
                                i22 = 0;
                            }
                            arrayList2.add(com.google.android.material.carousel.c.c(bVar2, size4, i22, f15 - f24, i12 + i20 + 1, i13 + i20 + 1, f14));
                        }
                    } else {
                        arrayList2.add(com.google.android.material.carousel.c.c(bVarD, 0, 0, f15 - bVarD.c().f26916f, bVarD.f26900c, bVarD.f26901d, f14));
                    }
                }
            }
        } else if (size4 != -1) {
            i18 = size4 - i13;
            if (T0()) {
                i19 = this.f19693n;
            } else {
                i19 = this.f19694o;
            }
            f14 = i19;
            f15 = bVarD.b().f26912b - (bVarD.b().f26914d / 2.0f);
            if (i18 <= 0) {
                while (i20 < i18) {
                    bVar2 = (com.google.android.material.carousel.b) n.f(1, arrayList2);
                    int i55 = size4 - i20;
                    f24 += list.get(i55).f26916f;
                    i21 = i55 + 1;
                    if (i21 < list.size()) {
                        f16 = list.get(i21).f26913c;
                        i23 = bVar2.f26900c - 1;
                        while (true) {
                            if (i23 < 0) {
                                i23 = 0;
                                break;
                            } else {
                                if (f16 == bVar2.f26899b.get(i23).f26913c) {
                                    break;
                                    break;
                                }
                                i23--;
                            }
                        }
                        i22 = i23 + 1;
                    } else {
                        i22 = 0;
                    }
                    arrayList2.add(com.google.android.material.carousel.c.c(bVar2, size4, i22, f15 - f24, i12 + i20 + 1, i13 + i20 + 1, f14));
                }
            } else {
                while (i20 < i18) {
                    bVar2 = (com.google.android.material.carousel.b) n.f(1, arrayList2);
                    int i56 = size4 - i20;
                    f24 += list.get(i56).f26916f;
                    i21 = i56 + 1;
                    if (i21 < list.size()) {
                        f16 = list.get(i21).f26913c;
                        i23 = bVar2.f26900c - 1;
                        while (true) {
                            if (i23 < 0) {
                                i23 = 0;
                                break;
                            } else {
                                if (f16 == bVar2.f26899b.get(i23).f26913c) {
                                    break;
                                    break;
                                }
                                i23--;
                            }
                        }
                        i22 = i23 + 1;
                    } else {
                        i22 = 0;
                    }
                    arrayList2.add(com.google.android.material.carousel.c.c(bVar2, size4, i22, f15 - f24, i12 + i20 + 1, i13 + i20 + 1, f14));
                }
            }
        }
        this.f26884u = new com.google.android.material.carousel.c(bVarD, arrayList, arrayList2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        if (this.f26884u == null) {
            return null;
        }
        int iQ0 = Q0(i10, P0(i10)) - this.f26879p;
        return T0() ? new PointF(iQ0, 0.0f) : new PointF(0.0f, iQ0);
    }

    public final void a1() {
        this.f26884u = null;
        r0();
    }

    public final int b1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f26884u == null) {
            Z0(sVar);
        }
        int i11 = this.f26879p;
        int i12 = this.f26880q;
        int i13 = this.f26881r;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.f26879p = i11 + i10;
        e1(this.f26884u);
        float f10 = this.f26885v.f26898a / 2.0f;
        float fL0 = L0(RecyclerView.l.L(w(0)));
        Rect rect = new Rect();
        float f11 = U0() ? this.f26885v.c().f26912b : this.f26885v.a().f26912b;
        float f12 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < x(); i15++) {
            View viewW = w(i15);
            float fH0 = H0(fL0, f10);
            c cVarS0 = S0(this.f26885v.f26899b, fH0, false);
            float fK0 = K0(viewW, fH0, cVarS0);
            RecyclerView.O(rect, viewW);
            d1(viewW, fH0, cVarS0);
            this.f26888y.l(viewW, rect, f10, fK0);
            float fAbs = Math.abs(f11 - fK0);
            if (fAbs < f12) {
                this.f26877B = RecyclerView.l.L(viewW);
                f12 = fAbs;
            }
            fL0 = H0(fL0, this.f26885v.f26898a);
        }
        M0(sVar, xVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(int i10, int i11) {
        f1();
    }

    public final void c1(int i10) {
        e dVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i.b(i10, "invalid orientation:"));
        }
        d(null);
        e eVar = this.f26888y;
        if (eVar == null || i10 != eVar.f48843a) {
            if (i10 == 0) {
                dVar = new d(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new p312z5.c(this);
            }
            this.f26888y = dVar;
            a1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(View view, float f10, c cVar) {
        if (view instanceof f) {
            com.google.android.material.carousel.b.C0268b c0268b = cVar.f26896a;
            float f11 = c0268b.f26913c;
            com.google.android.material.carousel.b.C0268b c0268b2 = cVar.f26897b;
            float fB = p216r5.a.b(f11, c0268b2.f26913c, c0268b.f26911a, c0268b2.f26911a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFC = this.f26888y.c(height, width, p216r5.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), p216r5.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fK0 = K0(view, f10, cVar);
            RectF rectF = new RectF(fK0 - (rectFC.width() / 2.0f), fK0 - (rectFC.height() / 2.0f), (rectFC.width() / 2.0f) + fK0, (rectFC.height() / 2.0f) + fK0);
            RectF rectF2 = new RectF(this.f26888y.f(), this.f26888y.i(), this.f26888y.g(), this.f26888y.d());
            this.f26883t.getClass();
            this.f26888y.a(rectFC, rectF, rectF2);
            this.f26888y.k(rectFC, rectF, rectF2);
            ((f) view).a();
        }
    }

    public final void e1(com.google.android.material.carousel.c cVar) {
        int i10 = this.f26881r;
        int i11 = this.f26880q;
        if (i10 <= i11) {
            this.f26885v = U0() ? (com.google.android.material.carousel.b) v.e(1, cVar.f26919c) : (com.google.android.material.carousel.b) v.e(1, cVar.f26918b);
        } else {
            this.f26885v = cVar.a(this.f26879p, i11, i10);
        }
        List<com.google.android.material.carousel.b.C0268b> list = this.f26885v.f26899b;
        b bVar = this.f26882s;
        bVar.getClass();
        bVar.f26895b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f() {
        return T0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0(int i10, int i11) {
        f1();
    }

    public final void f1() {
        int iF = F();
        int i10 = this.f26876A;
        if (iF == i10 || this.f26884u == null) {
            return;
        }
        g gVar = this.f26883t;
        if ((i10 < gVar.f48846c && F() >= gVar.f48846c) || (i10 >= gVar.f48846c && F() < gVar.f48846c)) {
            a1();
        }
        this.f26876A = iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g() {
        return !T0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(RecyclerView.s sVar, RecyclerView.x xVar) {
        int paddingStart;
        int paddingEnd;
        float f10;
        if (xVar.b() <= 0 || N0() <= 0.0f) {
            m0(sVar);
            this.f26886w = 0;
            return;
        }
        boolean zU0 = U0();
        boolean z10 = this.f26884u == null;
        if (z10) {
            Z0(sVar);
        }
        com.google.android.material.carousel.c cVar = this.f26884u;
        boolean zU1 = U0();
        com.google.android.material.carousel.b bVar = zU1 ? (com.google.android.material.carousel.b) v.e(1, cVar.f26919c) : (com.google.android.material.carousel.b) v.e(1, cVar.f26918b);
        com.google.android.material.carousel.b.C0268b c0268bC = zU1 ? bVar.c() : bVar.a();
        RecyclerView recyclerView = this.f19682b;
        if (recyclerView != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            paddingStart = recyclerView.getPaddingStart();
        } else {
            paddingStart = 0;
        }
        float f11 = paddingStart * (zU1 ? 1 : -1);
        float f12 = c0268bC.f26911a;
        float f13 = bVar.f26898a / 2.0f;
        int iH = (int) ((f11 + this.f26888y.h()) - (U0() ? f12 + f13 : f12 - f13));
        com.google.android.material.carousel.c cVar2 = this.f26884u;
        boolean zU2 = U0();
        com.google.android.material.carousel.b bVar2 = zU2 ? (com.google.android.material.carousel.b) v.e(1, cVar2.f26918b) : (com.google.android.material.carousel.b) v.e(1, cVar2.f26919c);
        com.google.android.material.carousel.b.C0268b c0268bA = zU2 ? bVar2.a() : bVar2.c();
        float fB = (xVar.b() - 1) * bVar2.f26898a;
        RecyclerView recyclerView2 = this.f19682b;
        if (recyclerView2 != null) {
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            paddingEnd = recyclerView2.getPaddingEnd();
        } else {
            paddingEnd = 0;
        }
        int iH2 = (int) ((((fB + paddingEnd) * (zU2 ? -1.0f : 1.0f)) - (c0268bA.f26911a - this.f26888y.h())) + (this.f26888y.e() - c0268bA.f26911a));
        int iMin = zU2 ? Math.min(0, iH2) : Math.max(0, iH2);
        this.f26880q = zU0 ? iMin : iH;
        if (zU0) {
            iMin = iH;
        }
        this.f26881r = iMin;
        if (z10) {
            this.f26879p = iH;
            com.google.android.material.carousel.c cVar3 = this.f26884u;
            int iF = F();
            int i10 = this.f26880q;
            int i11 = this.f26881r;
            boolean zU3 = U0();
            com.google.android.material.carousel.b bVar3 = cVar3.f26917a;
            HashMap map = new HashMap();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                f10 = bVar3.f26898a;
                if (i12 >= iF) {
                    break;
                }
                int i14 = zU3 ? (iF - i12) - 1 : i12;
                float f14 = i14 * f10 * (zU3 ? -1 : 1);
                float f15 = i11 - cVar3.f26923g;
                List<com.google.android.material.carousel.b> list = cVar3.f26919c;
                if (f14 > f15 || i12 >= iF - list.size()) {
                    map.put(Integer.valueOf(i14), list.get(o.d(i13, 0, list.size() - 1)));
                    i13++;
                }
                i12++;
            }
            int i15 = 0;
            for (int i16 = iF - 1; i16 >= 0; i16--) {
                int i17 = zU3 ? (iF - i16) - 1 : i16;
                float f16 = i17 * f10 * (zU3 ? -1 : 1);
                float f17 = i10 + cVar3.f26922f;
                List<com.google.android.material.carousel.b> list2 = cVar3.f26918b;
                if (f16 < f17 || i16 < list2.size()) {
                    map.put(Integer.valueOf(i17), list2.get(o.d(i15, 0, list2.size() - 1)));
                    i15++;
                }
            }
            this.f26887x = map;
            int i18 = this.f26877B;
            if (i18 != -1) {
                this.f26879p = Q0(i18, P0(i18));
            }
        }
        int i19 = this.f26879p;
        int i20 = this.f26880q;
        int i21 = this.f26881r;
        this.f26879p = (i19 < i20 ? i20 - i19 : i19 > i21 ? i21 - i19 : 0) + i19;
        this.f26886w = o.d(this.f26886w, 0, xVar.b());
        e1(this.f26884u);
        r(sVar);
        M0(sVar, xVar);
        this.f26876A = F();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i0(RecyclerView.x xVar) {
        if (x() == 0) {
            this.f26886w = 0;
        } else {
            this.f26886w = RecyclerView.l.L(w(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(RecyclerView.x xVar) {
        if (x() == 0 || this.f26884u == null || F() <= 1) {
            return 0;
        }
        return (int) (this.f19693n * (this.f26884u.f26917a.f26898a / n(xVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(RecyclerView.x xVar) {
        return this.f26879p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return this.f26881r - this.f26880q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        if (x() == 0 || this.f26884u == null || F() <= 1) {
            return 0;
        }
        return (int) (this.f19694o * (this.f26884u.f26917a.f26898a / q(xVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return this.f26879p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        return this.f26881r - this.f26880q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iR0;
        if (this.f26884u == null || (iR0 = R0(RecyclerView.l.L(view), P0(RecyclerView.l.L(view)))) == 0) {
            return false;
        }
        int i10 = this.f26879p;
        int i11 = this.f26880q;
        int i12 = this.f26881r;
        int i13 = i10 + iR0;
        if (i13 < i11) {
            iR0 = i11 - i10;
        } else if (i13 > i12) {
            iR0 = i12 - i10;
        }
        int iR1 = R0(RecyclerView.l.L(view), this.f26884u.a(i10 + iR0, i11, i12));
        if (T0()) {
            recyclerView.scrollBy(iR1, 0);
            return true;
        }
        recyclerView.scrollBy(0, iR1);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int s0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (T0()) {
            return b1(i10, sVar, xVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m t() {
        return new RecyclerView.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(int i10) {
        this.f26877B = i10;
        if (this.f26884u == null) {
            return;
        }
        this.f26879p = Q0(i10, P0(i10));
        this.f26886w = o.d(i10, 0, Math.max(0, F() - 1));
        e1(this.f26884u);
        r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int u0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (g()) {
            return b1(i10, sVar, xVar);
        }
        return 0;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f26882s = new b();
        this.f26886w = 0;
        this.f26889z = new p128k2.c(1, this);
        this.f26877B = -1;
        this.f26878C = 0;
        this.f26883t = new g();
        a1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46112e);
            this.f26878C = typedArrayObtainStyledAttributes.getInt(0, 0);
            a1();
            c1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
