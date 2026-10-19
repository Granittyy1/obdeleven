package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;
import p293xa.m;
import p293xa.n;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends AbstractC1544p0<m, n, I0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J0 f22561c = new J0(K0.f22562a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        long[] collectionSize = ((n) obj).f47931b;
        i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        I0 builder = (I0) obj;
        i.e(builder, "builder");
        long jS = aVar.G(this.f22644b, i10).s();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f22557a;
        int i11 = builder.f22558b;
        builder.f22558b = i11 + 1;
        jArr[i11] = jS;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        long[] toBuilder = ((n) obj).f47931b;
        i.e(toBuilder, "$this$toBuilder");
        I0 i10 = new I0();
        i10.f22557a = toBuilder;
        i10.f22558b = toBuilder.length;
        i10.b(10);
        return i10;
    }

    @Override // p037cb.AbstractC1544p0
    public final n j() {
        return new n(new long[0]);
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, n nVar, int i10) {
        long[] jArr = nVar.f47931b;
        i.e(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.d(this.f22644b, i11).A(jArr[i11]);
        }
    }
}
