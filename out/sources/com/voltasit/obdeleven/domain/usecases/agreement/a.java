package com.voltasit.obdeleven.domain.usecases.agreement;

import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.domain.models.AgreementType;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOcaAgreementUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgreementRepository f30635a;

    public a(AgreementRepository agreementRepository) {
        this.f30635a = agreementRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetOcaAgreementUC$invoke$1 getOcaAgreementUC$invoke$1;
        if (continuationImpl instanceof GetOcaAgreementUC$invoke$1) {
            getOcaAgreementUC$invoke$1 = (GetOcaAgreementUC$invoke$1) continuationImpl;
            int i10 = getOcaAgreementUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOcaAgreementUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOcaAgreementUC$invoke$1 = new GetOcaAgreementUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOcaAgreementUC$invoke$1 = new GetOcaAgreementUC$invoke$1(this, continuationImpl);
        }
        Object objJ = getOcaAgreementUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOcaAgreementUC$invoke$1.label;
        if (i11 == 0) {
            b.b(objJ);
            List listK = M1.k(AgreementType.OCA_AGREEMENT);
            getOcaAgreementUC$invoke$1.label = 1;
            objJ = this.f30635a.j(listK, getOcaAgreementUC$invoke$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(objJ);
        }
        C8.a aVar = (C8.a) objJ;
        if (aVar instanceof C8.a.b) {
            C8.a.b bVar = (C8.a.b) aVar;
            return ((List) bVar.f2463a).isEmpty() ? new C8.a.C0024a(new AgreementRepository.AgreementNotFound()) : new C8.a.b(((List) bVar.f2463a).get(0));
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
