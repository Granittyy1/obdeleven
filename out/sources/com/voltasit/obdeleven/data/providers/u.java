package com.voltasit.obdeleven.data.providers;

import K2.C0710c;
import android.app.Activity;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.play_billing.zzbt;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.repositories.InAppPurchaseRepository;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.N;
import org.json.JSONObject;
import p237t3.AbstractC2788a;
import p237t3.C2789b;
import p237t3.C2791d;
import p237t3.C2792e;
import p237t3.C2793f;
import p237t3.C2795h;
import p237t3.InterfaceC2790c;
import p237t3.InterfaceC2794g;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements PurchaseProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.d f30283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.o f30284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InAppPurchaseRepository f30285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.a f30286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2712w f30287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2789b f30288g;

    /* JADX INFO: compiled from: PurchaseProviderImpl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.android.billingclient.api.a f30289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractCollection f30290b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.android.billingclient.api.a billingResult, List<C2793f> productDetailsList) {
            kotlin.jvm.internal.i.e(billingResult, "billingResult");
            kotlin.jvm.internal.i.e(productDetailsList, "productDetailsList");
            this.f30289a = billingResult;
            this.f30290b = (AbstractCollection) productDetailsList;
        }
    }

    public u(J8.p pVar, J8.d dVar, K8.o oVar, InAppPurchaseRepository inAppPurchaseRepository, J8.a aVar) {
        Sa.a ioDispatcher = N.f43200c;
        kotlin.jvm.internal.i.e(ioDispatcher, "ioDispatcher");
        this.f30282a = pVar;
        this.f30283b = dVar;
        this.f30284c = oVar;
        this.f30285d = inAppPurchaseRepository;
        this.f30286e = aVar;
        this.f30287f = ioDispatcher;
        kotlinx.coroutines.channels.b.a(-1);
        kotlinx.coroutines.channels.b.a(-1);
    }

    public static final void g(u uVar) {
        uVar.f30282a.e("GooglePurchaseProviderImpl", "endConnection");
        C2789b c2789b = uVar.f30288g;
        if (c2789b != null) {
            c2789b.b();
        } else {
            kotlin.jvm.internal.i.m("client");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object h(u uVar, String str, InterfaceC2691h interfaceC2691h, ContinuationImpl continuationImpl) throws Throwable {
        PurchaseProviderImpl$getProduct$1 purchaseProviderImpl$getProduct$1;
        Object next;
        C2793f.a aVarA;
        uVar.getClass();
        if (continuationImpl instanceof PurchaseProviderImpl$getProduct$1) {
            purchaseProviderImpl$getProduct$1 = (PurchaseProviderImpl$getProduct$1) continuationImpl;
            int i10 = purchaseProviderImpl$getProduct$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$getProduct$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$getProduct$1 = new PurchaseProviderImpl$getProduct$1(uVar, continuationImpl);
            }
        } else {
            purchaseProviderImpl$getProduct$1 = new PurchaseProviderImpl$getProduct$1(uVar, continuationImpl);
        }
        Object objF = purchaseProviderImpl$getProduct$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$getProduct$1.label;
        String str2 = null;
        if (i11 == 0) {
            kotlin.b.b(objF);
            PurchaseProviderImpl$getProduct$productDetailsResult$1 purchaseProviderImpl$getProduct$productDetailsResult$1 = new PurchaseProviderImpl$getProduct$productDetailsResult$1(uVar, str, null);
            purchaseProviderImpl$getProduct$1.L$0 = str;
            purchaseProviderImpl$getProduct$1.L$1 = interfaceC2691h;
            purchaseProviderImpl$getProduct$1.label = 1;
            objF = C2680e.f(uVar.f30287f, purchaseProviderImpl$getProduct$productDetailsResult$1, purchaseProviderImpl$getProduct$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2691h = (InterfaceC2691h) purchaseProviderImpl$getProduct$1.L$1;
            str = (String) purchaseProviderImpl$getProduct$1.L$0;
            kotlin.b.b(objF);
        }
        Iterator it = ((a) objF).f30290b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((C2793f) next).f47198c, str));
        C2793f c2793f = (C2793f) next;
        if (c2793f != null && (aVarA = c2793f.a()) != null) {
            str2 = aVarA.f47205a;
        }
        if (str2 != null) {
            E8.a.d(interfaceC2691h, new C8.a.b(str2));
        }
        E8.a.d(interfaceC2691h, new C8.a.C0024a(PurchaseProvider.PurchaseException.ProductNotFound.f30591b));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object i(u uVar, List list, InterfaceC2691h interfaceC2691h, ContinuationImpl continuationImpl) {
        PurchaseProviderImpl$getProductsMapResult$1 purchaseProviderImpl$getProductsMapResult$1;
        String str;
        uVar.getClass();
        if (continuationImpl instanceof PurchaseProviderImpl$getProductsMapResult$1) {
            purchaseProviderImpl$getProductsMapResult$1 = (PurchaseProviderImpl$getProductsMapResult$1) continuationImpl;
            int i10 = purchaseProviderImpl$getProductsMapResult$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$getProductsMapResult$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$getProductsMapResult$1 = new PurchaseProviderImpl$getProductsMapResult$1(uVar, continuationImpl);
            }
        } else {
            purchaseProviderImpl$getProductsMapResult$1 = new PurchaseProviderImpl$getProductsMapResult$1(uVar, continuationImpl);
        }
        Object objP = purchaseProviderImpl$getProductsMapResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$getProductsMapResult$1.label;
        if (i11 == 0) {
            kotlin.b.b(objP);
            uVar.f30282a.f("GooglePurchaseProviderImpl", "getProductsMapResult(" + list + ")");
            purchaseProviderImpl$getProductsMapResult$1.L$0 = uVar;
            purchaseProviderImpl$getProductsMapResult$1.L$1 = list;
            purchaseProviderImpl$getProductsMapResult$1.L$2 = interfaceC2691h;
            purchaseProviderImpl$getProductsMapResult$1.label = 1;
            objP = uVar.p(list, purchaseProviderImpl$getProductsMapResult$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2691h = (InterfaceC2691h) purchaseProviderImpl$getProductsMapResult$1.L$2;
            list = (List) purchaseProviderImpl$getProductsMapResult$1.L$1;
            uVar = (u) purchaseProviderImpl$getProductsMapResult$1.L$0;
            kotlin.b.b(objP);
        }
        a aVar = (a) objP;
        int i12 = aVar.f30289a.f23552a;
        J8.p pVar = uVar.f30282a;
        StringBuilder sb2 = new StringBuilder("getProductsMapResult() Received products: ");
        AbstractCollection<C2793f> abstractCollection = aVar.f30290b;
        sb2.append(abstractCollection);
        pVar.e("GooglePurchaseProviderImpl", sb2.toString());
        if (i12 != 0) {
            uVar.f30282a.c("GooglePurchaseProviderImpl", "Product query failed");
            E8.a.d(interfaceC2691h, E8.a.i(new PurchaseProvider.PurchaseException.Unknown(i12)));
            return p293xa.r.f47939a;
        }
        ArrayList arrayList = new ArrayList();
        for (C2793f c2793f : abstractCollection) {
            if (list.contains(c2793f.f47198c)) {
                String str2 = c2793f.f47198c;
                kotlin.jvm.internal.i.d(str2, "getProductId(...)");
                String str3 = c2793f.f47201f;
                kotlin.jvm.internal.i.d(str3, "getName(...)");
                C2793f.a aVarA = c2793f.a();
                if (aVarA == null || (str = aVarA.f47205a) == null) {
                    str = "";
                }
                arrayList.add(new PurchaseProvider.a(str2, str3, str));
            }
        }
        E8.a.d(interfaceC2691h, E8.a.j(arrayList));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object j(u uVar, com.android.billingclient.api.a aVar, String str, Activity activity, ContinuationImpl continuationImpl) throws PurchaseProvider.PurchaseException.ProductNotFound, PurchaseProvider.PurchaseException.Unknown, PurchaseProvider.PurchaseException.AlreadyOwned {
        PurchaseProviderImpl$initiatePurchase$1 purchaseProviderImpl$initiatePurchase$1;
        Object next;
        String str2;
        uVar.getClass();
        if (continuationImpl instanceof PurchaseProviderImpl$initiatePurchase$1) {
            purchaseProviderImpl$initiatePurchase$1 = (PurchaseProviderImpl$initiatePurchase$1) continuationImpl;
            int i10 = purchaseProviderImpl$initiatePurchase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$initiatePurchase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$initiatePurchase$1 = new PurchaseProviderImpl$initiatePurchase$1(uVar, continuationImpl);
            }
        } else {
            purchaseProviderImpl$initiatePurchase$1 = new PurchaseProviderImpl$initiatePurchase$1(uVar, continuationImpl);
        }
        Object objP = purchaseProviderImpl$initiatePurchase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$initiatePurchase$1.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.b.b(objP);
            int i12 = aVar.f23552a;
            J8.p pVar = uVar.f30282a;
            pVar.f("GooglePurchaseProviderImpl", "onBillingSetupFinished(" + i12 + ", " + str + ")");
            if (i12 != 0) {
                pVar.f("GooglePurchaseProviderImpl", "Billing client setup failed with code: " + i12);
                throw new PurchaseProvider.PurchaseException.Unknown(i12);
            }
            List listK = M1.k(str);
            purchaseProviderImpl$initiatePurchase$1.L$0 = uVar;
            purchaseProviderImpl$initiatePurchase$1.L$1 = str;
            purchaseProviderImpl$initiatePurchase$1.L$2 = activity;
            purchaseProviderImpl$initiatePurchase$1.label = 1;
            objP = uVar.p(listK, purchaseProviderImpl$initiatePurchase$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Activity) purchaseProviderImpl$initiatePurchase$1.L$2;
            str = (String) purchaseProviderImpl$initiatePurchase$1.L$1;
            uVar = (u) purchaseProviderImpl$initiatePurchase$1.L$0;
            kotlin.b.b(objP);
        }
        a aVar2 = (a) objP;
        int i13 = aVar2.f30289a.f23552a;
        uVar.f30282a.f("GooglePurchaseProviderImpl", "client.queryProductDetails(" + i13 + ")");
        Iterator it = aVar2.f30290b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((C2793f) next).f47198c, str));
        C2793f c2793f = (C2793f) next;
        J8.p pVar2 = uVar.f30282a;
        if (i13 != 0 || c2793f == null) {
            pVar2.c("GooglePurchaseProviderImpl", "Product query failed");
            throw PurchaseProvider.PurchaseException.ProductNotFound.f30591b;
        }
        C2791d.a.C0536a c0536a = new C2791d.a.C0536a();
        c0536a.f47193a = c2793f;
        if (c2793f.a() != null) {
            c2793f.a().getClass();
            String str3 = c2793f.a().f47206b;
            if (str3 != null) {
                c0536a.f47194b = str3;
            }
        }
        if (c0536a.f47193a == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        ArrayList arrayList = new ArrayList(M1.k(new C2791d.a(c0536a)));
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((C2791d.a) it2.next()) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        C2791d c2791d = new C2791d();
        c2791d.f47187a = (zIsEmpty || ((C2791d.a) arrayList.get(0)).f47191a.d().isEmpty()) ? false : true;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
            z10 = false;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z10 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        c2791d.f47188b = new C2791d.b();
        c2791d.f47190d = new ArrayList();
        c2791d.f47189c = zzbt.C(arrayList);
        C2789b c2789b = uVar.f30288g;
        if (c2789b == null) {
            kotlin.jvm.internal.i.m("client");
            throw null;
        }
        int i14 = c2789b.c(activity, c2791d).f23552a;
        pVar2.f("GooglePurchaseProviderImpl", "client.launchBillingFlow() = " + i14);
        if (i14 == 7) {
            throw PurchaseProvider.PurchaseException.AlreadyOwned.f30585b;
        }
        if (i14 == 0) {
            C2793f.a aVarA = c2793f.a();
            if (aVarA == null || (str2 = aVarA.f47205a) == null) {
                str2 = "";
            }
            K8.o oVar = uVar.f30284c;
            oVar.z(str);
            oVar.p0(str2);
            uVar.f30286e.R("initiated_payment", str, str2, "");
        }
        return p293xa.r.f47939a;
    }

    public static final Object k(u uVar, String str, int i10, List list, SuspendLambda suspendLambda) {
        uVar.getClass();
        uVar.f30282a.f("GooglePurchaseProviderImpl", "onPurchaseUpdated(" + i10 + ")");
        Purchase purchase = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((Purchase) obj2).a().contains(str)) {
                    obj = obj2;
                    break;
                }
            }
            purchase = (Purchase) obj;
        }
        boolean z10 = i10 == 0 || i10 == 7;
        uVar.f30286e.R("pending_payment", str, uVar.f30284c.G(), "");
        if (i10 == 3) {
            uVar.o("failure");
        }
        return (!z10 || purchase == null) ? new C8.a.C0024a(new PurchaseProvider.PurchaseException.Unknown(i10)) : uVar.q(purchase, suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0079
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(com.voltasit.obdeleven.data.providers.u r7, java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$tryConsumeAllPurchases$1
            if (r0 == 0) goto L16
            r0 = r9
            com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$tryConsumeAllPurchases$1 r0 = (com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$tryConsumeAllPurchases$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$tryConsumeAllPurchases$1 r0 = new com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$tryConsumeAllPurchases$1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.L$0
            com.voltasit.obdeleven.data.providers.u r2 = (com.voltasit.obdeleven.data.providers.u) r2
            kotlin.b.b(r9)
            r6 = r0
            r0 = r8
            r8 = r2
        L36:
            r2 = r6
            goto L7d
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.b.b(r9)
            J8.p r9 = r7.f30282a
            java.lang.String r2 = "GooglePurchaseProviderImpl"
            java.lang.String r4 = "tryConsumeAllPurchases"
            r9.f(r2, r4)
            java.util.Iterator r8 = r8.iterator()
            r9 = r8
            r8 = r7
            r7 = r3
        L53:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r9.next()
            com.android.billingclient.api.Purchase r2 = (com.android.billingclient.api.Purchase) r2
            org.json.JSONObject r4 = r2.f23551c
            java.lang.String r5 = "purchaseState"
            int r4 = r4.optInt(r5, r3)
            r5 = 4
            if (r4 == r5) goto L53
            r0.L$0 = r8
            r0.L$1 = r9
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r2 = r8.q(r2, r0)
            if (r2 != r1) goto L79
            goto L9d
        L79:
            r6 = r0
            r0 = r9
            r9 = r2
            goto L36
        L7d:
            C8.a r9 = (C8.a) r9
            if (r7 == 0) goto L83
            boolean r7 = r9 instanceof C8.a.b
        L83:
            r9 = r0
            r0 = r2
            goto L53
        L86:
            if (r7 == 0) goto L96
            K8.o r7 = r8.f30284c
            r8 = 0
            r7.i(r8)
            C8.a$b r1 = new C8.a$b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r1.<init>(r7)
            goto L9d
        L96:
            C8.a$a r1 = new C8.a$a
            com.voltasit.obdeleven.domain.providers.PurchaseProvider$PurchaseException$ConsumeFailure r7 = com.voltasit.obdeleven.domain.providers.PurchaseProvider.PurchaseException.ConsumeFailure.f30587b
            r1.<init>(r7)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.data.providers.u.l(com.voltasit.obdeleven.data.providers.u, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final String a(PurchaseProvider.PurchaseException result) {
        kotlin.jvm.internal.i.e(result, "result");
        boolean zEquals = result.equals(PurchaseProvider.PurchaseException.WaitingForOperationToFinish.f30595b);
        J8.d dVar = this.f30283b;
        if (zEquals) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.ProductNotFound.f30591b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.ConsumeFailure.f30587b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.InvalidPurchase.f30589b)) {
            return dVar.a(R.string.common_purchase_unauthorized, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.PendingPayment.f30590b)) {
            return dVar.a(R.string.common_purchase_unauthorized, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.Disconnected.f30588b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.Unavailable.f30593b)) {
            return dVar.a(R.string.common_unavailable, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.AlreadyOwned.f30585b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result instanceof PurchaseProvider.PurchaseException.Unknown) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.Canceled.f30586b)) {
            return dVar.a(R.string.common_cancelled, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.UserNotLoggedIn.f30594b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        if (result.equals(PurchaseProvider.PurchaseException.RegionNotSupported.f30592b)) {
            return dVar.a(R.string.common_purchase_failure, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final Object b(Activity activity, final String str, final p040d1.a aVar, kotlin.coroutines.c cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        AbstractC2788a.C0535a c0535a = new AbstractC2788a.C0535a(activity);
        c0535a.f47156a = new C.e();
        c0535a.f47158c = new InterfaceC2794g() { // from class: com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductPrice$2$1

            /* JADX INFO: renamed from: com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductPrice$2$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: PurchaseProviderImpl.kt */
            @Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductPrice$2$1$1", f = "PurchaseProviderImpl.kt", l = {219}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                final /* synthetic */ String $productId;
                final /* synthetic */ List<Purchase> $purchases;
                final /* synthetic */ com.android.billingclient.api.a $result;
                int label;
                final /* synthetic */ u this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(u uVar, String str, com.android.billingclient.api.a aVar, List<Purchase> list, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = uVar;
                    this.$productId = str;
                    this.$result = aVar;
                    this.$purchases = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.this$0, this.$productId, this.$result, this.$purchases, cVar);
                }

                @Override // Ia.p
                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.b.b(obj);
                        u uVar = this.this$0;
                        String str = this.$productId;
                        int i11 = this.$result.f23552a;
                        List<Purchase> list = this.$purchases;
                        this.label = 1;
                        if (u.k(uVar, str, i11, list, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    u.g(this.this$0);
                    return p293xa.r.f47939a;
                }
            }

            @Override // p237t3.InterfaceC2794g
            public final void a(com.android.billingclient.api.a result, List<Purchase> list) {
                kotlin.jvm.internal.i.e(result, "result");
                u uVar = this;
                C2680e.c(aVar, uVar.f30287f, null, new AnonymousClass1(uVar, str, result, list, null), 2);
            }
        };
        C2789b c2789bA = c0535a.a();
        this.f30288g = c2789bA;
        c2789bA.e(new InterfaceC2790c() { // from class: com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductPrice$2$2
            @Override // p237t3.InterfaceC2790c
            public final void a(com.android.billingclient.api.a billingResult) {
                kotlin.jvm.internal.i.e(billingResult, "billingResult");
                u uVar = this.f30235a;
                C2680e.c(aVar, uVar.f30287f, null, new PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1(uVar, str, c2693i, null), 2);
            }

            @Override // p237t3.InterfaceC2790c
            public final void b() {
                this.f30235a.f30282a.f("GooglePurchaseProviderImpl", "onBillingServiceDisconnected");
                E8.a.d(c2693i, new C8.a.C0024a(PurchaseProvider.PurchaseException.Disconnected.f30588b));
            }
        });
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final p293xa.r c() {
        return p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final Object d(final Activity activity, final String str, final p040d1.a aVar, kotlin.coroutines.c cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        this.f30282a.f("GooglePurchaseProviderImpl", "purchase(" + str + ")");
        this.f30284c.i(true);
        AbstractC2788a.C0535a c0535a = new AbstractC2788a.C0535a(activity);
        c0535a.f47156a = new C.e();
        c0535a.f47158c = new InterfaceC2794g(this) { // from class: com.voltasit.obdeleven.data.providers.t

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f30280d;

            {
                this.f30280d = this;
            }

            @Override // p237t3.InterfaceC2794g
            public final void a(com.android.billingclient.api.a result, List list) {
                p040d1.a coroutineScope = aVar;
                kotlin.jvm.internal.i.e(coroutineScope, "$coroutineScope");
                C2693i c2693i2 = c2693i;
                u this$0 = this.f30280d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String productId = str;
                kotlin.jvm.internal.i.e(productId, "$productId");
                kotlin.jvm.internal.i.e(result, "result");
                C2680e.c(coroutineScope, N.f43200c, null, new PurchaseProviderImpl$buildPurchasingClient$1$1(c2693i2, this$0, productId, result, list, null), 2);
            }
        };
        C2789b c2789bA = c0535a.a();
        this.f30288g = c2789bA;
        c2789bA.e(new InterfaceC2790c() { // from class: com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$startPurchaseConnection$1
            @Override // p237t3.InterfaceC2790c
            public final void a(com.android.billingclient.api.a billingResult) {
                kotlin.jvm.internal.i.e(billingResult, "billingResult");
                Sa.a aVar2 = N.f43200c;
                C2693i c2693i2 = c2693i;
                C2680e.c(aVar, aVar2, null, new PurchaseProviderImpl$startPurchaseConnection$1$onBillingSetupFinished$1(this.f30242a, billingResult, str, activity, c2693i2, null), 2);
            }

            @Override // p237t3.InterfaceC2790c
            public final void b() {
                this.f30242a.f30282a.f("GooglePurchaseProviderImpl", "onBillingServiceDisconnected");
                E8.a.d(c2693i, new C8.a.C0024a(PurchaseProvider.PurchaseException.Disconnected.f30588b));
            }
        });
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final Object e(Activity activity, final p040d1.a aVar, kotlin.coroutines.c cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        this.f30282a.f("GooglePurchaseProviderImpl", "checkPendingPayments()");
        AbstractC2788a.C0535a c0535a = new AbstractC2788a.C0535a(activity);
        c0535a.f47158c = new Q6.d(this);
        c0535a.f47156a = new C.e();
        C2789b c2789bA = c0535a.a();
        this.f30288g = c2789bA;
        c2789bA.e(new InterfaceC2790c() { // from class: com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$startPendingConnection$1
            @Override // p237t3.InterfaceC2790c
            public final void a(com.android.billingclient.api.a result) {
                kotlin.jvm.internal.i.e(result, "result");
                u uVar = this.f30239a;
                uVar.f30282a.f("GooglePurchaseProviderImpl", "checkPendingPayments onBillingSetupFinished with code: " + result.f23552a + " ");
                C2680e.c(aVar, null, null, new PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1(uVar, c2693i, null), 3);
            }

            @Override // p237t3.InterfaceC2790c
            public final void b() {
                u uVar = this.f30239a;
                uVar.f30282a.f("GooglePurchaseProviderImpl", "checkPendingPayments onBillingServiceDisconnected");
                uVar.f30284c.d0(false);
                E8.a.d(c2693i, new C8.a.C0024a(PurchaseProvider.PurchaseException.Disconnected.f30588b));
            }
        });
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    @Override // com.voltasit.obdeleven.domain.providers.PurchaseProvider
    public final Object f(final ArrayList arrayList, ContinuationImpl continuationImpl) {
        C2693i c2693i = new C2693i(1, A8.p.y(continuationImpl));
        c2693i.s();
        this.f30282a.f("GooglePurchaseProviderImpl", "getProductPrices(" + arrayList + ")");
        Activity activityE = this.f30283b.e();
        InterfaceC2794g interfaceC2794g = new InterfaceC2794g() { // from class: com.voltasit.obdeleven.data.providers.s
            @Override // p237t3.InterfaceC2794g
            public final void a(com.android.billingclient.api.a billingResult, List list) {
                u this$0 = this.f30276b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ArrayList arrayList2 = arrayList;
                kotlin.jvm.internal.i.e(billingResult, "billingResult");
                this$0.f30282a.f("GooglePurchaseProviderImpl", "onPurchaseUpdated(" + arrayList2 + ")");
                C2680e.c(B.a(this$0.f30287f), null, null, new PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1(arrayList2, this$0, billingResult, list, null), 3);
            }
        };
        this.f30282a.f("GooglePurchaseProviderImpl", "buildBillingClient()");
        AbstractC2788a.C0535a c0535a = new AbstractC2788a.C0535a(activityE);
        c0535a.f47156a = new C.e();
        c0535a.f47158c = interfaceC2794g;
        this.f30288g = c0535a.a();
        this.f30282a.f("GooglePurchaseProviderImpl", "startGetProductsConnection(" + arrayList + ")");
        C2789b c2789b = this.f30288g;
        if (c2789b == null) {
            kotlin.jvm.internal.i.m("client");
            throw null;
        }
        c2789b.e(new w(this, c2693i, arrayList));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, ContinuationImpl continuationImpl) {
        PurchaseProviderImpl$consumeLocal$1 purchaseProviderImpl$consumeLocal$1;
        u uVar;
        if (continuationImpl instanceof PurchaseProviderImpl$consumeLocal$1) {
            purchaseProviderImpl$consumeLocal$1 = (PurchaseProviderImpl$consumeLocal$1) continuationImpl;
            int i10 = purchaseProviderImpl$consumeLocal$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$consumeLocal$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$consumeLocal$1 = new PurchaseProviderImpl$consumeLocal$1(this, continuationImpl);
            }
        } else {
            purchaseProviderImpl$consumeLocal$1 = new PurchaseProviderImpl$consumeLocal$1(this, continuationImpl);
        }
        Object objP = purchaseProviderImpl$consumeLocal$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$consumeLocal$1.label;
        if (i11 == 0) {
            kotlin.b.b(objP);
            this.f30282a.f("GooglePurchaseProviderImpl", "consumeLocal");
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C2792e c2792e = new C2792e();
            c2792e.f47195a = str;
            purchaseProviderImpl$consumeLocal$1.L$0 = this;
            purchaseProviderImpl$consumeLocal$1.L$1 = c2792e;
            purchaseProviderImpl$consumeLocal$1.label = 1;
            C2693i c2693i = new C2693i(1, A8.p.y(purchaseProviderImpl$consumeLocal$1));
            c2693i.s();
            C2789b c2789b = this.f30288g;
            if (c2789b == null) {
                kotlin.jvm.internal.i.m("client");
                throw null;
            }
            c2789b.a(new C0710c(c2693i), c2792e);
            objP = c2693i.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
            uVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) purchaseProviderImpl$consumeLocal$1.L$0;
            kotlin.b.b(objP);
        }
        kotlin.jvm.internal.i.d(objP, "suspendCancellableCoroutine(...)");
        com.android.billingclient.api.a aVar = (com.android.billingclient.api.a) objP;
        uVar.f30282a.f("GooglePurchaseProviderImpl", "consume result " + aVar.f23552a);
        return Boolean.valueOf(aVar.f23552a == 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, InAppPurchaseRepository.Result result, ContinuationImpl continuationImpl) {
        PurchaseProviderImpl$handleIapCloudConsumeSuccess$1 purchaseProviderImpl$handleIapCloudConsumeSuccess$1;
        u uVar;
        int iOrdinal;
        if (continuationImpl instanceof PurchaseProviderImpl$handleIapCloudConsumeSuccess$1) {
            purchaseProviderImpl$handleIapCloudConsumeSuccess$1 = (PurchaseProviderImpl$handleIapCloudConsumeSuccess$1) continuationImpl;
            int i10 = purchaseProviderImpl$handleIapCloudConsumeSuccess$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$handleIapCloudConsumeSuccess$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$handleIapCloudConsumeSuccess$1 = new PurchaseProviderImpl$handleIapCloudConsumeSuccess$1(this, continuationImpl);
            }
        } else {
            purchaseProviderImpl$handleIapCloudConsumeSuccess$1 = new PurchaseProviderImpl$handleIapCloudConsumeSuccess$1(this, continuationImpl);
        }
        Object objM = purchaseProviderImpl$handleIapCloudConsumeSuccess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$handleIapCloudConsumeSuccess$1.label;
        if (i11 == 0) {
            kotlin.b.b(objM);
            if (result == InAppPurchaseRepository.Result.f30599b || result == InAppPurchaseRepository.Result.f30600c || result == InAppPurchaseRepository.Result.f30604g) {
                purchaseProviderImpl$handleIapCloudConsumeSuccess$1.L$0 = this;
                purchaseProviderImpl$handleIapCloudConsumeSuccess$1.L$1 = result;
                purchaseProviderImpl$handleIapCloudConsumeSuccess$1.label = 1;
                objM = m(str, purchaseProviderImpl$handleIapCloudConsumeSuccess$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uVar = this;
            } else {
                uVar = this;
            }
            uVar.getClass();
            iOrdinal = result.ordinal();
            if (iOrdinal != 0 || iOrdinal == 1) {
                return new C8.a.b(Boolean.TRUE);
            }
            if (iOrdinal == 2) {
                return new C8.a.C0024a(PurchaseProvider.PurchaseException.InvalidPurchase.f30589b);
            }
            if (iOrdinal == 3) {
                return new C8.a.C0024a(PurchaseProvider.PurchaseException.ProductNotFound.f30591b);
            }
            if (iOrdinal == 4) {
                return new C8.a.C0024a(PurchaseProvider.PurchaseException.PendingPayment.f30590b);
            }
            if (iOrdinal == 5) {
                return new C8.a.C0024a(PurchaseProvider.PurchaseException.Canceled.f30586b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        result = (InAppPurchaseRepository.Result) purchaseProviderImpl$handleIapCloudConsumeSuccess$1.L$1;
        uVar = (u) purchaseProviderImpl$handleIapCloudConsumeSuccess$1.L$0;
        kotlin.b.b(objM);
        if (!((Boolean) objM).booleanValue()) {
            return new C8.a.C0024a(PurchaseProvider.PurchaseException.ConsumeFailure.f30587b);
        }
        uVar.getClass();
        iOrdinal = result.ordinal();
        if (iOrdinal != 0) {
        }
        return new C8.a.b(Boolean.TRUE);
    }

    public final void o(String str) {
        K8.o oVar = this.f30284c;
        this.f30286e.R("finished_payment", oVar.S(), oVar.G(), str);
    }

    public final Object p(List list, ContinuationImpl continuationImpl) {
        this.f30282a.f("GooglePurchaseProviderImpl", "queryProductDetails(" + list + ")");
        ArrayList<C2795h.b> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C2795h.b.a aVar = new C2795h.b.a();
            aVar.f47214a = str;
            aVar.f47215b = "inapp";
            if (str == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            arrayList.add(new C2795h.b(aVar));
        }
        C2795h.a aVar2 = new C2795h.a();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (C2795h.b bVar : arrayList) {
            if (!"play_pass_subs".equals(bVar.f47213b)) {
                hashSet.add(bVar.f47213b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        aVar2.f47211a = zzbt.C(arrayList);
        C2693i c2693i = new C2693i(1, A8.p.y(continuationImpl));
        c2693i.s();
        C2789b c2789b = this.f30288g;
        if (c2789b == null) {
            kotlin.jvm.internal.i.m("client");
            throw null;
        }
        if (aVar2.f47211a == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        c2789b.d(new C2795h(aVar2), new v(c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object q(Purchase purchase, ContinuationImpl continuationImpl) {
        PurchaseProviderImpl$tryConsume$1 purchaseProviderImpl$tryConsume$1;
        u uVar;
        if (continuationImpl instanceof PurchaseProviderImpl$tryConsume$1) {
            purchaseProviderImpl$tryConsume$1 = (PurchaseProviderImpl$tryConsume$1) continuationImpl;
            int i10 = purchaseProviderImpl$tryConsume$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                purchaseProviderImpl$tryConsume$1.label = i10 - Integer.MIN_VALUE;
            } else {
                purchaseProviderImpl$tryConsume$1 = new PurchaseProviderImpl$tryConsume$1(this, continuationImpl);
            }
        } else {
            purchaseProviderImpl$tryConsume$1 = new PurchaseProviderImpl$tryConsume$1(this, continuationImpl);
        }
        Object objA = purchaseProviderImpl$tryConsume$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = purchaseProviderImpl$tryConsume$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                purchase = (Purchase) purchaseProviderImpl$tryConsume$1.L$1;
                uVar = (u) purchaseProviderImpl$tryConsume$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        this.f30282a.f("GooglePurchaseProviderImpl", "tryConsume(" + purchase.a() + ")");
        Object objO = kotlin.collections.q.O(purchase.a());
        kotlin.jvm.internal.i.d(objO, "first(...)");
        JSONObject jSONObject = purchase.f23551c;
        String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        kotlin.jvm.internal.i.d(strOptString, "getPurchaseToken(...)");
        purchaseProviderImpl$tryConsume$1.L$0 = this;
        purchaseProviderImpl$tryConsume$1.L$1 = purchase;
        purchaseProviderImpl$tryConsume$1.label = 1;
        objA = this.f30285d.a("com.voltasit.obdeleven", (String) objO, strOptString, purchaseProviderImpl$tryConsume$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        uVar = this;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVar.o("failure");
            uVar.f30284c.d0(false);
            uVar.f30282a.d(((C8.a.C0024a) aVar).f2462a, false);
            return aVar;
        }
        C8.a.b bVar = (C8.a.b) aVar;
        InAppPurchaseRepository.Result result = (InAppPurchaseRepository.Result) bVar.f2463a;
        kotlin.jvm.internal.i.e(result, "<this>");
        String str = result == InAppPurchaseRepository.Result.f30599b ? "success" : "failure";
        K8.o oVar = uVar.f30284c;
        InAppPurchaseRepository.Result result2 = InAppPurchaseRepository.Result.f30603f;
        oVar.d0(result == result2);
        if (result != result2 && result != InAppPurchaseRepository.Result.f30600c) {
            uVar.o(str);
        }
        JSONObject jSONObject2 = purchase.f23551c;
        String strOptString2 = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
        kotlin.jvm.internal.i.d(strOptString2, "getPurchaseToken(...)");
        InAppPurchaseRepository.Result result3 = (InAppPurchaseRepository.Result) bVar.f2463a;
        purchaseProviderImpl$tryConsume$1.L$0 = null;
        purchaseProviderImpl$tryConsume$1.L$1 = null;
        purchaseProviderImpl$tryConsume$1.label = 2;
        objA = uVar.n(strOptString2, result3, purchaseProviderImpl$tryConsume$1);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
