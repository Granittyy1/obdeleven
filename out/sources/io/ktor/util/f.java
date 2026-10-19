package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.q;

/* JADX INFO: compiled from: AttributesJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<a<?>, Object> f40537a = new ConcurrentHashMap<>();

    @Override // io.ktor.util.b
    public final List a() {
        return q.o0(g().keySet());
    }

    @Override // io.ktor.util.b
    public final boolean b(a key) {
        kotlin.jvm.internal.i.e(key, "key");
        return g().containsKey(key);
    }

    @Override // io.ktor.util.b
    public final Object c(a key) {
        kotlin.jvm.internal.i.e(key, "key");
        Object objD = d(key);
        if (objD != null) {
            return objD;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    @Override // io.ktor.util.b
    public final Object d(a key) {
        kotlin.jvm.internal.i.e(key, "key");
        return g().get(key);
    }

    @Override // io.ktor.util.b
    public final <T> T e(a<T> key, Ia.a<? extends T> block) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(block, "block");
        ConcurrentHashMap<a<?>, Object> concurrentHashMap = this.f40537a;
        T t8 = (T) concurrentHashMap.get(key);
        if (t8 != null) {
            return t8;
        }
        T tInvoke = block.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent((a<?>) key, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        kotlin.jvm.internal.i.c(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // io.ktor.util.b
    public final void f(a key, Object value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        g().put(key, value);
    }

    public final Map g() {
        return this.f40537a;
    }
}
