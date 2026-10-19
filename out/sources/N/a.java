package N;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4617a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f4617a == ((a) obj).f4617a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4617a);
    }

    public final String toString() {
        int i10 = this.f4617a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
