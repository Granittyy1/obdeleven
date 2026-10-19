package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C0971f;
import androidx.compose.foundation.lazy.layout.InterfaceC0987w;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f10818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f10819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NearestRangeKeyIndexMap f10820c;

    public g(LazyStaggeredGridState lazyStaggeredGridState, d dVar, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f10818a = lazyStaggeredGridState;
        this.f10819b = dVar;
        this.f10820c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.f
    public final InterfaceC0987w a() {
        return this.f10820c;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int b() {
        return this.f10819b.i().f10670b;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object c(int i10) {
        Object objA = this.f10820c.a(i10);
        return objA == null ? this.f10819b.j(i10) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int e(Object obj) {
        return this.f10820c.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10819b, ((g) obj).f10819b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object f(int i10) {
        return this.f10819b.h(i10);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.f
    public final W4.b g() {
        return this.f10819b.f10817b;
    }

    public final int hashCode() {
        return this.f10819b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final void i(final int i10, InterfaceC1084f interfaceC1084f, Object obj) {
        interfaceC1084f.L(89098518);
        LazyLayoutPinnableItemKt.a(obj, i10, this.f10818a.f10806s, androidx.compose.runtime.internal.a.b(608834466, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                int iIntValue = num.intValue();
                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVar = this.this$0.f10819b;
                    int i11 = i10;
                    C0971f<c> c0971fB = dVar.f10816a.b(i11);
                    ((c) c0971fB.f10717c).f10815b.invoke(i.f10821a, Integer.valueOf(i11 - c0971fB.f10715a), interfaceC1084f3, 6);
                } else {
                    interfaceC1084f3.w();
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 3072);
        interfaceC1084f.D();
    }
}
