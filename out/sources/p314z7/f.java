package p314z7;

import C4.w;
import Q8.d;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.C0936h;
import androidx.media3.exoplayer.c0;
import com.google.android.datatransport.Priority;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.i;
import com.google.protobuf.GeneratedMessageLite;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p005a4.q;
import p108i7.c;
import p144l6.e;
import p191p5.j;
import p193p7.b;
import p206q7.a;
import p218r7.t;
import p311z4.h;

/* JADX INFO: compiled from: TransportManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements a.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p241t7.a f48929s = p241t7.a.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f48930t = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f48931b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f48934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f48935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f48936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p096h7.b<h> f48937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f48938i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f48939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p218r7.a f48940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f48941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f48942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.firebase.perf.v1.c.a f48943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48945q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f48932c = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f48933d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f48946r = false;
    public final ThreadPoolExecutor j = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f48931b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(A7.a aVar) {
        if (aVar.h()) {
            i iVarI = aVar.i();
            long jV = iVarI.V();
            Locale locale = Locale.ENGLISH;
            return C0936h.d("trace metric: ", iVarI.W(), " (duration: ", new DecimalFormat("#.####").format(jV / 1000.0d), "ms)");
        }
        if (aVar.j()) {
            NetworkRequestMetric networkRequestMetricL = aVar.l();
            long jC0 = networkRequestMetricL.l0() ? networkRequestMetricL.c0() : 0L;
            String strValueOf = networkRequestMetricL.h0() ? String.valueOf(networkRequestMetricL.X()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return d.a(B6.a.c("network request trace: ", networkRequestMetricL.e0(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jC0 / 1000.0d), "ms)");
        }
        if (!aVar.e()) {
            return "log";
        }
        com.google.firebase.perf.v1.f fVarM = aVar.m();
        Locale locale3 = Locale.ENGLISH;
        boolean zP = fVarM.P();
        int iM = fVarM.M();
        int iL = fVarM.L();
        StringBuilder sb2 = new StringBuilder("gauges (hasMetadata: ");
        sb2.append(zP);
        sb2.append(", cpuGaugeCount: ");
        sb2.append(iM);
        sb2.append(", memoryGaugeCount: ");
        return q.c(sb2, iL, ")");
    }

    public final void b(g gVar) {
        if (gVar.h()) {
            this.f48942n.b(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (gVar.j()) {
            this.f48942n.b(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    public final void c(i iVar, ApplicationProcessState applicationProcessState) {
        this.j.execute(new c0(this, iVar, applicationProcessState, 2));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x0342  */
    /* JADX WARN: Code duplicated, block: B:142:0x037c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0386  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ce A[Catch: all -> 0x03d6, TryCatch #2 {all -> 0x03d6, blocks: (B:160:0x03ca, B:162:0x03ce, B:165:0x03d9), top: B:232:0x03ca }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:172:0x0419  */
    /* JADX WARN: Code duplicated, block: B:174:0x0423  */
    /* JADX WARN: Code duplicated, block: B:177:0x043e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0446  */
    /* JADX WARN: Code duplicated, block: B:180:0x0448  */
    /* JADX WARN: Code duplicated, block: B:184:0x0451  */
    /* JADX WARN: Code duplicated, block: B:186:0x045f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0480  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:214:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:216:0x050d  */
    /* JADX WARN: Code duplicated, block: B:217:0x051c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0534  */
    /* JADX WARN: Code duplicated, block: B:222:0x0549  */
    /* JADX WARN: Code duplicated, block: B:224:0x0553  */
    /* JADX WARN: Code duplicated, block: B:225:0x0569  */
    /* JADX WARN: Code duplicated, block: B:228:0x0570  */
    /* JADX WARN: Code duplicated, block: B:229:0x0582  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    public final void d(g.a aVar, ApplicationProcessState applicationProcessState) {
        c cVar;
        boolean z10;
        boolean zB;
        p218r7.a aVar2;
        p218r7.h hVar;
        com.google.firebase.perf.util.d<Double> dVar;
        com.google.firebase.perf.util.d<Double> dVarB;
        double dDoubleValue;
        p218r7.e eVar;
        com.google.firebase.perf.util.d<Double> dVar2;
        com.google.firebase.perf.util.d<Double> dVarB2;
        double dDoubleValue2;
        t tVar;
        double dDoubleValue3;
        boolean zH;
        p241t7.a aVar3;
        a aVar4;
        p311z4.g<g> gVar;
        p241t7.a aVar5;
        p311z4.g<g> gVar2;
        h hVar2;
        String strW;
        String strD;
        String str;
        int i10 = 0;
        boolean z11 = true;
        if (!this.f48933d.get()) {
            ConcurrentHashMap concurrentHashMap = this.f48931b;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (aVar.h() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (aVar.j() && iIntValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!aVar.e() || iIntValue3 <= 0) {
                    f48929s.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(aVar), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            f48929s.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(aVar));
            this.f48932c.add(new b(aVar, applicationProcessState));
            return;
        }
        p241t7.a aVar6 = f48929s;
        if (this.f48940l.o() && (!((com.google.firebase.perf.v1.c) this.f48943o.f29047c).P() || this.f48946r)) {
            try {
                str = (String) j.b(this.f48936g.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                aVar6.c("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                str = null;
            } catch (ExecutionException e11) {
                aVar6.c("Unable to retrieve Installation Id: %s", e11.getMessage());
                str = null;
            } catch (TimeoutException e12) {
                aVar6.c("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                aVar6.f();
            } else {
                com.google.firebase.perf.v1.c.a aVar7 = this.f48943o;
                aVar7.r();
                com.google.firebase.perf.v1.c.K((com.google.firebase.perf.v1.c) aVar7.f29047c, str);
            }
        }
        com.google.firebase.perf.v1.c.a aVar8 = this.f48943o;
        aVar8.r();
        com.google.firebase.perf.v1.c.I((com.google.firebase.perf.v1.c) aVar8.f29047c, applicationProcessState);
        if (aVar.h() || aVar.j()) {
            GeneratedMessageLite.a aVar9 = (GeneratedMessageLite.a) aVar8.f29046b.w(GeneratedMessageLite.MethodToInvoke.f29042f);
            aVar9.f29047c = aVar8.q();
            aVar8 = (com.google.firebase.perf.v1.c.a) aVar9;
            if (this.f48935f == null && this.f48933d.get()) {
                p241t7.a aVar10 = b.f45875e;
                this.f48935f = (b) e.c().b(b.class);
            }
            b bVar = this.f48935f;
            Object map = bVar != null ? new HashMap(bVar.f45876a) : Collections.emptyMap();
            aVar8.r();
            com.google.firebase.perf.v1.c.J((com.google.firebase.perf.v1.c) aVar8.f29047c).putAll(map);
        }
        aVar.r();
        g.H((g) aVar.f29047c, aVar8.p());
        g gVarP = aVar.p();
        if (!this.f48940l.o()) {
            f48929s.e("Performance collection is not enabled, dropping %s", a(gVarP));
        } else if (gVarP.L().P()) {
            Context context = this.f48939k;
            ArrayList arrayList = new ArrayList();
            if (gVarP.h()) {
                arrayList.add(new p265v7.d(gVarP.i()));
            }
            if (gVarP.j()) {
                arrayList.add(new p265v7.c(gVarP.l(), context));
            }
            if (gVarP.M()) {
                arrayList.add(new p265v7.a(gVarP.L()));
            }
            if (gVarP.e()) {
                arrayList.add(new p265v7.b(gVarP.m()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c cVar2 = this.f48941m;
                        cVar2.getClass();
                        if (gVarP.h()) {
                            p218r7.a aVar11 = cVar2.f48909a;
                            aVar11.getClass();
                            synchronized (t.class) {
                                try {
                                    if (t.f46383c == null) {
                                        t.f46383c = new t();
                                    }
                                    tVar = t.f46383c;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            RemoteConfigManager remoteConfigManager = aVar11.f46362a;
                            tVar.getClass();
                            com.google.firebase.perf.util.d<Double> dVar3 = remoteConfigManager.getDouble("fpr_vc_trace_sampling_rate");
                            if (dVar3.b() && p218r7.a.p(dVar3.a().doubleValue())) {
                                aVar11.f46364c.e("com.google.firebase.perf.TraceSamplingRate", dVar3.a().doubleValue());
                                dDoubleValue3 = dVar3.a().doubleValue();
                            } else {
                                com.google.firebase.perf.util.d<Double> dVarB3 = aVar11.b(tVar);
                                if (dVarB3.b() && p218r7.a.p(dVarB3.a().doubleValue())) {
                                    dDoubleValue3 = dVarB3.a().doubleValue();
                                } else {
                                    dDoubleValue3 = aVar11.f46362a.isLastFetchFailed() ? 0.001d : 1.0d;
                                }
                            }
                            if (cVar2.f48910b >= dDoubleValue3 && !c.a(gVarP.i().X())) {
                                b(gVarP);
                                f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                            } else if (!gVarP.h() && gVarP.i().W().startsWith("_st_") && gVarP.i().Q()) {
                                p218r7.a aVar12 = cVar2.f48909a;
                                aVar12.getClass();
                                synchronized (p218r7.e.class) {
                                    try {
                                        if (p218r7.e.f46368c == null) {
                                            p218r7.e.f46368c = new p218r7.e();
                                        }
                                        eVar = p218r7.e.f46368c;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                com.google.firebase.perf.util.d<Double> dVarI = aVar12.i(eVar);
                                if (dVarI.b()) {
                                    dDoubleValue2 = dVarI.a().doubleValue() / 100.0d;
                                    if (!p218r7.a.p(dDoubleValue2)) {
                                        dVar2 = aVar12.f46362a.getDouble("fpr_vc_fragment_sampling_rate");
                                        if (dVar2.b() || !p218r7.a.p(dVar2.a().doubleValue())) {
                                            dVarB2 = aVar12.b(eVar);
                                            if (dVarB2.b() || !p218r7.a.p(dVarB2.a().doubleValue())) {
                                                dDoubleValue2 = 0.0d;
                                            } else {
                                                dDoubleValue2 = dVarB2.a().doubleValue();
                                            }
                                        } else {
                                            aVar12.f46364c.e("com.google.firebase.perf.FragmentSamplingRate", dVar2.a().doubleValue());
                                            dDoubleValue2 = dVar2.a().doubleValue();
                                        }
                                    }
                                } else {
                                    dVar2 = aVar12.f46362a.getDouble("fpr_vc_fragment_sampling_rate");
                                    if (dVar2.b()) {
                                        dVarB2 = aVar12.b(eVar);
                                        if (dVarB2.b()) {
                                            dDoubleValue2 = 0.0d;
                                        } else {
                                            dDoubleValue2 = 0.0d;
                                        }
                                    } else {
                                        dVarB2 = aVar12.b(eVar);
                                        if (dVarB2.b()) {
                                            dDoubleValue2 = 0.0d;
                                        } else {
                                            dDoubleValue2 = 0.0d;
                                        }
                                    }
                                }
                                if (cVar2.f48911c >= dDoubleValue2 && !c.a(gVarP.i().X())) {
                                    b(gVarP);
                                    f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                                } else {
                                    if (gVarP.j()) {
                                        aVar2 = cVar2.f48909a;
                                        aVar2.getClass();
                                        synchronized (p218r7.h.class) {
                                            if (p218r7.h.f46371c == null) {
                                                p218r7.h.f46371c = new p218r7.h();
                                            }
                                            hVar = p218r7.h.f46371c;
                                            RemoteConfigManager remoteConfigManager2 = aVar2.f46362a;
                                            hVar.getClass();
                                            dVar = remoteConfigManager2.getDouble("fpr_vc_network_request_sampling_rate");
                                            if (dVar.b()) {
                                                dVarB = aVar2.b(hVar);
                                                if (!dVarB.b()) {
                                                    if (aVar2.f46362a.isLastFetchFailed()) {
                                                        dDoubleValue = 0.001d;
                                                    } else {
                                                        dDoubleValue = 1.0d;
                                                    }
                                                } else if (aVar2.f46362a.isLastFetchFailed()) {
                                                    dDoubleValue = 0.001d;
                                                } else {
                                                    dDoubleValue = 1.0d;
                                                }
                                            } else {
                                                dVarB = aVar2.b(hVar);
                                                if (!dVarB.b()) {
                                                    if (aVar2.f46362a.isLastFetchFailed()) {
                                                        dDoubleValue = 0.001d;
                                                    } else {
                                                        dDoubleValue = 1.0d;
                                                    }
                                                } else if (aVar2.f46362a.isLastFetchFailed()) {
                                                    dDoubleValue = 0.001d;
                                                } else {
                                                    dDoubleValue = 1.0d;
                                                }
                                            }
                                            if (cVar2.f48910b >= dDoubleValue) {
                                                b(gVarP);
                                                f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                                            }
                                        }
                                    }
                                    cVar = this.f48941m;
                                    cVar.getClass();
                                    if (gVarP.h()) {
                                        if (gVarP.j()) {
                                            zB = cVar.f48913e.b();
                                        } else if (gVarP.h()) {
                                            zB = cVar.f48912d.b();
                                        } else {
                                            z10 = true;
                                        }
                                        z10 = !zB;
                                    } else {
                                        if (gVarP.j()) {
                                            zB = cVar.f48913e.b();
                                        } else if (gVarP.h()) {
                                            zB = cVar.f48912d.b();
                                        } else {
                                            z10 = true;
                                        }
                                        z10 = !zB;
                                    }
                                    if (z10) {
                                        b(gVarP);
                                        f48929s.e("Rate limited (per device) - %s", a(gVarP));
                                    }
                                }
                            } else {
                                if (gVarP.j()) {
                                    aVar2 = cVar2.f48909a;
                                    aVar2.getClass();
                                    synchronized (p218r7.h.class) {
                                        try {
                                            if (p218r7.h.f46371c == null) {
                                                p218r7.h.f46371c = new p218r7.h();
                                            }
                                            hVar = p218r7.h.f46371c;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    RemoteConfigManager remoteConfigManager3 = aVar2.f46362a;
                                    hVar.getClass();
                                    dVar = remoteConfigManager3.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar.b() || !p218r7.a.p(dVar.a().doubleValue())) {
                                        dVarB = aVar2.b(hVar);
                                        if (!dVarB.b() && p218r7.a.p(dVarB.a().doubleValue())) {
                                            dDoubleValue = dVarB.a().doubleValue();
                                        } else if (aVar2.f46362a.isLastFetchFailed()) {
                                            dDoubleValue = 0.001d;
                                        } else {
                                            dDoubleValue = 1.0d;
                                        }
                                    } else {
                                        aVar2.f46364c.e("com.google.firebase.perf.NetworkRequestSamplingRate", dVar.a().doubleValue());
                                        dDoubleValue = dVar.a().doubleValue();
                                    }
                                    if (cVar2.f48910b >= dDoubleValue && !c.a(gVarP.l().Y())) {
                                        b(gVarP);
                                        f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                                    }
                                }
                                cVar = this.f48941m;
                                cVar.getClass();
                                if ((gVarP.h() || (!(gVarP.i().W().equals(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString()) || gVarP.i().W().equals(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString())) || gVarP.i().R() <= 0)) && !gVarP.e()) {
                                    if (gVarP.j()) {
                                        zB = cVar.f48913e.b();
                                    } else if (gVarP.h()) {
                                        zB = cVar.f48912d.b();
                                    } else {
                                        z10 = true;
                                    }
                                    z10 = !zB;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    b(gVarP);
                                    f48929s.e("Rate limited (per device) - %s", a(gVarP));
                                }
                            }
                        } else if (!gVarP.h()) {
                            if (gVarP.j()) {
                                aVar2 = cVar2.f48909a;
                                aVar2.getClass();
                                synchronized (p218r7.h.class) {
                                    if (p218r7.h.f46371c == null) {
                                        p218r7.h.f46371c = new p218r7.h();
                                    }
                                    hVar = p218r7.h.f46371c;
                                    RemoteConfigManager remoteConfigManager4 = aVar2.f46362a;
                                    hVar.getClass();
                                    dVar = remoteConfigManager4.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar.b()) {
                                        dVarB = aVar2.b(hVar);
                                        if (!dVarB.b()) {
                                            if (aVar2.f46362a.isLastFetchFailed()) {
                                                dDoubleValue = 0.001d;
                                            } else {
                                                dDoubleValue = 1.0d;
                                            }
                                        } else if (aVar2.f46362a.isLastFetchFailed()) {
                                            dDoubleValue = 0.001d;
                                        } else {
                                            dDoubleValue = 1.0d;
                                        }
                                    } else {
                                        dVarB = aVar2.b(hVar);
                                        if (!dVarB.b()) {
                                            if (aVar2.f46362a.isLastFetchFailed()) {
                                                dDoubleValue = 0.001d;
                                            } else {
                                                dDoubleValue = 1.0d;
                                            }
                                        } else if (aVar2.f46362a.isLastFetchFailed()) {
                                            dDoubleValue = 0.001d;
                                        } else {
                                            dDoubleValue = 1.0d;
                                        }
                                    }
                                    if (cVar2.f48910b >= dDoubleValue) {
                                        b(gVarP);
                                        f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                                    }
                                }
                            }
                            cVar = this.f48941m;
                            cVar.getClass();
                            if (gVarP.h()) {
                                if (gVarP.j()) {
                                    zB = cVar.f48913e.b();
                                } else if (gVarP.h()) {
                                    zB = cVar.f48912d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            } else {
                                if (gVarP.j()) {
                                    zB = cVar.f48913e.b();
                                } else if (gVarP.h()) {
                                    zB = cVar.f48912d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            }
                            if (z10) {
                                b(gVarP);
                                f48929s.e("Rate limited (per device) - %s", a(gVarP));
                            }
                        } else {
                            if (gVarP.j()) {
                                aVar2 = cVar2.f48909a;
                                aVar2.getClass();
                                synchronized (p218r7.h.class) {
                                    if (p218r7.h.f46371c == null) {
                                        p218r7.h.f46371c = new p218r7.h();
                                    }
                                    hVar = p218r7.h.f46371c;
                                    RemoteConfigManager remoteConfigManager5 = aVar2.f46362a;
                                    hVar.getClass();
                                    dVar = remoteConfigManager5.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar.b()) {
                                        dVarB = aVar2.b(hVar);
                                        if (!dVarB.b()) {
                                            if (aVar2.f46362a.isLastFetchFailed()) {
                                                dDoubleValue = 0.001d;
                                            } else {
                                                dDoubleValue = 1.0d;
                                            }
                                        } else if (aVar2.f46362a.isLastFetchFailed()) {
                                            dDoubleValue = 0.001d;
                                        } else {
                                            dDoubleValue = 1.0d;
                                        }
                                    } else {
                                        dVarB = aVar2.b(hVar);
                                        if (!dVarB.b()) {
                                            if (aVar2.f46362a.isLastFetchFailed()) {
                                                dDoubleValue = 0.001d;
                                            } else {
                                                dDoubleValue = 1.0d;
                                            }
                                        } else if (aVar2.f46362a.isLastFetchFailed()) {
                                            dDoubleValue = 0.001d;
                                        } else {
                                            dDoubleValue = 1.0d;
                                        }
                                    }
                                    if (cVar2.f48910b >= dDoubleValue) {
                                        b(gVarP);
                                        f48929s.e("Event dropped due to device sampling - %s", a(gVarP));
                                    }
                                }
                            }
                            cVar = this.f48941m;
                            cVar.getClass();
                            if (gVarP.h()) {
                                if (gVarP.j()) {
                                    zB = cVar.f48913e.b();
                                } else if (gVarP.h()) {
                                    zB = cVar.f48912d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            } else {
                                if (gVarP.j()) {
                                    zB = cVar.f48913e.b();
                                } else if (gVarP.h()) {
                                    zB = cVar.f48912d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            }
                            if (z10) {
                                b(gVarP);
                                f48929s.e("Rate limited (per device) - %s", a(gVarP));
                            }
                        }
                    } else if (!((p265v7.e) it.next()).a()) {
                    }
                    if (z11) {
                        zH = gVarP.h();
                        aVar3 = f48929s;
                        if (zH) {
                            String strA = a(gVarP);
                            strW = gVarP.i().W();
                            if (strW.startsWith("_st_")) {
                                strD = C4.b.d(v.f(this.f48945q, this.f48944p), "/troubleshooting/trace/SCREEN_TRACE/", strW, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            } else {
                                strD = C4.b.d(v.f(this.f48945q, this.f48944p), "/troubleshooting/trace/DURATION_TRACE/", strW, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            }
                            aVar3.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA, strD);
                        } else {
                            aVar3.e("Logging %s", a(gVarP));
                        }
                        aVar4 = this.f48938i;
                        gVar = aVar4.f48906c;
                        aVar5 = a.f48903d;
                        if (gVar == null) {
                            hVar2 = aVar4.f48905b.get();
                            if (hVar2 != null) {
                                aVar4.f48906c = hVar2.b(aVar4.f48904a, new p311z4.c("proto"), new H6.c(7));
                            } else {
                                aVar5.f();
                            }
                        }
                        gVar2 = aVar4.f48906c;
                        if (gVar2 != null) {
                            ((w) gVar2).a(new p311z4.a(gVarP, Priority.f25231b, null), new C4.v(i10));
                        } else {
                            aVar5.f();
                        }
                        SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    }
                }
            }
            p241t7.a.d().a();
            f48929s.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(gVarP));
        } else {
            f48929s.g("App Instance ID is null or empty, dropping %s", a(gVarP));
        }
        z11 = false;
        if (z11) {
            zH = gVarP.h();
            aVar3 = f48929s;
            if (zH) {
                String strA2 = a(gVarP);
                strW = gVarP.i().W();
                if (strW.startsWith("_st_")) {
                    strD = C4.b.d(v.f(this.f48945q, this.f48944p), "/troubleshooting/trace/SCREEN_TRACE/", strW, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                } else {
                    strD = C4.b.d(v.f(this.f48945q, this.f48944p), "/troubleshooting/trace/DURATION_TRACE/", strW, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                }
                aVar3.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA2, strD);
            } else {
                aVar3.e("Logging %s", a(gVarP));
            }
            aVar4 = this.f48938i;
            gVar = aVar4.f48906c;
            aVar5 = a.f48903d;
            if (gVar == null) {
                hVar2 = aVar4.f48905b.get();
                if (hVar2 != null) {
                    aVar4.f48906c = hVar2.b(aVar4.f48904a, new p311z4.c("proto"), new H6.c(7));
                } else {
                    aVar5.f();
                }
            }
            gVar2 = aVar4.f48906c;
            if (gVar2 != null) {
                ((w) gVar2).a(new p311z4.a(gVarP, Priority.f25231b, null), new C4.v(i10));
            } else {
                aVar5.f();
            }
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @Override // q7.a.b
    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.f48946r = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.f48933d.get()) {
            this.j.execute(new com.facebook.login.e(3, this));
        }
    }
}
