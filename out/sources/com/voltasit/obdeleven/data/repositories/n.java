package com.voltasit.obdeleven.data.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: OdxRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements K8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.p f30372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f30374d = new LinkedHashMap();

    public n(com.voltasit.sharednetwork.a aVar, A8.p pVar, F8.c cVar) {
        this.f30371a = aVar;
        this.f30372b = pVar;
        this.f30373c = cVar;
    }

    @Override // K8.k
    public final String a(short s10) {
        String str = (String) this.f30374d.get(new p293xa.p(s10));
        return str == null ? "" : str;
    }

    @Override // K8.k
    public final void b() {
        this.f30374d.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.k
    public final Object c(String str, ContinuationImpl continuationImpl) {
        OdxRepositoryImpl$getOdxByName$1 odxRepositoryImpl$getOdxByName$1;
        n nVar;
        if (continuationImpl instanceof OdxRepositoryImpl$getOdxByName$1) {
            odxRepositoryImpl$getOdxByName$1 = (OdxRepositoryImpl$getOdxByName$1) continuationImpl;
            int i10 = odxRepositoryImpl$getOdxByName$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                odxRepositoryImpl$getOdxByName$1.label = i10 - Integer.MIN_VALUE;
            } else {
                odxRepositoryImpl$getOdxByName$1 = new OdxRepositoryImpl$getOdxByName$1(this, continuationImpl);
            }
        } else {
            odxRepositoryImpl$getOdxByName$1 = new OdxRepositoryImpl$getOdxByName$1(this, continuationImpl);
        }
        Object objW = odxRepositoryImpl$getOdxByName$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = odxRepositoryImpl$getOdxByName$1.label;
        if (i11 == 0) {
            kotlin.b.b(objW);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30371a;
                odxRepositoryImpl$getOdxByName$1.L$0 = this;
                odxRepositoryImpl$getOdxByName$1.label = 1;
                objW = aVar.w(str, odxRepositoryImpl$getOdxByName$1);
                if (objW == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nVar = this;
            } catch (Throwable th) {
                th = th;
                nVar = this;
                return E8.a.i(nVar.f30373c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) odxRepositoryImpl$getOdxByName$1.L$0;
            try {
                kotlin.b.b(objW);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(nVar.f30373c.a(th));
            }
        }
        List<p304y9.v> list = (List) objW;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (p304y9.v input : list) {
            A8.p pVar = nVar.f30372b;
            kotlin.jvm.internal.i.e(input, "input");
            String str2 = input.f48655e.f48602b;
            arrayList.add(new G8.s(input.f48651a, input.f48653c, input.f48654d, str2, input.f48652b));
        }
        return new C8.a.b(arrayList);
    }

    @Override // K8.k
    public final void d(String odxVersion, short s10) {
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        this.f30374d.put(new p293xa.p(s10), odxVersion);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.k
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        OdxRepositoryImpl$getOdxByPlatform$1 odxRepositoryImpl$getOdxByPlatform$1;
        n nVar;
        if (continuationImpl instanceof OdxRepositoryImpl$getOdxByPlatform$1) {
            odxRepositoryImpl$getOdxByPlatform$1 = (OdxRepositoryImpl$getOdxByPlatform$1) continuationImpl;
            int i10 = odxRepositoryImpl$getOdxByPlatform$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                odxRepositoryImpl$getOdxByPlatform$1.label = i10 - Integer.MIN_VALUE;
            } else {
                odxRepositoryImpl$getOdxByPlatform$1 = new OdxRepositoryImpl$getOdxByPlatform$1(this, continuationImpl);
            }
        } else {
            odxRepositoryImpl$getOdxByPlatform$1 = new OdxRepositoryImpl$getOdxByPlatform$1(this, continuationImpl);
        }
        Object objM = odxRepositoryImpl$getOdxByPlatform$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = odxRepositoryImpl$getOdxByPlatform$1.label;
        if (i11 == 0) {
            kotlin.b.b(objM);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30371a;
                odxRepositoryImpl$getOdxByPlatform$1.L$0 = this;
                odxRepositoryImpl$getOdxByPlatform$1.label = 1;
                objM = aVar.M(str, str2, odxRepositoryImpl$getOdxByPlatform$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nVar = this;
            } catch (Throwable th) {
                th = th;
                nVar = this;
                return E8.a.i(nVar.f30373c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) odxRepositoryImpl$getOdxByPlatform$1.L$0;
            try {
                kotlin.b.b(objM);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(nVar.f30373c.a(th));
            }
        }
        List<p304y9.v> list = (List) objM;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (p304y9.v input : list) {
            A8.p pVar = nVar.f30372b;
            kotlin.jvm.internal.i.e(input, "input");
            String str3 = input.f48655e.f48602b;
            arrayList.add(new G8.s(input.f48651a, input.f48653c, input.f48654d, str3, input.f48652b));
        }
        return new C8.a.b(arrayList);
    }
}
