package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DisplayCutoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1296k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f16941a;

    /* JADX INFO: renamed from: androidx.core.view.k$a */
    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$b */
    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    public static class b {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C1296k(DisplayCutout displayCutout) {
        this.f16941a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1296k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f16941a, ((C1296k) obj).f16941a);
    }

    public final int hashCode() {
        return this.f16941a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f16941a + "}";
    }
}
