package com.voltasit.obdeleven.domain.usecases.odx;

import G8.s;
import J8.p;
import K8.k;
import com.voltasit.obdeleven.domain.exceptions.OdxNotFoundException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOdxByNameUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30896b;

    public f(k kVar, p pVar) {
        this.f30895a = kVar;
        this.f30896b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        GetOdxByNameUC$invoke$1 getOdxByNameUC$invoke$1;
        f fVar;
        Object next;
        String str3;
        if (continuationImpl instanceof GetOdxByNameUC$invoke$1) {
            getOdxByNameUC$invoke$1 = (GetOdxByNameUC$invoke$1) continuationImpl;
            int i10 = getOdxByNameUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOdxByNameUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOdxByNameUC$invoke$1 = new GetOdxByNameUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOdxByNameUC$invoke$1 = new GetOdxByNameUC$invoke$1(this, continuationImpl);
        }
        Object objC = getOdxByNameUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOdxByNameUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objC);
            this.f30896b.f("GetOdxByNameUC", "GetOdxByNameUC(odxName=" + str + ", odxVersion=" + str2 + ")");
            if (str2.length() != 0) {
                String strSubstring = str2.substring(0, 3);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                str = str + "_" + strSubstring;
            }
            getOdxByNameUC$invoke$1.L$0 = this;
            getOdxByNameUC$invoke$1.label = 1;
            objC = this.f30895a.c(str, getOdxByNameUC$invoke$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            fVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) getOdxByNameUC$invoke$1.L$0;
            kotlin.b.b(objC);
        }
        C8.a aVar = (C8.a) objC;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = ((Iterable) ((C8.a.b) aVar).f2463a).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String str4 = ((s) next).f3538c;
                do {
                    Object next2 = it.next();
                    String str5 = ((s) next2).f3538c;
                    if (str4.compareTo(str5) < 0) {
                        next = next2;
                        str4 = str5;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        s sVar = (s) next;
        p pVar = fVar.f30896b;
        if (sVar == null || (str3 = sVar.f3538c) == null) {
            str3 = "not found";
        }
        pVar.e("GetOdxByNameUC", B6.c.d("Using odx ", str3, ", Platform: ", sVar != null ? sVar.f3539d : null));
        return sVar == null ? new C8.a.C0024a(new OdxNotFoundException()) : new C8.a.b(sVar);
    }
}
