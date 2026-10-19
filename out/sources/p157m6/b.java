package p157m6;

import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p192p6.a;

/* JADX INFO: compiled from: FirebaseABTesting.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p096h7.b<a> f44607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f44609c = null;

    public b(p096h7.b bVar, String str) {
        this.f44607a = bVar;
        this.f44608b = str;
    }

    public static boolean b(ArrayList arrayList, a aVar) {
        String str = aVar.f44601a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f44601a.equals(str) && aVar2.f44602b.equals(aVar.f44602b)) {
                return true;
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList) {
        p096h7.b<a> bVar = this.f44607a;
        a aVar = bVar.get();
        String str = this.f44608b;
        ArrayDeque arrayDeque = new ArrayDeque(aVar.h(str));
        if (this.f44609c == null) {
            this.f44609c = Integer.valueOf(bVar.get().e(str));
        }
        int iIntValue = this.f44609c.intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            while (arrayDeque.size() >= iIntValue) {
                bVar.get().g(((a.c) arrayDeque.pollFirst()).f45855b);
            }
            a.c cVarB = aVar2.b(str);
            bVar.get().d(cVarB);
            arrayDeque.offer(cVarB);
        }
    }

    public final void c(ArrayList arrayList) throws AbtException {
        String str;
        d();
        ArrayList<a> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a.a((Map) it.next()));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        String str2 = this.f44608b;
        p096h7.b<a> bVar = this.f44607a;
        if (zIsEmpty) {
            d();
            Iterator it2 = bVar.get().h(str2).iterator();
            while (it2.hasNext()) {
                bVar.get().g(((a.c) it2.next()).f45855b);
            }
            return;
        }
        d();
        List listH = bVar.get().h(str2);
        ArrayList<a> arrayList3 = new ArrayList();
        for (Iterator it3 = listH.iterator(); it3.hasNext(); it3 = it3) {
            a.c cVar = (a.c) it3.next();
            String[] strArr = a.f44599g;
            String str3 = cVar.f45857d;
            if (str3 == null) {
                str3 = "";
            }
            arrayList3.add(new a(cVar.f45855b, String.valueOf(cVar.f45856c), str3, new Date(cVar.f45865m), cVar.f45858e, cVar.j));
            str2 = str2;
        }
        String str4 = str2;
        ArrayList arrayList4 = new ArrayList();
        for (a aVar : arrayList3) {
            if (b(arrayList2, aVar)) {
                str = str4;
            } else {
                str = str4;
                arrayList4.add(aVar.b(str));
            }
            str4 = str;
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            bVar.get().g(((a.c) it4.next()).f45855b);
        }
        ArrayList arrayList5 = new ArrayList();
        for (a aVar2 : arrayList2) {
            if (!b(arrayList3, aVar2)) {
                arrayList5.add(aVar2);
            }
        }
        a(arrayList5);
    }

    public final void d() throws AbtException {
        if (this.f44607a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
