package androidx.compose.foundation.lazy;

import androidx.collection.A;
import androidx.collection.C0882j;
import androidx.compose.foundation.lazy.layout.C0971f;
import androidx.compose.foundation.lazy.layout.InterfaceC0987w;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyListState f10538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyListIntervalContent f10539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NearestRangeKeyIndexMap f10541d;

    public i(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, c cVar, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f10538a = lazyListState;
        this.f10539b = lazyListIntervalContent;
        this.f10540c = cVar;
        this.f10541d = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.h
    public final InterfaceC0987w a() {
        return this.f10541d;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int b() {
        return this.f10539b.i().f10670b;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object c(int i10) {
        Object objA = this.f10541d.a(i10);
        return objA == null ? this.f10539b.j(i10) : objA;
    }

    @Override // androidx.compose.foundation.lazy.h
    public final A d() {
        this.f10539b.getClass();
        return C0882j.f9185a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final int e(Object obj) {
        return this.f10541d.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10539b, ((i) obj).f10539b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final Object f(int i10) {
        return this.f10539b.h(i10);
    }

    @Override // androidx.compose.foundation.lazy.h
    public final c h() {
        return this.f10540c;
    }

    public final int hashCode() {
        return this.f10539b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0985u
    public final void i(final int i10, InterfaceC1084f interfaceC1084f, Object obj) {
        interfaceC1084f.L(-462424778);
        LazyLayoutPinnableItemKt.a(obj, i10, this.f10538a.f10366q, androidx.compose.runtime.internal.a.b(-824725566, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                int iIntValue = num.intValue();
                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i iVar = this.this$0;
                    LazyListIntervalContent lazyListIntervalContent = iVar.f10539b;
                    int i11 = i10;
                    C0971f<f> c0971fB = lazyListIntervalContent.f10347a.b(i11);
                    ((f) c0971fB.f10717c).f10394c.invoke(iVar.f10540c, Integer.valueOf(i11 - c0971fB.f10715a), interfaceC1084f3, 0);
                } else {
                    interfaceC1084f3.w();
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 3072);
        interfaceC1084f.D();
    }
}
