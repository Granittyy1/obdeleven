package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.C0971f;
import androidx.compose.foundation.lazy.layout.InterfaceC0985u;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0985u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerState f10981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NearestRangeKeyIndexMap f10983c;

    public k(PagerState pagerState, j jVar, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f10981a = pagerState;
        this.f10982b = jVar;
        this.f10983c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int b() {
        return this.f10982b.i().f10670b;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object c(int i10) {
        Object objA = this.f10983c.a(i10);
        return objA == null ? this.f10982b.j(i10) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int e(Object obj) {
        return this.f10983c.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10982b, ((k) obj).f10982b);
    }

    public final int hashCode() {
        return this.f10982b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final void i(final int i10, InterfaceC1084f interfaceC1084f, Object obj) {
        interfaceC1084f.L(-1201380429);
        LazyLayoutPinnableItemKt.a(obj, i10, this.f10981a.f10922A, androidx.compose.runtime.internal.a.b(1142237095, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                int iIntValue = num.intValue();
                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j jVar = this.this$0.f10982b;
                    int i11 = i10;
                    C0971f c0971fB = jVar.f10980c.b(i11);
                    int i12 = i11 - c0971fB.f10715a;
                    ((h) c0971fB.f10717c).f10977b.invoke(o.f11003a, Integer.valueOf(i12), interfaceC1084f3, 0);
                } else {
                    interfaceC1084f3.w();
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 3072);
        interfaceC1084f.D();
    }
}
