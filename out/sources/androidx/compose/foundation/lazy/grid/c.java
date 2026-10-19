package androidx.compose.foundation.lazy.grid;

/* JADX INFO: compiled from: LazyGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10449a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f10449a == ((c) obj).f10449a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10449a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f10449a + ')';
    }
}
