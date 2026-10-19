package T4;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.C0817z;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: T4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0789w extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f6009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789w(C c10, HashMap map) {
        super(0, c10);
        this.f6009e = c10;
        this.f6008d = map;
    }

    @Override // T4.B
    public final void b() {
        p156m5.f fVar;
        C c10 = this.f6009e;
        C0817z c0817z = new C0817z(c10.f5824d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = this.f6008d;
        for (com.google.android.gms.common.api.a.e eVar : map.keySet()) {
            if (!eVar.l() || ((C0786t) map.get(eVar)).f5999c) {
                arrayList2.add(eVar);
            } else {
                arrayList.add(eVar);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Context context = c10.f5823c;
        int i10 = 0;
        int iA = -1;
        if (!zIsEmpty) {
            int size = arrayList.size();
            while (i10 < size) {
                iA = c0817z.a(context, (com.google.android.gms.common.api.a.e) arrayList.get(i10));
                i10++;
                if (iA != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iA = c0817z.a(context, (com.google.android.gms.common.api.a.e) arrayList2.get(i10));
                i10++;
                if (iA == 0) {
                    break;
                }
            }
        }
        K k10 = c10.f5821a;
        if (iA != 0) {
            C0787u c0787u = new C0787u(this, c10, new C0760b(iA, null, null));
            J j = k10.f5871g;
            j.sendMessage(j.obtainMessage(1, c0787u));
            return;
        }
        if (c10.f5832m && (fVar = c10.f5830k) != null) {
            fVar.t();
        }
        for (com.google.android.gms.common.api.a.e eVar2 : map.keySet()) {
            AbstractC0794b.c cVar = (AbstractC0794b.c) map.get(eVar2);
            if (!eVar2.l() || c0817z.a(context, eVar2) == 0) {
                eVar2.i(cVar);
            } else {
                C0788v c0788v = new C0788v(c10, cVar);
                J j10 = k10.f5871g;
                j10.sendMessage(j10.obtainMessage(1, c0788v));
            }
        }
    }
}
