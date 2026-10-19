package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 implements InterfaceC1791c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzja.a f25401a;

    public B2(zzja.a aVar) {
        Charset charset = Q2.f25563a;
        if (aVar == null) {
            throw new NullPointerException("output");
        }
        this.f25401a = aVar;
        aVar.f26053c = this;
    }

    public final void a(float f10, int i10) throws IOException {
        zzja.a aVar = this.f25401a;
        aVar.getClass();
        aVar.L0(i10, Float.floatToRawIntBits(f10));
    }

    public final void b(int i10, double d10) throws IOException {
        zzja.a aVar = this.f25401a;
        aVar.getClass();
        aVar.J0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void c(int i10, int i11) throws IOException {
        this.f25401a.N0(i10, i11);
    }

    public final void d(int i10, long j) throws IOException {
        this.f25401a.J0(i10, j);
    }

    public final void e(int i10, zzij zzijVar) throws IOException {
        this.f25401a.H0(i10, zzijVar);
    }

    public final void f(int i10, Object obj, E3 e10) throws IOException {
        zzja.a aVar = this.f25401a;
        aVar.R0(i10, 3);
        e10.e((InterfaceC1894r3) obj, aVar.f26053c);
        aVar.R0(i10, 4);
    }

    public final void g(int i10, boolean z10) throws IOException {
        this.f25401a.G0(i10, z10);
    }

    public final void h(int i10, int i11) throws IOException {
        this.f25401a.L0(i10, i11);
    }

    public final void i(int i10, long j) throws IOException {
        this.f25401a.O0(i10, j);
    }

    public final void j(int i10, Object obj, E3 e10) throws IOException {
        InterfaceC1894r3 interfaceC1894r3 = (InterfaceC1894r3) obj;
        zzja.a aVar = this.f25401a;
        aVar.R0(i10, 2);
        aVar.S0(((AbstractC1887q2) interfaceC1894r3).f(e10));
        e10.e(interfaceC1894r3, aVar.f26053c);
    }

    public final void k(int i10, int i11) throws IOException {
        this.f25401a.N0(i10, i11);
    }

    public final void l(int i10, long j) throws IOException {
        this.f25401a.J0(i10, j);
    }

    public final void m(int i10, int i11) throws IOException {
        this.f25401a.L0(i10, i11);
    }

    public final void n(int i10, long j) throws IOException {
        this.f25401a.O0(i10, (j >> 63) ^ (j << 1));
    }

    public final void o(int i10, int i11) throws IOException {
        this.f25401a.T0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j) throws IOException {
        this.f25401a.O0(i10, j);
    }

    public final void q(int i10, int i11) throws IOException {
        this.f25401a.T0(i10, i11);
    }
}
