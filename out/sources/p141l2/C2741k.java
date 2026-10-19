package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.k;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p248u2.b;

/* JADX INFO: renamed from: l2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2741k extends AbstractC2735e<List<? extends Integer>> {
    @Override // p141l2.AbstractC2735e
    public final List<? extends Integer> a() {
        return EmptyList.f42983b;
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        Object objE0;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(key);
        if (intArray == null) {
            A.g(key);
            throw null;
        }
        i.e(intArray, "<this>");
        int length = intArray.length;
        if (length != 0) {
            objE0 = length != 1 ? k.e0(intArray) : M1.k(Integer.valueOf(intArray[0]));
        } else {
            objE0 = EmptyList.f42983b;
        }
        return objE0;
    }

    @Override // p141l2.L
    public final String getName() {
        return "List<Int>";
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        i.e(value, "value");
        return M1.k(L.IntType.parseValue(value));
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        List list = (List) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (list != null) {
            bundle.putIntArray(key, q.n0(list));
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return d.j(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        List list = (List) obj;
        i.e(value, "value");
        if (list != null) {
            return q.c0(list, M1.k(L.IntType.parseValue(value)));
        }
        return M1.k(L.IntType.parseValue(value));
    }
}
