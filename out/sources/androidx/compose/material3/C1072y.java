package androidx.compose.material3;

/* JADX INFO: renamed from: androidx.compose.material3.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class C1072y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12768a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1072y) {
            return this.f12768a == ((C1072y) obj).f12768a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12768a);
    }

    public final String toString() {
        int i10 = this.f12768a;
        if (a(i10, 0)) {
            return "Picker";
        }
        return a(i10, 1) ? "Input" : "Unknown";
    }
}
