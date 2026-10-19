package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: compiled from: Reflection.java */
    public static final class a extends s {
        @Override // retrofit2.s
        public final Object b(Class cls, Object obj, Method method, Object[] objArr) throws Throwable {
            return j.a(cls, obj, method, objArr);
        }

        @Override // retrofit2.s
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: compiled from: Reflection.java */
    public static class b extends s {
        @Override // retrofit2.s
        public final String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.s
        public final Object b(Class cls, Object obj, Method method, Object[] objArr) throws Throwable {
            return j.a(cls, obj, method, objArr);
        }

        @Override // retrofit2.s
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    public Object b(Class cls, Object obj, Method method, Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
