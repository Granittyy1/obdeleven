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
import androidx.core.view.Z;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.w.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final d f19756B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f19757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f19758D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f19759E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public e f19760F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f19761G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final b f19762H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f19763I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f19764J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final a f19765K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f19766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f[] f19767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f19768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F f19769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19771u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f19772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19773w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f19775y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19774x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19776z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f19755A = Integer.MIN_VALUE;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.H0();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f19783f;

        public b() {
            a();
        }

        public final void a() {
            this.f19778a = -1;
            this.f19779b = Integer.MIN_VALUE;
            this.f19780c = false;
            this.f19781d = false;
            this.f19782e = false;
            int[] iArr = this.f19783f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f19785e;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f19786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f19787b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0199a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f19788b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f19789c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f19790d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f19791e;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0199a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.f19788b = parcel.readInt();
                    aVar.f19789c = parcel.readInt();
                    aVar.f19791e = parcel.readInt() == 1;
                    int i10 = parcel.readInt();
                    if (i10 > 0) {
                        int[] iArr = new int[i10];
                        aVar.f19790d = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f19788b + ", mGapDir=" + this.f19789c + ", mHasUnwantedGapAfter=" + this.f19791e + ", mGapPerSpan=" + Arrays.toString(this.f19790d) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f19788b);
                parcel.writeInt(this.f19789c);
                parcel.writeInt(this.f19791e ? 1 : 0);
                int[] iArr = this.f19790d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f19790d);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f19786a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f19787b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f19786a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f19786a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f19786a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f19786a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i10, int i11) {
            int[] iArr = this.f19786a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f19786a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f19786a, i10, i12, -1);
            ArrayList arrayList = this.f19787b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f19787b.get(size);
                int i13 = aVar.f19788b;
                if (i13 >= i10) {
                    aVar.f19788b = i13 + i11;
                }
            }
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f19786a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f19786a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f19786a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            ArrayList arrayList = this.f19787b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f19787b.get(size);
                int i13 = aVar.f19788b;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f19787b.remove(size);
                    } else {
                        aVar.f19788b = i13 - i11;
                    }
                }
            }
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f19795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f19797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f19798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19799i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19800k;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.f19792b = parcel.readInt();
                eVar.f19793c = parcel.readInt();
                int i10 = parcel.readInt();
                eVar.f19794d = i10;
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    eVar.f19795e = iArr;
                    parcel.readIntArray(iArr);
                }
                int i11 = parcel.readInt();
                eVar.f19796f = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    eVar.f19797g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.f19799i = parcel.readInt() == 1;
                eVar.j = parcel.readInt() == 1;
                eVar.f19800k = parcel.readInt() == 1;
                eVar.f19798h = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f19792b);
            parcel.writeInt(this.f19793c);
            parcel.writeInt(this.f19794d);
            if (this.f19794d > 0) {
                parcel.writeIntArray(this.f19795e);
            }
            parcel.writeInt(this.f19796f);
            if (this.f19796f > 0) {
                parcel.writeIntArray(this.f19797g);
            }
            parcel.writeInt(this.f19799i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.f19800k ? 1 : 0);
            parcel.writeList(this.f19798h);
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f19801a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19802b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19803c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19804d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19805e;

        public f(int i10) {
            this.f19805e = i10;
        }

        public final void a() {
            View view = (View) Z3.n.f(1, this.f19801a);
            c cVar = (c) view.getLayoutParams();
            this.f19803c = StaggeredGridLayoutManager.this.f19768r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.f19801a.clear();
            this.f19802b = Integer.MIN_VALUE;
            this.f19803c = Integer.MIN_VALUE;
            this.f19804d = 0;
        }

        public final int c() {
            boolean z10 = StaggeredGridLayoutManager.this.f19773w;
            ArrayList<View> arrayList = this.f19801a;
            return z10 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z10 = StaggeredGridLayoutManager.this.f19773w;
            ArrayList<View> arrayList = this.f19801a;
            return z10 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.f19768r.k();
            int iG = staggeredGridLayoutManager.f19768r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f19801a.get(i10);
                int iE = staggeredGridLayoutManager.f19768r.e(view);
                int iB = staggeredGridLayoutManager.f19768r.b(view);
                boolean z10 = iE <= iG;
                boolean z11 = iB >= iK;
                if (z10 && z11 && (iE < iK || iB > iG)) {
                    return RecyclerView.l.L(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f19803c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f19801a.size() == 0) {
                return i10;
            }
            a();
            return this.f19803c;
        }

        public final View g(int i10, int i11) {
            ArrayList<View> arrayList = this.f19801a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f19773w && RecyclerView.l.L(view2) >= i10) || ((!staggeredGridLayoutManager.f19773w && RecyclerView.l.L(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.f19773w && RecyclerView.l.L(view3) <= i10) || ((!staggeredGridLayoutManager.f19773w && RecyclerView.l.L(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int h(int i10) {
            int i11 = this.f19802b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f19801a.size() == 0) {
                return i10;
            }
            View view = this.f19801a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f19802b = StaggeredGridLayoutManager.this.f19768r.e(view);
            cVar.getClass();
            return this.f19802b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f19766p = -1;
        this.f19773w = false;
        d dVar = new d();
        this.f19756B = dVar;
        this.f19757C = 2;
        this.f19761G = new Rect();
        this.f19762H = new b();
        this.f19763I = true;
        this.f19765K = new a();
        RecyclerView.l.c cVarM = RecyclerView.l.M(context, attributeSet, i10, i11);
        int i12 = cVarM.f19697a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i12 != this.f19770t) {
            this.f19770t = i12;
            F f10 = this.f19768r;
            this.f19768r = this.f19769s;
            this.f19769s = f10;
            r0();
        }
        int i13 = cVarM.f19698b;
        d(null);
        if (i13 != this.f19766p) {
            dVar.a();
            r0();
            this.f19766p = i13;
            this.f19775y = new BitSet(this.f19766p);
            this.f19767q = new f[this.f19766p];
            for (int i14 = 0; i14 < this.f19766p; i14++) {
                this.f19767q[i14] = new f(i14);
            }
            r0();
        }
        boolean z10 = cVarM.f19699c;
        d(null);
        e eVar = this.f19760F;
        if (eVar != null && eVar.f19799i != z10) {
            eVar.f19799i = z10;
        }
        this.f19773w = z10;
        r0();
        y yVar = new y();
        yVar.f20040a = true;
        yVar.f20045f = 0;
        yVar.f20046g = 0;
        this.f19772v = yVar;
        this.f19768r = F.a(this, this.f19770t);
        this.f19769s = F.a(this, 1 - this.f19770t);
    }

    public static int j1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void D0(RecyclerView recyclerView, int i10) {
        z zVar = new z(recyclerView.getContext());
        zVar.f19722a = i10;
        E0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean F0() {
        return this.f19760F == null;
    }

    public final int G0(int i10) {
        if (x() == 0) {
            return this.f19774x ? 1 : -1;
        }
        return (i10 < Q0()) != this.f19774x ? -1 : 1;
    }

    public final boolean H0() {
        int iQ0;
        if (x() != 0 && this.f19757C != 0 && this.f19687g) {
            if (this.f19774x) {
                iQ0 = R0();
                Q0();
            } else {
                iQ0 = Q0();
                R0();
            }
            d dVar = this.f19756B;
            if (iQ0 == 0 && V0() != null) {
                dVar.a();
                this.f19686f = true;
                r0();
                return true;
            }
        }
        return false;
    }

    public final int I0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        F f10 = this.f19768r;
        boolean z10 = !this.f19763I;
        return L.a(xVar, f10, N0(z10), M0(z10), this, this.f19763I);
    }

    public final int J0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        F f10 = this.f19768r;
        boolean z10 = !this.f19763I;
        return L.b(xVar, f10, N0(z10), M0(z10), this, this.f19763I, this.f19774x);
    }

    public final int K0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        F f10 = this.f19768r;
        boolean z10 = !this.f19763I;
        return L.c(xVar, f10, N0(z10), M0(z10), this, this.f19763I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int L0(RecyclerView.s sVar, y yVar, RecyclerView.x xVar) {
        f fVar;
        ?? r10;
        int i10;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 1;
        this.f19775y.set(0, this.f19766p, true);
        y yVar2 = this.f19772v;
        int i17 = yVar2.f20048i ? yVar.f20044e == 1 ? BrazeLogger.SUPPRESS : Integer.MIN_VALUE : yVar.f20044e == 1 ? yVar.f20046g + yVar.f20041b : yVar.f20045f - yVar.f20041b;
        int i18 = yVar.f20044e;
        for (int i19 = 0; i19 < this.f19766p; i19++) {
            if (!this.f19767q[i19].f19801a.isEmpty()) {
                i1(this.f19767q[i19], i18, i17);
            }
        }
        int iG = this.f19774x ? this.f19768r.g() : this.f19768r.k();
        boolean z10 = false;
        while (true) {
            int i20 = yVar.f20042c;
            if (((i20 < 0 || i20 >= xVar.b()) ? i15 : i16) == 0 || (!yVar2.f20048i && this.f19775y.isEmpty())) {
                break;
            }
            View view = sVar.k(yVar.f20042c, Long.MAX_VALUE).itemView;
            yVar.f20042c += yVar.f20043d;
            c cVar = (c) view.getLayoutParams();
            int layoutPosition = cVar.f19701a.getLayoutPosition();
            d dVar = this.f19756B;
            int[] iArr = dVar.f19786a;
            int i21 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i21 == -1) {
                if (Z0(yVar.f20044e)) {
                    i14 = this.f19766p - i16;
                    i13 = -1;
                    i12 = -1;
                } else {
                    i12 = i16;
                    i13 = this.f19766p;
                    i14 = i15;
                }
                f fVar2 = null;
                if (yVar.f20044e == i16) {
                    int iK2 = this.f19768r.k();
                    int i22 = BrazeLogger.SUPPRESS;
                    while (i14 != i13) {
                        f fVar3 = this.f19767q[i14];
                        int iF = fVar3.f(iK2);
                        if (iF < i22) {
                            i22 = iF;
                            fVar2 = fVar3;
                        }
                        i14 += i12;
                    }
                } else {
                    int iG2 = this.f19768r.g();
                    int i23 = Integer.MIN_VALUE;
                    while (i14 != i13) {
                        f fVar4 = this.f19767q[i14];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i23) {
                            fVar2 = fVar4;
                            i23 = iH2;
                        }
                        i14 += i12;
                    }
                }
                fVar = fVar2;
                dVar.b(layoutPosition);
                dVar.f19786a[layoutPosition] = fVar.f19805e;
            } else {
                fVar = this.f19767q[i21];
            }
            cVar.f19785e = fVar;
            if (yVar.f20044e == 1) {
                r10 = 0;
                c(view, -1, false);
            } else {
                r10 = 0;
                c(view, 0, false);
            }
            if (this.f19770t == 1) {
                i10 = 1;
                X0(view, RecyclerView.l.y(r10, this.f19771u, this.f19691l, r10, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.l.y(true, this.f19694o, this.f19692m, H() + K(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                i10 = 1;
                X0(view, RecyclerView.l.y(true, this.f19693n, this.f19691l, J() + I(), ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.l.y(false, this.f19771u, this.f19692m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (yVar.f20044e == i10) {
                iC = fVar.f(iG);
                iH = this.f19768r.c(view) + iC;
            } else {
                iH = fVar.h(iG);
                iC = iH - this.f19768r.c(view);
            }
            if (yVar.f20044e == 1) {
                f fVar5 = cVar.f19785e;
                fVar5.getClass();
                c cVar2 = (c) view.getLayoutParams();
                cVar2.f19785e = fVar5;
                ArrayList<View> arrayList = fVar5.f19801a;
                arrayList.add(view);
                fVar5.f19803c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar5.f19802b = Integer.MIN_VALUE;
                }
                if (cVar2.f19701a.isRemoved() || cVar2.f19701a.isUpdated()) {
                    fVar5.f19804d = StaggeredGridLayoutManager.this.f19768r.c(view) + fVar5.f19804d;
                }
            } else {
                f fVar6 = cVar.f19785e;
                fVar6.getClass();
                c cVar3 = (c) view.getLayoutParams();
                cVar3.f19785e = fVar6;
                ArrayList<View> arrayList2 = fVar6.f19801a;
                arrayList2.add(0, view);
                fVar6.f19802b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar6.f19803c = Integer.MIN_VALUE;
                }
                if (cVar3.f19701a.isRemoved() || cVar3.f19701a.isUpdated()) {
                    fVar6.f19804d = StaggeredGridLayoutManager.this.f19768r.c(view) + fVar6.f19804d;
                }
            }
            if (W0() && this.f19770t == 1) {
                iC2 = this.f19769s.g() - (((this.f19766p - 1) - fVar.f19805e) * this.f19771u);
                iK = iC2 - this.f19769s.c(view);
            } else {
                iK = this.f19769s.k() + (fVar.f19805e * this.f19771u);
                iC2 = this.f19769s.c(view) + iK;
            }
            if (this.f19770t == 1) {
                RecyclerView.l.R(view, iK, iC, iC2, iH);
            } else {
                RecyclerView.l.R(view, iC, iK, iH, iC2);
            }
            i1(fVar, yVar2.f20044e, i17);
            b1(sVar, yVar2);
            if (yVar2.f20047h && view.hasFocusable()) {
                i11 = 0;
                this.f19775y.set(fVar.f19805e, false);
            } else {
                i11 = 0;
            }
            i15 = i11;
            i16 = 1;
            z10 = true;
        }
        int i24 = i15;
        if (!z10) {
            b1(sVar, yVar2);
        }
        int iK3 = yVar2.f20044e == -1 ? this.f19768r.k() - T0(this.f19768r.k()) : S0(this.f19768r.g()) - this.f19768r.g();
        return iK3 > 0 ? Math.min(yVar.f20041b, iK3) : i24;
    }

    public final View M0(boolean z10) {
        int iK = this.f19768r.k();
        int iG = this.f19768r.g();
        View view = null;
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            int iE = this.f19768r.e(viewW);
            int iB = this.f19768r.b(viewW);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    public final View N0(boolean z10) {
        int iK = this.f19768r.k();
        int iG = this.f19768r.g();
        int iX = x();
        View view = null;
        for (int i10 = 0; i10 < iX; i10++) {
            View viewW = w(i10);
            int iE = this.f19768r.e(viewW);
            if (this.f19768r.b(viewW) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    public final void O0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int iG;
        int iS0 = S0(Integer.MIN_VALUE);
        if (iS0 != Integer.MIN_VALUE && (iG = this.f19768r.g() - iS0) > 0) {
            int i10 = iG - (-f1(-iG, sVar, xVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f19768r.p(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean P() {
        return this.f19757C != 0;
    }

    public final void P0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int iK;
        int iT0 = T0(BrazeLogger.SUPPRESS);
        if (iT0 != Integer.MAX_VALUE && (iK = iT0 - this.f19768r.k()) > 0) {
            int iF1 = iK - f1(iK, sVar, xVar);
            if (!z10 || iF1 <= 0) {
                return;
            }
            this.f19768r.p(-iF1);
        }
    }

    public final int Q0() {
        if (x() == 0) {
            return 0;
        }
        return RecyclerView.l.L(w(0));
    }

    public final int R0() {
        int iX = x();
        if (iX == 0) {
            return 0;
        }
        return RecyclerView.l.L(w(iX - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void S(int i10) {
        super.S(i10);
        for (int i11 = 0; i11 < this.f19766p; i11++) {
            f fVar = this.f19767q[i11];
            int i12 = fVar.f19802b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f19802b = i12 + i10;
            }
            int i13 = fVar.f19803c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f19803c = i13 + i10;
            }
        }
    }

    public final int S0(int i10) {
        int iF = this.f19767q[0].f(i10);
        for (int i11 = 1; i11 < this.f19766p; i11++) {
            int iF2 = this.f19767q[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void T(int i10) {
        super.T(i10);
        for (int i11 = 0; i11 < this.f19766p; i11++) {
            f fVar = this.f19767q[i11];
            int i12 = fVar.f19802b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f19802b = i12 + i10;
            }
            int i13 = fVar.f19803c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f19803c = i13 + i10;
            }
        }
    }

    public final int T0(int i10) {
        int iH = this.f19767q[0].h(i10);
        for (int i11 = 1; i11 < this.f19766p; i11++) {
            int iH2 = this.f19767q[i11].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void U() {
        this.f19756B.a();
        for (int i10 = 0; i10 < this.f19766p; i10++) {
            this.f19767q[i10].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX WARN: Code duplicated, block: B:25:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[LOOP:0: B:26:0x003c->B:30:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005d->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0070 A[EDGE_INSN: B:66:0x0070->B:40:0x0070 BREAK  A[LOOP:1: B:34:0x005d->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public final void U0(int i10, int i11, int i12) {
        int i13;
        int i14;
        d dVar;
        int[] iArr;
        int iR0;
        ArrayList arrayList;
        d.a aVar;
        int size;
        int i15;
        int i16;
        int size2;
        d.a aVar2;
        int iR1 = this.f19774x ? R0() : Q0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            dVar = this.f19756B;
            iArr = dVar.f19786a;
            if (iArr != null && i14 < iArr.length) {
                arrayList = dVar.f19787b;
                if (arrayList == null) {
                    i16 = -1;
                } else {
                    aVar = null;
                    if (arrayList != null) {
                        for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            aVar2 = (d.a) dVar.f19787b.get(size2);
                            if (aVar2.f19788b == i14) {
                                aVar = aVar2;
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        dVar.f19787b.remove(aVar);
                    }
                    size = dVar.f19787b.size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((d.a) dVar.f19787b.get(i15)).f19788b >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        d.a aVar3 = (d.a) dVar.f19787b.get(i15);
                        dVar.f19787b.remove(i15);
                        i16 = aVar3.f19788b;
                    } else {
                        i16 = -1;
                    }
                }
                if (i16 == -1) {
                    int[] iArr2 = dVar.f19786a;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = dVar.f19786a.length;
                } else {
                    Arrays.fill(dVar.f19786a, i14, Math.min(i16 + 1, dVar.f19786a.length), -1);
                }
            }
            if (i12 != 1) {
                dVar.c(i10, i11);
            } else if (i12 != 2) {
                dVar.d(i10, i11);
            } else if (i12 == 8) {
                dVar.d(i10, 1);
                dVar.c(i11, 1);
            }
            if (i13 <= iR1) {
                return;
            }
            if (this.f19774x) {
                iR0 = Q0();
            } else {
                iR0 = R0();
            }
            if (i14 <= iR0) {
                r0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        dVar = this.f19756B;
        iArr = dVar.f19786a;
        if (iArr != null) {
            arrayList = dVar.f19787b;
            if (arrayList == null) {
                i16 = -1;
            } else {
                aVar = null;
                if (arrayList != null) {
                    while (size2 >= 0) {
                        aVar2 = (d.a) dVar.f19787b.get(size2);
                        if (aVar2.f19788b == i14) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar != null) {
                    dVar.f19787b.remove(aVar);
                }
                size = dVar.f19787b.size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((d.a) dVar.f19787b.get(i15)).f19788b >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    d.a aVar4 = (d.a) dVar.f19787b.get(i15);
                    dVar.f19787b.remove(i15);
                    i16 = aVar4.f19788b;
                } else {
                    i16 = -1;
                }
            }
            if (i16 == -1) {
                int[] iArr3 = dVar.f19786a;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = dVar.f19786a.length;
            } else {
                Arrays.fill(dVar.f19786a, i14, Math.min(i16 + 1, dVar.f19786a.length), -1);
            }
        }
        if (i12 != 1) {
            dVar.c(i10, i11);
        } else if (i12 != 2) {
            dVar.d(i10, i11);
        } else if (i12 == 8) {
            dVar.d(i10, 1);
            dVar.c(i11, 1);
        }
        if (i13 <= iR1) {
            return;
        }
        if (this.f19774x) {
            iR0 = Q0();
        } else {
            iR0 = R0();
        }
        if (i14 <= iR0) {
            r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002c A[SYNTHETIC] */
    public final View V0() {
        boolean z10;
        boolean z11;
        int iX = x();
        int i10 = iX - 1;
        BitSet bitSet = new BitSet(this.f19766p);
        bitSet.set(0, this.f19766p, true);
        byte b10 = (this.f19770t == 1 && W0()) ? (byte) 1 : (byte) -1;
        if (this.f19774x) {
            iX = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iX ? 1 : -1;
        while (i10 != iX) {
            View viewW = w(i10);
            c cVar = (c) viewW.getLayoutParams();
            if (bitSet.get(cVar.f19785e.f19805e)) {
                f fVar = cVar.f19785e;
                if (this.f19774x) {
                    int i12 = fVar.f19803c;
                    if (i12 == Integer.MIN_VALUE) {
                        fVar.a();
                        i12 = fVar.f19803c;
                    }
                    if (i12 < this.f19768r.g()) {
                        ((c) ((View) Z3.n.f(1, fVar.f19801a)).getLayoutParams()).getClass();
                        return viewW;
                    }
                    bitSet.clear(cVar.f19785e.f19805e);
                } else {
                    int i13 = fVar.f19802b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = fVar.f19801a.get(0);
                        c cVar2 = (c) view.getLayoutParams();
                        fVar.f19802b = StaggeredGridLayoutManager.this.f19768r.e(view);
                        cVar2.getClass();
                        i13 = fVar.f19802b;
                    }
                    if (i13 > this.f19768r.k()) {
                        ((c) fVar.f19801a.get(0).getLayoutParams()).getClass();
                        return viewW;
                    }
                    bitSet.clear(cVar.f19785e.f19805e);
                }
            }
            i10 += i11;
            if (i10 != iX) {
                View viewW2 = w(i10);
                if (this.f19774x) {
                    int iB = this.f19768r.b(viewW);
                    int iB2 = this.f19768r.b(viewW2);
                    if (iB < iB2) {
                        return viewW;
                    }
                    if (iB == iB2) {
                        if (cVar.f19785e.f19805e - ((c) viewW2.getLayoutParams()).f19785e.f19805e < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                            return viewW;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iE = this.f19768r.e(viewW);
                    int iE2 = this.f19768r.e(viewW2);
                    if (iE > iE2) {
                        return viewW;
                    }
                    if (iE == iE2) {
                        if (cVar.f19785e.f19805e - ((c) viewW2.getLayoutParams()).f19785e.f19805e < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                            return viewW;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f19682b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f19765K);
        }
        for (int i10 = 0; i10 < this.f19766p; i10++) {
            this.f19767q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean W0() {
        return G() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0059  */
    /* JADX WARN: Code duplicated, block: B:46:0x0061  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final View X(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        View viewF;
        int i11;
        if (x() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f19682b;
        if (recyclerView == null || (viewF = recyclerView.F(view)) == null || this.f19681a.f19846c.contains(viewF)) {
            viewF = null;
        }
        if (viewF == null) {
            return null;
        }
        e1();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 == 66 ? this.f19770t == 0 : !(i10 != 130 || this.f19770t != 1)) {
                            i11 = 1;
                        }
                    } else if (this.f19770t == 1) {
                        i11 = -1;
                    }
                    i11 = Integer.MIN_VALUE;
                } else if (this.f19770t == 0) {
                    i11 = -1;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
            } else if (this.f19770t != 1 && W0()) {
                i11 = -1;
            } else {
                i11 = 1;
            }
        } else if (this.f19770t != 1 && W0()) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewF.getLayoutParams();
        cVar.getClass();
        f fVar = cVar.f19785e;
        int iR0 = i11 == 1 ? R0() : Q0();
        h1(iR0, xVar);
        g1(i11);
        y yVar = this.f19772v;
        yVar.f20042c = yVar.f20043d + iR0;
        yVar.f20041b = (int) (this.f19768r.l() * 0.33333334f);
        yVar.f20047h = true;
        yVar.f20040a = false;
        L0(sVar, yVar, xVar);
        this.f19758D = this.f19774x;
        View viewG = fVar.g(iR0, i11);
        if (viewG != null && viewG != viewF) {
            return viewG;
        }
        if (Z0(i11)) {
            for (int i12 = this.f19766p - 1; i12 >= 0; i12--) {
                View viewG2 = this.f19767q[i12].g(iR0, i11);
                if (viewG2 != null && viewG2 != viewF) {
                    return viewG2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f19766p; i13++) {
                View viewG3 = this.f19767q[i13].g(iR0, i11);
                if (viewG3 != null && viewG3 != viewF) {
                    return viewG3;
                }
            }
        }
        boolean z10 = (this.f19773w ^ true) == (i11 == -1);
        View viewS = s(z10 ? fVar.c() : fVar.d());
        if (viewS != null && viewS != viewF) {
            return viewS;
        }
        if (Z0(i11)) {
            for (int i14 = this.f19766p - 1; i14 >= 0; i14--) {
                if (i14 != fVar.f19805e) {
                    View viewS2 = s(z10 ? this.f19767q[i14].c() : this.f19767q[i14].d());
                    if (viewS2 != null && viewS2 != viewF) {
                        return viewS2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f19766p; i15++) {
                View viewS3 = s(z10 ? this.f19767q[i15].c() : this.f19767q[i15].d());
                if (viewS3 != null && viewS3 != viewF) {
                    return viewS3;
                }
            }
        }
        return null;
    }

    public final void X0(View view, int i10, int i11) {
        Rect rect = this.f19761G;
        e(rect, view);
        c cVar = (c) view.getLayoutParams();
        int iJ1 = j1(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iJ2 = j1(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (A0(view, iJ1, iJ2, cVar)) {
            view.measure(iJ1, iJ2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (x() > 0) {
            View viewN0 = N0(false);
            View viewM0 = M0(false);
            if (viewN0 == null || viewM0 == null) {
                return;
            }
            int iL = RecyclerView.l.L(viewN0);
            int iL2 = RecyclerView.l.L(viewM0);
            if (iL < iL2) {
                accessibilityEvent.setFromIndex(iL);
                accessibilityEvent.setToIndex(iL2);
            } else {
                accessibilityEvent.setFromIndex(iL2);
                accessibilityEvent.setToIndex(iL);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:246:0x0405  */
    /* JADX WARN: Code duplicated, block: B:257:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01ea A[SYNTHETIC] */
    public final void Y0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        boolean z11;
        e eVar;
        int iX;
        int i10;
        int iL;
        int iL2;
        int iX2;
        int i11;
        e eVar2 = this.f19760F;
        b bVar = this.f19762H;
        if (!(eVar2 == null && this.f19776z == -1) && xVar.b() == 0) {
            m0(sVar);
            bVar.a();
            return;
        }
        boolean z12 = (bVar.f19782e && this.f19776z == -1 && this.f19760F == null) ? false : true;
        d dVar = this.f19756B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z12) {
            bVar.a();
            e eVar3 = this.f19760F;
            if (eVar3 != null) {
                int i12 = eVar3.f19794d;
                if (i12 > 0) {
                    if (i12 == this.f19766p) {
                        for (int i13 = 0; i13 < this.f19766p; i13++) {
                            this.f19767q[i13].b();
                            e eVar4 = this.f19760F;
                            int iG = eVar4.f19795e[i13];
                            if (iG != Integer.MIN_VALUE) {
                                iG += eVar4.j ? this.f19768r.g() : this.f19768r.k();
                            }
                            f fVar = this.f19767q[i13];
                            fVar.f19802b = iG;
                            fVar.f19803c = iG;
                        }
                    } else {
                        eVar3.f19795e = null;
                        eVar3.f19794d = 0;
                        eVar3.f19796f = 0;
                        eVar3.f19797g = null;
                        eVar3.f19798h = null;
                        eVar3.f19792b = eVar3.f19793c;
                    }
                }
                e eVar5 = this.f19760F;
                this.f19759E = eVar5.f19800k;
                boolean z13 = eVar5.f19799i;
                d(null);
                e eVar6 = this.f19760F;
                if (eVar6 != null && eVar6.f19799i != z13) {
                    eVar6.f19799i = z13;
                }
                this.f19773w = z13;
                r0();
                e1();
                e eVar7 = this.f19760F;
                int i14 = eVar7.f19792b;
                if (i14 != -1) {
                    this.f19776z = i14;
                    bVar.f19780c = eVar7.j;
                } else {
                    bVar.f19780c = this.f19774x;
                }
                if (eVar7.f19796f > 1) {
                    dVar.f19786a = eVar7.f19797g;
                    dVar.f19787b = eVar7.f19798h;
                }
            } else {
                e1();
                bVar.f19780c = this.f19774x;
            }
            if (xVar.f19742g || (i11 = this.f19776z) == -1) {
                if (this.f19758D) {
                    int iB = xVar.b();
                    iX2 = x() - 1;
                    while (true) {
                        if (iX2 < 0) {
                            iL2 = 0;
                            break;
                        }
                        iL2 = RecyclerView.l.L(w(iX2));
                        if (iL2 < 0 && iL2 < iB) {
                            break;
                        } else {
                            iX2--;
                        }
                    }
                } else {
                    int iB2 = xVar.b();
                    iX = x();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iX) {
                            iL2 = 0;
                            break;
                        }
                        iL = RecyclerView.l.L(w(i10));
                        if (iL < 0 && iL < iB2) {
                            iL2 = iL;
                            break;
                        }
                        i10++;
                    }
                }
                bVar.f19778a = iL2;
                bVar.f19779b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= xVar.b()) {
                this.f19776z = -1;
                this.f19755A = Integer.MIN_VALUE;
                if (this.f19758D) {
                    int iB3 = xVar.b();
                    iX2 = x() - 1;
                    while (true) {
                        if (iX2 < 0) {
                            iL2 = 0;
                            break;
                        } else {
                            iL2 = RecyclerView.l.L(w(iX2));
                            if (iL2 < 0) {
                            }
                            iX2--;
                        }
                    }
                } else {
                    int iB4 = xVar.b();
                    iX = x();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iX) {
                            iL2 = 0;
                            break;
                        } else {
                            iL = RecyclerView.l.L(w(i10));
                            if (iL < 0) {
                            }
                            i10++;
                        }
                    }
                }
                bVar.f19778a = iL2;
                bVar.f19779b = Integer.MIN_VALUE;
            } else {
                e eVar8 = this.f19760F;
                if (eVar8 == null || eVar8.f19792b == -1 || eVar8.f19794d < 1) {
                    View viewS = s(this.f19776z);
                    if (viewS != null) {
                        bVar.f19778a = this.f19774x ? R0() : Q0();
                        if (this.f19755A != Integer.MIN_VALUE) {
                            if (bVar.f19780c) {
                                bVar.f19779b = (this.f19768r.g() - this.f19755A) - this.f19768r.b(viewS);
                            } else {
                                bVar.f19779b = (this.f19768r.k() + this.f19755A) - this.f19768r.e(viewS);
                            }
                        } else if (this.f19768r.c(viewS) > this.f19768r.l()) {
                            bVar.f19779b = bVar.f19780c ? this.f19768r.g() : this.f19768r.k();
                        } else {
                            int iE = this.f19768r.e(viewS) - this.f19768r.k();
                            if (iE < 0) {
                                bVar.f19779b = -iE;
                            } else {
                                int iG2 = this.f19768r.g() - this.f19768r.b(viewS);
                                if (iG2 < 0) {
                                    bVar.f19779b = iG2;
                                } else {
                                    bVar.f19779b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i15 = this.f19776z;
                        bVar.f19778a = i15;
                        int i16 = this.f19755A;
                        if (i16 == Integer.MIN_VALUE) {
                            boolean z14 = G0(i15) == 1;
                            bVar.f19780c = z14;
                            bVar.f19779b = z14 ? staggeredGridLayoutManager.f19768r.g() : staggeredGridLayoutManager.f19768r.k();
                        } else if (bVar.f19780c) {
                            bVar.f19779b = staggeredGridLayoutManager.f19768r.g() - i16;
                        } else {
                            bVar.f19779b = staggeredGridLayoutManager.f19768r.k() + i16;
                        }
                        bVar.f19781d = true;
                    }
                } else {
                    bVar.f19779b = Integer.MIN_VALUE;
                    bVar.f19778a = this.f19776z;
                }
            }
            bVar.f19782e = true;
        }
        if (this.f19760F == null && this.f19776z == -1 && (bVar.f19780c != this.f19758D || W0() != this.f19759E)) {
            dVar.a();
            bVar.f19781d = true;
        }
        if (x() > 0 && ((eVar = this.f19760F) == null || eVar.f19794d < 1)) {
            if (bVar.f19781d) {
                for (int i17 = 0; i17 < this.f19766p; i17++) {
                    this.f19767q[i17].b();
                    int i18 = bVar.f19779b;
                    if (i18 != Integer.MIN_VALUE) {
                        f fVar2 = this.f19767q[i17];
                        fVar2.f19802b = i18;
                        fVar2.f19803c = i18;
                    }
                }
            } else if (z12 || bVar.f19783f == null) {
                for (int i19 = 0; i19 < this.f19766p; i19++) {
                    f fVar3 = this.f19767q[i19];
                    boolean z15 = this.f19774x;
                    int i20 = bVar.f19779b;
                    int iF = z15 ? fVar3.f(Integer.MIN_VALUE) : fVar3.h(Integer.MIN_VALUE);
                    fVar3.b();
                    if (iF != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z15 || iF >= staggeredGridLayoutManager2.f19768r.g()) && (z15 || iF <= staggeredGridLayoutManager2.f19768r.k())) {
                            if (i20 != Integer.MIN_VALUE) {
                                iF += i20;
                            }
                            fVar3.f19803c = iF;
                            fVar3.f19802b = iF;
                        }
                    }
                }
                f[] fVarArr = this.f19767q;
                int length = fVarArr.length;
                int[] iArr = bVar.f19783f;
                if (iArr == null || iArr.length < length) {
                    bVar.f19783f = new int[staggeredGridLayoutManager.f19767q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    bVar.f19783f[i21] = fVarArr[i21].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f19766p; i22++) {
                    f fVar4 = this.f19767q[i22];
                    fVar4.b();
                    int i23 = bVar.f19783f[i22];
                    fVar4.f19802b = i23;
                    fVar4.f19803c = i23;
                }
            }
        }
        r(sVar);
        y yVar = this.f19772v;
        yVar.f20040a = false;
        int iL3 = this.f19769s.l();
        this.f19771u = iL3 / this.f19766p;
        View.MeasureSpec.makeMeasureSpec(iL3, this.f19769s.i());
        h1(bVar.f19778a, xVar);
        if (bVar.f19780c) {
            g1(-1);
            L0(sVar, yVar, xVar);
            g1(1);
            yVar.f20042c = bVar.f19778a + yVar.f20043d;
            L0(sVar, yVar, xVar);
        } else {
            g1(1);
            L0(sVar, yVar, xVar);
            g1(-1);
            yVar.f20042c = bVar.f19778a + yVar.f20043d;
            L0(sVar, yVar, xVar);
        }
        if (this.f19769s.i() != 1073741824) {
            int iX3 = x();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < iX3; i24++) {
                View viewW = w(i24);
                float fC = this.f19769s.c(viewW);
                if (fC >= fMax) {
                    ((c) viewW.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f19771u;
            int iRound = Math.round(fMax * this.f19766p);
            if (this.f19769s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f19769s.l());
            }
            this.f19771u = iRound / this.f19766p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f19769s.i());
            if (this.f19771u != i25) {
                for (int i26 = 0; i26 < iX3; i26++) {
                    View viewW2 = w(i26);
                    c cVar = (c) viewW2.getLayoutParams();
                    cVar.getClass();
                    if (W0() && this.f19770t == 1) {
                        int i27 = -((this.f19766p - 1) - cVar.f19785e.f19805e);
                        viewW2.offsetLeftAndRight((this.f19771u * i27) - (i27 * i25));
                    } else {
                        int i28 = cVar.f19785e.f19805e;
                        int i29 = this.f19771u * i28;
                        int i30 = i28 * i25;
                        if (this.f19770t == 1) {
                            viewW2.offsetLeftAndRight(i29 - i30);
                        } else {
                            viewW2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (x() > 0) {
            if (this.f19774x) {
                O0(sVar, xVar, true);
                P0(sVar, xVar, false);
            } else {
                P0(sVar, xVar, true);
                O0(sVar, xVar, false);
            }
        }
        if (z10 && !xVar.f19742g && this.f19757C != 0 && x() > 0 && V0() != null) {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f19765K);
            }
            z11 = H0();
        }
        if (xVar.f19742g) {
            bVar.a();
        }
        this.f19758D = bVar.f19780c;
        this.f19759E = W0();
        if (z11) {
            bVar.a();
            Y0(sVar, xVar, false);
        }
    }

    public final boolean Z0(int i10) {
        if (this.f19770t == 0) {
            return (i10 == -1) != this.f19774x;
        }
        return ((i10 == -1) == this.f19774x) == W0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        int iG0 = G0(i10);
        PointF pointF = new PointF();
        if (iG0 == 0) {
            return null;
        }
        if (this.f19770t == 0) {
            pointF.x = iG0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iG0;
        }
        return pointF;
    }

    public final void a1(int i10, RecyclerView.x xVar) {
        int iQ0;
        int i11;
        if (i10 > 0) {
            iQ0 = R0();
            i11 = 1;
        } else {
            iQ0 = Q0();
            i11 = -1;
        }
        y yVar = this.f19772v;
        yVar.f20040a = true;
        h1(iQ0, xVar);
        g1(i11);
        yVar.f20042c = iQ0 + yVar.f20043d;
        yVar.f20041b = Math.abs(i10);
    }

    public final void b1(RecyclerView.s sVar, y yVar) {
        int iMin;
        if (!yVar.f20040a || yVar.f20048i) {
            return;
        }
        if (yVar.f20041b == 0) {
            if (yVar.f20044e == -1) {
                c1(sVar, yVar.f20046g);
                return;
            } else {
                d1(sVar, yVar.f20045f);
                return;
            }
        }
        int i10 = 1;
        if (yVar.f20044e == -1) {
            int i11 = yVar.f20045f;
            int iH = this.f19767q[0].h(i11);
            while (i10 < this.f19766p) {
                int iH2 = this.f19767q[i10].h(i11);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i10++;
            }
            int i12 = i11 - iH;
            c1(sVar, i12 < 0 ? yVar.f20046g : yVar.f20046g - Math.min(i12, yVar.f20041b));
            return;
        }
        int i13 = yVar.f20046g;
        int iF = this.f19767q[0].f(i13);
        while (i10 < this.f19766p) {
            int iF2 = this.f19767q[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - yVar.f20046g;
        if (i14 < 0) {
            iMin = yVar.f20045f;
        } else {
            iMin = Math.min(i14, yVar.f20041b) + yVar.f20045f;
        }
        d1(sVar, iMin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(int i10, int i11) {
        U0(i10, i11, 1);
    }

    public final void c1(RecyclerView.s sVar, int i10) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            if (this.f19768r.e(viewW) < i10 || this.f19768r.o(viewW) < i10) {
                return;
            }
            c cVar = (c) viewW.getLayoutParams();
            cVar.getClass();
            if (cVar.f19785e.f19801a.size() == 1) {
                return;
            }
            f fVar = cVar.f19785e;
            ArrayList<View> arrayList = fVar.f19801a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f19785e = null;
            if (cVar2.f19701a.isRemoved() || cVar2.f19701a.isUpdated()) {
                fVar.f19804d -= StaggeredGridLayoutManager.this.f19768r.c(viewRemove);
            }
            if (size == 1) {
                fVar.f19802b = Integer.MIN_VALUE;
            }
            fVar.f19803c = Integer.MIN_VALUE;
            o0(viewW, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(String str) {
        if (this.f19760F == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0() {
        this.f19756B.a();
        r0();
    }

    public final void d1(RecyclerView.s sVar, int i10) {
        while (x() > 0) {
            View viewW = w(0);
            if (this.f19768r.b(viewW) > i10 || this.f19768r.n(viewW) > i10) {
                return;
            }
            c cVar = (c) viewW.getLayoutParams();
            cVar.getClass();
            if (cVar.f19785e.f19801a.size() == 1) {
                return;
            }
            f fVar = cVar.f19785e;
            ArrayList<View> arrayList = fVar.f19801a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f19785e = null;
            if (arrayList.size() == 0) {
                fVar.f19803c = Integer.MIN_VALUE;
            }
            if (cVar2.f19701a.isRemoved() || cVar2.f19701a.isUpdated()) {
                fVar.f19804d -= StaggeredGridLayoutManager.this.f19768r.c(viewRemove);
            }
            fVar.f19802b = Integer.MIN_VALUE;
            o0(viewW, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(int i10, int i11) {
        U0(i10, i11, 8);
    }

    public final void e1() {
        if (this.f19770t == 1 || !W0()) {
            this.f19774x = this.f19773w;
        } else {
            this.f19774x = !this.f19773w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f() {
        return this.f19770t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0(int i10, int i11) {
        U0(i10, i11, 2);
    }

    public final int f1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        a1(i10, xVar);
        y yVar = this.f19772v;
        int iL0 = L0(sVar, yVar, xVar);
        if (yVar.f20041b >= iL0) {
            i10 = i10 < 0 ? -iL0 : iL0;
        }
        this.f19768r.p(-i10);
        this.f19758D = this.f19774x;
        yVar.f20041b = 0;
        b1(sVar, yVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g() {
        return this.f19770t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i10, int i11) {
        U0(i10, i11, 4);
    }

    public final void g1(int i10) {
        y yVar = this.f19772v;
        yVar.f20044e = i10;
        yVar.f20043d = this.f19774x != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean h(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(RecyclerView.s sVar, RecyclerView.x xVar) {
        Y0(sVar, xVar, true);
    }

    public final void h1(int i10, RecyclerView.x xVar) {
        int iL;
        int iL2;
        int i11;
        y yVar = this.f19772v;
        boolean z10 = false;
        yVar.f20041b = 0;
        yVar.f20042c = i10;
        z zVar = this.f19685e;
        if (!(zVar != null && zVar.f19726e) || (i11 = xVar.f19736a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f19774x == (i11 < i10)) {
                iL = this.f19768r.l();
                iL2 = 0;
            } else {
                iL2 = this.f19768r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f19682b;
        if (recyclerView == null || !recyclerView.f19631i) {
            yVar.f20046g = this.f19768r.f() + iL;
            yVar.f20045f = -iL2;
        } else {
            yVar.f20045f = this.f19768r.k() - iL2;
            yVar.f20046g = this.f19768r.g() + iL;
        }
        yVar.f20047h = false;
        yVar.f20040a = true;
        if (this.f19768r.i() == 0 && this.f19768r.f() == 0) {
            z10 = true;
        }
        yVar.f20048i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i0(RecyclerView.x xVar) {
        this.f19776z = -1;
        this.f19755A = Integer.MIN_VALUE;
        this.f19760F = null;
        this.f19762H.a();
    }

    public final void i1(f fVar, int i10, int i11) {
        int i12 = fVar.f19804d;
        int i13 = fVar.f19805e;
        if (i10 != -1) {
            int i14 = fVar.f19803c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.a();
                i14 = fVar.f19803c;
            }
            if (i14 - i12 >= i11) {
                this.f19775y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = fVar.f19802b;
        if (i15 == Integer.MIN_VALUE) {
            View view = fVar.f19801a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.f19802b = StaggeredGridLayoutManager.this.f19768r.e(view);
            cVar.getClass();
            i15 = fVar.f19802b;
        }
        if (i15 + i12 <= i11) {
            this.f19775y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j(int i10, int i11, RecyclerView.x xVar, RunnableC1453s.b bVar) {
        y yVar;
        int iF;
        int iH;
        if (this.f19770t != 0) {
            i10 = i11;
        }
        if (x() == 0 || i10 == 0) {
            return;
        }
        a1(i10, xVar);
        int[] iArr = this.f19764J;
        if (iArr == null || iArr.length < this.f19766p) {
            this.f19764J = new int[this.f19766p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f19766p;
            yVar = this.f19772v;
            if (i12 >= i14) {
                break;
            }
            if (yVar.f20043d == -1) {
                iF = yVar.f20045f;
                iH = this.f19767q[i12].h(iF);
            } else {
                iF = this.f19767q[i12].f(yVar.f20046g);
                iH = yVar.f20046g;
            }
            int i15 = iF - iH;
            if (i15 >= 0) {
                this.f19764J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f19764J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = yVar.f20042c;
            if (i17 < 0 || i17 >= xVar.b()) {
                return;
            }
            bVar.a(yVar.f20042c, this.f19764J[i16]);
            yVar.f20042c += yVar.f20043d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f19760F = eVar;
            if (this.f19776z != -1) {
                eVar.f19795e = null;
                eVar.f19794d = 0;
                eVar.f19792b = -1;
                eVar.f19793c = -1;
                eVar.f19795e = null;
                eVar.f19794d = 0;
                eVar.f19796f = 0;
                eVar.f19797g = null;
                eVar.f19798h = null;
            }
            r0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable k0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.f19760F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.f19794d = eVar.f19794d;
            eVar2.f19792b = eVar.f19792b;
            eVar2.f19793c = eVar.f19793c;
            eVar2.f19795e = eVar.f19795e;
            eVar2.f19796f = eVar.f19796f;
            eVar2.f19797g = eVar.f19797g;
            eVar2.f19799i = eVar.f19799i;
            eVar2.j = eVar.j;
            eVar2.f19800k = eVar.f19800k;
            eVar2.f19798h = eVar.f19798h;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.f19799i = this.f19773w;
        eVar3.j = this.f19758D;
        eVar3.f19800k = this.f19759E;
        d dVar = this.f19756B;
        if (dVar == null || (iArr = dVar.f19786a) == null) {
            eVar3.f19796f = 0;
        } else {
            eVar3.f19797g = iArr;
            eVar3.f19796f = iArr.length;
            eVar3.f19798h = dVar.f19787b;
        }
        if (x() > 0) {
            eVar3.f19792b = this.f19758D ? R0() : Q0();
            View viewM0 = this.f19774x ? M0(true) : N0(true);
            eVar3.f19793c = viewM0 != null ? RecyclerView.l.L(viewM0) : -1;
            int i10 = this.f19766p;
            eVar3.f19794d = i10;
            eVar3.f19795e = new int[i10];
            for (int i11 = 0; i11 < this.f19766p; i11++) {
                if (this.f19758D) {
                    iH = this.f19767q[i11].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f19768r.g();
                        iH -= iK;
                    }
                } else {
                    iH = this.f19767q[i11].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f19768r.k();
                        iH -= iK;
                    }
                }
                eVar3.f19795e[i11] = iH;
            }
        } else {
            eVar3.f19792b = -1;
            eVar3.f19793c = -1;
            eVar3.f19794d = 0;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(RecyclerView.x xVar) {
        return I0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l0(int i10) {
        if (i10 == 0) {
            H0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return I0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int s0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return f1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m t() {
        return this.f19770t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(int i10) {
        e eVar = this.f19760F;
        if (eVar != null && eVar.f19792b != i10) {
            eVar.f19795e = null;
            eVar.f19794d = 0;
            eVar.f19792b = -1;
            eVar.f19793c = -1;
        }
        this.f19776z = i10;
        this.f19755A = Integer.MIN_VALUE;
        r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int u0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return f1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void x0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.f19766p;
        int iJ = J() + I();
        int iH = H() + K();
        if (this.f19770t == 1) {
            int iHeight = rect.height() + iH;
            RecyclerView recyclerView = this.f19682b;
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            i13 = RecyclerView.l.i(i11, iHeight, recyclerView.getMinimumHeight());
            i12 = RecyclerView.l.i(i10, (this.f19771u * i14) + iJ, this.f19682b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iJ;
            RecyclerView recyclerView2 = this.f19682b;
            WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
            i12 = RecyclerView.l.i(i10, iWidth, recyclerView2.getMinimumWidth());
            i13 = RecyclerView.l.i(i11, (this.f19771u * i14) + iH, this.f19682b.getMinimumHeight());
        }
        this.f19682b.setMeasuredDimension(i12, i13);
    }
}
