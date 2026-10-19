package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: renamed from: cb.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1546s extends AbstractC1544p0<Double, double[], r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1546s f22650c = new C1546s(C1547t.f22653a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        i.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        r builder = (r) obj;
        i.e(builder, "builder");
        double dX = aVar.x(this.f22644b, i10);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f22647a;
        int i11 = builder.f22648b;
        builder.f22648b = i11 + 1;
        dArr[i11] = dX;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        i.e(dArr, "<this>");
        r rVar = new r();
        rVar.f22647a = dArr;
        rVar.f22648b = dArr.length;
        rVar.b(10);
        return rVar;
    }

    @Override // p037cb.AbstractC1544p0
    public final double[] j() {
        return new double[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, double[] dArr, int i10) {
        double[] content = dArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.m(this.f22644b, i11, content[i11]);
        }
    }
}
