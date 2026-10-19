package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.braze.support.BrazeLogger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.l implements t.h, RecyclerView.w.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f19517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f19518B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f19519C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f19520D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f19522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F f19523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f19525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19526u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f19528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19530y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f19531z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F f19532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19536e;

        public a() {
            d();
        }

        public final void a() {
            this.f19534c = this.f19535d ? this.f19532a.g() : this.f19532a.k();
        }

        public final void b(int i10, View view) {
            if (this.f19535d) {
                this.f19534c = this.f19532a.m() + this.f19532a.b(view);
            } else {
                this.f19534c = this.f19532a.e(view);
            }
            this.f19533b = i10;
        }

        public final void c(int i10, View view) {
            int iM = this.f19532a.m();
            if (iM >= 0) {
                b(i10, view);
                return;
            }
            this.f19533b = i10;
            if (!this.f19535d) {
                int iE = this.f19532a.e(view);
                int iK = iE - this.f19532a.k();
                this.f19534c = iE;
                if (iK > 0) {
                    int iG = (this.f19532a.g() - Math.min(0, (this.f19532a.g() - iM) - this.f19532a.b(view))) - (this.f19532a.c(view) + iE);
                    if (iG < 0) {
                        this.f19534c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.f19532a.g() - iM) - this.f19532a.b(view);
            this.f19534c = this.f19532a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f19534c - this.f19532a.c(view);
                int iK2 = this.f19532a.k();
                int iMin = iC - (Math.min(this.f19532a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f19534c = Math.min(iG2, -iMin) + this.f19534c;
                }
            }
        }

        public final void d() {
            this.f19533b = -1;
            this.f19534c = Integer.MIN_VALUE;
            this.f19535d = false;
            this.f19536e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f19533b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f19534c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f19535d);
            sb2.append(", mValid=");
            return Z3.o.d(sb2, this.f19536e, '}');
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19540d;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19549i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<RecyclerView.B> f19550k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19551l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f19550k.size();
            View view2 = null;
            int i10 = BrazeLogger.SUPPRESS;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f19550k.get(i11).itemView;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.f19701a.isRemoved() && (layoutPosition = (mVar.f19701a.getLayoutPosition() - this.f19544d) * this.f19545e) >= 0 && layoutPosition < i10) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i10 = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f19544d = -1;
            } else {
                this.f19544d = ((RecyclerView.m) view2.getLayoutParams()).f19701a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.B> list = this.f19550k;
            if (list == null) {
                View view = sVar.k(this.f19544d, Long.MAX_VALUE).itemView;
                this.f19544d += this.f19545e;
                return view;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = this.f19550k.get(i10).itemView;
                RecyclerView.m mVar = (RecyclerView.m) view2.getLayoutParams();
                if (!mVar.f19701a.isRemoved() && this.f19544d == mVar.f19701a.getLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19554d;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.f19552b = parcel.readInt();
                dVar.f19553c = parcel.readInt();
                dVar.f19554d = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f19552b);
            parcel.writeInt(this.f19553c);
            parcel.writeInt(this.f19554d ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean B0() {
        if (this.f19692m == 1073741824 || this.f19691l == 1073741824) {
            return false;
        }
        int iX = x();
        for (int i10 = 0; i10 < iX; i10++) {
            ViewGroup.LayoutParams layoutParams = w(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void D0(RecyclerView recyclerView, int i10) {
        z zVar = new z(recyclerView.getContext());
        zVar.f19722a = i10;
        E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean F0() {
        return this.f19531z == null && this.f19524s == this.f19527v;
    }

    public void G0(RecyclerView.x xVar, int[] iArr) {
        int i10;
        int iL = xVar.f19736a != -1 ? this.f19523r.l() : 0;
        if (this.f19522q.f19546f == -1) {
            i10 = 0;
        } else {
            i10 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i10;
    }

    public void H0(RecyclerView.x xVar, c cVar, RunnableC1453s.b bVar) {
        int i10 = cVar.f19544d;
        if (i10 < 0 || i10 >= xVar.b()) {
            return;
        }
        bVar.a(i10, Math.max(0, cVar.f19547g));
    }

    public final int I0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        M0();
        F f10 = this.f19523r;
        boolean z10 = !this.f19528w;
        return L.a(xVar, f10, P0(z10), O0(z10), this, this.f19528w);
    }

    public final int J0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        M0();
        F f10 = this.f19523r;
        boolean z10 = !this.f19528w;
        return L.b(xVar, f10, P0(z10), O0(z10), this, this.f19528w, this.f19526u);
    }

    public final int K0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        M0();
        F f10 = this.f19523r;
        boolean z10 = !this.f19528w;
        return L.c(xVar, f10, P0(z10), O0(z10), this, this.f19528w);
    }

    public final int L0(int i10) {
        if (i10 == 1) {
            return (this.f19521p != 1 && Z0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f19521p != 1 && Z0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f19521p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f19521p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f19521p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f19521p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void M0() {
        if (this.f19522q == null) {
            c cVar = new c();
            cVar.f19541a = true;
            cVar.f19548h = 0;
            cVar.f19549i = 0;
            cVar.f19550k = null;
            this.f19522q = cVar;
        }
    }

    public final int N0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z10) {
        int i10;
        int i11 = cVar.f19543c;
        int i12 = cVar.f19547g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                cVar.f19547g = i12 + i11;
            }
            c1(sVar, cVar);
        }
        int i13 = cVar.f19543c + cVar.f19548h;
        while (true) {
            if ((!cVar.f19551l && i13 <= 0) || (i10 = cVar.f19544d) < 0 || i10 >= xVar.b()) {
                break;
            }
            b bVar = this.f19518B;
            bVar.f19537a = 0;
            bVar.f19538b = false;
            bVar.f19539c = false;
            bVar.f19540d = false;
            a1(sVar, xVar, cVar, bVar);
            if (!bVar.f19538b) {
                int i14 = cVar.f19542b;
                int i15 = bVar.f19537a;
                cVar.f19542b = (cVar.f19546f * i15) + i14;
                if (!bVar.f19539c || cVar.f19550k != null || !xVar.f19742g) {
                    cVar.f19543c -= i15;
                    i13 -= i15;
                }
                int i16 = cVar.f19547g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f19547g = i17;
                    int i18 = cVar.f19543c;
                    if (i18 < 0) {
                        cVar.f19547g = i17 + i18;
                    }
                    c1(sVar, cVar);
                }
                if (z10 && bVar.f19540d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - cVar.f19543c;
    }

    public final View O0(boolean z10) {
        return this.f19526u ? T0(0, x(), z10, true) : T0(x() - 1, -1, z10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean P() {
        return true;
    }

    public final View P0(boolean z10) {
        return this.f19526u ? T0(x() - 1, -1, z10, true) : T0(0, x(), z10, true);
    }

    public final int Q0() {
        View viewT0 = T0(0, x(), false, true);
        if (viewT0 == null) {
            return -1;
        }
        return RecyclerView.l.L(viewT0);
    }

    public final int R0() {
        View viewT0 = T0(x() - 1, -1, false, true);
        if (viewT0 == null) {
            return -1;
        }
        return RecyclerView.l.L(viewT0);
    }

    public final View S0(int i10, int i11) {
        int i12;
        int i13;
        M0();
        if (i11 <= i10 && i11 >= i10) {
            return w(i10);
        }
        if (this.f19523r.e(w(i10)) < this.f19523r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f19521p == 0 ? this.f19683c.a(i10, i11, i12, i13) : this.f19684d.a(i10, i11, i12, i13);
    }

    public final View T0(int i10, int i11, boolean z10, boolean z11) {
        M0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f19521p == 0 ? this.f19683c.a(i10, i11, i12, i13) : this.f19684d.a(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View U0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int iX;
        int i11;
        M0();
        int iX2 = x();
        if (z11) {
            iX = x() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iX2;
            iX = 0;
            i11 = 1;
        }
        int iB = xVar.b();
        int iK = this.f19523r.k();
        int iG = this.f19523r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iX != i10) {
            View viewW = w(iX);
            int iL = RecyclerView.l.L(viewW);
            int iE = this.f19523r.e(viewW);
            int iB2 = this.f19523r.b(viewW);
            if (iL >= 0 && iL < iB) {
                if (!((RecyclerView.m) viewW.getLayoutParams()).f19701a.isRemoved()) {
                    boolean z12 = iB2 <= iK && iE < iK;
                    boolean z13 = iE >= iG && iB2 > iG;
                    if (!z12 && !z13) {
                        return viewW;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewW;
                        } else if (view == null) {
                            view = viewW;
                        }
                    } else if (z12) {
                        view2 = viewW;
                    } else if (view == null) {
                        view = viewW;
                    }
                } else if (view3 == null) {
                    view3 = viewW;
                }
            }
            iX += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int V0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int iG;
        int iG2 = this.f19523r.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -f1(-iG2, sVar, xVar);
        int i12 = i10 + i11;
        if (!z10 || (iG = this.f19523r.g() - i12) <= 0) {
            return i11;
        }
        this.f19523r.p(iG);
        return iG + i11;
    }

    public final int W0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int iK;
        int iK2 = i10 - this.f19523r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -f1(iK2, sVar, xVar);
        int i12 = i10 + i11;
        if (!z10 || (iK = i12 - this.f19523r.k()) <= 0) {
            return i11;
        }
        this.f19523r.p(-iK);
        return i11 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View X(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int iL0;
        View viewS0;
        e1();
        if (x() == 0 || (iL0 = L0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        M0();
        j1(iL0, (int) (this.f19523r.l() * 0.33333334f), false, xVar);
        c cVar = this.f19522q;
        cVar.f19547g = Integer.MIN_VALUE;
        cVar.f19541a = false;
        N0(sVar, cVar, xVar, true);
        if (iL0 == -1) {
            viewS0 = this.f19526u ? S0(x() - 1, -1) : S0(0, x());
        } else {
            viewS0 = this.f19526u ? S0(0, x()) : S0(x() - 1, -1);
        }
        View viewY0 = iL0 == -1 ? Y0() : X0();
        if (!viewY0.hasFocusable()) {
            return viewS0;
        }
        if (viewS0 == null) {
            return null;
        }
        return viewY0;
    }

    public final View X0() {
        return w(this.f19526u ? 0 : x() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(Q0());
            accessibilityEvent.setToIndex(R0());
        }
    }

    public final View Y0() {
        return w(this.f19526u ? x() - 1 : 0);
    }

    public final boolean Z0() {
        return G() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        if (x() == 0) {
            return null;
        }
        int i11 = (i10 < RecyclerView.l.L(w(0))) != this.f19526u ? -1 : 1;
        return this.f19521p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public void a1(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int I10;
        int i10;
        int i11;
        int iD;
        View viewB = cVar.b(sVar);
        if (viewB == null) {
            bVar.f19538b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) viewB.getLayoutParams();
        if (cVar.f19550k == null) {
            if (this.f19526u == (cVar.f19546f == -1)) {
                c(viewB, -1, false);
            } else {
                c(viewB, 0, false);
            }
        } else {
            if (this.f19526u == (cVar.f19546f == -1)) {
                c(viewB, -1, true);
            } else {
                c(viewB, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) viewB.getLayoutParams();
        Rect rectP = this.f19682b.P(viewB);
        int i12 = rectP.left + rectP.right;
        int i13 = rectP.top + rectP.bottom;
        int iY = RecyclerView.l.y(f(), this.f19693n, this.f19691l, J() + I() + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) mVar2).width);
        int iY2 = RecyclerView.l.y(g(), this.f19694o, this.f19692m, H() + K() + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) mVar2).height);
        if (A0(viewB, iY, iY2, mVar2)) {
            viewB.measure(iY, iY2);
        }
        bVar.f19537a = this.f19523r.c(viewB);
        if (this.f19521p == 1) {
            if (Z0()) {
                iD = this.f19693n - J();
                I10 = iD - this.f19523r.d(viewB);
            } else {
                I10 = I();
                iD = this.f19523r.d(viewB) + I10;
            }
            if (cVar.f19546f == -1) {
                i10 = cVar.f19542b;
                i11 = i10 - bVar.f19537a;
            } else {
                i11 = cVar.f19542b;
                i10 = bVar.f19537a + i11;
            }
        } else {
            int iK = K();
            int iD2 = this.f19523r.d(viewB) + iK;
            if (cVar.f19546f == -1) {
                int i14 = cVar.f19542b;
                int i15 = i14 - bVar.f19537a;
                iD = i14;
                i10 = iD2;
                I10 = i15;
                i11 = iK;
            } else {
                int i16 = cVar.f19542b;
                int i17 = bVar.f19537a + i16;
                I10 = i16;
                i10 = iD2;
                i11 = iK;
                iD = i17;
            }
        }
        RecyclerView.l.R(viewB, I10, i11, iD, i10);
        if (mVar.f19701a.isRemoved() || mVar.f19701a.isUpdated()) {
            bVar.f19539c = true;
        }
        bVar.f19540d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.t.h
    public final void b(View view, View view2) {
        d("Cannot drop a view during a scroll or layout calculation");
        M0();
        e1();
        int iL = RecyclerView.l.L(view);
        int iL2 = RecyclerView.l.L(view2);
        byte b10 = iL < iL2 ? (byte) 1 : (byte) -1;
        if (this.f19526u) {
            if (b10 == 1) {
                g1(iL2, this.f19523r.g() - (this.f19523r.c(view) + this.f19523r.e(view2)));
                return;
            } else {
                g1(iL2, this.f19523r.g() - this.f19523r.b(view2));
                return;
            }
        }
        if (b10 == -1) {
            g1(iL2, this.f19523r.e(view2));
        } else {
            g1(iL2, this.f19523r.b(view2) - this.f19523r.c(view));
        }
    }

    public final void c1(RecyclerView.s sVar, c cVar) {
        if (!cVar.f19541a || cVar.f19551l) {
            return;
        }
        int i10 = cVar.f19547g;
        int i11 = cVar.f19549i;
        if (cVar.f19546f == -1) {
            int iX = x();
            if (i10 < 0) {
                return;
            }
            int iF = (this.f19523r.f() - i10) + i11;
            if (this.f19526u) {
                for (int i12 = 0; i12 < iX; i12++) {
                    View viewW = w(i12);
                    if (this.f19523r.e(viewW) < iF || this.f19523r.o(viewW) < iF) {
                        d1(sVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iX - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewW2 = w(i14);
                if (this.f19523r.e(viewW2) < iF || this.f19523r.o(viewW2) < iF) {
                    d1(sVar, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iX2 = x();
        if (!this.f19526u) {
            for (int i16 = 0; i16 < iX2; i16++) {
                View viewW3 = w(i16);
                if (this.f19523r.b(viewW3) > i15 || this.f19523r.n(viewW3) > i15) {
                    d1(sVar, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iX2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewW4 = w(i18);
            if (this.f19523r.b(viewW4) > i15 || this.f19523r.n(viewW4) > i15) {
                d1(sVar, i17, i18);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(String str) {
        if (this.f19531z == null) {
            super.d(str);
        }
    }

    public final void d1(RecyclerView.s sVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewW = w(i10);
                p0(i10);
                sVar.h(viewW);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewW2 = w(i12);
            p0(i12);
            sVar.h(viewW2);
        }
    }

    public final void e1() {
        if (this.f19521p == 1 || !Z0()) {
            this.f19526u = this.f19525t;
        } else {
            this.f19526u = !this.f19525t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f() {
        return this.f19521p == 0;
    }

    public final int f1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        M0();
        this.f19522q.f19541a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        j1(i11, iAbs, true, xVar);
        c cVar = this.f19522q;
        int iN0 = N0(sVar, cVar, xVar, false) + cVar.f19547g;
        if (iN0 < 0) {
            return 0;
        }
        if (iAbs > iN0) {
            i10 = i11 * iN0;
        }
        this.f19523r.p(-i10);
        this.f19522q.j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g() {
        return this.f19521p == 1;
    }

    public final void g1(int i10, int i11) {
        this.f19529x = i10;
        this.f19530y = i11;
        d dVar = this.f19531z;
        if (dVar != null) {
            dVar.f19552b = -1;
        }
        r0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x020c  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0213  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x022d  */
    /* JADX WARN: Code duplicated, block: B:91:0x018a  */
    /* JADX WARN: Code duplicated, block: B:93:0x018e  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView.s sVar, RecyclerView.x xVar) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z10;
        boolean z11;
        View viewU0;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z12;
        boolean z13;
        RecyclerView.m mVar;
        int i10;
        int i11;
        int i12;
        List<RecyclerView.B> list;
        int i13;
        int i14;
        int iV0;
        int i15;
        View viewS;
        int iE2;
        int iG2;
        int i16;
        int i17 = -1;
        if (!(this.f19531z == null && this.f19529x == -1) && xVar.b() == 0) {
            m0(sVar);
            return;
        }
        d dVar = this.f19531z;
        if (dVar != null && (i16 = dVar.f19552b) >= 0) {
            this.f19529x = i16;
        }
        M0();
        this.f19522q.f19541a = false;
        e1();
        RecyclerView recyclerView2 = this.f19682b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.f19681a.f19846c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.f19517A;
        if (!aVar.f19536e || this.f19529x != -1 || this.f19531z != null) {
            aVar.d();
            aVar.f19535d = this.f19526u ^ this.f19527v;
            if (xVar.f19742g || (i10 = this.f19529x) == -1) {
                if (x() != 0) {
                    recyclerView = this.f19682b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.f19681a.f19846c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        mVar = (RecyclerView.m) focusedChild2.getLayoutParams();
                        if (!mVar.f19701a.isRemoved() || mVar.f19701a.getLayoutPosition() < 0 || mVar.f19701a.getLayoutPosition() >= xVar.b()) {
                            z10 = this.f19524s;
                            z11 = this.f19527v;
                            if (z10 == z11 || (viewU0 = U0(sVar, xVar, aVar.f19535d, z11)) == null) {
                                aVar.a();
                                if (this.f19527v) {
                                    iB = xVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.f19533b = iB;
                            } else {
                                aVar.b(RecyclerView.l.L(viewU0), viewU0);
                                if (!xVar.f19742g && F0()) {
                                    iE = this.f19523r.e(viewU0);
                                    iB2 = this.f19523r.b(viewU0);
                                    iK = this.f19523r.k();
                                    iG = this.f19523r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z12 || z13) {
                                        if (aVar.f19535d) {
                                            iK = iG;
                                        }
                                        aVar.f19534c = iK;
                                    }
                                }
                            }
                        } else {
                            aVar.c(RecyclerView.l.L(focusedChild2), focusedChild2);
                        }
                    } else {
                        z10 = this.f19524s;
                        z11 = this.f19527v;
                        if (z10 == z11) {
                            aVar.a();
                            if (this.f19527v) {
                                iB = xVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.f19533b = iB;
                        } else {
                            aVar.b(RecyclerView.l.L(viewU0), viewU0);
                            if (!xVar.f19742g) {
                                iE = this.f19523r.e(viewU0);
                                iB2 = this.f19523r.b(viewU0);
                                iK = this.f19523r.k();
                                iG = this.f19523r.g();
                                if (iB2 <= iK) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iE >= iG) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (aVar.f19535d) {
                                        iK = iG;
                                    }
                                    aVar.f19534c = iK;
                                } else {
                                    if (aVar.f19535d) {
                                        iK = iG;
                                    }
                                    aVar.f19534c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.f19527v) {
                        iB = xVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.f19533b = iB;
                }
            } else if (i10 < 0 || i10 >= xVar.b()) {
                this.f19529x = -1;
                this.f19530y = Integer.MIN_VALUE;
                if (x() != 0) {
                    recyclerView = this.f19682b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        mVar = (RecyclerView.m) focusedChild2.getLayoutParams();
                        if (mVar.f19701a.isRemoved()) {
                            z10 = this.f19524s;
                            z11 = this.f19527v;
                            if (z10 == z11) {
                                aVar.a();
                                if (this.f19527v) {
                                    iB = xVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.f19533b = iB;
                            } else {
                                aVar.b(RecyclerView.l.L(viewU0), viewU0);
                                if (!xVar.f19742g) {
                                    iE = this.f19523r.e(viewU0);
                                    iB2 = this.f19523r.b(viewU0);
                                    iK = this.f19523r.k();
                                    iG = this.f19523r.g();
                                    if (iB2 <= iK) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iE >= iG) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (aVar.f19535d) {
                                            iK = iG;
                                        }
                                        aVar.f19534c = iK;
                                    } else {
                                        if (aVar.f19535d) {
                                            iK = iG;
                                        }
                                        aVar.f19534c = iK;
                                    }
                                }
                            }
                        } else {
                            z10 = this.f19524s;
                            z11 = this.f19527v;
                            if (z10 == z11) {
                                aVar.a();
                                if (this.f19527v) {
                                    iB = xVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.f19533b = iB;
                            } else {
                                aVar.b(RecyclerView.l.L(viewU0), viewU0);
                                if (!xVar.f19742g) {
                                    iE = this.f19523r.e(viewU0);
                                    iB2 = this.f19523r.b(viewU0);
                                    iK = this.f19523r.k();
                                    iG = this.f19523r.g();
                                    if (iB2 <= iK) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iE >= iG) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (aVar.f19535d) {
                                            iK = iG;
                                        }
                                        aVar.f19534c = iK;
                                    } else {
                                        if (aVar.f19535d) {
                                            iK = iG;
                                        }
                                        aVar.f19534c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z10 = this.f19524s;
                        z11 = this.f19527v;
                        if (z10 == z11) {
                            aVar.a();
                            if (this.f19527v) {
                                iB = xVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.f19533b = iB;
                        } else {
                            aVar.b(RecyclerView.l.L(viewU0), viewU0);
                            if (!xVar.f19742g) {
                                iE = this.f19523r.e(viewU0);
                                iB2 = this.f19523r.b(viewU0);
                                iK = this.f19523r.k();
                                iG = this.f19523r.g();
                                if (iB2 <= iK) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iE >= iG) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (aVar.f19535d) {
                                        iK = iG;
                                    }
                                    aVar.f19534c = iK;
                                } else {
                                    if (aVar.f19535d) {
                                        iK = iG;
                                    }
                                    aVar.f19534c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.f19527v) {
                        iB = xVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.f19533b = iB;
                }
            } else {
                int i18 = this.f19529x;
                aVar.f19533b = i18;
                d dVar2 = this.f19531z;
                if (dVar2 != null && dVar2.f19552b >= 0) {
                    boolean z14 = dVar2.f19554d;
                    aVar.f19535d = z14;
                    if (z14) {
                        aVar.f19534c = this.f19523r.g() - this.f19531z.f19553c;
                    } else {
                        aVar.f19534c = this.f19523r.k() + this.f19531z.f19553c;
                    }
                } else if (this.f19530y == Integer.MIN_VALUE) {
                    View viewS2 = s(i18);
                    if (viewS2 == null) {
                        if (x() > 0) {
                            aVar.f19535d = (this.f19529x < RecyclerView.l.L(w(0))) == this.f19526u;
                        }
                        aVar.a();
                    } else if (this.f19523r.c(viewS2) > this.f19523r.l()) {
                        aVar.a();
                    } else if (this.f19523r.e(viewS2) - this.f19523r.k() < 0) {
                        aVar.f19534c = this.f19523r.k();
                        aVar.f19535d = false;
                    } else if (this.f19523r.g() - this.f19523r.b(viewS2) < 0) {
                        aVar.f19534c = this.f19523r.g();
                        aVar.f19535d = true;
                    } else {
                        aVar.f19534c = aVar.f19535d ? this.f19523r.m() + this.f19523r.b(viewS2) : this.f19523r.e(viewS2);
                    }
                } else {
                    boolean z15 = this.f19526u;
                    aVar.f19535d = z15;
                    if (z15) {
                        aVar.f19534c = this.f19523r.g() - this.f19530y;
                    } else {
                        aVar.f19534c = this.f19523r.k() + this.f19530y;
                    }
                }
            }
            aVar.f19536e = true;
        } else if (focusedChild != null && (this.f19523r.e(focusedChild) >= this.f19523r.g() || this.f19523r.b(focusedChild) <= this.f19523r.k())) {
            aVar.c(RecyclerView.l.L(focusedChild), focusedChild);
        }
        c cVar = this.f19522q;
        cVar.f19546f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.f19520D;
        iArr[0] = 0;
        iArr[1] = 0;
        G0(xVar, iArr);
        int iK2 = this.f19523r.k() + Math.max(0, iArr[0]);
        int iH = this.f19523r.h() + Math.max(0, iArr[1]);
        if (xVar.f19742g && (i15 = this.f19529x) != -1 && this.f19530y != Integer.MIN_VALUE && (viewS = s(i15)) != null) {
            if (this.f19526u) {
                iG2 = this.f19523r.g() - this.f19523r.b(viewS);
                iE2 = this.f19530y;
            } else {
                iE2 = this.f19523r.e(viewS) - this.f19523r.k();
                iG2 = this.f19530y;
            }
            int i19 = iG2 - iE2;
            if (i19 > 0) {
                iK2 += i19;
            } else {
                iH -= i19;
            }
        }
        if (!aVar.f19535d ? !this.f19526u : this.f19526u) {
            i17 = 1;
        }
        b1(sVar, xVar, aVar, i17);
        r(sVar);
        this.f19522q.f19551l = this.f19523r.i() == 0 && this.f19523r.f() == 0;
        this.f19522q.getClass();
        this.f19522q.f19549i = 0;
        if (aVar.f19535d) {
            l1(aVar.f19533b, aVar.f19534c);
            c cVar2 = this.f19522q;
            cVar2.f19548h = iK2;
            N0(sVar, cVar2, xVar, false);
            c cVar3 = this.f19522q;
            i12 = cVar3.f19542b;
            int i20 = cVar3.f19544d;
            int i21 = cVar3.f19543c;
            if (i21 > 0) {
                iH += i21;
            }
            k1(aVar.f19533b, aVar.f19534c);
            c cVar4 = this.f19522q;
            cVar4.f19548h = iH;
            cVar4.f19544d += cVar4.f19545e;
            N0(sVar, cVar4, xVar, false);
            c cVar5 = this.f19522q;
            i11 = cVar5.f19542b;
            int i22 = cVar5.f19543c;
            if (i22 > 0) {
                l1(i20, i12);
                c cVar6 = this.f19522q;
                cVar6.f19548h = i22;
                N0(sVar, cVar6, xVar, false);
                i12 = this.f19522q.f19542b;
            }
        } else {
            k1(aVar.f19533b, aVar.f19534c);
            c cVar7 = this.f19522q;
            cVar7.f19548h = iH;
            N0(sVar, cVar7, xVar, false);
            c cVar8 = this.f19522q;
            i11 = cVar8.f19542b;
            int i23 = cVar8.f19544d;
            int i24 = cVar8.f19543c;
            if (i24 > 0) {
                iK2 += i24;
            }
            l1(aVar.f19533b, aVar.f19534c);
            c cVar9 = this.f19522q;
            cVar9.f19548h = iK2;
            cVar9.f19544d += cVar9.f19545e;
            N0(sVar, cVar9, xVar, false);
            c cVar10 = this.f19522q;
            int i25 = cVar10.f19542b;
            int i26 = cVar10.f19543c;
            if (i26 > 0) {
                k1(i23, i11);
                c cVar11 = this.f19522q;
                cVar11.f19548h = i26;
                N0(sVar, cVar11, xVar, false);
                i11 = this.f19522q.f19542b;
            }
            i12 = i25;
        }
        if (x() > 0) {
            if (this.f19526u ^ this.f19527v) {
                int iV1 = V0(i11, sVar, xVar, true);
                i13 = i12 + iV1;
                i14 = i11 + iV1;
                iV0 = W0(i13, sVar, xVar, false);
            } else {
                int iW0 = W0(i12, sVar, xVar, true);
                i13 = i12 + iW0;
                i14 = i11 + iW0;
                iV0 = V0(i14, sVar, xVar, false);
            }
            i12 = i13 + iV0;
            i11 = i14 + iV0;
        }
        if (xVar.f19745k && x() != 0 && !xVar.f19742g && F0()) {
            List<RecyclerView.B> list2 = sVar.f19715d;
            int size = list2.size();
            int iL = RecyclerView.l.L(w(0));
            int iC = 0;
            int iC2 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                RecyclerView.B b10 = list2.get(i27);
                if (!b10.isRemoved()) {
                    if ((b10.getLayoutPosition() < iL) != this.f19526u) {
                        iC += this.f19523r.c(b10.itemView);
                    } else {
                        iC2 += this.f19523r.c(b10.itemView);
                    }
                }
            }
            this.f19522q.f19550k = list2;
            if (iC > 0) {
                l1(RecyclerView.l.L(Y0()), i12);
                c cVar12 = this.f19522q;
                cVar12.f19548h = iC;
                cVar12.f19543c = 0;
                cVar12.a(null);
                N0(sVar, this.f19522q, xVar, false);
            }
            if (iC2 > 0) {
                k1(RecyclerView.l.L(X0()), i11);
                c cVar13 = this.f19522q;
                cVar13.f19548h = iC2;
                cVar13.f19543c = 0;
                list = null;
                cVar13.a(null);
                N0(sVar, this.f19522q, xVar, false);
            } else {
                list = null;
            }
            this.f19522q.f19550k = list;
        }
        if (xVar.f19742g) {
            aVar.d();
        } else {
            F f10 = this.f19523r;
            f10.f19494b = f10.l();
        }
        this.f19524s = this.f19527v;
    }

    public final void h1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(J4.i.b(i10, "invalid orientation:"));
        }
        d(null);
        if (i10 != this.f19521p || this.f19523r == null) {
            F fA = F.a(this, i10);
            this.f19523r = fA;
            this.f19517A.f19532a = fA;
            this.f19521p = i10;
            r0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i0(RecyclerView.x xVar) {
        this.f19531z = null;
        this.f19529x = -1;
        this.f19530y = Integer.MIN_VALUE;
        this.f19517A.d();
    }

    public void i1(boolean z10) {
        d(null);
        if (this.f19527v == z10) {
            return;
        }
        this.f19527v = z10;
        r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j(int i10, int i11, RecyclerView.x xVar, RunnableC1453s.b bVar) {
        if (this.f19521p != 0) {
            i10 = i11;
        }
        if (x() == 0 || i10 == 0) {
            return;
        }
        M0();
        j1(i10 > 0 ? 1 : -1, Math.abs(i10), true, xVar);
        H0(xVar, this.f19522q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f19531z = dVar;
            if (this.f19529x != -1) {
                dVar.f19552b = -1;
            }
            r0();
        }
    }

    public final void j1(int i10, int i11, boolean z10, RecyclerView.x xVar) {
        int iK;
        this.f19522q.f19551l = this.f19523r.i() == 0 && this.f19523r.f() == 0;
        this.f19522q.f19546f = i10;
        int[] iArr = this.f19520D;
        iArr[0] = 0;
        iArr[1] = 0;
        G0(xVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f19522q;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f19548h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f19549i = iMax;
        if (z11) {
            cVar.f19548h = this.f19523r.h() + i12;
            View viewX0 = X0();
            c cVar2 = this.f19522q;
            cVar2.f19545e = this.f19526u ? -1 : 1;
            int iL = RecyclerView.l.L(viewX0);
            c cVar3 = this.f19522q;
            cVar2.f19544d = iL + cVar3.f19545e;
            cVar3.f19542b = this.f19523r.b(viewX0);
            iK = this.f19523r.b(viewX0) - this.f19523r.g();
        } else {
            View viewY0 = Y0();
            c cVar4 = this.f19522q;
            cVar4.f19548h = this.f19523r.k() + cVar4.f19548h;
            c cVar5 = this.f19522q;
            cVar5.f19545e = this.f19526u ? 1 : -1;
            int iL2 = RecyclerView.l.L(viewY0);
            c cVar6 = this.f19522q;
            cVar5.f19544d = iL2 + cVar6.f19545e;
            cVar6.f19542b = this.f19523r.e(viewY0);
            iK = (-this.f19523r.e(viewY0)) + this.f19523r.k();
        }
        c cVar7 = this.f19522q;
        cVar7.f19543c = i11;
        if (z10) {
            cVar7.f19543c = i11 - iK;
        }
        cVar7.f19547g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k(int i10, RunnableC1453s.b bVar) {
        boolean z10;
        int i11;
        d dVar = this.f19531z;
        if (dVar == null || (i11 = dVar.f19552b) < 0) {
            e1();
            z10 = this.f19526u;
            i11 = this.f19529x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = dVar.f19554d;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f19519C && i11 >= 0 && i11 < i10; i13++) {
            bVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable k0() {
        d dVar = this.f19531z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.f19552b = dVar.f19552b;
            dVar2.f19553c = dVar.f19553c;
            dVar2.f19554d = dVar.f19554d;
            return dVar2;
        }
        d dVar3 = new d();
        if (x() > 0) {
            M0();
            boolean z10 = this.f19524s ^ this.f19526u;
            dVar3.f19554d = z10;
            if (z10) {
                View viewX0 = X0();
                dVar3.f19553c = this.f19523r.g() - this.f19523r.b(viewX0);
                dVar3.f19552b = RecyclerView.l.L(viewX0);
            } else {
                View viewY0 = Y0();
                dVar3.f19552b = RecyclerView.l.L(viewY0);
                dVar3.f19553c = this.f19523r.e(viewY0) - this.f19523r.k();
            }
        } else {
            dVar3.f19552b = -1;
        }
        return dVar3;
    }

    public final void k1(int i10, int i11) {
        this.f19522q.f19543c = this.f19523r.g() - i11;
        c cVar = this.f19522q;
        cVar.f19545e = this.f19526u ? -1 : 1;
        cVar.f19544d = i10;
        cVar.f19546f = 1;
        cVar.f19542b = i11;
        cVar.f19547g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final void l1(int i10, int i11) {
        this.f19522q.f19543c = i11 - this.f19523r.k();
        c cVar = this.f19522q;
        cVar.f19544d = i10;
        cVar.f19545e = this.f19526u ? 1 : -1;
        cVar.f19546f = -1;
        cVar.f19542b = i11;
        cVar.f19547g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return I0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int q(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final View s(int i10) {
        int iX = x();
        if (iX == 0) {
            return null;
        }
        int iL = i10 - RecyclerView.l.L(w(0));
        if (iL >= 0 && iL < iX) {
            View viewW = w(iL);
            if (RecyclerView.l.L(viewW) == i10) {
                return viewW;
            }
        }
        return super.s(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int s0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f19521p == 1) {
            return 0;
        }
        return f1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m t() {
        return new RecyclerView.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(int i10) {
        this.f19529x = i10;
        this.f19530y = Integer.MIN_VALUE;
        d dVar = this.f19531z;
        if (dVar != null) {
            dVar.f19552b = -1;
        }
        r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int u0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f19521p == 0) {
            return 0;
        }
        return f1(i10, sVar, xVar);
    }

    public LinearLayoutManager(int i10) {
        this.f19521p = 1;
        this.f19525t = false;
        this.f19526u = false;
        this.f19527v = false;
        this.f19528w = true;
        this.f19529x = -1;
        this.f19530y = Integer.MIN_VALUE;
        this.f19531z = null;
        this.f19517A = new a();
        this.f19518B = new b();
        this.f19519C = 2;
        this.f19520D = new int[2];
        h1(i10);
        d(null);
        if (this.f19525t) {
            this.f19525t = false;
            r0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f19521p = 1;
        this.f19525t = false;
        this.f19526u = false;
        this.f19527v = false;
        this.f19528w = true;
        this.f19529x = -1;
        this.f19530y = Integer.MIN_VALUE;
        this.f19531z = null;
        this.f19517A = new a();
        this.f19518B = new b();
        this.f19519C = 2;
        this.f19520D = new int[2];
        RecyclerView.l.c cVarM = RecyclerView.l.M(context, attributeSet, i10, i11);
        h1(cVarM.f19697a);
        boolean z10 = cVarM.f19699c;
        d(null);
        if (z10 != this.f19525t) {
            this.f19525t = z10;
            r0();
        }
        i1(cVarM.f19700d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView recyclerView) {
    }

    public void b1(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i10) {
    }
}
