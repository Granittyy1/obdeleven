package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: SetProtocolUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30821a;

    public w(J8.p pVar) {
        this.f30821a = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SetProtocolCommand.Protocol protocol, ContinuationImpl continuationImpl) {
        SetProtocolUC$invoke$1 setProtocolUC$invoke$1;
        Task<Void> taskA;
        if (continuationImpl instanceof SetProtocolUC$invoke$1) {
            setProtocolUC$invoke$1 = (SetProtocolUC$invoke$1) continuationImpl;
            int i10 = setProtocolUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                setProtocolUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                setProtocolUC$invoke$1 = new SetProtocolUC$invoke$1(this, continuationImpl);
            }
        } else {
            setProtocolUC$invoke$1 = new SetProtocolUC$invoke$1(this, continuationImpl);
        }
        Object obj = setProtocolUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = setProtocolUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            this.f30821a.f("SetProtocolUC", "SetProtocolUC(deviceProtocol=" + protocol + ")");
            taskA = new SetProtocolCommand(protocol).a();
            Sa.a aVar = N.f43200c;
            SetProtocolUC$invoke$2 setProtocolUC$invoke$2 = new SetProtocolUC$invoke$2(taskA, null);
            setProtocolUC$invoke$1.L$0 = taskA;
            setProtocolUC$invoke$1.label = 1;
            if (C2680e.f(aVar, setProtocolUC$invoke$2, setProtocolUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskA = (Task) setProtocolUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskA.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskA.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
