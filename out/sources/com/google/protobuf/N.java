package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N<T> implements X<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f29078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0<?, ?> f29079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2072n<?> f29081d;

    public N(c0<?, ?> c0Var, AbstractC2072n<?> abstractC2072n, J j) {
        this.f29079b = c0Var;
        this.f29080c = abstractC2072n.e(j);
        this.f29081d = abstractC2072n;
        this.f29078a = j;
    }

    @Override // com.google.protobuf.X
    public final void a(T t8, T t10) {
        Class<?> cls = Y.f29112a;
        c0<?, ?> c0Var = this.f29079b;
        c0Var.o(t8, c0Var.k(c0Var.g(t8), c0Var.g(t10)));
        if (this.f29080c) {
            Y.B(this.f29081d, t8, t10);
        }
    }

    @Override // com.google.protobuf.X
    public final void b(T t8) {
        this.f29079b.j(t8);
        this.f29081d.f(t8);
    }

    @Override // com.google.protobuf.X
    public final boolean c(T t8) {
        this.f29081d.c(t8).g();
        return true;
    }

    @Override // com.google.protobuf.X
    public final T d() {
        J j = this.f29078a;
        return j instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) j).E() : (T) j.o().q();
    }

    @Override // com.google.protobuf.X
    public final void e(Object obj, C2067i c2067i, C2071m c2071m) throws IOException {
        c0<?, ?> c0Var = this.f29079b;
        d0 d0VarF = c0Var.f(obj);
        AbstractC2072n<?> abstractC2072n = this.f29081d;
        C2075q<T> c2075qD = abstractC2072n.d(obj);
        while (c2067i.a() != Integer.MAX_VALUE && j(c2067i, c2071m, abstractC2072n, c2075qD, c0Var, d0VarF)) {
            try {
            } finally {
                c0Var.n(obj, d0VarF);
            }
        }
    }

    @Override // com.google.protobuf.X
    public final void f(T t8, h0 h0Var) throws IOException {
        Iterator itI = this.f29081d.c(t8).i();
        if (itI.hasNext()) {
            ((C2075q.a) ((Map.Entry) itI.next()).getKey()).A();
            throw null;
        }
        c0<?, ?> c0Var = this.f29079b;
        c0Var.q(c0Var.g(t8), h0Var);
    }

    @Override // com.google.protobuf.X
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f29079b.g(generatedMessageLite).hashCode();
        return this.f29080c ? (iHashCode * 53) + this.f29081d.c(generatedMessageLite).f29191a.hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.X
    public final boolean h(GeneratedMessageLite generatedMessageLite, Object obj) {
        c0<?, ?> c0Var = this.f29079b;
        if (!c0Var.g(generatedMessageLite).equals(c0Var.g(obj))) {
            return false;
        }
        if (!this.f29080c) {
            return true;
        }
        AbstractC2072n<?> abstractC2072n = this.f29081d;
        return abstractC2072n.c(generatedMessageLite).equals(abstractC2072n.c(obj));
    }

    @Override // com.google.protobuf.X
    public final int i(AbstractC2059a abstractC2059a) {
        c0<?, ?> c0Var = this.f29079b;
        int i10 = c0Var.i(c0Var.g(abstractC2059a));
        if (this.f29080c) {
            Z z10 = this.f29081d.c(abstractC2059a).f29191a;
            if (z10.f29118c.size() > 0) {
                C2075q.d(z10.c(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
            if (it.hasNext()) {
                C2075q.d(it.next());
                throw null;
            }
        }
        return i10;
    }

    public final boolean j(C2067i c2067i, C2071m c2071m, AbstractC2072n abstractC2072n, C2075q c2075q, c0 c0Var, Object obj) throws IOException {
        int i10 = c2067i.f29176b;
        J j = this.f29078a;
        if (i10 != 11) {
            if ((i10 & 7) != 2) {
                return c2067i.x();
            }
            GeneratedMessageLite.e eVarB = abstractC2072n.b(c2071m, j, i10 >>> 3);
            if (eVarB == null) {
                return c0Var.l(obj, c2067i);
            }
            abstractC2072n.h(eVarB);
            throw null;
        }
        int iW = 0;
        GeneratedMessageLite.e eVarB2 = null;
        ByteString byteStringE = null;
        while (c2067i.a() != Integer.MAX_VALUE) {
            int i11 = c2067i.f29176b;
            if (i11 == 16) {
                c2067i.w(0);
                iW = c2067i.f29175a.w();
                eVarB2 = abstractC2072n.b(c2071m, j, iW);
            } else if (i11 == 26) {
                if (eVarB2 != null) {
                    abstractC2072n.h(eVarB2);
                    throw null;
                }
                byteStringE = c2067i.e();
            } else if (!c2067i.x()) {
                break;
            }
        }
        if (c2067i.f29176b != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteStringE == null) {
            return true;
        }
        if (eVarB2 == null) {
            c0Var.d(obj, iW, byteStringE);
            return true;
        }
        abstractC2072n.i(eVarB2);
        throw null;
    }
}
