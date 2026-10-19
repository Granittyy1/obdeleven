package p037cb;

import Ya.b;
import kotlin.jvm.internal.i;
import p011ab.e;
import p024bb.c;
import p024bb.d;

/* JADX INFO: renamed from: cb.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1516b0<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f22597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f22598b;

    public C1516b0(b<T> serializer) {
        i.e(serializer, "serializer");
        this.f22597a = serializer;
        this.f22598b = new t0(serializer.getDescriptor());
    }

    @Override // Ya.a
    public final T deserialize(c cVar) {
        if (cVar.t()) {
            return (T) cVar.m(this.f22597a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1516b0.class == obj.getClass() && i.a(this.f22597a, ((C1516b0) obj).f22597a);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22598b;
    }

    public final int hashCode() {
        return this.f22597a.hashCode();
    }

    @Override // Ya.l
    public final void serialize(d dVar, T t8) {
        if (t8 != null) {
            dVar.z(this.f22597a, t8);
        } else {
            dVar.f();
        }
    }
}
