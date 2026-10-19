package T4;

import U4.C0795c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: T4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0790x extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f6014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790x(C c10, ArrayList arrayList) {
        super(0, c10);
        this.f6014e = c10;
        this.f6013d = arrayList;
    }

    @Override // T4.B
    public final void b() {
        Set setEmptySet;
        C c10 = this.f6014e;
        G g10 = c10.f5821a.f5878o;
        K k10 = c10.f5821a;
        C0795c c0795c = c10.f5837r;
        if (c0795c == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(c0795c.f6425b);
            Map map = c0795c.f6427d;
            for (com.google.android.gms.common.api.a aVar : map.keySet()) {
                if (!k10.f5873i.containsKey(aVar.f25313b)) {
                    ((U4.r) map.get(aVar)).getClass();
                    hashSet.addAll(null);
                }
            }
            setEmptySet = hashSet;
        }
        g10.f5858q = setEmptySet;
        ArrayList arrayList = this.f6013d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.common.api.a.e) arrayList.get(i10)).k(c10.f5834o, k10.f5878o.f5858q);
        }
    }
}
