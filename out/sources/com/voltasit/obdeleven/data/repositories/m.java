package com.voltasit.obdeleven.data.repositories;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: OcaRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements K8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.l f30366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.b f30367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8.k f30368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F8.c f30369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J8.p f30370f;

    public m(com.voltasit.sharednetwork.a aVar, A8.m mVar, A8.l lVar, K8.b bVar, A8.n nVar, A8.k kVar, F8.c cVar, J8.p pVar) {
        this.f30365a = aVar;
        this.f30366b = lVar;
        this.f30367c = bVar;
        this.f30368d = kVar;
        this.f30369e = cVar;
        this.f30370f = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object b(String str, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$incrementOcaUsage$1 ocaRepositoryImpl$incrementOcaUsage$1;
        if (continuationImpl instanceof OcaRepositoryImpl$incrementOcaUsage$1) {
            ocaRepositoryImpl$incrementOcaUsage$1 = (OcaRepositoryImpl$incrementOcaUsage$1) continuationImpl;
            int i10 = ocaRepositoryImpl$incrementOcaUsage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$incrementOcaUsage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$incrementOcaUsage$1 = new OcaRepositoryImpl$incrementOcaUsage$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$incrementOcaUsage$1 = new OcaRepositoryImpl$incrementOcaUsage$1(this, continuationImpl);
        }
        Object obj = ocaRepositoryImpl$incrementOcaUsage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$incrementOcaUsage$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$incrementOcaUsage$1.label = 1;
                if (aVar.b(str, ocaRepositoryImpl$incrementOcaUsage$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return new C8.a.b(Boolean.TRUE);
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$invalidateOriginalAppValue$1 ocaRepositoryImpl$invalidateOriginalAppValue$1;
        Object objA;
        if (continuationImpl instanceof OcaRepositoryImpl$invalidateOriginalAppValue$1) {
            ocaRepositoryImpl$invalidateOriginalAppValue$1 = (OcaRepositoryImpl$invalidateOriginalAppValue$1) continuationImpl;
            int i10 = ocaRepositoryImpl$invalidateOriginalAppValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$invalidateOriginalAppValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$invalidateOriginalAppValue$1 = new OcaRepositoryImpl$invalidateOriginalAppValue$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$invalidateOriginalAppValue$1 = new OcaRepositoryImpl$invalidateOriginalAppValue$1(this, continuationImpl);
        }
        Object obj = ocaRepositoryImpl$invalidateOriginalAppValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$invalidateOriginalAppValue$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$invalidateOriginalAppValue$1.label = 1;
                if (aVar.c(str, str2, str3, ocaRepositoryImpl$invalidateOriginalAppValue$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            objA = p293xa.r.f47939a;
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        Na.i iVar = E8.a.f3126a;
        Throwable thA = Result.a(objA);
        return thA == null ? new C8.a.b(objA) : new C8.a.C0024a(thA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object e(String str, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$refundOcaCredits$1 ocaRepositoryImpl$refundOcaCredits$1;
        if (continuationImpl instanceof OcaRepositoryImpl$refundOcaCredits$1) {
            ocaRepositoryImpl$refundOcaCredits$1 = (OcaRepositoryImpl$refundOcaCredits$1) continuationImpl;
            int i10 = ocaRepositoryImpl$refundOcaCredits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$refundOcaCredits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$refundOcaCredits$1 = new OcaRepositoryImpl$refundOcaCredits$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$refundOcaCredits$1 = new OcaRepositoryImpl$refundOcaCredits$1(this, continuationImpl);
        }
        Object obj = ocaRepositoryImpl$refundOcaCredits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$refundOcaCredits$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$refundOcaCredits$1.label = 1;
                if (aVar.e(str, ocaRepositoryImpl$refundOcaCredits$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return new C8.a.b(Boolean.TRUE);
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$getCommands$1 ocaRepositoryImpl$getCommands$1;
        m mVar;
        if (continuationImpl instanceof OcaRepositoryImpl$getCommands$1) {
            ocaRepositoryImpl$getCommands$1 = (OcaRepositoryImpl$getCommands$1) continuationImpl;
            int i10 = ocaRepositoryImpl$getCommands$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$getCommands$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$getCommands$1 = new OcaRepositoryImpl$getCommands$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$getCommands$1 = new OcaRepositoryImpl$getCommands$1(this, continuationImpl);
        }
        Object objO = ocaRepositoryImpl$getCommands$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$getCommands$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objO);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$getCommands$1.L$0 = this;
                ocaRepositoryImpl$getCommands$1.label = 1;
                objO = aVar.O(str, str2, ocaRepositoryImpl$getCommands$1);
                if (objO == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) ocaRepositoryImpl$getCommands$1.L$0;
                kotlin.b.b(objO);
            }
            List<p304y9.s> list = (List) objO;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
            for (p304y9.s sVar : list) {
                A8.k kVar = mVar.f30368d;
                arrayList.add(A8.k.a(sVar));
            }
            return new C8.a.b(arrayList);
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$getOriginalAppValue$1 ocaRepositoryImpl$getOriginalAppValue$1;
        m mVar;
        if (continuationImpl instanceof OcaRepositoryImpl$getOriginalAppValue$1) {
            ocaRepositoryImpl$getOriginalAppValue$1 = (OcaRepositoryImpl$getOriginalAppValue$1) continuationImpl;
            int i10 = ocaRepositoryImpl$getOriginalAppValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$getOriginalAppValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$getOriginalAppValue$1 = new OcaRepositoryImpl$getOriginalAppValue$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$getOriginalAppValue$1 = new OcaRepositoryImpl$getOriginalAppValue$1(this, continuationImpl);
        }
        Object objJ = ocaRepositoryImpl$getOriginalAppValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$getOriginalAppValue$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$getOriginalAppValue$1.L$0 = this;
                ocaRepositoryImpl$getOriginalAppValue$1.label = 1;
                objJ = aVar.J(str, str2, ocaRepositoryImpl$getOriginalAppValue$1);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mVar = this;
            } catch (Throwable th) {
                th = th;
                mVar = this;
                return new C8.a.C0024a(mVar.f30369e.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) ocaRepositoryImpl$getOriginalAppValue$1.L$0;
            try {
                kotlin.b.b(objJ);
            } catch (Throwable th2) {
                th = th2;
                return new C8.a.C0024a(mVar.f30369e.a(th));
            }
        }
        p316z9.j jVar = (p316z9.j) objJ;
        List<p316z9.a> list = jVar.f48985b;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (p316z9.a aVar2 : list) {
            arrayList.add(new I8.e(aVar2.f48952a, aVar2.f48953b));
        }
        return new C8.a.b(new I8.d(jVar.f48984a, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object h(I8.c input, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$startOcaSession$1 ocaRepositoryImpl$startOcaSession$1;
        m mVar;
        if (continuationImpl instanceof OcaRepositoryImpl$startOcaSession$1) {
            ocaRepositoryImpl$startOcaSession$1 = (OcaRepositoryImpl$startOcaSession$1) continuationImpl;
            int i10 = ocaRepositoryImpl$startOcaSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$startOcaSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$startOcaSession$1 = new OcaRepositoryImpl$startOcaSession$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$startOcaSession$1 = new OcaRepositoryImpl$startOcaSession$1(this, continuationImpl);
        }
        Object objE = ocaRepositoryImpl$startOcaSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$startOcaSession$1.label;
        if (i11 == 0) {
            kotlin.b.b(objE);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                try {
                    kotlin.jvm.internal.i.e(input, "input");
                    p304y9.u uVar = new p304y9.u(input.f3919a, input.f3920b, input.f3921c, input.f3922d, input.f3923e, input.f3924f, input.f3925g, input.f3926h);
                    ocaRepositoryImpl$startOcaSession$1.L$0 = this;
                    ocaRepositoryImpl$startOcaSession$1.label = 1;
                    objE = aVar.E(uVar, ocaRepositoryImpl$startOcaSession$1);
                    if (objE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mVar = this;
                } catch (Throwable th) {
                    th = th;
                    mVar = this;
                    return new C8.a.C0024a(mVar.f30369e.a(th));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) ocaRepositoryImpl$startOcaSession$1.L$0;
            try {
                kotlin.b.b(objE);
            } catch (Throwable th3) {
                th = th3;
                return new C8.a.C0024a(mVar.f30369e.a(th));
            }
        }
        return new C8.a.b((String) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object i(String str, boolean z10, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$getOCAList$1 ocaRepositoryImpl$getOCAList$1;
        m mVar;
        if (continuationImpl instanceof OcaRepositoryImpl$getOCAList$1) {
            ocaRepositoryImpl$getOCAList$1 = (OcaRepositoryImpl$getOCAList$1) continuationImpl;
            int i10 = ocaRepositoryImpl$getOCAList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$getOCAList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$getOCAList$1 = new OcaRepositoryImpl$getOCAList$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$getOCAList$1 = new OcaRepositoryImpl$getOCAList$1(this, continuationImpl);
        }
        Object objT = ocaRepositoryImpl$getOCAList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$getOCAList$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objT);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                ocaRepositoryImpl$getOCAList$1.L$0 = this;
                ocaRepositoryImpl$getOCAList$1.label = 1;
                objT = aVar.t(str, z10, ocaRepositoryImpl$getOCAList$1);
                if (objT == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) ocaRepositoryImpl$getOCAList$1.L$0;
                kotlin.b.b(objT);
            }
            Iterable<p304y9.t> iterable = (Iterable) objT;
            ArrayList<I8.a> arrayList = new ArrayList(kotlin.collections.m.y(iterable, 10));
            for (p304y9.t tVar : iterable) {
                A8.l lVar = mVar.f30366b;
                arrayList.add(A8.l.a(tVar));
            }
            for (I8.a aVar2 : arrayList) {
                mVar.f30367c.d(p279w9.a.f47812i, aVar2.f3901a, aVar2);
            }
            return new C8.a.b(arrayList);
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.j
    public final Object j(String str, String str2, List list, ContinuationImpl continuationImpl) {
        OcaRepositoryImpl$saveOriginalAppValue$1 ocaRepositoryImpl$saveOriginalAppValue$1;
        Object objA;
        if (continuationImpl instanceof OcaRepositoryImpl$saveOriginalAppValue$1) {
            ocaRepositoryImpl$saveOriginalAppValue$1 = (OcaRepositoryImpl$saveOriginalAppValue$1) continuationImpl;
            int i10 = ocaRepositoryImpl$saveOriginalAppValue$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaRepositoryImpl$saveOriginalAppValue$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaRepositoryImpl$saveOriginalAppValue$1 = new OcaRepositoryImpl$saveOriginalAppValue$1(this, continuationImpl);
            }
        } else {
            ocaRepositoryImpl$saveOriginalAppValue$1 = new OcaRepositoryImpl$saveOriginalAppValue$1(this, continuationImpl);
        }
        Object obj = ocaRepositoryImpl$saveOriginalAppValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaRepositoryImpl$saveOriginalAppValue$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                com.voltasit.sharednetwork.a aVar = this.f30365a;
                List<I8.e> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
                for (I8.e eVar : list2) {
                    arrayList.add(new p316z9.l(eVar.f3929a, eVar.f3930b));
                }
                p316z9.k kVar = new p316z9.k(str, str2, arrayList);
                ocaRepositoryImpl$saveOriginalAppValue$1.label = 1;
                if (aVar.y(kVar, ocaRepositoryImpl$saveOriginalAppValue$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            objA = p293xa.r.f47939a;
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        Na.i iVar = E8.a.f3126a;
        OcaRepositoryImpl$saveOriginalAppValue$3 transform = OcaRepositoryImpl$saveOriginalAppValue$3.f30300h;
        kotlin.jvm.internal.i.e(transform, "transform");
        Throwable thA = Result.a(objA);
        if (thA != null) {
            objA = kotlin.b.a((Throwable) transform.invoke(thA));
        }
        Throwable thA2 = Result.a(objA);
        return thA2 == null ? new C8.a.b(objA) : new C8.a.C0024a(thA2);
    }
}
