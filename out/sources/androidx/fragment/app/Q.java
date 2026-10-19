package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC1369l, p248u2.e, c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fragment f17526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f17527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T5.h f17528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0.c f17529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1378v f17530f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p248u2.d f17531g = null;

    public Q(Fragment fragment, b0 b0Var, T5.h hVar) {
        this.f17526b = fragment;
        this.f17527c = b0Var;
        this.f17528d = hVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f17530f.f(event);
    }

    public final void b() {
        if (this.f17530f == null) {
            this.f17530f = new C1378v(this);
            p248u2.d dVar = new p248u2.d(new p273w2.b(this, new io.intercom.android.sdk.ui.preview.ui.c(this, 1)));
            this.f17531g = dVar;
            dVar.a();
            this.f17528d.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public final p014b1.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f17526b;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        p014b1.d dVar = new p014b1.d((Object) null);
        LinkedHashMap linkedHashMap = dVar.f20497a;
        if (application != null) {
            linkedHashMap.put(a0.a.f17798d, application);
        }
        linkedHashMap.put(androidx.lifecycle.N.f17760a, fragment);
        linkedHashMap.put(androidx.lifecycle.N.f17761b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.N.f17762c, fragment.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public final a0.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f17526b;
        a0.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f17529e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f17529e == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f17529e = new androidx.lifecycle.S(application, fragment, fragment.getArguments());
        }
        return this.f17529e;
    }

    @Override // androidx.lifecycle.InterfaceC1376t
    public final Lifecycle getLifecycle() {
        b();
        return this.f17530f;
    }

    @Override // p248u2.e
    public final p248u2.c getSavedStateRegistry() {
        b();
        return this.f17531g.f47417b;
    }

    @Override // androidx.lifecycle.c0
    public final b0 getViewModelStore() {
        b();
        return this.f17527c;
    }
}
