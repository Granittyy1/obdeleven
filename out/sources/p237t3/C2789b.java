package p237t3;

import C.e;
import K2.C0710c;
import Q7.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.c1;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.AbstractC2003s;
import com.google.android.gms.internal.play_billing.C1954b0;
import com.google.android.gms.internal.play_billing.C1957c0;
import com.google.android.gms.internal.play_billing.C1983l;
import com.google.android.gms.internal.play_billing.C1995p;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC1956c;
import com.google.android.gms.internal.play_billing.J1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.voltasit.obdeleven.data.providers.u;
import com.voltasit.obdeleven.data.providers.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p131k5.RunnableC2527j1;
import p131k5.W2;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2789b extends AbstractC2788a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ExecutorService f47159A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Long f47160B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AbstractC2003s f47161C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47165d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile H f47167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f47168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f47169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile InterfaceC1956c f47170i;
    public volatile r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47171k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f47178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f47179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f47181u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f47182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f47184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f47185y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile InterfaceC2790c f47186z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47162a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f47163b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f47166e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f47172l = 0;

    public C2789b(e eVar, Activity activity, InterfaceC2794g interfaceC2794g, AbstractC2788a.C0535a c0535a) {
        long jNextLong = new Random().nextLong();
        this.f47160B = Long.valueOf(jNextLong);
        this.f47161C = C1983l.f26209a;
        this.f47164c = "8.0.0";
        String strW = w();
        this.f47165d = strW;
        this.f47168g = activity.getApplicationContext();
        U1 u1C = V1.C();
        u1C.f();
        V1.y((V1) u1C.f26124c);
        if (strW != null) {
            u1C.f();
            V1.z((V1) u1C.f26124c, strW);
        }
        String packageName = this.f47168g.getPackageName();
        u1C.f();
        V1.w((V1) u1C.f26124c, packageName);
        u1C.f();
        V1.t((V1) u1C.f26124c, jNextLong);
        c0535a.getClass();
        u1C.f();
        V1.x((V1) u1C.f26124c);
        int i10 = Build.VERSION.SDK_INT;
        u1C.f();
        V1.q((V1) u1C.f26124c, i10);
        u1C.g();
        try {
            int i11 = this.f47168g.getPackageManager().getPackageInfo(this.f47168g.getPackageName(), 0).versionCode;
            u1C.f();
            V1.r((V1) u1C.f26124c, i11);
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
        this.f47169h = new c(this.f47168g, (V1) u1C.c());
        if (interfaceC2794g == null) {
            int i12 = C2018x.f26297a;
            Log.isLoggable("BillingClient", 5);
        }
        this.f47167f = new H(this.f47168g, interfaceC2794g, this.f47169h);
        this.f47184x = eVar;
        this.f47185y = false;
        this.f47168g.getPackageName();
    }

    public static Future g(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new W2(futureSubmit, 2, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            C2018x.i("BillingClient");
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(C2789b c2789b, int i10) {
        if (i10 != 0) {
            c2789b.l(0);
            return;
        }
        synchronized (c2789b.f47162a) {
            try {
                if (c2789b.f47163b == 3) {
                    return;
                }
                c2789b.l(2);
                H h8 = c2789b.f47167f != null ? c2789b.f47167f : null;
                if (h8 != null) {
                    boolean z10 = c2789b.f47181u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    h8.f47147f = z10;
                    G g10 = h8.f47146e;
                    Context context = h8.f47142a;
                    g10.a(context, intentFilter2);
                    if (!h8.f47147f) {
                        h8.f47145d.a(context, intentFilter);
                        return;
                    }
                    G g11 = h8.f47145d;
                    synchronized (g11) {
                        try {
                            if (!g11.f47139a) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    context.registerReceiver(g11, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != g11.f47140b ? 4 : 2);
                                } else {
                                    context.registerReceiver(g11, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                                }
                                g11.f47139a = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(zzie zzieVar, int i10, a aVar, String str) {
        try {
            int i11 = C.f47135a;
            i(C.b(zzieVar, i10, aVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
    }

    public final void B(zzie zzieVar, a aVar, long j, boolean z10) {
        try {
            int i10 = C.f47135a;
            try {
                this.f47169h.d(C.b(zzieVar, 2, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f47172l, j, z10);
            } catch (Throwable unused) {
                C2018x.i("BillingClient");
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
    }

    public final void C(zzie zzieVar, a aVar, String str, long j, boolean z10) {
        try {
            int i10 = C.f47135a;
            try {
                this.f47169h.d(C.b(zzieVar, 2, aVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f47172l, j, z10);
            } catch (Throwable unused) {
                C2018x.i("BillingClient");
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
    }

    public final void D(final a aVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f47166e.post(new Runnable() { // from class: t3.j
            @Override // java.lang.Runnable
            public final void run() {
                C2789b c2789b = this.f47220b;
                a aVar2 = aVar;
                if (c2789b.f47167f.f47143b != null) {
                    c2789b.f47167f.f47143b.a(aVar2, null);
                } else {
                    int i10 = C2018x.f26297a;
                    Log.isLoggable("BillingClient", 5);
                }
            }
        });
    }

    public void a(final C0710c c0710c, final C2792e c2792e) {
        if (g(new Callable() { // from class: t3.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC1956c interfaceC1956c;
                int i10;
                String strF;
                C2789b c2789b = this.f47222b;
                C0710c c0710c2 = c0710c;
                C2792e c2792e2 = c2792e;
                if (!c2789b.o()) {
                    zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                    a aVar = b.f23565h;
                    c2789b.y(4, aVar, zzieVar);
                    c0710c2.b(aVar, c2792e2.f47195a);
                    return null;
                }
                String str = c2792e2.f47195a;
                try {
                    C2018x.h("BillingClient", "Consuming purchase with token: " + str);
                    synchronized (c2789b.f47162a) {
                        interfaceC1956c = c2789b.f47170i;
                    }
                    if (interfaceC1956c == null) {
                        c2789b.h(c0710c2, str, b.f23565h, zzie.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    if (c2789b.f47174n) {
                        String packageName = c2789b.f47168g.getPackageName();
                        boolean z10 = c2789b.f47174n;
                        String str2 = c2789b.f47164c;
                        String str3 = c2789b.f47165d;
                        long jLongValue = c2789b.f47160B.longValue();
                        Bundle bundle = new Bundle();
                        if (z10) {
                            C2018x.b(jLongValue, bundle, str2, str3);
                        }
                        Bundle bundleV = interfaceC1956c.v(bundle, packageName, str);
                        i10 = bundleV.getInt("RESPONSE_CODE");
                        strF = C2018x.f(bundleV, "BillingClient");
                    } else {
                        i10 = interfaceC1956c.i(c2789b.f47168g.getPackageName(), str);
                        strF = "";
                    }
                    a aVarA = b.a(i10, strF);
                    if (i10 != 0) {
                        c2789b.h(c0710c2, str, aVarA, zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, null);
                        return null;
                    }
                    C2018x.h("BillingClient", "Successfully consumed purchase.");
                    c0710c2.b(aVarA, str);
                    return null;
                } catch (DeadObjectException e10) {
                    c2789b.h(c0710c2, str, b.f23565h, zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    c2789b.h(c0710c2, str, b.f23563f, zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: t3.m
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                a aVar = b.f23566i;
                this.f47228b.y(4, aVar, zzieVar);
                c0710c.b(aVar, c2792e.f47195a);
            }
        }, r(), f()) == null) {
            a aVarU = u();
            y(4, aVarU, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            c0710c.b(aVarU, c2792e.f47195a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #4 {, blocks: (B:17:0x0041, B:19:0x0045), top: B:44:0x0041, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void b() {
        ExecutorService executorService;
        try {
            int i10 = C.f47135a;
            j(C.c(12, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
        synchronized (this.f47162a) {
            try {
                if (this.f47167f != null) {
                    H h8 = this.f47167f;
                    G g10 = h8.f47145d;
                    Context context = h8.f47142a;
                    g10.b(context);
                    h8.f47146e.b(context);
                    try {
                        C2018x.h("BillingClient", "Unbinding from service.");
                        n();
                    } catch (Throwable unused2) {
                        C2018x.i("BillingClient");
                    }
                    try {
                        try {
                            synchronized (this) {
                                executorService = this.f47159A;
                                if (executorService != null) {
                                    executorService.shutdownNow();
                                    this.f47159A = null;
                                }
                            }
                        } catch (Throwable unused3) {
                            C2018x.i("BillingClient");
                        }
                        l(3);
                    } catch (Throwable th) {
                        l(3);
                        throw th;
                    }
                } else {
                    C2018x.h("BillingClient", "Unbinding from service.");
                    n();
                    synchronized (this) {
                        executorService = this.f47159A;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f47159A = null;
                        }
                        l(3);
                    }
                }
            } catch (Throwable unused4) {
                C2018x.i("BillingClient");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02e7 A[EDGE_INSN: B:130:0x02e7->B:78:0x014d BREAK  A[LOOP:5: B:90:0x01cb->B:109:0x0275]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:137:0x0301  */
    /* JADX WARN: Code duplicated, block: B:139:0x0339  */
    /* JADX WARN: Code duplicated, block: B:142:0x0344  */
    /* JADX WARN: Code duplicated, block: B:145:0x034f  */
    /* JADX WARN: Code duplicated, block: B:148:0x036c  */
    /* JADX WARN: Code duplicated, block: B:151:0x037c  */
    /* JADX WARN: Code duplicated, block: B:154:0x038c  */
    /* JADX WARN: Code duplicated, block: B:157:0x039c  */
    /* JADX WARN: Code duplicated, block: B:159:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c3 A[LOOP:1: B:164:0x03bd->B:166:0x03c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:174:0x0416  */
    /* JADX WARN: Code duplicated, block: B:176:0x041c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0428  */
    /* JADX WARN: Code duplicated, block: B:181:0x0444  */
    /* JADX WARN: Code duplicated, block: B:183:0x0451  */
    /* JADX WARN: Code duplicated, block: B:185:0x045c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0467  */
    /* JADX WARN: Code duplicated, block: B:190:0x0498  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:204:0x04e0 A[EDGE_INSN: B:204:0x04e0->B:205:0x04e4 BREAK  A[LOOP:3: B:198:0x04c4->B:203:0x04dd], PHI: r6
      0x04e0: PHI (r6v9 java.lang.String) = (r6v8 java.lang.String), (r6v8 java.lang.String), (r6v22 java.lang.String) binds: [B:194:0x04b6, B:196:0x04bc, B:335:0x04e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:213:0x051a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0525  */
    /* JADX WARN: Code duplicated, block: B:219:0x0530  */
    /* JADX WARN: Code duplicated, block: B:222:0x053b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0564  */
    /* JADX WARN: Code duplicated, block: B:233:0x0572  */
    /* JADX WARN: Code duplicated, block: B:234:0x0580  */
    /* JADX WARN: Code duplicated, block: B:237:0x0588  */
    /* JADX WARN: Code duplicated, block: B:240:0x0593  */
    /* JADX WARN: Code duplicated, block: B:241:0x059a  */
    /* JADX WARN: Code duplicated, block: B:243:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:253:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:255:0x05dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:262:0x060b  */
    /* JADX WARN: Code duplicated, block: B:264:0x060d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0625 A[Catch: Exception -> 0x0635, CancellationException -> 0x0638, TimeoutException -> 0x063b, TRY_ENTER, TryCatch #7 {CancellationException -> 0x0638, TimeoutException -> 0x063b, Exception -> 0x0635, blocks: (B:266:0x0625, B:274:0x063e, B:276:0x0657, B:290:0x069e, B:292:0x06a2, B:300:0x06c6, B:299:0x06b4, B:289:0x068b, B:302:0x06d2), top: B:329:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x063e A[Catch: Exception -> 0x0635, CancellationException -> 0x0638, TimeoutException -> 0x063b, TryCatch #7 {CancellationException -> 0x0638, TimeoutException -> 0x063b, Exception -> 0x0635, blocks: (B:266:0x0625, B:274:0x063e, B:276:0x0657, B:290:0x069e, B:292:0x06a2, B:300:0x06c6, B:299:0x06b4, B:289:0x068b, B:302:0x06d2), top: B:329:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x0657 A[Catch: Exception -> 0x0635, CancellationException -> 0x0638, TimeoutException -> 0x063b, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0638, TimeoutException -> 0x063b, Exception -> 0x0635, blocks: (B:266:0x0625, B:274:0x063e, B:276:0x0657, B:290:0x069e, B:292:0x06a2, B:300:0x06c6, B:299:0x06b4, B:289:0x068b, B:302:0x06d2), top: B:329:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0679 A[Catch: all -> 0x0668, TryCatch #2 {all -> 0x0668, blocks: (B:278:0x0665, B:281:0x066a, B:283:0x0672, B:284:0x0675, B:286:0x0679, B:287:0x0684), top: B:322:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x0684 A[Catch: all -> 0x0668, TRY_LEAVE, TryCatch #2 {all -> 0x0668, blocks: (B:278:0x0665, B:281:0x066a, B:283:0x0672, B:284:0x0675, B:286:0x0679, B:287:0x0684), top: B:322:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x06a2 A[Catch: Exception -> 0x0635, CancellationException -> 0x0638, TimeoutException -> 0x063b, TryCatch #7 {CancellationException -> 0x0638, TimeoutException -> 0x063b, Exception -> 0x0635, blocks: (B:266:0x0625, B:274:0x063e, B:276:0x0657, B:290:0x069e, B:292:0x06a2, B:300:0x06c6, B:299:0x06b4, B:289:0x068b, B:302:0x06d2), top: B:329:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d2 A[Catch: Exception -> 0x0635, CancellationException -> 0x0638, TimeoutException -> 0x063b, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0638, TimeoutException -> 0x063b, Exception -> 0x0635, blocks: (B:266:0x0625, B:274:0x063e, B:276:0x0657, B:290:0x069e, B:292:0x06a2, B:300:0x06c6, B:299:0x06b4, B:289:0x068b, B:302:0x06d2), top: B:329:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:317:0x06ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0509 A[SYNTHETIC] */
    public a c(Activity activity, final C2791d c2791d) {
        boolean z10;
        String str;
        String str2;
        SkuDetails skuDetails;
        C2791d.a aVar;
        a aVarA;
        C2793f.a aVar2;
        a aVarA2;
        Future futureG;
        Bundle bundle;
        int iA;
        String strF;
        zzie zzieVarB;
        String string;
        Object obj;
        boolean z11;
        boolean z12;
        final Bundle bundle2;
        boolean z13;
        ArrayList arrayList;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<Integer> arrayList7;
        int i10;
        boolean z14;
        C2793f c2793f;
        String str3;
        ArrayList arrayList8;
        String str4;
        C2791d.a aVar3;
        String str5;
        boolean z15;
        Intent intent;
        int i11;
        ArrayList<String> arrayList9;
        Iterator it;
        ArrayList<String> arrayList10;
        ArrayList<String> arrayList11;
        long jNextLong = new Random().nextLong();
        if (this.f47167f == null || this.f47167f.f47143b == null) {
            zzie zzieVar = zzie.MISSING_LISTENER;
            a aVar4 = b.f23571o;
            z(zzieVar, aVar4, jNextLong);
            return aVar4;
        }
        try {
            C2018x.h("BillingClient", "Already connected or not opted into auto reconnection.");
            a aVar5 = b.f23564g;
            TimeUnit.MILLISECONDS.getClass();
            int i12 = aVar5.f23552a;
            if (i12 == 0) {
                C2018x.h("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                Log.isLoggable("BillingClient", 5);
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            C2018x.i("BillingClient");
        }
        if (!p()) {
            zzie zzieVar2 = zzie.SERVICE_CONNECTION_NOT_READY;
            a aVar6 = b.f23565h;
            z(zzieVar2, aVar6, jNextLong);
            D(aVar6);
            return aVar6;
        }
        synchronized (this.f47162a) {
            try {
                z10 = this.j != null ? this.j.f47241e > 0 : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList12 = new ArrayList();
        arrayList12.addAll(c2791d.f47190d);
        zzbt zzbtVar = c2791d.f47189c;
        Iterator it2 = arrayList12.iterator();
        SkuDetails skuDetails2 = (SkuDetails) (it2.hasNext() ? it2.next() : null);
        Iterator<E> it3 = zzbtVar.iterator();
        C2791d.a aVar7 = (C2791d.a) (it3.hasNext() ? it3.next() : null);
        if (skuDetails2 != null) {
            throw null;
        }
        C2793f c2793f2 = aVar7.f47191a;
        String str6 = c2793f2.f47198c;
        String str7 = c2793f2.f47199d;
        if (str7.equals("subs") && !this.f47171k) {
            Log.isLoggable("BillingClient", 5);
            zzie zzieVar3 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            a aVar8 = b.j;
            B(zzieVar3, aVar8, jNextLong, z10);
            D(aVar8);
            return aVar8;
        }
        c2791d.f47188b.getClass();
        if (!c2791d.f47187a) {
            zzbt zzbtVar2 = c2791d.f47189c;
            if (zzbtVar2 != null) {
                int size = zzbtVar2.size();
                for (int i13 = 0; i13 < size; i13++) {
                }
            }
        } else if (!this.f47173m) {
            Log.isLoggable("BillingClient", 5);
            zzie zzieVar4 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
            a aVar9 = b.f23562e;
            B(zzieVar4, aVar9, jNextLong, z10);
            D(aVar9);
            return aVar9;
        }
        if (arrayList12.size() > 1 && !this.f47177q) {
            Log.isLoggable("BillingClient", 5);
            zzie zzieVar5 = zzie.MULTI_ITEM_NOT_SUPPORTED;
            a aVar10 = b.f23567k;
            B(zzieVar5, aVar10, jNextLong, z10);
            D(aVar10);
            return aVar10;
        }
        if (!zzbtVar.isEmpty() && !this.f47178r) {
            Log.isLoggable("BillingClient", 5);
            zzie zzieVar6 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            a aVar11 = b.f23569m;
            B(zzieVar6, aVar11, jNextLong, z10);
            D(aVar11);
            return aVar11;
        }
        if (!c2791d.f47189c.isEmpty()) {
            C2791d.a aVar12 = (C2791d.a) c2791d.f47189c.get(0);
            int i14 = 1;
            while (true) {
                if (i14 >= c2791d.f47189c.size()) {
                    str = str7;
                    String strD = aVar12.a().d();
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    zzbt zzbtVar3 = c2791d.f47189c;
                    str2 = str6;
                    int size2 = zzbtVar3.size();
                    skuDetails = skuDetails2;
                    aVar = aVar7;
                    int i15 = 0;
                    while (true) {
                        if (i15 < size2) {
                            zzbt zzbtVar4 = zzbtVar3;
                            C2791d.a aVar13 = (C2791d.a) zzbtVar3.get(i15);
                            int i16 = size2;
                            if (aVar13.a().f47204i != null && aVar13.b() == null) {
                                aVarA = b.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + aVar13.a().b());
                                break;
                            }
                            if (map.containsKey(aVar13.a().b())) {
                                aVarA = b.a(5, "ProductId can not be duplicated. Invalid product id: " + aVar13.a().b() + ".");
                                break;
                            }
                            map.put(aVar13.a().b(), aVar13);
                            if (!aVar12.a().c().equals("play_pass_subs") && !aVar13.a().c().equals("play_pass_subs") && !strD.equals(aVar13.a().d())) {
                                aVarA = b.a(5, "All products must have the same package name.");
                                break;
                            }
                            i15++;
                            size2 = i16;
                            zzbtVar3 = zzbtVar4;
                        } else {
                            Iterator it4 = hashSet.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    ArrayList arrayList13 = aVar12.a().j;
                                    String strB = aVar12.b();
                                    if (strB != null && arrayList13 != null) {
                                        Iterator it5 = arrayList13.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                aVar2 = null;
                                                break;
                                            }
                                            aVar2 = (C2793f.a) it5.next();
                                        } while (!strB.equals(aVar2.f47206b));
                                        if (aVar2 != null && aVar2.f47209e != null) {
                                            aVarA = b.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        aVarA = b.f23564g;
                                        break;
                                    }
                                    aVarA = b.f23564g;
                                    break;
                                }
                                String str8 = (String) it4.next();
                                if (map.containsKey(str8)) {
                                    aVarA = b.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str8 + ".");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    C2791d.a aVar14 = (C2791d.a) c2791d.f47189c.get(i14);
                    str = str7;
                    if (!aVar14.a().c().equals(aVar12.a().c()) && !aVar14.a().c().equals("play_pass_subs")) {
                        aVarA2 = b.a(5, "All products should have same ProductType.");
                        skuDetails = skuDetails2;
                        aVar = aVar7;
                        str2 = str6;
                        break;
                    }
                    i14++;
                    str7 = str;
                }
            }
            if (aVarA2 != b.f23564g) {
                B(zzie.INVALID_BILLING_FLOW_PARAMS, aVarA2, jNextLong, z10);
                D(aVarA2);
                return aVarA2;
            }
            if (this.f47173m) {
                z11 = this.f47174n;
                this.f47184x.getClass();
                this.f47184x.getClass();
                z12 = this.f47185y;
                String str9 = this.f47164c;
                String str10 = this.f47165d;
                long jLongValue = this.f47160B.longValue();
                this.f47168g.getPackageName();
                int i17 = C2018x.f26297a;
                bundle2 = new Bundle();
                C2018x.b(jLongValue, bundle2, str9, str10);
                bundle2.putLong("billingClientTransactionId", jNextLong);
                c2791d.f47188b.getClass();
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("accountId", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("obfuscatedProfileId", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                }
                c2791d.f47188b.getClass();
                if (!TextUtils.isEmpty(null)) {
                    c2791d.f47188b.getClass();
                    bundle2.putString("oldSkuPurchaseToken", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("oldSkuPurchaseId", null);
                }
                c2791d.f47188b.getClass();
                if (!TextUtils.isEmpty(null)) {
                    c2791d.f47188b.getClass();
                    bundle2.putString("originalExternalTransactionId", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("paymentsPurchaseParams", null);
                }
                if (z11) {
                    z13 = true;
                    bundle2.putBoolean("enablePendingPurchases", true);
                } else {
                    z13 = true;
                }
                if (z12) {
                    bundle2.putBoolean("enableAlternativeBilling", z13);
                }
                arrayList = new ArrayList();
                for (C2791d.a aVar15 : c2791d.f47189c) {
                }
                if (!arrayList.isEmpty()) {
                    C1954b0 c1954b0Q = C1957c0.q();
                    c1954b0Q.f();
                    C1957c0.r((C1957c0) c1954b0Q.f26124c, arrayList);
                    bundle2.putByteArray("subscriptionProductReplacementParamsList", ((C1957c0) c1954b0Q.c()).c());
                }
                if (arrayList12.isEmpty()) {
                    arrayList2 = new ArrayList<>(zzbtVar.size() - 1);
                    arrayList3 = new ArrayList<>(zzbtVar.size() - 1);
                    arrayList4 = new ArrayList<>();
                    arrayList5 = new ArrayList<>();
                    arrayList6 = new ArrayList<>();
                    arrayList7 = new ArrayList<>();
                    for (i10 = 0; i10 < zzbtVar.size(); i10++) {
                        C2791d.a aVar16 = (C2791d.a) zzbtVar.get(i10);
                        c2793f = aVar16.f47191a;
                        if (!c2793f.f47202g.isEmpty()) {
                            arrayList4.add(c2793f.f47202g);
                        }
                        arrayList5.add(aVar16.f47192b);
                        str3 = c2793f.f47203h;
                        arrayList8 = c2793f.j;
                        if (arrayList8 == null || arrayList8.isEmpty()) {
                            str4 = str3;
                            break;
                        }
                        Iterator it6 = c2793f.j.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                str4 = str3;
                                break;
                            }
                            C2793f.a aVar17 = (C2793f.a) it6.next();
                            String str11 = str3;
                            if (!TextUtils.isEmpty(aVar17.f47208d)) {
                                str4 = aVar17.f47208d;
                                break;
                            }
                            str3 = str11;
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            arrayList6.add(str4);
                        }
                        if (i10 > 0) {
                            arrayList2.add(((C2791d.a) zzbtVar.get(i10)).f47191a.f47198c);
                            arrayList3.add(((C2791d.a) zzbtVar.get(i10)).f47191a.f47199d);
                        }
                    }
                    z14 = true;
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                    if (!arrayList7.isEmpty()) {
                        bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                    }
                    if (!arrayList4.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                    }
                    if (!arrayList6.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle2.putStringArrayList("additionalSkus", arrayList2);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                    }
                } else {
                    arrayList9 = new ArrayList<>();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    it = arrayList12.iterator();
                    if (!it.hasNext()) {
                        ((SkuDetails) it.next()).getClass();
                        throw null;
                    }
                    if (!arrayList9.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                    }
                    if (arrayList12.size() > 1) {
                        arrayList10 = new ArrayList<>(arrayList12.size() - 1);
                        arrayList11 = new ArrayList<>(arrayList12.size() - 1);
                        if (1 >= arrayList12.size()) {
                            ((SkuDetails) arrayList12.get(1)).getClass();
                            throw null;
                        }
                        bundle2.putStringArrayList("additionalSkus", arrayList10);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList11);
                    }
                    z14 = true;
                }
                if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f47175o) {
                    zzie zzieVar7 = zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                    a aVar18 = b.f23568l;
                    B(zzieVar7, aVar18, jNextLong, z10);
                    D(aVar18);
                    return aVar18;
                }
                if (skuDetails == null) {
                    throw null;
                }
                aVar3 = aVar;
                if (TextUtils.isEmpty(aVar3.f47191a.d())) {
                    str5 = null;
                    z15 = false;
                } else {
                    bundle2.putString("skuPackageName", aVar3.f47191a.d());
                    z15 = z14;
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle2.putString("accountName", str5);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    Log.isLoggable("BillingClient", 5);
                } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle2.putString("proxyPackage", stringExtra);
                    try {
                        bundle2.putString("proxyPackageVersion", this.f47168g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        bundle2.putString("proxyPackageVersion", "package not found");
                    }
                }
                if (!this.f47178r && !zzbtVar.isEmpty()) {
                    i11 = 17;
                } else if (!this.f47176p && z15) {
                    i11 = 15;
                } else if (this.f47174n) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                final int i18 = i11;
                final String str12 = str2;
                final String str13 = str;
                futureG = g(new Callable(i18, str12, str13, c2791d, bundle2) { // from class: t3.I

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f47149c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f47150d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ String f47151e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ Bundle f47152f;

                    {
                        this.f47152f = bundle2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleC;
                        InterfaceC1956c interfaceC1956c;
                        C2789b c2789b = this.f47148b;
                        int i19 = this.f47149c;
                        String str14 = this.f47150d;
                        String str15 = this.f47151e;
                        Bundle bundle3 = this.f47152f;
                        c2789b.getClass();
                        try {
                            synchronized (c2789b.f47162a) {
                                interfaceC1956c = c2789b.f47170i;
                            }
                            return interfaceC1956c == null ? C2018x.c(b.f23565h, zzie.SERVICE_RESET_TO_NULL) : interfaceC1956c.j(i19, c2789b.f47168g.getPackageName(), str14, str15, bundle3);
                        } catch (DeadObjectException e11) {
                            a aVar19 = b.f23565h;
                            String strA = C.a(e11);
                            bundleC = C2018x.c(aVar19, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strA != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                            }
                            return bundleC;
                        } catch (Exception e12) {
                            a aVar20 = b.f23563f;
                            String strA2 = C.a(e12);
                            bundleC = C2018x.c(aVar20, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strA2 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                            }
                            return bundleC;
                        }
                    }
                }, 5000L, null, this.f47166e, f());
            } else {
                final String str14 = str2;
                final String str15 = str;
                futureG = g(new Callable() { // from class: t3.J
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleC;
                        InterfaceC1956c interfaceC1956c;
                        C2789b c2789b = this.f47153b;
                        String str16 = str14;
                        String str17 = str15;
                        c2789b.getClass();
                        try {
                            synchronized (c2789b.f47162a) {
                                interfaceC1956c = c2789b.f47170i;
                            }
                            return interfaceC1956c == null ? C2018x.c(b.f23565h, zzie.SERVICE_RESET_TO_NULL) : interfaceC1956c.S(c2789b.f47168g.getPackageName(), str16, str17);
                        } catch (DeadObjectException e11) {
                            a aVar19 = b.f23565h;
                            String strA = C.a(e11);
                            bundleC = C2018x.c(aVar19, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strA != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                            }
                            return bundleC;
                        } catch (Exception e12) {
                            a aVar20 = b.f23563f;
                            String strA2 = C.a(e12);
                            bundleC = C2018x.c(aVar20, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                            if (strA2 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                            }
                            return bundleC;
                        }
                    }
                }, 5000L, null, this.f47166e, f());
            }
            try {
                if (futureG == null) {
                    zzie zzieVar8 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    a aVar19 = b.f23559b;
                    B(zzieVar8, aVar19, jNextLong, z10);
                    D(aVar19);
                    return aVar19;
                }
                bundle = (Bundle) futureG.get(5000L, TimeUnit.MILLISECONDS);
                iA = C2018x.a(bundle, "BillingClient");
                strF = C2018x.f(bundle, "BillingClient");
                if (iA != 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", jNextLong);
                    intent2.putExtra("wasServiceAutoReconnected", z10);
                    activity.startActivity(intent2);
                    return b.f23564g;
                }
                Log.isLoggable("BillingClient", 5);
                a aVarA3 = b.a(iA, strF);
                try {
                    if (bundle != null || (obj = bundle.get("LOG_REASON")) == null) {
                        zzieVarB = zzie.REASON_UNSPECIFIED;
                    } else if (obj instanceof Integer) {
                        zzieVarB = zzie.b(((Integer) obj).intValue());
                    } else {
                        Log.isLoggable("BillingClient", 5);
                        zzieVarB = zzie.REASON_UNSPECIFIED;
                    }
                } catch (Throwable th2) {
                    "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage()));
                    Log.isLoggable("BillingClient", 5);
                    zzieVarB = zzie.REASON_UNSPECIFIED;
                }
                if (zzieVarB == zzie.REASON_UNSPECIFIED) {
                    zzieVarB = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                zzie zzieVar9 = zzieVarB;
                if (bundle == null) {
                    string = null;
                } else {
                    try {
                        string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th3) {
                        "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage()));
                        Log.isLoggable("BillingClient", 5);
                        string = null;
                    }
                }
                C(zzieVar9, aVarA3, string, jNextLong, z10);
                D(aVarA3);
                return aVarA3;
            } catch (CancellationException e11) {
                e = e11;
                C2018x.i("BillingClient");
                zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                a aVar20 = b.f23566i;
                C(zzieVar10, aVar20, C.a(e), jNextLong, z10);
                D(aVar20);
                return aVar20;
            } catch (TimeoutException e12) {
                e = e12;
                C2018x.i("BillingClient");
                zzie zzieVar11 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                a aVar21 = b.f23566i;
                C(zzieVar11, aVar21, C.a(e), jNextLong, z10);
                D(aVar21);
                return aVar21;
            } catch (Exception e13) {
                C2018x.i("BillingClient");
                zzie zzieVar12 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                a aVar22 = b.f23565h;
                C(zzieVar12, aVar22, C.a(e13), jNextLong, z10);
                D(aVar22);
                return aVar22;
            }
        }
        aVarA = b.f23564g;
        skuDetails = skuDetails2;
        aVar = aVar7;
        str = str7;
        str2 = str6;
        aVarA2 = aVarA;
        if (aVarA2 != b.f23564g) {
            B(zzie.INVALID_BILLING_FLOW_PARAMS, aVarA2, jNextLong, z10);
            D(aVarA2);
            return aVarA2;
        }
        if (this.f47173m) {
            z11 = this.f47174n;
            this.f47184x.getClass();
            this.f47184x.getClass();
            z12 = this.f47185y;
            String str16 = this.f47164c;
            String str17 = this.f47165d;
            long jLongValue2 = this.f47160B.longValue();
            this.f47168g.getPackageName();
            int i19 = C2018x.f26297a;
            bundle2 = new Bundle();
            C2018x.b(jLongValue2, bundle2, str16, str17);
            bundle2.putLong("billingClientTransactionId", jNextLong);
            c2791d.f47188b.getClass();
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("obfuscatedProfileId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            c2791d.f47188b.getClass();
            if (!TextUtils.isEmpty(null)) {
                c2791d.f47188b.getClass();
                bundle2.putString("oldSkuPurchaseToken", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            c2791d.f47188b.getClass();
            if (!TextUtils.isEmpty(null)) {
                c2791d.f47188b.getClass();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z11) {
                z13 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z13 = true;
            }
            if (z12) {
                bundle2.putBoolean("enableAlternativeBilling", z13);
            }
            arrayList = new ArrayList();
            while (r2.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
                C1954b0 c1954b0Q2 = C1957c0.q();
                c1954b0Q2.f();
                C1957c0.r((C1957c0) c1954b0Q2.f26124c, arrayList);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((C1957c0) c1954b0Q2.c()).c());
            }
            if (arrayList12.isEmpty()) {
                arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                it = arrayList12.iterator();
                if (!it.hasNext()) {
                    ((SkuDetails) it.next()).getClass();
                    throw null;
                }
                if (!arrayList9.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList12.size() > 1) {
                    arrayList10 = new ArrayList<>(arrayList12.size() - 1);
                    arrayList11 = new ArrayList<>(arrayList12.size() - 1);
                    if (1 >= arrayList12.size()) {
                        ((SkuDetails) arrayList12.get(1)).getClass();
                        throw null;
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList10);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                z14 = true;
            } else {
                arrayList2 = new ArrayList<>(zzbtVar.size() - 1);
                arrayList3 = new ArrayList<>(zzbtVar.size() - 1);
                arrayList4 = new ArrayList<>();
                arrayList5 = new ArrayList<>();
                arrayList6 = new ArrayList<>();
                arrayList7 = new ArrayList<>();
                while (i10 < zzbtVar.size()) {
                    C2791d.a aVar110 = (C2791d.a) zzbtVar.get(i10);
                    c2793f = aVar110.f47191a;
                    if (!c2793f.f47202g.isEmpty()) {
                        arrayList4.add(c2793f.f47202g);
                    }
                    arrayList5.add(aVar110.f47192b);
                    str3 = c2793f.f47203h;
                    arrayList8 = c2793f.j;
                    if (arrayList8 == null) {
                        str4 = str3;
                        break;
                    }
                    str4 = str3;
                    break;
                    if (!TextUtils.isEmpty(str4)) {
                        arrayList6.add(str4);
                    }
                    if (i10 > 0) {
                        arrayList2.add(((C2791d.a) zzbtVar.get(i10)).f47191a.f47198c);
                        arrayList3.add(((C2791d.a) zzbtVar.get(i10)).f47191a.f47199d);
                    }
                }
                z14 = true;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList2);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            }
            if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST")) {
            }
            if (skuDetails == null) {
                throw null;
            }
            aVar3 = aVar;
            if (TextUtils.isEmpty(aVar3.f47191a.d())) {
                bundle2.putString("skuPackageName", aVar3.f47191a.d());
                z15 = z14;
                str5 = null;
            } else {
                str5 = null;
                z15 = false;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle2.putString("accountName", str5);
            }
            intent = activity.getIntent();
            if (intent == null) {
                Log.isLoggable("BillingClient", 5);
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra2);
                bundle2.putString("proxyPackageVersion", this.f47168g.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
            }
            if (!this.f47178r) {
                if (!this.f47176p) {
                    if (this.f47174n) {
                        i11 = 9;
                    } else {
                        i11 = 6;
                    }
                } else if (this.f47174n) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
            } else if (!this.f47176p) {
                if (this.f47174n) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
            } else if (this.f47174n) {
                i11 = 9;
            } else {
                i11 = 6;
            }
            final int i110 = i11;
            final String str18 = str2;
            final String str19 = str;
            futureG = g(new Callable(i110, str18, str19, c2791d, bundle2) { // from class: t3.I

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f47149c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f47150d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f47151e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Bundle f47152f;

                {
                    this.f47152f = bundle2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    InterfaceC1956c interfaceC1956c;
                    C2789b c2789b = this.f47148b;
                    int i111 = this.f47149c;
                    String str110 = this.f47150d;
                    String str111 = this.f47151e;
                    Bundle bundle3 = this.f47152f;
                    c2789b.getClass();
                    try {
                        synchronized (c2789b.f47162a) {
                            interfaceC1956c = c2789b.f47170i;
                        }
                        return interfaceC1956c == null ? C2018x.c(b.f23565h, zzie.SERVICE_RESET_TO_NULL) : interfaceC1956c.j(i111, c2789b.f47168g.getPackageName(), str110, str111, bundle3);
                    } catch (DeadObjectException e14) {
                        a aVar111 = b.f23565h;
                        String strA = C.a(e14);
                        bundleC = C2018x.c(aVar111, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e15) {
                        a aVar23 = b.f23563f;
                        String strA2 = C.a(e15);
                        bundleC = C2018x.c(aVar23, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f47166e, f());
        } else {
            final String str110 = str2;
            final String str111 = str;
            futureG = g(new Callable() { // from class: t3.J
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    InterfaceC1956c interfaceC1956c;
                    C2789b c2789b = this.f47153b;
                    String str112 = str110;
                    String str113 = str111;
                    c2789b.getClass();
                    try {
                        synchronized (c2789b.f47162a) {
                            interfaceC1956c = c2789b.f47170i;
                        }
                        return interfaceC1956c == null ? C2018x.c(b.f23565h, zzie.SERVICE_RESET_TO_NULL) : interfaceC1956c.S(c2789b.f47168g.getPackageName(), str112, str113);
                    } catch (DeadObjectException e14) {
                        a aVar111 = b.f23565h;
                        String strA = C.a(e14);
                        bundleC = C2018x.c(aVar111, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e15) {
                        a aVar23 = b.f23563f;
                        String strA2 = C.a(e15);
                        bundleC = C2018x.c(aVar23, zzie.LAUNCH_BILLING_FLOW_EXCEPTION);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f47166e, f());
        }
        if (futureG == null) {
            zzie zzieVar13 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
            a aVar111 = b.f23559b;
            B(zzieVar13, aVar111, jNextLong, z10);
            D(aVar111);
            return aVar111;
        }
        bundle = (Bundle) futureG.get(5000L, TimeUnit.MILLISECONDS);
        iA = C2018x.a(bundle, "BillingClient");
        strF = C2018x.f(bundle, "BillingClient");
        if (iA != 0) {
            Intent intent3 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent3.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
            intent3.putExtra("billingClientTransactionId", jNextLong);
            intent3.putExtra("wasServiceAutoReconnected", z10);
            activity.startActivity(intent3);
            return b.f23564g;
        }
        Log.isLoggable("BillingClient", 5);
        a aVarA4 = b.a(iA, strF);
        if (bundle != null) {
            zzieVarB = zzie.REASON_UNSPECIFIED;
        } else if (obj instanceof Integer) {
            zzieVarB = zzie.b(((Integer) obj).intValue());
        } else {
            Log.isLoggable("BillingClient", 5);
            zzieVarB = zzie.REASON_UNSPECIFIED;
        }
        if (zzieVarB == zzie.REASON_UNSPECIFIED) {
            zzieVarB = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
        }
        zzie zzieVar14 = zzieVarB;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("ADDITIONAL_LOG_DETAILS");
        }
        C(zzieVar14, aVarA4, string, jNextLong, z10);
        D(aVarA4);
        return aVarA4;
    }

    public void d(final C2795h c2795h, final v vVar) {
        if (g(new Callable() { // from class: t3.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                s sVar;
                InterfaceC1956c interfaceC1956c;
                int i10 = 0;
                int i11 = 1;
                C2789b c2789b = this.f47225b;
                v vVar2 = vVar;
                C2795h c2795h2 = c2795h;
                Exception exc = null;
                if (!c2789b.o()) {
                    zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                    a billingResult = b.f23565h;
                    c2789b.y(7, billingResult, zzieVar);
                    zzbt zzbtVarG = zzbt.G();
                    zzbt.G();
                    i.e(billingResult, "billingResult");
                    i.d(zzbtVarG, "getProductDetailsList(...)");
                    vVar2.f30291a.resumeWith(new u.a(billingResult, zzbtVarG));
                } else {
                    if (c2789b.f47178r) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        String str = ((C2795h.b) c2795h2.f47210a.get(0)).f47213b;
                        zzbt zzbtVar = c2795h2.f47210a;
                        int size = zzbtVar.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 20;
                            ArrayList<C2795h.b> arrayList3 = new ArrayList(zzbtVar.subList(i12, i13 > size ? size : i13));
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            int size2 = arrayList3.size();
                            for (int i14 = i10; i14 < size2; i14 += i11) {
                                arrayList4.add(((C2795h.b) arrayList3.get(i14)).f47212a);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                            String str2 = c2789b.f47164c;
                            bundle.putString("playBillingLibraryVersion", str2);
                            try {
                                synchronized (c2789b.f47162a) {
                                    interfaceC1956c = c2789b.f47170i;
                                }
                                if (interfaceC1956c == null) {
                                    sVar = c2789b.s(b.f23565h, zzie.SERVICE_RESET_TO_NULL, exc);
                                } else {
                                    if (c2789b.f47179s) {
                                        c2789b.f47184x.getClass();
                                    }
                                    c2789b.v();
                                    c2789b.v();
                                    c2789b.v();
                                    c2789b.v();
                                    int i15 = size;
                                    Bundle bundleT = interfaceC1956c.T(i11 != c2789b.f47180t ? 17 : 20, c2789b.f47168g.getPackageName(), str, bundle, C2018x.d(str2, c2789b.f47165d, arrayList3, new com.voltasit.obdeleven.domain.usecases.device.v(), c2789b.f47160B.longValue()));
                                    if (bundleT == null) {
                                        sVar = c2789b.s(b.f23570n, zzie.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, exc);
                                    } else if (bundleT.containsKey("DETAILS_LIST")) {
                                        ArrayList<String> stringArrayList = bundleT.getStringArrayList("DETAILS_LIST");
                                        if (stringArrayList == null) {
                                            sVar = c2789b.s(b.f23570n, zzie.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, exc);
                                        } else {
                                            ArrayList arrayList5 = new ArrayList();
                                            int size3 = stringArrayList.size();
                                            for (int i16 = 0; i16 < size3; i16++) {
                                                try {
                                                    C2793f c2793f = new C2793f(stringArrayList.get(i16));
                                                    C2018x.h("BillingClient", "Got product details: ".concat(c2793f.toString()));
                                                    arrayList5.add(c2793f);
                                                } catch (JSONException e10) {
                                                    sVar = c2789b.s(b.a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, e10);
                                                }
                                            }
                                            ArrayList<String> stringArrayList2 = bundleT.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                            new ArrayList();
                                            try {
                                                ArrayList arrayList6 = new ArrayList();
                                                if (stringArrayList2 == null) {
                                                    for (C2795h.b bVar : arrayList3) {
                                                        Iterator it = arrayList5.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                arrayList6.add(new C2796i(new JSONObject().put("productId", bVar.f47212a).put("type", bVar.f47213b).put("statusCode", 0).toString()));
                                                                break;
                                                            }
                                                            C2793f c2793f2 = (C2793f) it.next();
                                                            if (bVar.f47212a.equals(c2793f2.f47198c) && bVar.f47213b.equals(c2793f2.f47199d)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Iterator<String> it2 = stringArrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        C2796i c2796i = new C2796i(it2.next());
                                                        C2018x.h("BillingClient", "Got unfetchedProduct: ".concat(c2796i.toString()));
                                                        arrayList6.add(c2796i);
                                                    }
                                                }
                                                arrayList.addAll(arrayList5);
                                                arrayList2.addAll(arrayList6);
                                                i12 = i13;
                                                size = i15;
                                                i10 = 0;
                                                exc = null;
                                                i11 = 1;
                                            } catch (JSONException e11) {
                                                sVar = c2789b.s(b.a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, e11);
                                            }
                                        }
                                    } else {
                                        int iA = C2018x.a(bundleT, "BillingClient");
                                        String strF = C2018x.f(bundleT, "BillingClient");
                                        sVar = iA != 0 ? c2789b.s(b.a(iA, strF), zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, exc) : c2789b.s(b.a(6, strF), zzie.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, exc);
                                    }
                                }
                            } catch (DeadObjectException e12) {
                                sVar = c2789b.s(b.f23565h, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e12);
                            } catch (Exception e13) {
                                sVar = c2789b.s(b.f23563f, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e13);
                            }
                            vVar2.f30291a.resumeWith(new u.a(b.a(sVar.f47244b, sVar.f47245c), sVar.f47243a));
                            return null;
                        }
                        sVar = new s(0, "", arrayList, arrayList2);
                        vVar2.f30291a.resumeWith(new u.a(b.a(sVar.f47244b, sVar.f47245c), sVar.f47243a));
                        return null;
                    }
                    int i17 = C2018x.f26297a;
                    Log.isLoggable("BillingClient", 5);
                    zzie zzieVar2 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
                    a billingResult2 = b.f23569m;
                    c2789b.y(7, billingResult2, zzieVar2);
                    zzbt zzbtVarG2 = zzbt.G();
                    zzbt.G();
                    i.e(billingResult2, "billingResult");
                    i.d(zzbtVarG2, "getProductDetailsList(...)");
                    vVar2.f30291a.resumeWith(new u.a(billingResult2, zzbtVarG2));
                }
                return null;
            }
        }, 30000L, new RunnableC2527j1(this, vVar), r(), f()) == null) {
            a billingResult = u();
            y(7, billingResult, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            zzbt zzbtVarG = zzbt.G();
            zzbt.G();
            i.e(billingResult, "billingResult");
            i.d(zzbtVarG, "getProductDetailsList(...)");
            vVar.f30291a.resumeWith(new u.a(billingResult, zzbtVarG));
        }
    }

    public void e(InterfaceC2790c interfaceC2790c) {
        m(interfaceC2790c);
    }

    public final synchronized ExecutorService f() {
        try {
            if (this.f47159A == null) {
                this.f47159A = Executors.newFixedThreadPool(C2018x.f26297a, new o(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47159A;
    }

    public final void h(C0710c c0710c, String str, a aVar, zzie zzieVar, Exception exc) {
        C2018x.i("BillingClient");
        A(zzieVar, 4, aVar, C.a(exc));
        c0710c.b(aVar, str);
    }

    public final void i(H1 h8) {
        try {
            c cVar = this.f47169h;
            int i10 = this.f47172l;
            cVar.getClass();
            try {
                U1 u10 = (U1) ((V1) cVar.f5123b).i();
                u10.f();
                V1.s((V1) u10.f26124c, i10);
                cVar.f5123b = (V1) u10.c();
                cVar.a(h8);
            } catch (Throwable unused) {
                C2018x.i("BillingLogger");
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
    }

    public final void j(K1 k10) {
        try {
            c cVar = this.f47169h;
            int i10 = this.f47172l;
            cVar.getClass();
            try {
                U1 u10 = (U1) ((V1) cVar.f5123b).i();
                u10.f();
                V1.s((V1) u10.f26124c, i10);
                V1 v10 = (V1) u10.c();
                cVar.f5123b = v10;
                try {
                    cVar.g(k10, v10);
                } catch (Throwable unused) {
                    C2018x.i("BillingLogger");
                }
            } catch (Throwable unused2) {
                C2018x.i("BillingLogger");
            }
        } catch (Throwable unused3) {
            C2018x.i("BillingClient");
        }
    }

    public final void k(int i10, a aVar, zzie zzieVar) {
        try {
            int i11 = C.f47135a;
            G1 g10 = (G1) C.b(zzieVar, 6, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED).i();
            q2 q2VarU = r2.u();
            q2VarU.g(i10 > 0);
            q2VarU.h(i10);
            g10.h(q2VarU);
            i((H1) g10.c());
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
    }

    public final void l(int i10) {
        String str;
        String str2;
        synchronized (this.f47162a) {
            try {
                if (this.f47163b == 3) {
                    return;
                }
                int i11 = this.f47163b;
                if (i11 == 0) {
                    str = "DISCONNECTED";
                } else if (i11 != 1) {
                    str = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i10 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i10 != 1) {
                    str2 = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                C2018x.h("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f47163b = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(InterfaceC2790c interfaceC2790c) {
        zzie zzieVar;
        a aVarT;
        a aVar;
        synchronized (this.f47162a) {
            try {
                if (p()) {
                    aVarT = t(0);
                } else {
                    if (this.f47163b == 1) {
                        int i10 = C2018x.f26297a;
                        Log.isLoggable("BillingClient", 5);
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        aVar = b.f23560c;
                        k(0, aVar, zzieVar2);
                    } else if (this.f47163b == 3) {
                        int i11 = C2018x.f26297a;
                        Log.isLoggable("BillingClient", 5);
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        aVar = b.f23565h;
                        k(0, aVar, zzieVar3);
                    } else {
                        l(1);
                        this.f47186z = interfaceC2790c;
                        n();
                        C2018x.h("BillingClient", "Starting in-app billing setup.");
                        this.j = new r(this, interfaceC2790c, 0);
                        C1995p c1995p = this.j.f47239c;
                        c1995p.f26237c = 0L;
                        c1995p.f26236b = false;
                        c1995p.a();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f47168g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f47164c);
                                    synchronized (this.f47162a) {
                                        try {
                                            if (this.f47163b == 2) {
                                                aVarT = t(0);
                                            } else if (this.f47163b != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                aVar = b.f23565h;
                                                k(0, aVar, zzieVar4);
                                            } else {
                                                r rVar = this.j;
                                                if (this.f47168g.bindService(intent2, rVar, 1)) {
                                                    C2018x.h("BillingClient", "Service was bonded successfully.");
                                                    aVarT = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                    Log.isLoggable("BillingClient", 5);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        l(0);
                        C2018x.h("BillingClient", "Billing service unavailable on device.");
                        a aVar2 = b.f23558a;
                        k(0, aVar2, zzieVar);
                        aVarT = aVar2;
                    }
                    aVarT = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVarT != null) {
            interfaceC2790c.a(aVarT);
        }
    }

    public final void n() {
        synchronized (this.f47162a) {
            if (this.j != null) {
                try {
                    try {
                        this.f47168g.unbindService(this.j);
                        this.f47170i = null;
                        this.j = null;
                    } catch (Throwable th) {
                        this.f47170i = null;
                        this.j = null;
                        throw th;
                    }
                } catch (Throwable unused) {
                    C2018x.i("BillingClient");
                    this.f47170i = null;
                    this.j = null;
                }
            }
        }
    }

    public final boolean o() {
        AbstractC2003s abstractC2003s = this.f47161C;
        if (abstractC2003s == null) {
            throw new NullPointerException("ticker");
        }
        long jA = abstractC2003s.a();
        long j = 30000;
        long jConvert = 30000;
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                if (Math.max(0L, jConvert) <= 0) {
                    int i11 = C2018x.f26297a;
                    Log.isLoggable("BillingClient", 5);
                    return p();
                }
                C2018x.h("BillingClient", "Already connected or not opted into auto reconnection.");
                a aVar = b.f23564g;
                TimeUnit.MILLISECONDS.getClass();
                int i12 = aVar.f23552a;
                if (i12 == 0) {
                    C2018x.h("BillingClient", "Reconnection succeeded with result: " + i12);
                    return p();
                }
                Log.isLoggable("BillingClient", 5);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jA2 = (abstractC2003s.a() - jA) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j - timeUnit.convert(jA2, timeUnit2);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jConvert < jPow) {
                    Log.isLoggable("BillingClient", 5);
                    return p();
                }
                if (i10 >= 3 || jPow <= 0) {
                    j = 30000;
                } else {
                    try {
                        Thread.sleep(jPow);
                        j = 30000;
                        jConvert = 30000 - timeUnit.convert((abstractC2003s.a() - jA) + 0, timeUnit2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        C2018x.i("BillingClient");
                    }
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                C2018x.i("BillingClient");
            }
        }
        int i13 = C2018x.f26297a;
        Log.isLoggable("BillingClient", 5);
        return p();
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f47162a) {
            try {
                z10 = false;
                if (this.f47163b == 2 && this.f47170i != null && this.j != null) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final Handler r() {
        return Looper.myLooper() == null ? this.f47166e : new Handler(Looper.myLooper());
    }

    public final s s(a aVar, zzie zzieVar, Exception exc) {
        C2018x.i("BillingClient");
        A(zzieVar, 7, aVar, C.a(exc));
        return new s(aVar.f23552a, aVar.f23554c, new ArrayList(), new ArrayList());
    }

    public final a t(int i10) {
        C2018x.h("BillingClient", "Service connection is valid. No need to re-initialize.");
        J1 j1V = K1.v();
        j1V.f();
        K1.u((K1) j1V.f26124c, 6);
        q2 q2VarU = r2.u();
        q2VarU.f();
        r2.t((r2) q2VarU.f26124c);
        q2VarU.g(i10 > 0);
        q2VarU.h(i10);
        j1V.f();
        K1.t((K1) j1V.f26124c, (r2) q2VarU.c());
        j((K1) j1V.c());
        return b.f23564g;
    }

    public final a u() {
        a aVar;
        int[] iArr = {0, 3};
        synchronized (this.f47162a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f47163b == iArr[i10]) {
                    aVar = b.f23565h;
                }
            }
            aVar = b.f23563f;
        }
        return aVar;
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.f47168g.getPackageName();
        }
    }

    public final c1 x(a aVar, zzie zzieVar, Exception exc) {
        A(zzieVar, 9, aVar, C.a(exc));
        C2018x.i("BillingClient");
        return new c1(aVar, null);
    }

    public final void y(int i10, a aVar, zzie zzieVar) {
        try {
            int i11 = C.f47135a;
            i(C.b(zzieVar, i10, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
    }

    public final void z(zzie zzieVar, a aVar, long j) {
        try {
            int i10 = C.f47135a;
            try {
                this.f47169h.b(C.b(zzieVar, 2, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f47172l, j);
            } catch (Throwable unused) {
                C2018x.i("BillingClient");
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
    }

    public C2789b(e eVar, Activity activity, AbstractC2788a.C0535a c0535a) {
        long jNextLong = new Random().nextLong();
        this.f47160B = Long.valueOf(jNextLong);
        this.f47161C = C1983l.f26209a;
        this.f47164c = "8.0.0";
        String strW = w();
        this.f47165d = strW;
        this.f47168g = activity.getApplicationContext();
        U1 u1C = V1.C();
        u1C.f();
        V1.y((V1) u1C.f26124c);
        if (strW != null) {
            u1C.f();
            V1.z((V1) u1C.f26124c, strW);
        }
        String packageName = this.f47168g.getPackageName();
        u1C.f();
        V1.w((V1) u1C.f26124c, packageName);
        u1C.f();
        V1.t((V1) u1C.f26124c, jNextLong);
        c0535a.getClass();
        u1C.f();
        V1.x((V1) u1C.f26124c);
        int i10 = Build.VERSION.SDK_INT;
        u1C.f();
        V1.q((V1) u1C.f26124c, i10);
        u1C.g();
        try {
            int i11 = this.f47168g.getPackageManager().getPackageInfo(this.f47168g.getPackageName(), 0).versionCode;
            u1C.f();
            V1.r((V1) u1C.f26124c, i11);
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
        this.f47169h = new c(this.f47168g, (V1) u1C.c());
        int i12 = C2018x.f26297a;
        Log.isLoggable("BillingClient", 5);
        this.f47167f = new H(this.f47168g, null, this.f47169h);
        this.f47184x = eVar;
        this.f47168g.getPackageName();
    }
}
