package R3;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {
    public static b a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof b) {
                    return (b) objNewInstance;
                }
                throw new RuntimeException(coil.intercept.a.a(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e10) {
                b(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                b(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                b(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                b(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
