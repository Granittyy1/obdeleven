package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public static void A(Collection collection, Object[] elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        collection.addAll(Q3.d.h(elements));
    }

    public static final boolean B(Collection collection, Ia.l lVar, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static void C(Ia.l predicate, List list) {
        int iR;
        kotlin.jvm.internal.i.e(list, "<this>");
        kotlin.jvm.internal.i.e(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof Ja.a) && !(list instanceof Ja.b)) {
                kotlin.jvm.internal.o.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                B(list, predicate, true);
                return;
            } catch (ClassCastException e10) {
                kotlin.jvm.internal.i.j(e10, kotlin.jvm.internal.o.class.getName());
                throw e10;
            }
        }
        int iR2 = l.r(list);
        int i10 = 0;
        if (iR2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iR2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iR = l.r(list))) {
            return;
        }
        while (true) {
            list.remove(iR);
            if (iR == i10) {
                return;
            } else {
                iR--;
            }
        }
    }

    public static Object D(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object E(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(l.r(list));
    }

    public static void F(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void G(List list, Comparator comparator) {
        kotlin.jvm.internal.i.e(list, "<this>");
        kotlin.jvm.internal.i.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void z(Collection collection, Iterable elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
