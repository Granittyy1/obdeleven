package com.voltasit.obdeleven.data.providers;

import androidx.collection.Y;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.ui.dialogs.C2141e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p134k8.S0;
import p134k8.T0;

/* JADX INFO: compiled from: GatewayProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements J8.j {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.j
    public final Object a(Q8.a aVar, ContinuationImpl continuationImpl) {
        GatewayProviderImpl$autoCode$1 gatewayProviderImpl$autoCode$1;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof GatewayProviderImpl$autoCode$1) {
            gatewayProviderImpl$autoCode$1 = (GatewayProviderImpl$autoCode$1) continuationImpl;
            int i10 = gatewayProviderImpl$autoCode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gatewayProviderImpl$autoCode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                gatewayProviderImpl$autoCode$1 = new GatewayProviderImpl$autoCode$1(this, continuationImpl);
            }
        } else {
            gatewayProviderImpl$autoCode$1 = new GatewayProviderImpl$autoCode$1(this, continuationImpl);
        }
        Object obj = gatewayProviderImpl$autoCode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = gatewayProviderImpl$autoCode$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Sa.a aVar2 = N.f43200c;
            GatewayProviderImpl$autoCode$2 gatewayProviderImpl$autoCode$2 = new GatewayProviderImpl$autoCode$2(ref$ObjectRef2, aVar, null);
            gatewayProviderImpl$autoCode$1.L$0 = ref$ObjectRef2;
            gatewayProviderImpl$autoCode$1.label = 1;
            if (C2680e.f(aVar2, gatewayProviderImpl$autoCode$2, gatewayProviderImpl$autoCode$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) gatewayProviderImpl$autoCode$1.L$0;
            kotlin.b.b(obj);
        }
        return new C8.a.b(ref$ObjectRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.j
    public final Object b(com.obdeleven.service.model.f fVar, Y y10, ContinuationImpl continuationImpl) {
        GatewayProviderImpl$writeListCoding$1 gatewayProviderImpl$writeListCoding$1;
        Task taskContinueWith;
        if (continuationImpl instanceof GatewayProviderImpl$writeListCoding$1) {
            gatewayProviderImpl$writeListCoding$1 = (GatewayProviderImpl$writeListCoding$1) continuationImpl;
            int i10 = gatewayProviderImpl$writeListCoding$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gatewayProviderImpl$writeListCoding$1.label = i10 - Integer.MIN_VALUE;
            } else {
                gatewayProviderImpl$writeListCoding$1 = new GatewayProviderImpl$writeListCoding$1(this, continuationImpl);
            }
        } else {
            gatewayProviderImpl$writeListCoding$1 = new GatewayProviderImpl$writeListCoding$1(this, continuationImpl);
        }
        Object obj = gatewayProviderImpl$writeListCoding$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = gatewayProviderImpl$writeListCoding$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            O.e.j(fVar.t() + "_" + fVar.getName(), "writeGatewayCoding()");
            T0 t8 = new T0(com.google.android.gms.internal.measurement.Y.e(fVar.f29426D));
            t8.f42676b = com.google.android.gms.internal.measurement.Y.e(y10);
            O.e.j("GatewayControlUnit", "Coding before codeBytes(): ".concat(com.obdeleven.service.util.b.a(fVar.f29427E.f42685a)));
            for (int i12 = 0; i12 < y10.f(); i12++) {
                S0 s10 = (S0) y10.g(i12);
                if (s10 != null && y10.d(i12) >= 0) {
                    fVar.f29427E.a(y10.d(i12), s10.f42671c);
                }
            }
            O.e.j("GatewayControlUnit", "Coding after codeBytes(): ".concat(com.obdeleven.service.util.b.a(fVar.f29427E.f42685a)));
            taskContinueWith = fVar.Q0(com.obdeleven.service.util.b.a(fVar.f29427E.f42685a)).continueWith(new C2141e(4, t8));
            Sa.a aVar = N.f43200c;
            GatewayProviderImpl$writeListCoding$2 gatewayProviderImpl$writeListCoding$2 = new GatewayProviderImpl$writeListCoding$2(taskContinueWith, null);
            gatewayProviderImpl$writeListCoding$1.L$0 = taskContinueWith;
            gatewayProviderImpl$writeListCoding$1.label = 1;
            if (C2680e.f(aVar, gatewayProviderImpl$writeListCoding$2, gatewayProviderImpl$writeListCoding$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskContinueWith = (Task) gatewayProviderImpl$writeListCoding$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskContinueWith.isFaulted()) {
            return new C8.a.b(taskContinueWith.getResult());
        }
        Exception error = taskContinueWith.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
