package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements Oa.g {
    @Override // Oa.i
    public final void b() {
        ((Oa.g) getReflected()).b();
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
