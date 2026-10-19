package io.grpc;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: Attributes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36932b = new a(new IdentityHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap<b<?>, Object> f36933a;

    /* JADX INFO: renamed from: io.grpc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Attributes.java */
    public static final class C0387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f36934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IdentityHashMap<b<?>, Object> f36935b;

        public C0387a(a aVar) {
            this.f36934a = aVar;
        }

        public final a a() {
            if (this.f36935b != null) {
                for (Map.Entry<b<?>, Object> entry : this.f36934a.f36933a.entrySet()) {
                    if (!this.f36935b.containsKey(entry.getKey())) {
                        this.f36935b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f36934a = new a(this.f36935b);
                this.f36935b = null;
            }
            return this.f36934a;
        }

        public final void b(b bVar, Object obj) {
            if (this.f36935b == null) {
                this.f36935b = new IdentityHashMap<>(1);
            }
            this.f36935b.put(bVar, obj);
        }
    }

    /* JADX INFO: compiled from: Attributes.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36936a;

        public b(String str) {
            this.f36936a = str;
        }

        public final String toString() {
            return this.f36936a;
        }
    }

    public a(IdentityHashMap<b<?>, Object> identityHashMap) {
        this.f36933a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap<b<?>, Object> identityHashMap = this.f36933a;
        int size = identityHashMap.size();
        IdentityHashMap<b<?>, Object> identityHashMap2 = ((a) obj).f36933a;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry<b<?>, Object> entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !C.j(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<b<?>, Object> entry : this.f36933a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f36933a.toString();
    }
}
