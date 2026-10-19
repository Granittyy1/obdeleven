package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.InterfaceC1160f;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: renamed from: androidx.compose.ui.focus.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1119a {
    /* JADX WARN: Code duplicated, block: B:55:0x00ac A[PHI: r0
      0x00ac: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x00aa, B:57:0x00b3, B:60:0x00bb, B:63:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, Ia.l<? super InterfaceC1160f.a, ? extends T> lVar) {
        int i11;
        androidx.compose.ui.h.c cVarB;
        K k10;
        if (!focusTargetNode.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = focusTargetNode.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(focusTargetNode);
        loop0: while (true) {
            i11 = 1;
            if (layoutNodeF == null) {
                cVarB = null;
                break;
            }
            if ((layoutNodeF.f14389G.f14368e.f13988e & 1024) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 1024) != 0) {
                        cVarB = cVar;
                        androidx.compose.runtime.collection.c cVar2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i12 = 0;
                                for (androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                    if ((cVar3.f13987d & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (cVarB != null) {
                                                cVar2.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar2.b(cVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarB = C1185f.b(cVar2);
                        }
                    }
                    cVar = cVar.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
        if (focusTargetNode2 != null) {
            androidx.compose.ui.modifier.h<InterfaceC1160f> hVar = BeyondBoundsLayoutKt.f14170a;
            if (kotlin.jvm.internal.i.a((InterfaceC1160f) focusTargetNode2.s(hVar), (InterfaceC1160f) focusTargetNode.s(hVar))) {
                return null;
            }
        }
        InterfaceC1160f interfaceC1160f = (InterfaceC1160f) focusTargetNode.s(BeyondBoundsLayoutKt.f14170a);
        if (interfaceC1160f == null) {
            return null;
        }
        int i13 = 5;
        if (C1123e.a(i10, 5)) {
            i11 = i13;
        } else {
            i13 = 6;
            if (C1123e.a(i10, 6)) {
                i11 = i13;
            } else {
                i13 = 3;
                if (C1123e.a(i10, 3)) {
                    i11 = i13;
                } else {
                    i13 = 4;
                    if (C1123e.a(i10, 4)) {
                        i11 = i13;
                    } else if (C1123e.a(i10, 1)) {
                        i11 = 2;
                    } else if (!C1123e.a(i10, 2)) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        return (T) interfaceC1160f.r0(lVar, i11);
    }
}
