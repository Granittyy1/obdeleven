package kotlinx.serialization.json.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p037cb.AbstractC1515b;
import p037cb.C1528h0;
import p037cb.C1542o0;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements p050db.q, p024bb.d, p024bb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f44024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2184a f44025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WriteMode f44026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p050db.q[] f44027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p062eb.b f44028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p050db.f f44029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44032i;

    public x(f composer, AbstractC2184a json, WriteMode writeMode, p050db.q[] qVarArr) {
        kotlin.jvm.internal.i.e(composer, "composer");
        kotlin.jvm.internal.i.e(json, "json");
        this.f44024a = composer;
        this.f44025b = json;
        this.f44026c = writeMode;
        this.f44027d = qVarArr;
        this.f44028e = json.f34643b;
        this.f44029f = json.f34642a;
        int iOrdinal = writeMode.ordinal();
        if (qVarArr != null) {
            p050db.q qVar = qVarArr[iOrdinal];
            if (qVar == null && qVar == this) {
                return;
            }
            qVarArr[iOrdinal] = this;
        }
    }

    @Override // p024bb.d
    public final void A(long j) {
        if (this.f44030g) {
            C(String.valueOf(j));
        } else {
            this.f44024a.g(j);
        }
    }

    @Override // p024bb.b
    public final void B(C1542o0 descriptor, int i10, short s10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        i(s10);
    }

    @Override // p024bb.d
    public final void C(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f44024a.j(value);
    }

    public final p024bb.b D(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return a(descriptor);
    }

    public final void E(p011ab.e descriptor, int i10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        int iOrdinal = this.f44026c.ordinal();
        boolean z10 = true;
        f fVar = this.f44024a;
        if (iOrdinal == 1) {
            if (!fVar.f43984b) {
                fVar.e(',');
            }
            fVar.b();
            return;
        }
        if (iOrdinal == 2) {
            if (fVar.f43984b) {
                this.f44030g = true;
                fVar.b();
                return;
            }
            if (i10 % 2 == 0) {
                fVar.e(',');
                fVar.b();
            } else {
                fVar.e(':');
                fVar.k();
                z10 = false;
            }
            this.f44030g = z10;
            return;
        }
        if (iOrdinal == 3) {
            if (i10 == 0) {
                this.f44030g = true;
            }
            if (i10 == 1) {
                fVar.e(',');
                fVar.k();
                this.f44030g = false;
                return;
            }
            return;
        }
        if (!fVar.f43984b) {
            fVar.e(',');
        }
        fVar.b();
        AbstractC2184a json = this.f44025b;
        kotlin.jvm.internal.i.e(json, "json");
        m.d(descriptor, json);
        C(descriptor.g(i10));
        fVar.e(':');
        fVar.k();
    }

    @Override // p024bb.d
    public final p024bb.b a(p011ab.e descriptor) {
        p050db.q qVar;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC2184a abstractC2184a = this.f44025b;
        WriteMode writeModeB = C.b(descriptor, abstractC2184a);
        char c10 = writeModeB.begin;
        f fVar = this.f44024a;
        if (c10 != 0) {
            fVar.e(c10);
            fVar.a();
        }
        String str = this.f44031h;
        if (str != null) {
            String strA = this.f44032i;
            if (strA == null) {
                strA = descriptor.a();
            }
            fVar.b();
            C(str);
            fVar.e(':');
            fVar.k();
            C(strA);
            this.f44031h = null;
            this.f44032i = null;
        }
        if (this.f44026c == writeModeB) {
            return this;
        }
        p050db.q[] qVarArr = this.f44027d;
        return (qVarArr == null || (qVar = qVarArr[writeModeB.ordinal()]) == null) ? new x(fVar, abstractC2184a, writeModeB, qVarArr) : qVar;
    }

    @Override // p024bb.d
    public final C.g b() {
        return this.f44028e;
    }

    @Override // p024bb.b
    public final void c(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        WriteMode writeMode = this.f44026c;
        if (writeMode.end != 0) {
            f fVar = this.f44024a;
            fVar.l();
            fVar.c();
            fVar.e(writeMode.end);
        }
    }

    @Override // p024bb.b
    public final p024bb.d d(C1542o0 descriptor, int i10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        return u(descriptor.i(i10));
    }

    @Override // p024bb.b
    public final void e(p011ab.e descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        l(z10);
    }

    @Override // p024bb.d
    public final void f() {
        this.f44024a.h("null");
    }

    @Override // p024bb.b
    public final void g(int i10, int i11, p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        x(i11);
    }

    @Override // p024bb.d
    public final void h(double d10) {
        boolean z10 = this.f44030g;
        f fVar = this.f44024a;
        if (z10) {
            C(String.valueOf(d10));
        } else {
            fVar.f43983a.c(String.valueOf(d10));
        }
        if (this.f44029f.f34676k) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw O.e.d(fVar.f43983a.toString(), Double.valueOf(d10));
        }
    }

    @Override // p024bb.d
    public final void i(short s10) {
        if (this.f44030g) {
            C(String.valueOf((int) s10));
        } else {
            this.f44024a.i(s10);
        }
    }

    @Override // p024bb.b
    public final void j(p011ab.e descriptor, int i10, long j) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        A(j);
    }

    @Override // p024bb.d
    public final void k(byte b10) {
        if (this.f44030g) {
            C(String.valueOf((int) b10));
        } else {
            this.f44024a.d(b10);
        }
    }

    @Override // p024bb.d
    public final void l(boolean z10) {
        if (this.f44030g) {
            C(String.valueOf(z10));
        } else {
            this.f44024a.f43983a.c(String.valueOf(z10));
        }
    }

    @Override // p024bb.b
    public final void m(C1542o0 descriptor, int i10, double d10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        h(d10);
    }

    @Override // p024bb.d
    public final void n(p011ab.e enumDescriptor, int i10) {
        kotlin.jvm.internal.i.e(enumDescriptor, "enumDescriptor");
        C(enumDescriptor.g(i10));
    }

    @Override // p024bb.d
    public final void o(float f10) {
        boolean z10 = this.f44030g;
        f fVar = this.f44024a;
        if (z10) {
            C(String.valueOf(f10));
        } else {
            fVar.f43983a.c(String.valueOf(f10));
        }
        if (this.f44029f.f34676k) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw O.e.d(fVar.f43983a.toString(), Float.valueOf(f10));
        }
    }

    @Override // p024bb.b
    public final void p(p011ab.e descriptor, int i10, String value) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(value, "value");
        E(descriptor, i10);
        C(value);
    }

    @Override // p024bb.b
    public final <T> void q(p011ab.e descriptor, int i10, Ya.l<? super T> serializer, T t8) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(serializer, "serializer");
        if (t8 != null || this.f44029f.f34672f) {
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            kotlin.jvm.internal.i.e(serializer, "serializer");
            E(descriptor, i10);
            if (serializer.getDescriptor().c()) {
                z(serializer, t8);
            } else if (t8 == null) {
                f();
            } else {
                z(serializer, t8);
            }
        }
    }

    @Override // p024bb.d
    public final void r(char c10) {
        C(String.valueOf(c10));
    }

    @Override // p024bb.b
    public final void s(p011ab.e descriptor, int i10, Ya.l serializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(serializer, "serializer");
        E(descriptor, i10);
        z(serializer, obj);
    }

    @Override // p024bb.b
    public final void t(C1542o0 descriptor, int i10, float f10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        o(f10);
    }

    @Override // p024bb.d
    public final p024bb.d u(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        boolean zA = y.a(descriptor);
        WriteMode writeMode = this.f44026c;
        AbstractC2184a abstractC2184a = this.f44025b;
        f gVar = this.f44024a;
        if (zA) {
            if (!(gVar instanceof h)) {
                gVar = new h(gVar.f43983a, this.f44030g);
            }
            return new x(gVar, abstractC2184a, writeMode, null);
        }
        if (descriptor.isInline() && descriptor.equals(p050db.i.f34682a)) {
            if (!(gVar instanceof g)) {
                gVar = new g(gVar.f43983a, this.f44030g);
            }
            return new x(gVar, abstractC2184a, writeMode, null);
        }
        if (this.f44031h != null) {
            this.f44032i = descriptor.a();
        }
        return this;
    }

    @Override // p024bb.b
    public final boolean v(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this.f44029f.f34667a;
    }

    @Override // p024bb.b
    public final void w(C1542o0 descriptor, int i10, byte b10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        k(b10);
    }

    @Override // p024bb.d
    public final void x(int i10) {
        if (this.f44030g) {
            C(String.valueOf(i10));
        } else {
            this.f44024a.f(i10);
        }
    }

    @Override // p024bb.b
    public final void y(C1542o0 descriptor, int i10, char c10) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        E(descriptor, i10);
        r(c10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.d
    public final <T> void z(Ya.l<? super T> serializer, T t8) {
        String strA;
        kotlin.jvm.internal.i.e(serializer, "serializer");
        AbstractC2184a abstractC2184a = this.f44025b;
        p050db.f fVar = abstractC2184a.f34642a;
        if (fVar.f34675i) {
            serializer.serialize(this, t8);
            return;
        }
        boolean z10 = serializer instanceof AbstractC1515b;
        if (!z10) {
            int iOrdinal = fVar.f34681p.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    p011ab.m mVarE = serializer.getDescriptor().e();
                    strA = (kotlin.jvm.internal.i.a(mVarE, ab.n.a.f8124a) || kotlin.jvm.internal.i.a(mVarE, ab.n.d.f8127a)) ? v.a(serializer.getDescriptor(), abstractC2184a) : null;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (fVar.f34681p != ClassDiscriminatorMode.f43961b) {
        }
        if (z10) {
            AbstractC1515b abstractC1515b = (AbstractC1515b) serializer;
            if (t8 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC1515b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            Ya.l<? super T> lVarE = F8.a.e(abstractC1515b, this, t8);
            if (strA != null && (serializer instanceof Ya.j)) {
                p011ab.e descriptor = lVarE.getDescriptor();
                kotlin.jvm.internal.i.e(descriptor, "<this>");
                if (C1528h0.a(descriptor).contains(strA)) {
                    StringBuilder sbC = B6.a.c("Sealed class '", lVarE.getDescriptor().a(), "' cannot be serialized as base class '", ((Ya.j) serializer).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                    sbC.append(strA);
                    sbC.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(sbC.toString().toString());
                }
            }
            p011ab.m kind = lVarE.getDescriptor().e();
            kotlin.jvm.internal.i.e(kind, "kind");
            if (kind instanceof ab.m.b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof p011ab.d) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof p011ab.c) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            serializer = lVarE;
        }
        if (strA != null) {
            String strA2 = serializer.getDescriptor().a();
            this.f44031h = strA;
            this.f44032i = strA2;
        }
        serializer.serialize(this, t8);
    }
}
