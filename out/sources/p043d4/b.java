package p043d4;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UnityReflection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f34559a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34560b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f34561c;

    public static final void a(String str, String str2) {
        try {
            if (f34561c == null) {
                f34559a.getClass();
                f34561c = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class<?> cls = f34561c;
            if (cls == null) {
                i.m("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f34561c;
            if (cls2 != null) {
                method.invoke(cls2, "UnityFacebookSDKPlugin", str, str2);
            } else {
                i.m("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f34560b, "Failed to send message to Unity", e10);
        }
    }
}
