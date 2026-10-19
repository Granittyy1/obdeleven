package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.C1296k;
import androidx.core.view.n0;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final WeakHashMap<View, c0> f10254v = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944d f10255a = a.a(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0944d f10256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0944d f10257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0944d f10258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0944d f10259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0944d f10260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0944d f10261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0944d f10262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0944d f10263i;
    public final Y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X f10264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Y f10265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Y f10266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Y f10267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y f10268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Y f10269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Y f10270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Y f10271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f10274u;

    /* JADX INFO: compiled from: WindowInsets.android.kt */
    public static final class a {
        public static final C0944d a(int i10, String str) {
            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
            return new C0944d(i10, str);
        }

        public static final Y b(int i10, String str) {
            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
            return new Y(e0.a(p222s0.b.f46850e), str);
        }

        public static c0 c(InterfaceC1084f interfaceC1084f) {
            final c0 c0Var;
            final View view = (View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f);
            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
            synchronized (weakHashMap) {
                try {
                    c0 c0Var2 = weakHashMap.get(view);
                    if (c0Var2 == null) {
                        c0Var2 = new c0(view);
                        weakHashMap.put(view, c0Var2);
                    }
                    c0Var = c0Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean zK = interfaceC1084f.k(c0Var) | interfaceC1084f.k(view);
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        c0 c0Var3 = c0Var;
                        View view2 = view;
                        if (c0Var3.f10273t == 0) {
                            WeakHashMap<View, androidx.core.view.Z> weakHashMap2 = androidx.core.view.O.f16859a;
                            C c10 = c0Var3.f10274u;
                            androidx.core.view.O.d.u(view2, c10);
                            if (view2.isAttachedToWindow()) {
                                view2.requestApplyInsets();
                            }
                            view2.addOnAttachStateChangeListener(c10);
                            androidx.core.view.O.p(view2, c10);
                        }
                        c0Var3.f10273t++;
                        return new b0(c0Var, view);
                    }
                };
                interfaceC1084f.E(objF);
            }
            androidx.compose.runtime.E.a(c0Var, (Ia.l) objF, interfaceC1084f);
            return c0Var;
        }
    }

    public c0(View view) {
        C0944d c0944dA = a.a(128, "displayCutout");
        this.f10256b = c0944dA;
        C0944d c0944dA2 = a.a(8, "ime");
        this.f10257c = c0944dA2;
        C0944d c0944dA3 = a.a(32, "mandatorySystemGestures");
        this.f10258d = c0944dA3;
        this.f10259e = a.a(2, "navigationBars");
        this.f10260f = a.a(1, "statusBars");
        C0944d c0944dA4 = a.a(7, "systemBars");
        this.f10261g = c0944dA4;
        C0944d c0944dA5 = a.a(16, "systemGestures");
        this.f10262h = c0944dA5;
        C0944d c0944dA6 = a.a(64, "tappableElement");
        this.f10263i = c0944dA6;
        Y y10 = new Y(e0.a(p222s0.b.f46850e), "waterfall");
        this.j = y10;
        this.f10264k = new X(new X(c0944dA4, c0944dA2), c0944dA);
        new X(new X(new X(c0944dA6, c0944dA3), c0944dA5), y10);
        this.f10265l = a.b(4, "captionBarIgnoringVisibility");
        this.f10266m = a.b(2, "navigationBarsIgnoringVisibility");
        this.f10267n = a.b(1, "statusBarsIgnoringVisibility");
        this.f10268o = a.b(7, "systemBarsIgnoringVisibility");
        this.f10269p = a.b(64, "tappableElementIgnoringVisibility");
        this.f10270q = a.b(8, "imeAnimationTarget");
        this.f10271r = a.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f10272s = bool != null ? bool.booleanValue() : true;
        this.f10274u = new C(this);
    }

    public static void a(c0 c0Var, n0 n0Var) {
        boolean z10 = false;
        c0Var.f10255a.f(n0Var, 0);
        c0Var.f10257c.f(n0Var, 0);
        c0Var.f10256b.f(n0Var, 0);
        c0Var.f10259e.f(n0Var, 0);
        c0Var.f10260f.f(n0Var, 0);
        c0Var.f10261g.f(n0Var, 0);
        c0Var.f10262h.f(n0Var, 0);
        c0Var.f10263i.f(n0Var, 0);
        c0Var.f10258d.f(n0Var, 0);
        c0Var.f10265l.f(e0.a(n0Var.f16948a.h(4)));
        c0Var.f10266m.f(e0.a(n0Var.f16948a.h(2)));
        c0Var.f10267n.f(e0.a(n0Var.f16948a.h(1)));
        c0Var.f10268o.f(e0.a(n0Var.f16948a.h(7)));
        c0Var.f10269p.f(e0.a(n0Var.f16948a.h(64)));
        C1296k c1296kF = n0Var.f16948a.f();
        if (c1296kF != null) {
            c0Var.j.f(e0.a(Build.VERSION.SDK_INT >= 30 ? p222s0.b.c(C1296k.b.b(c1296kF.f16941a)) : p222s0.b.f46850e));
        }
        synchronized (SnapshotKt.f13154c) {
            androidx.collection.L<androidx.compose.runtime.snapshots.o> l10 = SnapshotKt.j.f13192h;
            if (l10 != null && l10.c()) {
                z10 = true;
            }
        }
        if (z10) {
            SnapshotKt.a();
        }
    }
}
