package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1320j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f17260a;

    public C1320j(CodedOutputStream codedOutputStream) {
        C1330u.a(codedOutputStream, "output");
        this.f17260a = codedOutputStream;
        codedOutputStream.f17103a = this;
    }

    public final void a(int i10, boolean z10) throws IOException {
        this.f17260a.B(i10, z10);
    }

    public final void b(int i10, ByteString byteString) throws IOException {
        this.f17260a.D(i10, byteString);
    }

    public final void c(int i10, double d10) throws IOException {
        CodedOutputStream codedOutputStream = this.f17260a;
        codedOutputStream.getClass();
        codedOutputStream.H(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) throws IOException {
        this.f17260a.J(i10, i11);
    }

    public final void e(int i10, int i11) throws IOException {
        this.f17260a.F(i10, i11);
    }

    public final void f(int i10, long j) throws IOException {
        this.f17260a.H(i10, j);
    }

    public final void g(float f10, int i10) throws IOException {
        CodedOutputStream codedOutputStream = this.f17260a;
        codedOutputStream.getClass();
        codedOutputStream.F(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, Object obj, X x10) throws IOException {
        CodedOutputStream codedOutputStream = this.f17260a;
        codedOutputStream.R(i10, 3);
        x10.i((I) obj, codedOutputStream.f17103a);
        codedOutputStream.R(i10, 4);
    }

    public final void i(int i10, int i11) throws IOException {
        this.f17260a.J(i10, i11);
    }

    public final void j(int i10, long j) throws IOException {
        this.f17260a.U(i10, j);
    }

    public final void k(int i10, Object obj, X x10) throws IOException {
        this.f17260a.L(i10, (I) obj, x10);
    }

    public final void l(int i10, int i11) throws IOException {
        this.f17260a.F(i10, i11);
    }

    public final void m(int i10, long j) throws IOException {
        this.f17260a.H(i10, j);
    }

    public final void n(int i10, int i11) throws IOException {
        this.f17260a.S(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void o(int i10, long j) throws IOException {
        this.f17260a.U(i10, (j >> 63) ^ (j << 1));
    }

    public final void p(int i10, int i11) throws IOException {
        this.f17260a.S(i10, i11);
    }

    public final void q(int i10, long j) throws IOException {
        this.f17260a.U(i10, j);
    }
}
