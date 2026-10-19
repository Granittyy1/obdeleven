package androidx.compose.ui.platform.accessibility;

import B0.s;
import I.d;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.l;
import p039d0.a;

/* JADX INFO: compiled from: CollectionInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() <= 1) {
            list = EmptyList.f42983b;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int iR = l.r(arrayList);
            int i10 = 0;
            while (i10 < iR) {
                i10++;
                Object obj2 = arrayList.get(i10);
                q qVar = (q) obj2;
                q qVar2 = (q) obj;
                arrayList2.add(new d((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qVar2.e().b() >> 32)) - Float.intBitsToFloat((int) (qVar.e().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qVar2.e().b() & 4294967295L)) - Float.intBitsToFloat((int) (qVar.e().b() & 4294967295L))))) & 4294967295L)));
                obj = obj2;
            }
            list = arrayList2;
        }
        if (list.size() == 1) {
            j = ((d) kotlin.collections.q.O(list)).f3754a;
        } else {
            if (list.isEmpty()) {
                a.c("Empty collection can't be reduced.");
            }
            Object objO = kotlin.collections.q.O(list);
            int iR2 = l.r(list);
            if (1 <= iR2) {
                int i11 = 1;
                while (true) {
                    objO = new d(d.g(((d) objO).f3754a, ((d) list.get(i11)).f3754a));
                    if (i11 == iR2) {
                        break;
                    }
                    i11++;
                }
            }
            j = ((d) objO).f3754a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static final void b(q qVar, s sVar) {
        if (((c) SemanticsConfigurationKt.a(qVar.i(), SemanticsProperties.f15154g)) != null) {
            sVar.l(s.f.a(0, 0, 0, 0, false, ((Boolean) qVar.i().v(SemanticsProperties.f15141G, new Ia.a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
                @Override // Ia.a
                public final /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue()));
        }
        q qVarJ = qVar.j();
        if (qVarJ == null || SemanticsConfigurationKt.a(qVarJ.i(), SemanticsProperties.f15152e) == null) {
            return;
        }
        b bVar = (b) SemanticsConfigurationKt.a(qVarJ.i(), SemanticsProperties.f15153f);
        if (bVar == null || (bVar.f15192a >= 0 && bVar.f15193b >= 0)) {
            if (qVar.i().f15234b.b(SemanticsProperties.f15141G)) {
                ArrayList arrayList = new ArrayList();
                List listH = q.h(qVarJ, true, 4);
                int size = listH.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar2 = (q) listH.get(i11);
                    if (qVar2.i().f15234b.b(SemanticsProperties.f15141G)) {
                        arrayList.add(qVar2);
                        if (qVar2.f15241c.H() < qVar.f15241c.H()) {
                            i10++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zA = a(arrayList);
                sVar.l(s.f.a(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) qVar.i().v(SemanticsProperties.f15141G, new Ia.a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ Boolean invoke() {
                        return Boolean.FALSE;
                    }
                })).booleanValue()));
            }
        }
    }
}
