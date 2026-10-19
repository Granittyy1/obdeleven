package com.voltasit.obdeleven.domain.usecases.odx;

import J8.p;
import K8.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOdxListByPlatformUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30902b;

    public i(k kVar, p pVar) {
        this.f30901a = kVar;
        this.f30902b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        GetOdxListByPlatformUC$invoke$1 getOdxListByPlatformUC$invoke$1;
        if (continuationImpl instanceof GetOdxListByPlatformUC$invoke$1) {
            getOdxListByPlatformUC$invoke$1 = (GetOdxListByPlatformUC$invoke$1) continuationImpl;
            int i10 = getOdxListByPlatformUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOdxListByPlatformUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOdxListByPlatformUC$invoke$1 = new GetOdxListByPlatformUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOdxListByPlatformUC$invoke$1 = new GetOdxListByPlatformUC$invoke$1(this, continuationImpl);
        }
        Object objE = getOdxListByPlatformUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOdxListByPlatformUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objE);
            this.f30902b.f("GetOdxListUC", "GetOdxListByPlatformUC(odxName=" + str + ", odxVersion=" + str2 + ", platform=" + str3 + ")");
            if (str2.length() != 0) {
                String strSubstring = str2.substring(0, 3);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                str = str + "_" + strSubstring;
            }
            getOdxListByPlatformUC$invoke$1.label = 1;
            objE = this.f30901a.e(str, str3, getOdxListByPlatformUC$invoke$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objE);
        }
        C8.a aVar = (C8.a) objE;
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(q.h0((Iterable) ((C8.a.b) aVar).f2463a, new h()));
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
