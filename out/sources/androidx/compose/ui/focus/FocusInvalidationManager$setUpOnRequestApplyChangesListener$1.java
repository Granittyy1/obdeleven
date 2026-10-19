package androidx.compose.ui.focus;

import androidx.collection.L;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0;

/* JADX INFO: compiled from: FocusInvalidationManager.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
    /* JADX WARN: Code duplicated, block: B:16:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[LOOP:0: B:7:0x0028->B:17:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0128 A[EDGE_INSN: B:72:0x0128->B:70:0x0128 BREAK  A[LOOP:0: B:7:0x0028->B:17:0x0062], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // Ia.a
    public final p293xa.r invoke() {
        K k10;
        androidx.compose.ui.h.c cVar;
        l lVar = (l) this.receiver;
        FocusTargetNode focusTargetNode = (FocusTargetNode) ((MutablePropertyReference0) lVar.f13455d).get();
        L<FocusTargetNode> l10 = lVar.f13456e;
        char c10 = 7;
        long j = -9187201950435737472L;
        L<i> l11 = lVar.f13457f;
        if (focusTargetNode == null) {
            Object[] objArr = l11.f9123b;
            long[] jArr = l11.f9122a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & j) == j) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                        j = -9187201950435737472L;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j10 & 255) < 128) {
                                ((i) objArr[(i10 << 3) + i12]).V0(FocusStateImpl.f13437e);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 != length) {
                            break;
                        }
                        i10++;
                        j = -9187201950435737472L;
                    }
                }
            }
        } else if (focusTargetNode.f13997o) {
            if (l10.a(focusTargetNode)) {
                focusTargetNode.T1();
            }
            FocusStateImpl focusStateImplC0 = focusTargetNode.c0();
            if (!focusTargetNode.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar2 = focusTargetNode.f13985b;
            LayoutNode layoutNodeF = C1185f.f(focusTargetNode);
            int i13 = 0;
            while (layoutNodeF != null) {
                if ((layoutNodeF.f14389G.f14368e.f13988e & 5120) != 0) {
                    while (cVar != null) {
                        int i14 = cVar.f13987d;
                        if ((i14 & 5120) != 0) {
                            if ((i14 & 1024) != 0) {
                                i13++;
                            }
                            if ((cVar instanceof i) && l11.a((i) cVar)) {
                                if (i13 <= 1) {
                                    ((i) cVar).V0(focusStateImplC0);
                                } else {
                                    ((i) cVar).V0(FocusStateImpl.f13435c);
                                }
                                l11.l((i) cVar);
                            }
                        }
                        cVar = cVar.f13989f;
                    }
                }
                cVar = cVar2;
                layoutNodeF = layoutNodeF.G();
                cVar2 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
            }
            Object[] objArr2 = l11.f9123b;
            long[] jArr2 = l11.f9122a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr2[i15];
                    if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & 255) < 128) {
                                ((i) objArr2[(i15 << 3) + i17]).V0(FocusStateImpl.f13437e);
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length2) {
                        break;
                    }
                    i15++;
                    c10 = 7;
                }
            }
        }
        ((FocusOwnerImpl$focusInvalidationManager$1) lVar.f13453b).invoke();
        l10.e();
        l11.e();
        lVar.f13458g = false;
        return p293xa.r.f47939a;
    }
}
