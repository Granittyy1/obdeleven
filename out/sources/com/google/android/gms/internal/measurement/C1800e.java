package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1800e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableSet<String> f25680d = ImmutableSet.B(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25683c;

    public C1800e(String str, long j, HashMap map) {
        this.f25681a = str;
        this.f25682b = j;
        HashMap map2 = new HashMap();
        this.f25683c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object a(Object obj, Object obj2, String str) {
        if (f25680d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            return ((obj instanceof String) || obj == null) ? obj2 : obj;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        return obj instanceof String ? obj2.toString() : obj2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new C1800e(this.f25681a, this.f25682b, new HashMap(this.f25683c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1800e)) {
            return false;
        }
        C1800e c1800e = (C1800e) obj;
        if (this.f25682b == c1800e.f25682b && this.f25681a.equals(c1800e.f25681a)) {
            return this.f25683c.equals(c1800e.f25683c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f25681a.hashCode() * 31;
        long j = this.f25682b;
        return this.f25683c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f25681a;
        String strValueOf = String.valueOf(this.f25683c);
        StringBuilder sbA = C7.g.a("Event{name='", str, "', timestamp=");
        sbA.append(this.f25682b);
        sbA.append(", params=");
        sbA.append(strValueOf);
        sbA.append("}");
        return sbA.toString();
    }
}
