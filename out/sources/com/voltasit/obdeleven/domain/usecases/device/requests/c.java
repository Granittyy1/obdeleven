package com.voltasit.obdeleven.domain.usecases.device.requests;

import J8.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.I;

/* JADX INFO: compiled from: RequestUdsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.p f30810b;

    public c(p pVar, com.voltasit.obdeleven.domain.usecases.device.p pVar2) {
        this.f30809a = pVar;
        this.f30810b = pVar2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, String str, int i10, ContinuationImpl continuationImpl) {
        RequestUdsUC$invoke$1 requestUdsUC$invoke$1;
        c cVar;
        short s11;
        int i11;
        String str2;
        if (continuationImpl instanceof RequestUdsUC$invoke$1) {
            requestUdsUC$invoke$1 = (RequestUdsUC$invoke$1) continuationImpl;
            int i12 = requestUdsUC$invoke$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                requestUdsUC$invoke$1.label = i12 - Integer.MIN_VALUE;
            } else {
                requestUdsUC$invoke$1 = new RequestUdsUC$invoke$1(this, continuationImpl);
            }
        } else {
            requestUdsUC$invoke$1 = new RequestUdsUC$invoke$1(this, continuationImpl);
        }
        Object objA = requestUdsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = requestUdsUC$invoke$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                i10 = requestUdsUC$invoke$1.I$0;
                s10 = requestUdsUC$invoke$1.S$0;
                str = (String) requestUdsUC$invoke$1.L$1;
                cVar = (c) requestUdsUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else if (i13 == 2) {
                i11 = requestUdsUC$invoke$1.I$0;
                s11 = requestUdsUC$invoke$1.S$0;
                str2 = (String) requestUdsUC$invoke$1.L$1;
                cVar = (c) requestUdsUC$invoke$1.L$0;
                kotlin.b.b(objA);
                requestUdsUC$invoke$1.L$0 = null;
                requestUdsUC$invoke$1.L$1 = null;
                requestUdsUC$invoke$1.label = 3;
                objA = cVar.a(s11, str2, i11 + 1, requestUdsUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return objA;
        }
        kotlin.b.b(objA);
        this.f30809a.f("RequestUdsUC", "RequestUdsUC()");
        requestUdsUC$invoke$1.L$0 = this;
        requestUdsUC$invoke$1.L$1 = str;
        requestUdsUC$invoke$1.S$0 = s10;
        requestUdsUC$invoke$1.I$0 = i10;
        requestUdsUC$invoke$1.label = 1;
        objA = this.f30810b.a(str, requestUdsUC$invoke$1, s10);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar = this;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str3 = (String) ((C8.a.b) aVar).f2463a;
        String strSubstring = str3.substring(0, 2);
        i.d(strSubstring, "substring(...)");
        O.h.c(16);
        if (Integer.parseInt(strSubstring, 16) == 127) {
            String strSubstring2 = str3.substring(4, 6);
            i.d(strSubstring2, "substring(...)");
            O.h.c(16);
            int i14 = Integer.parseInt(strSubstring2, 16);
            if ((i14 == 33 || i14 == 35) && i10 < 3) {
                requestUdsUC$invoke$1.L$0 = cVar;
                requestUdsUC$invoke$1.L$1 = str;
                requestUdsUC$invoke$1.S$0 = s10;
                requestUdsUC$invoke$1.I$0 = i10;
                requestUdsUC$invoke$1.label = 2;
                if (I.b(1000L, requestUdsUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str4 = str;
                s11 = s10;
                i11 = i10;
                str2 = str4;
                requestUdsUC$invoke$1.L$0 = null;
                requestUdsUC$invoke$1.L$1 = null;
                requestUdsUC$invoke$1.label = 3;
                objA = cVar.a(s11, str2, i11 + 1, requestUdsUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objA;
            }
        }
        return new C8.a.b(str3);
    }
}
