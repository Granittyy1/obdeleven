package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbw implements Map, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient zzbx f26321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient zzbx f26322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient zzbq f26323d;

    public static void a() {
        zzcf.b(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", zzil.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzil.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzil.ALTERNATIVE_BILLING_ACTION}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzbq zzbqVar = this.f26323d;
        if (zzbqVar == null) {
            zzcf zzcfVar = (zzcf) this;
            zzce zzceVar = new zzce(1, zzcfVar.f26339g, zzcfVar.f26338f);
            this.f26323d = zzceVar;
            zzbqVar = zzceVar;
        }
        return zzbqVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzbx zzbxVar = this.f26321b;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzcf zzcfVar = (zzcf) this;
        zzcc zzccVar = new zzcc(zzcfVar, zzcfVar.f26338f, zzcfVar.f26339g);
        this.f26321b = zzccVar;
        return zzccVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzbx zzbxVar = this.f26321b;
        if (zzbxVar == null) {
            zzcf zzcfVar = (zzcf) this;
            zzcc zzccVar = new zzcc(zzcfVar, zzcfVar.f26338f, zzcfVar.f26339g);
            this.f26321b = zzccVar;
            zzbxVar = zzccVar;
        }
        Iterator it = zzbxVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzbx zzbxVar = this.f26322c;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        zzcf zzcfVar = (zzcf) this;
        zzcd zzcdVar = new zzcd(zzcfVar, new zzce(0, zzcfVar.f26339g, zzcfVar.f26338f));
        this.f26322c = zzcdVar;
        return zzcdVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(J4.i.b(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzbq zzbqVar = this.f26323d;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzcf zzcfVar = (zzcf) this;
        zzce zzceVar = new zzce(1, zzcfVar.f26339g, zzcfVar.f26338f);
        this.f26323d = zzceVar;
        return zzceVar;
    }
}
