package p037cb;

import p024bb.a;
import p024bb.b;
import p293xa.i;
import p293xa.j;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends AbstractC1544p0<i, j, C0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D0 f22542c = new D0(E0.f22544a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        byte[] collectionSize = ((j) obj).f47923b;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        C0 builder = (C0) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        byte bC = aVar.G(this.f22644b, i10).C();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f22540a;
        int i11 = builder.f22541b;
        builder.f22541b = i11 + 1;
        bArr[i11] = bC;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        byte[] toBuilder = ((j) obj).f47923b;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        C0 c10 = new C0();
        c10.f22540a = toBuilder;
        c10.f22541b = toBuilder.length;
        c10.b(10);
        return c10;
    }

    @Override // p037cb.AbstractC1544p0
    public final j j() {
        return new j(new byte[0]);
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, j jVar, int i10) {
        byte[] bArr = jVar.f47923b;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.d(this.f22644b, i11).k(bArr[i11]);
        }
    }
}
