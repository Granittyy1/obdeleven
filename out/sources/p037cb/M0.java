package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;
import p293xa.p;
import p293xa.q;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends AbstractC1544p0<p, q, L0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M0 f22567c = new M0(N0.f22569a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        short[] collectionSize = ((q) obj).f47936b;
        i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        L0 builder = (L0) obj;
        i.e(builder, "builder");
        short sD = aVar.G(this.f22644b, i10).D();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f22565a;
        int i11 = builder.f22566b;
        builder.f22566b = i11 + 1;
        sArr[i11] = sD;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        short[] toBuilder = ((q) obj).f47936b;
        i.e(toBuilder, "$this$toBuilder");
        L0 l10 = new L0();
        l10.f22565a = toBuilder;
        l10.f22566b = toBuilder.length;
        l10.b(10);
        return l10;
    }

    @Override // p037cb.AbstractC1544p0
    public final q j() {
        return new q(new short[0]);
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, q qVar, int i10) {
        short[] sArr = qVar.f47936b;
        i.e(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.d(this.f22644b, i11).i(sArr[i11]);
        }
    }
}
