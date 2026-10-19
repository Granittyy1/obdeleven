package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements Oa.k {
    @Override // kotlin.jvm.internal.CallableReference
    public final Oa.b computeReflected() {
        l.f43062a.getClass();
        return this;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        ((PropertyReference2Impl) this).j();
        throw null;
    }

    @Override // Oa.k
    public final void j() {
        ((Oa.k) getReflected()).j();
    }
}
