package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: LazyLayoutKeyIndexMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements InterfaceC0987w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.collection.H f10664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10666c;

    public NearestRangeKeyIndexMap(Na.i iVar, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        P pI = lazyLayoutIntervalContent.i();
        final int i10 = iVar.f4687b;
        if (i10 < 0) {
            p245u.c.c("negative nearestRange.first");
        }
        final int iMin = Math.min(iVar.f4688c, pI.f10670b - 1);
        if (iMin < i10) {
            androidx.collection.H<Object> h8 = androidx.collection.P.f9118a;
            kotlin.jvm.internal.i.c(h8, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f10664a = h8;
            this.f10665b = new Object[0];
            this.f10666c = 0;
            return;
        }
        int i11 = (iMin - i10) + 1;
        this.f10665b = new Object[i11];
        this.f10666c = i10;
        final androidx.collection.H h10 = new androidx.collection.H(i11);
        Ia.l<C0971f<? extends LazyLayoutIntervalContent.Interval>, p293xa.r> lVar = new Ia.l<C0971f<? extends LazyLayoutIntervalContent.Interval>, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x002b  */
            @Override // Ia.l
            public final p293xa.r invoke(C0971f<? extends LazyLayoutIntervalContent.Interval> c0971f) {
                Object c0969d;
                C0971f<? extends LazyLayoutIntervalContent.Interval> c0971f2 = c0971f;
                Ia.l<Integer, Object> key = c0971f2.f10717c.getKey();
                int i12 = i10;
                int i13 = c0971f2.f10715a;
                int iMax = Math.max(i12, i13);
                int iMin2 = Math.min(iMin, (c0971f2.f10716b + i13) - 1);
                if (iMax <= iMin2) {
                    while (true) {
                        if (key == null) {
                            c0969d = new C0969d(iMax);
                        } else {
                            c0969d = key.invoke(Integer.valueOf(iMax - i13));
                            if (c0969d == null) {
                                c0969d = new C0969d(iMax);
                            }
                        }
                        h10.g(iMax, c0969d);
                        NearestRangeKeyIndexMap nearestRangeKeyIndexMap = this;
                        nearestRangeKeyIndexMap.f10665b[iMax - nearestRangeKeyIndexMap.f10666c] = c0969d;
                        if (iMax == iMin2) {
                            break;
                        }
                        iMax++;
                    }
                }
                return p293xa.r.f47939a;
            }
        };
        if (i10 < 0 || i10 >= pI.f10670b) {
            StringBuilder sbE = A8.f.e(i10, "Index ", ", size ");
            sbE.append(pI.f10670b);
            p245u.c.d(sbE.toString());
        }
        if (iMin < 0 || iMin >= pI.f10670b) {
            StringBuilder sbE2 = A8.f.e(iMin, "Index ", ", size ");
            sbE2.append(pI.f10670b);
            p245u.c.d(sbE2.toString());
        }
        if (iMin < i10) {
            p245u.c.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        androidx.compose.runtime.collection.c<C0971f<T>> cVar = pI.f10669a;
        int iA = F8.a.a(i10, cVar);
        int i12 = ((C0971f) cVar.f12943b[iA]).f10715a;
        while (i12 <= iMin) {
            C0971f<? extends LazyLayoutIntervalContent.Interval> c0971f = (C0971f) cVar.f12943b[iA];
            lVar.invoke(c0971f);
            i12 += c0971f.f10716b;
            iA++;
        }
        this.f10664a = h10;
    }

    public final Object a(int i10) {
        int i11 = i10 - this.f10666c;
        if (i11 >= 0) {
            Object[] objArr = this.f10665b;
            if (i11 <= kotlin.collections.k.S(objArr)) {
                return objArr[i11];
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0987w
    public final int e(Object obj) {
        androidx.collection.H h8 = this.f10664a;
        int iA = h8.a(obj);
        if (iA >= 0) {
            return h8.f9105c[iA];
        }
        return -1;
    }
}
