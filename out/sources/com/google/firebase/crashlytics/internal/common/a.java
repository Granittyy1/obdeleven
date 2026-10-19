package com.google.firebase.crashlytics.internal.common;

import A6.A;
import A6.C;
import A6.G;
import A6.J;
import A6.K;
import A6.L;
import A6.P;
import A6.T;
import A6.Z;
import A6.a0;
import A6.b0;
import A6.c0;
import A6.d0;
import A6.e0;
import A6.f0;
import D6.b;
import I4.r;
import W.f;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.media3.exoplayer.E;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import p191p5.B;
import p191p5.h;
import p264v6.c;
import p302y6.C2805a;
import p302y6.C2807c;
import p302y6.C2809e;
import p302y6.C2812h;
import p302y6.C2813i;
import p302y6.C2818n;
import p302y6.C2819o;
import p302y6.F;
import p302y6.H;
import p302y6.I;
import p302y6.M;
import p302y6.O;
import p302y6.Q;
import p302y6.s;
import p302y6.v;
import p302y6.z;
import p313z6.d;
import p313z6.e;
import p313z6.g;
import p313z6.j;
import p313z6.k;
import p313z6.n;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2819o f28081r = new C2819o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f28083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f28084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f28085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2818n f28086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f28087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D6.f f28088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2805a f28089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f28090i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f28091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2813i f28092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f28093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H f28094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h<Boolean> f28095o = new h<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h<Boolean> f28096p = new h<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h<Void> f28097q = new h<>();

    public a(Context context, C2818n c2818n, M m7, I i10, D6.f fVar, f fVar2, C2805a c2805a, n nVar, e eVar, O o10, c cVar, E e10, C2813i c2813i) {
        new AtomicBoolean(false);
        this.f28082a = context;
        this.f28086e = c2818n;
        this.f28087f = m7;
        this.f28083b = i10;
        this.f28088g = fVar;
        this.f28084c = fVar2;
        this.f28089h = c2805a;
        this.f28085d = nVar;
        this.f28090i = eVar;
        this.j = cVar;
        this.f28091k = e10;
        this.f28092l = c2813i;
        this.f28093m = o10;
    }

    public static void a(a aVar, String str, Boolean bool) {
        Integer num;
        Map<String, String> mapUnmodifiableMap;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        M m7 = aVar.f28087f;
        C2805a c2805a = aVar.f28089h;
        c0 c0Var = new c0(m7.f48339c, c2805a.f48358f, c2805a.f48359g, ((C2807c) m7.b()).f48364a, (c2805a.f48356d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a(), c2805a.f48360h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e0 e0Var = new e0(str2, str3, CommonUtils.g());
        Context context = aVar.f28082a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        CommonUtils.Architecture architecture = CommonUtils.Architecture.f28075b;
        String str4 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        CommonUtils.Architecture architecture2 = CommonUtils.Architecture.f28075b;
        if (zIsEmpty) {
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            CommonUtils.Architecture architecture3 = (CommonUtils.Architecture) CommonUtils.Architecture.f28076c.get(str4.toLowerCase(locale));
            if (architecture3 != null) {
                architecture2 = architecture3;
            }
        }
        int iOrdinal = architecture2.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = CommonUtils.a(context);
        boolean zF = CommonUtils.f();
        int iC = CommonUtils.c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        aVar.j.d(str, jCurrentTimeMillis, new b0(c0Var, e0Var, new d0(iOrdinal, str5, iAvailableProcessors, jA, blockCount, zF, iC, str6, str7)));
        if (!bool.booleanValue() || str == null) {
            str7 = str7;
        } else {
            n nVar = aVar.f28085d;
            synchronized (nVar.f48894c) {
                try {
                    nVar.f48894c = str;
                    d reference = nVar.f48895d.f48899a.getReference();
                    synchronized (reference) {
                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f48858a));
                    }
                    List<k> listA = nVar.f48897f.a();
                    if (nVar.f48898g.getReference() != null) {
                        nVar.f48892a.i(str, nVar.f48898g.getReference());
                    }
                    if (!mapUnmodifiableMap.isEmpty()) {
                        nVar.f48892a.g(str, mapUnmodifiableMap, false);
                    }
                    if (!listA.isEmpty()) {
                        nVar.f48892a.h(str, listA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e eVar = aVar.f28090i;
        eVar.f48863b.a();
        eVar.f48863b = e.f48861c;
        if (str != null) {
            eVar.f48863b = new j(eVar.f48862a.b(str, "userlog"));
        }
        aVar.f28092l.c(str);
        O o10 = aVar.f28093m;
        F f10 = o10.f48343a;
        Charset charset = f0.f870a;
        A.a aVar2 = new A.a();
        aVar2.f636a = "18.6.3";
        C2805a c2805a2 = f10.f48317c;
        String str8 = c2805a2.f48353a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar2.f637b = str8;
        M m10 = f10.f48316b;
        String str9 = ((C2807c) m10.b()).f48364a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar2.f639d = str9;
        aVar2.f640e = ((C2807c) m10.b()).f48365b;
        String str10 = c2805a2.f48358f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar2.f642g = str10;
        String str11 = c2805a2.f48359g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar2.f643h = str11;
        aVar2.f638c = 4;
        G.a aVar3 = new G.a();
        aVar3.f689f = Boolean.FALSE;
        aVar3.f687d = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar3.f685b = str;
        String str12 = F.f48314g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar3.f684a = str12;
        String str13 = m10.f48339c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = ((C2807c) m10.b()).f48364a;
        p264v6.e eVar2 = c2805a2.f48360h;
        if (eVar2.f47656b == null) {
            eVar2.f47656b = new v6.e.a(eVar2);
        }
        v6.e.a aVar4 = eVar2.f47656b;
        String str15 = aVar4.f47657a;
        if (aVar4 == null) {
            eVar2.f47656b = new v6.e.a(eVar2);
        }
        aVar3.f690g = new A6.H(str13, str10, str11, str14, str15, eVar2.f47656b.f47658b);
        Z.a aVar5 = new Z.a();
        aVar5.f811a = 3;
        aVar5.f812b = str2;
        aVar5.f813c = str3;
        aVar5.f814d = Boolean.valueOf(CommonUtils.g());
        aVar3.f692i = aVar5.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) F.f48313f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = CommonUtils.a(f10.f48315a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = CommonUtils.f();
        int iC2 = CommonUtils.c();
        J.a aVar6 = new J.a();
        aVar6.f710a = Integer.valueOf(iIntValue);
        aVar6.f711b = str5;
        aVar6.f712c = Integer.valueOf(iAvailableProcessors2);
        aVar6.f713d = Long.valueOf(jA2);
        aVar6.f714e = Long.valueOf(blockCount2);
        aVar6.f715f = Boolean.valueOf(zF2);
        aVar6.f716g = Integer.valueOf(iC2);
        aVar6.f717h = str6;
        aVar6.f718i = str7;
        aVar3.j = aVar6.a();
        aVar3.f694l = 3;
        aVar2.f644i = aVar3.a();
        A a10 = aVar2.a();
        D6.f fVar = o10.f48344b.f2811b;
        f0.e eVar3 = a10.j;
        if (eVar3 == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String strH = eVar3.h();
        try {
            D6.e.f2807g.getClass();
            D6.e.f(fVar.b(strH, "report"), B6.e.f1594a.a(a10));
            File fileB = fVar.b(strH, "start-time");
            long j = eVar3.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), D6.e.f2805e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public static B b(a aVar) {
        B bC;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : D6.f.e(aVar.f28088g.f2815b.listFiles(f28081r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    bC = p191p5.j.e(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    bC = p191p5.j.c(new z(aVar, j), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(bC);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return p191p5.j.f(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0435  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r37v0, types: [boolean] */
    public final void c(boolean z10, com.google.firebase.crashlytics.internal.settings.a aVar) throws Throwable {
        O o10;
        boolean z11;
        boolean z12;
        String str;
        String strSubstring;
        List<k> listEmptyList;
        ApplicationExitInfo applicationExitInfoA;
        String string;
        List<f0.a.AbstractC0005a> listUnmodifiableList;
        FileInputStream fileInputStream;
        O o11 = this.f28093m;
        ArrayList arrayList = new ArrayList(o11.f48344b.c());
        int i10 = 2;
        if (arrayList.size() <= z10) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str2 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (!aVar.b().f3262b.f3268b || Build.VERSION.SDK_INT < 30) {
            o10 = o11;
            z11 = true;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            List historicalProcessExitReasons = ((ActivityManager) this.f28082a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                D6.f fVar = this.f28088g;
                e eVar = new e(fVar);
                eVar.f48863b = e.f48861c;
                if (str2 != null) {
                    eVar.f48863b = new j(fVar.b(str2, "userlog"));
                }
                g gVar = new g(fVar);
                n nVar = new n(str2, fVar, this.f28086e);
                nVar.f48895d.f48899a.getReference().c(gVar.c(str2, false));
                nVar.f48896e.f48899a.getReference().c(gVar.c(str2, true));
                nVar.f48898g.set(gVar.d(str2), false);
                File fileB = fVar.b(str2, "rollouts-state");
                if (fileB.exists()) {
                    ?? r10 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
                    try {
                        if (r10 == 0) {
                            g.f(fileB);
                            listEmptyList = Collections.emptyList();
                        } else {
                            try {
                                fileInputStream = new FileInputStream(fileB);
                                try {
                                    listEmptyList = g.b(CommonUtils.i(fileInputStream));
                                    listEmptyList.toString();
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                                    r10 = fileInputStream;
                                } catch (Exception unused) {
                                    g.f(fileB);
                                    CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                                    listEmptyList = Collections.emptyList();
                                    r10 = fileInputStream;
                                }
                            } catch (Exception unused2) {
                                fileInputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                r10 = 0;
                                CommonUtils.b(r10, "Failed to close rollouts state file.");
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    g.f(fileB);
                    listEmptyList = Collections.emptyList();
                }
                nVar.f48897f.b(listEmptyList);
                D6.e eVar2 = o11.f48344b;
                long jLastModified = eVar2.f2811b.b(str2, "start-time").lastModified();
                Iterator it = historicalProcessExitReasons.iterator();
                do {
                    if (it.hasNext()) {
                        applicationExitInfoA = R2.h.a(it.next());
                        if (applicationExitInfoA.getTimestamp() < jLastModified) {
                        }
                    }
                    applicationExitInfoA = null;
                    break;
                } while (applicationExitInfoA.getReason() != 6);
                if (applicationExitInfoA == null) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    o10 = o11;
                    z11 = true;
                } else {
                    try {
                        InputStream traceInputStream = applicationExitInfoA.getTraceInputStream();
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i11 = traceInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                                bArr = bArr;
                                string = null;
                            }
                            string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } else {
                            string = null;
                        }
                    } catch (IOException e10) {
                        applicationExitInfoA.toString();
                        e10.toString();
                    }
                    A6.B.a aVar2 = new A6.B.a();
                    aVar2.f658d = Integer.valueOf(applicationExitInfoA.getImportance());
                    String processName = applicationExitInfoA.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar2.f656b = processName;
                    aVar2.f657c = Integer.valueOf(applicationExitInfoA.getReason());
                    aVar2.f661g = Long.valueOf(applicationExitInfoA.getTimestamp());
                    aVar2.f655a = Integer.valueOf(applicationExitInfoA.getPid());
                    aVar2.f659e = Long.valueOf(applicationExitInfoA.getPss());
                    aVar2.f660f = Long.valueOf(applicationExitInfoA.getRss());
                    aVar2.f662h = string;
                    A6.B bA = aVar2.a();
                    F f10 = o11.f48343a;
                    int i12 = f10.f48315a.getResources().getConfiguration().orientation;
                    K.a aVar3 = new K.a();
                    aVar3.f726b = "anr";
                    aVar3.f725a = Long.valueOf(bA.f652g);
                    if (f10.f48319e.b().f3262b.f3269c) {
                        C2805a c2805a = f10.f48317c;
                        if (c2805a.f48355c.size() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = c2805a.f48355c.iterator();
                            while (it2.hasNext()) {
                                C2809e c2809e = (C2809e) it2.next();
                                String str3 = c2809e.f48366a;
                                if (str3 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                Iterator it3 = it2;
                                String str4 = c2809e.f48367b;
                                if (str4 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str5 = c2809e.f48368c;
                                if (str5 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList2.add(new C(str4, str3, str5));
                                it2 = it3;
                                o11 = o11;
                            }
                            o10 = o11;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                        } else {
                            o10 = o11;
                            listUnmodifiableList = null;
                        }
                    } else {
                        o10 = o11;
                        listUnmodifiableList = null;
                    }
                    A6.B.a aVar4 = new A6.B.a();
                    aVar4.f658d = Integer.valueOf(bA.f649d);
                    String str6 = bA.f647b;
                    if (str6 == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar4.f656b = str6;
                    aVar4.f657c = Integer.valueOf(bA.f648c);
                    aVar4.f661g = Long.valueOf(bA.f652g);
                    aVar4.f655a = Integer.valueOf(bA.f646a);
                    aVar4.f659e = Long.valueOf(bA.f650e);
                    aVar4.f660f = Long.valueOf(bA.f651f);
                    aVar4.f662h = bA.f653h;
                    aVar4.f663i = listUnmodifiableList;
                    A6.B bA2 = aVar4.a();
                    Boolean boolValueOf = Boolean.valueOf(bA2.f649d != 100);
                    String processName2 = bA2.f647b;
                    int i13 = bA2.f646a;
                    int i14 = bA2.f649d;
                    i.e(processName2, "processName");
                    T tA = p264v6.h.a(processName2, i13, i14, 8);
                    P p10 = new P("0", "0", 0L);
                    List<f0.e.d.a.b.AbstractC0008a> listA = f10.a();
                    if (listA == null) {
                        throw new NullPointerException("Null binaries");
                    }
                    aVar3.f727c = new L(new A6.M(null, null, bA2, p10, listA), null, null, boolValueOf, tA, null, i12);
                    aVar3.f728d = f10.b(i12);
                    K kA = aVar3.a();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    z11 = true;
                    eVar2.d(O.b(O.a(kA, eVar, nVar), nVar), str2, true);
                }
                i10 = 2;
            } else {
                o10 = o11;
                z11 = true;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        }
        c cVar = this.j;
        if (cVar.c(str2)) {
            Log.isLoggable("FirebaseCrashlytics", i10);
            cVar.a(str2).getClass();
        }
        if (z10 != 0) {
            z12 = false;
            str = (String) arrayList.get(0);
        } else {
            z12 = false;
            this.f28092l.c(null);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        D6.e eVar3 = o10.f48344b;
        D6.f fVar2 = eVar3.f2811b;
        fVar2.getClass();
        File file = fVar2.f2814a;
        D6.f.a(new File(file, ".com.google.firebase.crashlytics"));
        D6.f.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            D6.f.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> navigableSetC = eVar3.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str7 = (String) navigableSetC.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                D6.f.d(new File(fVar2.f2816c, str7));
                navigableSetC.remove(str7);
            }
        }
        for (String str8 : navigableSetC) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            b bVar = D6.e.f2809i;
            File file2 = new File(fVar2.f2816c, str8);
            file2.mkdirs();
            List listE = D6.f.e(file2.listFiles(bVar));
            if (listE.isEmpty()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else {
                Collections.sort(listE);
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = listE.iterator();
                boolean z13 = z12;
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    B6.e eVar4 = D6.e.f2807g;
                    if (!zHasNext) {
                        if (!arrayList3.isEmpty()) {
                            String strD = new g(fVar2).d(str8);
                            C2812h c2812h = eVar3.f2813d.f48377b;
                            synchronized (c2812h) {
                                if (Objects.equals(c2812h.f48374b, str8)) {
                                    strSubstring = c2812h.f48375c;
                                } else {
                                    D6.f fVar3 = c2812h.f48373a;
                                    p190p4.d dVar = C2812h.f48371d;
                                    File file3 = new File(fVar3.f2816c, str8);
                                    file3.mkdirs();
                                    List listE2 = D6.f.e(file3.listFiles(dVar));
                                    strSubstring = listE2.isEmpty() ? null : ((File) Collections.min(listE2, C2812h.f48372e)).getName().substring(4);
                                }
                            }
                            File fileB2 = fVar2.b(str8, "report");
                            try {
                                String strE = D6.e.e(fileB2);
                                eVar4.getClass();
                                A aI = B6.e.i(strE);
                                A.a aVarL = aI.l();
                                f0.e eVar5 = aI.j;
                                if (eVar5 != null) {
                                    G.a aVarM = eVar5.m();
                                    aVarM.f688e = Long.valueOf(jCurrentTimeMillis);
                                    aVarM.f689f = Boolean.valueOf(z13);
                                    if (strD != null) {
                                        aVarM.f691h = new a0(strD);
                                    }
                                    aVarL.f644i = aVarM.a();
                                }
                                A a10 = aVarL.a();
                                A.a aVarL2 = a10.l();
                                aVarL2.f641f = strSubstring;
                                f0.e eVar6 = a10.j;
                                if (eVar6 != null) {
                                    G.a aVarM2 = eVar6.m();
                                    aVarM2.f686c = strSubstring;
                                    aVarL2.f644i = aVarM2.a();
                                }
                                A a11 = aVarL2.a();
                                if (a11.j == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                A.a aVarL3 = a11.l();
                                G.a aVarM3 = a11.j.m();
                                aVarM3.f693k = arrayList3;
                                aVarL3.f644i = aVarM3.a();
                                A a12 = aVarL3.a();
                                f0.e eVar7 = a12.j;
                                if (eVar7 != null) {
                                    try {
                                        Log.isLoggable("FirebaseCrashlytics", 3);
                                        D6.e.f(z13 ? new File(fVar2.f2818e, eVar7.h()) : new File(fVar2.f2817d, eVar7.h()), B6.e.f1594a.a(a12));
                                        break;
                                    } catch (IOException unused3) {
                                        Objects.toString(fileB2);
                                        break;
                                    }
                                }
                            } catch (IOException unused4) {
                            }
                            Objects.toString(fileB2);
                            break;
                            break;
                        }
                    } else {
                        File file4 = (File) it4.next();
                        try {
                            String strE2 = D6.e.e(file4);
                            eVar4.getClass();
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strE2));
                                try {
                                    K kE = B6.e.e(jsonReader);
                                    jsonReader.close();
                                    arrayList3.add(kE);
                                    if (z13) {
                                        z13 = z11;
                                    } else {
                                        String name = file4.getName();
                                        if (name.startsWith("event") && name.endsWith("_")) {
                                            z13 = z11;
                                        } else {
                                            z13 = false;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (IllegalStateException e11) {
                                throw new IOException(e11);
                            }
                        } catch (IOException unused5) {
                            Objects.toString(file4);
                        }
                    }
                }
                D6.f.d(new File(fVar2.f2816c, str8));
                z12 = false;
                z11 = true;
            }
            D6.f.d(new File(fVar2.f2816c, str8));
            z12 = false;
            z11 = true;
        }
        F6.d.b bVar2 = eVar3.f2812c.b().f3261a;
        ArrayList arrayListB = eVar3.b();
        int size = arrayListB.size();
        if (size <= 4) {
            return;
        }
        Iterator it5 = arrayListB.subList(4, size).iterator();
        while (it5.hasNext()) {
            ((File) it5.next()).delete();
        }
    }

    public final void d(com.google.firebase.crashlytics.internal.settings.a aVar) throws Throwable {
        if (!Boolean.TRUE.equals(this.f28086e.f48384d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        H h8 = this.f28094n;
        if (h8 != null && h8.f48324e.get()) {
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            c(true, aVar);
            Log.isLoggable("FirebaseCrashlytics", 2);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
        }
    }

    public final String e() {
        NavigableSet navigableSetC = this.f28093m.f48344b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final void f() {
        InputStream resourceAsStream;
        String strEncodeToString;
        try {
            ClassLoader classLoader = a.class.getClassLoader();
            if (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto")) == null) {
                resourceAsStream = null;
            }
            if (resourceAsStream == null) {
                strEncodeToString = null;
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                }
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            if (strEncodeToString != null) {
                try {
                    this.f28085d.f48896e.a("com.crashlytics.version-control-info", strEncodeToString);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f28082a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        } catch (IOException unused) {
        }
    }

    public final p191p5.g g(B b10) {
        B b11;
        B bE;
        D6.f fVar = this.f28093m.f48344b.f2811b;
        boolean zIsEmpty = D6.f.e(fVar.f2817d.listFiles()).isEmpty();
        h<Boolean> hVar = this.f28095o;
        if (zIsEmpty && D6.f.e(fVar.f2818e.listFiles()).isEmpty() && D6.f.e(fVar.f2819f.listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            hVar.d(Boolean.FALSE);
            return p191p5.j.e(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        I i10 = this.f28083b;
        if (i10.a()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            hVar.d(Boolean.FALSE);
            bE = p191p5.j.e(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            hVar.d(Boolean.TRUE);
            synchronized (i10.f48326b) {
                b11 = i10.f48327c.f45811a;
            }
            p191p5.g gVarQ = b11.q(new s());
            Log.isLoggable("FirebaseCrashlytics", 3);
            B b12 = this.f28096p.f45811a;
            ExecutorService executorService = Q.f48352a;
            h hVar2 = new h();
            r rVar = new r(hVar2);
            gVarQ.h(rVar);
            b12.h(rVar);
            bE = hVar2.f45811a;
        }
        return bE.q(new v(this, b10));
    }
}
