package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends c0<d0, d0> {
    @Override // com.google.protobuf.c0
    public final void a(int i10, int i11, Object obj) {
        ((d0) obj).c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.c0
    public final void b(int i10, long j, Object obj) {
        ((d0) obj).c((i10 << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.protobuf.c0
    public final void c(d0 d0Var, int i10, d0 d0Var2) {
        d0Var.c((i10 << 3) | 3, d0Var2);
    }

    @Override // com.google.protobuf.c0
    public final void d(d0 d0Var, int i10, ByteString byteString) {
        d0Var.c((i10 << 3) | 2, byteString);
    }

    @Override // com.google.protobuf.c0
    public final void e(int i10, long j, Object obj) {
        ((d0) obj).c(i10 << 3, Long.valueOf(j));
    }

    @Override // com.google.protobuf.c0
    public final d0 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        d0 d0Var = generatedMessageLite.unknownFields;
        if (d0Var != d0.f29137f) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        generatedMessageLite.unknownFields = d0Var2;
        return d0Var2;
    }

    @Override // com.google.protobuf.c0
    public final d0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.c0
    public final int h(d0 d0Var) {
        return d0Var.b();
    }

    @Override // com.google.protobuf.c0
    public final int i(d0 d0Var) {
        d0 d0Var2 = d0Var;
        int i10 = d0Var2.f29141d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < d0Var2.f29138a; i11++) {
            int i12 = d0Var2.f29139b[i11] >>> 3;
            iC += CodedOutputStream.c(3, (ByteString) d0Var2.f29140c[i11]) + CodedOutputStream.v(2, i12) + (CodedOutputStream.u(1) * 2);
        }
        d0Var2.f29141d = iC;
        return iC;
    }

    @Override // com.google.protobuf.c0
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f29142e = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.protobuf.c0
    public final d0 k(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        d0 d0Var2 = (d0) obj2;
        d0 d0Var3 = d0.f29137f;
        if (d0Var3.equals(d0Var2)) {
            return d0Var;
        }
        if (d0Var3.equals(d0Var)) {
            int i10 = d0Var.f29138a + d0Var2.f29138a;
            int[] iArrCopyOf = Arrays.copyOf(d0Var.f29139b, i10);
            System.arraycopy(d0Var2.f29139b, 0, iArrCopyOf, d0Var.f29138a, d0Var2.f29138a);
            Object[] objArrCopyOf = Arrays.copyOf(d0Var.f29140c, i10);
            System.arraycopy(d0Var2.f29140c, 0, objArrCopyOf, d0Var.f29138a, d0Var2.f29138a);
            return new d0(i10, iArrCopyOf, objArrCopyOf, true);
        }
        d0Var.getClass();
        if (d0Var2.equals(d0Var3)) {
            return d0Var;
        }
        if (!d0Var.f29142e) {
            throw new UnsupportedOperationException();
        }
        int i11 = d0Var.f29138a + d0Var2.f29138a;
        d0Var.a(i11);
        System.arraycopy(d0Var2.f29139b, 0, d0Var.f29139b, d0Var.f29138a, d0Var2.f29138a);
        System.arraycopy(d0Var2.f29140c, 0, d0Var.f29140c, d0Var.f29138a, d0Var2.f29138a);
        d0Var.f29138a = i11;
        return d0Var;
    }

    @Override // com.google.protobuf.c0
    public final d0 m() {
        return new d0();
    }

    @Override // com.google.protobuf.c0
    public final void n(Object obj, d0 d0Var) {
        ((GeneratedMessageLite) obj).unknownFields = d0Var;
    }

    @Override // com.google.protobuf.c0
    public final void o(Object obj, d0 d0Var) {
        ((GeneratedMessageLite) obj).unknownFields = d0Var;
    }

    @Override // com.google.protobuf.c0
    public final d0 p(Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.f29142e = false;
        return d0Var;
    }

    @Override // com.google.protobuf.c0
    public final void q(d0 d0Var, h0 h0Var) throws IOException {
        d0 d0Var2 = d0Var;
        d0Var2.getClass();
        h0Var.getClass();
        for (int i10 = 0; i10 < d0Var2.f29138a; i10++) {
            int i11 = d0Var2.f29139b[i10] >>> 3;
            Object obj = d0Var2.f29140c[i10];
            C2068j c2068j = (C2068j) h0Var;
            c2068j.getClass();
            boolean z10 = obj instanceof ByteString;
            CodedOutputStream codedOutputStream = c2068j.f29179a;
            if (z10) {
                codedOutputStream.O(i11, (ByteString) obj);
            } else {
                codedOutputStream.N(i11, (J) obj);
            }
        }
    }

    @Override // com.google.protobuf.c0
    public final void r(d0 d0Var, h0 h0Var) throws IOException {
        d0Var.d(h0Var);
    }
}
