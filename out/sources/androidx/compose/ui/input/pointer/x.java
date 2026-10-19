package androidx.compose.ui.input.pointer;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14149a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f14149a == ((x) obj).f14149a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14149a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f14149a + ')';
    }
}
