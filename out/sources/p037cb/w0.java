package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends AbstractC1544p0<Short, short[], v0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f22670c = new w0(x0.f22673a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        i.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        v0 builder = (v0) obj;
        i.e(builder, "builder");
        short sB = aVar.B(this.f22644b, i10);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f22665a;
        int i11 = builder.f22666b;
        builder.f22666b = i11 + 1;
        sArr[i11] = sB;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        i.e(sArr, "<this>");
        v0 v0Var = new v0();
        v0Var.f22665a = sArr;
        v0Var.f22666b = sArr.length;
        v0Var.b(10);
        return v0Var;
    }

    @Override // p037cb.AbstractC1544p0
    public final short[] j() {
        return new short[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, short[] sArr, int i10) {
        short[] content = sArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.B(this.f22644b, i11, content[i11]);
        }
    }
}
