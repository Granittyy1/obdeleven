package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbx extends zzbq implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient zzbt f26324c;

    public zzbt A() {
        Object[] array = toArray();
        C2006t c2006t = zzbt.f26320c;
        return zzbt.B(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public zzbt k() {
        zzbt zzbtVar = this.f26324c;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzbt zzbtVarA = A();
        this.f26324c = zzbtVarA;
        return zzbtVarA;
    }
}
