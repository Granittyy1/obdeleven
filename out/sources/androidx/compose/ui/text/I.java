package androidx.compose.ui.text;

/* JADX INFO: compiled from: UrlAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class I implements C1260a.InterfaceC0160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15321a;

    public I(String str) {
        this.f15321a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return kotlin.jvm.internal.i.a(this.f15321a, ((I) obj).f15321a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15321a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("UrlAnnotation(url="), this.f15321a, ')');
    }
}
