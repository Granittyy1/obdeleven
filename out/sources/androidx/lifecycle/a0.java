package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: ViewModelProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f17795b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p014b1.f f17796a;

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    public static final class b {
        public static a0 a(c0 owner, c factory, int i10) {
            if ((i10 & 2) != 0) {
                kotlin.jvm.internal.i.e(owner, "owner");
                factory = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelProviderFactory() : p040d1.b.f34479a;
            }
            kotlin.jvm.internal.i.e(owner, "owner");
            p014b1.a extras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            kotlin.jvm.internal.i.e(owner, "owner");
            kotlin.jvm.internal.i.e(factory, "factory");
            kotlin.jvm.internal.i.e(extras, "extras");
            return new a0(owner.getViewModelStore(), factory, extras);
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    public static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static d f17800a;

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T create(Class<T> modelClass) {
            kotlin.jvm.internal.i.e(modelClass, "modelClass");
            return (T) H3.c.d(modelClass);
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T create(Class<T> cls, p014b1.a extras) {
            kotlin.jvm.internal.i.e(extras, "extras");
            return (T) create(cls);
        }

        @Override // androidx.lifecycle.a0.c
        public final <T extends Y> T create(Oa.c<T> cVar, p014b1.a aVar) {
            return (T) create(p241t7.b.r(cVar), aVar);
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class f implements b1.a.b<String> {
    }

    public a0(b0 store, c factory, p014b1.a defaultCreationExtras) {
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f17796a = new p014b1.f(store, factory, defaultCreationExtras);
    }

    public final Y a(kotlin.jvm.internal.c cVar) {
        String strI = cVar.i();
        if (strI == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f17796a.a(cVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    public interface c {
        default <T extends Y> T create(Class<T> modelClass) {
            kotlin.jvm.internal.i.e(modelClass, "modelClass");
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default <T extends Y> T create(Class<T> modelClass, p014b1.a extras) {
            kotlin.jvm.internal.i.e(modelClass, "modelClass");
            kotlin.jvm.internal.i.e(extras, "extras");
            return (T) create(modelClass);
        }

        default <T extends Y> T create(Oa.c<T> modelClass, p014b1.a extras) {
            kotlin.jvm.internal.i.e(modelClass, "modelClass");
            kotlin.jvm.internal.i.e(extras, "extras");
            return (T) create(p241t7.b.r(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static a f17797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0183a f17798d = new C0183a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Application f17799b;

        /* JADX INFO: renamed from: androidx.lifecycle.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CreationExtras.kt */
        public static final class C0183a implements b1.a.b<Application> {
        }

        public a(Application application) {
            this.f17799b = application;
        }

        public final <T extends Y> T a(Class<T> cls, Application application) {
            if (!C1358a.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.i.b(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.a0.d, androidx.lifecycle.a0.c
        public final <T extends Y> T create(Class<T> cls, p014b1.a extras) {
            kotlin.jvm.internal.i.e(extras, "extras");
            if (this.f17799b != null) {
                return (T) create(cls);
            }
            Application application = (Application) extras.a(f17798d);
            if (application != null) {
                return (T) a(cls, application);
            }
            if (C1358a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) H3.c.d(cls);
        }

        @Override // androidx.lifecycle.a0.d, androidx.lifecycle.a0.c
        public final <T extends Y> T create(Class<T> modelClass) {
            kotlin.jvm.internal.i.e(modelClass, "modelClass");
            Application application = this.f17799b;
            if (application != null) {
                return (T) a(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    public static class e {
        public void a(Y y10) {
        }
    }
}
