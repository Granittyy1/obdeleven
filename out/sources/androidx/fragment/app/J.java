package androidx.fragment.app;

import D2.C0689p;
import android.view.View;
import androidx.collection.C0873a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: FragmentTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f17509a = new L();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f17510b;

    static {
        P p10 = null;
        try {
            p10 = (P) C0689p.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f17510b = p10;
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z10, C0873a sharedElements) {
        kotlin.jvm.internal.i.e(inFragment, "inFragment");
        kotlin.jvm.internal.i.e(outFragment, "outFragment");
        kotlin.jvm.internal.i.e(sharedElements, "sharedElements");
        if ((z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(sharedElements.f9139d);
            Iterator it = ((C0873a.C0118a) sharedElements.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.f9139d);
            Iterator it2 = ((C0873a.C0118a) sharedElements.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(C0873a<String, String> c0873a, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (C0873a.C0118a) c0873a.entrySet()) {
            if (kotlin.jvm.internal.i.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) kotlin.collections.q.P(arrayList);
    }

    public static final void c(int i10, ArrayList views) {
        kotlin.jvm.internal.i.e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
