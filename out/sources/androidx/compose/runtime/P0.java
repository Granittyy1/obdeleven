package androidx.compose.runtime;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P0<T> implements S0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f12885a;

    public P0(T t8) {
        this.f12885a = t8;
    }

    @Override // androidx.compose.runtime.S0
    public final T a(InterfaceC1089h0 interfaceC1089h0) {
        return this.f12885a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P0) && kotlin.jvm.internal.i.a(this.f12885a, ((P0) obj).f12885a);
    }

    public final int hashCode() {
        T t8 = this.f12885a;
        if (t8 == null) {
            return 0;
        }
        return t8.hashCode();
    }

    public final String toString() {
        return B6.c.e(new StringBuilder("StaticValueHolder(value="), this.f12885a, ')');
    }
}
