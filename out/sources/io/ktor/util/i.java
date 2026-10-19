package io.ktor.util;

import java.util.Map;

/* JADX INFO: compiled from: CaseInsensitiveMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<Key, Value> implements Map.Entry<Key, Value>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f40544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Value f40545c;

    public i(Key key, Value value) {
        this.f40544b = key;
        this.f40545c = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.i.a(entry.getKey(), this.f40544b) && kotlin.jvm.internal.i.a(entry.getValue(), this.f40545c);
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.f40544b;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.f40545c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Key key = this.f40544b;
        kotlin.jvm.internal.i.b(key);
        int iHashCode = key.hashCode() + 527;
        Value value = this.f40545c;
        kotlin.jvm.internal.i.b(value);
        return value.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value value) {
        this.f40545c = value;
        return value;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40544b);
        sb2.append('=');
        sb2.append(this.f40545c);
        return sb2.toString();
    }
}
