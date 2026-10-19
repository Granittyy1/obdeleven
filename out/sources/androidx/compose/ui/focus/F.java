package androidx.compose.ui.focus;

import androidx.compose.ui.layout.InterfaceC1160f;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F {
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    public static final boolean a(I.f fVar, I.f fVar2, I.f fVar3, int i10) {
        float f10;
        float f11;
        if (!b(i10, fVar3, fVar) && b(i10, fVar2, fVar)) {
            boolean zA = C1123e.a(i10, 3);
            float f12 = fVar3.f3758b;
            float f13 = fVar3.f3760d;
            float f14 = fVar3.f3757a;
            float f15 = fVar3.f3759c;
            float f16 = fVar.f3760d;
            float f17 = fVar.f3758b;
            float f18 = fVar.f3759c;
            float f19 = fVar.f3757a;
            if (zA) {
                if (f19 >= f15) {
                    if (!C1123e.a(i10, 3) && !C1123e.a(i10, 4)) {
                        if (C1123e.a(i10, 3)) {
                            f10 = f19 - fVar2.f3759c;
                        } else if (C1123e.a(i10, 4)) {
                            f10 = fVar2.f3757a - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f10 = f17 - fVar2.f3760d;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = fVar2.f3758b - f16;
                        }
                        if (f10 < 0.0f) {
                            f10 = 0.0f;
                        }
                        if (C1123e.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C1123e.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (f11 < 1.0f) {
                            f11 = 1.0f;
                        }
                        if (f10 < f11) {
                        }
                    }
                }
            } else if (C1123e.a(i10, 4)) {
                if (f18 <= f14) {
                    if (!C1123e.a(i10, 3)) {
                        if (C1123e.a(i10, 3)) {
                            f10 = f19 - fVar2.f3759c;
                        } else if (C1123e.a(i10, 4)) {
                            f10 = fVar2.f3757a - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f10 = f17 - fVar2.f3760d;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = fVar2.f3758b - f16;
                        }
                        if (f10 < 0.0f) {
                            f10 = 0.0f;
                        }
                        if (C1123e.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C1123e.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (f11 < 1.0f) {
                            f11 = 1.0f;
                        }
                        if (f10 < f11) {
                        }
                    }
                }
            } else if (C1123e.a(i10, 5)) {
                if (f17 >= f13) {
                    if (!C1123e.a(i10, 3)) {
                        if (C1123e.a(i10, 3)) {
                            f10 = f19 - fVar2.f3759c;
                        } else if (C1123e.a(i10, 4)) {
                            f10 = fVar2.f3757a - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f10 = f17 - fVar2.f3760d;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = fVar2.f3758b - f16;
                        }
                        if (f10 < 0.0f) {
                            f10 = 0.0f;
                        }
                        if (C1123e.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C1123e.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (f11 < 1.0f) {
                            f11 = 1.0f;
                        }
                        if (f10 < f11) {
                        }
                    }
                }
            } else {
                if (!C1123e.a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f16 <= f12) {
                    if (!C1123e.a(i10, 3)) {
                        if (C1123e.a(i10, 3)) {
                            f10 = f19 - fVar2.f3759c;
                        } else if (C1123e.a(i10, 4)) {
                            f10 = fVar2.f3757a - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f10 = f17 - fVar2.f3760d;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = fVar2.f3758b - f16;
                        }
                        if (f10 < 0.0f) {
                            f10 = 0.0f;
                        }
                        if (C1123e.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C1123e.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C1123e.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C1123e.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (f11 < 1.0f) {
                            f11 = 1.0f;
                        }
                        if (f10 < f11) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean b(int i10, I.f fVar, I.f fVar2) {
        if (C1123e.a(i10, 3) ? true : C1123e.a(i10, 4)) {
            if (fVar.f3760d > fVar2.f3758b && fVar.f3758b < fVar2.f3760d) {
                return true;
            }
        } else {
            if (!(C1123e.a(i10, 5) ? true : C1123e.a(i10, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (fVar.f3759c > fVar2.f3757a && fVar.f3757a < fVar2.f3759c) {
                return true;
            }
        }
        return false;
    }

    public static final void c(FocusTargetNode focusTargetNode, androidx.compose.runtime.collection.c cVar) {
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
        while (true) {
            int i10 = cVar2.f12945d;
            if (i10 == 0) {
                return;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i10 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar5 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.f13997o && !C1185f.f(focusTargetNode2).f14399Q) {
                                    if (focusTargetNode2.R1().f13459a) {
                                        cVar.b(focusTargetNode2);
                                    } else {
                                        c(focusTargetNode2, cVar);
                                    }
                                }
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i11 = 0;
                                for (androidx.compose.ui.h.c cVar6 = ((AbstractC1187h) cVarB).f14585q; cVar6 != null; cVar6 = cVar6.f13990g) {
                                    if ((cVar6.f13987d & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
    }

    public static final FocusTargetNode d(androidx.compose.runtime.collection.c<FocusTargetNode> cVar, I.f fVar, int i10) {
        I.f fVarG;
        if (C1123e.a(i10, 3)) {
            fVarG = fVar.g((fVar.f3759c - fVar.f3757a) + 1, 0.0f);
        } else if (C1123e.a(i10, 4)) {
            fVarG = fVar.g(-((fVar.f3759c - fVar.f3757a) + 1), 0.0f);
        } else if (C1123e.a(i10, 5)) {
            fVarG = fVar.g(0.0f, (fVar.f3760d - fVar.f3758b) + 1);
        } else {
            if (!C1123e.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            fVarG = fVar.g(0.0f, -((fVar.f3760d - fVar.f3758b) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = cVar.f12943b;
        int i11 = cVar.f12945d;
        FocusTargetNode focusTargetNode = null;
        for (int i12 = 0; i12 < i11; i12++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i12];
            if (D.d(focusTargetNode2)) {
                I.f fVarB = D.b(focusTargetNode2);
                if (g(fVarB, fVarG, fVar, i10)) {
                    focusTargetNode = focusTargetNode2;
                    fVarG = fVarB;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i10, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        I.f fVar;
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new FocusTargetNode[16]);
        c(focusTargetNode, cVar);
        int i11 = cVar.f12945d;
        if (i11 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i11 == 0 ? null : cVar.f12943b[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        if (C1123e.a(i10, 7)) {
            i10 = 4;
        }
        if (C1123e.a(i10, 4) ? true : C1123e.a(i10, 6)) {
            I.f fVarB = D.b(focusTargetNode);
            float f10 = fVarB.f3758b;
            float f11 = fVarB.f3757a;
            fVar = new I.f(f11, f10, f11, f10);
        } else {
            if (!(C1123e.a(i10, 3) ? true : C1123e.a(i10, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            I.f fVarB2 = D.b(focusTargetNode);
            float f12 = fVarB2.f3760d;
            float f13 = fVarB2.f3759c;
            fVar = new I.f(f13, f12, f13, f12);
        }
        FocusTargetNode focusTargetNodeD = d(cVar, fVar, i10);
        if (focusTargetNodeD != null) {
            return lVar.invoke(focusTargetNodeD).booleanValue();
        }
        return false;
    }

    public static final boolean f(final int i10, final I.f fVar, final Ia.l lVar, final FocusTargetNode focusTargetNode) {
        if (j(i10, fVar, lVar, focusTargetNode)) {
            return true;
        }
        final B bK = C1185f.g(focusTargetNode).getFocusOwner().k();
        bK.getClass();
        final FocusTargetNode focusTargetNodeR = C1185f.g(focusTargetNode).getFocusOwner().r();
        Boolean bool = (Boolean) C1119a.a(focusTargetNode, i10, new Ia.l<InterfaceC1160f.a, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
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
                FocusTargetNode focusTargetNode2 = focusTargetNode;
                boolean zJ = F.j(i10, fVar, lVar, focusTargetNode2);
                Boolean boolValueOf = Boolean.valueOf(zJ);
                if (zJ || !aVar2.a()) {
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

    public static final boolean g(I.f fVar, I.f fVar2, I.f fVar3, int i10) {
        if (h(i10, fVar, fVar3)) {
            return !h(i10, fVar2, fVar3) || a(fVar3, fVar, fVar2, i10) || (!a(fVar3, fVar2, fVar, i10) && i(i10, fVar3, fVar) < i(i10, fVar3, fVar2));
        }
        return false;
    }

    public static final boolean h(int i10, I.f fVar, I.f fVar2) {
        boolean zA = C1123e.a(i10, 3);
        float f10 = fVar.f3757a;
        float f11 = fVar.f3759c;
        if (zA) {
            float f12 = fVar2.f3759c;
            float f13 = fVar2.f3757a;
            if ((f12 <= f11 && f13 < f11) || f13 <= f10) {
                return false;
            }
        } else if (C1123e.a(i10, 4)) {
            float f14 = fVar2.f3757a;
            float f15 = fVar2.f3759c;
            if ((f14 >= f10 && f15 > f10) || f15 >= f11) {
                return false;
            }
        } else {
            boolean zA2 = C1123e.a(i10, 5);
            float f16 = fVar.f3758b;
            float f17 = fVar.f3760d;
            if (zA2) {
                float f18 = fVar2.f3760d;
                float f19 = fVar2.f3758b;
                if ((f18 <= f17 && f19 < f17) || f19 <= f16) {
                    return false;
                }
            } else {
                if (!C1123e.a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f20 = fVar2.f3758b;
                float f21 = fVar2.f3760d;
                if ((f20 >= f16 && f21 > f16) || f21 >= f17) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long i(int i10, I.f fVar, I.f fVar2) {
        float f10;
        float f11;
        boolean zA = C1123e.a(i10, 3);
        float f12 = fVar2.f3758b;
        float f13 = fVar2.f3760d;
        float f14 = fVar2.f3757a;
        float f15 = fVar2.f3759c;
        if (zA) {
            f10 = fVar.f3757a - f15;
        } else if (C1123e.a(i10, 4)) {
            f10 = f14 - fVar.f3759c;
        } else if (C1123e.a(i10, 5)) {
            f10 = fVar.f3758b - f13;
        } else {
            if (!C1123e.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - fVar.f3760d;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j = (long) f10;
        if (C1123e.a(i10, 3) ? true : C1123e.a(i10, 4)) {
            float f16 = fVar.f3760d;
            float f17 = fVar.f3758b;
            float f18 = 2;
            f11 = (((f16 - f17) / f18) + f17) - (((f13 - f12) / f18) + f12);
        } else {
            if (!(C1123e.a(i10, 5) ? true : C1123e.a(i10, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f19 = fVar.f3759c;
            float f20 = fVar.f3757a;
            float f21 = 2;
            f11 = (((f19 - f20) / f21) + f20) - (((f15 - f14) / f21) + f14);
        }
        long j10 = (long) f11;
        return (j10 * j10) + (((long) 13) * j * j);
    }

    public static final boolean j(int i10, I.f fVar, Ia.l lVar, FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeD;
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new FocusTargetNode[16]);
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
        while (true) {
            int i11 = cVar2.f12945d;
            if (i11 == 0) {
                break;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i11 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar5 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.f13997o) {
                                    cVar.b(focusTargetNode2);
                                }
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i12 = 0;
                                for (androidx.compose.ui.h.c cVar6 = ((AbstractC1187h) cVarB).f14585q; cVar6 != null; cVar6 = cVar6.f13990g) {
                                    if ((cVar6.f13987d & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        while (cVar.f12945d != 0 && (focusTargetNodeD = d(cVar, fVar, i10)) != null) {
            if (focusTargetNodeD.R1().f13459a) {
                return ((Boolean) lVar.invoke(focusTargetNodeD)).booleanValue();
            }
            if (f(i10, fVar, lVar, focusTargetNodeD)) {
                return true;
            }
            cVar.m(focusTargetNodeD);
        }
        return false;
    }

    public static final Boolean k(int i10, I.f fVar, Ia.l lVar, FocusTargetNode focusTargetNode) {
        int iOrdinal = focusTargetNode.c0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = D.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.c0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(i10, fVar, lVar, focusTargetNodeC);
                        if (!kotlin.jvm.internal.i.a(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (fVar == null) {
                            if (focusTargetNodeC.c0() != FocusStateImpl.f13435c) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode focusTargetNodeA = D.a(focusTargetNodeC);
                            if (focusTargetNodeA == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            fVar = D.b(focusTargetNodeA);
                        }
                        return Boolean.valueOf(f(i10, fVar, lVar, focusTargetNode));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (fVar == null) {
                    fVar = D.b(focusTargetNodeC);
                }
                return Boolean.valueOf(f(i10, fVar, lVar, focusTargetNode));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (focusTargetNode.R1().f13459a) {
                    return (Boolean) ((FocusOwnerImpl$focusSearch$1) lVar).invoke(focusTargetNode);
                }
                return fVar == null ? Boolean.valueOf(e(focusTargetNode, i10, lVar)) : Boolean.valueOf(j(i10, fVar, lVar, focusTargetNode));
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i10, lVar));
    }
}
