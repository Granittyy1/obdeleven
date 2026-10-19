package p131k5;

import U4.C0804l;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.braze.models.FeatureFlag;
import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C1898s0;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.K5;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zziq;
import com.voltasit.obdeleven.data.providers.u;
import com.voltasit.obdeleven.data.providers.v;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.i;
import p006a5.a;
import p237t3.C2789b;

/* JADX INFO: renamed from: k5.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2527j1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42247b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42249d;

    public /* synthetic */ RunnableC2527j1() {
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0447  */
    /* JADX WARN: Code duplicated, block: B:159:0x045d  */
    /* JADX WARN: Code duplicated, block: B:160:0x045e A[Catch: NotFoundException -> 0x0463, TRY_LEAVE, TryCatch #8 {NotFoundException -> 0x0463, blocks: (B:157:0x0449, B:160:0x045e), top: B:429:0x0449 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0472  */
    /* JADX WARN: Code duplicated, block: B:167:0x0478  */
    /* JADX WARN: Code duplicated, block: B:168:0x0484  */
    /* JADX WARN: Code duplicated, block: B:171:0x048e  */
    /* JADX WARN: Code duplicated, block: B:174:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:176:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:177:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:180:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:182:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:184:0x0508  */
    /* JADX WARN: Code duplicated, block: B:187:0x051e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0553  */
    /* JADX WARN: Code duplicated, block: B:192:0x0561  */
    /* JADX WARN: Code duplicated, block: B:195:0x05af  */
    /* JADX WARN: Code duplicated, block: B:198:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:200:0x05c6 A[PHI: r13 r20
      0x05c6: PHI (r13v13 k5.L0) = (r13v12 k5.L0), (r13v14 k5.L0) binds: [B:202:0x05cf, B:199:0x05c2] A[DONT_GENERATE, DONT_INLINE]
      0x05c6: PHI (r20v6 com.google.android.gms.measurement.internal.zziq) = (r20v5 com.google.android.gms.measurement.internal.zziq), (r20v7 com.google.android.gms.measurement.internal.zziq) binds: [B:202:0x05cf, B:199:0x05c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:206:0x05fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x061d  */
    /* JADX WARN: Code duplicated, block: B:218:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0645  */
    /* JADX WARN: Code duplicated, block: B:254:0x06be A[PHI: r4 r13 r20 r21
      0x06be: PHI (r4v81 java.lang.Class) = 
      (r4v9 java.lang.Class)
      (r4v9 java.lang.Class)
      (r4v9 java.lang.Class)
      (r4v9 java.lang.Class)
      (r4v9 java.lang.Class)
      (r4v9 java.lang.Class)
      (r4v84 java.lang.Class)
      (r4v84 java.lang.Class)
      (r4v84 java.lang.Class)
      (r4v84 java.lang.Class)
      (r4v84 java.lang.Class)
      (r4v84 java.lang.Class)
     binds: [B:245:0x06a3, B:246:0x06a5, B:248:0x06a9, B:250:0x06b1, B:252:0x06bb, B:243:0x0687, B:217:0x0629, B:218:0x062b, B:220:0x062f, B:222:0x0637, B:224:0x0641, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]
      0x06be: PHI (r13v11 k5.L0) = 
      (r13v9 k5.L0)
      (r13v9 k5.L0)
      (r13v9 k5.L0)
      (r13v9 k5.L0)
      (r13v9 k5.L0)
      (r13v9 k5.L0)
      (r13v13 k5.L0)
      (r13v13 k5.L0)
      (r13v13 k5.L0)
      (r13v13 k5.L0)
      (r13v13 k5.L0)
      (r13v13 k5.L0)
     binds: [B:245:0x06a3, B:246:0x06a5, B:248:0x06a9, B:250:0x06b1, B:252:0x06bb, B:243:0x0687, B:217:0x0629, B:218:0x062b, B:220:0x062f, B:222:0x0637, B:224:0x0641, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]
      0x06be: PHI (r20v4 com.google.android.gms.measurement.internal.zziq) = 
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v2 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
      (r20v6 com.google.android.gms.measurement.internal.zziq)
     binds: [B:245:0x06a3, B:246:0x06a5, B:248:0x06a9, B:250:0x06b1, B:252:0x06bb, B:243:0x0687, B:217:0x0629, B:218:0x062b, B:220:0x062f, B:222:0x0637, B:224:0x0641, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]
      0x06be: PHI (r21v8 k5.z3) = 
      (r21v3 k5.z3)
      (r21v3 k5.z3)
      (r21v3 k5.z3)
      (r21v3 k5.z3)
      (r21v3 k5.z3)
      (r21v3 k5.z3)
      (r21v10 k5.z3)
      (r21v10 k5.z3)
      (r21v10 k5.z3)
      (r21v10 k5.z3)
      (r21v10 k5.z3)
      (r21v10 k5.z3)
     binds: [B:245:0x06a3, B:246:0x06a5, B:248:0x06a9, B:250:0x06b1, B:252:0x06bb, B:243:0x0687, B:217:0x0629, B:218:0x062b, B:220:0x062f, B:222:0x0637, B:224:0x0641, B:215:0x060c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:257:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:260:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:262:0x0701  */
    /* JADX WARN: Code duplicated, block: B:267:0x072d  */
    /* JADX WARN: Code duplicated, block: B:272:0x074f  */
    /* JADX WARN: Code duplicated, block: B:274:0x075d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x0779  */
    /* JADX WARN: Code duplicated, block: B:280:0x0787 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:293:0x07cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x0803  */
    /* JADX WARN: Code duplicated, block: B:305:0x080b  */
    /* JADX WARN: Code duplicated, block: B:306:0x080d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0813  */
    /* JADX WARN: Code duplicated, block: B:310:0x0832  */
    /* JADX WARN: Code duplicated, block: B:314:0x0865  */
    /* JADX WARN: Code duplicated, block: B:322:0x089a  */
    /* JADX WARN: Code duplicated, block: B:324:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:326:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:329:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:336:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:339:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:342:0x090a  */
    /* JADX WARN: Code duplicated, block: B:343:0x090e  */
    /* JADX WARN: Code duplicated, block: B:345:0x0920  */
    /* JADX WARN: Code duplicated, block: B:348:0x0930  */
    /* JADX WARN: Code duplicated, block: B:349:0x0936  */
    /* JADX WARN: Code duplicated, block: B:351:0x096f  */
    /* JADX WARN: Code duplicated, block: B:353:0x098b  */
    /* JADX WARN: Code duplicated, block: B:354:0x0999  */
    /* JADX WARN: Code duplicated, block: B:357:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:362:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:370:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:390:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:392:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:396:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:398:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:399:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:401:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:429:0x0449 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:? A[LOOP:2: B:286:0x07a3->B:455:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x029b A[Catch: NameNotFoundException -> 0x02ba, TryCatch #0 {NameNotFoundException -> 0x02ba, blocks: (B:77:0x0290, B:79:0x029b, B:81:0x02a7), top: B:413:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02a7 A[Catch: NameNotFoundException -> 0x02ba, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x02ba, blocks: (B:77:0x0290, B:79:0x029b, B:81:0x02a7), top: B:413:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x02ac  */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x04f3, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        L0 l10;
        String string;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        String str;
        Integer numValueOf;
        String[] stringArray;
        List<String> listAsList;
        B0 b10;
        D0 d10;
        String strW;
        boolean zIsEmpty;
        C2501e c2501e;
        z3 z3Var;
        int i10;
        AtomicInteger atomicInteger;
        C1898s0 c1898s0;
        zziq zziqVarA;
        zziq.zza zzaVar;
        zzip zzipVar;
        C2557r0<Boolean> c2557r0;
        boolean zB;
        long j;
        e eVar;
        L0 l11;
        zziq zziqVar;
        Class cls;
        z3 z3Var2;
        Boolean boolA;
        zziq zziqVar2;
        Bundle bundle;
        P0 p10;
        D3 d11;
        boolean zIsEmpty2;
        Q0 q10;
        String strY;
        String string2;
        String str2;
        Boolean boolValueOf;
        z3 z3Var3;
        boolean z10;
        boolean zH;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean z11;
        Boolean boolA2;
        boolean z12;
        c cVarO;
        Q0 q11;
        c cVarO2;
        boolean z13;
        z3 z3Var4;
        Context context;
        Boolean boolA3;
        boolean zBooleanValue;
        Boolean boolA4;
        Bundle bundle2;
        Boolean boolC;
        Bundle bundle3;
        b bVarA;
        Iterator<zzip> it;
        zzip zzipVarY;
        zzip zzipVarY2;
        zzip zzipVarY3;
        Bundle bundle4;
        Iterator<String> it2;
        String string3;
        String string4;
        switch (this.f42247b) {
            case 0:
                C2523i1 c2523i1 = (C2523i1) this.f42249d;
                C2493c1 c2493c1 = c2523i1.j;
                C2523i1.g(c2493c1);
                c2493c1.p();
                C2560s c2560s = new C2560s(c2523i1);
                c2560s.r();
                c2523i1.f42232v = c2560s;
                G1 g10 = (G1) this.f42248c;
                long j10 = g10.f41801f;
                c cVar = new c(c2523i1);
                cVar.f26559o = 0L;
                cVar.f26560p = null;
                cVar.f26553h = j10;
                cVar.u();
                c2523i1.f42233w = cVar;
                C2573v0 c2573v0 = new C2573v0(c2523i1);
                c2573v0.u();
                c2523i1.f42230t = c2573v0;
                C2587y2 c2587y2 = new C2587y2(c2523i1);
                c2587y2.u();
                c2523i1.f42231u = c2587y2;
                z3 z3Var5 = c2523i1.f42222l;
                if (z3Var5.f41749b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                z3Var5.p();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == 0) {
                        z3Var5.d().f41715i.c("Utils falling back to Random for random id");
                    }
                }
                z3Var5.f42554d.set(jNextLong);
                ((C2523i1) z3Var5.f3968a).f42210G.incrementAndGet();
                z3Var5.f41749b = true;
                L0 l12 = c2523i1.f42219h;
                if (l12.f41749b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences2 = ((C2523i1) l12.f3968a).f42212a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                l12.f41861c = sharedPreferences2;
                boolean z14 = sharedPreferences2.getBoolean("has_been_opened", false);
                l12.f41876s = z14;
                if (!z14) {
                    SharedPreferences.Editor editorEdit = l12.f41861c.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                l12.f41864f = new O0(l12, Math.max(0L, B.f41667e.a(null).longValue()));
                ((C2523i1) l12.f3968a).f42210G.incrementAndGet();
                l12.f41749b = true;
                c cVar2 = c2523i1.f42233w;
                if (cVar2.f42546b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                C2523i1 c2523i2 = (C2523i1) cVar2.f3968a;
                Context context2 = c2523i2.f42212a;
                String strA = c2523i2.f42229s;
                String packageName = context2.getPackageName();
                Context context3 = c2523i2.f42212a;
                PackageManager packageManager = context3.getPackageManager();
                String str3 = "";
                String installerPackageName = "unknown";
                String str4 = "Unknown";
                int i11 = Integer.MIN_VALUE;
                if (packageManager != null) {
                    l10 = l12;
                    try {
                        installerPackageName = packageManager.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused) {
                        cVar2.d().f41712f.b(B0.v(packageName), "Error retrieving app installer package name. appId");
                    }
                    String str5 = installerPackageName;
                    try {
                        if (str5 == null) {
                            str5 = "manual_install";
                        } else {
                            if ("com.android.vending".equals(str5)) {
                                installerPackageName = "";
                            }
                            packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = "Unknown";
                                }
                                try {
                                    str = packageInfo.versionName;
                                    try {
                                        i11 = packageInfo.versionCode;
                                        str4 = str;
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        str4 = str;
                                        cVar2.d().f41712f.a(B0.v(packageName), string, "Error retrieving package info. appId, appName");
                                    }
                                } catch (PackageManager.NameNotFoundException unused3) {
                                }
                            }
                        }
                        packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                string = applicationLabel.toString();
                            } else {
                                string = "Unknown";
                            }
                            str = packageInfo.versionName;
                            i11 = packageInfo.versionCode;
                            str4 = str;
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        string = "Unknown";
                    }
                    installerPackageName = str5;
                    break;
                } else {
                    l10 = l12;
                    cVar2.d().f41712f.b(B0.v(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                }
                String str6 = installerPackageName;
                String str7 = str4;
                int i12 = i11;
                cVar2.f26548c = packageName;
                cVar2.f26551f = str6;
                cVar2.f26549d = str7;
                cVar2.f26550e = i12;
                cVar2.f26552g = 0L;
                String str8 = c2523i2.f42213b;
                boolean z15 = !TextUtils.isEmpty(str8) && "am".equals(c2523i2.f42214c);
                int iL = c2523i2.l();
                switch (iL) {
                    case 0:
                        cVar2.d().f41719n.c("App measurement collection enabled");
                        break;
                    case 1:
                        cVar2.d().f41717l.c("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        cVar2.d().f41719n.c("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        cVar2.d().f41717l.c("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        cVar2.d().f41717l.c("App measurement disabled via the manifest");
                        break;
                    case 5:
                        cVar2.d().f41719n.c("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        cVar2.d().f41716k.c("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        cVar2.d().f41717l.c("App measurement disabled via the global data collection setting");
                        break;
                    case 8:
                        cVar2.d().f41717l.c("App measurement disabled due to denied storage consent");
                        break;
                    default:
                        cVar2.d().f41717l.c("App measurement disabled");
                        cVar2.d().f41713g.c("Invalid scion state in identity");
                        break;
                }
                boolean z16 = iL == 0;
                cVar2.f26556l = "";
                cVar2.f26557m = "";
                if (z15) {
                    cVar2.f26557m = str8;
                }
                try {
                    Resources resources = context3.getResources();
                    int identifier = resources.getIdentifier("google_app_id", FeatureFlag.PROPERTIES_TYPE_STRING, !TextUtils.isEmpty(strA) ? strA : C2498d1.a(context3));
                    if (identifier == 0) {
                        string3 = null;
                    } else {
                        try {
                            string3 = resources.getString(identifier);
                        } catch (Resources.NotFoundException unused5) {
                            string3 = null;
                        }
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        str3 = string3;
                    }
                    cVar2.f26556l = str3;
                    if (!TextUtils.isEmpty(string3)) {
                        Resources resources2 = context3.getResources();
                        if (TextUtils.isEmpty(strA)) {
                            strA = C2498d1.a(context3);
                        }
                        int identifier2 = resources2.getIdentifier("admob_app_id", FeatureFlag.PROPERTIES_TYPE_STRING, strA);
                        if (identifier2 == 0) {
                            string4 = null;
                        } else {
                            try {
                                string4 = resources2.getString(identifier2);
                            } catch (Resources.NotFoundException unused6) {
                                string4 = null;
                            }
                        }
                        cVar2.f26557m = string4;
                    }
                    if (z16) {
                        cVar2.d().f41719n.a(cVar2.f26548c, TextUtils.isEmpty(cVar2.f26556l) ? cVar2.f26557m : cVar2.f26556l, "App measurement enabled for app package, google app id");
                    }
                    break;
                } catch (IllegalStateException e10) {
                    cVar2.d().f41712f.a(B0.v(packageName), e10, "Fetching Google App Id failed with exception. appId");
                }
                cVar2.f26554i = null;
                C2501e c2501e2 = c2523i2.f42218g;
                c2501e2.getClass();
                C0804l.e("analytics.safelisted_events");
                Bundle bundleG = c2501e2.G();
                if (bundleG != null) {
                    if (bundleG.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleG.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf == null) {
                        try {
                            stringArray = ((C2523i1) c2501e2.f3968a).f42212a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            } else {
                                listAsList = null;
                            }
                        } catch (Resources.NotFoundException e11) {
                            c2501e2.d().f41712f.b(e11, "Failed to load string array from metadata: resource not found");
                        }
                        break;
                    } else {
                        listAsList = null;
                    }
                    if (listAsList == null) {
                        cVar2.f26554i = listAsList;
                    } else if (listAsList.isEmpty()) {
                        cVar2.d().f41716k.c("Safelisted event list is empty. Ignoring");
                    } else {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                cVar2.f26554i = listAsList;
                            }
                        } while (cVar2.o().n0("safelisted event", it2.next()));
                    }
                    if (packageManager != null) {
                        cVar2.f26555k = a.c(context3) ? 1 : 0;
                    } else {
                        cVar2.f26555k = 0;
                    }
                    c2523i2.f42210G.incrementAndGet();
                    cVar2.f42546b = true;
                    b10 = c2523i1.f42220i;
                    C2523i1.g(b10);
                    d10 = b10.f41717l;
                    d10.b(87000L, "App measurement initialized, version");
                    C2523i1.g(b10);
                    d10.c("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strW = cVar.w();
                    zIsEmpty = TextUtils.isEmpty(c2523i1.f42213b);
                    c2501e = c2523i1.f42218g;
                    if (zIsEmpty) {
                        z3Var = z3Var5;
                        if (z3Var.r0(strW, c2501e.f42146c)) {
                            C2523i1.g(b10);
                            d10.c("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            C2523i1.g(b10);
                            d10.c("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strW);
                        }
                    } else {
                        z3Var = z3Var5;
                    }
                    C2523i1.g(b10);
                    b10.f41718m.c("Debug-level message logging enabled");
                    i10 = c2523i1.f42208E;
                    atomicInteger = c2523i1.f42210G;
                    if (i10 != atomicInteger.get()) {
                        C2523i1.g(b10);
                        b10.f41712f.a(Integer.valueOf(c2523i1.f42208E), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    c2523i1.f42234x = true;
                    c1898s0 = g10.f41802g;
                    C2493c1 c2493c2 = c2523i1.j;
                    C2523i1.g(c2493c2);
                    c2493c2.p();
                    C1834i5.a();
                    if (c2501e.B(null, B.f41616F0)) {
                        C2523i1.e(z3Var);
                        z3Var.p();
                        if (z3Var.w0() == 1) {
                            z3Var.p();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            C2523i1 c2523i3 = (C2523i1) z3Var.f3968a;
                            p186p0.a.c(c2523i3.f42212a, new A3(c2523i3), intentFilter, 2);
                            z3Var.d().f41718m.c("Registered app receiver");
                        }
                    }
                    C2523i1.e(l10);
                    zziqVarA = l10.A();
                    C1812f4.a();
                    zzaVar = zziq.zza.ANALYTICS_STORAGE;
                    zzipVar = zzip.f26641b;
                    c2557r0 = B.f41654Y0;
                    zB = c2501e.B(null, c2557r0);
                    j = c2523i1.f42211H;
                    eVar = c2523i1.f42226p;
                    int i13 = zziqVarA.f26648b;
                    if (zB) {
                        zzipVarY2 = c2501e.y("google_analytics_default_allow_ad_storage");
                        zzipVarY3 = c2501e.y("google_analytics_default_allow_analytics_storage");
                        if (zzipVarY2 == zzipVar || zzipVarY3 != zzipVar) {
                            l11 = l10;
                            zziqVar = zziqVarA;
                            if (l11.t(-10)) {
                                cls = zziq.zza.class;
                                EnumMap enumMap = new EnumMap(cls);
                                z3Var2 = z3Var;
                                enumMap.put(zziq.zza.AD_STORAGE, zzipVarY2);
                                enumMap.put(zzaVar, zzipVarY3);
                                zziqVar2 = new zziq(enumMap, -10);
                            }
                        } else {
                            l11 = l10;
                            zziqVar = zziqVarA;
                        }
                        cls = zziq.zza.class;
                        z3Var2 = z3Var;
                        if (TextUtils.isEmpty(c2523i1.o().y()) && (i13 == 0 || i13 == 30 || i13 == 10 || i13 == 30 || i13 == 30 || i13 == 40)) {
                            C2523i1.f(eVar);
                            eVar.F(new zziq(-10, null, null), j, false);
                        } else if (TextUtils.isEmpty(c2523i1.o().y()) && c1898s0 != null && (bundle4 = c1898s0.f25840h) != null && l11.t(30)) {
                            zziqVar2 = zziq.d(30, bundle4);
                            if (!zziqVar2.q()) {
                            }
                        }
                        zziqVar2 = null;
                    } else {
                        l11 = l10;
                        zziqVar = zziqVarA;
                        cls = zziq.zza.class;
                        z3Var2 = z3Var;
                        Boolean boolA5 = c2501e.A("google_analytics_default_allow_ad_storage");
                        boolA = c2501e.A("google_analytics_default_allow_analytics_storage");
                        if ((boolA5 != null && boolA == null) || !l11.t(-10)) {
                            if (!TextUtils.isEmpty(c2523i1.o().y()) && (i13 == 0 || i13 == 30 || i13 == 10 || i13 == 30 || i13 == 30 || i13 == 40)) {
                                C2523i1.f(eVar);
                                eVar.F(new zziq(-10, null, null), j, false);
                            } else if (TextUtils.isEmpty(c2523i1.o().y()) && c1898s0 != null && (bundle = c1898s0.f25840h) != null && l11.t(30)) {
                                zziqVar2 = zziq.d(30, bundle);
                                if (!zziqVar2.q()) {
                                }
                            }
                            zziqVar2 = null;
                        }
                    }
                    if (zziqVar2 != null) {
                        C2523i1.f(eVar);
                        eVar.F(zziqVar2, j, c2501e.B(null, B.f41662b1));
                    } else {
                        zziqVar2 = zziqVar;
                    }
                    C2523i1.f(eVar);
                    eVar.E(zziqVar2);
                    C1930w4.a();
                    if (c2501e.B(null, B.f41628L0)) {
                        l11.p();
                        int i14 = b.b(l11.y().getString("dma_consent_settings", null)).f26543a;
                        C1812f4.a();
                        if (c2501e.B(null, c2557r0)) {
                            zzipVarY = c2501e.y("google_analytics_default_allow_ad_user_data");
                            if (zzipVarY == zzipVar && zziq.h(-10, i14)) {
                                C2523i1.f(eVar);
                                EnumMap enumMap2 = new EnumMap(cls);
                                enumMap2.put(zziq.zza.AD_USER_DATA, zzipVarY);
                                eVar.D(new b((EnumMap<zziq.zza, zzip>) enumMap2, -10, (Boolean) null, (String) null), c2501e.B(null, B.f41662b1));
                            } else if (TextUtils.isEmpty(c2523i1.o().y()) && (i14 == 0 || i14 == 30)) {
                                C2523i1.f(eVar);
                                eVar.D(new b((Boolean) null, -10, (Boolean) null, (String) null), c2501e.B(null, B.f41662b1));
                            } else {
                                if (TextUtils.isEmpty(c2523i1.o().y()) && c1898s0 != null && (bundle3 = c1898s0.f25840h) != null && zziq.h(30, i14)) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y()) && c1898s0 != null && (bundle2 = c1898s0.f25840h) != null && l11.f41871n.a() == null && (boolC = b.c(bundle2)) != null) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            }
                        } else {
                            boolA4 = c2501e.A("google_analytics_default_allow_ad_user_data");
                            if (boolA4 == null && zziq.h(-10, i14)) {
                                C2523i1.f(eVar);
                                eVar.D(new b(boolA4, -10, (Boolean) null, (String) null), c2501e.B(null, B.f41662b1));
                            } else if (TextUtils.isEmpty(c2523i1.o().y())) {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            } else {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            }
                        }
                    }
                    ((K5) H5.f25469c.get()).getClass();
                    if (c2501e.B(null, B.f41648V0)) {
                        boolA3 = c2501e.A("google_analytics_tcf_data_enabled");
                        if (boolA3 == null) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = boolA3.booleanValue();
                        }
                        if (zBooleanValue) {
                            C2523i1.g(b10);
                            b10.f41718m.c("TCF client enabled.");
                            C2523i1.f(eVar);
                            eVar.p();
                            eVar.d().f41718m.c("Register tcfPrefChangeListener.");
                            if (eVar.f26584q == null) {
                                eVar.f26585r = new W1(eVar, (C2523i1) eVar.f3968a);
                                O1 o10 = new O1();
                                o10.f41936a = eVar;
                                eVar.f26584q = o10;
                            }
                            eVar.n().w().registerOnSharedPreferenceChangeListener(eVar.f26584q);
                            C2523i1.f(eVar);
                            eVar.R();
                        }
                    }
                    p10 = l11.f41865g;
                    if (p10.a() == 0) {
                        C2523i1.g(b10);
                        b10.f41719n.b(Long.valueOf(j), "Persisting first open");
                        p10.b(j);
                    }
                    C2523i1.f(eVar);
                    d11 = eVar.f26581n;
                    if (d11.b() && d11.c()) {
                        L0 l13 = d11.f41754a.f42219h;
                        C2523i1.e(l13);
                        l13.f41881x.b(null);
                    }
                    if (!c2523i1.j()) {
                        z3 z3Var6 = z3Var2;
                        zIsEmpty2 = TextUtils.isEmpty(c2523i1.o().y());
                        q10 = l11.f41866h;
                        if (zIsEmpty2) {
                            cVarO2 = c2523i1.o();
                            cVarO2.t();
                            if (!TextUtils.isEmpty(cVarO2.f26557m)) {
                                c2523i1.s();
                                strY = c2523i1.o().y();
                                l11.p();
                                string2 = l11.y().getString("gmp_app_id", null);
                                c cVarO3 = c2523i1.o();
                                cVarO3.t();
                                str2 = cVarO3.f26557m;
                                l11.p();
                                if (z3.d0(strY, string2, str2, l11.y().getString("admob_app_id", null))) {
                                    C2523i1.g(b10);
                                    b10.f41717l.c("Rechecking which service to use due to a GMP App Id change");
                                    l11.p();
                                    l11.p();
                                    if (l11.y().contains("measurement_enabled")) {
                                        boolValueOf = Boolean.valueOf(l11.y().getBoolean("measurement_enabled", true));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    SharedPreferences.Editor editorEdit2 = l11.y().edit();
                                    editorEdit2.clear();
                                    editorEdit2.apply();
                                    if (boolValueOf != null) {
                                        l11.p();
                                        SharedPreferences.Editor editorEdit3 = l11.y().edit();
                                        editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                        editorEdit3.apply();
                                    }
                                    c2523i1.p().z();
                                    c2523i1.f42231u.D();
                                    c2523i1.f42231u.C();
                                    p10.b(j);
                                    q10.b(null);
                                }
                                String strY2 = c2523i1.o().y();
                                l11.p();
                                SharedPreferences.Editor editorEdit4 = l11.y().edit();
                                editorEdit4.putString("gmp_app_id", strY2);
                                editorEdit4.apply();
                                c cVarO4 = c2523i1.o();
                                cVarO4.t();
                                String str9 = cVarO4.f26557m;
                                l11.p();
                                SharedPreferences.Editor editorEdit5 = l11.y().edit();
                                editorEdit5.putString("admob_app_id", str9);
                                editorEdit5.apply();
                            }
                        } else {
                            c2523i1.s();
                            strY = c2523i1.o().y();
                            l11.p();
                            string2 = l11.y().getString("gmp_app_id", null);
                            c cVarO5 = c2523i1.o();
                            cVarO5.t();
                            str2 = cVarO5.f26557m;
                            l11.p();
                            if (z3.d0(strY, string2, str2, l11.y().getString("admob_app_id", null))) {
                                C2523i1.g(b10);
                                b10.f41717l.c("Rechecking which service to use due to a GMP App Id change");
                                l11.p();
                                l11.p();
                                if (l11.y().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(l11.y().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit6 = l11.y().edit();
                                editorEdit6.clear();
                                editorEdit6.apply();
                                if (boolValueOf != null) {
                                    l11.p();
                                    SharedPreferences.Editor editorEdit7 = l11.y().edit();
                                    editorEdit7.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit7.apply();
                                }
                                c2523i1.p().z();
                                c2523i1.f42231u.D();
                                c2523i1.f42231u.C();
                                p10.b(j);
                                q10.b(null);
                            }
                            String strY3 = c2523i1.o().y();
                            l11.p();
                            SharedPreferences.Editor editorEdit8 = l11.y().edit();
                            editorEdit8.putString("gmp_app_id", strY3);
                            editorEdit8.apply();
                            c cVarO6 = c2523i1.o();
                            cVarO6.t();
                            String str10 = cVarO6.f26557m;
                            l11.p();
                            SharedPreferences.Editor editorEdit9 = l11.y().edit();
                            editorEdit9.putString("admob_app_id", str10);
                            editorEdit9.apply();
                        }
                        if (!l11.A().i(zzaVar)) {
                            q10.b(null);
                        }
                        C2523i1.f(eVar);
                        eVar.J(q10.a());
                        C2523i1.e(z3Var6);
                        z3Var3 = z3Var6;
                        try {
                            ((C2523i1) z3Var3.f3968a).f42212a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            z10 = true;
                        } catch (ClassNotFoundException unused7) {
                            z10 = false;
                        }
                        if (!z10) {
                            q11 = l11.f41880w;
                            if (!TextUtils.isEmpty(q11.a())) {
                                C2523i1.g(b10);
                                b10.f41715i.c("Remote config removed with active feature rollouts");
                                q11.b(null);
                            }
                        }
                        if (TextUtils.isEmpty(c2523i1.o().y())) {
                            cVarO = c2523i1.o();
                            cVarO.t();
                            if (!TextUtils.isEmpty(cVarO.f26557m)) {
                            }
                            C1834i5.a();
                            if (c2501e.B(null, B.f41616F0)) {
                                C2523i1.e(z3Var3);
                                z3Var3.p();
                                if (z3Var3.w0() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = z11;
                                }
                                if (z13) {
                                    C2523i1.f(eVar);
                                    RunnableC2518h1 runnableC2518h1 = new RunnableC2518h1();
                                    runnableC2518h1.f42193b = eVar;
                                    new Thread(runnableC2518h1).start();
                                }
                            }
                            l11.f41873p.a(true);
                            return;
                        }
                        zH = c2523i1.h();
                        sharedPreferences = l11.f41861c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (zContains) {
                            c2501e = c2501e;
                        } else {
                            c2501e = c2501e;
                            boolA2 = c2501e.A("firebase_analytics_collection_deactivated");
                            if (boolA2 == null && boolA2.booleanValue()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                l11.v(!zH);
                            }
                        }
                        if (zH) {
                            C2523i1.f(eVar);
                            eVar.O();
                        }
                        Y2 y10 = c2523i1.f42221k;
                        C2523i1.f(y10);
                        y10.f42062e.a();
                        c2523i1.r().y(new AtomicReference<>());
                        C2587y2 c2587y2R = c2523i1.r();
                        Bundle bundleA = l11.f41883z.a();
                        c2587y2R.p();
                        c2587y2R.t();
                        z11 = false;
                        c2587y2R.w(new RunnableC2582x1(c2587y2R, c2587y2R.J(false), bundleA, 1));
                        C1834i5.a();
                        if (c2501e.B(null, B.f41616F0)) {
                            C2523i1.e(z3Var3);
                            z3Var3.p();
                            if (z3Var3.w0() == 1) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            if (z13) {
                                C2523i1.f(eVar);
                                RunnableC2518h1 runnableC2518h2 = new RunnableC2518h1();
                                runnableC2518h2.f42193b = eVar;
                                new Thread(runnableC2518h2).start();
                            }
                        }
                        l11.f41873p.a(true);
                        return;
                    }
                    if (c2523i1.h()) {
                        C2523i1.e(z3Var2);
                        z3Var4 = z3Var2;
                        if (!z3Var4.s0("android.permission.INTERNET")) {
                            C2523i1.g(b10);
                            b10.f41712f.c("App is missing INTERNET permission");
                        }
                        if (!z3Var4.s0("android.permission.ACCESS_NETWORK_STATE")) {
                            C2523i1.g(b10);
                            b10.f41712f.c("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        context = c2523i1.f42212a;
                        if (!p006a5.c.a(context).c() && !c2501e.F()) {
                            if (!z3.X(context)) {
                                C2523i1.g(b10);
                                b10.f41712f.c("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!z3.p0(context)) {
                                C2523i1.g(b10);
                                b10.f41712f.c("AppMeasurementService not registered/enabled");
                            }
                        }
                        C2523i1.g(b10);
                        b10.f41712f.c("Uploading is not possible. App measurement disabled");
                        z3Var3 = z3Var4;
                    } else {
                        z3Var3 = z3Var2;
                    }
                    z11 = false;
                    C1834i5.a();
                    if (c2501e.B(null, B.f41616F0)) {
                        C2523i1.e(z3Var3);
                        z3Var3.p();
                        if (z3Var3.w0() == 1) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        if (z13) {
                            C2523i1.f(eVar);
                            RunnableC2518h1 runnableC2518h3 = new RunnableC2518h1();
                            runnableC2518h3.f42193b = eVar;
                            new Thread(runnableC2518h3).start();
                        }
                    }
                    l11.f41873p.a(true);
                    return;
                }
                c2501e2.d().f41712f.c("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf == null) {
                    stringArray = ((C2523i1) c2501e2.f3968a).f42212a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    } else {
                        listAsList = null;
                    }
                    break;
                } else {
                    listAsList = null;
                }
                if (listAsList == null) {
                    cVar2.f26554i = listAsList;
                } else if (listAsList.isEmpty()) {
                    cVar2.d().f41716k.c("Safelisted event list is empty. Ignoring");
                } else {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            cVar2.f26554i = listAsList;
                        }
                    } while (cVar2.o().n0("safelisted event", it2.next()));
                }
                if (packageManager != null) {
                    cVar2.f26555k = a.c(context3) ? 1 : 0;
                } else {
                    cVar2.f26555k = 0;
                }
                c2523i2.f42210G.incrementAndGet();
                cVar2.f42546b = true;
                b10 = c2523i1.f42220i;
                C2523i1.g(b10);
                d10 = b10.f41717l;
                d10.b(87000L, "App measurement initialized, version");
                C2523i1.g(b10);
                d10.c("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strW = cVar.w();
                zIsEmpty = TextUtils.isEmpty(c2523i1.f42213b);
                c2501e = c2523i1.f42218g;
                if (zIsEmpty) {
                    z3Var = z3Var5;
                    if (z3Var.r0(strW, c2501e.f42146c)) {
                        C2523i1.g(b10);
                        d10.c("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        C2523i1.g(b10);
                        d10.c("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strW);
                    }
                } else {
                    z3Var = z3Var5;
                }
                C2523i1.g(b10);
                b10.f41718m.c("Debug-level message logging enabled");
                i10 = c2523i1.f42208E;
                atomicInteger = c2523i1.f42210G;
                if (i10 != atomicInteger.get()) {
                    C2523i1.g(b10);
                    b10.f41712f.a(Integer.valueOf(c2523i1.f42208E), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                c2523i1.f42234x = true;
                c1898s0 = g10.f41802g;
                C2493c1 c2493c3 = c2523i1.j;
                C2523i1.g(c2493c3);
                c2493c3.p();
                C1834i5.a();
                if (c2501e.B(null, B.f41616F0)) {
                    C2523i1.e(z3Var);
                    z3Var.p();
                    if (z3Var.w0() == 1) {
                        z3Var.p();
                        IntentFilter intentFilter2 = new IntentFilter();
                        intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        C2523i1 c2523i4 = (C2523i1) z3Var.f3968a;
                        p186p0.a.c(c2523i4.f42212a, new A3(c2523i4), intentFilter2, 2);
                        z3Var.d().f41718m.c("Registered app receiver");
                    }
                }
                C2523i1.e(l10);
                zziqVarA = l10.A();
                C1812f4.a();
                zzaVar = zziq.zza.ANALYTICS_STORAGE;
                zzipVar = zzip.f26641b;
                c2557r0 = B.f41654Y0;
                zB = c2501e.B(null, c2557r0);
                j = c2523i1.f42211H;
                eVar = c2523i1.f42226p;
                int i15 = zziqVarA.f26648b;
                if (zB) {
                    zzipVarY2 = c2501e.y("google_analytics_default_allow_ad_storage");
                    zzipVarY3 = c2501e.y("google_analytics_default_allow_analytics_storage");
                    if (zzipVarY2 == zzipVar) {
                        l11 = l10;
                        zziqVar = zziqVarA;
                        if (l11.t(-10)) {
                            cls = zziq.zza.class;
                            EnumMap enumMap3 = new EnumMap(cls);
                            z3Var2 = z3Var;
                            enumMap3.put(zziq.zza.AD_STORAGE, zzipVarY2);
                            enumMap3.put(zzaVar, zzipVarY3);
                            zziqVar2 = new zziq(enumMap3, -10);
                        } else {
                            cls = zziq.zza.class;
                            z3Var2 = z3Var;
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    zziqVar2 = null;
                                } else {
                                    zziqVar2 = null;
                                }
                            } else if (TextUtils.isEmpty(c2523i1.o().y())) {
                                zziqVar2 = null;
                            } else {
                                zziqVar2 = null;
                            }
                        }
                    } else {
                        l11 = l10;
                        zziqVar = zziqVarA;
                        if (l11.t(-10)) {
                            cls = zziq.zza.class;
                            EnumMap enumMap4 = new EnumMap(cls);
                            z3Var2 = z3Var;
                            enumMap4.put(zziq.zza.AD_STORAGE, zzipVarY2);
                            enumMap4.put(zzaVar, zzipVarY3);
                            zziqVar2 = new zziq(enumMap4, -10);
                        } else {
                            cls = zziq.zza.class;
                            z3Var2 = z3Var;
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    zziqVar2 = null;
                                } else {
                                    zziqVar2 = null;
                                }
                            } else if (TextUtils.isEmpty(c2523i1.o().y())) {
                                zziqVar2 = null;
                            } else {
                                zziqVar2 = null;
                            }
                        }
                    }
                } else {
                    l11 = l10;
                    zziqVar = zziqVarA;
                    cls = zziq.zza.class;
                    z3Var2 = z3Var;
                    Boolean boolA6 = c2501e.A("google_analytics_default_allow_ad_storage");
                    boolA = c2501e.A("google_analytics_default_allow_analytics_storage");
                    zziqVar2 = boolA6 != null ? new zziq(-10, boolA6, boolA) : new zziq(-10, boolA6, boolA);
                }
                if (zziqVar2 != null) {
                    C2523i1.f(eVar);
                    eVar.F(zziqVar2, j, c2501e.B(null, B.f41662b1));
                } else {
                    zziqVar2 = zziqVar;
                }
                C2523i1.f(eVar);
                eVar.E(zziqVar2);
                C1930w4.a();
                if (c2501e.B(null, B.f41628L0)) {
                    l11.p();
                    int i16 = b.b(l11.y().getString("dma_consent_settings", null)).f26543a;
                    C1812f4.a();
                    if (c2501e.B(null, c2557r0)) {
                        zzipVarY = c2501e.y("google_analytics_default_allow_ad_user_data");
                        if (zzipVarY == zzipVar) {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            } else {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            }
                        } else if (TextUtils.isEmpty(c2523i1.o().y())) {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                bVarA = b.a(30, bundle3);
                                it = bVarA.f26547e.values().iterator();
                                while (it.hasNext()) {
                                    if (it.next() != zzipVar) {
                                        C2523i1.f(eVar);
                                        eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                C2523i1.f(eVar);
                                eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                            }
                        } else {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                bVarA = b.a(30, bundle3);
                                it = bVarA.f26547e.values().iterator();
                                while (it.hasNext()) {
                                    if (it.next() != zzipVar) {
                                        C2523i1.f(eVar);
                                        eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                C2523i1.f(eVar);
                                eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                            }
                        }
                    } else {
                        boolA4 = c2501e.A("google_analytics_default_allow_ad_user_data");
                        if (boolA4 == null) {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            } else {
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    bVarA = b.a(30, bundle3);
                                    it = bVarA.f26547e.values().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != zzipVar) {
                                            C2523i1.f(eVar);
                                            eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(c2523i1.o().y())) {
                                    C2523i1.f(eVar);
                                    eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                                }
                            }
                        } else if (TextUtils.isEmpty(c2523i1.o().y())) {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                bVarA = b.a(30, bundle3);
                                it = bVarA.f26547e.values().iterator();
                                while (it.hasNext()) {
                                    if (it.next() != zzipVar) {
                                        C2523i1.f(eVar);
                                        eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                C2523i1.f(eVar);
                                eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                            }
                        } else {
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                bVarA = b.a(30, bundle3);
                                it = bVarA.f26547e.values().iterator();
                                while (it.hasNext()) {
                                    if (it.next() != zzipVar) {
                                        C2523i1.f(eVar);
                                        eVar.D(bVarA, c2501e.B(null, B.f41662b1));
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(c2523i1.o().y())) {
                                C2523i1.f(eVar);
                                eVar.M(c1898s0.f25838f, "allow_personalized_ads", boolC.toString(), false);
                            }
                        }
                    }
                }
                ((K5) H5.f25469c.get()).getClass();
                if (c2501e.B(null, B.f41648V0)) {
                    boolA3 = c2501e.A("google_analytics_tcf_data_enabled");
                    if (boolA3 == null) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = boolA3.booleanValue();
                    }
                    if (zBooleanValue) {
                        C2523i1.g(b10);
                        b10.f41718m.c("TCF client enabled.");
                        C2523i1.f(eVar);
                        eVar.p();
                        eVar.d().f41718m.c("Register tcfPrefChangeListener.");
                        if (eVar.f26584q == null) {
                            eVar.f26585r = new W1(eVar, (C2523i1) eVar.f3968a);
                            O1 o11 = new O1();
                            o11.f41936a = eVar;
                            eVar.f26584q = o11;
                        }
                        eVar.n().w().registerOnSharedPreferenceChangeListener(eVar.f26584q);
                        C2523i1.f(eVar);
                        eVar.R();
                    }
                }
                p10 = l11.f41865g;
                if (p10.a() == 0) {
                    C2523i1.g(b10);
                    b10.f41719n.b(Long.valueOf(j), "Persisting first open");
                    p10.b(j);
                }
                C2523i1.f(eVar);
                d11 = eVar.f26581n;
                if (d11.b()) {
                    L0 l14 = d11.f41754a.f42219h;
                    C2523i1.e(l14);
                    l14.f41881x.b(null);
                }
                if (!c2523i1.j()) {
                    z3 z3Var7 = z3Var2;
                    zIsEmpty2 = TextUtils.isEmpty(c2523i1.o().y());
                    q10 = l11.f41866h;
                    if (zIsEmpty2) {
                        cVarO2 = c2523i1.o();
                        cVarO2.t();
                        if (!TextUtils.isEmpty(cVarO2.f26557m)) {
                            c2523i1.s();
                            strY = c2523i1.o().y();
                            l11.p();
                            string2 = l11.y().getString("gmp_app_id", null);
                            c cVarO7 = c2523i1.o();
                            cVarO7.t();
                            str2 = cVarO7.f26557m;
                            l11.p();
                            if (z3.d0(strY, string2, str2, l11.y().getString("admob_app_id", null))) {
                                C2523i1.g(b10);
                                b10.f41717l.c("Rechecking which service to use due to a GMP App Id change");
                                l11.p();
                                l11.p();
                                if (l11.y().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(l11.y().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit10 = l11.y().edit();
                                editorEdit10.clear();
                                editorEdit10.apply();
                                if (boolValueOf != null) {
                                    l11.p();
                                    SharedPreferences.Editor editorEdit11 = l11.y().edit();
                                    editorEdit11.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit11.apply();
                                }
                                c2523i1.p().z();
                                c2523i1.f42231u.D();
                                c2523i1.f42231u.C();
                                p10.b(j);
                                q10.b(null);
                            }
                            String strY4 = c2523i1.o().y();
                            l11.p();
                            SharedPreferences.Editor editorEdit12 = l11.y().edit();
                            editorEdit12.putString("gmp_app_id", strY4);
                            editorEdit12.apply();
                            c cVarO8 = c2523i1.o();
                            cVarO8.t();
                            String str11 = cVarO8.f26557m;
                            l11.p();
                            SharedPreferences.Editor editorEdit13 = l11.y().edit();
                            editorEdit13.putString("admob_app_id", str11);
                            editorEdit13.apply();
                        }
                    } else {
                        c2523i1.s();
                        strY = c2523i1.o().y();
                        l11.p();
                        string2 = l11.y().getString("gmp_app_id", null);
                        c cVarO9 = c2523i1.o();
                        cVarO9.t();
                        str2 = cVarO9.f26557m;
                        l11.p();
                        if (z3.d0(strY, string2, str2, l11.y().getString("admob_app_id", null))) {
                            C2523i1.g(b10);
                            b10.f41717l.c("Rechecking which service to use due to a GMP App Id change");
                            l11.p();
                            l11.p();
                            if (l11.y().contains("measurement_enabled")) {
                                boolValueOf = Boolean.valueOf(l11.y().getBoolean("measurement_enabled", true));
                            } else {
                                boolValueOf = null;
                            }
                            SharedPreferences.Editor editorEdit14 = l11.y().edit();
                            editorEdit14.clear();
                            editorEdit14.apply();
                            if (boolValueOf != null) {
                                l11.p();
                                SharedPreferences.Editor editorEdit15 = l11.y().edit();
                                editorEdit15.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                editorEdit15.apply();
                            }
                            c2523i1.p().z();
                            c2523i1.f42231u.D();
                            c2523i1.f42231u.C();
                            p10.b(j);
                            q10.b(null);
                        }
                        String strY5 = c2523i1.o().y();
                        l11.p();
                        SharedPreferences.Editor editorEdit16 = l11.y().edit();
                        editorEdit16.putString("gmp_app_id", strY5);
                        editorEdit16.apply();
                        c cVarO10 = c2523i1.o();
                        cVarO10.t();
                        String str12 = cVarO10.f26557m;
                        l11.p();
                        SharedPreferences.Editor editorEdit17 = l11.y().edit();
                        editorEdit17.putString("admob_app_id", str12);
                        editorEdit17.apply();
                    }
                    if (!l11.A().i(zzaVar)) {
                        q10.b(null);
                    }
                    C2523i1.f(eVar);
                    eVar.J(q10.a());
                    C2523i1.e(z3Var7);
                    z3Var3 = z3Var7;
                    ((C2523i1) z3Var3.f3968a).f42212a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    z10 = true;
                    if (!z10) {
                        q11 = l11.f41880w;
                        if (!TextUtils.isEmpty(q11.a())) {
                            C2523i1.g(b10);
                            b10.f41715i.c("Remote config removed with active feature rollouts");
                            q11.b(null);
                        }
                    }
                    if (TextUtils.isEmpty(c2523i1.o().y())) {
                        cVarO = c2523i1.o();
                        cVarO.t();
                        if (!TextUtils.isEmpty(cVarO.f26557m)) {
                        }
                        C1834i5.a();
                        if (c2501e.B(null, B.f41616F0)) {
                            C2523i1.e(z3Var3);
                            z3Var3.p();
                            if (z3Var3.w0() == 1) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            if (z13) {
                                C2523i1.f(eVar);
                                RunnableC2518h1 runnableC2518h4 = new RunnableC2518h1();
                                runnableC2518h4.f42193b = eVar;
                                new Thread(runnableC2518h4).start();
                            }
                        }
                        l11.f41873p.a(true);
                        return;
                    }
                    zH = c2523i1.h();
                    sharedPreferences = l11.f41861c;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (zContains) {
                        c2501e = c2501e;
                        boolA2 = c2501e.A("firebase_analytics_collection_deactivated");
                        if (boolA2 == null) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            l11.v(!zH);
                        }
                    } else {
                        c2501e = c2501e;
                    }
                    if (zH) {
                        C2523i1.f(eVar);
                        eVar.O();
                    }
                    Y2 y11 = c2523i1.f42221k;
                    C2523i1.f(y11);
                    y11.f42062e.a();
                    c2523i1.r().y(new AtomicReference<>());
                    C2587y2 c2587y2R2 = c2523i1.r();
                    Bundle bundleA2 = l11.f41883z.a();
                    c2587y2R2.p();
                    c2587y2R2.t();
                    z11 = false;
                    c2587y2R2.w(new RunnableC2582x1(c2587y2R2, c2587y2R2.J(false), bundleA2, 1));
                    C1834i5.a();
                    if (c2501e.B(null, B.f41616F0)) {
                        C2523i1.e(z3Var3);
                        z3Var3.p();
                        if (z3Var3.w0() == 1) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        if (z13) {
                            C2523i1.f(eVar);
                            RunnableC2518h1 runnableC2518h5 = new RunnableC2518h1();
                            runnableC2518h5.f42193b = eVar;
                            new Thread(runnableC2518h5).start();
                        }
                    }
                    l11.f41873p.a(true);
                    return;
                }
                if (c2523i1.h()) {
                    C2523i1.e(z3Var2);
                    z3Var4 = z3Var2;
                    if (!z3Var4.s0("android.permission.INTERNET")) {
                        C2523i1.g(b10);
                        b10.f41712f.c("App is missing INTERNET permission");
                    }
                    if (!z3Var4.s0("android.permission.ACCESS_NETWORK_STATE")) {
                        C2523i1.g(b10);
                        b10.f41712f.c("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    context = c2523i1.f42212a;
                    if (!p006a5.c.a(context).c()) {
                        if (!z3.X(context)) {
                            C2523i1.g(b10);
                            b10.f41712f.c("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!z3.p0(context)) {
                            C2523i1.g(b10);
                            b10.f41712f.c("AppMeasurementService not registered/enabled");
                        }
                    }
                    C2523i1.g(b10);
                    b10.f41712f.c("Uploading is not possible. App measurement disabled");
                    z3Var3 = z3Var4;
                } else {
                    z3Var3 = z3Var2;
                }
                z11 = false;
                C1834i5.a();
                if (c2501e.B(null, B.f41616F0)) {
                    C2523i1.e(z3Var3);
                    z3Var3.p();
                    if (z3Var3.w0() == 1) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if (z13) {
                        C2523i1.f(eVar);
                        RunnableC2518h1 runnableC2518h6 = new RunnableC2518h1();
                        runnableC2518h6.f42193b = eVar;
                        new Thread(runnableC2518h6).start();
                    }
                }
                l11.f41873p.a(true);
                return;
            case 1:
                e eVar2 = (e) this.f42248c;
                Bundle bundle5 = (Bundle) this.f42249d;
                if (bundle5 == null) {
                    eVar2.n().f41883z.b(new Bundle());
                    return;
                }
                Bundle bundleA3 = eVar2.n().f41883z.a();
                Iterator<String> it3 = bundle5.keySet().iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    P3.b bVar = eVar2.f26586s;
                    C2523i1 c2523i5 = (C2523i1) eVar2.f3968a;
                    if (!zHasNext) {
                        eVar2.o();
                        int i17 = c2523i5.f42218g.o().h0(201500000) ? 100 : 25;
                        if (bundleA3.size() > i17) {
                            int i18 = 0;
                            for (String str13 : new TreeSet(bundleA3.keySet())) {
                                i18++;
                                if (i18 > i17) {
                                    bundleA3.remove(str13);
                                }
                            }
                            eVar2.o();
                            z3.U(bVar, null, 26, null, null, 0);
                            eVar2.d().f41716k.c("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        eVar2.n().f41883z.b(bundleA3);
                        C2587y2 c2587y2R3 = c2523i5.r();
                        c2587y2R3.p();
                        c2587y2R3.t();
                        c2587y2R3.w(new RunnableC2582x1(c2587y2R3, c2587y2R3.J(false), bundleA3, 1));
                        return;
                    }
                    String next = it3.next();
                    Object obj = bundle5.get(next);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        eVar2.o();
                        if (z3.Z(obj)) {
                            eVar2.o();
                            z3.U(bVar, null, 27, null, null, 0);
                        }
                        eVar2.d().f41716k.a(next, obj, "Invalid default event parameter type. Name, value");
                    } else if (z3.v0(next)) {
                        eVar2.d().f41716k.b(next, "Invalid default event parameter name. Name");
                    } else if (obj == null) {
                        bundleA3.remove(next);
                    } else if (eVar2.o().c0("param", next, c2523i5.f42218g.r(null, false), obj)) {
                        eVar2.o().J(bundleA3, next, obj);
                    }
                }
                break;
            default:
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.a billingResult = com.android.billingclient.api.b.f23566i;
                ((C2789b) this.f42248c).y(7, billingResult, zzieVar);
                zzbt zzbtVarG = zzbt.G();
                zzbt.G();
                v vVar = (v) this.f42249d;
                i.e(billingResult, "billingResult");
                i.d(zzbtVarG, "getProductDetailsList(...)");
                vVar.f30291a.resumeWith(new u.a(billingResult, zzbtVarG));
                return;
        }
    }

    public /* synthetic */ RunnableC2527j1(C2789b c2789b, v vVar) {
        this.f42248c = c2789b;
        this.f42249d = vVar;
    }

    public RunnableC2527j1(C2523i1 c2523i1, G1 g10) {
        this.f42248c = g10;
        this.f42249d = c2523i1;
    }
}
