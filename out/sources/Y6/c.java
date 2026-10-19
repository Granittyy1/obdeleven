package Y6;

import X6.g;
import X6.i;
import Z6.o;
import Z6.p;
import Z6.q;
import Z6.r;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.k0;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.voltasit.obdeleven.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DaggerInAppMessageComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7617b;

    public d a() {
        o oVar = (o) this.f7617b;
        if (oVar == null) {
            throw new IllegalStateException(o.class.getCanonicalName() + " must be set");
        }
        d dVar = new d();
        dVar.f7618a = V6.a.a(new p(0, oVar));
        p268va.a<LayoutInflater> aVarA = V6.a.a(new r(0, oVar));
        dVar.f7619b = aVarA;
        q qVar = new q(0, oVar);
        dVar.f7620c = qVar;
        dVar.f7621d = V6.a.a(new g(dVar.f7618a, aVarA, qVar));
        dVar.f7622e = V6.a.a(new i(dVar.f7618a, dVar.f7619b, dVar.f7620c));
        dVar.f7623f = V6.a.a(new X6.b(dVar.f7618a, dVar.f7619b, dVar.f7620c));
        dVar.f7624g = V6.a.a(new X6.e(dVar.f7618a, dVar.f7619b, dVar.f7620c));
        return dVar;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        boolean z10;
        boolean z11;
        int iD = n0Var.d();
        p100i.g gVar = (p100i.g) this.f7617b;
        gVar.getClass();
        int iD2 = n0Var.d();
        ActionBarContextView actionBarContextView = gVar.f36343w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.f36343w.getLayoutParams();
            boolean z12 = true;
            if (gVar.f36343w.isShown()) {
                if (gVar.f36339t0 == null) {
                    gVar.f36339t0 = new Rect();
                    gVar.f36341u0 = new Rect();
                }
                Rect rect = gVar.f36339t0;
                Rect rect2 = gVar.f36341u0;
                rect.set(n0Var.b(), n0Var.d(), n0Var.c(), n0Var.a());
                ViewGroup viewGroup = gVar.f36301C;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z13 = k0.f8999a;
                    k0.a.a(viewGroup, rect, rect2);
                } else {
                    if (!k0.f8999a) {
                        k0.f8999a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            k0.f9000b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                k0.f9000b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = k0.f9000b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = gVar.f36301C;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                n0 n0VarA = O.e.a(viewGroup2);
                int iB = n0VarA == null ? 0 : n0VarA.b();
                int iC = n0VarA == null ? 0 : n0VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                Context context = gVar.f36326l;
                if (i10 <= 0 || gVar.f36303E != null) {
                    View view2 = gVar.f36303E;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            gVar.f36303E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    gVar.f36303E = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    gVar.f36301C.addView(gVar.f36303E, -1, layoutParams);
                }
                View view4 = gVar.f36303E;
                z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = gVar.f36303E;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? p0.a.b.a(context, R.color.abc_decor_view_status_guard_light) : p0.a.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!gVar.f36308J && z12) {
                    iD2 = 0;
                }
                boolean z14 = z12;
                z12 = z11;
                z10 = z14;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                gVar.f36343w.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = gVar.f36303E;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return O.i(view, iD != iD2 ? n0Var.f(n0Var.b(), iD2, n0Var.c(), n0Var.a()) : n0Var);
    }
}
