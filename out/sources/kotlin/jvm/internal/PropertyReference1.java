package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements Oa.j {
    @Override // kotlin.jvm.internal.CallableReference
    public final Oa.b computeReflected() {
        l.f43062a.getClass();
        return this;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Oa.j
    public final void k() {
        ((Oa.j) getReflected()).k();
    }
}
