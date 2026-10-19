package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ReportErrorUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.g f31038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.q f31039b;

    public v(K8.g gVar, K8.q qVar) {
        this.f31038a = gVar;
        this.f31039b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ReportErrorUC$invoke$1 reportErrorUC$invoke$1;
        v vVar;
        if (continuationImpl instanceof ReportErrorUC$invoke$1) {
            reportErrorUC$invoke$1 = (ReportErrorUC$invoke$1) continuationImpl;
            int i10 = reportErrorUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                reportErrorUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                reportErrorUC$invoke$1 = new ReportErrorUC$invoke$1(this, continuationImpl);
            }
        } else {
            reportErrorUC$invoke$1 = new ReportErrorUC$invoke$1(this, continuationImpl);
        }
        Object objC = reportErrorUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = reportErrorUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) reportErrorUC$invoke$1.L$1;
                vVar = (v) reportErrorUC$invoke$1.L$0;
                kotlin.b.b(objC);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objC);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(objC);
        reportErrorUC$invoke$1.L$0 = this;
        reportErrorUC$invoke$1.L$1 = str;
        reportErrorUC$invoke$1.label = 1;
        objC = this.f31038a.c(reportErrorUC$invoke$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        vVar = this;
        K8.q qVar = vVar.f31039b;
        reportErrorUC$invoke$1.L$0 = null;
        reportErrorUC$invoke$1.L$1 = null;
        reportErrorUC$invoke$1.label = 2;
        if (qVar.a((byte[]) objC, str, reportErrorUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
