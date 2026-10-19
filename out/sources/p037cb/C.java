package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements b<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f22538a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22539b = new q0("kotlin.Float", d.e.f8098a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Float.valueOf(cVar.E());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22539b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.o(((Number) obj).floatValue());
    }
}
