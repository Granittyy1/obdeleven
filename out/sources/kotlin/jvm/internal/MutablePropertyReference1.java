package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements Oa.h {
    @Override // kotlin.jvm.internal.CallableReference
    public final Oa.b computeReflected() {
        l.f43062a.getClass();
        return this;
    }

    @Override // Oa.h
    public final void g() {
        ((Oa.h) getReflected()).g();
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Oa.j
    public final void k() {
        ((Oa.h) getReflected()).k();
    }
}
