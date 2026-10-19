package androidx.navigation.compose;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import coil.disk.DiskLruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19206c;

    public /* synthetic */ x(int i10, Object obj) {
        this.f19205b = i10;
        this.f19206c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        Bundle[] bundleArr;
        switch (this.f19205b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                p141l2.H h8 = D9.o.h((Context) this.f19206c);
                if (bundle != null) {
                    bundle.setClassLoader(h8.f44309a.getClassLoader());
                }
                p163n2.j jVar = h8.f44310b;
                jVar.getClass();
                Boolean boolValueOf = null;
                if (bundle != null) {
                    jVar.f44788d = bundle.containsKey("android-support-nav:controller:navigatorState") ? p248u2.b.b(bundle, "android-support-nav:controller:navigatorState") : null;
                    if (bundle.containsKey("android-support-nav:controller:backStack")) {
                        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? w0.b.a.c(bundle, "android-support-nav:controller:backStack", p241t7.b.r(kotlin.jvm.internal.l.a(Bundle.class))) : bundle.getParcelableArrayList("android-support-nav:controller:backStack");
                        if (arrayListC == null) {
                            A8.A.g("android-support-nav:controller:backStack");
                            throw null;
                        }
                        bundleArr = (Bundle[]) arrayListC.toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    jVar.f44789e = bundleArr;
                    LinkedHashMap linkedHashMap = jVar.f44796m;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            A8.A.g("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            A8.A.g("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = i11 + 1;
                            jVar.f44795l.put(Integer.valueOf(intArray[i10]), !kotlin.jvm.internal.i.a(stringArrayList.get(i11), "") ? stringArrayList.get(i11) : null);
                            i10++;
                            i11 = i12;
                        }
                    }
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            A8.A.g("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        for (String str : stringArrayList2) {
                            String key = "android-support-nav:controller:backStackStates:" + str;
                            kotlin.jvm.internal.i.e(key, "key");
                            if (bundle.containsKey(key)) {
                                String key2 = "android-support-nav:controller:backStackStates:" + str;
                                kotlin.jvm.internal.i.e(key2, "key");
                                ArrayList arrayListC2 = Build.VERSION.SDK_INT >= 34 ? w0.b.a.c(bundle, key2, p241t7.b.r(kotlin.jvm.internal.l.a(Bundle.class))) : bundle.getParcelableArrayList(key2);
                                if (arrayListC2 == null) {
                                    A8.A.g(key2);
                                    throw null;
                                }
                                kotlin.collections.i iVar = new kotlin.collections.i(arrayListC2.size());
                                Iterator it = arrayListC2.iterator();
                                while (it.hasNext()) {
                                    iVar.addLast(new p141l2.u((Bundle) it.next()));
                                }
                                linkedHashMap.put(str, iVar);
                            }
                        }
                    }
                    boolValueOf = null;
                }
                if (bundle != null) {
                    boolean z10 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (z10 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        boolValueOf = Boolean.valueOf(z10);
                    }
                    h8.f44313e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return h8;
            default:
                ((DiskLruCache) this.f19206c).f22923l = true;
                return p293xa.r.f47939a;
        }
    }
}
