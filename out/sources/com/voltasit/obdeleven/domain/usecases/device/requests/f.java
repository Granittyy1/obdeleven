package com.voltasit.obdeleven.domain.usecases.device.requests;

import J8.p;
import com.obdeleven.service.enums.RequestType;
import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: RequestVinOBD2UC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30816b;

    public f(p pVar, c cVar) {
        this.f30815a = pVar;
        this.f30816b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        RequestVinOBD2UC$invoke$1 requestVinOBD2UC$invoke$1;
        f fVar;
        if (continuationImpl instanceof RequestVinOBD2UC$invoke$1) {
            requestVinOBD2UC$invoke$1 = (RequestVinOBD2UC$invoke$1) continuationImpl;
            int i10 = requestVinOBD2UC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                requestVinOBD2UC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                requestVinOBD2UC$invoke$1 = new RequestVinOBD2UC$invoke$1(this, continuationImpl);
            }
        } else {
            requestVinOBD2UC$invoke$1 = new RequestVinOBD2UC$invoke$1(this, continuationImpl);
        }
        Object objA = requestVinOBD2UC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = requestVinOBD2UC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f30815a.f("RequestVinOBD2UC", "RequestVinOBD2UC()");
            String strA = RequestType.Obd2ReadVin.a();
            requestVinOBD2UC$invoke$1.L$0 = this;
            requestVinOBD2UC$invoke$1.label = 1;
            objA = this.f30816b.a(s10, strA, 0, requestVinOBD2UC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            fVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) requestVinOBD2UC$invoke$1.L$0;
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
        fVar.getClass();
        if (!m.I(str, "49", false) || str.length() <= 6) {
            return new C8.a.C0024a(new InvalidVinException(str));
        }
        String strSubstring = str.substring(6);
        i.d(strSubstring, "substring(...)");
        String strB = com.obdeleven.service.util.b.b(strSubstring);
        if (strB.length() > 17) {
            strB = strB.substring(strB.length() - 17);
            i.d(strB, "substring(...)");
        }
        return new C8.a.b(strB);
    }
}
