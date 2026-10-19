package p037cb;

import Ya.b;
import kotlin.jvm.internal.i;
import p011ab.e;
import p024bb.c;
import p024bb.d;
import p293xa.r;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class O0 implements b<r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0 f22572b = new O0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1522e0<r> f22573a = new C1522e0<>(r.f47939a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        this.f22573a.deserialize(cVar);
        return r.f47939a;
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22573a.getDescriptor();
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        r value = (r) obj;
        i.e(value, "value");
        this.f22573a.serialize(dVar, value);
    }
}
