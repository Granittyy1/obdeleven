package com.google.android.gms.internal.play_billing;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2002r1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f26246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f26247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2014v1 f26248d;

    public C2002r1(C2014v1 c2014v1, Comparable comparable, Object obj) {
        Objects.requireNonNull(c2014v1);
        this.f26248d = c2014v1;
        this.f26246b = comparable;
        this.f26247c = obj;
    }

    public final Comparable a() {
        return this.f26246b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f26246b.compareTo(((C2002r1) obj).f26246b);
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
        Comparable comparable = this.f26246b;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f26247c;
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
        return this.f26246b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26247c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f26246b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f26247c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = C2014v1.f26279h;
        this.f26248d.l();
        Object obj2 = this.f26247c;
        this.f26247c = obj;
        return obj2;
    }

    public final String toString() {
        return O.a.f(String.valueOf(this.f26246b), "=", String.valueOf(this.f26247c));
    }
}
