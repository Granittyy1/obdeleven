package androidx.compose.foundation.lazy.grid;

import androidx.collection.A;
import androidx.collection.C0882j;
import androidx.compose.foundation.lazy.layout.C0971f;
import androidx.compose.foundation.lazy.layout.InterfaceC0987w;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyGridState f10459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyGridIntervalContent f10460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NearestRangeKeyIndexMap f10461c;

    public i(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f10459a = lazyGridState;
        this.f10460b = lazyGridIntervalContent;
        this.f10461c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public final InterfaceC0987w a() {
        return this.f10461c;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int b() {
        return this.f10460b.i().f10670b;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object c(int i10) {
        Object objA = this.f10461c.a(i10);
        return objA == null ? this.f10460b.j(i10) : objA;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public final A d() {
        this.f10460b.getClass();
        return C0882j.f9185a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int e(Object obj) {
        return this.f10461c.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10460b, ((i) obj).f10460b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object f(int i10) {
        return this.f10460b.h(i10);
    }

    public final int hashCode() {
        return this.f10460b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final void i(final int i10, InterfaceC1084f interfaceC1084f, Object obj) {
        interfaceC1084f.L(1493551140);
        LazyLayoutPinnableItemKt.a(obj, i10, this.f10459a.f10432q, androidx.compose.runtime.internal.a.b(726189336, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                int iIntValue = num.intValue();
                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                    LazyGridIntervalContent lazyGridIntervalContent = this.this$0.f10460b;
                    int i11 = i10;
                    C0971f<f> c0971fB = lazyGridIntervalContent.f10397b.b(i11);
                    ((f) c0971fB.f10717c).f10458d.invoke(k.f10462a, Integer.valueOf(i11 - c0971fB.f10715a), interfaceC1084f3, 6);
                } else {
                    interfaceC1084f3.w();
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 3072);
        interfaceC1084f.D();
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public final LazyGridSpanLayoutProvider j() {
        return this.f10460b.f10396a;
    }
}
