package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.presentation.models.StartView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: LogOutUserUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.o f31020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.b f31021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f31022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.sharednetwork.dataSources.a f31023d;

    public u(K8.o oVar, K8.b bVar, z zVar, com.voltasit.sharednetwork.dataSources.a aVar) {
        this.f31020a = oVar;
        this.f31021b = bVar;
        this.f31022c = zVar;
        this.f31023d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        LogOutUserUC$invoke$1 logOutUserUC$invoke$1;
        u uVar;
        u uVar2;
        if (continuationImpl instanceof LogOutUserUC$invoke$1) {
            logOutUserUC$invoke$1 = (LogOutUserUC$invoke$1) continuationImpl;
            int i10 = logOutUserUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                logOutUserUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                logOutUserUC$invoke$1 = new LogOutUserUC$invoke$1(this, continuationImpl);
            }
        } else {
            logOutUserUC$invoke$1 = new LogOutUserUC$invoke$1(this, continuationImpl);
        }
        Object obj = logOutUserUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = logOutUserUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                uVar = (u) logOutUserUC$invoke$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar2 = (u) logOutUserUC$invoke$1.L$0;
                kotlin.b.b(obj);
            }
            uVar2.f31023d.a(null);
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        Sa.a aVar = N.f43200c;
        LogOutUserUC$invoke$2 logOutUserUC$invoke$2 = new LogOutUserUC$invoke$2(2, null);
        logOutUserUC$invoke$1.L$0 = this;
        logOutUserUC$invoke$1.label = 1;
        if (C2680e.f(aVar, logOutUserUC$invoke$2, logOutUserUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        uVar = this;
        uVar.f31020a.O(StartView.AUTO);
        uVar.f31020a.M("");
        uVar.f31021b.h();
        logOutUserUC$invoke$1.L$0 = uVar;
        logOutUserUC$invoke$1.label = 2;
        if (uVar.f31022c.a(logOutUserUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        uVar2 = uVar;
        uVar2.f31023d.a(null);
        return p293xa.r.f47939a;
    }
}
