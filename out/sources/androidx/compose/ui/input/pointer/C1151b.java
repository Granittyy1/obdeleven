package androidx.compose.ui.input.pointer;

import A1.C0575j;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1151b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14069b;

    public C1151b(int i10) {
        this.f14069b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1151b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f14069b == ((C1151b) obj).f14069b;
    }

    public final int hashCode() {
        return this.f14069b;
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("AndroidPointerIcon(type="), this.f14069b, ')');
    }
}
