package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Generate2faPrivateKeyUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2125f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30990a;

    public C2125f(K8.v vVar) {
        this.f30990a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        Generate2faPrivateKeyUC$invoke$1 generate2faPrivateKeyUC$invoke$1;
        if (continuationImpl instanceof Generate2faPrivateKeyUC$invoke$1) {
            generate2faPrivateKeyUC$invoke$1 = (Generate2faPrivateKeyUC$invoke$1) continuationImpl;
            int i10 = generate2faPrivateKeyUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                generate2faPrivateKeyUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                generate2faPrivateKeyUC$invoke$1 = new Generate2faPrivateKeyUC$invoke$1(this, continuationImpl);
            }
        } else {
            generate2faPrivateKeyUC$invoke$1 = new Generate2faPrivateKeyUC$invoke$1(this, continuationImpl);
        }
        Object objR = generate2faPrivateKeyUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = generate2faPrivateKeyUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objR);
            generate2faPrivateKeyUC$invoke$1.label = 1;
            objR = this.f30990a.r(generate2faPrivateKeyUC$invoke$1);
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objR);
        }
        C8.a aVar = (C8.a) objR;
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(kotlin.collections.q.U(kotlin.text.o.q0((CharSequence) ((C8.a.b) aVar).f2463a), " ", null, null, null, 62));
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
