package com.voltasit.obdeleven.data.repositories;

import G8.C0700b;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AppTranslationRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements K8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.b f30333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.a f30335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F8.c f30336d;

    public b(K8.b bVar, com.voltasit.sharednetwork.a aVar, F8.a aVar2, F8.c cVar) {
        this.f30333a = bVar;
        this.f30334b = aVar;
        this.f30335c = aVar2;
        this.f30336d = cVar;
    }

    @Override // K8.a
    public final Object a(ArrayList arrayList, DatabaseLanguage databaseLanguage, kotlin.coroutines.c cVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(this.f30333a.e(new p279w9.a(B7.b.c("APP_LIST", ((String) it.next()) + databaseLanguage), 86400000L)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            String str = ((C0700b) obj).f3442a;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        if (arrayList.size() == linkedHashMap.keySet().size()) {
            return new C8.a.b(kotlin.collections.q.o0(linkedHashSet));
        }
        if (linkedHashMap.keySet().isEmpty()) {
            return b(arrayList, databaseLanguage, EmptyList.f42983b, (ContinuationImpl) cVar);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!linkedHashMap.keySet().contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.i.e(collectionValues, "<this>");
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            kotlin.collections.p.z(arrayList4, (Iterable) it2.next());
        }
        return b(arrayList3, databaseLanguage, arrayList4, (ContinuationImpl) cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ArrayList arrayList, DatabaseLanguage databaseLanguage, List list, ContinuationImpl continuationImpl) {
        AppTranslationRepositoryImpl$loadTranslations$1 appTranslationRepositoryImpl$loadTranslations$1;
        b bVar;
        if (continuationImpl instanceof AppTranslationRepositoryImpl$loadTranslations$1) {
            appTranslationRepositoryImpl$loadTranslations$1 = (AppTranslationRepositoryImpl$loadTranslations$1) continuationImpl;
            int i10 = appTranslationRepositoryImpl$loadTranslations$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                appTranslationRepositoryImpl$loadTranslations$1.label = i10 - Integer.MIN_VALUE;
            } else {
                appTranslationRepositoryImpl$loadTranslations$1 = new AppTranslationRepositoryImpl$loadTranslations$1(this, continuationImpl);
            }
        } else {
            appTranslationRepositoryImpl$loadTranslations$1 = new AppTranslationRepositoryImpl$loadTranslations$1(this, continuationImpl);
        }
        Object objB = appTranslationRepositoryImpl$loadTranslations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = appTranslationRepositoryImpl$loadTranslations$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30334b;
                String strB = databaseLanguage.b();
                kotlin.jvm.internal.i.d(strB, "getCode(...)");
                appTranslationRepositoryImpl$loadTranslations$1.L$0 = this;
                appTranslationRepositoryImpl$loadTranslations$1.L$1 = databaseLanguage;
                appTranslationRepositoryImpl$loadTranslations$1.L$2 = list;
                appTranslationRepositoryImpl$loadTranslations$1.label = 1;
                objB = aVar.B(strB, arrayList, appTranslationRepositoryImpl$loadTranslations$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = this;
            } catch (Throwable th) {
                th = th;
                bVar = this;
                return E8.a.i(bVar.f30336d.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) appTranslationRepositoryImpl$loadTranslations$1.L$2;
            databaseLanguage = (DatabaseLanguage) appTranslationRepositoryImpl$loadTranslations$1.L$1;
            bVar = (b) appTranslationRepositoryImpl$loadTranslations$1.L$0;
            try {
                kotlin.b.b(objB);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(bVar.f30336d.a(th));
            }
        }
        F8.a aVar2 = bVar.f30335c;
        ArrayList arrayListC0 = kotlin.collections.q.c0(list, F8.a.i((List) objB));
        bVar.c(databaseLanguage, arrayListC0);
        return new C8.a.b(arrayListC0);
    }

    public final void c(DatabaseLanguage databaseLanguage, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = ((C0700b) obj).f3442a;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.f30333a.j(new p279w9.a(B7.b.c("APP_LIST", entry.getKey() + databaseLanguage.b()), 86400000L), entry.getValue());
        }
    }
}
