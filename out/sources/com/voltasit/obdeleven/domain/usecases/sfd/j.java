package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.p;
import androidx.compose.foundation.C0936h;
import com.voltasit.obdeleven.domain.models.Feature;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UnlockSfdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f f30954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f30955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30956c;

    public j(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar, h hVar, p pVar) {
        this.f30954a = fVar;
        this.f30955b = hVar;
        this.f30956c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, short s10, Feature feature, ContinuationImpl continuationImpl) {
        UnlockSfdUC$invoke$1 unlockSfdUC$invoke$1;
        j jVar;
        if (continuationImpl instanceof UnlockSfdUC$invoke$1) {
            unlockSfdUC$invoke$1 = (UnlockSfdUC$invoke$1) continuationImpl;
            int i10 = unlockSfdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfdUC$invoke$1 = new UnlockSfdUC$invoke$1(this, continuationImpl);
            }
        } else {
            unlockSfdUC$invoke$1 = new UnlockSfdUC$invoke$1(this, continuationImpl);
        }
        Object objA = unlockSfdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfdUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = unlockSfdUC$invoke$1.S$0;
                feature = (Feature) unlockSfdUC$invoke$1.L$2;
                str = (String) unlockSfdUC$invoke$1.L$1;
                jVar = (j) unlockSfdUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        short s11 = s10;
        this.f30956c.f("UnlockSfdUC", C0936h.d("UnlockSfdUC(cuBaseId=", str, ", klineId=", p293xa.p.a(s11), ")"));
        unlockSfdUC$invoke$1.L$0 = this;
        unlockSfdUC$invoke$1.L$1 = str;
        unlockSfdUC$invoke$1.L$2 = feature;
        unlockSfdUC$invoke$1.S$0 = s10;
        unlockSfdUC$invoke$1.label = 1;
        objA = this.f30954a.a(s11, unlockSfdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        jVar = this;
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            jVar.f30956c.d(((C8.a.C0024a) aVar).f2462a, false);
            return aVar;
        }
        unlockSfdUC$invoke$1.L$0 = null;
        unlockSfdUC$invoke$1.L$1 = null;
        unlockSfdUC$invoke$1.L$2 = null;
        unlockSfdUC$invoke$1.label = 2;
        objA = jVar.f30955b.b(str, s10, feature, unlockSfdUC$invoke$1);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
