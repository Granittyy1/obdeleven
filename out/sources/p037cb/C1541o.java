package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: renamed from: cb.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1541o implements b<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1541o f22640a = new C1541o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22641b = new q0("kotlin.Char", d.c.f8096a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Character.valueOf(cVar.g());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22641b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.r(((Character) obj).charValue());
    }
}
