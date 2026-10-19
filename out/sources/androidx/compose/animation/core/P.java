package androidx.compose.animation.core;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P<T> implements InterfaceC0923x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f9395c;

    public P() {
        this(7, null);
    }

    @Override // androidx.compose.animation.core.InterfaceC0906f
    public final f0 a(d0 d0Var) {
        T t8 = this.f9395c;
        return new q0(this.f9393a, this.f9394b, t8 == null ? null : (AbstractC0913m) d0Var.a().invoke(t8));
    }

    @Override // androidx.compose.animation.core.InterfaceC0923x
    public final j0 b() {
        e0 e0Var = VectorConvertersKt.f9477a;
        T t8 = this.f9395c;
        return new q0(this.f9393a, this.f9394b, t8 == null ? null : (AbstractC0913m) e0Var.a().invoke(t8));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return p10.f9393a == this.f9393a && p10.f9394b == this.f9394b && kotlin.jvm.internal.i.a(p10.f9395c, this.f9395c);
    }

    public final int hashCode() {
        T t8 = this.f9395c;
        return Float.hashCode(this.f9394b) + O.a.d(this.f9393a, (t8 != null ? t8.hashCode() : 0) * 31, 31);
    }

    public P(float f10, float f11, T t8) {
        this.f9393a = f10;
        this.f9394b = f11;
        this.f9395c = t8;
    }

    public /* synthetic */ P(int i10, Object obj) {
        this(1.0f, 1500.0f, (i10 & 4) != 0 ? null : obj);
    }
}
