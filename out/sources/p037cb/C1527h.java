package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: renamed from: cb.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1527h implements b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1527h f22612a = new C1527h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22613b = new q0("kotlin.Boolean", d.a.f8094a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Boolean.valueOf(cVar.f());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22613b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.l(((Boolean) obj).booleanValue());
    }
}
