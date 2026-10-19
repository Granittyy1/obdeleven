package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0<T, B> {
    public abstract void a(int i10, int i11, Object obj);

    public abstract void b(int i10, long j, Object obj);

    public abstract void c(B b10, int i10, T t8);

    public abstract void d(B b10, int i10, ByteString byteString);

    public abstract void e(int i10, long j, Object obj);

    public abstract d0 f(Object obj);

    public abstract d0 g(Object obj);

    public abstract int h(T t8);

    public abstract int i(T t8);

    public abstract void j(Object obj);

    public abstract d0 k(Object obj, Object obj2);

    public final boolean l(Object obj, C2067i c2067i) throws IOException {
        int i10 = c2067i.f29176b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            c2067i.w(0);
            e(i11, c2067i.f29175a.o(), obj);
            return true;
        }
        if (i12 == 1) {
            c2067i.w(1);
            b(i11, c2067i.f29175a.l(), obj);
            return true;
        }
        if (i12 == 2) {
            d(obj, i11, c2067i.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            c2067i.w(5);
            a(i11, c2067i.f29175a.k(), obj);
            return true;
        }
        d0 d0VarM = m();
        int i13 = (i11 << 3) | 4;
        while (c2067i.a() != Integer.MAX_VALUE && l(d0VarM, c2067i)) {
        }
        if (i13 != c2067i.f29176b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(obj, i11, p(d0VarM));
        return true;
    }

    public abstract d0 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t8);

    public abstract d0 p(Object obj);

    public abstract void q(T t8, h0 h0Var) throws IOException;

    public abstract void r(T t8, h0 h0Var) throws IOException;
}
