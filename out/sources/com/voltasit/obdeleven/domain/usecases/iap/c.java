package com.voltasit.obdeleven.domain.usecases.iap;

import G8.A;
import G8.z;
import K8.o;
import K8.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.v;

/* JADX INFO: compiled from: GetSubscriptionProductTranslationsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f30856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f30857b;

    public c(s sVar, o oVar) {
        this.f30856a = sVar;
        this.f30857b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(z.a aVar, ContinuationImpl continuationImpl) {
        GetSubscriptionProductTranslationsUC$invoke$1 getSubscriptionProductTranslationsUC$invoke$1;
        c cVar;
        if (continuationImpl instanceof GetSubscriptionProductTranslationsUC$invoke$1) {
            getSubscriptionProductTranslationsUC$invoke$1 = (GetSubscriptionProductTranslationsUC$invoke$1) continuationImpl;
            int i10 = getSubscriptionProductTranslationsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getSubscriptionProductTranslationsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getSubscriptionProductTranslationsUC$invoke$1 = new GetSubscriptionProductTranslationsUC$invoke$1(this, continuationImpl);
            }
        } else {
            getSubscriptionProductTranslationsUC$invoke$1 = new GetSubscriptionProductTranslationsUC$invoke$1(this, continuationImpl);
        }
        Object objQ = getSubscriptionProductTranslationsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getSubscriptionProductTranslationsUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objQ);
            ArrayList arrayListC0 = q.c0(l.s(aVar.f3577d, aVar.f3575b, aVar.f3574a), aVar.f3576c);
            getSubscriptionProductTranslationsUC$invoke$1.L$0 = this;
            getSubscriptionProductTranslationsUC$invoke$1.L$1 = aVar;
            getSubscriptionProductTranslationsUC$invoke$1.label = 1;
            objQ = this.f30856a.q(arrayListC0, getSubscriptionProductTranslationsUC$invoke$1);
            if (objQ == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (z.a) getSubscriptionProductTranslationsUC$invoke$1.L$1;
            cVar = (c) getSubscriptionProductTranslationsUC$invoke$1.L$0;
            kotlin.b.b(objQ);
        }
        C8.a aVar2 = (C8.a) objQ;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        if (!(aVar2 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) ((C8.a.b) aVar2).f2463a;
        String strB = cVar.f30857b.Q().b();
        v vVar = (v) map.get(aVar.f3574a);
        String strA = vVar != null ? vVar.a(strB) : "";
        v vVar2 = (v) map.get(aVar.f3575b);
        String strA2 = vVar2 != null ? vVar2.a(strB) : "";
        v vVar3 = (v) map.get(aVar.f3577d);
        String strA3 = vVar3 != null ? vVar3.a(strB) : "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (aVar.f3576c.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((v) ((Map.Entry) it.next()).getValue()).a(strB));
        }
        return new C8.a.b(new A(strA, strA2, strA3, arrayList));
    }
}
