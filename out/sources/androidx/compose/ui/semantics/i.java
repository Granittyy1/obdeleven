package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15203a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f15203a == ((i) obj).f15203a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15203a);
    }

    public final String toString() {
        int i10 = this.f15203a;
        if (a(i10, 0)) {
            return "Button";
        }
        if (a(i10, 1)) {
            return "Checkbox";
        }
        if (a(i10, 2)) {
            return "Switch";
        }
        if (a(i10, 3)) {
            return "RadioButton";
        }
        if (a(i10, 4)) {
            return "Tab";
        }
        if (a(i10, 5)) {
            return "Image";
        }
        if (a(i10, 6)) {
            return "DropdownList";
        }
        if (a(i10, 7)) {
            return "Picker";
        }
        return a(i10, 8) ? "Carousel" : "Unknown";
    }
}
