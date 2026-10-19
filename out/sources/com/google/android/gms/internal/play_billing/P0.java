package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 implements Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map.Entry f26150b;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26150b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((R0) this.f26150b.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC1967f1)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        R0 r10 = (R0) this.f26150b.getValue();
        InterfaceC1967f1 interfaceC1967f1 = r10.f26155a;
        r10.f26156b = null;
        r10.f26155a = (InterfaceC1967f1) obj;
        return interfaceC1967f1;
    }
}
