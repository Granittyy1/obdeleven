package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: SavedStateViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S extends a0.e implements a0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.a f17778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f17779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f17780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p248u2.c f17781e;

    public S() {
        this.f17778b = new a0.a(null);
    }

    @Override // androidx.lifecycle.a0.e
    public final void a(Y y10) {
        Lifecycle lifecycle = this.f17780d;
        if (lifecycle != null) {
            p248u2.c cVar = this.f17781e;
            kotlin.jvm.internal.i.b(cVar);
            C1370m.a(y10, cVar, lifecycle);
        }
    }

    public final Y b(Class modelClass, String str) {
        K k10;
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        Lifecycle lifecycle = this.f17780d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1358a.class.isAssignableFrom(modelClass);
        Application application = this.f17777a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? T.a(modelClass, T.f17783b) : T.a(modelClass, T.f17782a);
        if (constructorA == null) {
            if (application != null) {
                return this.f17778b.create(modelClass);
            }
            if (a0.d.f17800a == null) {
                a0.d.f17800a = new a0.d();
            }
            kotlin.jvm.internal.i.b(a0.d.f17800a);
            return H3.c.d(modelClass);
        }
        p248u2.c cVar = this.f17781e;
        kotlin.jvm.internal.i.b(cVar);
        Bundle bundleA = cVar.a(str);
        if (bundleA == null) {
            bundleA = this.f17779c;
        }
        if (bundleA == null) {
            k10 = new K();
        } else {
            ClassLoader classLoader = K.class.getClassLoader();
            kotlin.jvm.internal.i.b(classLoader);
            bundleA.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                kotlin.jvm.internal.i.b(str2);
                mapBuilder.put(str2, bundleA.get(str2));
            }
            k10 = new K(mapBuilder.k());
        }
        M m7 = new M(str, k10);
        m7.j(lifecycle, cVar);
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.f17750c || stateB.compareTo(Lifecycle.State.f17752e) >= 0) {
            cVar.d();
        } else {
            lifecycle.a(new C1371n(lifecycle, cVar));
        }
        Y yB = (!zIsAssignableFrom || application == null) ? T.b(modelClass, constructorA, k10) : T.b(modelClass, constructorA, application, k10);
        yB.addCloseable("androidx.lifecycle.savedstate.vm.tag", m7);
        return yB;
    }

    @Override // androidx.lifecycle.a0.c
    public final <T extends Y> T create(Oa.c<T> cVar, p014b1.a aVar) {
        return (T) create(p241t7.b.r(cVar), aVar);
    }

    @Override // androidx.lifecycle.a0.c
    public final <T extends Y> T create(Class<T> cls, p014b1.a extras) {
        kotlin.jvm.internal.i.e(extras, "extras");
        String str = (String) extras.a(a0.f17795b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(N.f17760a) == null || extras.a(N.f17761b) == null) {
            if (this.f17780d != null) {
                return (T) b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(a0.a.f17798d);
        boolean zIsAssignableFrom = C1358a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? T.a(cls, T.f17783b) : T.a(cls, T.f17782a);
        if (constructorA == null) {
            return (T) this.f17778b.create(cls, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) T.b(cls, constructorA, N.a(extras)) : (T) T.b(cls, constructorA, application, N.a(extras));
    }

    public S(Application application, p248u2.e owner, Bundle bundle) {
        a0.a aVar;
        kotlin.jvm.internal.i.e(owner, "owner");
        this.f17781e = owner.getSavedStateRegistry();
        this.f17780d = owner.getLifecycle();
        this.f17779c = bundle;
        this.f17777a = application;
        if (application != null) {
            if (a0.a.f17797c == null) {
                a0.a.f17797c = new a0.a(application);
            }
            aVar = a0.a.f17797c;
            kotlin.jvm.internal.i.b(aVar);
        } else {
            aVar = new a0.a(null);
        }
        this.f17778b = aVar;
    }

    @Override // androidx.lifecycle.a0.c
    public final <T extends Y> T create(Class<T> modelClass) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
