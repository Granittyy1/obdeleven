package p131k5;

import U4.C0804l;
import android.text.TextUtils;
import androidx.collection.C0893v;
import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C1823h1;
import com.google.android.gms.measurement.internal.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends C0893v<String, A> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f42069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(d dVar) {
        super(20);
        this.f42069g = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.C0893v
    public final A a(String str) {
        C1823h1 c1823h1;
        LinkedHashMap linkedHashMap;
        String str2 = str;
        C0804l.e(str2);
        d dVar = this.f42069g;
        dVar.t();
        C0804l.e(str2);
        if (TextUtils.isEmpty(str2) || (c1823h1 = (C1823h1) dVar.f26565h.get(str2)) == null || c1823h1.v() == 0) {
            return null;
        }
        if (!dVar.f26565h.containsKey(str2) || dVar.f26565h.get(str2) == 0) {
            dVar.O(str2);
        } else {
            dVar.D(str2, (C1823h1) dVar.f26565h.get(str2));
        }
        Z0 z10 = dVar.j;
        synchronized (z10.f9217c) {
            Set setEntrySet = z10.f9216b.f46999a.entrySet();
            i.d(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = z10.f9216b.f46999a.entrySet();
            i.d(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (A) linkedHashMap.get(str2);
    }
}
