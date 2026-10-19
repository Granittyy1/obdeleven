package p165n4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BundleJSONConverter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f44877a;

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class a implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class b implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: n4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class C0510c implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class d implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class e implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class f implements h {
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // n4.c.h
        public final void a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj2 = jSONArray.get(i10);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(i.k(obj2.getClass(), "Unexpected type in an array: "));
                    }
                    arrayList.add(obj2);
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public interface h {
        void a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f44877a = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new C0510c());
        map.put(Double.class, new d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jsonObject) throws JSONException {
        i.e(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jsonObject.get(key);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) obj));
                } else {
                    h hVar = (h) f44877a.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(i.k(obj.getClass(), "Unsupported type: "));
                    }
                    i.d(key, "key");
                    hVar.a(bundle, key, obj);
                }
            }
        }
        return bundle;
    }
}
