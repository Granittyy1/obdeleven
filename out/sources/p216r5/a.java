package p216r5;

import X0.b;
import X0.c;
import Z3.n;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f46341a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f46342b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0.a f46343c = new X0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f46344d = new c(c.f7138c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f46345e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return n.b(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
