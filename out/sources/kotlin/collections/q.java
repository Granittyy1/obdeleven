package kotlin.collections;

import D2.V;
import androidx.compose.ui.platform.T0;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes.dex */
public class q extends p {
    public static T0 H(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        return new T0(iterable);
    }

    public static ArrayList I(Iterable iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Cb.a.d(i10, i10);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayList = new ArrayList((size / i10) + (size % i10 == 0 ? 0 : 1));
            int i11 = 0;
            while (i11 >= 0 && i11 < size) {
                int i12 = size - i11;
                if (i10 <= i12) {
                    i12 = i10;
                }
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    arrayList2.add(list.get(i13 + i11));
                }
                arrayList.add(arrayList2);
                i11 += i10;
            }
        } else {
            arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.i.e(iterator, "iterator");
            Iterator itN = !iterator.hasNext() ? r.f43021b : C1787c0.n(new SlidingWindowKt$windowedIterator$1(i10, i10, iterator, false, true, null));
            while (itN.hasNext()) {
                arrayList.add((List) itN.next());
            }
        }
        return arrayList;
    }

    public static <T> boolean J(Iterable<? extends T> iterable, T t8) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t8);
        }
        return R(iterable, t8) >= 0;
    }

    public static <T> List<T> K(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        Object objV;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return o0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                return EmptyList.f42983b;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objV = V((List) iterable);
                } else {
                    Iterator<? extends T> it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    T next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objV = next;
                }
                return M1.k(objV);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t8 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t8);
            } else {
                i11++;
            }
        }
        return l.u(arrayList);
    }

    public static List L(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return i0(list2, size);
    }

    public static ArrayList M(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T N(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) O((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T O(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T P(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object Q(int i10, List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static <T> int R(Iterable<? extends T> iterable, T t8) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t8);
        }
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 < 0) {
                l.x();
                throw null;
            }
            if (kotlin.jvm.internal.i.a(t8, t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void S(Iterable iterable, StringBuilder sb2, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ia.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb2.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                V.f(sb2, obj, lVar);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
    }

    public static /* synthetic */ void T(List list, StringBuilder sb2, String str, Ia.l lVar, int i10) {
        if ((i10 & 64) != 0) {
            lVar = null;
        }
        S(list, sb2, str, "", "", -1, "...", lVar);
    }

    public static String U(Iterable iterable, String str, String str2, String str3, Ia.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String postfix = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb2 = new StringBuilder();
        S(iterable, sb2, separator, prefix, postfix, -1, "...", lVar);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static <T> T V(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(l.r(list));
    }

    public static <T> T W(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) C4.v.e(1, list);
    }

    public static Comparable X(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float Y(Iterable<Float> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float Z(Iterable<Float> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList a0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(m.y(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.i.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b0(Na.c cVar, Na.c cVar2) {
        if (cVar instanceof Collection) {
            return c0((Collection) cVar, cVar2);
        }
        ArrayList arrayList = new ArrayList();
        p.z(arrayList, cVar);
        p.z(arrayList, cVar2);
        return arrayList;
    }

    public static ArrayList c0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p.z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList d0(Collection collection, Object obj) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> List<T> e0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return o0(iterable);
        }
        List<T> listQ0 = q0(iterable);
        Collections.reverse(listQ0);
        return listQ0;
    }

    public static <T> T f0(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List g0(AbstractList abstractList) {
        kotlin.jvm.internal.i.e(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return o0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Q3.d.h(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> h0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listQ0 = q0(iterable);
            p.G(listQ0, comparator);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return o0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.i.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Q3.d.h(array);
    }

    public static <T> List<T> i0(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f42983b;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return o0(iterable);
            }
            if (i10 == 1) {
                return M1.k(N(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return l.u(arrayList);
    }

    public static boolean[] j0(Collection<Boolean> collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] k0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void l0(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] m0(Collection<Float> collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static int[] n0(Collection<Integer> collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> o0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l.u(q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f42983b;
        }
        if (size != 1) {
            return p0(collection);
        }
        return M1.k(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList p0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> q0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return p0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        l0(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> r0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> s0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            l0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : C.u(linkedHashSet.iterator().next());
            }
            return EmptySet.f42985b;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.f42985b;
        }
        if (size2 == 1) {
            return C.u(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(x.n(collection.size()));
        l0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }
}
