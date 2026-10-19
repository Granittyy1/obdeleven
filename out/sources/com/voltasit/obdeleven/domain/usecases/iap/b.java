package com.voltasit.obdeleven.domain.usecases.iap;

import G8.z;
import K8.o;
import K8.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.v;

/* JADX INFO: compiled from: GetProfileSubscriptionButtonTranslationsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f30854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f30855b;

    public b(s sVar, o oVar) {
        this.f30854a = sVar;
        this.f30855b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        GetProfileSubscriptionButtonTranslationsUC$invoke$1 getProfileSubscriptionButtonTranslationsUC$invoke$1;
        b bVar;
        if (continuationImpl instanceof GetProfileSubscriptionButtonTranslationsUC$invoke$1) {
            getProfileSubscriptionButtonTranslationsUC$invoke$1 = (GetProfileSubscriptionButtonTranslationsUC$invoke$1) continuationImpl;
            int i10 = getProfileSubscriptionButtonTranslationsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getProfileSubscriptionButtonTranslationsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getProfileSubscriptionButtonTranslationsUC$invoke$1 = new GetProfileSubscriptionButtonTranslationsUC$invoke$1(this, continuationImpl);
            }
        } else {
            getProfileSubscriptionButtonTranslationsUC$invoke$1 = new GetProfileSubscriptionButtonTranslationsUC$invoke$1(this, continuationImpl);
        }
        Object objQ = getProfileSubscriptionButtonTranslationsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getProfileSubscriptionButtonTranslationsUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objQ);
            List list2 = list;
            ArrayList arrayList = new ArrayList(m.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((z) it.next()).f3573c.f3578e);
            }
            getProfileSubscriptionButtonTranslationsUC$invoke$1.L$0 = this;
            getProfileSubscriptionButtonTranslationsUC$invoke$1.L$1 = list;
            getProfileSubscriptionButtonTranslationsUC$invoke$1.label = 1;
            objQ = this.f30854a.q(arrayList, getProfileSubscriptionButtonTranslationsUC$invoke$1);
            if (objQ == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) getProfileSubscriptionButtonTranslationsUC$invoke$1.L$1;
            bVar = (b) getProfileSubscriptionButtonTranslationsUC$invoke$1.L$0;
            kotlin.b.b(objQ);
        }
        C8.a aVar = (C8.a) objQ;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (!(aVar instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) ((C8.a.b) aVar).f2463a;
        String strB = bVar.f30855b.Q().b();
        List list3 = list;
        int iN = x.n(m.y(list3, 10));
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (Object obj : list3) {
            v vVar = (v) map.get(((z) obj).f3573c.f3578e);
            linkedHashMap.put(obj, vVar != null ? vVar.a(strB) : "");
        }
        return new C8.a.b(linkedHashMap);
    }
}
