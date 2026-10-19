package androidx.compose.runtime;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D<T> implements S0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X<T> f12798a;

    public D(X<T> x10) {
        this.f12798a = x10;
    }

    @Override // androidx.compose.runtime.S0
    public final T a(InterfaceC1089h0 interfaceC1089h0) {
        return this.f12798a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.i.a(this.f12798a, ((D) obj).f12798a);
    }

    public final int hashCode() {
        return this.f12798a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f12798a + ')';
    }
}
