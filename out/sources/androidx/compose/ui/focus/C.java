package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.P;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal == 0) {
            C1185f.g(focusTargetNode).getFocusOwner().n(null);
            if (z11) {
                focusTargetNode.Q1(FocusStateImpl.f13434b, FocusStateImpl.f13437e);
            }
        } else if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
            if (!(focusTargetNodeC != null ? a(focusTargetNodeC, z10, z11) : true)) {
                return false;
            }
            if (z11) {
                focusTargetNode.Q1(FocusStateImpl.f13435c, FocusStateImpl.f13437e);
            }
        } else {
            if (iOrdinal == 2) {
                if (!z10) {
                    return z10;
                }
                C1185f.g(focusTargetNode).getFocusOwner().n(null);
                if (!z11) {
                    return z10;
                }
                focusTargetNode.Q1(FocusStateImpl.f13436d, FocusStateImpl.f13437e);
                return z10;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public static final CustomDestinationResult b(FocusTargetNode focusTargetNode, int i10) {
        CustomDestinationResult customDestinationResult;
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult customDestinationResultB = b(focusTargetNodeC, i10);
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.f13406b;
                if (customDestinationResultB == customDestinationResult2) {
                    customDestinationResultB = null;
                }
                if (customDestinationResultB != null) {
                    return customDestinationResultB;
                }
                if (!focusTargetNode.f13441r) {
                    focusTargetNode.f13441r = true;
                    try {
                        r rVarR1 = focusTargetNode.R1();
                        C1120b c1120b = new C1120b(i10);
                        A.a(focusTargetNode);
                        p focusOwner = C1185f.g(focusTargetNode).getFocusOwner();
                        FocusTargetNode focusTargetNodeR = focusOwner.r();
                        rVarR1.f13468k.invoke(c1120b);
                        FocusTargetNode focusTargetNodeR2 = focusOwner.r();
                        if (c1120b.f13446b) {
                            FocusRequester focusRequester = FocusRequester.f13428b;
                            customDestinationResult = CustomDestinationResult.f13407c;
                        } else if (focusTargetNodeR != focusTargetNodeR2 && focusTargetNodeR2 != null) {
                            customDestinationResult = FocusRequester.f13430d == FocusRequester.f13429c ? CustomDestinationResult.f13407c : CustomDestinationResult.f13408d;
                        }
                        return customDestinationResult;
                    } finally {
                        focusTargetNode.f13441r = false;
                    }
                }
                return customDestinationResult2;
            }
            if (iOrdinal == 2) {
                return CustomDestinationResult.f13407c;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.f13406b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public static final CustomDestinationResult c(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f13442s) {
            focusTargetNode.f13442s = true;
            try {
                r rVarR1 = focusTargetNode.R1();
                C1120b c1120b = new C1120b(i10);
                A.a(focusTargetNode);
                p focusOwner = C1185f.g(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeR = focusOwner.r();
                rVarR1.j.invoke(c1120b);
                FocusTargetNode focusTargetNodeR2 = focusOwner.r();
                if (c1120b.f13446b) {
                    FocusRequester focusRequester = FocusRequester.f13428b;
                    return CustomDestinationResult.f13407c;
                }
                if (focusTargetNodeR != focusTargetNodeR2 && focusTargetNodeR2 != null) {
                    return FocusRequester.f13430d == FocusRequester.f13429c ? CustomDestinationResult.f13407c : CustomDestinationResult.f13408d;
                }
            } finally {
                focusTargetNode.f13442s = false;
            }
        }
        return CustomDestinationResult.f13406b;
    }

    public static final CustomDestinationResult d(FocusTargetNode focusTargetNode, int i10) {
        androidx.compose.ui.h.c cVarB;
        K k10;
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return b(focusTargetNodeC, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!focusTargetNode.f13985b.f13997o) {
                    R.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.h.c cVar = focusTargetNode.f13985b.f13989f;
                LayoutNode layoutNodeF = C1185f.f(focusTargetNode);
                loop0: while (true) {
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
                                        int i11 = 0;
                                        for (androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                            if ((cVar3.f13987d & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
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
                if (focusTargetNode2 == null) {
                    return CustomDestinationResult.f13406b;
                }
                int iOrdinal2 = focusTargetNode2.c0().ordinal();
                if (iOrdinal2 == 0) {
                    return c(focusTargetNode2, i10);
                }
                if (iOrdinal2 == 1) {
                    return d(focusTargetNode2, i10);
                }
                if (iOrdinal2 == 2) {
                    return CustomDestinationResult.f13407c;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomDestinationResult customDestinationResultD = d(focusTargetNode2, i10);
                CustomDestinationResult customDestinationResult = customDestinationResultD != CustomDestinationResult.f13406b ? customDestinationResultD : null;
                return customDestinationResult == null ? c(focusTargetNode2, i10) : customDestinationResult;
            }
        }
        return CustomDestinationResult.f13406b;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01db  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e0 A[ADDED_TO_REGION, LOOP:9: B:137:0x01e0->B:144:0x01f5, LOOP_START, PHI: r12
      0x01e0: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:136:0x01de, B:144:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0205  */
    /* JADX WARN: Code duplicated, block: B:187:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(final FocusTargetNode focusTargetNode) {
        androidx.compose.runtime.collection.c cVar;
        int i10;
        FocusTargetNode focusTargetNode2;
        FocusStateImpl focusStateImpl;
        K k10;
        char c10;
        K k11;
        p focusOwner = C1185f.g(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeR = focusOwner.r();
        FocusStateImpl focusStateImplC0 = focusTargetNode.c0();
        if (focusTargetNodeR == focusTargetNode) {
            focusTargetNode.Q1(focusStateImplC0, focusStateImplC0);
            return true;
        }
        int i11 = 0;
        if (focusTargetNodeR != null || C1185f.g(focusTargetNode).getFocusOwner().t()) {
            char c11 = 16;
            if (focusTargetNodeR != null) {
                cVar = new androidx.compose.runtime.collection.c(new FocusTargetNode[16]);
                if (!focusTargetNodeR.f13985b.f13997o) {
                    R.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.h.c cVar2 = focusTargetNodeR.f13985b.f13989f;
                LayoutNode layoutNodeF = C1185f.f(focusTargetNodeR);
                while (layoutNodeF != null) {
                    if ((layoutNodeF.f14389G.f14368e.f13988e & 1024) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.f13987d & 1024) != 0) {
                                androidx.compose.ui.h.c cVarB = cVar2;
                                androidx.compose.runtime.collection.c cVar3 = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof FocusTargetNode) {
                                        cVar.b((FocusTargetNode) cVarB);
                                    } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                        int i12 = 0;
                                        for (androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) cVarB).f14585q; cVar4 != null; cVar4 = cVar4.f13990g) {
                                            if ((cVar4.f13987d & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVarB = cVar4;
                                                } else {
                                                    if (cVar3 == null) {
                                                        cVar3 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        cVar3.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    cVar3.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarB = C1185f.b(cVar3);
                                }
                            }
                            cVar2 = cVar2.f13989f;
                        }
                    }
                    layoutNodeF = layoutNodeF.G();
                    cVar2 = (layoutNodeF == null || (k11 = layoutNodeF.f14389G) == null) ? null : k11.f14367d;
                }
            } else {
                cVar = null;
            }
            Object[] objArr = new FocusTargetNode[16];
            if (!focusTargetNode.f13985b.f13997o) {
                R.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.h.c cVar5 = focusTargetNode.f13985b.f13989f;
            LayoutNode layoutNodeF2 = C1185f.f(focusTargetNode);
            int i13 = 1;
            int i14 = 0;
            while (layoutNodeF2 != null) {
                if ((layoutNodeF2.f14389G.f14368e.f13988e & 1024) != 0) {
                    while (cVar5 != null) {
                        if ((cVar5.f13987d & 1024) != 0) {
                            androidx.compose.ui.h.c cVarB2 = cVar5;
                            androidx.compose.runtime.collection.c cVar6 = null;
                            while (cVarB2 != null) {
                                if (cVarB2 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarB2;
                                    Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.m(focusTargetNode3)) : null;
                                    if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                        int i15 = i14 + 1;
                                        if (objArr.length < i15) {
                                            int length = objArr.length;
                                            Object[] objArr2 = new Object[Math.max(i15, length * 2)];
                                            System.arraycopy(objArr, i11, objArr2, i11, length);
                                            objArr = objArr2;
                                        }
                                        objArr[i14] = focusTargetNode3;
                                        i14 = i15;
                                    }
                                    if (focusTargetNode3 == focusTargetNodeR) {
                                        i13 = i11;
                                    }
                                } else {
                                    if ((cVarB2.f13987d & 1024) != 0 && (cVarB2 instanceof AbstractC1187h)) {
                                        int i16 = i11;
                                        for (androidx.compose.ui.h.c cVar7 = ((AbstractC1187h) cVarB2).f14585q; cVar7 != null; cVar7 = cVar7.f13990g) {
                                            if ((cVar7.f13987d & 1024) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    cVarB2 = cVar7;
                                                } else {
                                                    if (cVar6 == null) {
                                                        cVar6 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                    }
                                                    if (cVarB2 != null) {
                                                        cVar6.b(cVarB2);
                                                        cVarB2 = null;
                                                    }
                                                    cVar6.b(cVar7);
                                                }
                                            }
                                        }
                                        c10 = 16;
                                        if (i16 == 1) {
                                            c11 = 16;
                                        }
                                        i11 = 0;
                                    }
                                    cVarB2 = C1185f.b(cVar6);
                                    c11 = c10;
                                    i11 = 0;
                                }
                                c10 = 16;
                                cVarB2 = C1185f.b(cVar6);
                                c11 = c10;
                                i11 = 0;
                            }
                        }
                        cVar5 = cVar5.f13989f;
                        c11 = c11;
                        i11 = 0;
                    }
                }
                char c12 = c11;
                layoutNodeF2 = layoutNodeF2.G();
                cVar5 = (layoutNodeF2 == null || (k10 = layoutNodeF2.f14389G) == null) ? null : k10.f14367d;
                c11 = c12;
                i11 = 0;
            }
            if (i13 == 0 || focusTargetNodeR == null) {
                i11 = 0;
            } else {
                i11 = 0;
                if (a(focusTargetNodeR, false, true)) {
                }
            }
            P.a(focusTargetNode, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    focusTargetNode.R1();
                    return p293xa.r.f47939a;
                }
            });
            int iOrdinal = focusTargetNode.c0().ordinal();
            if (iOrdinal == 1 || iOrdinal == 3) {
                C1185f.g(focusTargetNode).getFocusOwner().n(focusTargetNode);
            }
            if (cVar != null) {
                int i17 = cVar.f12945d - 1;
                Object[] objArr3 = cVar.f12943b;
                if (i17 < objArr3.length) {
                    while (i17 >= 0) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr3[i17];
                        if (focusOwner.r() == focusTargetNode) {
                            focusTargetNode4.Q1(FocusStateImpl.f13435c, FocusStateImpl.f13437e);
                            i17--;
                        }
                    }
                    i10 = i14 - 1;
                    if (i10 < objArr.length) {
                        while (i10 >= 0) {
                            focusTargetNode2 = (FocusTargetNode) objArr[i10];
                            if (focusOwner.r() == focusTargetNode) {
                                if (focusTargetNode2 == focusTargetNodeR) {
                                    focusStateImpl = FocusStateImpl.f13434b;
                                } else {
                                    focusStateImpl = FocusStateImpl.f13437e;
                                }
                                focusTargetNode2.Q1(focusStateImpl, FocusStateImpl.f13435c);
                                i10--;
                            }
                        }
                        if (focusOwner.r() == focusTargetNode) {
                            focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                            if (focusOwner.r() == focusTargetNode) {
                                return true;
                            }
                        }
                    } else if (focusOwner.r() == focusTargetNode) {
                        focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                        if (focusOwner.r() == focusTargetNode) {
                            return true;
                        }
                    }
                } else {
                    i10 = i14 - 1;
                    if (i10 < objArr.length) {
                        while (i10 >= 0) {
                            focusTargetNode2 = (FocusTargetNode) objArr[i10];
                            if (focusOwner.r() == focusTargetNode) {
                                if (focusTargetNode2 == focusTargetNodeR) {
                                    focusStateImpl = FocusStateImpl.f13434b;
                                } else {
                                    focusStateImpl = FocusStateImpl.f13437e;
                                }
                                focusTargetNode2.Q1(focusStateImpl, FocusStateImpl.f13435c);
                                i10--;
                            }
                        }
                        if (focusOwner.r() == focusTargetNode) {
                            focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                            if (focusOwner.r() == focusTargetNode) {
                                return true;
                            }
                        }
                    } else if (focusOwner.r() == focusTargetNode) {
                        focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                        if (focusOwner.r() == focusTargetNode) {
                            return true;
                        }
                    }
                }
            } else {
                i10 = i14 - 1;
                if (i10 < objArr.length) {
                    while (i10 >= 0) {
                        focusTargetNode2 = (FocusTargetNode) objArr[i10];
                        if (focusOwner.r() == focusTargetNode) {
                            if (focusTargetNode2 == focusTargetNodeR) {
                                focusStateImpl = FocusStateImpl.f13434b;
                            } else {
                                focusStateImpl = FocusStateImpl.f13437e;
                            }
                            focusTargetNode2.Q1(focusStateImpl, FocusStateImpl.f13435c);
                            i10--;
                        }
                    }
                    if (focusOwner.r() == focusTargetNode) {
                        focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                        if (focusOwner.r() == focusTargetNode) {
                            return true;
                        }
                    }
                } else if (focusOwner.r() == focusTargetNode) {
                    focusTargetNode.Q1(focusStateImplC0, FocusStateImpl.f13434b);
                    if (focusOwner.r() == focusTargetNode) {
                        return true;
                    }
                }
            }
        }
        return i11;
    }
}
