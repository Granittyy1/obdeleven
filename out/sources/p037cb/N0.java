package p037cb;

import H3.c;
import Ya.b;
import p011ab.e;
import p024bb.d;
import p293xa.p;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class N0 implements b<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f22569a = new N0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f22570b = c.a(x0.f22673a, "kotlin.UShort");

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return new p(cVar.r(f22570b).D());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22570b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        dVar.u(f22570b).i(((p) obj).f47935b);
    }
}
