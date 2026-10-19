package com.voltasit.obdeleven.domain.usecases.oca;

import J8.p;
import com.voltasit.obdeleven.domain.models.oca.CommandType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsOcaSfdWizardNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.e f30880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30881b;

    public h(com.voltasit.obdeleven.domain.usecases.sfd.e eVar, p pVar) {
        this.f30880a = eVar;
        this.f30881b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        IsOcaSfdWizardNeededUC$invoke$1 isOcaSfdWizardNeededUC$invoke$1;
        if (continuationImpl instanceof IsOcaSfdWizardNeededUC$invoke$1) {
            isOcaSfdWizardNeededUC$invoke$1 = (IsOcaSfdWizardNeededUC$invoke$1) continuationImpl;
            int i10 = isOcaSfdWizardNeededUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isOcaSfdWizardNeededUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isOcaSfdWizardNeededUC$invoke$1 = new IsOcaSfdWizardNeededUC$invoke$1(this, continuationImpl);
            }
        } else {
            isOcaSfdWizardNeededUC$invoke$1 = new IsOcaSfdWizardNeededUC$invoke$1(this, continuationImpl);
        }
        Object objA = isOcaSfdWizardNeededUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isOcaSfdWizardNeededUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f30881b.f("IsOcaSfdReadyUC", J4.i.c(arrayList.size(), "IsOcaSfdWizardNeededUC(commands=", ")"));
            int i12 = 0;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((I8.b) it.next()).f3915a == CommandType.SfdUnlock && (i12 = i12 + 1) < 0) {
                        l.w();
                        throw null;
                    }
                }
            }
            if (i12 == 0) {
                return new C8.a.b(Boolean.FALSE);
            }
            isOcaSfdWizardNeededUC$invoke$1.label = 1;
            objA = this.f30880a.a(isOcaSfdWizardNeededUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(Boolean.valueOf(!((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
