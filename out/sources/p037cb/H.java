package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC1544p0<Integer, int[], G> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f22552c = new H(I.f22555a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        i.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        G builder = (G) obj;
        i.e(builder, "builder");
        int iH = aVar.h(this.f22644b, i10);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f22549a;
        int i11 = builder.f22550b;
        builder.f22550b = i11 + 1;
        iArr[i11] = iH;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        i.e(iArr, "<this>");
        G g10 = new G();
        g10.f22549a = iArr;
        g10.f22550b = iArr.length;
        g10.b(10);
        return g10;
    }

    @Override // p037cb.AbstractC1544p0
    public final int[] j() {
        return new int[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, int[] iArr, int i10) {
        int[] content = iArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.g(i11, content[i11], this.f22644b);
        }
    }
}
