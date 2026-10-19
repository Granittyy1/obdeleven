package D7;

import A1.C0571f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.C1403v;
import com.braze.models.FeatureFlag;
import com.google.android.gms.internal.measurement.Y;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.gson.JsonIOException;
import com.parse.ParseException;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p091h2.B;
import p097h9.u;
import p131k5.RunnableC2514g2;
import p220r9.J;
import p220r9.M;
import p220r9.P;
import p302y6.C2805a;
import p302y6.C2809e;
import p302y6.C2810f;
import p302y6.C2813i;
import p302y6.C2818n;
import p302y6.C2820p;
import p302y6.D;
import p302y6.E;
import p302y6.H;
import p302y6.I;
import p302y6.L;
import p302y6.O;
import p302y6.Q;
import p302y6.y;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements p191p5.f, p183oa.b, com.google.gson.internal.f, M.b, k1.g.b, w9.d.b, p191p5.e, p228s6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2849b;

    public /* synthetic */ i(Object obj) {
        this.f2849b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((p191p5.h) this.f2849b).b(obj);
    }

    @Override // r9.M.b
    public void b(int i10) {
        p073f9.k kVar = (p073f9.k) this.f2849b;
        if (i10 < 0) {
            kVar.getClass();
            return;
        }
        f9.k.a aVar = (f9.k.a) kVar.f35053E.f36779a.get(i10);
        aVar.f35059c.f34189a.setVisible(!aVar.f35059c.f34189a.isVisible());
        kVar.f35053E.notifyDataSetChanged();
        if (kVar.f35013t != 1) {
            kVar.f35005l.getLineData().notifyDataChanged();
            kVar.f35005l.notifyDataSetChanged();
            kVar.f35005l.invalidate();
        }
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        return p191p5.j.e((ConfigFetchHandler.a) this.f2849b);
    }

    @Override // k1.g.b
    public void d(long j, p114j1.r rVar) {
        C0571f.a(j, rVar, ((B) this.f2849b).f35762b);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0307  */
    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        String str;
        String str2;
        int i10;
        String str3;
        boolean z10;
        C2805a c2805a;
        String str4;
        com.google.firebase.crashlytics.internal.settings.a aVar;
        ExecutorService executorService;
        boolean z11;
        int i11;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        int i12 = CrashlyticsRegistrar.f28073a;
        ((CrashlyticsRegistrar) this.f2849b).getClass();
        p144l6.e eVar = (p144l6.e) qVar.a(p144l6.e.class);
        p096h7.a aVarH = qVar.h(p264v6.a.class);
        p096h7.a aVarH2 = qVar.h(p192p6.a.class);
        p108i7.c cVar = (p108i7.c) qVar.a(p108i7.c.class);
        p096h7.a aVarH3 = qVar.h(F7.a.class);
        eVar.a();
        Context context = eVar.f44388a;
        String packageName = context.getPackageName();
        D6.f fVar = new D6.f(context);
        I i13 = new I(eVar);
        p302y6.M m7 = new p302y6.M(context, packageName, cVar, i13);
        p264v6.c cVar2 = new p264v6.c(aVarH);
        p252u6.a aVar2 = new p252u6.a(aVarH2);
        ExecutorService executorServiceA = L.a("Crashlytics Exception Handler");
        C2813i c2813i = new C2813i(i13, fVar);
        com.google.firebase.sessions.api.a aVar3 = com.google.firebase.sessions.api.a.f28674a;
        SessionSubscriber.Name name = SessionSubscriber.Name.f28670b;
        com.google.firebase.sessions.api.a aVar4 = com.google.firebase.sessions.api.a.f28674a;
        com.google.firebase.sessions.api.a.C0285a c0285aA = com.google.firebase.sessions.api.a.a(name);
        if (c0285aA.f28677b != null) {
            Objects.toString(name);
        } else {
            c0285aA.f28677b = c2813i;
            Objects.toString(name);
            c0285aA.f28676a.g(null);
        }
        E e10 = new E(eVar, m7, cVar2, i13, new androidx.compose.ui.graphics.colorspace.n(aVar2), new androidx.media3.exoplayer.E(9, aVar2), fVar, executorServiceA, c2813i, new p264v6.i(aVarH3));
        eVar.a();
        String str5 = eVar.f44390c.f44401b;
        String str6 = FeatureFlag.PROPERTIES_TYPE_STRING;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", FeatureFlag.PROPERTIES_TYPE_STRING);
        String str7 = "com.crashlytics.android.build_id";
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", FeatureFlag.PROPERTIES_TYPE_STRING);
        }
        String string = iD != 0 ? context.getResources().getString(iD) : null;
        ArrayList arrayList = new ArrayList();
        int iD2 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD3 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD4 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
            str = "com.crashlytics.android.build_id";
            str2 = FeatureFlag.PROPERTIES_TYPE_STRING;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4));
            i10 = 3;
            Log.isLoggable("FirebaseCrashlytics", 3);
        } else {
            String[] stringArray = context.getResources().getStringArray(iD2);
            String[] stringArray2 = context.getResources().getStringArray(iD3);
            String[] stringArray3 = context.getResources().getStringArray(iD4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i14 = 0;
                while (i14 < stringArray3.length) {
                    arrayList.add(new C2809e(stringArray[i14], stringArray2[i14], stringArray3[i14]));
                    i14++;
                    str7 = str7;
                    str6 = str6;
                }
                str = str7;
                str2 = str6;
            } else {
                str = "com.crashlytics.android.build_id";
                str2 = FeatureFlag.PROPERTIES_TYPE_STRING;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            i10 = 3;
        }
        Log.isLoggable("FirebaseCrashlytics", i10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str8 = ((C2809e) it.next()).f48366a;
            Log.isLoggable("FirebaseCrashlytics", i10);
        }
        p264v6.e eVar2 = new p264v6.e(context);
        try {
            String packageName2 = context.getPackageName();
            String strC = m7.c();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string2 = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
            String str9 = packageInfo.versionName;
            if (str9 == null) {
                str9 = "0.0";
            }
            String str10 = str9;
            String str11 = str;
            String str12 = str2;
            try {
                C2805a c2805a2 = new C2805a(str5, string, arrayList, strC, packageName2, string2, str10, eVar2);
                Log.isLoggable("FirebaseCrashlytics", 2);
                ExecutorService executorServiceA2 = L.a("com.google.firebase.crashlytics.startup");
                C6.b bVar = new C6.b();
                String strC2 = m7.c();
                H3.c cVar3 = new H3.c();
                F6.f fVar2 = new F6.f(cVar3);
                F6.a aVar5 = new F6.a(fVar);
                Locale locale = Locale.US;
                F6.c cVar4 = new F6.c(androidx.compose.foundation.gestures.d.b("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), bVar);
                String str13 = Build.MANUFACTURER;
                String str14 = p302y6.M.f48336h;
                String strF = O.a.f(str13.replaceAll(str14, ""), "/", Build.MODEL.replaceAll(str14, ""));
                String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str14, "");
                String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str14, "");
                int iD5 = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", str12);
                if (iD5 == 0) {
                    iD5 = CommonUtils.d(context, str11, str12);
                }
                String[] strArr = {iD5 != 0 ? context.getResources().getString(iD5) : null, str5, r23, r24};
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < 4) {
                    String str15 = strArr[i15];
                    String[] strArr2 = strArr;
                    if (str15 != null) {
                        arrayList2.add(str15.replace("-", "").toLowerCase(Locale.US));
                    }
                    i15++;
                    strArr = strArr2;
                }
                Collections.sort(arrayList2);
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb2.append((String) it2.next());
                }
                String string3 = sb2.toString();
                com.google.firebase.crashlytics.internal.settings.a aVar6 = new com.google.firebase.crashlytics.internal.settings.a(context, new F6.i(str5, strF, strReplaceAll, strReplaceAll2, m7, string3.length() > 0 ? CommonUtils.h(string3) : null, str10, string2, (strC2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a()), cVar3, fVar2, aVar5, cVar4, i13);
                aVar6.c(executorServiceA2).g(executorServiceA2, new p252u6.c());
                C2818n c2818n = e10.f48309m;
                D6.f fVar3 = e10.f48306i;
                Context context2 = e10.f48298a;
                if (context2 == null || (resources = context2.getResources()) == null) {
                    z10 = true;
                } else {
                    int iD6 = CommonUtils.d(context2, "com.crashlytics.RequireBuildId", "bool");
                    if (iD6 > 0) {
                        z10 = resources.getBoolean(iD6);
                    } else {
                        int iD7 = CommonUtils.d(context2, "com.crashlytics.RequireBuildId", str12);
                        if (iD7 > 0) {
                            z10 = Boolean.parseBoolean(context2.getString(iD7));
                        } else {
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    str4 = "FirebaseCrashlytics";
                    if (TextUtils.isEmpty(c2805a.f48354b)) {
                        c2805a = c2805a2;
                        Log.e(str4, ".");
                        Log.e(str4, ".     |  | ");
                        Log.e(str4, ".     |  |");
                        Log.e(str4, ".     |  |");
                        Log.e(str4, ".   \\ |  | /");
                        Log.e(str4, ".    \\    /");
                        Log.e(str4, ".     \\  /");
                        Log.e(str4, ".      \\/");
                        Log.e(str4, ".");
                        Log.e(str4, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e(str4, ".");
                        Log.e(str4, ".      /\\");
                        Log.e(str4, ".     /  \\");
                        Log.e(str4, ".    /    \\");
                        Log.e(str4, ".   / |  | \\");
                        Log.e(str4, ".     |  |");
                        Log.e(str4, ".     |  |");
                        Log.e(str4, ".     |  |");
                        Log.e(str4, ".");
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                } else {
                    str4 = "FirebaseCrashlytics";
                    Log.isLoggable(str4, 2);
                    c2805a = c2805a2;
                }
                c2805a = c2805a2;
                new C2810f(e10.f48305h);
                String str16 = C2810f.f48370b;
                try {
                    e10.f48303f = new W.f("crash_marker", fVar3);
                    e10.f48302e = new W.f("initialization_marker", fVar3);
                    p313z6.n nVar = new p313z6.n(str16, fVar3, c2818n);
                    p313z6.e eVar3 = new p313z6.e(fVar3);
                    G6.a aVar7 = new G6.a(new Y(2));
                    p264v6.i iVar = e10.f48312p;
                    iVar.getClass();
                    iVar.f47660a.a(new C1403v(new p264v6.d(nVar)));
                    executorService = executorServiceA2;
                    try {
                        String str17 = str4;
                        try {
                            try {
                                e10.f48304g = new com.google.firebase.crashlytics.internal.common.a(e10.f48298a, e10.f48309m, e10.f48305h, e10.f48299b, e10.f48306i, e10.f48303f, c2805a, nVar, eVar3, O.c(e10.f48298a, e10.f48305h, e10.f48306i, c2805a, eVar3, nVar, aVar7, aVar6, e10.f48300c, e10.f48310n), e10.f48311o, e10.f48307k, e10.f48310n);
                                W.f fVar4 = e10.f48302e;
                                String str18 = (String) fVar4.f6996b;
                                D6.f fVar5 = (D6.f) fVar4.f6997c;
                                fVar5.getClass();
                                boolean zExists = new File(fVar5.f2815b, str18).exists();
                                try {
                                    Boolean.TRUE.equals((Boolean) Q.a(c2818n.a(new D(e10))));
                                } catch (Exception unused) {
                                }
                                com.google.firebase.crashlytics.internal.common.a aVar8 = e10.f48304g;
                                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                aVar8.getClass();
                                aVar8.f28086e.a(new y(aVar8, str16));
                                aVar = aVar6;
                                try {
                                    H h8 = new H(new C2820p(aVar8), aVar, defaultUncaughtExceptionHandler, aVar8.j);
                                    aVar8.f28094n = h8;
                                    Thread.setDefaultUncaughtExceptionHandler(h8);
                                    if (!zExists) {
                                        z11 = true;
                                        i11 = 3;
                                    } else {
                                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                            str4 = str17;
                                            try {
                                                Log.isLoggable(str4, 3);
                                                Future<?> futureSubmit = e10.f48308l.submit(new RunnableC2514g2(e10, 1, aVar));
                                                Log.isLoggable(str4, 3);
                                                try {
                                                    try {
                                                        futureSubmit.get(3L, TimeUnit.SECONDS);
                                                    } catch (TimeoutException e11) {
                                                        Log.e(str4, "Crashlytics timed out during initialization.", e11);
                                                    }
                                                } catch (InterruptedException e12) {
                                                    Log.e(str4, "Crashlytics was interrupted during initialization.", e12);
                                                } catch (ExecutionException e13) {
                                                    Log.e(str4, "Crashlytics encountered a problem during initialization.", e13);
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                Log.e(str4, "Crashlytics was not started due to an exception during initialization", e);
                                                e10.f48304g = null;
                                            }
                                            z11 = false;
                                            p191p5.j.c(new p252u6.d(z11, e10, aVar), executorService);
                                            return new p252u6.e(e10);
                                        }
                                        i11 = 3;
                                        z11 = true;
                                    }
                                    Log.isLoggable(str17, i11);
                                } catch (Exception e15) {
                                    e = e15;
                                    str4 = str17;
                                    Log.e(str4, "Crashlytics was not started due to an exception during initialization", e);
                                    e10.f48304g = null;
                                    z11 = false;
                                    p191p5.j.c(new p252u6.d(z11, e10, aVar), executorService);
                                    return new p252u6.e(e10);
                                }
                            } catch (Exception e16) {
                                e = e16;
                                aVar = aVar6;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            aVar = aVar6;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        aVar = aVar6;
                    }
                } catch (Exception e19) {
                    e = e19;
                    aVar = aVar6;
                    executorService = executorServiceA2;
                }
                p191p5.j.c(new p252u6.d(z11, e10, aVar), executorService);
                return new p252u6.e(e10);
            } catch (PackageManager.NameNotFoundException e20) {
                e = e20;
                str3 = "FirebaseCrashlytics";
                Log.e(str3, "Error retrieving app package info.", e);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e21) {
            e = e21;
            str3 = "FirebaseCrashlytics";
        }
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        u uVar = (u) this.f2849b;
        if (uVar.y()) {
            return;
        }
        if (parseException == null) {
            uVar.f36243m.b(list);
            uVar.f36243m.h(null);
        } else if (uVar.getActivity() != null) {
            if (parseException.getCode() == 100) {
                Y.k(uVar, R.string.common_check_network, "TryAgainDialog");
                return;
            }
            P.a(uVar.getActivity(), J.g(uVar.getContext(), parseException));
            p279w9.b bVar = Application.f29634b;
            P8.c.b(parseException);
            uVar.r().h();
        }
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        throw new JsonIOException((String) this.f2849b);
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        ((RemoteConfigManager) this.f2849b).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
