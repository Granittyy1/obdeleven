package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class W2<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry<K, X2> f25624b;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f25624b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f25624b.getValue() == null) {
            return null;
        }
        int i10 = X2.f25636c;
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC1894r3)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        X2 value = this.f25624b.getValue();
        InterfaceC1894r3 interfaceC1894r3 = value.f25657a;
        value.f25658b = null;
        value.f25657a = (InterfaceC1894r3) obj;
        return interfaceC1894r3;
    }
}
