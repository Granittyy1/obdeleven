package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.Application;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p255u9.D;

/* JADX INFO: compiled from: CacheRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements K8.b {
    @Override // K8.b
    public final <T> Map<String, T> a(p279w9.a aVar) {
        Object objC = c(aVar, false);
        return objC instanceof Map ? (Map) objC : kotlin.collections.y.p();
    }

    @Override // K8.b
    public final void b(D d10) {
        p279w9.a aVar = p279w9.a.f47818p;
        String objectId = d10.getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        d(aVar, objectId, d10);
    }

    @Override // K8.b
    public final Object c(p279w9.a aVar, boolean z10) {
        return Application.f29634b.f(aVar, z10);
    }

    @Override // K8.b
    public final <T> void d(p279w9.a aVar, String mapKey, T t8) {
        kotlin.jvm.internal.i.e(mapKey, "mapKey");
        LinkedHashMap linkedHashMapY = kotlin.collections.y.y(a(aVar));
        linkedHashMapY.put(mapKey, t8);
        j(aVar, linkedHashMapY);
    }

    @Override // K8.b
    public final <T> List<T> e(p279w9.a aVar) {
        Object objC = c(aVar, false);
        return objC instanceof List ? (List) objC : EmptyList.f42983b;
    }

    @Override // K8.b
    public final void f() {
        Application.f29634b.c(p279w9.a.f47814l);
    }

    @Override // K8.b
    public final void g(p279w9.a aVar) {
        Application.f29634b.a(aVar);
    }

    @Override // K8.b
    public final void h() {
        p279w9.b bVar = Application.f29634b;
        Application.f29634b.b();
    }

    @Override // K8.b
    public final void i() {
        p279w9.b bVar = Application.f29634b;
        Application.f29634b.d();
    }

    @Override // K8.b
    public final void j(p279w9.a key, Object item) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(item, "item");
        p279w9.b bVar = Application.f29634b;
        Application.f29634b.h(key, item);
    }

    @Override // K8.b
    public final boolean k(String str) {
        Boolean bool = (Boolean) Application.f29634b.e(new p279w9.a("CONTROL_UNIT_SCAN_FREEZE_FRAME".concat(str), 3600000L));
        return bool != null && bool.booleanValue();
    }

    @Override // K8.b
    public final Object l(String mapKey) {
        p279w9.a aVar = p279w9.a.f47818p;
        kotlin.jvm.internal.i.e(mapKey, "mapKey");
        return a(aVar).get(mapKey);
    }

    @Override // K8.b
    public final boolean m() {
        return Application.f29634b.g(p279w9.a.f47806c);
    }
}
