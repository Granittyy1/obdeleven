package p002a1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlinx.coroutines.flow.q;
import p248u2.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f7992a;

    @Override // u2.c.b
    public final Bundle a() {
        Pair[] pairArr;
        b bVar = this.f7992a;
        for (Map.Entry entry : y.x(bVar.f7996d).entrySet()) {
            bVar.a(((q) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : y.x(bVar.f7994b).entrySet()) {
            bVar.a(((c.b) entry2.getValue()).a(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = bVar.f7993a;
        if (linkedHashMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        return p271w0.c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
