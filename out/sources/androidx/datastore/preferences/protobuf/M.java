package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes.dex */
public final class M<T> implements X<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f17159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0<?, ?> f17160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1324n<?> f17162d;

    public M(c0<?, ?> c0Var, AbstractC1324n<?> abstractC1324n, I i10) {
        this.f17160b = c0Var;
        this.f17161c = abstractC1324n.e(i10);
        this.f17162d = abstractC1324n;
        this.f17159a = i10;
    }

    public final <UT, UB, ET extends C1327q.a<ET>> boolean a(W w3, C1323m c1323m, AbstractC1324n<ET> abstractC1324n, C1327q<ET> c1327q, c0<UT, UB> c0Var, UB ub2) throws IOException {
        int iA = w3.a();
        I i10 = this.f17159a;
        if (iA != 11) {
            if ((iA & 7) != 2) {
                return w3.F();
            }
            GeneratedMessageLite.e eVarB = abstractC1324n.b(c1323m, i10, iA >>> 3);
            if (eVarB == null) {
                return c0Var.l(ub2, w3);
            }
            abstractC1324n.h(eVarB);
            throw null;
        }
        int iM = 0;
        GeneratedMessageLite.e eVarB2 = null;
        ByteString byteStringB = null;
        while (w3.y() != Integer.MAX_VALUE) {
            int iA2 = w3.a();
            if (iA2 == 16) {
                iM = w3.m();
                eVarB2 = abstractC1324n.b(c1323m, i10, iM);
            } else if (iA2 == 26) {
                if (eVarB2 != null) {
                    abstractC1324n.h(eVarB2);
                    throw null;
                }
                byteStringB = w3.B();
            } else if (!w3.F()) {
                break;
            }
        }
        if (w3.a() != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteStringB == null) {
            return true;
        }
        if (eVarB2 == null) {
            c0Var.d(ub2, iM, byteStringB);
            return true;
        }
        abstractC1324n.i(eVarB2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void b(T t8) {
        this.f17160b.j(t8);
        this.f17162d.f(t8);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean c(T t8) {
        this.f17162d.c(t8).g();
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final T d() {
        return (T) this.f17159a.f().h();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.datastore.preferences.protobuf.X
    public final void e(T t8, W w3, C1323m c1323m) throws IOException {
        c0<?, ?> c0Var = this.f17160b;
        d0 d0VarF = c0Var.f(t8);
        AbstractC1324n<?> abstractC1324n = this.f17162d;
        C1327q c1327qD = abstractC1324n.d(t8);
        while (w3.y() != Integer.MAX_VALUE && a(w3, c1323m, abstractC1324n, c1327qD, c0Var, d0VarF)) {
            try {
            } finally {
                c0Var.n(t8, d0VarF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int f(AbstractC1311a abstractC1311a) {
        c0<?, ?> c0Var = this.f17160b;
        int i10 = c0Var.i(c0Var.g(abstractC1311a));
        if (this.f17161c) {
            Z z10 = this.f17162d.c(abstractC1311a).f17272a;
            if (z10.f17199c.size() > 0) {
                C1327q.d(z10.c(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
            if (it.hasNext()) {
                C1327q.d(it.next());
                throw null;
            }
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        Class<?> cls = Y.f17193a;
        c0<?, ?> c0Var = this.f17160b;
        c0Var.o(generatedMessageLite, c0Var.k(c0Var.g(generatedMessageLite), c0Var.g(generatedMessageLite2)));
        if (this.f17161c) {
            Y.B(this.f17162d, generatedMessageLite, generatedMessageLite2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f17160b.g(generatedMessageLite).hashCode();
        return this.f17161c ? (iHashCode * 53) + this.f17162d.c(generatedMessageLite).f17272a.hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void i(T t8, h0 h0Var) throws IOException {
        Iterator itI = this.f17162d.c(t8).i();
        if (itI.hasNext()) {
            ((C1327q.a) ((Map.Entry) itI.next()).getKey()).A();
            throw null;
        }
        c0<?, ?> c0Var = this.f17160b;
        c0Var.q(c0Var.g(t8), h0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean j(GeneratedMessageLite generatedMessageLite, Object obj) {
        c0<?, ?> c0Var = this.f17160b;
        if (!c0Var.g(generatedMessageLite).equals(c0Var.g(obj))) {
            return false;
        }
        if (!this.f17161c) {
            return true;
        }
        AbstractC1324n<?> abstractC1324n = this.f17162d;
        return abstractC1324n.c(generatedMessageLite).equals(abstractC1324n.c(obj));
    }
}
