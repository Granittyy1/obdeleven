package androidx.compose.material3;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12591a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return this.f12591a == ((k0) obj).f12591a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12591a);
    }

    public final String toString() {
        int i10 = this.f12591a;
        if (a(i10, 0)) {
            return "Hour";
        }
        return a(i10, 1) ? "Minute" : "";
    }
}
