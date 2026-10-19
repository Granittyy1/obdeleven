package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
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

    public final boolean l(B b10, W w3) throws IOException {
        int iA = w3.a();
        int i10 = iA >>> 3;
        int i11 = iA & 7;
        if (i11 == 0) {
            e(i10, w3.K(), b10);
            return true;
        }
        if (i11 == 1) {
            b(i10, w3.e(), b10);
            return true;
        }
        if (i11 == 2) {
            d(b10, i10, w3.B());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            a(i10, w3.i(), b10);
            return true;
        }
        d0 d0VarM = m();
        int i12 = (i10 << 3) | 4;
        while (w3.y() != Integer.MAX_VALUE && l(d0VarM, w3)) {
        }
        if (i12 != w3.a()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(b10, i10, p(d0VarM));
        return true;
    }

    public abstract d0 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(GeneratedMessageLite generatedMessageLite, Object obj);

    public abstract d0 p(Object obj);

    public abstract void q(T t8, h0 h0Var) throws IOException;

    public abstract void r(T t8, h0 h0Var) throws IOException;
}
