package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements Oa.i {
    @Override // Oa.i
    public final void b() {
        ((Oa.i) getReflected()).b();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final Oa.b computeReflected() {
        l.f43062a.getClass();
        return this;
    }

    @Override // Ia.a
    public final Object invoke() {
        return get();
    }
}
