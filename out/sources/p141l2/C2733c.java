package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2733c extends AbstractC2735e<List<? extends Boolean>> {
    @Override // p141l2.AbstractC2735e
    public final List<? extends Boolean> a() {
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
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray == null) {
            A.g(key);
            throw null;
        }
        i.e(booleanArray, "<this>");
        int length = booleanArray.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(booleanArray.length);
                for (boolean z10 : booleanArray) {
                    arrayList.add(Boolean.valueOf(z10));
                }
                return arrayList;
            }
            objK = M1.k(Boolean.valueOf(booleanArray[0]));
        } else {
            objK = EmptyList.f42983b;
        }
        return objK;
    }

    @Override // p141l2.L
    public final String getName() {
        return "List<Boolean>";
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        i.e(value, "value");
        return M1.k(L.BoolType.parseValue(value));
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        List list = (List) obj;
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (list != null) {
            bundle.putBooleanArray(key, q.j0(list));
        } else {
            f.a(bundle, key);
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return d.j(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        List list = (List) obj;
        i.e(value, "value");
        if (list != null) {
            return q.c0(list, M1.k(L.BoolType.parseValue(value)));
        }
        return M1.k(L.BoolType.parseValue(value));
    }
}
