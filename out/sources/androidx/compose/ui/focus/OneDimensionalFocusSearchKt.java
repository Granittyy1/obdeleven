package androidx.compose.ui.focus;

import androidx.compose.ui.layout.InterfaceC1160f;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    public static final boolean a(FocusTargetNode focusTargetNode, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.c0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(focusTargetNodeC, lVar) && !c(focusTargetNode, focusTargetNodeC, 2, lVar) && (!focusTargetNodeC.R1().f13459a || !lVar.invoke(focusTargetNodeC).booleanValue())) {
                        return false;
                    }
                }
                return c(focusTargetNode, focusTargetNodeC, 2, lVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!d(focusTargetNode, lVar)) {
                    if (!(focusTargetNode.R1().f13459a ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return d(focusTargetNode, lVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return b(focusTargetNodeC, lVar) || c(focusTargetNode, focusTargetNodeC, 1, lVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.R1().f13459a ? lVar.invoke(focusTargetNode).booleanValue() : e(focusTargetNode, lVar);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return e(focusTargetNode, lVar);
    }

    public static final boolean c(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i10, final Ia.l<? super FocusTargetNode, Boolean> lVar) {
        if (f(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        final B bK = C1185f.g(focusTargetNode).getFocusOwner().k();
        bK.getClass();
        final FocusTargetNode focusTargetNodeR = C1185f.g(focusTargetNode).getFocusOwner().r();
        Boolean bool = (Boolean) C1119a.a(focusTargetNode, i10, new Ia.l<InterfaceC1160f.a, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            final /* synthetic */ int $generationBeforeSearch = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(InterfaceC1160f.a aVar) {
                InterfaceC1160f.a aVar2 = aVar;
                int i11 = this.$generationBeforeSearch;
                bK.getClass();
                if (i11 != 0 || focusTargetNodeR != C1185f.g(focusTargetNode).getFocusOwner().r()) {
                    return Boolean.TRUE;
                }
                boolean zF = OneDimensionalFocusSearchKt.f(focusTargetNode, focusTargetNode2, i10, lVar);
                Boolean boolValueOf = Boolean.valueOf(zF);
                if (zF || !aVar2.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.f13985b.f13997o) {
            R.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar2 = focusTargetNode.f13985b;
        androidx.compose.ui.h.c cVar3 = cVar2.f13990g;
        if (cVar3 == null) {
            C1185f.a(cVar, cVar2);
        } else {
            cVar.b(cVar3);
        }
        int i10 = 0;
        while (true) {
            int i11 = cVar.f12945d;
            if (i11 == 0) {
                break;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar.p(i11 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar4 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = focusTargetNode2;
                                i10 = i12;
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i13 = 0;
                                for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                    if ((cVar5.f13987d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            cVarB = cVar5;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (cVarB != null) {
                                                cVar4.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar4.b(cVar5);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            cVarB = C1185f.b(cVar4);
                        }
                        break;
                    }
                    cVarB = cVarB.f13990g;
                }
            }
        }
        Arrays.sort(objArr, 0, i10, E.f13410b);
        int i14 = i10 - 1;
        if (i14 < objArr.length) {
            while (i14 >= 0) {
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i14];
                if (D.d(focusTargetNode3) && a(focusTargetNode3, lVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.f13985b.f13997o) {
            R.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar2 = focusTargetNode.f13985b;
        androidx.compose.ui.h.c cVar3 = cVar2.f13990g;
        if (cVar3 == null) {
            C1185f.a(cVar, cVar2);
        } else {
            cVar.b(cVar3);
        }
        int i10 = 0;
        while (true) {
            int i11 = cVar.f12945d;
            if (i11 == 0) {
                break;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar.p(i11 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar4 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = focusTargetNode2;
                                i10 = i12;
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i13 = 0;
                                for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                    if ((cVar5.f13987d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            cVarB = cVar5;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (cVarB != null) {
                                                cVar4.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar4.b(cVar5);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            cVarB = C1185f.b(cVar4);
                        }
                        break;
                    }
                    cVarB = cVarB.f13990g;
                }
            }
        }
        Arrays.sort(objArr, 0, i10, E.f13410b);
        for (int i14 = 0; i14 < i10; i14++) {
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i14];
            if (D.d(focusTargetNode3) && b(focusTargetNode3, lVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        androidx.compose.ui.h.c cVar;
        K k10;
        if (focusTargetNode.c0() != FocusStateImpl.f13435c) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.f13985b.f13997o) {
            R.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar3 = focusTargetNode.f13985b;
        androidx.compose.ui.h.c cVar4 = cVar3.f13990g;
        if (cVar4 == null) {
            C1185f.a(cVar2, cVar3);
        } else {
            cVar2.b(cVar4);
        }
        int i11 = 0;
        while (true) {
            int i12 = cVar2.f12945d;
            cVar = null;
            if (i12 == 0) {
                break;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i12 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar5 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarB;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = focusTargetNode3;
                                i11 = i13;
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i14 = 0;
                                for (androidx.compose.ui.h.c cVar6 = ((AbstractC1187h) cVarB).f14585q; cVar6 != null; cVar6 = cVar6.f13990g) {
                                    if ((cVar6.f13987d & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB = cVar6;
                                        } else {
                                            if (cVar5 == null) {
                                                cVar5 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (cVarB != null) {
                                                cVar5.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar5.b(cVar6);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            cVarB = C1185f.b(cVar5);
                        }
                        break;
                    }
                    cVarB = cVarB.f13990g;
                }
            }
        }
        Arrays.sort(objArr, 0, i11, E.f13410b);
        if (C1123e.a(i10, 1)) {
            Na.i iVarJ = Na.l.J(0, i11);
            int i15 = iVarJ.f4687b;
            int i16 = iVarJ.f4688c;
            if (i15 <= i16) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr[i15];
                        if (D.d(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.i.a(objArr[i15], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            if (!C1123e.a(i10, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            Na.i iVarJ2 = Na.l.J(0, i11);
            int i17 = iVarJ2.f4687b;
            int i18 = iVarJ2.f4688c;
            if (i17 <= i18) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode5 = (FocusTargetNode) objArr[i18];
                        if (D.d(focusTargetNode5) && a(focusTargetNode5, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.i.a(objArr[i18], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18--;
                }
            }
        }
        if (!C1123e.a(i10, 1) && focusTargetNode.R1().f13459a) {
            if (!focusTargetNode.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar7 = focusTargetNode.f13985b.f13989f;
            LayoutNode layoutNodeF = C1185f.f(focusTargetNode);
            loop5: while (layoutNodeF != null) {
                if ((layoutNodeF.f14389G.f14368e.f13988e & 1024) != 0) {
                    while (cVar7 != null) {
                        if ((cVar7.f13987d & 1024) != 0) {
                            androidx.compose.ui.h.c cVarB2 = cVar7;
                            androidx.compose.runtime.collection.c cVar8 = null;
                            while (cVarB2 != null) {
                                if (cVarB2 instanceof FocusTargetNode) {
                                    cVar = cVarB2;
                                    break loop5;
                                }
                                if ((cVarB2.f13987d & 1024) != 0 && (cVarB2 instanceof AbstractC1187h)) {
                                    int i19 = 0;
                                    for (androidx.compose.ui.h.c cVar9 = ((AbstractC1187h) cVarB2).f14585q; cVar9 != null; cVar9 = cVar9.f13990g) {
                                        if ((cVar9.f13987d & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                cVarB2 = cVar9;
                                            } else {
                                                if (cVar8 == null) {
                                                    cVar8 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (cVarB2 != null) {
                                                    cVar8.b(cVarB2);
                                                    cVarB2 = null;
                                                }
                                                cVar8.b(cVar9);
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                cVarB2 = C1185f.b(cVar8);
                            }
                        }
                        cVar7 = cVar7.f13989f;
                    }
                }
                layoutNodeF = layoutNodeF.G();
                cVar7 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
            }
            if (cVar != null) {
                return lVar.invoke(focusTargetNode).booleanValue();
            }
        }
        return false;
    }
}
