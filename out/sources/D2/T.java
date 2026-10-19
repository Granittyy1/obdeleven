package D2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f2571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2573c;

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(T.f2571a.m(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            T.b(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2571a = new c0();
        } else {
            f2571a = new b0();
        }
        f2572b = new a(Float.class, "translationAlpha");
        f2573c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f2571a.w(view, i10, i11, i12, i13);
    }

    public static void b(View view, float f10) {
        f2571a.q(view, f10);
    }

    public static void c(int i10, View view) {
        f2571a.r(i10, view);
    }
}
