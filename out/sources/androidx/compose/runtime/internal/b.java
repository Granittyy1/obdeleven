package androidx.compose.runtime.internal;

/* JADX INFO: compiled from: IntRef.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13052a;

    public b() {
        this(0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f13052a);
        sb2.append(")@");
        int iHashCode = hashCode();
        O.h.c(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.i.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public b(int i10) {
        this.f13052a = i10;
    }
}
