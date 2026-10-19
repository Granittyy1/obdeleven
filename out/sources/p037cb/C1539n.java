package p037cb;

import kotlin.jvm.internal.i;
import p024bb.a;
import p024bb.b;

/* JADX INFO: renamed from: cb.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1539n extends AbstractC1544p0<Character, char[], C1537m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1539n f22639c = new C1539n(C1541o.f22640a);

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        i.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // p037cb.AbstractC1543p, p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        C1537m builder = (C1537m) obj;
        i.e(builder, "builder");
        char cU = aVar.u(this.f22644b, i10);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f22636a;
        int i11 = builder.f22637b;
        builder.f22637b = i11 + 1;
        cArr[i11] = cU;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        i.e(cArr, "<this>");
        C1537m c1537m = new C1537m();
        c1537m.f22636a = cArr;
        c1537m.f22637b = cArr.length;
        c1537m.b(10);
        return c1537m;
    }

    @Override // p037cb.AbstractC1544p0
    public final char[] j() {
        return new char[0];
    }

    @Override // p037cb.AbstractC1544p0
    public final void k(b encoder, char[] cArr, int i10) {
        char[] content = cArr;
        i.e(encoder, "encoder");
        i.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.y(this.f22644b, i11, content[i11]);
        }
    }
}
