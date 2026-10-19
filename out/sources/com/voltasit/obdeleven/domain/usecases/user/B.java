package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UpdatePersonalInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.o f30963b;

    public B(K8.v vVar, F8.d dVar, K8.o oVar) {
        this.f30962a = vVar;
        this.f30963b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(G8.G input, ContinuationImpl continuationImpl) {
        UpdatePersonalInfoUC$invoke$1 updatePersonalInfoUC$invoke$1;
        B b10;
        if (continuationImpl instanceof UpdatePersonalInfoUC$invoke$1) {
            updatePersonalInfoUC$invoke$1 = (UpdatePersonalInfoUC$invoke$1) continuationImpl;
            int i10 = updatePersonalInfoUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updatePersonalInfoUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updatePersonalInfoUC$invoke$1 = new UpdatePersonalInfoUC$invoke$1(this, continuationImpl);
            }
        } else {
            updatePersonalInfoUC$invoke$1 = new UpdatePersonalInfoUC$invoke$1(this, continuationImpl);
        }
        Object objD = updatePersonalInfoUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updatePersonalInfoUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objD);
            kotlin.jvm.internal.i.e(input, "input");
            String str = input.f3423g;
            String str2 = kotlin.text.n.S(str) ? "" : str;
            String str3 = input.f3424h;
            p316z9.q qVar = new p316z9.q(input.f3417a, input.f3418b, input.f3419c, input.f3420d, input.f3421e, input.f3422f, str2, kotlin.text.n.S(str3) ? "" : str3);
            updatePersonalInfoUC$invoke$1.L$0 = this;
            updatePersonalInfoUC$invoke$1.label = 1;
            objD = this.f30962a.d(qVar, updatePersonalInfoUC$invoke$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            b10 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b10 = (B) updatePersonalInfoUC$invoke$1.L$0;
            kotlin.b.b(objD);
        }
        C8.a aVar = (C8.a) objD;
        if (aVar instanceof C8.a.b) {
            K8.o oVar = b10.f30963b;
            oVar.P(false);
            oVar.n(false);
        } else if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        return aVar;
    }
}
