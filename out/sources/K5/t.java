package K5;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4365c;
    }

    public static float a(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static boolean b(View view) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
