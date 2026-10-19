package com.voltasit.obdeleven.data.repositories;

import A8.C0605a;
import G8.C0699a;
import com.voltasit.obdeleven.domain.models.AgreementType;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C;
import p304y9.C2823b;

/* JADX INFO: compiled from: AgreementRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements AgreementRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0605a f30331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30332c;

    public a(com.voltasit.sharednetwork.a aVar, C c10, C0605a c0605a, F8.c cVar) {
        this.f30330a = aVar;
        this.f30331b = c0605a;
        this.f30332c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.obdeleven.domain.repositories.AgreementRepository
    public final Object i(int i10, ContinuationImpl continuationImpl) {
        AgreementRepositoryImpl$signAgreement$1 agreementRepositoryImpl$signAgreement$1;
        a aVar;
        if (continuationImpl instanceof AgreementRepositoryImpl$signAgreement$1) {
            agreementRepositoryImpl$signAgreement$1 = (AgreementRepositoryImpl$signAgreement$1) continuationImpl;
            int i11 = agreementRepositoryImpl$signAgreement$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                agreementRepositoryImpl$signAgreement$1.label = i11 - Integer.MIN_VALUE;
            } else {
                agreementRepositoryImpl$signAgreement$1 = new AgreementRepositoryImpl$signAgreement$1(this, continuationImpl);
            }
        } else {
            agreementRepositoryImpl$signAgreement$1 = new AgreementRepositoryImpl$signAgreement$1(this, continuationImpl);
        }
        Object obj = agreementRepositoryImpl$signAgreement$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = agreementRepositoryImpl$signAgreement$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            try {
                com.voltasit.sharednetwork.a aVar2 = this.f30330a;
                agreementRepositoryImpl$signAgreement$1.L$0 = this;
                agreementRepositoryImpl$signAgreement$1.label = 1;
                if (aVar2.i(i10, agreementRepositoryImpl$signAgreement$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = this;
            } catch (Throwable th) {
                th = th;
                aVar = this;
                return E8.a.i(aVar.f30332c.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) agreementRepositoryImpl$signAgreement$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(aVar.f30332c.a(th));
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.voltasit.obdeleven.domain.repositories.AgreementRepository
    public final Object j(List list, ContinuationImpl continuationImpl) {
        AgreementRepositoryImpl$getAgreements$1 agreementRepositoryImpl$getAgreements$1;
        a aVar;
        AgreementType agreementType;
        if (continuationImpl instanceof AgreementRepositoryImpl$getAgreements$1) {
            agreementRepositoryImpl$getAgreements$1 = (AgreementRepositoryImpl$getAgreements$1) continuationImpl;
            int i10 = agreementRepositoryImpl$getAgreements$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                agreementRepositoryImpl$getAgreements$1.label = i10 - Integer.MIN_VALUE;
            } else {
                agreementRepositoryImpl$getAgreements$1 = new AgreementRepositoryImpl$getAgreements$1(this, continuationImpl);
            }
        } else {
            agreementRepositoryImpl$getAgreements$1 = new AgreementRepositoryImpl$getAgreements$1(this, continuationImpl);
        }
        Object objN = agreementRepositoryImpl$getAgreements$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = agreementRepositoryImpl$getAgreements$1.label;
        if (i11 == 0) {
            kotlin.b.b(objN);
            try {
                com.voltasit.sharednetwork.a aVar2 = this.f30330a;
                C2823b c2823bS = C.s(list);
                agreementRepositoryImpl$getAgreements$1.L$0 = this;
                agreementRepositoryImpl$getAgreements$1.label = 1;
                objN = aVar2.N(c2823bS, agreementRepositoryImpl$getAgreements$1);
                if (objN == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = this;
            } catch (Throwable th) {
                th = th;
                aVar = this;
                return E8.a.i(aVar.f30332c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) agreementRepositoryImpl$getAgreements$1.L$0;
            try {
                kotlin.b.b(objN);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(aVar.f30332c.a(th));
            }
        }
        List<p304y9.q> list2 = (List) objN;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
        for (p304y9.q input : list2) {
            C0605a c0605a = aVar.f30331b;
            kotlin.jvm.internal.i.e(input, "input");
            AgreementType.f30442b.getClass();
            AgreementType[] agreementTypeArr = AgreementType.f30443c;
            int length = agreementTypeArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    agreementType = null;
                    break;
                }
                agreementType = agreementTypeArr[i12];
                if (agreementType.a() == input.f48612a) {
                    break;
                }
                i12++;
            }
            if (agreementType == null) {
                agreementType = AgreementType.UNKNOWN_AGREEMENT_TYPE;
            }
            arrayList.add(new C0699a(agreementType, input.f48613b, input.f48614c));
        }
        return new C8.a.b(arrayList);
    }
}
