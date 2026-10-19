package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class I implements b<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f22555a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22556b = new q0("kotlin.Int", d.f.f8099a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Integer.valueOf(cVar.k());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22556b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.x(((Number) obj).intValue());
    }
}
