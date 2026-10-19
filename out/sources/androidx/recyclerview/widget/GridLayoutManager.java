package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.Z;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f19497E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f19498F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f19499G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View[] f19500H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseIntArray f19501I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseIntArray f19502J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final a f19503K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f19504L;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19506f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f19505e = -1;
            this.f19506f = 0;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f19507a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f19508b = new SparseIntArray();

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f19507a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f19497E = false;
        this.f19498F = -1;
        this.f19501I = new SparseIntArray();
        this.f19502J = new SparseIntArray();
        this.f19503K = new a();
        this.f19504L = new Rect();
        t1(RecyclerView.l.M(context, attributeSet, i10, i11).f19698b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final boolean F0() {
        return this.f19531z == null && !this.f19497E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void H0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RunnableC1453s.b bVar) {
        int i10;
        int i11 = this.f19498F;
        for (int i12 = 0; i12 < this.f19498F && (i10 = cVar.f19544d) >= 0 && i10 < xVar.b() && i11 > 0; i12++) {
            bVar.a(cVar.f19544d, Math.max(0, cVar.f19547g));
            this.f19503K.getClass();
            i11--;
            cVar.f19544d += cVar.f19545e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int N(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f19521p == 0) {
            return this.f19498F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return p1(xVar.b() - 1, sVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View U0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int iX;
        int iX2 = x();
        int i11 = 1;
        if (z11) {
            iX = x() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iX2;
            iX = 0;
        }
        int iB = xVar.b();
        M0();
        int iK = this.f19523r.k();
        int iG = this.f19523r.g();
        View view = null;
        View view2 = null;
        while (iX != i10) {
            View viewW = w(iX);
            int iL = RecyclerView.l.L(viewW);
            if (iL >= 0 && iL < iB && q1(iL, sVar, xVar) == 0) {
                if (((RecyclerView.m) viewW.getLayoutParams()).f19701a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewW;
                    }
                } else {
                    if (this.f19523r.e(viewW) < iG && this.f19523r.b(viewW) >= iK) {
                        return viewW;
                    }
                    if (view == null) {
                        view = viewW;
                    }
                }
            }
            iX += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View X(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Z(RecyclerView.s sVar, RecyclerView.x xVar, B0.s sVar2) {
        super.Z(sVar, xVar, sVar2);
        sVar2.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int iD;
        int I10;
        int iK;
        int iD2;
        int iY;
        int iY2;
        boolean z10;
        int i13;
        View viewB;
        int iJ = this.f19523r.j();
        boolean z11 = iJ != 1073741824;
        int i14 = x() > 0 ? this.f19499G[this.f19498F] : 0;
        if (z11) {
            u1();
        }
        boolean z12 = cVar.f19545e == 1;
        int iQ1 = this.f19498F;
        if (!z12) {
            iQ1 = q1(cVar.f19544d, sVar, xVar) + r1(cVar.f19544d, sVar, xVar);
        }
        int i15 = 0;
        while (i15 < this.f19498F && (i13 = cVar.f19544d) >= 0 && i13 < xVar.b() && iQ1 > 0) {
            int i16 = cVar.f19544d;
            int iR1 = r1(i16, sVar, xVar);
            if (iR1 > this.f19498F) {
                throw new IllegalArgumentException(p005a4.q.c(B6.a.a("Item at position ", " requires ", " spans but GridLayoutManager has only ", i16, iR1), this.f19498F, " spans."));
            }
            iQ1 -= iR1;
            if (iQ1 < 0 || (viewB = cVar.b(sVar)) == null) {
                break;
            }
            this.f19500H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            bVar.f19538b = true;
            return;
        }
        if (z12) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.f19500H[i10];
            b bVar2 = (b) view.getLayoutParams();
            int iR2 = r1(RecyclerView.l.L(view), sVar, xVar);
            bVar2.f19506f = iR2;
            bVar2.f19505e = i17;
            i17 += iR2;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f19500H[i19];
            if (cVar.f19550k != null) {
                z10 = false;
                if (z12) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            } else if (z12) {
                z10 = false;
                c(view2, -1, false);
            } else {
                z10 = false;
                c(view2, 0, false);
            }
            e(this.f19504L, view2);
            s1(view2, iJ, z10);
            int iC = this.f19523r.c(view2);
            if (iC > i18) {
                i18 = iC;
            }
            float fD = (this.f19523r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f19506f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z11) {
            m1(Math.max(Math.round(f10 * this.f19498F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f19500H[i20];
                s1(view3, 1073741824, true);
                int iC2 = this.f19523r.c(view3);
                if (iC2 > i18) {
                    i18 = iC2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f19500H[i21];
            if (this.f19523r.c(view4) != i18) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f19702b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iO1 = o1(bVar3.f19505e, bVar3.f19506f);
                if (this.f19521p == 1) {
                    iY2 = RecyclerView.l.y(false, iO1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iY = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iY = RecyclerView.l.y(false, iO1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iY2 = iMakeMeasureSpec;
                }
                if (C0(view4, iY2, iY, (RecyclerView.m) view4.getLayoutParams())) {
                    view4.measure(iY2, iY);
                }
            }
        }
        bVar.f19537a = i18;
        if (this.f19521p != 1) {
            if (cVar.f19546f == -1) {
                int i24 = cVar.f19542b;
                I10 = i24 - i18;
                iD = i24;
            } else {
                int i25 = cVar.f19542b;
                iD = i25 + i18;
                I10 = i25;
            }
            iK = 0;
            iD2 = 0;
        } else if (cVar.f19546f == -1) {
            iD2 = cVar.f19542b;
            iK = iD2 - i18;
            I10 = 0;
            iD = 0;
        } else {
            int i26 = cVar.f19542b;
            iK = i26;
            iD = 0;
            iD2 = i26 + i18;
            I10 = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.f19500H[i27];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f19521p != 1) {
                iK = K() + this.f19499G[bVar4.f19505e];
                iD2 = this.f19523r.d(view5) + iK;
            } else if (Z0()) {
                int I11 = I() + this.f19499G[this.f19498F - bVar4.f19505e];
                iD = I11;
                I10 = I11 - this.f19523r.d(view5);
            } else {
                I10 = I() + this.f19499G[bVar4.f19505e];
                iD = this.f19523r.d(view5) + I10;
            }
            RecyclerView.l.R(view5, I10, iK, iD, iD2);
            if (bVar4.f19701a.isRemoved() || bVar4.f19701a.isUpdated()) {
                bVar.f19539c = true;
            }
            bVar.f19540d = view5.hasFocusable() | bVar.f19540d;
        }
        Arrays.fill(this.f19500H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(RecyclerView.s sVar, RecyclerView.x xVar, View view, B0.s sVar2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            a0(view, sVar2);
            return;
        }
        b bVar = (b) layoutParams;
        int iP1 = p1(bVar.f19701a.getLayoutPosition(), sVar, xVar);
        if (this.f19521p == 0) {
            sVar2.l(B0.s.f.a(bVar.f19505e, bVar.f19506f, iP1, 1, false, false));
        } else {
            sVar2.l(B0.s.f.a(iP1, 1, bVar.f19505e, bVar.f19506f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i10) {
        u1();
        if (xVar.b() > 0 && !xVar.f19742g) {
            boolean z10 = i10 == 1;
            int iQ1 = q1(aVar.f19533b, sVar, xVar);
            if (z10) {
                while (iQ1 > 0) {
                    int i11 = aVar.f19533b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f19533b = i12;
                    iQ1 = q1(i12, sVar, xVar);
                }
            } else {
                int iB = xVar.b() - 1;
                int i13 = aVar.f19533b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iQ2 = q1(i14, sVar, xVar);
                    if (iQ2 <= iQ1) {
                        break;
                    }
                    i13 = i14;
                    iQ1 = iQ2;
                }
                aVar.f19533b = i13;
            }
        }
        n1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(int i10, int i11) {
        a aVar = this.f19503K;
        aVar.b();
        aVar.f19508b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0() {
        a aVar = this.f19503K;
        aVar.b();
        aVar.f19508b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(int i10, int i11) {
        a aVar = this.f19503K;
        aVar.b();
        aVar.f19508b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0(int i10, int i11) {
        a aVar = this.f19503K;
        aVar.b();
        aVar.f19508b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i10, int i11) {
        a aVar = this.f19503K;
        aVar.b();
        aVar.f19508b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean h(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void h0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10 = xVar.f19742g;
        SparseIntArray sparseIntArray = this.f19502J;
        SparseIntArray sparseIntArray2 = this.f19501I;
        if (z10) {
            int iX = x();
            for (int i10 = 0; i10 < iX; i10++) {
                b bVar = (b) w(i10).getLayoutParams();
                int layoutPosition = bVar.f19701a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.f19506f);
                sparseIntArray.put(layoutPosition, bVar.f19505e);
            }
        }
        super.h0(sVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void i0(RecyclerView.x xVar) {
        super.i0(xVar);
        this.f19497E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void i1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.i1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int m(RecyclerView.x xVar) {
        return J0(xVar);
    }

    public final void m1(int i10) {
        int i11;
        int[] iArr = this.f19499G;
        int i12 = this.f19498F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f19499G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return K0(xVar);
    }

    public final void n1() {
        View[] viewArr = this.f19500H;
        if (viewArr == null || viewArr.length != this.f19498F) {
            this.f19500H = new View[this.f19498F];
        }
    }

    public final int o1(int i10, int i11) {
        if (this.f19521p != 1 || !Z0()) {
            int[] iArr = this.f19499G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f19499G;
        int i12 = this.f19498F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return J0(xVar);
    }

    public final int p1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10 = xVar.f19742g;
        a aVar = this.f19503K;
        if (!z10) {
            int i11 = this.f19498F;
            aVar.getClass();
            return c.a(i10, i11);
        }
        int iB = sVar.b(i10);
        if (iB == -1) {
            return 0;
        }
        int i12 = this.f19498F;
        aVar.getClass();
        return c.a(iB, i12);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        return K0(xVar);
    }

    public final int q1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10 = xVar.f19742g;
        a aVar = this.f19503K;
        if (!z10) {
            int i11 = this.f19498F;
            aVar.getClass();
            return i10 % i11;
        }
        int i12 = this.f19502J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = sVar.b(i10);
        if (iB == -1) {
            return 0;
        }
        int i13 = this.f19498F;
        aVar.getClass();
        return iB % i13;
    }

    public final int r1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10 = xVar.f19742g;
        a aVar = this.f19503K;
        if (!z10) {
            aVar.getClass();
            return 1;
        }
        int i11 = this.f19501I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (sVar.b(i10) == -1) {
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int s0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        u1();
        n1();
        return super.s0(i10, sVar, xVar);
    }

    public final void s1(View view, int i10, boolean z10) {
        int iY;
        int iY2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f19702b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iO1 = o1(bVar.f19505e, bVar.f19506f);
        if (this.f19521p == 1) {
            iY2 = RecyclerView.l.y(false, iO1, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width);
            iY = RecyclerView.l.y(true, this.f19523r.l(), this.f19692m, i11, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iY3 = RecyclerView.l.y(false, iO1, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iY4 = RecyclerView.l.y(true, this.f19523r.l(), this.f19691l, i12, ((ViewGroup.MarginLayoutParams) bVar).width);
            iY = iY3;
            iY2 = iY4;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z10 ? C0(view, iY2, iY, mVar) : A0(view, iY2, iY, mVar)) {
            view.measure(iY2, iY);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m t() {
        return this.f19521p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final void t1(int i10) {
        if (i10 == this.f19498F) {
            return;
        }
        this.f19497E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(J4.i.b(i10, "Span count should be at least 1. Provided "));
        }
        this.f19498F = i10;
        this.f19503K.b();
        r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m u(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f19505e = -1;
        bVar.f19506f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int u0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        u1();
        n1();
        return super.u0(i10, sVar, xVar);
    }

    public final void u1() {
        int iH;
        int iK;
        if (this.f19521p == 1) {
            iH = this.f19693n - J();
            iK = I();
        } else {
            iH = this.f19694o - H();
            iK = K();
        }
        m1(iH - iK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f19505e = -1;
            bVar.f19506f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f19505e = -1;
        bVar2.f19506f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void x0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.f19499G == null) {
            super.x0(rect, i10, i11);
        }
        int iJ = J() + I();
        int iH = H() + K();
        if (this.f19521p == 1) {
            int iHeight = rect.height() + iH;
            RecyclerView recyclerView = this.f19682b;
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            i13 = RecyclerView.l.i(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f19499G;
            i12 = RecyclerView.l.i(i10, iArr[iArr.length - 1] + iJ, this.f19682b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iJ;
            RecyclerView recyclerView2 = this.f19682b;
            WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
            i12 = RecyclerView.l.i(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f19499G;
            i13 = RecyclerView.l.i(i11, iArr2[iArr2.length - 1] + iH, this.f19682b.getMinimumHeight());
        }
        this.f19682b.setMeasuredDimension(i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int z(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f19521p == 1) {
            return this.f19498F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return p1(xVar.b() - 1, sVar, xVar) + 1;
    }

    public GridLayoutManager(int i10, int i11) {
        super(1);
        this.f19497E = false;
        this.f19498F = -1;
        this.f19501I = new SparseIntArray();
        this.f19502J = new SparseIntArray();
        this.f19503K = new a();
        this.f19504L = new Rect();
        t1(i10);
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f19497E = false;
        this.f19498F = -1;
        this.f19501I = new SparseIntArray();
        this.f19502J = new SparseIntArray();
        this.f19503K = new a();
        this.f19504L = new Rect();
        t1(i10);
    }
}
