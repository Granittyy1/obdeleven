package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;

/* JADX INFO: compiled from: SessionEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f28736a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N6.d f28737b;

    static {
        N6.e eVar = new N6.e();
        eVar.a(p.class, g.f28705a);
        eVar.a(t.class, h.f28709a);
        eVar.a(i.class, e.f28696a);
        eVar.a(b.class, d.f28689a);
        eVar.a(a.class, c.f28682a);
        eVar.a(l.class, f.f28700a);
        eVar.f4661d = true;
        f28737b = new N6.d(eVar);
    }

    public static b a(p144l6.e eVar) {
        Object next;
        l lVar;
        String strA;
        eVar.a();
        Context context = eVar.f44388a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        eVar.a();
        String str = eVar.f44390c.f44401b;
        kotlin.jvm.internal.i.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.i.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
        eVar.a();
        int iMyPid = Process.myPid();
        Iterator it = F8.a.f(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l) next).f28725b != iMyPid);
        l lVar2 = (l) next;
        if (lVar2 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                strA = Process.myProcessName();
                kotlin.jvm.internal.i.d(strA, "myProcessName()");
            } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = Y4.f.a()) == null) {
                strA = "";
            }
            lVar = new l(iMyPid, 0, strA, false);
        } else {
            lVar = lVar2;
        }
        eVar.a();
        return new b(str, MODEL, RELEASE, new a(packageName, str3, strValueOf, MANUFACTURER, lVar, F8.a.f(context)));
    }
}
