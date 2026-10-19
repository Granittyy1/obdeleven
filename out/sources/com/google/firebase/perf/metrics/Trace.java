package com.google.firebase.perf.metrics;

import O.e;
import Q8.d;
import Z3.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p206q7.b;
import p314z7.f;

/* JADX INFO: loaded from: classes3.dex */
public class Trace extends b implements Parcelable, p290x7.b {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p241t7.a f28460n = p241t7.a.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<p290x7.b> f28461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Trace f28462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GaugeManager f28463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f28465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f28466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<p290x7.a> f28467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f28468i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f28469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f28470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f28471m;

    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    public Trace(String str, f fVar, e eVar, p206q7.a aVar) {
        this(str, fVar, eVar, aVar, GaugeManager.getInstance());
    }

    @Override // p290x7.b
    public final void a(p290x7.a aVar) {
        if (aVar == null) {
            f28460n.f();
        } else {
            if (this.f28470l == null || c()) {
                return;
            }
            this.f28467h.add(aVar);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(d.a(new StringBuilder("Trace '"), this.f28464e, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.f28466g;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            p265v7.e.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    @VisibleForTesting
    public final boolean c() {
        return this.f28471m != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f28470l != null) && !c()) {
                f28460n.g("Trace '%s' is started but not stopped when it is destructed!", this.f28464e);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f28466g.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f28466g);
    }

    @Keep
    public long getLongMetric(String str) {
        p253u7.a aVar = str != null ? (p253u7.a) this.f28465f.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.f47438c.get();
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String strC = p265v7.e.c(str);
        p241t7.a aVar = f28460n;
        if (strC != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z10 = this.f28470l != null;
        String str2 = this.f28464e;
        if (!z10) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f28465f;
        p253u7.a aVar2 = (p253u7.a) concurrentHashMap.get(strTrim);
        if (aVar2 == null) {
            aVar2 = new p253u7.a(strTrim);
            concurrentHashMap.put(strTrim, aVar2);
        }
        AtomicLong atomicLong = aVar2.f47438c;
        atomicLong.addAndGet(j);
        aVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        p241t7.a aVar = f28460n;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f28464e);
            z10 = true;
        } catch (Exception e10) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f28466g.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String strC = p265v7.e.c(str);
        p241t7.a aVar = f28460n;
        if (strC != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z10 = this.f28470l != null;
        String str2 = this.f28464e;
        if (!z10) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f28465f;
        p253u7.a aVar2 = (p253u7.a) concurrentHashMap.get(strTrim);
        if (aVar2 == null) {
            aVar2 = new p253u7.a(strTrim);
            concurrentHashMap.put(strTrim, aVar2);
        }
        aVar2.f47438c.set(j);
        aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(String str) {
        if (!c()) {
            this.f28466g.remove(str);
            return;
        }
        p241t7.a aVar = f28460n;
        if (aVar.f47353b) {
            aVar.f47352a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    @Keep
    public void start() {
        String str;
        boolean zO = p218r7.a.e().o();
        p241t7.a aVar = f28460n;
        if (!zO) {
            aVar.a();
            return;
        }
        String str2 = this.f28464e;
        if (str2 != null) {
            if (str2.length() <= 100) {
                if (!str2.startsWith("_")) {
                    str = null;
                    break;
                }
                Constants$TraceNames[] constants$TraceNamesArrValues = Constants$TraceNames.values();
                int length = constants$TraceNamesArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        if (!str2.startsWith("_st_")) {
                            str = "Trace name must not start with '_'";
                            break;
                        }
                        break;
                    } else if (!constants$TraceNamesArrValues[i10].toString().equals(str2)) {
                        i10++;
                    }
                    str = null;
                    break;
                }
            } else {
                Locale locale = Locale.US;
                str = "Trace name must not exceed 100 characters";
            }
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f28470l != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f28469k.getClass();
        this.f28470l = new h();
        registerForAppState();
        p290x7.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f28461b);
        a(aVarPerfSession);
        if (aVarPerfSession.f47912d) {
            this.f28463d.collectGaugeMetricOnce(aVarPerfSession.f47911c);
        }
    }

    @Keep
    public void stop() {
        boolean z10 = this.f28470l != null;
        String str = this.f28464e;
        p241t7.a aVar = f28460n;
        if (!z10) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f28461b);
        unregisterForAppState();
        this.f28469k.getClass();
        h hVar = new h();
        this.f28471m = hVar;
        if (this.f28462c == null) {
            ArrayList arrayList = this.f28468i;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) n.f(1, arrayList);
                if (trace.f28471m == null) {
                    trace.f28471m = hVar;
                }
            }
            if (str.isEmpty()) {
                if (aVar.f47353b) {
                    aVar.f47352a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.j.c(new p253u7.d(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().f47912d) {
                this.f28463d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f47911c);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f28462c, 0);
        parcel.writeString(this.f28464e);
        parcel.writeList(this.f28468i);
        parcel.writeMap(this.f28465f);
        parcel.writeParcelable(this.f28470l, 0);
        parcel.writeParcelable(this.f28471m, 0);
        synchronized (this.f28467h) {
            parcel.writeList(this.f28467h);
        }
    }

    public Trace(String str, f fVar, e eVar, p206q7.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f28461b = new WeakReference<>(this);
        this.f28462c = null;
        this.f28464e = str.trim();
        this.f28468i = new ArrayList();
        this.f28465f = new ConcurrentHashMap();
        this.f28466g = new ConcurrentHashMap();
        this.f28469k = eVar;
        this.j = fVar;
        this.f28467h = Collections.synchronizedList(new ArrayList());
        this.f28463d = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : p206q7.a.a());
        this.f28461b = new WeakReference<>(this);
        this.f28462c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f28464e = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f28468i = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f28465f = concurrentHashMap;
        this.f28466g = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, p253u7.a.class.getClassLoader());
        this.f28470l = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f28471m = (h) parcel.readParcelable(h.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f28467h = listSynchronizedList;
        parcel.readList(listSynchronizedList, p290x7.a.class.getClassLoader());
        if (z10) {
            this.j = null;
            this.f28469k = null;
            this.f28463d = null;
        } else {
            this.j = f.f48930t;
            this.f28469k = new e();
            this.f28463d = GaugeManager.getInstance();
        }
    }
}
