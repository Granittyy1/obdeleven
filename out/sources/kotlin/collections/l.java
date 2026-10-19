package kotlin.collections;

import androidx.core.view.C1293h;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes.dex */
public class l extends M1 {
    public static <T> ArrayList<T> n(T... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new h(elements, true));
    }

    public static int o(int i10, int i11, Ia.l lVar, List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        v(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) lVar.invoke(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static int p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        int i10 = 0;
        v(arrayList.size(), 0, size);
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int iE = Cb.a.e((Comparable) arrayList.get(i12), comparable);
            if (iE < 0) {
                i10 = i12 + 1;
            } else {
                if (iE <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static EmptyList q() {
        return EmptyList.f42983b;
    }

    public static <T> int r(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> s(T... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length > 0 ? Q3.d.h(elements) : EmptyList.f42983b;
    }

    public static ArrayList t(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new h(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> u(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : M1.k(list.get(0));
        }
        return EmptyList.f42983b;
    }

    public static final void v(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(C1293h.h("fromIndex (", ") is greater than toIndex (", ").", i11, i12));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(J4.i.c(i11, "fromIndex (", ") is less than zero."));
        }
        if (i12 > i10) {
            throw new IndexOutOfBoundsException(C1293h.h("toIndex (", ") is greater than size (", ").", i12, i10));
        }
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
