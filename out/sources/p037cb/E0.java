package p037cb;

import H3.c;
import Ya.b;
import p011ab.e;
import p024bb.d;
import p293xa.i;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f22544a = new E0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f22545b = c.a(C1533k.f22622a, "kotlin.UByte");

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return new i(cVar.r(f22545b).C());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22545b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        dVar.u(f22545b).k(((i) obj).f47922b);
    }
}
