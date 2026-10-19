package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.enums.GatewayType;
import com.parse.ControlUnitDB;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2680e;
import p255u9.C2801d;

/* JADX INFO: compiled from: ControlUnitRepositoryWrapperImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ControlUnitRepositoryWrapperImpl implements p109i8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.d f30213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.h f30214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.g f30215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.i f30216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K8.c f30217e;

    public ControlUnitRepositoryWrapperImpl(K8.d dVar, com.voltasit.obdeleven.domain.usecases.vehicle.h hVar, com.voltasit.obdeleven.domain.usecases.vehicle.g gVar, com.voltasit.obdeleven.domain.usecases.vehicle.i iVar, K8.c cVar) {
        this.f30213a = dVar;
        this.f30214b = hVar;
        this.f30215c = gVar;
        this.f30216d = iVar;
        this.f30217e = cVar;
    }

    @Override // p109i8.g
    public final C8.a<Map<Short, C2801d>> a() {
        return (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new ControlUnitRepositoryWrapperImpl$getControlUnitBases$1(this, null));
    }

    @Override // p109i8.g
    public final void b() {
        this.f30217e.a();
    }

    @Override // p109i8.g
    public final C8.a<Map<Short, ControlUnitDB>> c() {
        return (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new ControlUnitRepositoryWrapperImpl$getExistingControlUnits$1(this, null));
    }

    @Override // p109i8.g
    public final C8.a d(ArrayList arrayList, GatewayType gatewayType, String params) {
        kotlin.jvm.internal.i.e(gatewayType, "gatewayType");
        kotlin.jvm.internal.i.e(params, "params");
        return (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1(this, arrayList, gatewayType, params, null));
    }

    @Override // p109i8.g
    public final C8.a<ControlUnitDB> e(short s10) {
        return (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1(this, s10, null));
    }
}
