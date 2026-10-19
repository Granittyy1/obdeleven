package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.M1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SavedStateViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f17782a = kotlin.collections.l.s(Application.class, K.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f17783b = M1.k(K.class);

    public static final <T> Constructor<T> a(Class<T> modelClass, List<? extends Class<?>> signature) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        kotlin.jvm.internal.i.e(signature, "signature");
        kotlin.jvm.internal.a aVarM = I2.e.m(modelClass.getConstructors());
        while (aVarM.hasNext()) {
            Constructor<T> constructor = (Constructor) aVarM.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "getParameterTypes(...)");
            List listD0 = kotlin.collections.k.d0(parameterTypes);
            if (signature.equals(listD0)) {
                return constructor;
            }
            if (signature.size() == listD0.size() && listD0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends Y> T b(Class<T> modelClass, Constructor<T> constructor, Object... objArr) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
