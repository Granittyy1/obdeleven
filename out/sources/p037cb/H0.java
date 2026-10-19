package p037cb;

import H3.c;
import Ya.b;
import p011ab.e;
import p024bb.d;
import p293xa.k;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 implements b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f22553a = new H0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f22554b = c.a(I.f22555a, "kotlin.UInt");

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return new k(cVar.r(f22554b).k());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22554b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        dVar.u(f22554b).x(((k) obj).f47926b);
    }
}
