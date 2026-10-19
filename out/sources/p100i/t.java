package p100i;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C0850c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p138l.g;

/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p100i.a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f36428y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f36429z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f36431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f36432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f36433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C f36434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f36435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f36436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f36438i;
    public d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g.d f36439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<i.a.b> f36441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f36443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f36444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f36447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f36450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f36451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f36452x;

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class a extends O3.d {
        public a() {
        }

        @Override // androidx.core.view.a0
        public final void d() {
            View view;
            t tVar = t.this;
            if (tVar.f36443o && (view = tVar.f36436g) != null) {
                view.setTranslationY(0.0f);
                tVar.f36433d.setTranslationY(0.0f);
            }
            tVar.f36433d.setVisibility(8);
            tVar.f36433d.setTransitioning(false);
            tVar.f36447s = null;
            g.d dVar = tVar.f36439k;
            if (dVar != null) {
                dVar.a(tVar.j);
                tVar.j = null;
                tVar.f36439k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = tVar.f36432c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                O.c.c(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class b extends O3.d {
        public b() {
        }

        @Override // androidx.core.view.a0
        public final void d() {
            t tVar = t.this;
            tVar.f36447s = null;
            tVar.f36433d.requestLayout();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class c {
        public c() {
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class d extends p138l.a implements f.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f36456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f f36457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g.d f36458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WeakReference<View> f36459g;

        public d(Context context, g.d dVar) {
            this.f36456d = context;
            this.f36458f = dVar;
            f fVar = new f(context);
            fVar.f8468l = 1;
            this.f36457e = fVar;
            fVar.f8462e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            g.d dVar = this.f36458f;
            if (dVar != null) {
                return dVar.f36352a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            if (this.f36458f == null) {
                return;
            }
            i();
            C0850c c0850c = t.this.f36435f.f8890e;
            if (c0850c != null) {
                c0850c.n();
            }
        }

        @Override // p138l.a
        public final void c() {
            t tVar = t.this;
            if (tVar.f36438i != this) {
                return;
            }
            if (tVar.f36444p) {
                tVar.j = this;
                tVar.f36439k = this.f36458f;
            } else {
                this.f36458f.a(this);
            }
            this.f36458f = null;
            tVar.v(false);
            ActionBarContextView actionBarContextView = tVar.f36435f;
            if (actionBarContextView.f8559l == null) {
                actionBarContextView.h();
            }
            tVar.f36432c.setHideOnContentScrollEnabled(tVar.f36449u);
            tVar.f36438i = null;
        }

        @Override // p138l.a
        public final View d() {
            WeakReference<View> weakReference = this.f36459g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p138l.a
        public final f e() {
            return this.f36457e;
        }

        @Override // p138l.a
        public final MenuInflater f() {
            return new p138l.f(this.f36456d);
        }

        @Override // p138l.a
        public final CharSequence g() {
            return t.this.f36435f.getSubtitle();
        }

        @Override // p138l.a
        public final CharSequence h() {
            return t.this.f36435f.getTitle();
        }

        @Override // p138l.a
        public final void i() {
            if (t.this.f36438i != this) {
                return;
            }
            f fVar = this.f36457e;
            fVar.w();
            try {
                this.f36458f.c(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // p138l.a
        public final boolean j() {
            return t.this.f36435f.f8567t;
        }

        @Override // p138l.a
        public final void k(View view) {
            t.this.f36435f.setCustomView(view);
            this.f36459g = new WeakReference<>(view);
        }

        @Override // p138l.a
        public final void l(int i10) {
            m(t.this.f36430a.getResources().getString(i10));
        }

        @Override // p138l.a
        public final void m(CharSequence charSequence) {
            t.this.f36435f.setSubtitle(charSequence);
        }

        @Override // p138l.a
        public final void n(int i10) {
            o(t.this.f36430a.getResources().getString(i10));
        }

        @Override // p138l.a
        public final void o(CharSequence charSequence) {
            t.this.f36435f.setTitle(charSequence);
        }

        @Override // p138l.a
        public final void p(boolean z10) {
            this.f44040c = z10;
            t.this.f36435f.setTitleOptional(z10);
        }
    }

    public t(Activity activity, boolean z10) {
        new ArrayList();
        this.f36441m = new ArrayList<>();
        this.f36442n = 0;
        this.f36443o = true;
        this.f36446r = true;
        this.f36450v = new a();
        this.f36451w = new b();
        this.f36452x = new c();
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z10) {
            return;
        }
        this.f36436g = decorView.findViewById(R.id.content);
    }

    @Override // p100i.a
    public final boolean b() {
        C c10 = this.f36434e;
        if (c10 == null || !c10.i()) {
            return false;
        }
        this.f36434e.collapseActionView();
        return true;
    }

    @Override // p100i.a
    public final void c(boolean z10) {
        if (z10 == this.f36440l) {
            return;
        }
        this.f36440l = z10;
        ArrayList<i.a.b> arrayList = this.f36441m;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // p100i.a
    public final int d() {
        return this.f36434e.n();
    }

    @Override // p100i.a
    public final Context e() {
        if (this.f36431b == null) {
            TypedValue typedValue = new TypedValue();
            this.f36430a.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f36431b = new ContextThemeWrapper(this.f36430a, i10);
            } else {
                this.f36431b = this.f36430a;
            }
        }
        return this.f36431b;
    }

    @Override // p100i.a
    public final void g() {
        y(this.f36430a.getResources().getBoolean(com.voltasit.obdeleven.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p100i.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        f fVar;
        d dVar = this.f36438i;
        if (dVar == null || (fVar = dVar.f36457e) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return fVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // p100i.a
    public final void l(boolean z10) {
        if (this.f36437h) {
            return;
        }
        m(z10);
    }

    @Override // p100i.a
    public final void m(boolean z10) {
        x(z10 ? 4 : 0, 4);
    }

    @Override // p100i.a
    public final void n() {
        x(2, 2);
    }

    @Override // p100i.a
    public final void o() {
        x(8, 8);
    }

    @Override // p100i.a
    public final void p(int i10) {
        this.f36434e.o(i10);
    }

    @Override // p100i.a
    public final void q(p125k.b bVar) {
        this.f36434e.p(bVar);
    }

    @Override // p100i.a
    public final void r(boolean z10) {
        g gVar;
        this.f36448t = z10;
        if (z10 || (gVar = this.f36447s) == null) {
            return;
        }
        gVar.a();
    }

    @Override // p100i.a
    public final void s(String str) {
        this.f36434e.setTitle(str);
    }

    @Override // p100i.a
    public final void t(CharSequence charSequence) {
        this.f36434e.setWindowTitle(charSequence);
    }

    @Override // p100i.a
    public final p138l.a u(g.d dVar) {
        d dVar2 = this.f36438i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f36432c.setHideOnContentScrollEnabled(false);
        this.f36435f.h();
        d dVar3 = new d(this.f36435f.getContext(), dVar);
        f fVar = dVar3.f36457e;
        fVar.w();
        try {
            boolean zD = dVar3.f36458f.f36352a.d(dVar3, fVar);
            fVar.v();
            if (!zD) {
                return null;
            }
            this.f36438i = dVar3;
            dVar3.i();
            this.f36435f.f(dVar3);
            v(true);
            return dVar3;
        } catch (Throwable th) {
            fVar.v();
            throw th;
        }
    }

    public final void v(boolean z10) {
        Z zM;
        Z zE;
        if (z10) {
            if (!this.f36445q) {
                this.f36445q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f36432c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (this.f36445q) {
            this.f36445q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f36432c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        if (!this.f36433d.isLaidOut()) {
            if (z10) {
                this.f36434e.setVisibility(4);
                this.f36435f.setVisibility(0);
                return;
            } else {
                this.f36434e.setVisibility(0);
                this.f36435f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            zE = this.f36434e.m(4, 100L);
            zM = this.f36435f.e(0, 200L);
        } else {
            zM = this.f36434e.m(0, 200L);
            zE = this.f36435f.e(8, 100L);
        }
        g gVar = new g();
        ArrayList<Z> arrayList = gVar.f44098a;
        arrayList.add(zE);
        View view = zE.f16887a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = zM.f16887a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zM);
        gVar.b();
    }

    public final void w(View view) {
        C wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.voltasit.obdeleven.R.id.decor_content_parent);
        this.f36432c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.voltasit.obdeleven.R.id.action_bar);
        if (callbackFindViewById instanceof C) {
            wrapper = (C) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f36434e = wrapper;
        this.f36435f = (ActionBarContextView) view.findViewById(com.voltasit.obdeleven.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.voltasit.obdeleven.R.id.action_bar_container);
        this.f36433d = actionBarContainer;
        C c10 = this.f36434e;
        if (c10 == null || this.f36435f == null || actionBarContainer == null) {
            throw new IllegalStateException(t.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f36430a = c10.getContext();
        if ((this.f36434e.n() & 4) != 0) {
            this.f36437h = true;
        }
        Context context = this.f36430a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f36434e.getClass();
        y(context.getResources().getBoolean(com.voltasit.obdeleven.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f36430a.obtainStyledAttributes(null, p088h.a.f35689a, com.voltasit.obdeleven.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f36432c;
            if (!actionBarOverlayLayout2.f8582h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f36449u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f36433d;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.d.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void x(int i10, int i11) {
        int iN = this.f36434e.n();
        if ((i11 & 4) != 0) {
            this.f36437h = true;
        }
        this.f36434e.j((i10 & i11) | ((~i11) & iN));
    }

    public final void y(boolean z10) {
        if (z10) {
            this.f36433d.setTabContainer(null);
            this.f36434e.k();
        } else {
            this.f36434e.k();
            this.f36433d.setTabContainer(null);
        }
        this.f36434e.getClass();
        this.f36434e.q(false);
        this.f36432c.setHasNonEmbeddedTabs(false);
    }

    public final void z(boolean z10) {
        boolean z11 = this.f36445q || !this.f36444p;
        View view = this.f36436g;
        final c cVar = this.f36452x;
        if (!z11) {
            if (this.f36446r) {
                this.f36446r = false;
                g gVar = this.f36447s;
                if (gVar != null) {
                    gVar.a();
                }
                int i10 = this.f36442n;
                a aVar = this.f36450v;
                if (i10 != 0 || (!this.f36448t && !z10)) {
                    aVar.d();
                    return;
                }
                this.f36433d.setAlpha(1.0f);
                this.f36433d.setTransitioning(true);
                g gVar2 = new g();
                float f10 = -this.f36433d.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f36433d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                Z zA = O.a(this.f36433d);
                zA.e(f10);
                final View view2 = zA.f16887a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.X
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) p100i.t.this.f36433d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z12 = gVar2.f44102e;
                ArrayList<Z> arrayList = gVar2.f44098a;
                if (!z12) {
                    arrayList.add(zA);
                }
                if (this.f36443o && view != null) {
                    Z zA2 = O.a(view);
                    zA2.e(f10);
                    if (!gVar2.f44102e) {
                        arrayList.add(zA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f36428y;
                boolean z13 = gVar2.f44102e;
                if (!z13) {
                    gVar2.f44100c = accelerateInterpolator;
                }
                if (!z13) {
                    gVar2.f44099b = 250L;
                }
                if (!z13) {
                    gVar2.f44101d = aVar;
                }
                this.f36447s = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.f36446r) {
            return;
        }
        this.f36446r = true;
        g gVar3 = this.f36447s;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f36433d.setVisibility(0);
        int i11 = this.f36442n;
        b bVar = this.f36451w;
        if (i11 == 0 && (this.f36448t || z10)) {
            this.f36433d.setTranslationY(0.0f);
            float f11 = -this.f36433d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f36433d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f36433d.setTranslationY(f11);
            g gVar4 = new g();
            Z zA3 = O.a(this.f36433d);
            zA3.e(0.0f);
            final View view3 = zA3.f16887a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.X
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) p100i.t.this.f36433d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z14 = gVar4.f44102e;
            ArrayList<Z> arrayList2 = gVar4.f44098a;
            if (!z14) {
                arrayList2.add(zA3);
            }
            if (this.f36443o && view != null) {
                view.setTranslationY(f11);
                Z zA4 = O.a(view);
                zA4.e(0.0f);
                if (!gVar4.f44102e) {
                    arrayList2.add(zA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f36429z;
            boolean z15 = gVar4.f44102e;
            if (!z15) {
                gVar4.f44100c = decelerateInterpolator;
            }
            if (!z15) {
                gVar4.f44099b = 250L;
            }
            if (!z15) {
                gVar4.f44101d = bVar;
            }
            this.f36447s = gVar4;
            gVar4.b();
        } else {
            this.f36433d.setAlpha(1.0f);
            this.f36433d.setTranslationY(0.0f);
            if (this.f36443o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.d();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f36432c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(actionBarOverlayLayout);
        }
    }

    public t(Dialog dialog) {
        new ArrayList();
        this.f36441m = new ArrayList<>();
        this.f36442n = 0;
        this.f36443o = true;
        this.f36446r = true;
        this.f36450v = new a();
        this.f36451w = new b();
        this.f36452x = new c();
        w(dialog.getWindow().getDecorView());
    }
}
