package p068f4;

import S4.o;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.m;
import org.json.JSONObject;
import p237t3.AbstractC2788a;
import p237t3.InterfaceC2790c;
import p237t3.InterfaceC2794g;

/* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static i f34952u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f34958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f34959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f34960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f34961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f34962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class<?> f34963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class<?> f34964i;
    public final Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f34965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f34966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f34967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f34968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f34969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f34970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f34971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet f34972r = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f34950s = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f34951t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f34953v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ConcurrentHashMap f34954w = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ConcurrentHashMap f34955x = new ConcurrentHashMap();

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m7, Object[] objArr) {
            kotlin.jvm.internal.i.e(proxy, "proxy");
            kotlin.jvm.internal.i.e(m7, "m");
            if (kotlin.jvm.internal.i.a(m7.getName(), "onBillingSetupFinished")) {
                i.f34953v.set(true);
                return null;
            }
            String name = m7.getName();
            kotlin.jvm.internal.i.d(name, "m.name");
            if (!m.C(name, "onBillingServiceDisconnected", false)) {
                return null;
            }
            i.f34953v.set(false);
            return null;
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:88:0x0153  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public static void a(Context context) throws ClassNotFoundException {
            Class<?> cls;
            Class<?> cls2;
            m mVar;
            Class<?> cls3;
            Class<?> cls4;
            Class<?> cls5;
            Class<?> cls6;
            Object objL;
            Method methodJ;
            Object objL2;
            AtomicBoolean atomicBoolean = m.f34987h;
            if (atomicBoolean.get()) {
                mVar = m.f34986g;
            } else {
                try {
                    cls = Class.forName("com.android.billingclient.api.SkuDetailsParams");
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                try {
                    cls2 = Class.forName("com.android.billingclient.api.SkuDetailsParams$Builder");
                } catch (ClassNotFoundException unused2) {
                    cls2 = null;
                }
                if (cls != null && cls2 != null) {
                    Method methodJ2 = o.j(cls, "newBuilder", new Class[0]);
                    Method methodJ3 = o.j(cls2, "setType", String.class);
                    Method methodJ4 = o.j(cls2, "setSkusList", List.class);
                    Method methodJ5 = o.j(cls2, "build", new Class[0]);
                    if (methodJ2 != null && methodJ3 != null && methodJ4 != null && methodJ5 != null) {
                        m.f34986g = new m(cls, cls2, methodJ2, methodJ3, methodJ4, methodJ5);
                    }
                }
                atomicBoolean.set(true);
                mVar = m.f34986g;
            }
            if (mVar == null) {
                return;
            }
            try {
                cls3 = Class.forName("com.android.billingclient.api.Purchase$PurchasesResult");
            } catch (ClassNotFoundException unused3) {
                cls3 = null;
            }
            try {
                cls4 = Class.forName("com.android.billingclient.api.PurchaseHistoryRecord");
            } catch (ClassNotFoundException unused4) {
                cls4 = null;
            }
            try {
                cls5 = Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
            } catch (ClassNotFoundException unused5) {
                cls5 = null;
            }
            try {
                cls6 = Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
            } catch (ClassNotFoundException unused6) {
                cls6 = null;
            }
            if (AbstractC2788a.class == 0 || cls3 == null || Purchase.class == 0 || SkuDetails.class == 0 || cls5 == null || cls4 == null || cls6 == null) {
                return;
            }
            Method methodJ6 = o.j(AbstractC2788a.class, "queryPurchases", String.class);
            Method methodJ7 = o.j(cls3, "getPurchasesList", new Class[0]);
            Method methodJ8 = o.j(Purchase.class, "getOriginalJson", new Class[0]);
            Method methodJ9 = o.j(SkuDetails.class, "getOriginalJson", new Class[0]);
            Method methodJ10 = o.j(cls4, "getOriginalJson", new Class[0]);
            Method methodJ11 = o.j(AbstractC2788a.class, "querySkuDetailsAsync", mVar.f34988a, cls5);
            Method methodJ12 = o.j(AbstractC2788a.class, "queryPurchaseHistoryAsync", String.class, cls6);
            if (methodJ6 == null || methodJ7 == null || methodJ8 == null || methodJ9 == null || methodJ10 == null || methodJ11 == null || methodJ12 == null) {
                return;
            }
            if (AbstractC2788a.C0535a.class == 0 || InterfaceC2794g.class == 0) {
                objL = null;
            } else {
                Method methodJ13 = o.j(AbstractC2788a.class, "newBuilder", Context.class);
                Method methodJ14 = o.j(AbstractC2788a.C0535a.class, "enablePendingPurchases", new Class[0]);
                Method methodJ15 = o.j(AbstractC2788a.C0535a.class, "setListener", InterfaceC2794g.class);
                Method methodJ16 = o.j(AbstractC2788a.C0535a.class, "build", new Class[0]);
                if (methodJ13 == null || methodJ14 == null || methodJ15 == null || methodJ16 == null) {
                    objL = null;
                } else {
                    Object objL3 = o.l(AbstractC2788a.class, null, methodJ13, context);
                    if (objL3 == null) {
                        objL = null;
                    } else {
                        Object objL4 = o.l(AbstractC2788a.C0535a.class, objL3, methodJ15, Proxy.newProxyInstance(InterfaceC2794g.class.getClassLoader(), new Class[]{InterfaceC2794g.class}, new d()));
                        if (objL4 == null || (objL2 = o.l(AbstractC2788a.C0535a.class, objL4, methodJ14, new Object[0])) == null) {
                            objL = null;
                        } else {
                            objL = o.l(AbstractC2788a.C0535a.class, objL2, methodJ16, new Object[0]);
                        }
                    }
                }
            }
            if (objL == null) {
                return;
            }
            i.f34952u = new i(context, objL, AbstractC2788a.class, cls3, Purchase.class, SkuDetails.class, cls4, cls5, cls6, methodJ6, methodJ7, methodJ8, methodJ9, methodJ10, methodJ11, methodJ12, mVar);
            if (InterfaceC2790c.class == 0 || (methodJ = o.j(AbstractC2788a.class, "startConnection", InterfaceC2790c.class)) == null) {
                return;
            }
            o.l(AbstractC2788a.class, objL, methodJ, Proxy.newProxyInstance(InterfaceC2790c.class.getClassLoader(), new Class[]{InterfaceC2790c.class}, new a()));
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f34973a;

        public c(h hVar) {
            this.f34973a = hVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            kotlin.jvm.internal.i.e(proxy, "proxy");
            kotlin.jvm.internal.i.e(method, "method");
            if (kotlin.jvm.internal.i.a(method.getName(), "onPurchaseHistoryResponse")) {
                Object obj = objArr == null ? null : objArr[1];
                if (obj != null && (obj instanceof List)) {
                    i iVar = i.this;
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objL = o.l(iVar.f34962g, it.next(), iVar.f34968n, new Object[0]);
                            String str = objL instanceof String ? (String) objL : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                jSONObject.put("packageName", iVar.f34956a.getPackageName());
                                if (jSONObject.has("productId")) {
                                    String skuID = jSONObject.getString("productId");
                                    iVar.f34972r.add(skuID);
                                    ConcurrentHashMap concurrentHashMap = i.f34954w;
                                    kotlin.jvm.internal.i.d(skuID, "skuID");
                                    concurrentHashMap.put(skuID, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.f34973a.run();
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m7, Object[] objArr) {
            kotlin.jvm.internal.i.e(proxy, "proxy");
            kotlin.jvm.internal.i.e(m7, "m");
            return null;
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f34975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f34976b;

        public e(i this$0, Runnable runnable) {
            kotlin.jvm.internal.i.e(this$0, "this$0");
            this.f34976b = this$0;
            this.f34975a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m7, Object[] objArr) {
            kotlin.jvm.internal.i.e(proxy, "proxy");
            kotlin.jvm.internal.i.e(m7, "m");
            if (kotlin.jvm.internal.i.a(m7.getName(), "onSkuDetailsResponse")) {
                Object obj = objArr == null ? null : objArr[1];
                if (obj != null && (obj instanceof List)) {
                    for (Object obj2 : (List) obj) {
                        try {
                            i iVar = this.f34976b;
                            Object objL = o.l(iVar.f34961f, obj2, iVar.f34967m, new Object[0]);
                            String str = objL instanceof String ? (String) objL : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String skuID = jSONObject.getString("productId");
                                    ConcurrentHashMap concurrentHashMap = i.f34955x;
                                    kotlin.jvm.internal.i.d(skuID, "skuID");
                                    concurrentHashMap.put(skuID, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.f34975a.run();
                }
            }
            return null;
        }
    }

    public i(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, m mVar) {
        this.f34956a = context;
        this.f34957b = obj;
        this.f34958c = cls;
        this.f34959d = cls2;
        this.f34960e = cls3;
        this.f34961f = cls4;
        this.f34962g = cls5;
        this.f34963h = cls6;
        this.f34964i = cls7;
        this.j = method;
        this.f34965k = method2;
        this.f34966l = method3;
        this.f34967m = method4;
        this.f34968n = method5;
        this.f34969o = method6;
        this.f34970p = method7;
        this.f34971q = mVar;
    }

    public final void a(ArrayList arrayList, Runnable runnable) {
        Object objL;
        Class<?> cls = this.f34963h;
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e(this, runnable));
        m mVar = this.f34971q;
        Object objL2 = null;
        Object objL3 = o.l(mVar.f34988a, null, mVar.f34990c, new Object[0]);
        if (objL3 != null) {
            Class<?> cls2 = mVar.f34989b;
            Object objL4 = o.l(cls2, objL3, mVar.f34991d, "inapp");
            if (objL4 != null && (objL = o.l(cls2, objL4, mVar.f34992e, arrayList)) != null) {
                objL2 = o.l(cls2, objL, mVar.f34993f, new Object[0]);
            }
        }
        o.l(this.f34958c, this.f34957b, this.f34969o, objL2, objNewProxyInstance);
    }
}
