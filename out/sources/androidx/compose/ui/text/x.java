package androidx.compose.ui.text;

/* JADX INFO: compiled from: StringAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class x implements C1260a.InterfaceC0160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15709a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return kotlin.jvm.internal.i.a(this.f15709a, ((x) obj).f15709a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15709a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("StringAnnotation(value="), this.f15709a, ')');
    }
}
