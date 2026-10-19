package J2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: WebViewGlueCommunicator.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f3965a = new l(b.f3966a.getWebkitToCompatConverter());
    }

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f3966a;

        static {
            i cVar;
            try {
                WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) Bb.a.a(WebViewProviderFactoryBoundaryInterface.class, h.a());
                j jVar = new j();
                jVar.f3967a = webViewProviderFactoryBoundaryInterface;
                cVar = jVar;
            } catch (ClassNotFoundException unused) {
                cVar = new c();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
            f3966a = cVar;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
