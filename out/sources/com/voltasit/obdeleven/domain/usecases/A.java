package com.voltasit.obdeleven.domain.usecases;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: UpdateControlUnitFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f30609c;

    public A(m mVar) {
        this.f30609c = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(ContinuationImpl continuationImpl) throws Throwable {
        UpdateControlUnitFaultsUseCase$execute$1 updateControlUnitFaultsUseCase$execute$1;
        final List list;
        if (continuationImpl instanceof UpdateControlUnitFaultsUseCase$execute$1) {
            updateControlUnitFaultsUseCase$execute$1 = (UpdateControlUnitFaultsUseCase$execute$1) continuationImpl;
            int i10 = updateControlUnitFaultsUseCase$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateControlUnitFaultsUseCase$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateControlUnitFaultsUseCase$execute$1 = new UpdateControlUnitFaultsUseCase$execute$1(this, continuationImpl);
            }
        } else {
            updateControlUnitFaultsUseCase$execute$1 = new UpdateControlUnitFaultsUseCase$execute$1(this, continuationImpl);
        }
        Object objH = updateControlUnitFaultsUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateControlUnitFaultsUseCase$execute$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.b.b(objH);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objH);
            }
        }
        kotlin.b.b(objH);
        updateControlUnitFaultsUseCase$execute$1.label = 1;
        objH = this.f30609c.f30863c.h(false, updateControlUnitFaultsUseCase$execute$1);
        if (objH == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) objH;
        if (aVar instanceof C8.a.b) {
            list = (List) ((C8.a.b) aVar).f2463a;
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            O.e.m(((C8.a.C0024a) aVar).f2462a);
            list = EmptyList.f42983b;
        }
        kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<com.obdeleven.service.model.ControlUnit>");
        Object obj = FaultsUtils.f29548b;
        Task taskCallInBackground = Task.callInBackground(new Callable() { // from class: com.obdeleven.service.util.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                for (ControlUnit controlUnit : list) {
                    Object obj2 = FaultsUtils.f29548b;
                    ArrayList arrayListQ = controlUnit.q();
                    i.d(arrayListQ, "getFaults(...)");
                    FaultsUtils.d(controlUnit, arrayListQ);
                }
                return Boolean.TRUE;
            }
        });
        kotlin.jvm.internal.i.d(taskCallInBackground, "callInBackground(...)");
        Sa.a aVar2 = N.f43200c;
        UpdateControlUnitFaultsUseCase$execute$2 updateControlUnitFaultsUseCase$execute$2 = new UpdateControlUnitFaultsUseCase$execute$2(taskCallInBackground, list, null);
        updateControlUnitFaultsUseCase$execute$1.label = 2;
        objH = C2680e.f(aVar2, updateControlUnitFaultsUseCase$execute$2, updateControlUnitFaultsUseCase$execute$1);
        return objH == coroutineSingletons ? coroutineSingletons : objH;
    }
}
