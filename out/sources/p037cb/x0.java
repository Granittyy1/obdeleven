package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements b<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f22673a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22674b = new q0("kotlin.Short", d.h.f8101a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Short.valueOf(cVar.D());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22674b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.i(((Number) obj).shortValue());
    }
}
