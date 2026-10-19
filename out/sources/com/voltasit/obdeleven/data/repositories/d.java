package com.voltasit.obdeleven.data.repositories;

import com.parse.ControlUnitDB;
import java.util.Map;

/* JADX INFO: compiled from: ConnectedControlUnitRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements K8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Short, ? extends ControlUnitDB> f30337a;

    @Override // K8.c
    public final void a() {
        this.f30337a = null;
    }

    @Override // K8.c
    public final void b(Map<Short, ? extends ControlUnitDB> controlUnitMap) {
        kotlin.jvm.internal.i.e(controlUnitMap, "controlUnitMap");
        this.f30337a = controlUnitMap;
    }

    @Override // K8.c
    public final Map<Short, ControlUnitDB> c() {
        return this.f30337a;
    }
}
