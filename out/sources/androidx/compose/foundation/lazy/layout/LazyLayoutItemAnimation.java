package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import com.braze.support.BrazeLogger;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimation {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f10608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10609s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.A f10610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.graphics.S f10611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.a<p293xa.r> f10612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.animation.core.P f10613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.animation.core.P f10614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f10616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1085f0 f10617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f10618i;
    public final C1085f0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f10621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Animatable<p013b0.j, C0910j> f10622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Animatable<Float, C0909i> f10623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1085f0 f10624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10625q;

    static {
        long j = BrazeLogger.SUPPRESS;
        f10608r = (j & 4294967295L) | (j << 32);
    }

    public LazyLayoutItemAnimation(kotlinx.coroutines.A a10, androidx.compose.ui.graphics.S s10, Ia.a<p293xa.r> aVar) {
        this.f10610a = a10;
        this.f10611b = s10;
        this.f10612c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f10616g = J0.f(bool);
        this.f10617h = J0.f(bool);
        this.f10618i = J0.f(bool);
        this.j = J0.f(bool);
        long j = f10608r;
        this.f10619k = j;
        this.f10620l = 0L;
        Object obj = null;
        this.f10621m = s10 != null ? s10.b() : null;
        int i10 = 12;
        this.f10622n = new Animatable<>(new p013b0.j(0L), VectorConvertersKt.f9483g, obj, i10);
        this.f10623o = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.f9477a, obj, i10);
        this.f10624p = J0.f(new p013b0.j(0L));
        this.f10625q = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        androidx.compose.ui.graphics.layer.b bVar = this.f10621m;
        androidx.compose.animation.core.P p10 = this.f10613d;
        boolean zBooleanValue = ((Boolean) this.f10617h.getValue()).booleanValue();
        kotlinx.coroutines.A a10 = this.f10610a;
        if (zBooleanValue || p10 == null || bVar == null) {
            if (c()) {
                if (bVar != null) {
                    bVar.f(1.0f);
                }
                C2680e.c(a10, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean zC = c();
        boolean z10 = !zC;
        if (!zC) {
            bVar.f(0.0f);
        }
        C2680e.c(a10, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z10, this, p10, bVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (((Boolean) this.f10616g.getValue()).booleanValue()) {
            C2680e.c(this.f10610a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f10618i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        androidx.compose.ui.graphics.S s10;
        boolean zBooleanValue = ((Boolean) this.f10616g.getValue()).booleanValue();
        kotlinx.coroutines.A a10 = this.f10610a;
        if (zBooleanValue) {
            g(false);
            C2680e.c(a10, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (((Boolean) this.f10617h.getValue()).booleanValue()) {
            e(false);
            C2680e.c(a10, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (c()) {
            f(false);
            C2680e.c(a10, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.f10615f = false;
        h(0L);
        this.f10619k = f10608r;
        androidx.compose.ui.graphics.layer.b bVar = this.f10621m;
        if (bVar != null && (s10 = this.f10611b) != null) {
            s10.a(bVar);
        }
        this.f10621m = null;
        this.f10613d = null;
        this.f10614e = null;
    }

    public final void e(boolean z10) {
        this.f10617h.setValue(Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f10618i.setValue(Boolean.valueOf(z10));
    }

    public final void g(boolean z10) {
        this.f10616g.setValue(Boolean.valueOf(z10));
    }

    public final void h(long j) {
        this.f10624p.setValue(new p013b0.j(j));
    }
}
