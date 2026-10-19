package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.k;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2737g extends AbstractC2735e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44284a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2737g(int i10, boolean z10) {
        super(z10);
        this.f44284a = i10;
    }

    @Override // p141l2.AbstractC2735e
    public final Object a() {
        switch (this.f44284a) {
            case 0:
                break;
        }
        return EmptyList.f42983b;
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        Object objK;
        switch (this.f44284a) {
            case 0:
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (!bundle.containsKey(key) || b.c(bundle, key)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(key);
                if (floatArray == null) {
                    A.g(key);
                    throw null;
                }
                i.e(floatArray, "<this>");
                int length = floatArray.length;
                if (length != 0) {
                    if (length != 1) {
                        ArrayList arrayList = new ArrayList(floatArray.length);
                        for (float f10 : floatArray) {
                            arrayList.add(Float.valueOf(f10));
                        }
                        return arrayList;
                    }
                    objK = M1.k(Float.valueOf(floatArray[0]));
                } else {
                    objK = EmptyList.f42983b;
                }
                return objK;
            default:
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (!bundle.containsKey(key) || b.c(bundle, key)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(key);
                if (stringArray != null) {
                    return k.d0(stringArray);
                }
                A.g(key);
                throw null;
        }
    }

    @Override // p141l2.L
    public final String getName() {
        switch (this.f44284a) {
            case 0:
                return "List<Float>";
            default:
                return "List<String>";
        }
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        switch (this.f44284a) {
            case 0:
                i.e(value, "value");
                return M1.k(L.FloatType.parseValue(value));
            default:
                i.e(value, "value");
                return M1.k(value);
        }
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        switch (this.f44284a) {
            case 0:
                List list = (List) obj;
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (list == null) {
                    f.a(bundle, key);
                } else {
                    bundle.putFloatArray(key, q.m0(list));
                }
                break;
            default:
                List list2 = (List) obj;
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (list2 == null) {
                    f.a(bundle, key);
                } else {
                    String[] value = (String[]) list2.toArray(new String[0]);
                    i.e(value, "value");
                    bundle.putStringArray(key, value);
                }
                break;
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        switch (this.f44284a) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                return d.j(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
            default:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return d.j(list3 != null ? (String[]) list3.toArray(new String[0]) : null, list4 != null ? (String[]) list4.toArray(new String[0]) : null);
        }
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        switch (this.f44284a) {
            case 0:
                List list = (List) obj;
                i.e(value, "value");
                if (list != null) {
                    return q.c0(list, M1.k(L.FloatType.parseValue(value)));
                }
                return M1.k(L.FloatType.parseValue(value));
            default:
                List list2 = (List) obj;
                i.e(value, "value");
                if (list2 != null) {
                    return q.c0(list2, M1.k(value));
                }
                return M1.k(value);
        }
    }
}
