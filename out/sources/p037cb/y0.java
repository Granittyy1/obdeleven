package p037cb;

import Ya.b;
import kotlin.jvm.internal.i;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f22677a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22678b = new q0("kotlin.String", d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        return cVar.n();
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22678b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        String value = (String) obj;
        i.e(value, "value");
        dVar.C(value);
    }
}
