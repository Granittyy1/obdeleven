package androidx.navigation.compose;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import p141l2.C2749t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Ia.p {
    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundleB;
        p141l2.H h8 = (p141l2.H) obj2;
        p163n2.j jVar = h8.f44310b;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        kotlin.collections.y.p();
        Bundle bundleB2 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : kotlin.collections.y.x(jVar.f44802s.f44273a).entrySet()) {
            ((p141l2.P) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundleB = null;
        } else {
            kotlin.collections.y.p();
            bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            p248u2.f.e(bundleB2, "android-support-nav:controller:navigatorState:names", arrayList);
            p248u2.f.c(bundleB, "android-support-nav:controller:navigatorState", bundleB2);
        }
        kotlin.collections.i<C2749t> iVar = jVar.f44790f;
        if (!iVar.isEmpty()) {
            if (bundleB == null) {
                kotlin.collections.y.p();
                bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (C2749t entry2 : iVar) {
                kotlin.jvm.internal.i.e(entry2, "entry");
                int i10 = entry2.f44299c.f44219c.f44813d;
                p163n2.c cVar = entry2.f44305i;
                Bundle bundleA = cVar.a();
                kotlin.collections.y.p();
                Bundle bundleB3 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                cVar.f44759h.c(bundleB3);
                kotlin.collections.y.p();
                Bundle bundleB4 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                p248u2.f.d(bundleB4, "nav-entry-state:id", entry2.f44303g);
                bundleB4.putInt("nav-entry-state:destination-id", i10);
                if (bundleA == null) {
                    kotlin.collections.y.p();
                    bundleA = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                p248u2.f.c(bundleB4, "nav-entry-state:args", bundleA);
                p248u2.f.c(bundleB4, "nav-entry-state:saved-state", bundleB3);
                arrayList2.add(bundleB4);
            }
            bundleB.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        LinkedHashMap linkedHashMap = jVar.f44795l;
        if (!linkedHashMap.isEmpty()) {
            if (bundleB == null) {
                kotlin.collections.y.p();
                bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry3.getKey()).intValue();
                String str = (String) entry3.getValue();
                int i12 = i11 + 1;
                iArr[i11] = iIntValue;
                if (str == null) {
                    str = "";
                }
                arrayList3.add(str);
                i11 = i12;
            }
            bundleB.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            p248u2.f.e(bundleB, "android-support-nav:controller:backStackIds", arrayList3);
        }
        LinkedHashMap linkedHashMap2 = jVar.f44796m;
        if (!linkedHashMap2.isEmpty()) {
            if (bundleB == null) {
                kotlin.collections.y.p();
                bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry4.getKey();
                kotlin.collections.i iVar2 = (kotlin.collections.i) entry4.getValue();
                arrayList4.add(str2);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator<E> it = iVar2.iterator();
                while (it.hasNext()) {
                    p163n2.d dVar = ((p141l2.u) it.next()).f44306a;
                    dVar.getClass();
                    kotlin.collections.y.p();
                    Bundle bundleB5 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    p248u2.f.d(bundleB5, "nav-entry-state:id", dVar.f44765a);
                    bundleB5.putInt("nav-entry-state:destination-id", dVar.f44766b);
                    Bundle bundleB6 = dVar.f44767c;
                    if (bundleB6 == null) {
                        kotlin.collections.y.p();
                        bundleB6 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    p248u2.f.c(bundleB5, "nav-entry-state:args", bundleB6);
                    p248u2.f.c(bundleB5, "nav-entry-state:saved-state", dVar.f44768d);
                    arrayList5.add(bundleB5);
                }
                String key = "android-support-nav:controller:backStackStates:" + str2;
                kotlin.jvm.internal.i.e(key, "key");
                bundleB.putParcelableArrayList(key, arrayList5);
            }
            p248u2.f.e(bundleB, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (h8.f44313e) {
            if (bundleB == null) {
                kotlin.collections.y.p();
                bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleB.putBoolean("android-support-nav:controller:deepLinkHandled", h8.f44313e);
        }
        return bundleB;
    }
}
