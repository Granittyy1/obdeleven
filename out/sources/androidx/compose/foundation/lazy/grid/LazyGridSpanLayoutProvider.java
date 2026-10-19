package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0971f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyGridIntervalContent f10402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f10403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10410i;

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10412b;

        public a(int i10, int i11) {
            this.f10411a = i10;
            this.f10412b = i11;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10413a = new b();
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10415b;

        public c(int i10, List<androidx.compose.foundation.lazy.grid.c> list) {
            this.f10414a = i10;
            this.f10415b = list;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.f10402a = lazyGridIntervalContent;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.f10403b = arrayList;
        this.f10407f = -1;
        this.f10408g = new ArrayList();
        this.f10409h = EmptyList.f42983b;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.f10410i))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    public final c b(int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        ?? r10;
        if (!this.f10402a.f10398c) {
            int i14 = this.f10410i;
            int i15 = i10 * i14;
            int iD = d() - i15;
            if (i14 > iD) {
                i14 = iD;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            if (i14 == this.f10409h.size()) {
                r10 = this.f10409h;
            } else {
                ArrayList arrayList = new ArrayList(i14);
                for (int i16 = 0; i16 < i14; i16++) {
                    arrayList.add(new androidx.compose.foundation.lazy.grid.c(1));
                }
                this.f10409h = arrayList;
                r10 = arrayList;
            }
            return new c(i15, r10);
        }
        int iA = i10 / a();
        ArrayList<a> arrayList2 = this.f10403b;
        int iMin = Math.min(iA, arrayList2.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = arrayList2.get(iMin).f10411a;
        int iE = arrayList2.get(iMin).f10412b;
        int i17 = this.f10404c;
        ArrayList arrayList3 = this.f10408g;
        if (iA2 <= i17 && i17 <= i10) {
            iIntValue = this.f10405d;
            iE = this.f10406e;
            iA2 = i17;
        } else if (iMin == this.f10407f && (i11 = i10 - iA2) < arrayList3.size()) {
            iIntValue = ((Number) arrayList3.get(i11)).intValue();
            iA2 = i10;
            iE = 0;
        }
        if (iA2 % a() == 0) {
            int i18 = i10 - iA2;
            z10 = 2 <= i18 && i18 < a();
        }
        if (z10) {
            this.f10407f = iMin;
            arrayList3.clear();
        }
        if (iA2 > i10) {
            p245u.c.c("currentLine (" + iA2 + ") > lineIndex (" + i10 + ')');
        }
        while (iA2 < i10 && iIntValue < d()) {
            if (z10) {
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            int i19 = 0;
            while (i19 < this.f10410i && iIntValue < d()) {
                if (iE == 0) {
                    i13 = iE;
                    iE = e(iIntValue);
                } else {
                    i13 = 0;
                }
                i19 += iE;
                if (i19 > this.f10410i) {
                    break;
                }
                iIntValue++;
                iE = i13;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < d()) {
                if (arrayList2.size() != iA2 / a()) {
                    p245u.c.c("invalid starting point");
                }
                arrayList2.add(new a(iIntValue, iE));
            }
        }
        this.f10404c = i10;
        this.f10405d = iIntValue;
        this.f10406e = iE;
        ArrayList arrayList4 = new ArrayList();
        int i20 = 0;
        int i21 = iIntValue;
        while (i20 < this.f10410i && i21 < d()) {
            if (iE == 0) {
                int i22 = iE;
                iE = e(i21);
                i12 = i22;
            } else {
                i12 = 0;
            }
            i20 += iE;
            if (i20 > this.f10410i) {
                break;
            }
            i21++;
            if (iE <= 0) {
                p245u.c.a("The span value should be higher than 0");
            }
            arrayList4.add(new androidx.compose.foundation.lazy.grid.c(iE));
            iE = i12;
        }
        return new c(iIntValue, arrayList4);
    }

    public final int c(final int i10) {
        if (d() <= 0) {
            return 0;
        }
        if (i10 >= d()) {
            p245u.c.a("ItemIndex > total count");
        }
        if (!this.f10402a.f10398c) {
            return i10 / this.f10410i;
        }
        ArrayList<a> arrayList = this.f10403b;
        int iO = kotlin.collections.l.o(0, arrayList.size(), new Ia.l<a, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Integer invoke(LazyGridSpanLayoutProvider.a aVar) {
                return Integer.valueOf(aVar.f10411a - i10);
            }
        }, arrayList);
        if (iO < 0) {
            iO = (-iO) - 2;
        }
        int iA = a() * iO;
        int i11 = arrayList.get(iO).f10411a;
        if (i11 > i10) {
            p245u.c.a("currentItemIndex > itemIndex");
        }
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 1;
            int iE = e(i11);
            i12 += iE;
            int i14 = this.f10410i;
            if (i12 >= i14) {
                if (i12 == i14) {
                    iA++;
                    i12 = 0;
                } else {
                    iA++;
                    i12 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new a(i13 - (i12 > 0 ? 1 : 0), 0));
            }
            i11 = i13;
        }
        return e(i10) + i12 > this.f10410i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f10402a.f10397b.f10670b;
    }

    public final int e(int i10) {
        b bVar = b.f10413a;
        C0971f<f> c0971fB = this.f10402a.f10397b.b(i10);
        int i11 = i10 - c0971fB.f10715a;
        f fVar = (f) c0971fB.f10717c;
        return (int) fVar.f10456b.invoke(bVar, Integer.valueOf(i11)).f10449a;
    }
}
