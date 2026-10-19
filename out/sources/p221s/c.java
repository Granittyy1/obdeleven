package p221s;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f46848a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f46848a) * ((double) f11)) + ((double) f10));
    }

    public static float b(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f46848a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
