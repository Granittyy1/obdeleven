package com.voltasit.obdeleven.domain.usecases.device.requests;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: RequestVinUdsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30818b;

    public g(p pVar, c cVar) {
        this.f30817a = pVar;
        this.f30818b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        RequestVinUdsUC$invoke$1 requestVinUdsUC$invoke$1;
        if (continuationImpl instanceof RequestVinUdsUC$invoke$1) {
            requestVinUdsUC$invoke$1 = (RequestVinUdsUC$invoke$1) continuationImpl;
            int i10 = requestVinUdsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                requestVinUdsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                requestVinUdsUC$invoke$1 = new RequestVinUdsUC$invoke$1(this, continuationImpl);
            }
        } else {
            requestVinUdsUC$invoke$1 = new RequestVinUdsUC$invoke$1(this, continuationImpl);
        }
        Object objA = requestVinUdsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = requestVinUdsUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f30817a.e("RequestVinUdsUC", "RequestVinUdsUC()");
            requestVinUdsUC$invoke$1.label = 1;
            objA = this.f30818b.a(s10, "22F190", 0, requestVinUdsUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((C8.a.b) aVar).f2463a;
        if (!m.I(str, "62F190", false)) {
            return new C8.a.C0024a(new InvalidVinException(str));
        }
        String strSubstring = str.substring(6);
        i.d(strSubstring, "substring(...)");
        return new C8.a.b(com.obdeleven.service.util.b.b(strSubstring));
    }
}
