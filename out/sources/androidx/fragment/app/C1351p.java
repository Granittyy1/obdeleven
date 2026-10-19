package androidx.fragment.app;

import androidx.collection.X;

/* JADX INFO: renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C1351p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X<ClassLoader, X<String, Class<?>>> f17630a = new X<>();

    public static Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        X<ClassLoader, X<String, Class<?>>> x10 = f17630a;
        X<String, Class<?>> x11 = x10.get(classLoader);
        if (x11 == null) {
            x11 = new X<>();
            x10.put(classLoader, x11);
        }
        Class<?> cls = x11.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        x11.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }
}
