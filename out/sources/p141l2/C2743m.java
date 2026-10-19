package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2743m extends AbstractC2735e<long[]> {
    public static long[] b(String value) {
        i.e(value, "value");
        return new long[]{L.LongType.parseValue(value).longValue()};
    }

    @Override // p141l2.AbstractC2735e
    public final long[] a() {
        return new long[0];
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        A.g(key);
        throw null;
    }

    @Override // p141l2.L
    public final String getName() {
        return "long[]";
    }

    @Override // p141l2.L
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        long[] jArr = (long[]) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (jArr != null) {
            bundle.putLongArray(key, jArr);
        } else {
            f.a(bundle, key);
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                lArr[i10] = Long.valueOf(jArr[i10]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                lArr2[i11] = Long.valueOf(jArr2[i11]);
            }
        }
        return d.j(lArr, lArr2);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        long[] jArr = (long[]) obj;
        i.e(value, "value");
        if (jArr == null) {
            return b(value);
        }
        long[] jArrB = b(value);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrB, 0, jArrCopyOf, length, 1);
        i.b(jArrCopyOf);
        return jArrCopyOf;
    }
}
