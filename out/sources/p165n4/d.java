package p165n4;

import Z3.q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.x;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CustomTabUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f44878a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        Context contextA = q.a();
        List<ResolveInfo> listQueryIntentServices = contextA.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        i.d(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
        String[] strArr = f44878a;
        HashSet hashSet = new HashSet(x.n(3));
        k.c0(strArr, hashSet);
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    public static final String b(String developerDefinedRedirectURI) {
        i.e(developerDefinedRedirectURI, "developerDefinedRedirectURI");
        int i10 = t.f44935a;
        if (t.a(q.a(), developerDefinedRedirectURI)) {
            return developerDefinedRedirectURI;
        }
        return t.a(q.a(), i.k(q.a().getPackageName(), "fbconnect://cct.")) ? i.k(q.a().getPackageName(), "fbconnect://cct.") : "";
    }
}
