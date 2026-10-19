package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class N3 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f25533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F3 f25535d;

    public N3(F3 f10, Comparable comparable, Object obj) {
        this.f25535d = f10;
        this.f25533b = comparable;
        this.f25534c = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f25533b.compareTo(((N3) obj).f25533b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f25533b;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f25534c;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f25533b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25534c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f25533b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f25534c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = F3.f25442h;
        this.f25535d.l();
        Object obj2 = this.f25534c;
        this.f25534c = obj;
        return obj2;
    }

    public final String toString() {
        return O.a.f(String.valueOf(this.f25533b), "=", String.valueOf(this.f25534c));
    }
}
