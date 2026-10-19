package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0<d0, d0> {
    @Override // androidx.datastore.preferences.protobuf.c0
    public final void a(int i10, int i11, Object obj) {
        ((d0) obj).b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void b(int i10, long j, Object obj) {
        ((d0) obj).b((i10 << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void c(d0 d0Var, int i10, d0 d0Var2) {
        d0Var.b((i10 << 3) | 3, d0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void d(d0 d0Var, int i10, ByteString byteString) {
        d0Var.b((i10 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void e(int i10, long j, Object obj) {
        ((d0) obj).b(i10 << 3, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final d0 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        d0 d0Var = generatedMessageLite.unknownFields;
        if (d0Var != d0.f17217f) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        generatedMessageLite.unknownFields = d0Var2;
        return d0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final d0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int h(d0 d0Var) {
        return d0Var.a();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int i(d0 d0Var) {
        d0 d0Var2 = d0Var;
        int i10 = d0Var2.f17221d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < d0Var2.f17218a; i11++) {
            int i12 = d0Var2.f17219b[i11] >>> 3;
            iC += CodedOutputStream.c(3, (ByteString) d0Var2.f17220c[i11]) + CodedOutputStream.v(2, i12) + (CodedOutputStream.u(1) * 2);
        }
        d0Var2.f17221d = iC;
        return iC;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f17222e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final d0 k(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        d0 d0Var2 = (d0) obj2;
        if (d0Var2.equals(d0.f17217f)) {
            return d0Var;
        }
        int i10 = d0Var.f17218a + d0Var2.f17218a;
        int[] iArrCopyOf = Arrays.copyOf(d0Var.f17219b, i10);
        System.arraycopy(d0Var2.f17219b, 0, iArrCopyOf, d0Var.f17218a, d0Var2.f17218a);
        Object[] objArrCopyOf = Arrays.copyOf(d0Var.f17220c, i10);
        System.arraycopy(d0Var2.f17220c, 0, objArrCopyOf, d0Var.f17218a, d0Var2.f17218a);
        return new d0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final d0 m() {
        return new d0();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void n(Object obj, d0 d0Var) {
        ((GeneratedMessageLite) obj).unknownFields = d0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void o(GeneratedMessageLite generatedMessageLite, Object obj) {
        generatedMessageLite.unknownFields = (d0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final d0 p(Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.f17222e = false;
        return d0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void q(d0 d0Var, h0 h0Var) throws IOException {
        d0 d0Var2 = d0Var;
        d0Var2.getClass();
        h0Var.getClass();
        for (int i10 = 0; i10 < d0Var2.f17218a; i10++) {
            int i11 = d0Var2.f17219b[i10] >>> 3;
            Object obj = d0Var2.f17220c[i10];
            C1320j c1320j = (C1320j) h0Var;
            c1320j.getClass();
            boolean z10 = obj instanceof ByteString;
            CodedOutputStream codedOutputStream = c1320j.f17260a;
            if (z10) {
                codedOutputStream.O(i11, (ByteString) obj);
            } else {
                codedOutputStream.N(i11, (I) obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void r(d0 d0Var, h0 h0Var) throws IOException {
        d0Var.c(h0Var);
    }
}
