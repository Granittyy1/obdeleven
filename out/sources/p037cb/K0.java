package p037cb;

import H3.c;
import Ya.b;
import p011ab.e;
import p024bb.d;
import p293xa.m;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class K0 implements b<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0 f22562a = new K0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f22563b = c.a(S.f22579a, "kotlin.ULong");

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return new m(cVar.r(f22563b).s());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22563b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        dVar.u(f22563b).A(((m) obj).f47930b);
    }
}
