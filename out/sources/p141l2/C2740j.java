package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2740j extends AbstractC2735e<int[]> {
    public static int[] b(String value) {
        i.e(value, "value");
        return new int[]{L.IntType.parseValue(value).intValue()};
    }

    @Override // p141l2.AbstractC2735e
    public final int[] a() {
        return new int[0];
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        A.g(key);
        throw null;
    }

    @Override // p141l2.L
    public final String getName() {
        return "integer[]";
    }

    @Override // p141l2.L
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        int[] iArr = (int[]) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (iArr != null) {
            bundle.putIntArray(key, iArr);
        } else {
            f.a(bundle, key);
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                numArr[i10] = Integer.valueOf(iArr[i10]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                numArr2[i11] = Integer.valueOf(iArr2[i11]);
            }
        }
        return d.j(numArr, numArr2);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        int[] iArr = (int[]) obj;
        i.e(value, "value");
        if (iArr == null) {
            return b(value);
        }
        int[] iArrB = b(value);
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        System.arraycopy(iArrB, 0, iArrCopyOf, length, 1);
        i.b(iArrCopyOf);
        return iArrCopyOf;
    }
}
