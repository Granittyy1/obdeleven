package Z0;

import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.O0;
import androidx.lifecycle.InterfaceC1376t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.internal.i;
import p293xa.d;

/* JADX INFO: compiled from: LocalLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1099m0<InterfaceC1376t> f7676a;

    static {
        Object objA;
        try {
            ClassLoader classLoader = InterfaceC1376t.class.getClassLoader();
            i.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
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
            objA = kotlin.b.a(th);
        }
        AbstractC1099m0<InterfaceC1376t> o10 = (AbstractC1099m0) (objA instanceof Result.Failure ? null : objA);
        if (o10 == null) {
            o10 = new O0(new a(0));
        }
        f7676a = o10;
    }
}
