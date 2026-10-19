package p037cb;

import Ya.b;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: renamed from: cb.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1533k implements b<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1533k f22622a = new C1533k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22623b = new q0("kotlin.Byte", d.b.f8095a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return Byte.valueOf(cVar.C());
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22623b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        dVar.k(((Number) obj).byteValue());
    }
}
