package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1353s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f17639b;

    /* JADX INFO: renamed from: androidx.fragment.app.s$a */
    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y.m f17640a;

        public a(y.m mVar) {
            this.f17640a = mVar;
        }
    }

    public C1353s(y fragmentManager) {
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        this.f17638a = fragmentManager;
        this.f17639b = new CopyOnWriteArrayList<>();
    }

    public final void a(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.a(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void b(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        y yVar = this.f17638a;
        ActivityC1347l activityC1347l = yVar.f17696x.f17632c;
        Fragment fragment = yVar.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.b(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void c(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.c(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void d(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.d(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void e(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.e(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void f(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        y yVar = this.f17638a;
        Fragment fragment = yVar.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.f(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            aVar.f17640a.a(yVar, f10);
        }
    }

    public final void g(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        y yVar = this.f17638a;
        ActivityC1347l activityC1347l = yVar.f17696x.f17632c;
        Fragment fragment = yVar.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.g(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void h(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.h(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void i(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        y yVar = this.f17638a;
        Fragment fragment = yVar.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.i(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            aVar.f17640a.b(yVar, f10);
        }
    }

    public final void j(Fragment f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.j(f10, bundle, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void k(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.k(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void l(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.l(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }

    public final void m(Fragment f10, View v10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        kotlin.jvm.internal.i.e(v10, "v");
        y yVar = this.f17638a;
        Fragment fragment = yVar.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.m(f10, v10, bundle, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            aVar.f17640a.c(yVar, f10, v10);
        }
    }

    public final void n(Fragment f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        Fragment fragment = this.f17638a.f17698z;
        if (fragment != null) {
            y parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.i.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f17688p.n(f10, true);
        }
        for (a aVar : this.f17639b) {
            if (z10) {
                aVar.getClass();
            }
            y.m mVar = aVar.f17640a;
        }
    }
}
