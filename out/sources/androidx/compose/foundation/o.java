package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10908c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f10909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f10910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f10911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f10912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f10913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f10914i;
    public EdgeEffect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f10915k;

    public o(Context context, int i10) {
        this.f10906a = context;
        this.f10907b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C0931c.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(Orientation orientation) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f10906a;
        EdgeEffect edgeEffectA = i10 >= 31 ? C0931c.a(context) : new r(context);
        edgeEffectA.setColor(this.f10907b);
        if (!p013b0.l.b(this.f10908c, 0L)) {
            if (orientation == Orientation.f9957b) {
                long j = this.f10908c;
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                long j10 = this.f10908c;
                edgeEffectA.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f10910e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f9957b);
        this.f10910e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f10911f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f9958c);
        this.f10911f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f10912g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f9958c);
        this.f10912g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f10909d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f9957b);
        this.f10909d = edgeEffectA;
        return edgeEffectA;
    }
}
