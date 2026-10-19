package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f28974b;

    public j(Method method) {
        this.f28974b = method;
    }

    @Override // com.google.gson.internal.l
    public final <T> T a(Class<T> cls) throws Exception {
        String strA = c.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f28974b.invoke(null, cls, Object.class);
    }
}
