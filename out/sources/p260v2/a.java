package p260v2;

import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.O0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.i;
import p248u2.e;
import p293xa.d;

/* JADX INFO: compiled from: LocalSavedStateRegistryOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1099m0<e> f47628a;

    static {
        Object objA;
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            i.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            i.d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC1099m0) {
                        objA = (AbstractC1099m0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof d)) {
                    i10++;
                }
                objA = null;
                break;
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        AbstractC1099m0<e> o10 = (AbstractC1099m0) (objA instanceof Result.Failure ? null : objA);
        if (o10 == null) {
            o10 = new O0(new p163n2.b(1));
        }
        f47628a = o10;
    }
}
