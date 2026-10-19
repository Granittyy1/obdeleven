package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ReportRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReportRepositoryImpl implements K8.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30310a;

    public ReportRepositoryImpl(K8.v vVar) {
        this.f30310a = vVar;
    }

    @Override // K8.q
    public final Object a(byte[] bArr, String str, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Object objF = C2680e.f(N.f43200c, new ReportRepositoryImpl$saveReport$2(bArr, this, str, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }
}
