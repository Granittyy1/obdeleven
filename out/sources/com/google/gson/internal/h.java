package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f28970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28971c;

    public h(Method method, Object obj) {
        this.f28970b = method;
        this.f28971c = obj;
    }

    @Override // com.google.gson.internal.l
    public final <T> T a(Class<T> cls) throws Exception {
        String strA = c.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f28970b.invoke(this.f28971c, cls);
    }
}
