package androidx.compose.runtime;

import androidx.collection.ObjectList;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f12921a;

    public S(A0 a10) {
        this.f12921a = a10;
    }

    public static final void a(D0 d10, int i10) {
        while (d10.f12819v >= 0 && d10.f12818u <= i10) {
            d10.L();
            d10.i();
        }
    }

    public final androidx.collection.K b(InterfaceC1078c interfaceC1078c, ObjectList objectList) {
        A0 a10;
        int i10;
        int i11 = 1;
        int i12 = 1;
        int i13 = 1;
        int i14 = 1;
        int i15 = 1;
        int i16 = 1;
        int i17 = 1;
        int i18 = 1;
        boolean z10 = true;
        Object[] objArr = objectList.f9108a;
        int i19 = objectList.f9109b;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z11 = false;
        int i24 = 0;
        while (true) {
            a10 = this.f12921a;
            if (i24 >= i19) {
                break;
            }
            if (!a10.A(((T) objArr[i24]).f12928e)) {
                androidx.collection.I i25 = new androidx.collection.I((Object) null);
                Object[] objArr2 = objectList.f9108a;
                int i26 = objectList.f9109b;
                for (int i27 = i20; i27 < i26; i27 += i13) {
                    Object obj = objArr2[i27];
                    if (a10.A(((T) obj).f12928e)) {
                        i25.g(obj);
                    }
                }
                objectList = i25;
                break;
            }
            i24 += i12;
        }
        Ia.l<T, Integer> lVar = new Ia.l<T, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // Ia.l
            public final Integer invoke(T t8) {
                return Integer.valueOf(this.this$0.f12921a.e(t8.f12928e));
            }
        };
        if (objectList.f9109b > i11) {
            Comparable comparable = (Comparable) lVar.invoke(objectList.b(i22));
            int i28 = objectList.f9109b;
            int i29 = i17;
            while (i29 < i28) {
                Comparable comparable2 = (Comparable) lVar.invoke(objectList.b(i29));
                if (comparable.compareTo(comparable2) > 0) {
                    androidx.collection.I i30 = new androidx.collection.I(objectList.f9109b);
                    Object[] objArr3 = objectList.f9108a;
                    int i31 = objectList.f9109b;
                    for (int i32 = i21; i32 < i31; i32 += i15) {
                        i30.g(objArr3[i32]);
                    }
                    androidx.collection.I.b bVar = i30.f9078c;
                    if (bVar == null) {
                        bVar = new androidx.collection.I.b(i30);
                        i30.f9078c = bVar;
                    }
                    if (bVar.f9081b.f9109b > i16) {
                        kotlin.collections.p.G(bVar, new androidx.compose.runtime.collection.a(lVar));
                    }
                    objectList = i30;
                    break;
                }
                i29 += i14;
                comparable = comparable2;
            }
        }
        if (objectList.d()) {
            androidx.collection.K k10 = androidx.collection.U.f9133b;
            kotlin.jvm.internal.i.c(k10, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            return k10;
        }
        androidx.collection.K kB = androidx.collection.U.b();
        D0 d0V = a10.v();
        try {
            Object[] objArr4 = objectList.f9108a;
            int i33 = objectList.f9109b;
            for (int i34 = i23; i34 < i33; i34 += i18) {
                T t8 = (T) objArr4[i34];
                int iC = d0V.c(t8.f12928e);
                int iE = d0V.E(d0V.f12800b, iC);
                a(d0V, iE);
                a(d0V, iE);
                while (true) {
                    i10 = d0V.f12817t;
                    if (i10 == iE || i10 == d0V.f12818u) {
                        break;
                        break;
                    }
                    if (iE < d0V.s(i10) + i10) {
                        d0V.Q();
                    } else {
                        d0V.K();
                    }
                }
                if (i10 != iE) {
                    C1090i.c("Unexpected slot table structure");
                }
                d0V.Q();
                d0V.a(iC - d0V.f12817t);
                kB.l(t8, C1090i.f(t8.f12926c, t8, d0V, interfaceC1078c));
            }
            a(d0V, BrazeLogger.SUPPRESS);
            p293xa.r rVar = p293xa.r.f47939a;
            return kB;
        } finally {
            d0V.e(z11);
        }
    }
}
