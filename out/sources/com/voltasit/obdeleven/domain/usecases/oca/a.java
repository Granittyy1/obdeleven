package com.voltasit.obdeleven.domain.usecases.oca;

import J8.p;
import J8.x;
import com.voltasit.obdeleven.core.app.AbstractC2107w;
import com.voltasit.obdeleven.domain.exceptions.AppException;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;

/* JADX INFO: compiled from: CreateOriginalAppValueUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.j f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f30870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30871c;

    public a(K8.j jVar, x xVar, p pVar) {
        this.f30869a = jVar;
        this.f30870b = xVar;
        this.f30871c = pVar;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2107w abstractC2107w = (AbstractC2107w) it.next();
            if (abstractC2107w.d() && abstractC2107w.f30179c) {
                try {
                    if (abstractC2107w.c() != null) {
                        int iIndexOf = arrayList.indexOf(abstractC2107w);
                        String strC = abstractC2107w.c();
                        kotlin.jvm.internal.i.b(strC);
                        arrayList2.add(new I8.e(iIndexOf, strC));
                    }
                } catch (JSONException e10) {
                    this.f30871c.d(e10, false);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        CreateOriginalAppValueUC$invoke$1 createOriginalAppValueUC$invoke$1;
        List listA;
        List list;
        if (continuationImpl instanceof CreateOriginalAppValueUC$invoke$1) {
            createOriginalAppValueUC$invoke$1 = (CreateOriginalAppValueUC$invoke$1) continuationImpl;
            int i10 = createOriginalAppValueUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createOriginalAppValueUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                createOriginalAppValueUC$invoke$1 = new CreateOriginalAppValueUC$invoke$1(this, continuationImpl);
            }
        } else {
            createOriginalAppValueUC$invoke$1 = new CreateOriginalAppValueUC$invoke$1(this, continuationImpl);
        }
        Object objJ = createOriginalAppValueUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = createOriginalAppValueUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            String strC = J4.i.c(arrayList.size(), "CreateOriginalAppValueUC(commands=", ")");
            p pVar = this.f30871c;
            pVar.f("CreateOriginalAppValueUC", strC);
            try {
                listA = a(arrayList);
            } catch (Exception e10) {
                pVar.d(new Exception(B7.b.c("ocaId: ", str), e10), true);
                listA = EmptyList.f42983b;
            }
            if (listA.isEmpty()) {
                return new C8.a.C0024a(new AppException(-2));
            }
            x xVar = this.f30870b;
            if (!xVar.b()) {
                return new C8.a.C0024a(new VehicleNotConnectedException());
            }
            String objectId = xVar.k().f42726c.getObjectId();
            kotlin.jvm.internal.i.b(objectId);
            createOriginalAppValueUC$invoke$1.L$0 = listA;
            createOriginalAppValueUC$invoke$1.label = 1;
            objJ = this.f30869a.j(str, objectId, listA, createOriginalAppValueUC$invoke$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = listA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) createOriginalAppValueUC$invoke$1.L$0;
            kotlin.b.b(objJ);
        }
        C8.a aVar = (C8.a) objJ;
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(list);
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
