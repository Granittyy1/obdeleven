package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.collection.C0884l;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I.f f14937a = new I.f(0.0f, 0.0f, 10.0f, 10.0f);

    public static final H0 a(int i10, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((H0) arrayList.get(i11)).f14917b == i10) {
                return (H0) arrayList.get(i11);
            }
        }
        return null;
    }

    public static final androidx.collection.B b(androidx.compose.ui.semantics.s sVar) {
        androidx.compose.ui.semantics.q qVarA = sVar.a();
        LayoutNode layoutNode = qVarA.f15241c;
        if (!layoutNode.r() || !layoutNode.c()) {
            androidx.collection.B b10 = C0884l.f9191a;
            kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return b10;
        }
        androidx.collection.B b11 = new androidx.collection.B(48);
        I.f fVarE = qVarA.e();
        c(new Region(Math.round(fVarE.f3757a), Math.round(fVarE.f3758b), Math.round(fVarE.f3759c), Math.round(fVarE.f3760d)), qVarA, b11, qVarA, new Region());
        return b11;
    }

    public static final void c(Region region, androidx.compose.ui.semantics.q qVar, androidx.collection.B<J0> b10, androidx.compose.ui.semantics.q qVar2, Region region2) {
        LayoutNode layoutNode;
        androidx.compose.ui.node.b0 b0VarB;
        boolean zR = qVar2.f15241c.r();
        LayoutNode layoutNode2 = qVar2.f15241c;
        boolean z10 = (zR && layoutNode2.c()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i10 = qVar.f15245g;
        int i11 = qVar2.f15245g;
        if (!zIsEmpty || i11 == i10) {
            if (!z10 || qVar2.f15243e) {
                androidx.compose.ui.semantics.l lVar = qVar2.f15242d;
                boolean z11 = lVar.f15236d;
                InterfaceC1184e interfaceC1184e = qVar2.f15239a;
                if (z11 && (b0VarB = androidx.compose.ui.semantics.r.b(layoutNode2)) != null) {
                    interfaceC1184e = b0VarB;
                }
                androidx.compose.ui.h.c node = interfaceC1184e.getNode();
                boolean z12 = SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15210b) != null;
                boolean z13 = node.f13985b.f13997o;
                I.f fVar = I.f.f3756e;
                if (z13) {
                    if (z12) {
                        NodeCoordinator nodeCoordinatorD = C1185f.d(node, 8);
                        if (nodeCoordinatorD.v1().f13997o) {
                            InterfaceC1170p interfaceC1170pH = kotlin.jvm.internal.n.h(nodeCoordinatorD);
                            I.c cVar = nodeCoordinatorD.f14516C;
                            if (cVar == null) {
                                cVar = new I.c();
                                nodeCoordinatorD.f14516C = cVar;
                            }
                            long jB1 = nodeCoordinatorD.b1(nodeCoordinatorD.u1());
                            int i12 = (int) (jB1 >> 32);
                            cVar.f3750a = -Float.intBitsToFloat(i12);
                            int i13 = (int) (jB1 & 4294967295L);
                            cVar.f3751b = -Float.intBitsToFloat(i13);
                            cVar.f3752c = Float.intBitsToFloat(i12) + nodeCoordinatorD.o0();
                            cVar.f3753d = Float.intBitsToFloat(i13) + nodeCoordinatorD.l0();
                            while (true) {
                                if (nodeCoordinatorD == interfaceC1170pH) {
                                    fVar = new I.f(cVar.f3750a, cVar.f3751b, cVar.f3752c, cVar.f3753d);
                                    break;
                                }
                                nodeCoordinatorD.Q1(cVar, false, true);
                                if (cVar.b()) {
                                    break;
                                }
                                nodeCoordinatorD = nodeCoordinatorD.f14529r;
                                kotlin.jvm.internal.i.b(nodeCoordinatorD);
                            }
                        }
                    } else {
                        NodeCoordinator nodeCoordinatorD2 = C1185f.d(node, 8);
                        fVar = kotlin.jvm.internal.n.h(nodeCoordinatorD2).H(nodeCoordinatorD2, true);
                    }
                }
                int iRound = Math.round(fVar.f3757a);
                int iRound2 = Math.round(fVar.f3758b);
                int iRound3 = Math.round(fVar.f3759c);
                int iRound4 = Math.round(fVar.f3760d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (qVar2.f15243e) {
                        androidx.compose.ui.semantics.q qVarJ = qVar2.j();
                        I.f fVarE = (qVarJ == null || (layoutNode = qVarJ.f15241c) == null || !layoutNode.r()) ? f14937a : qVarJ.e();
                        b10.h(i11, new J0(qVar2, new Rect(Math.round(fVarE.f3757a), Math.round(fVarE.f3758b), Math.round(fVarE.f3759c), Math.round(fVarE.f3760d))));
                        return;
                    } else {
                        if (i11 == -1) {
                            b10.h(i11, new J0(qVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                b10.h(i11, new J0(qVar2, region2.getBounds()));
                List listH = androidx.compose.ui.semantics.q.h(qVar2, true, 4);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    if (!((androidx.compose.ui.semantics.q) listH.get(size)).i().f15234b.b(SemanticsProperties.f15171y)) {
                        c(region, qVar, b10, (androidx.compose.ui.semantics.q) listH.get(size), region2);
                    }
                }
                if (f(qVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final androidx.compose.ui.text.B d(androidx.compose.ui.semantics.l lVar) {
        Ia.l lVar2;
        ArrayList arrayList = new ArrayList();
        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15209a);
        if (aVar == null || (lVar2 = (Ia.l) aVar.f15191b) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.B) arrayList.get(0);
    }

    public static final boolean e(androidx.compose.ui.semantics.q qVar) {
        NodeCoordinator nodeCoordinatorC = qVar.c();
        if (!(nodeCoordinatorC != null ? nodeCoordinatorC.H1() : false)) {
            androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
            androidx.compose.ui.semantics.v<p293xa.r> vVar2 = SemanticsProperties.f15161o;
            androidx.compose.ui.semantics.l lVar = qVar.f15242d;
            if (!lVar.f15234b.b(vVar2)) {
                if (!lVar.f15234b.b(SemanticsProperties.f15160n)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean f(androidx.compose.ui.semantics.q qVar) {
        if (e(qVar)) {
            return false;
        }
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        if (!lVar.f15236d) {
            androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVar.f15234b;
            Object[] objArr = k10.f9128b;
            Object[] objArr2 = k10.f9129c;
            long[] jArr = k10.f9127a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i10 = 0;
            loop0: while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (((androidx.compose.ui.semantics.v) obj).f15255c) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        return false;
                    }
                }
                if (i10 == length) {
                    return false;
                }
                i10++;
            }
        }
        return true;
    }

    public static final AndroidViewHolder g(L l10, int i10) {
        Object next;
        Iterator<T> it = l10.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).f14401c != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String h(int i10) {
        if (androidx.compose.ui.semantics.i.a(i10, 0)) {
            return "android.widget.Button";
        }
        if (androidx.compose.ui.semantics.i.a(i10, 1)) {
            return "android.widget.CheckBox";
        }
        if (androidx.compose.ui.semantics.i.a(i10, 3)) {
            return "android.widget.RadioButton";
        }
        if (androidx.compose.ui.semantics.i.a(i10, 5)) {
            return "android.widget.ImageView";
        }
        if (androidx.compose.ui.semantics.i.a(i10, 6)) {
            return "android.widget.Spinner";
        }
        if (androidx.compose.ui.semantics.i.a(i10, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
