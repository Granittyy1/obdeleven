package p253u7;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.h;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.p;
import p206q7.b;
import p241t7.a;
import p314z7.f;

/* JADX INFO: compiled from: NetworkRequestMetricBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b implements p290x7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f47442i = a.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<p290x7.a> f47443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaugeManager f47444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f47445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NetworkRequestMetric.a f47446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference<p290x7.b> f47447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f47448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47449h;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(f fVar) {
        p206q7.a aVarA = p206q7.a.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(aVarA);
        this.f47446e = NetworkRequestMetric.n0();
        this.f47447f = new WeakReference<>(this);
        this.f47445d = fVar;
        this.f47444c = gaugeManager;
        this.f47443b = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static c c(f fVar) {
        return new c(fVar);
    }

    @Override // p290x7.b
    public final void a(p290x7.a aVar) {
        if (aVar == null) {
            f47442i.f();
            return;
        }
        NetworkRequestMetric.a aVar2 = this.f47446e;
        if (!((NetworkRequestMetric) aVar2.f29047c).f0() || ((NetworkRequestMetric) aVar2.f29047c).l0()) {
            return;
        }
        this.f47443b.add(aVar);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f47447f);
        unregisterForAppState();
        synchronized (this.f47443b) {
            try {
                ArrayList arrayList = new ArrayList();
                for (p290x7.a aVar : this.f47443b) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        h[] hVarArrB = p290x7.a.b(listUnmodifiableList);
        if (hVarArrB != null) {
            NetworkRequestMetric.a aVar2 = this.f47446e;
            List listAsList = Arrays.asList(hVarArrB);
            aVar2.r();
            NetworkRequestMetric.Q((NetworkRequestMetric) aVar2.f29047c, listAsList);
        }
        final NetworkRequestMetric networkRequestMetricP = this.f47446e.p();
        String str = this.f47448g;
        if (str == null) {
            Pattern pattern = p277w7.h.f47792a;
        } else if (p277w7.h.f47792a.matcher(str).matches()) {
            f47442i.a();
            return;
        }
        if (this.f47449h) {
            return;
        }
        final f fVar = this.f47445d;
        final ApplicationProcessState appState = getAppState();
        fVar.j.execute(new Runnable() { // from class: z7.e
            @Override // java.lang.Runnable
            public final void run() {
                f fVar2 = fVar;
                fVar2.getClass();
                g.a aVarN = g.N();
                aVarN.r();
                g.K((g) aVarN.f29047c, networkRequestMetricP);
                fVar2.d(aVarN, appState);
            }
        });
        this.f47449h = true;
    }

    public final void d(String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case "GET":
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case "PUT":
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case "HEAD":
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case "POST":
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case "PATCH":
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case "TRACE":
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case "CONNECT":
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case "DELETE":
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            NetworkRequestMetric.a aVar = this.f47446e;
            aVar.r();
            NetworkRequestMetric.R((NetworkRequestMetric) aVar.f29047c, httpMethod);
        }
    }

    public final void e(int i10) {
        NetworkRequestMetric.a aVar = this.f47446e;
        aVar.r();
        NetworkRequestMetric.J((NetworkRequestMetric) aVar.f29047c, i10);
    }

    public final void f(long j) {
        NetworkRequestMetric.a aVar = this.f47446e;
        aVar.r();
        NetworkRequestMetric.S((NetworkRequestMetric) aVar.f29047c, j);
    }

    public final void h(long j) {
        p290x7.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f47447f);
        NetworkRequestMetric.a aVar = this.f47446e;
        aVar.r();
        NetworkRequestMetric.M((NetworkRequestMetric) aVar.f29047c, j);
        a(aVarPerfSession);
        if (aVarPerfSession.f47912d) {
            this.f47444c.collectGaugeMetricOnce(aVarPerfSession.f47911c);
        }
    }

    public final void i(String str) {
        NetworkRequestMetric.a aVar = this.f47446e;
        if (str == null) {
            aVar.r();
            NetworkRequestMetric.L((NetworkRequestMetric) aVar.f29047c);
            return;
        }
        if (str.length() <= 128) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            aVar.r();
            NetworkRequestMetric.K((NetworkRequestMetric) aVar.f29047c, str);
            return;
        }
        "The content type of the response is not a valid content-type:".concat(str);
        f47442i.f();
    }

    public final void j(long j) {
        NetworkRequestMetric.a aVar = this.f47446e;
        aVar.r();
        NetworkRequestMetric.T((NetworkRequestMetric) aVar.f29047c, j);
    }

    public final void k(long j) {
        NetworkRequestMetric.a aVar = this.f47446e;
        aVar.r();
        NetworkRequestMetric.P((NetworkRequestMetric) aVar.f29047c, j);
        if (SessionManager.getInstance().perfSession().f47912d) {
            this.f47444c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f47911c);
        }
    }

    public final void l(String str) throws EOFException {
        p pVarA;
        int iLastIndexOf;
        if (str != null) {
            p pVarA2 = null;
            try {
                p.a aVar = new p.a();
                aVar.c(null, str);
                pVarA = aVar.a();
            } catch (IllegalArgumentException unused) {
                pVarA = null;
            }
            if (pVarA != null) {
                p.a aVarF = pVarA.f();
                aVarF.f45581b = p.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                aVarF.f45582c = p.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                aVarF.f45586g = null;
                aVarF.f45587h = null;
                str = aVarF.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        p.a aVar2 = new p.a();
                        aVar2.c(null, str);
                        pVarA2 = aVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (pVarA2 != null && pVarA2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            NetworkRequestMetric.a aVar3 = this.f47446e;
            aVar3.r();
            NetworkRequestMetric.H((NetworkRequestMetric) aVar3.f29047c, str);
        }
    }
}
