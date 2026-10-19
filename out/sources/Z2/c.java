package Z2;

/* JADX INFO: compiled from: RealSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f7728b;

    public c(e eVar) {
        this.f7728b = eVar;
    }

    @Override // Z2.f
    public final Object e(kotlin.coroutines.c<? super e> cVar) {
        return this.f7728b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (kotlin.jvm.internal.i.a(this.f7728b, ((c) obj).f7728b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7728b.hashCode();
    }
}
