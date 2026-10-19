package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2068j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f29179a;

    public C2068j(CodedOutputStream codedOutputStream) {
        C2078u.a(codedOutputStream, "output");
        this.f29179a = codedOutputStream;
        codedOutputStream.f29014a = this;
    }

    public final void a(int i10, boolean z10) throws IOException {
        this.f29179a.B(i10, z10);
    }

    public final void b(int i10, ByteString byteString) throws IOException {
        this.f29179a.D(i10, byteString);
    }

    public final void c(int i10, double d10) throws IOException {
        CodedOutputStream codedOutputStream = this.f29179a;
        codedOutputStream.getClass();
        codedOutputStream.H(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) throws IOException {
        this.f29179a.J(i10, i11);
    }

    public final void e(int i10, int i11) throws IOException {
        this.f29179a.F(i10, i11);
    }

    public final void f(int i10, long j) throws IOException {
        this.f29179a.H(i10, j);
    }

    public final void g(float f10, int i10) throws IOException {
        CodedOutputStream codedOutputStream = this.f29179a;
        codedOutputStream.getClass();
        codedOutputStream.F(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, Object obj, X x10) throws IOException {
        CodedOutputStream codedOutputStream = this.f29179a;
        codedOutputStream.R(i10, 3);
        x10.f((J) obj, codedOutputStream.f29014a);
        codedOutputStream.R(i10, 4);
    }

    public final void i(int i10, int i11) throws IOException {
        this.f29179a.J(i10, i11);
    }

    public final void j(int i10, long j) throws IOException {
        this.f29179a.U(i10, j);
    }

    public final void k(int i10, Object obj, X x10) throws IOException {
        this.f29179a.L(i10, (J) obj, x10);
    }

    public final void l(int i10, int i11) throws IOException {
        this.f29179a.F(i10, i11);
    }

    public final void m(int i10, long j) throws IOException {
        this.f29179a.H(i10, j);
    }

    public final void n(int i10, int i11) throws IOException {
        this.f29179a.S(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void o(int i10, long j) throws IOException {
        this.f29179a.U(i10, (j >> 63) ^ (j << 1));
    }

    public final void p(int i10, int i11) throws IOException {
        this.f29179a.S(i10, i11);
    }

    public final void q(int i10, long j) throws IOException {
        this.f29179a.U(i10, j);
    }
}
