package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2709t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<Throwable, p293xa.r> f43612b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2709t(Object obj, Ia.l<? super Throwable, p293xa.r> lVar) {
        this.f43611a = obj;
        this.f43612b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2709t)) {
            return false;
        }
        C2709t c2709t = (C2709t) obj;
        return kotlin.jvm.internal.i.a(this.f43611a, c2709t.f43611a) && kotlin.jvm.internal.i.a(this.f43612b, c2709t.f43612b);
    }

    public final int hashCode() {
        Object obj = this.f43611a;
        return this.f43612b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f43611a + ", onCancellation=" + this.f43612b + ')';
    }
}
