package com.voltasit.obdeleven.data.providers;

import G8.C0703e;
import V8.B;
import com.obdeleven.service.model.VehicleConnectState;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import com.voltasit.obdeleven.presentation.main.MainViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p134k8.a2;
import p255u9.E;

/* JADX INFO: compiled from: VehicleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements J8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0703e f30194b;

    public A(J8.p pVar) {
        this.f30193a = pVar;
        new LinkedHashMap();
    }

    @Override // J8.x
    public final boolean b() {
        return (W7.c.f7066d == null || W7.c.f7067e == null) ? false : true;
    }

    @Override // J8.x
    public final Object c(p109i8.e eVar, kotlin.coroutines.c<? super C8.a<Boolean>> cVar) {
        Task<Boolean> taskA = eVar.a();
        kotlin.jvm.internal.i.b(taskA);
        return C2680e.f(N.f43200c, new VehicleProviderImpl$returnBooleanResult$2(taskA, null), cVar);
    }

    @Override // J8.x
    public final boolean d() {
        return !k().f42729f;
    }

    @Override // J8.x
    public final void e() {
        VehicleConnectState[] vehicleConnectStateArr = VehicleConnectState.f29419b;
        int i10 = W7.c.f7063a;
        Task.call(new W7.b(), Task.UI_THREAD_EXECUTOR);
    }

    @Override // J8.x
    public final void f(MainViewModel.a aVar) {
        O.e.j("VehicleProviderImpl", "Adding OBDelevenStateListener (" + aVar + ")");
        W7.c.a(aVar);
        aVar.e(W7.c.c());
    }

    @Override // J8.x
    public final void g(C0703e c0703e) {
        this.f30194b = c0703e;
    }

    @Override // J8.x
    public final Object h(boolean z10, ContinuationImpl continuationImpl) {
        try {
            a2 a2VarK = k();
            O.e.j("Vehicle", "getExistingControlUnits(forceRead: " + z10 + ")");
            return C2680e.f(N.f43200c, new VehicleProviderImpl$getExistingControlUnits$2(a2VarK.c(z10).onSuccessTask(new B(5, a2VarK)), null), continuationImpl);
        } catch (VehicleNotConnectedException e10) {
            return new C8.a.C0024a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.x
    public final Object i(ContinuationImpl continuationImpl) {
        VehicleProviderImpl$getGatewayControlUnits$1 vehicleProviderImpl$getGatewayControlUnits$1;
        Task<Map<Short, com.obdeleven.service.model.f>> task;
        if (continuationImpl instanceof VehicleProviderImpl$getGatewayControlUnits$1) {
            vehicleProviderImpl$getGatewayControlUnits$1 = (VehicleProviderImpl$getGatewayControlUnits$1) continuationImpl;
            int i10 = vehicleProviderImpl$getGatewayControlUnits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleProviderImpl$getGatewayControlUnits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleProviderImpl$getGatewayControlUnits$1 = new VehicleProviderImpl$getGatewayControlUnits$1(this, continuationImpl);
            }
        } else {
            vehicleProviderImpl$getGatewayControlUnits$1 = new VehicleProviderImpl$getGatewayControlUnits$1(this, continuationImpl);
        }
        Object obj = vehicleProviderImpl$getGatewayControlUnits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleProviderImpl$getGatewayControlUnits$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Task<Map<Short, com.obdeleven.service.model.f>> taskE = k().e(false);
            Sa.a aVar = N.f43200c;
            VehicleProviderImpl$getGatewayControlUnits$2 vehicleProviderImpl$getGatewayControlUnits$2 = new VehicleProviderImpl$getGatewayControlUnits$2(taskE, null);
            vehicleProviderImpl$getGatewayControlUnits$1.L$0 = taskE;
            vehicleProviderImpl$getGatewayControlUnits$1.label = 1;
            if (C2680e.f(aVar, vehicleProviderImpl$getGatewayControlUnits$2, vehicleProviderImpl$getGatewayControlUnits$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            task = taskE;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) vehicleProviderImpl$getGatewayControlUnits$1.L$0;
            kotlin.b.b(obj);
        }
        if (!task.isFaulted()) {
            return new C8.a.b(task.getResult());
        }
        Exception error = task.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    @Override // J8.x
    public final Object j(p109i8.e eVar, kotlin.coroutines.c cVar) {
        Task<Boolean> taskK = eVar.k();
        kotlin.jvm.internal.i.b(taskK);
        return C2680e.f(N.f43200c, new VehicleProviderImpl$returnBooleanResult$2(taskK, null), cVar);
    }

    @Override // J8.x
    public final a2 k() {
        a2 a2Var = W7.c.f7067e;
        if (a2Var != null) {
            return a2Var;
        }
        throw new VehicleNotConnectedException();
    }

    @Override // J8.x
    public final void l(E vehicleDb) {
        kotlin.jvm.internal.i.e(vehicleDb, "vehicleDb");
        W7.c.h(new a2(vehicleDb));
    }

    @Override // J8.x
    public final void m() {
        a2 a2VarK = k();
        Boolean bool = Boolean.TRUE;
        a2VarK.f42727d = true;
        E e10 = a2VarK.f42726c;
        e10.put("scanned", bool);
        e10.saveInBackground();
    }

    @Override // J8.x
    public final Object n(ContinuationImpl continuationImpl) {
        return C2680e.f(N.f43200c, new VehicleProviderImpl$isPopTheHoodRequired$2(this, null), continuationImpl);
    }

    @Override // J8.x
    public final Map<Short, com.obdeleven.service.model.f> o() {
        HashMap map = k().f42725b;
        kotlin.jvm.internal.i.d(map, "getGatewayMap(...)");
        return map;
    }

    @Override // J8.x
    public final void p(W7.d dVar) {
        O.e.j("VehicleProviderImpl", "Removing OBDelevenStateListener (" + dVar + ")");
        W7.c.f(dVar);
    }

    @Override // J8.x
    public final C0703e q() {
        return this.f30194b;
    }

    @Override // J8.x
    public final boolean r() {
        a2 a2VarK = k();
        return a2VarK.h() && a2VarK.j();
    }
}
