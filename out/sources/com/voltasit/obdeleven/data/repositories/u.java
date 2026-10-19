package com.voltasit.obdeleven.data.repositories;

import G8.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p304y9.G;

/* JADX INFO: compiled from: TextTableRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements K8.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.b f30390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A8.u f30391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8.v f30392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F8.c f30393e;

    public u(com.voltasit.sharednetwork.a aVar, K8.b bVar, A8.u uVar, A8.v vVar, F8.c cVar) {
        this.f30389a = aVar;
        this.f30390b = bVar;
        this.f30391c = uVar;
        this.f30392d = vVar;
        this.f30393e = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.s
    public final Object p(ContinuationImpl continuationImpl) {
        TextTableRepositoryImpl$getHiddenTextIds$1 textTableRepositoryImpl$getHiddenTextIds$1;
        u uVar;
        if (continuationImpl instanceof TextTableRepositoryImpl$getHiddenTextIds$1) {
            textTableRepositoryImpl$getHiddenTextIds$1 = (TextTableRepositoryImpl$getHiddenTextIds$1) continuationImpl;
            int i10 = textTableRepositoryImpl$getHiddenTextIds$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                textTableRepositoryImpl$getHiddenTextIds$1.label = i10 - Integer.MIN_VALUE;
            } else {
                textTableRepositoryImpl$getHiddenTextIds$1 = new TextTableRepositoryImpl$getHiddenTextIds$1(this, continuationImpl);
            }
        } else {
            textTableRepositoryImpl$getHiddenTextIds$1 = new TextTableRepositoryImpl$getHiddenTextIds$1(this, continuationImpl);
        }
        Object objP = textTableRepositoryImpl$getHiddenTextIds$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = textTableRepositoryImpl$getHiddenTextIds$1.label;
        p279w9.a aVar = p279w9.a.f47820r;
        if (i11 == 0) {
            kotlin.b.b(objP);
            List listE = this.f30390b.e(aVar);
            if (!listE.isEmpty()) {
                return new C8.a.b(listE);
            }
            try {
                com.voltasit.sharednetwork.a aVar2 = this.f30389a;
                textTableRepositoryImpl$getHiddenTextIds$1.L$0 = this;
                textTableRepositoryImpl$getHiddenTextIds$1.label = 1;
                objP = aVar2.p(textTableRepositoryImpl$getHiddenTextIds$1);
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uVar = this;
            } catch (Throwable th) {
                th = th;
                uVar = this;
                return E8.a.i(uVar.f30393e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) textTableRepositoryImpl$getHiddenTextIds$1.L$0;
            try {
                kotlin.b.b(objP);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(uVar.f30393e.a(th));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objP) {
            if (((p304y9.o) obj).f48607a != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((p304y9.o) it.next()).f48607a;
            kotlin.jvm.internal.i.b(str);
            arrayList2.add(new G8.p(str));
        }
        uVar.f30390b.j(aVar, arrayList2);
        return new C8.a.b(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.s
    public final Object q(ArrayList arrayList, ContinuationImpl continuationImpl) {
        TextTableRepositoryImpl$getTextTableMap$1 textTableRepositoryImpl$getTextTableMap$1;
        u uVar;
        Map map;
        if (continuationImpl instanceof TextTableRepositoryImpl$getTextTableMap$1) {
            textTableRepositoryImpl$getTextTableMap$1 = (TextTableRepositoryImpl$getTextTableMap$1) continuationImpl;
            int i10 = textTableRepositoryImpl$getTextTableMap$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                textTableRepositoryImpl$getTextTableMap$1.label = i10 - Integer.MIN_VALUE;
            } else {
                textTableRepositoryImpl$getTextTableMap$1 = new TextTableRepositoryImpl$getTextTableMap$1(this, continuationImpl);
            }
        } else {
            textTableRepositoryImpl$getTextTableMap$1 = new TextTableRepositoryImpl$getTextTableMap$1(this, continuationImpl);
        }
        Object obj = textTableRepositoryImpl$getTextTableMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = textTableRepositoryImpl$getTextTableMap$1.label;
        p279w9.a aVar = p279w9.a.f47813k;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Map mapA = this.f30390b.a(aVar);
            ArrayList arrayList2 = new ArrayList();
            if (mapA.isEmpty()) {
                arrayList2.addAll(arrayList);
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!mapA.containsKey(str)) {
                        arrayList2.add(str);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return new C8.a.b(mapA);
                }
            }
            try {
                com.voltasit.sharednetwork.a aVar2 = this.f30389a;
                textTableRepositoryImpl$getTextTableMap$1.L$0 = this;
                textTableRepositoryImpl$getTextTableMap$1.L$1 = mapA;
                textTableRepositoryImpl$getTextTableMap$1.label = 1;
                Object objX = aVar2.x(arrayList2, textTableRepositoryImpl$getTextTableMap$1);
                if (objX == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uVar = this;
                obj = objX;
                map = mapA;
            } catch (Throwable th) {
                th = th;
                uVar = this;
                return E8.a.i(uVar.f30393e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) textTableRepositoryImpl$getTextTableMap$1.L$1;
            uVar = (u) textTableRepositoryImpl$getTextTableMap$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(uVar.f30393e.a(th));
            }
        }
        List<G> list = (List) obj;
        ArrayList<B> arrayList3 = new ArrayList(kotlin.collections.m.y(list, 10));
        for (G g10 : list) {
            A8.v vVar = uVar.f30392d;
            arrayList3.add(A8.v.a(g10));
        }
        ArrayList arrayList4 = new ArrayList(kotlin.collections.m.y(arrayList3, 10));
        for (B b10 : arrayList3) {
            String str2 = b10.f3405b;
            A8.u uVar2 = uVar.f30391c;
            arrayList4.add(new Pair(str2, A8.u.a(b10)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.collections.y.v(linkedHashMap, arrayList4);
        linkedHashMap.putAll(map);
        uVar.f30390b.j(aVar, linkedHashMap);
        return new C8.a.b(linkedHashMap);
    }
}
