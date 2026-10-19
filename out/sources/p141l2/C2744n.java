package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2744n extends AbstractC2735e<List<? extends Long>> {
    @Override // p141l2.AbstractC2735e
    public final List<? extends Long> a() {
        return EmptyList.f42983b;
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        Object objK;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(key);
        if (longArray == null) {
            A.g(key);
            throw null;
        }
        i.e(longArray, "<this>");
        int length = longArray.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(longArray.length);
                for (long j : longArray) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            objK = M1.k(Long.valueOf(longArray[0]));
        } else {
            objK = EmptyList.f42983b;
        }
        return objK;
    }

    @Override // p141l2.L
    public final String getName() {
        return "List<Long>";
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        i.e(value, "value");
        return M1.k(L.LongType.parseValue(value));
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        List list = (List) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (list == null) {
            f.a(bundle, key);
            return;
        }
        List list2 = list;
        long[] jArr = new long[list2.size()];
        Iterator it = list2.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        bundle.putLongArray(key, jArr);
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return d.j(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        List list = (List) obj;
        i.e(value, "value");
        if (list != null) {
            return q.c0(list, M1.k(L.LongType.parseValue(value)));
        }
        return M1.k(L.LongType.parseValue(value));
    }
}
