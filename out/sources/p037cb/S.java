package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class S implements b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f22579a = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22580b = new q0("kotlin.Long", d.g.f8100a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Long.valueOf(cVar.s());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22580b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.A(((Number) obj).longValue());
    }
}
