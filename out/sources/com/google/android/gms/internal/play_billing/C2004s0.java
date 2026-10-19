package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2004s0 implements F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1999q0 f26249a;

    public C2004s0(C1999q0 c1999q0) {
        Charset charset = O0.f26148a;
        this.f26249a = c1999q0;
        c1999q0.f26245b = this;
    }

    public final void a(int i10, int i11) throws IOException {
        this.f26249a.H(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j) throws IOException {
        this.f26249a.J(i10, (j >> 63) ^ (j + j));
    }

    public final void c(int i10, List list) throws IOException {
        boolean z10 = list instanceof T0;
        int i11 = 0;
        C1999q0 c1999q0 = this.f26249a;
        if (!z10) {
            while (i11 < list.size()) {
                c1999q0.F(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        T0 t8 = (T0) list;
        while (i11 < list.size()) {
            Object objA = t8.a();
            if (objA instanceof String) {
                c1999q0.F(i10, (String) objA);
            } else {
                c1999q0.y(i10, (zzei) objA);
            }
            i11++;
        }
    }

    public final void d(int i10, int i11) throws IOException {
        this.f26249a.H(i10, i11);
    }

    public final void e(int i10, long j) throws IOException {
        this.f26249a.J(i10, j);
    }

    public final void f(int i10, boolean z10) throws IOException {
        this.f26249a.x(i10, z10);
    }

    public final void g(int i10, zzei zzeiVar) throws IOException {
        this.f26249a.y(i10, zzeiVar);
    }

    public final void h(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f26249a.y(i10, (zzei) list.get(i11));
        }
    }

    public final void i(int i10, double d10) throws IOException {
        this.f26249a.B(i10, Double.doubleToRawLongBits(d10));
    }

    public final void j(int i10, int i11) throws IOException {
        this.f26249a.D(i10, i11);
    }

    public final void k(int i10, int i11) throws IOException {
        this.f26249a.z(i10, i11);
    }

    public final void l(int i10, long j) throws IOException {
        this.f26249a.B(i10, j);
    }

    public final void m(float f10, int i10) throws IOException {
        this.f26249a.z(i10, Float.floatToRawIntBits(f10));
    }

    public final void n(int i10, Object obj, InterfaceC1994o1 interfaceC1994o1) throws IOException {
        C1999q0 c1999q0 = this.f26249a;
        c1999q0.G(i10, 3);
        interfaceC1994o1.a((InterfaceC1967f1) obj, c1999q0.f26245b);
        c1999q0.G(i10, 4);
    }

    public final void o(int i10, int i11) throws IOException {
        this.f26249a.D(i10, i11);
    }

    public final void p(int i10, long j) throws IOException {
        this.f26249a.J(i10, j);
    }

    public final void q(int i10, Object obj, InterfaceC1994o1 interfaceC1994o1) throws IOException {
        InterfaceC1967f1 interfaceC1967f1 = (InterfaceC1967f1) obj;
        C1999q0 c1999q0 = this.f26249a;
        c1999q0.I((i10 << 3) | 2);
        c1999q0.I(((AbstractC1972h0) interfaceC1967f1).e(interfaceC1994o1));
        interfaceC1994o1.a(interfaceC1967f1, c1999q0.f26245b);
    }

    public final void r(int i10, int i11) throws IOException {
        this.f26249a.z(i10, i11);
    }

    public final void s(int i10, long j) throws IOException {
        this.f26249a.B(i10, j);
    }
}
