package kotlin.collections;

import D2.V;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes.dex */
public class k extends Q3.d {
    public static boolean M(Object obj, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        return T(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static boolean N(long[] jArr, long j) {
        int length = jArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (j == jArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList O(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T P(T[] tArr) {
        kotlin.jvm.internal.i.e(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Na.i Q(int[] iArr) {
        return new Na.i(0, iArr.length - 1, 1);
    }

    public static int R(long[] jArr) {
        kotlin.jvm.internal.i.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int S(T[] tArr) {
        kotlin.jvm.internal.i.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static int T(Object obj, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void U(Object[] objArr, StringBuilder sb2, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ia.l lVar) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb2.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            V.f(sb2, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
    }

    public static String V(Object[] objArr, String str, Ia.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        StringBuilder sb2 = new StringBuilder();
        U(objArr, sb2, separator, "", "", -1, "...", lVar);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static int W(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public static Integer X(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static void Y(byte[] bArr) {
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = bArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length2];
            bArr[length2] = b10;
            length2--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static char Z(char[] cArr) {
        kotlin.jvm.internal.i.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static byte[] a0(byte[] bArr, Na.i indices) {
        kotlin.jvm.internal.i.e(indices, "indices");
        if (indices.isEmpty()) {
            return new byte[0];
        }
        return Q3.d.t(bArr, indices.f4687b, indices.f4688c + 1);
    }

    public static <T> List<T> b0(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.e(tArr, "<this>");
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            kotlin.jvm.internal.i.d(tArr, "copyOf(...)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return Q3.d.h(tArr);
    }

    public static final void c0(Object[] objArr, HashSet hashSet) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static <T> List<T> d0(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? f0(tArr) : M1.k(tArr[0]);
        }
        return EmptyList.f42983b;
    }

    public static ArrayList e0(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static ArrayList f0(Object[] objArr) {
        return new ArrayList(new h(objArr, false));
    }

    public static t g0(final Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        return new t(new Ia.a<Iterator<Object>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final Iterator<Object> invoke() {
                return I2.e.m(objArr);
            }
        });
    }
}
