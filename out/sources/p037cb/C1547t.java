package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: renamed from: cb.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1547t implements b<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1547t f22653a = new C1547t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22654b = new q0("kotlin.Double", d.C0113d.f8097a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Double.valueOf(cVar.H());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22654b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.h(((Number) obj).doubleValue());
    }
}
