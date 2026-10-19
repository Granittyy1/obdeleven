package androidx.compose.ui.node;

import java.util.HashSet;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutNode f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1195p f14365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NodeCoordinator f14366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f14367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.h.c f14368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> f14369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> f14370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f14371h;

    /* JADX INFO: compiled from: NodeChain.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.compose.ui.h.c f14372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> f14374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> f14375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14376e;

        public a(androidx.compose.ui.h.c cVar, int i10, androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar2, androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar3, boolean z10) {
            this.f14372a = cVar;
            this.f14373b = i10;
            this.f14374c = cVar2;
            this.f14375d = cVar3;
            this.f14376e = z10;
        }

        public final boolean a(int i10, int i11) {
            androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar = this.f14374c;
            int i12 = this.f14373b;
            androidx.compose.ui.h.b bVar = cVar.f12943b[i10 + i12];
            androidx.compose.ui.h.b bVar2 = this.f14375d.f12943b[i12 + i11];
            L.a aVar = L.f14378a;
            return kotlin.jvm.internal.i.a(bVar, bVar2) || D9.o.g(bVar, bVar2);
        }
    }

    public K(LayoutNode layoutNode) {
        this.f14364a = layoutNode;
        C1195p c1195p = new C1195p(layoutNode);
        this.f14365b = c1195p;
        this.f14366c = c1195p;
        c0 c0Var = c1195p.f14602S;
        this.f14367d = c0Var;
        this.f14368e = c0Var;
    }

    public static final void a(K k10, androidx.compose.ui.h.c cVar, NodeCoordinator nodeCoordinator) {
        k10.getClass();
        for (androidx.compose.ui.h.c cVar2 = cVar.f13989f; cVar2 != null; cVar2 = cVar2.f13989f) {
            if (cVar2 == L.f14378a) {
                LayoutNode layoutNodeG = k10.f14364a.G();
                nodeCoordinator.f14529r = layoutNodeG != null ? layoutNodeG.f14389G.f14365b : null;
                k10.f14366c = nodeCoordinator;
                return;
            } else {
                if ((cVar2.f13987d & 2) != 0) {
                    return;
                }
                cVar2.P1(nodeCoordinator);
            }
        }
    }

    public static androidx.compose.ui.h.c b(androidx.compose.ui.h.b bVar, androidx.compose.ui.h.c cVar) {
        androidx.compose.ui.h.c cVarA;
        if (bVar instanceof H) {
            cVarA = ((H) bVar).a();
            cVarA.f13987d = N.f(cVarA);
        } else {
            BackwardsCompatNode backwardsCompatNode = new BackwardsCompatNode();
            backwardsCompatNode.f13987d = N.d(bVar);
            backwardsCompatNode.f14319p = bVar;
            backwardsCompatNode.f14320q = true;
            backwardsCompatNode.f14322s = new HashSet<>();
            cVarA = backwardsCompatNode;
        }
        if (cVarA.f13997o) {
            R.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVarA.j = true;
        androidx.compose.ui.h.c cVar2 = cVar.f13990g;
        if (cVar2 != null) {
            cVar2.f13989f = cVarA;
            cVarA.f13990g = cVar2;
        }
        cVar.f13990g = cVarA;
        cVarA.f13989f = cVar;
        return cVarA;
    }

    public static androidx.compose.ui.h.c c(androidx.compose.ui.h.c cVar) {
        boolean z10 = cVar.f13997o;
        if (z10) {
            androidx.collection.H<Object> h8 = N.f14506a;
            if (!z10) {
                R.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            N.a(cVar, -1, 2);
            cVar.N1();
            cVar.H1();
        }
        androidx.compose.ui.h.c cVar2 = cVar.f13990g;
        androidx.compose.ui.h.c cVar3 = cVar.f13989f;
        if (cVar2 != null) {
            cVar2.f13989f = cVar3;
            cVar.f13990g = null;
        }
        if (cVar3 != null) {
            cVar3.f13990g = cVar2;
            cVar.f13989f = null;
        }
        kotlin.jvm.internal.i.b(cVar3);
        return cVar3;
    }

    public static void i(androidx.compose.ui.h.b bVar, androidx.compose.ui.h.b bVar2, androidx.compose.ui.h.c cVar) {
        if ((bVar instanceof H) && (bVar2 instanceof H)) {
            L.a aVar = L.f14378a;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((H) bVar2).e(cVar);
            if (cVar.f13997o) {
                N.c(cVar);
                return;
            } else {
                cVar.f13993k = true;
                return;
            }
        }
        if (!(cVar instanceof BackwardsCompatNode)) {
            R.a.b("Unknown Modifier.Node type");
            return;
        }
        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) cVar;
        if (backwardsCompatNode.f13997o) {
            backwardsCompatNode.R1();
        }
        backwardsCompatNode.f14319p = bVar2;
        backwardsCompatNode.f13987d = N.d(bVar2);
        if (backwardsCompatNode.f13997o) {
            backwardsCompatNode.Q1(false);
        }
        if (cVar.f13997o) {
            N.c(cVar);
        } else {
            cVar.f13993k = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f14368e.f13988e) != 0;
    }

    public final void e() {
        C1195p c1195p;
        NodeCoordinator nodeCoordinator = this.f14366c;
        while (true) {
            c1195p = this.f14365b;
            if (nodeCoordinator == c1195p) {
                break;
            }
            nodeCoordinator.J1();
            nodeCoordinator = nodeCoordinator.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
        }
        c1195p.J1();
        for (androidx.compose.ui.h.c cVar = this.f14368e; cVar != null; cVar = cVar.f13990g) {
            cVar.M1();
            if (cVar.j) {
                androidx.collection.H<Object> h8 = N.f14506a;
                if (!cVar.f13997o) {
                    R.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                N.a(cVar, -1, 1);
            }
            if (cVar.f13993k) {
                N.c(cVar);
            }
            cVar.j = false;
            cVar.f13993k = false;
        }
    }

    public final void f() {
        for (androidx.compose.ui.h.c cVar = this.f14367d; cVar != null; cVar = cVar.f13989f) {
            if (cVar.f13997o) {
                cVar.N1();
            }
        }
        NodeCoordinator nodeCoordinator = this.f14366c;
        NodeCoordinator nodeCoordinator2 = this.f14365b;
        while (nodeCoordinator2 != nodeCoordinator) {
            T t8 = nodeCoordinator2.f14523J;
            if (t8 != null) {
                t8.b();
            }
            nodeCoordinator2.f14523J = null;
            nodeCoordinator2 = nodeCoordinator2.f14529r;
            kotlin.jvm.internal.i.b(nodeCoordinator2);
        }
        T t10 = nodeCoordinator.f14523J;
        if (t10 != null) {
            t10.b();
        }
        nodeCoordinator.f14523J = null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    public final void g(int i10, androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar, androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar2, androidx.compose.ui.h.c cVar3, boolean z10) {
        int i11;
        K k10;
        int i12;
        int i13;
        int i14;
        int i15;
        C1196q c1196q;
        C1196q c1196q2;
        int i16;
        int i17;
        C1196q c1196q3;
        C1196q c1196q4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z11;
        int i29;
        int i30 = 1;
        a aVar = this.f14371h;
        if (aVar == null) {
            a aVar2 = new a(cVar3, i10, cVar, cVar2, z10);
            this.f14371h = aVar2;
            aVar = aVar2;
        } else {
            aVar.f14372a = cVar3;
            aVar.f14373b = i10;
            aVar.f14374c = cVar;
            aVar.f14375d = cVar2;
            aVar.f14376e = z10;
        }
        int i31 = cVar.f12945d - i10;
        int i32 = cVar2.f12945d - i10;
        int i33 = ((i31 + i32) + 1) / 2;
        C1196q c1196q5 = new C1196q(i33 * 3);
        C1196q c1196q6 = new C1196q(i33 * 4);
        c1196q6.b(0, i31, 0, i32);
        int i34 = (i33 * 2) + 1;
        int[] iArr = new int[i34];
        int[] iArr2 = new int[i34];
        int[] iArr3 = new int[5];
        while (true) {
            int i35 = c1196q6.f14605b;
            if (i35 == 0) {
                break;
            }
            int[] iArr4 = c1196q6.f14604a;
            int i36 = i35 - 1;
            c1196q6.f14605b = i36;
            int i37 = iArr4[i36];
            int i38 = i35 - 2;
            c1196q6.f14605b = i38;
            int i39 = iArr4[i38];
            int i40 = i35 - 3;
            c1196q6.f14605b = i40;
            int i41 = iArr4[i40];
            int i42 = i35 - 4;
            c1196q6.f14605b = i42;
            int i43 = iArr4[i42];
            int i44 = i41 - i43;
            int i45 = i37 - i39;
            if (i44 < i30 || i45 < i30) {
                i13 = i31;
                i14 = i32;
                i15 = i34;
            } else {
                int i46 = ((i44 + i45) + 1) / 2;
                int i47 = i34 / 2;
                i15 = i34;
                int i48 = i47 + 1;
                iArr[i48] = i43;
                iArr2[i48] = i41;
                int i49 = 0;
                while (true) {
                    if (i49 < i46) {
                        int i50 = i44 - i45;
                        int i51 = i45;
                        int i52 = i44;
                        boolean z12 = (Math.abs(i50) & 1) == 1;
                        int i53 = -i49;
                        int i54 = i46;
                        int i55 = i53;
                        while (true) {
                            if (i55 <= i49) {
                                if (i55 != i53) {
                                    if (i55 != i49) {
                                        i16 = i31;
                                        i17 = i32;
                                        if (iArr[i55 + 1 + i47] > iArr[(i55 - 1) + i47]) {
                                        }
                                        int i56 = ((i24 - i43) + i39) - i55;
                                        if (i49 != 0) {
                                            i25 = 1;
                                        } else {
                                            i25 = 0;
                                        }
                                        if (i24 == i23) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        i27 = i56 - (i25 & i26);
                                        c1196q4 = c1196q6;
                                        i28 = i56;
                                        while (i24 < i41 && i28 < i37 && aVar.a(i24, i28)) {
                                            i24++;
                                            i28++;
                                        }
                                        iArr[i47 + i55] = i24;
                                        if (z12) {
                                            z11 = z12;
                                            i29 = i50 - i55;
                                            c1196q3 = c1196q5;
                                            if (i29 >= i53 + 1 && i29 <= i49 - 1 && iArr2[i47 + i29] <= i24) {
                                                iArr3[0] = i23;
                                                iArr3[1] = i27;
                                                iArr3[2] = i24;
                                                iArr3[3] = i28;
                                                iArr3[4] = 0;
                                                c12 = 2;
                                                i20 = i37;
                                                i21 = i41;
                                                c11 = 1;
                                                c13 = 3;
                                                c10 = 0;
                                            }
                                        } else {
                                            c1196q3 = c1196q5;
                                            z11 = z12;
                                        }
                                        i55 += 2;
                                        c1196q6 = c1196q4;
                                        i31 = i16;
                                        i32 = i17;
                                        z12 = z11;
                                        c1196q5 = c1196q3;
                                    } else {
                                        i16 = i31;
                                        i17 = i32;
                                    }
                                    i23 = iArr[(i55 - 1) + i47];
                                    i24 = i23 + 1;
                                    int i57 = ((i24 - i43) + i39) - i55;
                                    if (i49 != 0) {
                                        i25 = 1;
                                    } else {
                                        i25 = 0;
                                    }
                                    if (i24 == i23) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    i27 = i57 - (i25 & i26);
                                    c1196q4 = c1196q6;
                                    i28 = i57;
                                    while (i24 < i41) {
                                        i24++;
                                        i28++;
                                    }
                                    iArr[i47 + i55] = i24;
                                    if (z12) {
                                        z11 = z12;
                                        i29 = i50 - i55;
                                        c1196q3 = c1196q5;
                                        if (i29 >= i53 + 1) {
                                            iArr3[0] = i23;
                                            iArr3[1] = i27;
                                            iArr3[2] = i24;
                                            iArr3[3] = i28;
                                            iArr3[4] = 0;
                                            c12 = 2;
                                            i20 = i37;
                                            i21 = i41;
                                            c11 = 1;
                                            c13 = 3;
                                            c10 = 0;
                                        }
                                    } else {
                                        c1196q3 = c1196q5;
                                        z11 = z12;
                                    }
                                    i55 += 2;
                                    c1196q6 = c1196q4;
                                    i31 = i16;
                                    i32 = i17;
                                    z12 = z11;
                                    c1196q5 = c1196q3;
                                } else {
                                    i16 = i31;
                                    i17 = i32;
                                }
                                i23 = iArr[i55 + 1 + i47];
                                i24 = i23;
                                int i58 = ((i24 - i43) + i39) - i55;
                                if (i49 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = 0;
                                }
                                if (i24 == i23) {
                                    i26 = 1;
                                } else {
                                    i26 = 0;
                                }
                                i27 = i58 - (i25 & i26);
                                c1196q4 = c1196q6;
                                i28 = i58;
                                while (i24 < i41) {
                                    i24++;
                                    i28++;
                                }
                                iArr[i47 + i55] = i24;
                                if (z12) {
                                    z11 = z12;
                                    i29 = i50 - i55;
                                    c1196q3 = c1196q5;
                                    if (i29 >= i53 + 1) {
                                        iArr3[0] = i23;
                                        iArr3[1] = i27;
                                        iArr3[2] = i24;
                                        iArr3[3] = i28;
                                        iArr3[4] = 0;
                                        c12 = 2;
                                        i20 = i37;
                                        i21 = i41;
                                        c11 = 1;
                                        c13 = 3;
                                        c10 = 0;
                                    }
                                } else {
                                    c1196q3 = c1196q5;
                                    z11 = z12;
                                }
                                i55 += 2;
                                c1196q6 = c1196q4;
                                i31 = i16;
                                i32 = i17;
                                z12 = z11;
                                c1196q5 = c1196q3;
                            } else {
                                i16 = i31;
                                i17 = i32;
                                c1196q3 = c1196q5;
                                c1196q4 = c1196q6;
                                int i59 = 1;
                                boolean z13 = (i50 & 1) == 0;
                                int i60 = i53;
                                while (true) {
                                    if (i60 <= i49) {
                                        if (i60 == i53 || (i60 != i49 && iArr2[i60 + 1 + i47] < iArr2[(i60 - 1) + i47])) {
                                            i18 = iArr2[i60 + 1 + i47];
                                            i19 = i18;
                                        } else {
                                            i18 = iArr2[(i60 - 1) + i47];
                                            i19 = i18 - 1;
                                        }
                                        int i61 = i37 - ((i41 - i19) - i60);
                                        int i62 = ((i49 != 0 ? 1 : 0) & (i19 == i18 ? 1 : 0)) + i61;
                                        while (true) {
                                            if (i19 <= i43 || i61 <= i39) {
                                                i20 = i37;
                                                i21 = i41;
                                                break;
                                            }
                                            i20 = i37;
                                            i21 = i41;
                                            if (!aVar.a(i19 - 1, i61 - 1)) {
                                                break;
                                            }
                                            i19--;
                                            i61--;
                                            i37 = i20;
                                            i41 = i21;
                                        }
                                        iArr2[i47 + i60] = i19;
                                        if (!z13 || (i22 = i50 - i60) < i53 || i22 > i49 || iArr[i47 + i22] < i19) {
                                            i60 += 2;
                                            c1196q4 = c1196q4;
                                            c1196q3 = c1196q3;
                                            i37 = i20;
                                            i41 = i21;
                                            i59 = 1;
                                        } else {
                                            c10 = 0;
                                            iArr3[0] = i19;
                                            c11 = 1;
                                            iArr3[1] = i61;
                                            c12 = 2;
                                            iArr3[2] = i18;
                                            c13 = 3;
                                            iArr3[3] = i62;
                                            iArr3[4] = 1;
                                        }
                                    } else {
                                        i49 += i59;
                                        i45 = i51;
                                        i46 = i54;
                                        i41 = i41;
                                        i31 = i16;
                                        i32 = i17;
                                        i44 = i52;
                                        c1196q6 = c1196q4;
                                        c1196q5 = c1196q3;
                                    }
                                }
                            }
                            if (Math.min(iArr3[c12] - iArr3[c10], iArr3[c13] - iArr3[c11]) > 0) {
                                int i63 = iArr3[c10];
                                int i64 = iArr3[c11];
                                int i65 = iArr3[c13] - i64;
                                int iMin = iArr3[2] - i63;
                                if (i65 != iMin) {
                                    iMin = Math.min(iMin, i65);
                                    int i66 = iArr3[4];
                                    int i67 = i66 != 0 ? 1 : 0;
                                    int i68 = iArr3[c13];
                                    c14 = 1;
                                    int i69 = iArr3[1];
                                    int i70 = i68 - i69;
                                    int i71 = iArr3[2];
                                    int i72 = iArr3[0];
                                    i63 += ((i70 > i71 - i72 ? 1 : 0) | i67) ^ 1;
                                    i64 += ((i66 != 0 ? 1 : 0) | ((i68 - i69 > i71 - i72 ? 1 : 0) ^ 1)) ^ 1;
                                } else {
                                    c14 = 1;
                                }
                                c1196q = c1196q3;
                                c1196q.a(i63, i64, iMin);
                                c15 = 0;
                            } else {
                                c14 = c11;
                                c1196q = c1196q3;
                                c15 = c10;
                            }
                            c1196q2 = c1196q4;
                            c1196q2.b(i43, iArr3[c15], i39, iArr3[c14]);
                            c1196q2.b(iArr3[2], i21, iArr3[3], i20);
                            i34 = i15;
                            i31 = i16;
                            i32 = i17;
                        }
                    } else {
                        i13 = i31;
                        i14 = i32;
                    }
                    i30 = 1;
                    C1196q c1196q7 = c1196q;
                    c1196q6 = c1196q2;
                    c1196q5 = c1196q7;
                }
            }
            C1196q c1196q8 = c1196q6;
            c1196q = c1196q5;
            c1196q2 = c1196q8;
            i34 = i15;
            i31 = i13;
            i32 = i14;
            i30 = 1;
            C1196q c1196q9 = c1196q;
            c1196q6 = c1196q2;
            c1196q5 = c1196q9;
        }
        int i73 = i31;
        int i74 = i32;
        C1196q c1196q10 = c1196q5;
        int i75 = c1196q10.f14605b;
        if (i75 % 3 != 0) {
            R.a.b("Array size not a multiple of 3");
        }
        if (i75 > 3) {
            i11 = 0;
            c1196q10.c(0, i75 - 3);
        } else {
            i11 = 0;
        }
        c1196q10.a(i73, i74, i11);
        int i76 = i11;
        int i77 = i76;
        int i78 = i77;
        while (i76 < c1196q10.f14605b) {
            int[] iArr5 = c1196q10.f14604a;
            int i79 = iArr5[i76];
            int i80 = iArr5[i76 + 2];
            int i81 = i79 - i80;
            int i82 = iArr5[i76 + 1] - i80;
            i76 += 3;
            while (true) {
                k10 = K.this;
                if (i77 >= i81) {
                    break;
                }
                androidx.compose.ui.h.c cVar4 = aVar.f14372a.f13990g;
                kotlin.jvm.internal.i.b(cVar4);
                k10.getClass();
                if ((cVar4.f13987d & 2) != 0) {
                    NodeCoordinator nodeCoordinator = cVar4.f13992i;
                    kotlin.jvm.internal.i.b(nodeCoordinator);
                    NodeCoordinator nodeCoordinator2 = nodeCoordinator.f14529r;
                    NodeCoordinator nodeCoordinator3 = nodeCoordinator.f14528q;
                    kotlin.jvm.internal.i.b(nodeCoordinator3);
                    if (nodeCoordinator2 != null) {
                        nodeCoordinator2.f14528q = nodeCoordinator3;
                    }
                    nodeCoordinator3.f14529r = nodeCoordinator2;
                    a(k10, aVar.f14372a, nodeCoordinator3);
                }
                aVar.f14372a = c(cVar4);
                i77++;
            }
            while (i78 < i82) {
                int i83 = aVar.f14373b + i78;
                androidx.compose.ui.h.c cVar5 = aVar.f14372a;
                androidx.compose.ui.h.b bVar = aVar.f14375d.f12943b[i83];
                k10.getClass();
                androidx.compose.ui.h.c cVarB = b(bVar, cVar5);
                aVar.f14372a = cVarB;
                if (aVar.f14376e) {
                    androidx.compose.ui.h.c cVar6 = cVarB.f13990g;
                    kotlin.jvm.internal.i.b(cVar6);
                    NodeCoordinator nodeCoordinator4 = cVar6.f13992i;
                    kotlin.jvm.internal.i.b(nodeCoordinator4);
                    InterfaceC1198t interfaceC1198tC = C1185f.c(aVar.f14372a);
                    if (interfaceC1198tC != null) {
                        C1199u c1199u = new C1199u(k10.f14364a, interfaceC1198tC);
                        aVar.f14372a.P1(c1199u);
                        a(k10, aVar.f14372a, c1199u);
                        c1199u.f14529r = nodeCoordinator4.f14529r;
                        c1199u.f14528q = nodeCoordinator4;
                        nodeCoordinator4.f14529r = c1199u;
                    } else {
                        aVar.f14372a.P1(nodeCoordinator4);
                    }
                    aVar.f14372a.G1();
                    aVar.f14372a.M1();
                    androidx.compose.ui.h.c cVar7 = aVar.f14372a;
                    androidx.collection.H<Object> h8 = N.f14506a;
                    if (!cVar7.f13997o) {
                        R.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    i12 = 1;
                    N.a(cVar7, -1, 1);
                } else {
                    i12 = 1;
                    cVarB.j = true;
                }
                i78 += i12;
            }
            while (true) {
                int i84 = i80 - 1;
                if (i80 > 0) {
                    androidx.compose.ui.h.c cVar8 = aVar.f14372a.f13990g;
                    kotlin.jvm.internal.i.b(cVar8);
                    aVar.f14372a = cVar8;
                    androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar9 = aVar.f14374c;
                    int i85 = aVar.f14373b;
                    androidx.compose.ui.h.b bVar2 = cVar9.f12943b[i85 + i77];
                    androidx.compose.ui.h.b bVar3 = aVar.f14375d.f12943b[i85 + i78];
                    if (kotlin.jvm.internal.i.a(bVar2, bVar3)) {
                        k10.getClass();
                    } else {
                        androidx.compose.ui.h.c cVar10 = aVar.f14372a;
                        k10.getClass();
                        i(bVar2, bVar3, cVar10);
                    }
                    i77++;
                    i78++;
                    i80 = i84;
                }
            }
        }
        int i86 = i11;
        for (androidx.compose.ui.h.c cVar11 = this.f14367d.f13989f; cVar11 != null && cVar11 != L.f14378a; cVar11 = cVar11.f13989f) {
            i86 |= cVar11.f13987d;
            cVar11.f13988e = i86;
        }
    }

    public final void h() {
        LayoutNode layoutNode;
        C1199u c1199u;
        T t8;
        androidx.compose.ui.h.c cVar = this.f14367d.f13989f;
        NodeCoordinator nodeCoordinator = this.f14365b;
        while (true) {
            layoutNode = this.f14364a;
            if (cVar == null) {
                break;
            }
            InterfaceC1198t interfaceC1198tC = C1185f.c(cVar);
            if (interfaceC1198tC != null) {
                NodeCoordinator nodeCoordinator2 = cVar.f13992i;
                if (nodeCoordinator2 != null) {
                    c1199u = (C1199u) nodeCoordinator2;
                    InterfaceC1198t interfaceC1198t = c1199u.f14616S;
                    c1199u.Z1(interfaceC1198tC);
                    if (interfaceC1198t != cVar && (t8 = c1199u.f14523J) != null) {
                        t8.invalidate();
                    }
                } else {
                    c1199u = new C1199u(layoutNode, interfaceC1198tC);
                    cVar.P1(c1199u);
                }
                nodeCoordinator.f14529r = c1199u;
                c1199u.f14528q = nodeCoordinator;
                nodeCoordinator = c1199u;
            } else {
                cVar.P1(nodeCoordinator);
            }
            cVar = cVar.f13989f;
        }
        LayoutNode layoutNodeG = layoutNode.G();
        nodeCoordinator.f14529r = layoutNodeG != null ? layoutNodeG.f14389G.f14365b : null;
        this.f14366c = nodeCoordinator;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        androidx.compose.ui.h.c cVar = this.f14368e;
        c0 c0Var = this.f14367d;
        if (cVar == c0Var) {
            sb2.append("]");
        } else {
            while (cVar != null && cVar != c0Var) {
                sb2.append(String.valueOf(cVar));
                if (cVar.f13990g == c0Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                cVar = cVar.f13990g;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
