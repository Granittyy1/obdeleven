package com.voltasit.obdeleven.data.repositories;

import G8.C0706h;
import com.voltasit.obdeleven.domain.exceptions.InvalidParameterException;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.models.ProductType;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p304y9.C2829h;
import p304y9.E;
import p304y9.F;

/* JADX INFO: compiled from: ProductRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements K8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.i f30379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A8.s f30380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8.t f30381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.p f30382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PurchaseProvider f30383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F8.c f30384g;

    public r(com.voltasit.sharednetwork.a aVar, A8.i iVar, A8.s sVar, A8.t tVar, J8.p pVar, PurchaseProvider purchaseProvider, F8.c cVar) {
        this.f30378a = aVar;
        this.f30379b = iVar;
        this.f30380c = sVar;
        this.f30381d = tVar;
        this.f30382e = pVar;
        this.f30383f = purchaseProvider;
        this.f30384g = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x004c, LOOP:2: B:30:0x0072->B:32:0x0078, LOOP_END, TryCatch #2 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:30:0x0072, B:32:0x0078, B:33:0x00a4, B:34:0x00b3, B:36:0x00b9, B:37:0x00c5), top: B:73:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[Catch: all -> 0x004c, LOOP:3: B:34:0x00b3->B:36:0x00b9, LOOP_END, TryCatch #2 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:30:0x0072, B:32:0x0078, B:33:0x00a4, B:34:0x00b3, B:36:0x00b9, B:37:0x00c5), top: B:73:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // K8.p
    public final Object a(ContinuationImpl continuationImpl) {
        ProductRepositoryImpl$getCreditProducts$1 productRepositoryImpl$getCreditProducts$1;
        r rVar;
        r rVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        List list;
        Object next;
        if (continuationImpl instanceof ProductRepositoryImpl$getCreditProducts$1) {
            productRepositoryImpl$getCreditProducts$1 = (ProductRepositoryImpl$getCreditProducts$1) continuationImpl;
            int i10 = productRepositoryImpl$getCreditProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                productRepositoryImpl$getCreditProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                productRepositoryImpl$getCreditProducts$1 = new ProductRepositoryImpl$getCreditProducts$1(this, continuationImpl);
            }
        } else {
            productRepositoryImpl$getCreditProducts$1 = new ProductRepositoryImpl$getCreditProducts$1(this, continuationImpl);
        }
        Object objA = productRepositoryImpl$getCreditProducts$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = productRepositoryImpl$getCreditProducts$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30378a;
                productRepositoryImpl$getCreditProducts$1.L$0 = this;
                productRepositoryImpl$getCreditProducts$1.label = 1;
                objA = aVar.a(productRepositoryImpl$getCreditProducts$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rVar2 = this;
                List<C2829h> list2 = (List) objA;
                arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
                for (C2829h input : list2) {
                    A8.i iVar = rVar2.f30379b;
                    kotlin.jvm.internal.i.e(input, "input");
                    ProductType.a aVar2 = ProductType.f30502b;
                    String str = input.f48578f;
                    aVar2.getClass();
                    arrayList.add(new C0706h(input.f48577e, ProductType.a.a(str), input.f48579g, input.f48574b, input.f48580h, ""));
                }
                PurchaseProvider purchaseProvider = rVar2.f30383f;
                arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C0706h) it.next()).f3501d);
                }
                productRepositoryImpl$getCreditProducts$1.L$0 = rVar2;
                productRepositoryImpl$getCreditProducts$1.L$1 = arrayList;
                productRepositoryImpl$getCreditProducts$1.label = 2;
                objA = purchaseProvider.f(arrayList2, productRepositoryImpl$getCreditProducts$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = arrayList;
            } catch (Throwable th) {
                th = th;
                rVar = this;
                return E8.a.i(rVar.f30384g.a(th));
            }
        } else if (i11 == 1) {
            rVar2 = (r) productRepositoryImpl$getCreditProducts$1.L$0;
            try {
                kotlin.b.b(objA);
                List<C2829h> list3 = (List) objA;
                arrayList = new ArrayList(kotlin.collections.m.y(list3, 10));
                while (r0.hasNext()) {
                    A8.i iVar2 = rVar2.f30379b;
                    kotlin.jvm.internal.i.e(input, "input");
                    ProductType.a aVar3 = ProductType.f30502b;
                    String str2 = input.f48578f;
                    aVar3.getClass();
                    arrayList.add(new C0706h(input.f48577e, ProductType.a.a(str2), input.f48579g, input.f48574b, input.f48580h, ""));
                }
                PurchaseProvider purchaseProvider2 = rVar2.f30383f;
                arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C0706h) it.next()).f3501d);
                }
                productRepositoryImpl$getCreditProducts$1.L$0 = rVar2;
                productRepositoryImpl$getCreditProducts$1.L$1 = arrayList;
                productRepositoryImpl$getCreditProducts$1.label = 2;
                objA = purchaseProvider2.f(arrayList2, productRepositoryImpl$getCreditProducts$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = arrayList;
            } catch (Throwable th2) {
                th = th2;
                rVar = rVar2;
                return E8.a.i(rVar.f30384g.a(th));
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) productRepositoryImpl$getCreditProducts$1.L$1;
            rVar = (r) productRepositoryImpl$getCreditProducts$1.L$0;
            try {
                kotlin.b.b(objA);
            } catch (Throwable th3) {
                th = th3;
                return E8.a.i(rVar.f30384g.a(th));
            }
        }
        C8.a aVar4 = (C8.a) objA;
        if (aVar4 instanceof C8.a.C0024a) {
            throw ((C8.a.C0024a) aVar4).f2462a;
        }
        if (!(aVar4 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        List list4 = (List) ((C8.a.b) aVar4).f2463a;
        List<C0706h> list5 = list;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(list5, 10));
        for (C0706h c0706h : list5) {
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.i.a(((PurchaseProvider.a) next).f30596a, c0706h.f3501d));
            PurchaseProvider.a aVar5 = (PurchaseProvider.a) next;
            arrayList3.add(C0706h.a(c0706h, aVar5 != null ? aVar5.f30598c : ""));
        }
        return new C8.a.b(kotlin.collections.q.h0(arrayList3, new p()));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:31:0x0069, B:33:0x0076, B:34:0x0085, B:36:0x008b, B:37:0x00b7, B:38:0x00c6, B:40:0x00cc, B:41:0x00d8), top: B:75:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:31:0x0069, B:33:0x0076, B:34:0x0085, B:36:0x008b, B:37:0x00b7, B:38:0x00c6, B:40:0x00cc, B:41:0x00d8), top: B:75:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: all -> 0x004c, LOOP:2: B:34:0x0085->B:36:0x008b, LOOP_END, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:31:0x0069, B:33:0x0076, B:34:0x0085, B:36:0x008b, B:37:0x00b7, B:38:0x00c6, B:40:0x00cc, B:41:0x00d8), top: B:75:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc A[Catch: all -> 0x004c, LOOP:3: B:38:0x00c6->B:40:0x00cc, LOOP_END, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0061, B:31:0x0069, B:33:0x0076, B:34:0x0085, B:36:0x008b, B:37:0x00b7, B:38:0x00c6, B:40:0x00cc, B:41:0x00d8), top: B:75:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // K8.p
    public final Object g(ContinuationImpl continuationImpl) {
        ProductRepositoryImpl$getShadowCreditProducts$1 productRepositoryImpl$getShadowCreditProducts$1;
        r rVar;
        r rVar2;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        List list2;
        Object next;
        if (continuationImpl instanceof ProductRepositoryImpl$getShadowCreditProducts$1) {
            productRepositoryImpl$getShadowCreditProducts$1 = (ProductRepositoryImpl$getShadowCreditProducts$1) continuationImpl;
            int i10 = productRepositoryImpl$getShadowCreditProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                productRepositoryImpl$getShadowCreditProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                productRepositoryImpl$getShadowCreditProducts$1 = new ProductRepositoryImpl$getShadowCreditProducts$1(this, continuationImpl);
            }
        } else {
            productRepositoryImpl$getShadowCreditProducts$1 = new ProductRepositoryImpl$getShadowCreditProducts$1(this, continuationImpl);
        }
        Object objG = productRepositoryImpl$getShadowCreditProducts$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = productRepositoryImpl$getShadowCreditProducts$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                rVar2 = (r) productRepositoryImpl$getShadowCreditProducts$1.L$0;
                try {
                    kotlin.b.b(objG);
                    list = (List) objG;
                    if (list.isEmpty()) {
                        return new C8.a.C0024a(new NotFoundException("No shadow credit products found"));
                    }
                    List<E> list3 = list;
                    arrayList = new ArrayList(kotlin.collections.m.y(list3, 10));
                    for (E input : list3) {
                        A8.s sVar = rVar2.f30380c;
                        kotlin.jvm.internal.i.e(input, "input");
                        ProductType.a aVar = ProductType.f30502b;
                        String str = input.f48445f;
                        aVar.getClass();
                        arrayList.add(new C0706h(input.f48444e, ProductType.a.a(str), input.f48446g, input.f48441b, "", ""));
                    }
                    PurchaseProvider purchaseProvider = rVar2.f30383f;
                    arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C0706h) it.next()).f3501d);
                    }
                    productRepositoryImpl$getShadowCreditProducts$1.L$0 = rVar2;
                    productRepositoryImpl$getShadowCreditProducts$1.L$1 = arrayList;
                    productRepositoryImpl$getShadowCreditProducts$1.label = 2;
                    objG = purchaseProvider.f(arrayList2, productRepositoryImpl$getShadowCreditProducts$1);
                    if (objG == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = arrayList;
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) productRepositoryImpl$getShadowCreditProducts$1.L$1;
                rVar = (r) productRepositoryImpl$getShadowCreditProducts$1.L$0;
                try {
                    kotlin.b.b(objG);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return E8.a.i(rVar.f30384g.a(th));
        }
        kotlin.b.b(objG);
        try {
            com.voltasit.sharednetwork.a aVar2 = this.f30378a;
            productRepositoryImpl$getShadowCreditProducts$1.L$0 = this;
            productRepositoryImpl$getShadowCreditProducts$1.label = 1;
            objG = aVar2.g(productRepositoryImpl$getShadowCreditProducts$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
            rVar2 = this;
            list = (List) objG;
            if (list.isEmpty()) {
                return new C8.a.C0024a(new NotFoundException("No shadow credit products found"));
            }
            List<E> list4 = list;
            arrayList = new ArrayList(kotlin.collections.m.y(list4, 10));
            while (r0.hasNext()) {
                A8.s sVar2 = rVar2.f30380c;
                kotlin.jvm.internal.i.e(input, "input");
                ProductType.a aVar3 = ProductType.f30502b;
                String str2 = input.f48445f;
                aVar3.getClass();
                arrayList.add(new C0706h(input.f48444e, ProductType.a.a(str2), input.f48446g, input.f48441b, "", ""));
            }
            PurchaseProvider purchaseProvider2 = rVar2.f30383f;
            arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C0706h) it.next()).f3501d);
            }
            productRepositoryImpl$getShadowCreditProducts$1.L$0 = rVar2;
            productRepositoryImpl$getShadowCreditProducts$1.L$1 = arrayList;
            productRepositoryImpl$getShadowCreditProducts$1.label = 2;
            objG = purchaseProvider2.f(arrayList2, productRepositoryImpl$getShadowCreditProducts$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = arrayList;
        } catch (Throwable th3) {
            th = th3;
            rVar = this;
        }
        C8.a aVar4 = (C8.a) objG;
        if (aVar4 instanceof C8.a.C0024a) {
            throw ((C8.a.C0024a) aVar4).f2462a;
        }
        if (!(aVar4 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        List list5 = (List) ((C8.a.b) aVar4).f2463a;
        List<C0706h> list6 = list2;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(list6, 10));
        for (C0706h c0706h : list6) {
            Iterator it2 = list5.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.i.a(((PurchaseProvider.a) next).f30596a, c0706h.f3501d));
            PurchaseProvider.a aVar5 = (PurchaseProvider.a) next;
            arrayList3.add(C0706h.a(c0706h, aVar5 != null ? aVar5.f30598c : ""));
        }
        return new C8.a.b(kotlin.collections.q.h0(arrayList3, new q()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.p
    public final Object h(ContinuationImpl continuationImpl) {
        ProductRepositoryImpl$getSubscriptionProducts$1 productRepositoryImpl$getSubscriptionProducts$1;
        r rVar;
        if (continuationImpl instanceof ProductRepositoryImpl$getSubscriptionProducts$1) {
            productRepositoryImpl$getSubscriptionProducts$1 = (ProductRepositoryImpl$getSubscriptionProducts$1) continuationImpl;
            int i10 = productRepositoryImpl$getSubscriptionProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                productRepositoryImpl$getSubscriptionProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                productRepositoryImpl$getSubscriptionProducts$1 = new ProductRepositoryImpl$getSubscriptionProducts$1(this, continuationImpl);
            }
        } else {
            productRepositoryImpl$getSubscriptionProducts$1 = new ProductRepositoryImpl$getSubscriptionProducts$1(this, continuationImpl);
        }
        Object objL = productRepositoryImpl$getSubscriptionProducts$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = productRepositoryImpl$getSubscriptionProducts$1.label;
        if (i11 == 0) {
            kotlin.b.b(objL);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30378a;
                productRepositoryImpl$getSubscriptionProducts$1.L$0 = this;
                productRepositoryImpl$getSubscriptionProducts$1.label = 1;
                objL = aVar.L(productRepositoryImpl$getSubscriptionProducts$1);
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rVar = this;
            } catch (InvalidParameterException e10) {
                e = e10;
                rVar = this;
                rVar.f30382e.d(e, true);
                return new C8.a.C0024a(e);
            } catch (Throwable th) {
                th = th;
                rVar = this;
                return E8.a.i(rVar.f30384g.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) productRepositoryImpl$getSubscriptionProducts$1.L$0;
            try {
                kotlin.b.b(objL);
            } catch (InvalidParameterException e11) {
                e = e11;
                rVar.f30382e.d(e, true);
                return new C8.a.C0024a(e);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(rVar.f30384g.a(th));
            }
        }
        List list = (List) objL;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rVar.f30381d.a((F) it.next()));
        }
        return new C8.a.b(arrayList);
    }
}
