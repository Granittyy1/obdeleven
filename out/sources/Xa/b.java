package Xa;

import kotlin.jvm.internal.i;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: InstantSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Ya.b<Ua.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7436a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7437b = l.a("kotlinx.datetime.Instant", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return Ua.d.a.a(Ua.d.Companion, cVar.n());
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7437b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Ua.d value = (Ua.d) obj;
        i.e(value, "value");
        dVar.C(value.toString());
    }
}
