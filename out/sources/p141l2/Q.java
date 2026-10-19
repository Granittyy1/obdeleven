package p141l2;

import androidx.compose.foundation.gestures.d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NavigatorProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f44272b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f44273a = new LinkedHashMap();

    /* JADX INFO: compiled from: NavigatorProvider.android.kt */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = Q.f44272b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                P.b bVar = (P.b) cls.getAnnotation(P.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            i.b(strValue);
            return strValue;
        }
    }

    public final void a(P navigator) {
        i.e(navigator, "navigator");
        String strA = a.a(navigator.getClass());
        if (strA.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f44273a;
        P p10 = (P) linkedHashMap.get(strA);
        if (i.a(p10, navigator)) {
            return;
        }
        boolean z10 = false;
        if (p10 != null && p10.f44271b) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + p10).toString());
        }
        if (!navigator.f44271b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final <T extends P<?>> T b(String name) {
        i.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t8 = (T) this.f44273a.get(name);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException(d.b("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
