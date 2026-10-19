package p302y6;

import A6.A;
import A6.D;
import A6.K;
import A6.L;
import A6.M;
import A6.P;
import A6.Q;
import A6.V;
import A6.W;
import A6.X;
import A6.Y;
import A6.f0;
import C4.x;
import D6.e;
import D6.f;
import E6.a;
import E6.d.a;
import I4.l;
import V.u;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.compose.material.ripple.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import p191p5.B;
import p264v6.h;
import p311z4.c;
import p313z6.d;
import p313z6.k;
import p313z6.n;

/* JADX INFO: compiled from: SessionReportingCoordinator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f48343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f48344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f48345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p313z6.e f48346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f48347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f48348f;

    public O(F f10, e eVar, a aVar, p313z6.e eVar2, n nVar, M m7) {
        this.f48343a = f10;
        this.f48344b = eVar;
        this.f48345c = aVar;
        this.f48346d = eVar2;
        this.f48347e = nVar;
        this.f48348f = m7;
    }

    public static K a(K k10, p313z6.e eVar, n nVar) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        K.a aVarG = k10.g();
        String strB = eVar.f48863b.b();
        if (strB != null) {
            aVarG.f729e = new V(strB);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        d reference = nVar.f48895d.f48899a.getReference();
        synchronized (reference) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f48858a));
        }
        List<f0.c> listD = d(mapUnmodifiableMap);
        d reference2 = nVar.f48896e.f48899a.getReference();
        synchronized (reference2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.f48858a));
        }
        List<f0.c> listD2 = d(mapUnmodifiableMap2);
        if (!listD.isEmpty() || !listD2.isEmpty()) {
            L.a aVarH = k10.f721c.h();
            aVarH.f739b = listD;
            aVarH.f740c = listD2;
            String strConcat = aVarH.f738a == null ? " execution" : "";
            if (aVarH.f744g == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            aVarG.f727c = new L(aVarH.f738a, aVarH.f739b, aVarH.f740c, aVarH.f741d, aVarH.f742e, aVarH.f743f, aVarH.f744g.intValue());
        }
        return aVarG.a();
    }

    public static f0.e.d b(K k10, n nVar) {
        List<k> listA = nVar.f48897f.a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            k kVar = listA.get(i10);
            W.a aVar = new W.a();
            String strE = kVar.e();
            if (strE == null) {
                throw new NullPointerException("Null variantId");
            }
            String strC = kVar.c();
            if (strC == null) {
                throw new NullPointerException("Null rolloutId");
            }
            aVar.f800a = new X(strC, strE);
            String strA = kVar.a();
            if (strA == null) {
                throw new NullPointerException("Null parameterKey");
            }
            aVar.f801b = strA;
            String strB = kVar.b();
            if (strB == null) {
                throw new NullPointerException("Null parameterValue");
            }
            aVar.f802c = strB;
            aVar.f803d = Long.valueOf(kVar.d());
            arrayList.add(aVar.a());
        }
        if (arrayList.isEmpty()) {
            return k10;
        }
        K.a aVarG = k10.g();
        aVarG.f730f = new Y(arrayList);
        return aVarG.a();
    }

    public static O c(Context context, M m7, f fVar, C2805a c2805a, p313z6.e eVar, n nVar, G6.a aVar, com.google.firebase.crashlytics.internal.settings.a aVar2, j jVar, C2813i c2813i) {
        F f10 = new F(context, m7, c2805a, aVar, aVar2);
        e eVar2 = new e(fVar, aVar2, c2813i);
        B6.e eVar3 = a.f3086b;
        x.b(context);
        return new O(f10, eVar2, new a(new E6.d(x.a().c(new A4.a(a.f3087c, a.f3088d)).b("FIREBASE_CRASHLYTICS_REPORT", new c("json"), a.f3089e), aVar2.b(), jVar)), eVar, nVar, m7);
    }

    public static List<f0.c> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new NullPointerException("Null key");
            }
            String value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new D(key, value));
        }
        Collections.sort(arrayList, new u(3));
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(Throwable th, Thread thread, String str, String str2, long j, boolean z10) {
        G6.a aVar;
        Object next;
        f0.e.d.a.c cVarA;
        String processName;
        boolean zEquals = str2.equals("crash");
        F f10 = this.f48343a;
        Context context = f10.f48315a;
        int i10 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        G6.c cVar = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            aVar = f10.f48318d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            cVar = new G6.c(th2.getLocalizedMessage(), th2.getClass().getName(), aVar.a(th2.getStackTrace()), cVar);
        }
        K.a aVar2 = new K.a();
        aVar2.f726b = str2;
        aVar2.f725a = Long.valueOf(j);
        int iMyPid = Process.myPid();
        Iterator it = h.b(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f0.e.d.a.c) next).b() != iMyPid);
        f0.e.d.a.c cVar2 = (f0.e.d.a.c) next;
        if (cVar2 == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                processName = Process.myProcessName();
                i.d(processName, "{\n      Process.myProcessName()\n    }");
            } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
                processName = "";
            }
            cVarA = h.a(processName, iMyPid, 0, 12);
        } else {
            cVarA = cVar2;
        }
        Boolean boolValueOf = cVarA.a() > 0 ? Boolean.valueOf(cVarA.a() != 100) : null;
        ArrayList arrayListB = h.b(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = cVar.f3379c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List listD = F.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        arrayList.add(new Q(4, name, listD));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next2 = it2.next();
                Thread key = next2.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrA = aVar.a(next2.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    List listD2 = F.d(stackTraceElementArrA, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    arrayList.add(new Q(0, name2, listD2));
                }
                it2 = it2;
                aVar = aVar;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        A6.O oC = F.c(cVar, 0);
        P p10 = new P("0", "0", 0L);
        List<f0.e.d.a.b.AbstractC0008a> listA = f10.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        aVar2.f727c = new L(new M(listUnmodifiableList, oC, null, p10, listA), null, null, boolValueOf, cVarA, arrayListB, i10);
        aVar2.f728d = f10.b(i10);
        K kA = aVar2.a();
        p313z6.e eVar = this.f48346d;
        n nVar = this.f48347e;
        this.f48344b.d(b(a(kA, eVar, nVar), nVar), str, zEquals);
    }

    public final B f(ExecutorService executorService, String str) {
        p191p5.h<G> hVar;
        String str2;
        ArrayList<File> arrayListB = this.f48344b.b();
        ArrayList<G> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                B6.e eVar = e.f2807g;
                String strE = e.e(file);
                eVar.getClass();
                arrayList.add(new C2806b(B6.e.i(strE), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (G c2806b : arrayList) {
            if (str == null || str.equals(c2806b.c())) {
                a aVar = this.f48345c;
                if (c2806b.a().e() == null) {
                    try {
                        str2 = (String) Q.a(this.f48348f.f48340d.getId());
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    A.a aVarL = c2806b.a().l();
                    aVarL.f640e = str2;
                    c2806b = new C2806b(aVarL.a(), c2806b.c(), c2806b.b());
                }
                boolean z10 = str != null;
                E6.d dVar = aVar.f3090a;
                synchronized (dVar.f3103f) {
                    try {
                        hVar = new p191p5.h<>();
                        if (z10) {
                            ((AtomicInteger) dVar.f3106i.f12003b).getAndIncrement();
                            if (dVar.f3103f.size() < dVar.f3102e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                dVar.f3103f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                dVar.f3104g.execute(dVar.new a(c2806b, hVar));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                hVar.d(c2806b);
                            } else {
                                dVar.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) dVar.f3106i.f12004c).getAndIncrement();
                                hVar.d(c2806b);
                            }
                        } else {
                            dVar.b(c2806b, hVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(hVar.f45811a.g(executorService, new l(this)));
            }
        }
        return p191p5.j.f(arrayList2);
    }
}
