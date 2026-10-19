package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: renamed from: cb.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1531j extends AbstractC1544p0<Byte, byte[], C1529i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1531j f22619c = new C1531j(C1533k.f22622a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        i.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        C1529i builder = (C1529i) obj;
        i.e(builder, "builder");
        byte bF = aVar.F(this.f22644b, i10);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f22615a;
        int i11 = builder.f22616b;
        builder.f22616b = i11 + 1;
        bArr[i11] = bF;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        i.e(bArr, "<this>");
        C1529i c1529i = new C1529i();
        c1529i.f22615a = bArr;
        c1529i.f22616b = bArr.length;
        c1529i.b(10);
        return c1529i;
    }

    @Override // p037cb.AbstractC1544p0
    public final byte[] j() {
        return new byte[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, byte[] bArr, int i10) {
        byte[] content = bArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.w(this.f22644b, i11, content[i11]);
        }
    }
}
