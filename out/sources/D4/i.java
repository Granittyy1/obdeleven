package D4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MetadataBackendRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f2797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2798c;

    /* JADX INFO: compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f2800b = null;

        public a(Context context) {
            this.f2799a = context;
        }

        public final c a(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            ServiceInfo serviceInfo;
            if (this.f2800b == null) {
                Context context = this.f2799a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (bundle == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String strTrim = str3.trim();
                                if (!strTrim.isEmpty()) {
                                    map.put(strTrim, str2.substring(8));
                                }
                            }
                        }
                    }
                    mapEmptyMap = map;
                }
                this.f2800b = mapEmptyMap;
            }
            String str4 = this.f2800b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (c) Class.forName(str4).asSubclass(c.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder("Class ");
                sb2.append(str4);
                sb2.append(" is not found.");
                return null;
            } catch (IllegalAccessException unused3) {
                StringBuilder sb3 = new StringBuilder("Could not instantiate ");
                sb3.append(str4);
                sb3.append(".");
                return null;
            } catch (InstantiationException unused4) {
                StringBuilder sb4 = new StringBuilder("Could not instantiate ");
                sb4.append(str4);
                sb4.append(".");
                return null;
            } catch (NoSuchMethodException unused5) {
                "Could not instantiate ".concat(str4);
                return null;
            } catch (InvocationTargetException unused6) {
                "Could not instantiate ".concat(str4);
                return null;
            }
        }
    }

    public i(Context context, g gVar) {
        a aVar = new a(context);
        this.f2798c = new HashMap();
        this.f2796a = aVar;
        this.f2797b = gVar;
    }

    @Override // D4.d
    public final synchronized k get(String str) {
        if (this.f2798c.containsKey(str)) {
            return (k) this.f2798c.get(str);
        }
        c cVarA = this.f2796a.a(str);
        if (cVarA == null) {
            return null;
        }
        g gVar = this.f2797b;
        k kVarCreate = cVarA.create(new b(gVar.f2792a, gVar.f2793b, gVar.f2794c, str));
        this.f2798c.put(str, kVarCreate);
        return kVarCreate;
    }
}
