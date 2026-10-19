package com.voltasit.obdeleven.domain.usecases.bonus;

import K8.f;
import com.voltasit.obdeleven.domain.exceptions.EmailEmptyException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.n;

/* JADX INFO: compiled from: GetDeviceEmailUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f30640a;

    public b(f fVar) {
        this.f30640a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetDeviceEmailUC$invoke$1 getDeviceEmailUC$invoke$1;
        if (continuationImpl instanceof GetDeviceEmailUC$invoke$1) {
            getDeviceEmailUC$invoke$1 = (GetDeviceEmailUC$invoke$1) continuationImpl;
            int i10 = getDeviceEmailUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getDeviceEmailUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getDeviceEmailUC$invoke$1 = new GetDeviceEmailUC$invoke$1(this, continuationImpl);
            }
        } else {
            getDeviceEmailUC$invoke$1 = new GetDeviceEmailUC$invoke$1(this, continuationImpl);
        }
        Object objF = getDeviceEmailUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getDeviceEmailUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            getDeviceEmailUC$invoke$1.label = 1;
            objF = this.f30640a.f(str, getDeviceEmailUC$invoke$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objF);
        }
        C8.a aVar = (C8.a) objF;
        if (aVar instanceof C8.a.b) {
            return n.S((CharSequence) ((C8.a.b) aVar).f2463a) ? new C8.a.C0024a(EmailEmptyException.f30401b) : aVar;
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
