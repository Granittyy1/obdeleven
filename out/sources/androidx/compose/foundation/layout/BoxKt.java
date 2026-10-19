package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> f10095a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> f10096b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BoxKt$EmptyBoxMeasurePolicy$1 f10097c;

    static {
        new BoxMeasurePolicy(androidx.compose.ui.d.a.f13335a, false);
        f10097c = BoxKt$EmptyBoxMeasurePolicy$1.f10098a;
    }

    public static final void a(final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            int i12 = c1086gP.f12996P;
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, f10097c);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            c1086gP.T(true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BoxKt.a(hVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.layout.Y.a aVar, androidx.compose.ui.layout.Y y10, androidx.compose.ui.layout.D d10, LayoutDirection layoutDirection, int i10, int i11, androidx.compose.ui.d dVar) {
        androidx.compose.ui.f fVar;
        Object objQ = d10.q();
        C0947g c0947g = objQ instanceof C0947g ? (C0947g) objQ : null;
        androidx.compose.ui.layout.Y.a.f(aVar, y10, ((c0947g == null || (fVar = c0947g.f10302p) == null) ? dVar : fVar).a((((long) y10.f14220b) << 32) | (((long) y10.f14221c) & 4294967295L), (((long) i10) << 32) | (((long) i11) & 4294967295L), layoutDirection));
    }

    public static final androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> c(boolean z10) {
        androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> k10 = new androidx.collection.K<>(9);
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
        k10.l(fVar, new BoxMeasurePolicy(fVar, z10));
        androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13336b;
        k10.l(fVar2, new BoxMeasurePolicy(fVar2, z10));
        androidx.compose.ui.f fVar3 = androidx.compose.ui.d.a.f13337c;
        k10.l(fVar3, new BoxMeasurePolicy(fVar3, z10));
        androidx.compose.ui.f fVar4 = androidx.compose.ui.d.a.f13338d;
        k10.l(fVar4, new BoxMeasurePolicy(fVar4, z10));
        androidx.compose.ui.f fVar5 = androidx.compose.ui.d.a.f13339e;
        k10.l(fVar5, new BoxMeasurePolicy(fVar5, z10));
        androidx.compose.ui.f fVar6 = androidx.compose.ui.d.a.f13340f;
        k10.l(fVar6, new BoxMeasurePolicy(fVar6, z10));
        androidx.compose.ui.f fVar7 = androidx.compose.ui.d.a.f13341g;
        k10.l(fVar7, new BoxMeasurePolicy(fVar7, z10));
        androidx.compose.ui.f fVar8 = androidx.compose.ui.d.a.f13342h;
        k10.l(fVar8, new BoxMeasurePolicy(fVar8, z10));
        androidx.compose.ui.f fVar9 = androidx.compose.ui.d.a.f13343i;
        k10.l(fVar9, new BoxMeasurePolicy(fVar9, z10));
        return k10;
    }

    public static final androidx.compose.ui.layout.E d(androidx.compose.ui.d dVar, boolean z10) {
        androidx.compose.ui.layout.E eD = (z10 ? f10095a : f10096b).d(dVar);
        return eD == null ? new BoxMeasurePolicy(dVar, z10) : eD;
    }
}
