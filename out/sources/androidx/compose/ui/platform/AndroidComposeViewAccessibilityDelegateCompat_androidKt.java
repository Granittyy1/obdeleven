package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.C0884l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.unit.LayoutDirection;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<androidx.compose.ui.semantics.q>[] f14781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ia.p<androidx.compose.ui.semantics.q, androidx.compose.ui.semantics.q, Integer> f14782b;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f14786b;

        public a(Comparator comparator) {
            LayoutNode.b bVar = LayoutNode.f14379R;
            this.f14786b = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            int iCompare = this.f14786b.compare(t8, t10);
            if (iCompare != 0) {
                return iCompare;
            }
            return LayoutNode.f14382U.compare(((androidx.compose.ui.semantics.q) t8).f15241c, ((androidx.compose.ui.semantics.q) t10).f15241c);
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f14787b;

        public b(a aVar) {
            this.f14787b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            int iCompare = this.f14787b.compare(t8, t10);
            return iCompare != 0 ? iCompare : Cb.a.e(Integer.valueOf(((androidx.compose.ui.semantics.q) t8).f15245g), Integer.valueOf(((androidx.compose.ui.semantics.q) t10).f15245g));
        }
    }

    static {
        Comparator<androidx.compose.ui.semantics.q>[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            Comparator comparator = i10 == 0 ? G0.f14892b : C1241q0.f15087b;
            LayoutNode.b bVar = LayoutNode.f14379R;
            comparatorArr[i10] = new b(new a(comparator));
            i10++;
        }
        f14781a = comparatorArr;
        f14782b = new Ia.p<androidx.compose.ui.semantics.q, androidx.compose.ui.semantics.q, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1
            @Override // Ia.p
            public final Integer invoke(androidx.compose.ui.semantics.q qVar, androidx.compose.ui.semantics.q qVar2) {
                androidx.compose.ui.semantics.l lVar = qVar.f15242d;
                androidx.compose.ui.semantics.v<Float> vVar = SemanticsProperties.f15164r;
                return Integer.valueOf(Float.compare(((Number) lVar.v(vVar, new Ia.a<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.1
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) qVar2.f15242d.v(vVar, new Ia.a<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.2
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    public static final boolean a(androidx.compose.ui.semantics.q qVar) {
        return !qVar.i().f15234b.b(SemanticsProperties.f15156i);
    }

    public static final LayoutNode b(LayoutNode layoutNode, Ia.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode layoutNodeG = layoutNode.G(); layoutNodeG != null; layoutNodeG = layoutNodeG.G()) {
            if (lVar.invoke(layoutNodeG).booleanValue()) {
                return layoutNodeG;
            }
        }
        return null;
    }

    public static final void c(androidx.compose.ui.semantics.q qVar, ArrayList arrayList, androidx.collection.B b10, androidx.collection.B b11, Resources resources) {
        boolean zG = g(qVar);
        boolean zBooleanValue = ((Boolean) qVar.f15242d.v(SemanticsProperties.f15159m, new Ia.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        int i10 = qVar.f15245g;
        if ((zBooleanValue || h(qVar, resources)) && b11.a(i10)) {
            arrayList.add(qVar);
        }
        if (zBooleanValue) {
            b10.h(i10, i(zG, androidx.compose.ui.semantics.q.h(qVar, false, 7), b11, resources));
            return;
        }
        List listH = androidx.compose.ui.semantics.q.h(qVar, false, 7);
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            c((androidx.compose.ui.semantics.q) listH.get(i11), arrayList, b10, b11, resources);
        }
    }

    public static final boolean d(androidx.compose.ui.semantics.q qVar) {
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(qVar.f15242d, SemanticsProperties.f15142H);
        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.i> vVar = SemanticsProperties.f15169w;
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar, vVar);
        boolean z10 = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15141G)) != null) {
            return iVar != null ? androidx.compose.ui.semantics.i.a(iVar.f15203a, 4) : false ? z10 : true;
        }
        return z10;
    }

    public static final String e(androidx.compose.ui.semantics.q qVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object objA = SemanticsConfigurationKt.a(qVar.f15242d, SemanticsProperties.f15149b);
        androidx.compose.ui.semantics.v<ToggleableState> vVar = SemanticsProperties.f15142H;
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(lVar, vVar);
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15169w);
        int iD = 0;
        if (toggleableState != null) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.a(iVar.f15203a, 2)) && objA == null) {
                    objA = resources.getString(R.string.state_on);
                }
            } else if (iOrdinal == 1) {
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.a(iVar.f15203a, 2)) && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (iOrdinal == 2 && objA == null) {
                objA = resources.getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15141G);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(iVar == null ? false : androidx.compose.ui.semantics.i.a(iVar.f15203a, 4)) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15150c);
        if (hVar != null) {
            if (hVar != androidx.compose.ui.semantics.h.f15199d) {
                if (objA == null) {
                    Na.d dVar = hVar.f15201b;
                    float fFloatValue = Float.valueOf(dVar.f4686c).floatValue();
                    float f10 = dVar.f4685b;
                    float fFloatValue2 = ((fFloatValue - Float.valueOf(f10).floatValue()) > 0.0f ? 1 : ((fFloatValue - Float.valueOf(f10).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (hVar.f15200a - Float.valueOf(f10).floatValue()) / (Float.valueOf(dVar.f4686c).floatValue() - Float.valueOf(f10).floatValue());
                    if (fFloatValue2 < 0.0f) {
                        fFloatValue2 = 0.0f;
                    }
                    if (fFloatValue2 > 1.0f) {
                        fFloatValue2 = 1.0f;
                    }
                    if (!(fFloatValue2 == 0.0f)) {
                        iD = (fFloatValue2 == 1.0f ? 1 : 0) != 0 ? 100 : Na.l.D(Math.round(fFloatValue2 * 100), 1, 99);
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(iD));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        androidx.compose.ui.semantics.v<C1260a> vVar2 = SemanticsProperties.f15138D;
        if (lVar.f15234b.b(vVar2)) {
            androidx.compose.ui.semantics.l lVarI = new androidx.compose.ui.semantics.q(qVar.f15239a, true, qVar.f15241c, lVar).i();
            Collection collection2 = (Collection) SemanticsConfigurationKt.a(lVarI, SemanticsProperties.f15148a);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) SemanticsConfigurationKt.a(lVarI, SemanticsProperties.f15172z)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) SemanticsConfigurationKt.a(lVarI, vVar2)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) objA;
    }

    public static final C1260a f(androidx.compose.ui.semantics.q qVar) {
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
        C1260a c1260a = (C1260a) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15138D);
        List list = (List) SemanticsConfigurationKt.a(qVar.f15242d, SemanticsProperties.f15172z);
        return c1260a == null ? list != null ? (C1260a) kotlin.collections.q.P(list) : null : c1260a;
    }

    public static final boolean g(androidx.compose.ui.semantics.q qVar) {
        return qVar.f15241c.f14383A == LayoutDirection.f15718c;
    }

    public static final boolean h(androidx.compose.ui.semantics.q qVar, Resources resources) {
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
        List list = (List) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15148a);
        boolean z10 = ((list != null ? (String) kotlin.collections.q.P(list) : null) == null && f(qVar) == null && e(qVar, resources) == null && !d(qVar)) ? false : true;
        if (!K0.e(qVar)) {
            if (qVar.f15242d.f15236d) {
                return true;
            }
            if (qVar.m() && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c9 A[EDGE_INSN: B:28:0x00c9->B:29:0x00dd BREAK  A[LOOP:2: B:17:0x005c->B:27:0x00c7]] */
    public static final ArrayList i(boolean z10, List list, androidx.collection.B b10, Resources resources) {
        androidx.collection.B b11 = C0884l.f9191a;
        androidx.collection.B b12 = new androidx.collection.B();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c((androidx.compose.ui.semantics.q) list.get(i10), arrayList, b12, b10, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iR = kotlin.collections.l.r(arrayList);
        if (iR >= 0) {
            int i11 = 0;
            while (true) {
                androidx.compose.ui.semantics.q qVar = (androidx.compose.ui.semantics.q) arrayList.get(i11);
                if (i11 == 0) {
                    arrayList2.add(new Pair(qVar.f(), kotlin.collections.l.t(qVar)));
                    break;
                }
                I.f fVarF = qVar.f();
                I.f fVarF2 = qVar.f();
                float f10 = fVarF.f3758b;
                float f11 = fVarF2.f3760d;
                boolean z11 = f10 >= f11;
                int iR2 = kotlin.collections.l.r(arrayList2);
                if (iR2 < 0) {
                    arrayList2.add(new Pair(qVar.f(), kotlin.collections.l.t(qVar)));
                    break;
                }
                int i12 = 0;
                while (true) {
                    I.f fVar = (I.f) ((Pair) arrayList2.get(i12)).c();
                    float f12 = fVar.f3758b;
                    float f13 = fVar.f3760d;
                    boolean z12 = f12 >= f13;
                    if (!z11 && !z12 && Math.max(f10, f12) < Math.min(f11, f13)) {
                        arrayList2.set(i12, new Pair(new I.f(Math.max(fVar.f3757a, 0.0f), Math.max(fVar.f3758b, f10), Math.min(fVar.f3759c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((Pair) arrayList2.get(i12)).d()));
                        ((List) ((Pair) arrayList2.get(i12)).d()).add(qVar);
                        break;
                    }
                    if (i12 == iR2) {
                        arrayList2.add(new Pair(qVar.f(), kotlin.collections.l.t(qVar)));
                        break;
                    }
                    i12++;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        kotlin.collections.p.G(arrayList2, Q0.f14945b);
        ArrayList arrayList3 = new ArrayList();
        Comparator<androidx.compose.ui.semantics.q> comparator = f14781a[!z10 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Pair pair = (Pair) arrayList2.get(i13);
            kotlin.collections.p.G((List) pair.d(), comparator);
            arrayList3.addAll((Collection) pair.d());
        }
        int size3 = 0;
        kotlin.collections.p.G(arrayList3, new r(0, f14782b));
        while (size3 <= kotlin.collections.l.r(arrayList3)) {
            List list2 = (List) b12.b(((androidx.compose.ui.semantics.q) arrayList3.get(size3)).f15245g);
            if (list2 != null) {
                if (h((androidx.compose.ui.semantics.q) arrayList3.get(size3), resources)) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
