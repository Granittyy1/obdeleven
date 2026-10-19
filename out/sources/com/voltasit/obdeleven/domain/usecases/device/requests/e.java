package com.voltasit.obdeleven.domain.usecases.device.requests;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: RequestVinKwp2000UC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30814b;

    public e(p pVar, b bVar) {
        this.f30813a = pVar;
        this.f30814b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        RequestVinKwp2000UC$invoke$1 requestVinKwp2000UC$invoke$1;
        e eVar;
        C8.a aVar;
        String str;
        if (continuationImpl instanceof RequestVinKwp2000UC$invoke$1) {
            requestVinKwp2000UC$invoke$1 = (RequestVinKwp2000UC$invoke$1) continuationImpl;
            int i10 = requestVinKwp2000UC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                requestVinKwp2000UC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                requestVinKwp2000UC$invoke$1 = new RequestVinKwp2000UC$invoke$1(this, continuationImpl);
            }
        } else {
            requestVinKwp2000UC$invoke$1 = new RequestVinKwp2000UC$invoke$1(this, continuationImpl);
        }
        Object objA = requestVinKwp2000UC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = requestVinKwp2000UC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = requestVinKwp2000UC$invoke$1.S$0;
                eVar = (e) requestVinKwp2000UC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            aVar = (C8.a) objA;
            if (aVar instanceof C8.a.b) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            str = (String) ((C8.a.b) aVar).f2463a;
            if (m.I(str, "62F190", false)) {
                return new C8.a.C0024a(new InvalidVinException(str));
            }
            String strSubstring = str.substring(6);
            i.d(strSubstring, "substring(...)");
            return new C8.a.b(com.obdeleven.service.util.b.b(strSubstring));
        }
        kotlin.b.b(objA);
        this.f30813a.e("RequestVinKwp2000UC", "RequestVinKwp2000UC()");
        requestVinKwp2000UC$invoke$1.L$0 = this;
        requestVinKwp2000UC$invoke$1.S$0 = s10;
        requestVinKwp2000UC$invoke$1.label = 1;
        objA = this.f30814b.a(s10, "1A90", 0, requestVinKwp2000UC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        eVar = this;
        C8.a aVar2 = (C8.a) objA;
        if (!(aVar2 instanceof C8.a.b)) {
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) ((C8.a.b) aVar2).f2463a;
        if (m.I(str2, "5A90", false)) {
            String strSubstring2 = str2.substring(4);
            i.d(strSubstring2, "substring(...)");
            return new C8.a.b(com.obdeleven.service.util.b.b(strSubstring2));
        }
        requestVinKwp2000UC$invoke$1.L$0 = null;
        requestVinKwp2000UC$invoke$1.label = 2;
        objA = eVar.f30814b.a(s10, "22F190", 0, requestVinKwp2000UC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        str = (String) ((C8.a.b) aVar).f2463a;
        if (m.I(str, "62F190", false)) {
            return new C8.a.C0024a(new InvalidVinException(str));
        }
        String strSubstring3 = str.substring(6);
        i.d(strSubstring3, "substring(...)");
        return new C8.a.b(com.obdeleven.service.util.b.b(strSubstring3));
    }
}
