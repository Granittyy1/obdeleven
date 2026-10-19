package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2732b extends AbstractC2735e<boolean[]> {
    public static boolean[] b(String value) {
        i.e(value, "value");
        return new boolean[]{L.BoolType.parseValue(value).booleanValue()};
    }

    @Override // p141l2.AbstractC2735e
    public final boolean[] a() {
        return new boolean[0];
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        A.g(key);
        throw null;
    }

    @Override // p141l2.L
    public final String getName() {
        return "boolean[]";
    }

    @Override // p141l2.L
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (zArr != null) {
            bundle.putBooleanArray(key, zArr);
        } else {
            f.a(bundle, key);
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        Boolean[] boolArr;
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        Boolean[] boolArr2 = null;
        if (zArr != null) {
            boolArr = new Boolean[zArr.length];
            int length = zArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                boolArr[i10] = Boolean.valueOf(zArr[i10]);
            }
        } else {
            boolArr = null;
        }
        if (zArr2 != null) {
            boolArr2 = new Boolean[zArr2.length];
            int length2 = zArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                boolArr2[i11] = Boolean.valueOf(zArr2[i11]);
            }
        }
        return d.j(boolArr, boolArr2);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i.e(value, "value");
        if (zArr == null) {
            return b(value);
        }
        boolean[] zArrB = b(value);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrB, 0, zArrCopyOf, length, 1);
        i.b(zArrCopyOf);
        return zArrCopyOf;
    }
}
