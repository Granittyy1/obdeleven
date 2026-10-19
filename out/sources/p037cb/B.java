package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC1544p0<Float, float[], A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f22536c = new B(C.f22538a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        i.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        A builder = (A) obj;
        i.e(builder, "builder");
        float fV = aVar.v(this.f22644b, i10);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f22530a;
        int i11 = builder.f22531b;
        builder.f22531b = i11 + 1;
        fArr[i11] = fV;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        i.e(fArr, "<this>");
        A a10 = new A();
        a10.f22530a = fArr;
        a10.f22531b = fArr.length;
        a10.b(10);
        return a10;
    }

    @Override // p037cb.AbstractC1544p0
    public final float[] j() {
        return new float[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, float[] fArr, int i10) {
        float[] content = fArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.t(this.f22644b, i11, content[i11]);
        }
    }
}
