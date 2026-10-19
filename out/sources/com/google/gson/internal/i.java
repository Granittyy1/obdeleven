package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f28972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28973c;

    public i(Method method, int i10) {
        this.f28972b = method;
        this.f28973c = i10;
    }

    @Override // com.google.gson.internal.l
    public final <T> T a(Class<T> cls) throws Exception {
        String strA = c.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f28972b.invoke(null, cls, Integer.valueOf(this.f28973c));
    }
}
