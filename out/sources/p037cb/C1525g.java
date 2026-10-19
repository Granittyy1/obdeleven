package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: renamed from: cb.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1525g extends AbstractC1544p0<Boolean, boolean[], C1523f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1525g f22610c = new C1525g(C1527h.f22612a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        C1523f builder = (C1523f) obj;
        i.e(builder, "builder");
        boolean zL = aVar.l(this.f22644b, i10);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f22606a;
        int i11 = builder.f22607b;
        builder.f22607b = i11 + 1;
        zArr[i11] = zL;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(zArr, "<this>");
        C1523f c1523f = new C1523f();
        c1523f.f22606a = zArr;
        c1523f.f22607b = zArr.length;
        c1523f.b(10);
        return c1523f;
    }

    @Override // p037cb.AbstractC1544p0
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, boolean[] zArr, int i10) {
        boolean[] content = zArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(this.f22644b, i11, content[i11]);
        }
    }
}
