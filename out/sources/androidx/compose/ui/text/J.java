package androidx.compose.ui.text;

/* JADX INFO: compiled from: TtsAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15322a;

    public J(String str) {
        this.f15322a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return kotlin.jvm.internal.i.a(this.f15322a, ((J) obj).f15322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15322a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f15322a, ')');
    }
}
