package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Q extends AbstractC1544p0<Long, long[], P> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f22578c = new Q(S.f22579a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        i.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        P builder = (P) obj;
        i.e(builder, "builder");
        long jA = aVar.A(this.f22644b, i10);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f22574a;
        int i11 = builder.f22575b;
        builder.f22575b = i11 + 1;
        jArr[i11] = jA;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        i.e(jArr, "<this>");
        P p10 = new P();
        p10.f22574a = jArr;
        p10.f22575b = jArr.length;
        p10.b(10);
        return p10;
    }

    @Override // p037cb.AbstractC1544p0
    public final long[] j() {
        return new long[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, long[] jArr, int i10) {
        long[] content = jArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.j(this.f22644b, i11, content[i11]);
        }
    }
}
