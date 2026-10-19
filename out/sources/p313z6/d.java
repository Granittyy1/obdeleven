package p313z6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: KeysMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48858a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48859b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48860c;

    public d(int i10) {
        this.f48860c = i10;
    }

    public static String a(int i10, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        String strA = a(this.f48860c, str);
        if (this.f48858a.size() >= this.f48859b && !this.f48858a.containsKey(strA)) {
            return false;
        }
        String strA2 = a(this.f48860c, str2);
        String str3 = (String) this.f48858a.get(strA);
        if (str3 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str3.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        this.f48858a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f48860c, key);
                if (this.f48858a.size() < this.f48859b || this.f48858a.containsKey(strA)) {
                    String value = entry.getValue();
                    this.f48858a.put(strA, value == null ? "" : a(this.f48860c, value));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
