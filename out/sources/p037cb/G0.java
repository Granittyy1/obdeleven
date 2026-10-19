package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;
import p293xa.k;
import p293xa.l;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends AbstractC1544p0<k, l, F0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G0 f22551c = new G0(H0.f22553a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        int[] collectionSize = ((l) obj).f47927b;
        i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        F0 builder = (F0) obj;
        i.e(builder, "builder");
        int iK = aVar.G(this.f22644b, i10).k();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f22547a;
        int i11 = builder.f22548b;
        builder.f22548b = i11 + 1;
        iArr[i11] = iK;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        int[] toBuilder = ((l) obj).f47927b;
        i.e(toBuilder, "$this$toBuilder");
        F0 f10 = new F0();
        f10.f22547a = toBuilder;
        f10.f22548b = toBuilder.length;
        f10.b(10);
        return f10;
    }

    @Override // p037cb.AbstractC1544p0
    public final l j() {
        return new l(new int[0]);
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, l lVar, int i10) {
        int[] iArr = lVar.f47927b;
        i.e(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.d(this.f22644b, i11).x(iArr[i11]);
        }
    }
}
