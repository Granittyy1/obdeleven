package com.voltasit.obdeleven.utils;

import J4.o;
import O.e;
import P8.c;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.app.RunnableC1276a;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.C1353s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.J;
import androidx.fragment.app.y;
import androidx.fragment.app.y.r;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.activity.LoginLandscapeActivity;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p134k8.a2;
import p220r9.C2786s;
import p220r9.u;
import p255u9.E;
import p255u9.z;
import p279w9.b;

/* JADX INFO: compiled from: NavigationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NavigationManager extends y.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f34230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f34231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f34232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BaseFragment<?> f34233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BaseFragment<?> f34234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f34235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Stack<String> f34236g;

    /* JADX INFO: compiled from: NavigationManager.kt */
    public static final class NoActivityFoundException extends Exception {
        public NoActivityFoundException() {
            super("an Activity can not be found to execute the given Intent");
        }
    }

    /* JADX INFO: compiled from: NavigationManager.kt */
    public static final class a {
        public a() {
        }

        public final void a() {
            NavigationManager navigationManager = NavigationManager.this;
            if (navigationManager.f34230a.f33535D) {
                navigationManager.n(new GarageFragment(), null);
            }
        }

        public final void b(E vehicleDB) {
            i.e(vehicleDB, "vehicleDB");
            NavigationManager navigationManager = NavigationManager.this;
            if (navigationManager.f34230a.f33535D) {
                p195p9.c cVar = new p195p9.c();
                cVar.R(vehicleDB, true, false);
                navigationManager.n(cVar, null);
            }
        }
    }

    public NavigationManager(MainActivity activity, FrameLayout menuContainer, FrameLayout contentContainer) {
        i.e(activity, "activity");
        i.e(menuContainer, "menuContainer");
        i.e(contentContainer, "contentContainer");
        this.f34230a = activity;
        this.f34231b = menuContainer;
        this.f34232c = contentContainer;
        this.f34236g = new Stack<>();
        y supportFragmentManager = activity.getSupportFragmentManager();
        this.f34235f = supportFragmentManager;
        if (supportFragmentManager != null) {
            C1353s c1353s = supportFragmentManager.f17688p;
            c1353s.getClass();
            c1353s.f17639b.add(new C1353s.a(this));
        }
    }

    public static void i(final NavigationManager navigationManager, final Class cls, boolean z10) {
        String name;
        String name2;
        navigationManager.getClass();
        p279w9.b bVar = Application.f29634b;
        try {
            Object objNewInstance = cls.newInstance();
            i.c(objNewInstance, "null cannot be cast to non-null type com.voltasit.obdeleven.ui.module.BaseFragment<*>");
            name = ((BaseFragment) objNewInstance).o();
            while (true) {
                Stack<String> stack = navigationManager.f34236g;
                if (stack.isEmpty() || i.a(stack.peek(), name2)) {
                    break;
                } else {
                    stack.pop();
                }
            }
        } catch (ClassCastException e10) {
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e10);
            name = cls.getName();
        } catch (IllegalAccessException e11) {
            p279w9.b bVar3 = Application.f29634b;
            P8.c.b(e11);
            name = cls.getName();
        } catch (InstantiationException e12) {
            p279w9.b bVar4 = Application.f29634b;
            P8.c.b(e12);
            name = cls.getName();
        }
        StringBuilder sb2 = new StringBuilder("popToFragment(");
        sb2.append(name);
        sb2.append(") immediate: ");
        sb2.append(z10);
        sb2.append("inclusive: ");
        final int i10 = 0;
        sb2.append(false);
        P8.c.a(4, "NavigationManager", sb2.toString(), Arrays.copyOf(new Object[0], 0));
        name2 = cls.getName();
        y yVar = navigationManager.f34235f;
        if (!z10) {
            i.b(yVar);
            yVar.x(yVar.new r(cls.getName(), -1, 0), false);
            return;
        }
        try {
            i.b(yVar);
            yVar.T(cls.getName(), -1, 0);
        } catch (IllegalStateException e13) {
            p279w9.b bVar5 = Application.f29634b;
            P8.c.b(e13);
            new Handler().post(new Runnable() { // from class: r9.F
                @Override // java.lang.Runnable
                public final void run() {
                    NavigationManager this$0 = this.f46413b;
                    i.e(this$0, "this$0");
                    Class cls2 = cls;
                    if (!this$0.f34230a.f33534C) {
                        b bVar6 = Application.f29634b;
                        c.a(5, "NavigationManager", "Unable to pop back stack because activity is not visible", Arrays.copyOf(new Object[0], 0));
                    } else {
                        y yVar2 = this$0.f34235f;
                        i.b(yVar2);
                        yVar2.x(yVar2.new r(cls2.getName(), -1, i10), false);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.y.m
    public final void a(y fm, Fragment f10) {
        i.e(fm, "fm");
        i.e(f10, "f");
        if (f10 instanceof BaseFragment) {
            BaseFragment<?> baseFragment = (BaseFragment) f10;
            if (this.f34233d == baseFragment) {
                this.f34233d = null;
            }
            if (this.f34234e == baseFragment) {
                this.f34234e = null;
            }
        }
    }

    @Override // androidx.fragment.app.y.m
    public final void b(y fm, Fragment f10) {
        i.e(fm, "fm");
        i.e(f10, "f");
        if (f10 instanceof BaseFragment) {
            if (this.f34234e == null || this.f34233d == null) {
                k((BaseFragment) f10);
            }
        }
    }

    @Override // androidx.fragment.app.y.m
    public final void c(y fm, Fragment f10, View v10) {
        i.e(fm, "fm");
        i.e(f10, "f");
        i.e(v10, "v");
        if (f10 instanceof BaseFragment) {
            k((BaseFragment) f10);
        }
    }

    public final BaseFragment<?> d() {
        y yVar = this.f34235f;
        i.b(yVar);
        int iH = yVar.H() - 1;
        if (iH < 0) {
            return null;
        }
        y.k kVarG = yVar.G(iH);
        i.d(kVarG, "getBackStackEntryAt(...)");
        return (BaseFragment) yVar.D(kVarG.getName());
    }

    public final String e() {
        y yVar = this.f34235f;
        i.b(yVar);
        int iH = yVar.H() - 1;
        if (iH < 0) {
            return "";
        }
        y.k kVarG = yVar.G(iH);
        i.d(kVarG, "getBackStackEntryAt(...)");
        String name = kVarG.getName();
        i.b(name);
        return name;
    }

    public final BaseFragment<?> f() {
        y yVar = this.f34235f;
        i.b(yVar);
        for (int iH = yVar.H() - 1; iH > 0; iH--) {
            Fragment fragmentD = yVar.D(yVar.G(iH).getName());
            if (fragmentD instanceof BaseFragment) {
                BaseFragment<?> baseFragment = (BaseFragment) fragmentD;
                if (baseFragment.isVisible() && baseFragment.t() == Positionable$Position.f31106b) {
                    return baseFragment;
                }
            }
        }
        return null;
    }

    public final boolean g(String str) {
        try {
            this.f34230a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (ActivityNotFoundException e10) {
            e.m(e10);
            return false;
        }
    }

    public final void h() {
        y yVar = this.f34235f;
        MainActivity mainActivity = this.f34230a;
        if (!mainActivity.f33534C) {
            p279w9.b bVar = Application.f29634b;
            P8.c.a(5, "NavigationManager", "Unable to pop fragment on invisible activity.", Arrays.copyOf(new Object[0], 0));
            mainActivity.w().f("MainActivity", "Scheduling switch to main on resume");
            mainActivity.f33567w = true;
            return;
        }
        p279w9.b bVar2 = Application.f29634b;
        P8.c.a(4, "NavigationManager", "popFragment(" + d() + ")", Arrays.copyOf(new Object[0], 0));
        Stack<String> stack = this.f34236g;
        if (stack.isEmpty()) {
            P8.c.a(5, "NavigationManager", "Attempting to remove fragments from empty stack", Arrays.copyOf(new Object[0], 0));
        } else {
            stack.pop();
        }
        try {
            i.b(yVar);
            yVar.S();
            l(null);
        } catch (IllegalStateException unused) {
            i.b(yVar);
            yVar.R();
            new Handler().post(new RunnableC1276a(3, this));
        }
    }

    public final void j(boolean z10) {
        y yVar = this.f34235f;
        i.b(yVar);
        int iH = yVar.H() - 1;
        while (iH > 0) {
            Fragment fragmentD = yVar.D(yVar.G(iH).getName());
            if ((fragmentD instanceof BaseFragment) && ((BaseFragment) fragmentD).t() == Positionable$Position.f31106b && (fragmentD instanceof O8.c)) {
                String name = yVar.G(iH).getName();
                i.b(name);
                boolean z11 = z10 && iH > 1;
                while (true) {
                    Stack<String> stack = this.f34236g;
                    if (stack.isEmpty()) {
                        break;
                    }
                    if (i.a(stack.peek(), name)) {
                        if (!z11) {
                            break;
                        }
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
                yVar.T(yVar.G(iH).getName(), -1, (!z10 || iH <= 1) ? 0 : 1);
                l(null);
                return;
            }
            iH--;
        }
    }

    public final void k(BaseFragment<?> fragment) {
        i.e(fragment, "fragment");
        if (this.f34230a.E()) {
            int iOrdinal = fragment.t().ordinal();
            if (iOrdinal == 0) {
                this.f34233d = fragment;
                fragment.setMenuVisibility(true);
            } else if (iOrdinal == 1) {
                this.f34234e = fragment;
            } else if (iOrdinal == 2) {
                BaseFragment<?> baseFragment = this.f34233d;
                if (baseFragment != null) {
                    baseFragment.setMenuVisibility(false);
                }
                this.f34233d = null;
                this.f34234e = fragment;
            }
            BaseFragment<?> baseFragment2 = this.f34234e;
            if (baseFragment2 != null) {
                baseFragment2.D();
            }
            BaseFragment<?> baseFragment3 = this.f34233d;
            if (baseFragment3 != null) {
                baseFragment3.D();
            }
        }
    }

    public final void l(BaseFragment<?> baseFragment) {
        MainActivity mainActivity = this.f34230a;
        if (mainActivity.E()) {
            if (baseFragment == null) {
                baseFragment = d();
            }
            if (baseFragment == null) {
                return;
            }
            p248u2.e eVarF = f();
            if (eVarF instanceof O8.c) {
                ((O8.c) eVarF).c(baseFragment);
            }
            Positionable$Position positionable$PositionT = baseFragment.t();
            Positionable$Position positionable$Position = Positionable$Position.f31108d;
            FrameLayout frameLayout = this.f34232c;
            FrameLayout frameLayout2 = this.f34231b;
            if (positionable$PositionT == positionable$Position) {
                frameLayout2.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                i.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = (C2786s.b(mainActivity) / 10) * 6;
                layoutParams2.weight = 0.0f;
                frameLayout.setLayoutParams(layoutParams2);
                BaseFragment<?> baseFragmentF = f();
                if (baseFragmentF != null) {
                    baseFragmentF.setMenuVisibility(false);
                    return;
                }
                return;
            }
            frameLayout2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            i.c(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = 0;
            layoutParams4.weight = 15.0f;
            frameLayout2.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            i.c(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.weight = 25.0f;
            layoutParams6.width = 0;
            frameLayout.setLayoutParams(layoutParams6);
            BaseFragment<?> baseFragmentF2 = f();
            if (baseFragmentF2 != null) {
                baseFragmentF2.setMenuVisibility(true);
            }
        }
    }

    public final void m(boolean z10) {
        Class cls = z10 ? LoginLandscapeActivity.class : LoginActivity.class;
        MainActivity mainActivity = this.f34230a;
        mainActivity.startActivityForResult(new Intent(mainActivity, (Class<?>) cls), R.styleable.AppCompatTheme_windowFixedWidthMinor);
    }

    public final void n(BaseFragment<?> baseFragment, View view) {
        p100i.a supportActionBar;
        MainActivity mainActivity = this.f34230a;
        if (!mainActivity.f33534C) {
            p279w9.b bVar = Application.f29634b;
            P8.c.a(5, "NavigationManager", "Unable to switch fragment on invisible activity.", Arrays.copyOf(new Object[0], 0));
            mainActivity.w().f("MainActivity", "Scheduling switch to main on resume");
            mainActivity.f33567w = true;
            return;
        }
        String name = baseFragment.getClass().getName();
        BaseFragment<?> baseFragmentD = d();
        if (baseFragmentD != null && baseFragment.getClass().equals(baseFragmentD.getClass())) {
            mainActivity.f33565u = baseFragmentD.u();
            if (mainActivity.f33534C && (supportActionBar = mainActivity.getSupportActionBar()) != null) {
                supportActionBar.o();
                String str = mainActivity.f33565u;
                if (str != null) {
                    supportActionBar.s(str);
                }
            }
            p279w9.b bVar2 = Application.f29634b;
            P8.c.a(4, "NavigationManager", "Ignoring fragment switch because fragments are same", Arrays.copyOf(new Object[0], 0));
            return;
        }
        p279w9.b bVar3 = Application.f29634b;
        P8.c.a(4, "NavigationManager", androidx.compose.foundation.gestures.d.b("WINDOW_OPEN(", baseFragment.o(), ")"), Arrays.copyOf(new Object[0], 0));
        y yVar = this.f34235f;
        i.b(yVar);
        C1336a c1336a = new C1336a(yVar);
        if (view != null && view.getTag() != null) {
            String string = view.getTag().toString();
            if (J.f17509a != null || J.f17510b != null) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                String strK = O.d.k(view);
                if (strK == null) {
                    throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                }
                if (c1336a.f17496n == null) {
                    c1336a.f17496n = new ArrayList<>();
                    c1336a.f17497o = new ArrayList<>();
                } else {
                    if (c1336a.f17497o.contains(string)) {
                        throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("A shared element with the target name '", string, "' has already been added to the transaction."));
                    }
                    if (c1336a.f17496n.contains(strK)) {
                        throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("A shared element with the source name '", strK, "' has already been added to the transaction."));
                    }
                }
                c1336a.f17496n.add(strK);
                c1336a.f17497o.add(string);
            }
        }
        l(baseFragment);
        c1336a.e((mainActivity.E() && baseFragment.t() == Positionable$Position.f31106b) ? com.voltasit.obdeleven.R.id.mainActivity_menuContainer : com.voltasit.obdeleven.R.id.mainActivity_contentContainer, baseFragment, name);
        c1336a.c(name);
        this.f34236g.push(name);
        c1336a.i();
    }

    public final void o(boolean z10) {
        e.s("NavigationManager", "switchToMain()");
        Stack<String> stack = this.f34236g;
        boolean zIsEmpty = stack.isEmpty();
        y yVar = this.f34235f;
        MainActivity mainActivity = this.f34230a;
        if (zIsEmpty) {
            e.s("NavigationManager", "clearAllFragments()");
            stack.clear();
            i.b(yVar);
            for (Fragment fragment : yVar.f17676c.f()) {
                if (fragment instanceof com.voltasit.obdeleven.presentation.dialogs.e) {
                    e.j("NavigationManager", "Dismissing base dialog fragment: " + fragment.getClass().getCanonicalName());
                    ((com.voltasit.obdeleven.presentation.dialogs.e) fragment).y();
                }
            }
            mainActivity.getSupportFragmentManager().T(null, -1, 1);
            BaseFragment<?> mainFragment = new MainFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("setupTwoFactor", z10);
            mainFragment.setArguments(bundle);
            n(mainFragment, null);
            if (z10) {
                return;
            }
        }
        if (!mainActivity.E()) {
            i(this, MainFragment.class, true);
            return;
        }
        String strE = e();
        i.b(yVar);
        int iH = yVar.H();
        int i10 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) == null) {
            if (com.voltasit.obdeleven.ui.module.c.class.getName().equals(strE)) {
                return;
            }
            i(this, MainFragment.class, true);
            n(new com.voltasit.obdeleven.ui.module.c(), null);
            return;
        }
        if (W7.c.c() == 2) {
            if (p195p9.b.class.getName().equals(strE)) {
                return;
            }
            i(this, MainFragment.class, true);
            p195p9.b bVar = new p195p9.b();
            a2 a2Var = W7.c.f7067e;
            if (a2Var != null) {
                E e10 = a2Var.f42726c;
                i.d(e10, "getParseObject(...)");
                bVar.R(e10, false, false);
            }
            n(bVar, null);
            return;
        }
        if (!GarageFragment.class.getName().equals(strE) || iH > 2) {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            StartView startViewH = com.voltasit.obdeleven.a.C0320a.a(mainActivity).h();
            i(this, MainFragment.class, true);
            u uVar = new u(mainActivity);
            a aVar = new a();
            E e11 = (E) Application.f29634b.e(p279w9.a.f47808e);
            if ((startViewH == StartView.AUTO || startViewH == StartView.CAR) && e11 != null) {
                aVar.b(e11);
            } else {
                C2134a0.b(mainActivity, com.voltasit.obdeleven.R.string.common_loading_vehicles);
                p279w9.d.a(E.a(), p279w9.a.f47807d, new o(uVar, aVar, startViewH));
            }
        }
    }
}
