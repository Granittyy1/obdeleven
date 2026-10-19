package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.runtime.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1114v<T> implements S0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f13249a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1114v(Ia.l<? super InterfaceC1106q, ? extends T> lVar) {
        this.f13249a = (Lambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.S0
    public final T a(InterfaceC1089h0 interfaceC1089h0) {
        return (T) this.f13249a.invoke(interfaceC1089h0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1114v) && kotlin.jvm.internal.i.a(this.f13249a, ((C1114v) obj).f13249a);
    }

    public final int hashCode() {
        return this.f13249a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f13249a + ')';
    }
}
