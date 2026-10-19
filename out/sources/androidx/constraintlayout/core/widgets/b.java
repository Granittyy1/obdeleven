package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: Chain.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:186:0x0296  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f  */
    /* JADX WARN: Code duplicated, block: B:301:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:410:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:413:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:414:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:418:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:420:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:422:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:425:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:427:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x070c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ArrayList<ConstraintWidget> arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ConstraintAnchor[] constraintAnchorArr;
        c[] cVarArr2;
        int i15;
        int i16;
        int i17;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor[] constraintAnchorArr2;
        int i18;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable5;
        int size;
        boolean z14;
        ConstraintAnchor constraintAnchor6;
        ConstraintWidget constraintWidget3;
        int i19;
        int i20;
        ConstraintWidget constraintWidget4;
        d dVar2 = dVar;
        if (i10 == 0) {
            i11 = dVar2.f16076D0;
            cVarArr = dVar2.f16079G0;
            i12 = 0;
        } else {
            i11 = dVar2.f16077E0;
            cVarArr = dVar2.f16078F0;
            i12 = 2;
        }
        int i21 = 0;
        while (i21 < i11) {
            c cVar2 = cVarArr[i21];
            boolean z15 = cVar2.f16072q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
            ConstraintWidget constraintWidget5 = cVar2.f16057a;
            int i22 = 1;
            int i23 = 8;
            if (z15) {
                i13 = i21;
                i14 = i11;
                z10 = true;
            } else {
                int i24 = cVar2.f16067l;
                int i25 = i24 * 2;
                ConstraintWidget constraintWidget6 = constraintWidget5;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                boolean z16 = false;
                while (!z16) {
                    cVar2.f16065i += i22;
                    constraintWidget6.f15998p0[i24] = null;
                    constraintWidget6.f15996o0[i24] = null;
                    int i26 = constraintWidget6.f15985i0;
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget6.f15959R;
                    if (i26 != i23) {
                        constraintWidget6.n(i24);
                        constraintAnchorArr3[i25].e();
                        int i27 = i25 + 1;
                        constraintAnchorArr3[i27].e();
                        constraintAnchorArr3[i25].e();
                        constraintAnchorArr3[i27].e();
                        if (cVar2.f16058b == null) {
                            cVar2.f16058b = constraintWidget6;
                        }
                        cVar2.f16060d = constraintWidget6;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.f15962U[i24];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i28 = constraintWidget6.f16005t[i24];
                            if (i28 == 0 || i28 == 3 || i28 == 2) {
                                cVar2.j++;
                                float f10 = constraintWidget6.f15994n0[i24];
                                if (f10 > 0.0f) {
                                    cVar2.f16066k += f10;
                                }
                                if (constraintWidget6.f15985i0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i28 == 0 || i28 == 3)) {
                                    if (f10 < 0.0f) {
                                        cVar2.f16069n = true;
                                    } else {
                                        cVar2.f16070o = true;
                                    }
                                    if (cVar2.f16064h == null) {
                                        cVar2.f16064h = new ArrayList<>();
                                    }
                                    cVar2.f16064h.add(constraintWidget6);
                                }
                                if (cVar2.f16062f == null) {
                                    cVar2.f16062f = constraintWidget6;
                                }
                                ConstraintWidget constraintWidget8 = cVar2.f16063g;
                                if (constraintWidget8 != null) {
                                    constraintWidget8.f15996o0[i24] = constraintWidget6;
                                }
                                cVar2.f16063g = constraintWidget6;
                            } else {
                                i21 = i21;
                            }
                            if (i24 == 0) {
                                if (constraintWidget6.f16001r == 0 && constraintWidget6.f16007u == 0) {
                                    int i29 = constraintWidget6.f16008v;
                                }
                            } else if (constraintWidget6.f16003s == 0 && constraintWidget6.f16010x == 0) {
                                int i30 = constraintWidget6.f16011y;
                            }
                        } else {
                            i21 = i21;
                            i11 = i11;
                        }
                    } else {
                        i21 = i21;
                        i11 = i11;
                    }
                    ConstraintWidget constraintWidget9 = constraintWidget7;
                    if (constraintWidget9 != constraintWidget6) {
                        constraintWidget9.f15998p0[i24] = constraintWidget6;
                    }
                    ConstraintAnchor constraintAnchor7 = constraintAnchorArr3[i25 + 1].f15930f;
                    if (constraintAnchor7 != null) {
                        constraintWidget4 = constraintAnchor7.f15928d;
                        ConstraintAnchor constraintAnchor8 = constraintWidget4.f15959R[i25].f15930f;
                        if (constraintAnchor8 == null || constraintAnchor8.f15928d != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 == null) {
                        constraintWidget4 = constraintWidget6;
                        z16 = true;
                    }
                    constraintWidget7 = constraintWidget6;
                    i21 = i21;
                    i11 = i11;
                    i23 = 8;
                    constraintWidget6 = constraintWidget4;
                    i22 = 1;
                }
                i13 = i21;
                i14 = i11;
                ConstraintWidget constraintWidget10 = cVar2.f16058b;
                if (constraintWidget10 != null) {
                    constraintWidget10.f15959R[i25].e();
                }
                ConstraintWidget constraintWidget11 = cVar2.f16060d;
                if (constraintWidget11 != null) {
                    constraintWidget11.f15959R[i25 + 1].e();
                }
                cVar2.f16059c = constraintWidget6;
                if (i24 == 0 && cVar2.f16068m) {
                    cVar2.f16061e = constraintWidget6;
                } else {
                    cVar2.f16061e = constraintWidget5;
                }
                cVar2.f16071p = cVar2.f16070o && cVar2.f16069n;
                z10 = true;
            }
            cVar2.f16072q = z10;
            if (arrayList == 0 || arrayList.contains(constraintWidget5)) {
                ConstraintWidget constraintWidget12 = cVar2.f16059c;
                ConstraintWidget constraintWidget13 = cVar2.f16058b;
                ConstraintWidget constraintWidget14 = cVar2.f16060d;
                ConstraintWidget constraintWidget15 = cVar2.f16061e;
                float f11 = cVar2.f16066k;
                boolean z17 = dVar2.f15962U[i10] == ConstraintWidget.DimensionBehaviour.f16014c;
                if (i10 == 0) {
                    int i31 = constraintWidget15.f15990l0;
                    boolean z18 = i31 == 0;
                    if (i31 == 1) {
                        z13 = true;
                        i20 = 2;
                    } else {
                        i20 = 2;
                        z13 = false;
                    }
                    z11 = i31 == i20;
                    z12 = z18;
                } else {
                    int i32 = constraintWidget15.f15992m0;
                    boolean z19 = i32 == 0;
                    boolean z20 = i32 == 1;
                    z11 = i32 == 2;
                    z12 = z19;
                    z13 = z20;
                }
                boolean z21 = false;
                while (true) {
                    constraintAnchorArr = dVar2.f15959R;
                    if (z21) {
                        break;
                    }
                    ConstraintAnchor constraintAnchor9 = constraintWidget5.f15959R[i12];
                    int i33 = z11 ? 1 : 4;
                    int iE = constraintAnchor9.e();
                    boolean z22 = z21;
                    boolean z23 = constraintWidget5.f15962U[i10] == dimensionBehaviour && constraintWidget5.f16005t[i10] == 0;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor9.f15930f;
                    if (constraintAnchor10 != null && constraintWidget5 != constraintWidget5) {
                        iE = constraintAnchor10.e() + iE;
                    }
                    int i34 = iE;
                    if (z11 && constraintWidget5 != constraintWidget5 && constraintWidget5 != constraintWidget13) {
                        i33 = 8;
                    }
                    ConstraintAnchor constraintAnchor11 = constraintAnchor9.f15930f;
                    if (constraintAnchor11 != null) {
                        if (constraintWidget5 == constraintWidget13) {
                            cVar.f(constraintAnchor9.f15933i, constraintAnchor11.f15933i, i34, 6);
                        } else {
                            cVar.f(constraintAnchor9.f15933i, constraintAnchor11.f15933i, i34, 8);
                        }
                        if (z23 && !z11) {
                            i33 = 5;
                        }
                        cVar.e(constraintAnchor9.f15933i, constraintAnchor9.f15930f.f15933i, i34, (constraintWidget5 == constraintWidget13 && z11 && constraintWidget5.f15961T[i10]) ? 5 : i33);
                    } else {
                        cVar2 = cVar2;
                        constraintWidget5 = constraintWidget5;
                    }
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget5.f15959R;
                    if (z17) {
                        if (constraintWidget5.f15985i0 == 8 || constraintWidget5.f15962U[i10] != dimensionBehaviour) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            cVar.f(constraintAnchorArr4[i12 + 1].f15933i, constraintAnchorArr4[i12].f15933i, 0, 5);
                        }
                        cVar.f(constraintAnchorArr4[i12].f15933i, constraintAnchorArr[i12].f15933i, i19, 8);
                    }
                    ConstraintAnchor constraintAnchor12 = constraintAnchorArr4[i12 + 1].f15930f;
                    if (constraintAnchor12 != null) {
                        constraintWidget3 = constraintAnchor12.f15928d;
                        ConstraintAnchor constraintAnchor13 = constraintWidget3.f15959R[i12].f15930f;
                        if (constraintAnchor13 == null || constraintAnchor13.f15928d != constraintWidget5) {
                            constraintWidget3 = null;
                        }
                    } else {
                        constraintWidget3 = null;
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget5 = constraintWidget3;
                        z21 = z22;
                    } else {
                        z21 = true;
                    }
                    constraintWidget15 = constraintWidget15;
                    cVarArr = cVarArr;
                    constraintWidget5 = constraintWidget5;
                    cVar2 = cVar2;
                }
                c cVar3 = cVar2;
                ConstraintWidget constraintWidget16 = constraintWidget15;
                ConstraintWidget constraintWidget17 = constraintWidget5;
                cVarArr2 = cVarArr;
                if (constraintWidget14 != null) {
                    int i35 = i12 + 1;
                    if (constraintWidget12.f15959R[i35].f15930f != null) {
                        ConstraintAnchor constraintAnchor14 = constraintWidget14.f15959R[i35];
                        if (constraintWidget14.f15962U[i10] == dimensionBehaviour && constraintWidget14.f16005t[i10] == 0 && !z11) {
                            ConstraintAnchor constraintAnchor15 = constraintAnchor14.f15930f;
                            if (constraintAnchor15.f15928d == dVar2) {
                                cVar.e(constraintAnchor14.f15933i, constraintAnchor15.f15933i, -constraintAnchor14.e(), 5);
                            } else if (z11) {
                                constraintAnchor6 = constraintAnchor14.f15930f;
                                if (constraintAnchor6.f15928d == dVar2) {
                                    cVar.e(constraintAnchor14.f15933i, constraintAnchor6.f15933i, -constraintAnchor14.e(), 4);
                                }
                            }
                        } else if (z11) {
                            constraintAnchor6 = constraintAnchor14.f15930f;
                            if (constraintAnchor6.f15928d == dVar2) {
                                cVar.e(constraintAnchor14.f15933i, constraintAnchor6.f15933i, -constraintAnchor14.e(), 4);
                            }
                        }
                        cVar.g(constraintAnchor14.f15933i, constraintWidget12.f15959R[i35].f15930f.f15933i, -constraintAnchor14.e(), 6);
                    }
                }
                if (z17) {
                    int i36 = i12 + 1;
                    SolverVariable solverVariable6 = constraintAnchorArr[i36].f15933i;
                    ConstraintAnchor constraintAnchor16 = constraintWidget12.f15959R[i36];
                    cVar.f(solverVariable6, constraintAnchor16.f15933i, constraintAnchor16.e(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = cVar3.f16064h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f12 = (!cVar3.f16069n || cVar3.f16071p) ? f11 : cVar3.j;
                    ConstraintWidget constraintWidget18 = null;
                    float f13 = 0.0f;
                    int i37 = 0;
                    while (i37 < size) {
                        ConstraintWidget constraintWidget19 = arrayList2.get(i37);
                        float f14 = constraintWidget19.f15994n0[i10];
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget19.f15959R;
                        if (f14 < 0.0f) {
                            if (cVar3.f16071p) {
                                SolverVariable solverVariable7 = constraintAnchorArr5[i12 + 1].f15933i;
                                SolverVariable solverVariable8 = constraintAnchorArr5[i12].f15933i;
                                z14 = false;
                                cVar.e(solverVariable7, solverVariable8, 0, 4);
                            } else {
                                f14 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i37++;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f14 == 0.0f) {
                            SolverVariable solverVariable9 = constraintAnchorArr5[i12 + 1].f15933i;
                            SolverVariable solverVariable10 = constraintAnchorArr5[i12].f15933i;
                            z14 = false;
                            cVar.e(solverVariable9, solverVariable10, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (constraintWidget18 != null) {
                                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget18.f15959R;
                                SolverVariable solverVariable11 = constraintAnchorArr6[i12].f15933i;
                                int i38 = i12 + 1;
                                SolverVariable solverVariable12 = constraintAnchorArr6[i38].f15933i;
                                SolverVariable solverVariable13 = constraintAnchorArr5[i12].f15933i;
                                SolverVariable solverVariable14 = constraintAnchorArr5[i38].f15933i;
                                androidx.constraintlayout.core.b bVarL = cVar.l();
                                bVarL.f15899b = 0.0f;
                                if (f12 == 0.0f || f13 == f14) {
                                    bVarL.f15901d.d(solverVariable11, 1.0f);
                                    bVarL.f15901d.d(solverVariable12, -1.0f);
                                    bVarL.f15901d.d(solverVariable14, 1.0f);
                                    bVarL.f15901d.d(solverVariable13, -1.0f);
                                } else if (f13 == 0.0f) {
                                    bVarL.f15901d.d(solverVariable11, 1.0f);
                                    bVarL.f15901d.d(solverVariable12, -1.0f);
                                } else if (f14 == 0.0f) {
                                    bVarL.f15901d.d(solverVariable13, 1.0f);
                                    bVarL.f15901d.d(solverVariable14, -1.0f);
                                } else {
                                    float f15 = (f13 / f12) / (f14 / f12);
                                    bVarL.f15901d.d(solverVariable11, 1.0f);
                                    bVarL.f15901d.d(solverVariable12, -1.0f);
                                    bVarL.f15901d.d(solverVariable14, f15);
                                    bVarL.f15901d.d(solverVariable13, -f15);
                                }
                                cVar.c(bVarL);
                            } else {
                                f14 = f14;
                            }
                            f13 = f14;
                            constraintWidget18 = constraintWidget19;
                        }
                        i37++;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                if (constraintWidget13 == null || !(constraintWidget13 == constraintWidget14 || z11)) {
                    i15 = i13;
                    if (!z12 || constraintWidget13 == null) {
                        int i39 = 8;
                        if (z13 && constraintWidget13 != null) {
                            int i40 = cVar3.j;
                            boolean z24 = i40 > 0 && cVar3.f16065i == i40;
                            ConstraintWidget constraintWidget20 = constraintWidget13;
                            ConstraintWidget constraintWidget21 = constraintWidget20;
                            while (constraintWidget21 != null) {
                                ConstraintWidget constraintWidget22 = constraintWidget21.f15998p0[i10];
                                while (constraintWidget22 != null && constraintWidget22.f15985i0 == i39) {
                                    constraintWidget22 = constraintWidget22.f15998p0[i10];
                                }
                                if (constraintWidget21 == constraintWidget13 || constraintWidget21 == constraintWidget14 || constraintWidget22 == null) {
                                    constraintWidget20 = constraintWidget20;
                                    i15 = i15;
                                    i17 = i39;
                                } else {
                                    ConstraintWidget constraintWidget23 = constraintWidget22 == constraintWidget14 ? null : constraintWidget22;
                                    ConstraintAnchor[] constraintAnchorArr7 = constraintWidget21.f15959R;
                                    ConstraintAnchor constraintAnchor17 = constraintAnchorArr7[i12];
                                    SolverVariable solverVariable15 = constraintAnchor17.f15933i;
                                    int i41 = i12 + 1;
                                    SolverVariable solverVariable16 = constraintWidget20.f15959R[i41].f15933i;
                                    int iE2 = constraintAnchor17.e();
                                    int iE3 = constraintAnchorArr7[i41].e();
                                    if (constraintWidget23 != null) {
                                        constraintAnchor = constraintWidget23.f15959R[i12];
                                        solverVariable = constraintAnchor.f15933i;
                                        constraintWidget = constraintWidget23;
                                        ConstraintAnchor constraintAnchor18 = constraintAnchor.f15930f;
                                        solverVariable2 = constraintAnchor18 != null ? constraintAnchor18.f15933i : null;
                                    } else {
                                        constraintWidget = constraintWidget23;
                                        ConstraintAnchor constraintAnchor19 = constraintWidget14.f15959R[i12];
                                        solverVariable = constraintAnchor19 != null ? constraintAnchor19.f15933i : null;
                                        solverVariable2 = constraintAnchorArr7[i41].f15933i;
                                        constraintAnchor = constraintAnchor19;
                                    }
                                    int iE4 = constraintAnchor != null ? constraintAnchor.e() + iE3 : iE3;
                                    int iE5 = constraintWidget20.f15959R[i41].e() + iE2;
                                    int i42 = z24 ? 8 : 4;
                                    if (solverVariable15 == null || solverVariable16 == null || solverVariable == null || solverVariable2 == null) {
                                        i17 = 8;
                                    } else {
                                        i17 = 8;
                                        cVar.b(solverVariable15, solverVariable16, iE5, 0.5f, solverVariable, solverVariable2, iE4, i42);
                                    }
                                    constraintWidget22 = constraintWidget;
                                }
                                constraintWidget20 = constraintWidget21.f15985i0 != i17 ? constraintWidget21 : constraintWidget20;
                                constraintWidget21 = constraintWidget22;
                                i39 = i17;
                                i15 = i15;
                            }
                            i16 = i15;
                            ConstraintAnchor constraintAnchor20 = constraintWidget13.f15959R[i12];
                            ConstraintAnchor constraintAnchor21 = constraintWidget17.f15959R[i12].f15930f;
                            int i43 = i12 + 1;
                            ConstraintAnchor constraintAnchor22 = constraintWidget14.f15959R[i43];
                            ConstraintAnchor constraintAnchor23 = constraintWidget12.f15959R[i43].f15930f;
                            if (constraintAnchor21 != null) {
                                if (constraintWidget13 != constraintWidget14) {
                                    cVar.e(constraintAnchor20.f15933i, constraintAnchor21.f15933i, constraintAnchor20.e(), 5);
                                } else if (constraintAnchor23 != null) {
                                    cVar.b(constraintAnchor20.f15933i, constraintAnchor21.f15933i, constraintAnchor20.e(), 0.5f, constraintAnchor22.f15933i, constraintAnchor23.f15933i, constraintAnchor22.e(), 5);
                                }
                            }
                            if (constraintAnchor23 != null && constraintWidget13 != constraintWidget14) {
                                cVar.e(constraintAnchor22.f15933i, constraintAnchor23.f15933i, -constraintAnchor22.e(), 5);
                            }
                        }
                        if ((z12 || z13) && constraintWidget13 != null && constraintWidget13 != constraintWidget14) {
                            constraintAnchorArr2 = constraintWidget13.f15959R;
                            ConstraintAnchor constraintAnchor24 = constraintAnchorArr2[i12];
                            if (constraintWidget14 == null) {
                                constraintWidget14 = constraintWidget13;
                            }
                            i18 = i12 + 1;
                            ConstraintAnchor[] constraintAnchorArr8 = constraintWidget14.f15959R;
                            constraintAnchor3 = constraintAnchorArr8[i18];
                            constraintAnchor4 = constraintAnchor24.f15930f;
                            if (constraintAnchor4 != null) {
                                solverVariable4 = constraintAnchor4.f15933i;
                            } else {
                                solverVariable4 = null;
                            }
                            constraintAnchor5 = constraintAnchor3.f15930f;
                            if (constraintAnchor5 != null) {
                                solverVariable5 = constraintAnchor5.f15933i;
                            } else {
                                solverVariable5 = null;
                            }
                            if (constraintWidget12 != constraintWidget14) {
                                ConstraintAnchor constraintAnchor25 = constraintWidget12.f15959R[i18].f15930f;
                                solverVariable5 = constraintAnchor25 != null ? constraintAnchor25.f15933i : null;
                            }
                            if (constraintWidget13 == constraintWidget14) {
                                constraintAnchor3 = constraintAnchorArr2[i18];
                            }
                            if (solverVariable4 == null && solverVariable5 != null) {
                                cVar.b(constraintAnchor24.f15933i, solverVariable4, constraintAnchor24.e(), 0.5f, solverVariable5, constraintAnchor3.f15933i, constraintAnchorArr8[i18].e(), 5);
                            }
                        }
                    } else {
                        int i44 = cVar3.j;
                        boolean z25 = i44 > 0 && cVar3.f16065i == i44;
                        ConstraintWidget constraintWidget24 = constraintWidget13;
                        ConstraintWidget constraintWidget25 = constraintWidget24;
                        while (constraintWidget25 != null) {
                            ConstraintWidget constraintWidget26 = constraintWidget25.f15998p0[i10];
                            while (constraintWidget26 != null && constraintWidget26.f15985i0 == 8) {
                                constraintWidget26 = constraintWidget26.f15998p0[i10];
                            }
                            if (constraintWidget26 != null || constraintWidget25 == constraintWidget14) {
                                ConstraintAnchor[] constraintAnchorArr9 = constraintWidget25.f15959R;
                                ConstraintAnchor constraintAnchor26 = constraintAnchorArr9[i12];
                                SolverVariable solverVariable17 = constraintAnchor26.f15933i;
                                ConstraintAnchor constraintAnchor27 = constraintAnchor26.f15930f;
                                SolverVariable solverVariable18 = constraintAnchor27 != null ? constraintAnchor27.f15933i : null;
                                if (constraintWidget24 != constraintWidget25) {
                                    solverVariable18 = constraintWidget24.f15959R[i12 + 1].f15933i;
                                } else if (constraintWidget25 == constraintWidget13) {
                                    ConstraintAnchor constraintAnchor28 = constraintWidget17.f15959R[i12].f15930f;
                                    solverVariable18 = constraintAnchor28 != null ? constraintAnchor28.f15933i : null;
                                }
                                int iE6 = constraintAnchor26.e();
                                int i45 = i12 + 1;
                                int iE7 = constraintAnchorArr9[i45].e();
                                if (constraintWidget26 != null) {
                                    constraintAnchor2 = constraintWidget26.f15959R[i12];
                                    solverVariable3 = constraintAnchor2.f15933i;
                                } else {
                                    constraintAnchor2 = constraintWidget12.f15959R[i45].f15930f;
                                    solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f15933i : null;
                                }
                                SolverVariable solverVariable19 = constraintAnchorArr9[i45].f15933i;
                                if (constraintAnchor2 != null) {
                                    iE7 = constraintAnchor2.e() + iE7;
                                }
                                int iE8 = constraintWidget24.f15959R[i45].e() + iE6;
                                if (solverVariable17 == null || solverVariable18 == null || solverVariable3 == null || solverVariable19 == null) {
                                    constraintWidget2 = constraintWidget26;
                                } else {
                                    if (constraintWidget25 == constraintWidget13) {
                                        iE8 = constraintWidget13.f15959R[i12].e();
                                    }
                                    if (constraintWidget25 == constraintWidget14) {
                                        iE7 = constraintWidget14.f15959R[i45].e();
                                    }
                                    int i46 = iE7;
                                    constraintWidget2 = constraintWidget26;
                                    cVar.b(solverVariable17, solverVariable18, iE8, 0.5f, solverVariable3, solverVariable19, i46, z25 ? 8 : 5);
                                }
                            } else {
                                constraintWidget2 = constraintWidget26;
                            }
                            constraintWidget24 = constraintWidget25.f15985i0 != 8 ? constraintWidget25 : constraintWidget24;
                            constraintWidget25 = constraintWidget2;
                        }
                    }
                } else {
                    ConstraintAnchor constraintAnchor29 = constraintWidget17.f15959R[i12];
                    int i47 = i12 + 1;
                    ConstraintAnchor constraintAnchor30 = constraintWidget12.f15959R[i47];
                    ConstraintAnchor constraintAnchor31 = constraintAnchor29.f15930f;
                    SolverVariable solverVariable20 = constraintAnchor31 != null ? constraintAnchor31.f15933i : null;
                    ConstraintAnchor constraintAnchor32 = constraintAnchor30.f15930f;
                    SolverVariable solverVariable21 = constraintAnchor32 != null ? constraintAnchor32.f15933i : null;
                    ConstraintAnchor constraintAnchor33 = constraintWidget13.f15959R[i12];
                    if (constraintWidget14 != null) {
                        constraintAnchor30 = constraintWidget14.f15959R[i47];
                    }
                    if (solverVariable20 == null || solverVariable21 == null) {
                        i15 = i13;
                    } else {
                        i15 = i13;
                        cVar.b(constraintAnchor33.f15933i, solverVariable20, constraintAnchor33.e(), i10 == 0 ? constraintWidget16.f15979f0 : constraintWidget16.f15981g0, solverVariable21, constraintAnchor30.f15933i, constraintAnchor30.e(), 7);
                    }
                }
                i16 = i15;
                if (z12) {
                    constraintAnchorArr2 = constraintWidget13.f15959R;
                    ConstraintAnchor constraintAnchor210 = constraintAnchorArr2[i12];
                    if (constraintWidget14 == null) {
                        constraintWidget14 = constraintWidget13;
                    }
                    i18 = i12 + 1;
                    ConstraintAnchor[] constraintAnchorArr10 = constraintWidget14.f15959R;
                    constraintAnchor3 = constraintAnchorArr10[i18];
                    constraintAnchor4 = constraintAnchor210.f15930f;
                    if (constraintAnchor4 != null) {
                        solverVariable4 = constraintAnchor4.f15933i;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor5 = constraintAnchor3.f15930f;
                    if (constraintAnchor5 != null) {
                        solverVariable5 = constraintAnchor5.f15933i;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget12 != constraintWidget14) {
                        ConstraintAnchor constraintAnchor211 = constraintWidget12.f15959R[i18].f15930f;
                        solverVariable5 = constraintAnchor211 != null ? constraintAnchor211.f15933i : null;
                    }
                    if (constraintWidget13 == constraintWidget14) {
                        constraintAnchor3 = constraintAnchorArr2[i18];
                    }
                    if (solverVariable4 == null) {
                    }
                } else {
                    constraintAnchorArr2 = constraintWidget13.f15959R;
                    ConstraintAnchor constraintAnchor212 = constraintAnchorArr2[i12];
                    if (constraintWidget14 == null) {
                        constraintWidget14 = constraintWidget13;
                    }
                    i18 = i12 + 1;
                    ConstraintAnchor[] constraintAnchorArr11 = constraintWidget14.f15959R;
                    constraintAnchor3 = constraintAnchorArr11[i18];
                    constraintAnchor4 = constraintAnchor212.f15930f;
                    if (constraintAnchor4 != null) {
                        solverVariable4 = constraintAnchor4.f15933i;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor5 = constraintAnchor3.f15930f;
                    if (constraintAnchor5 != null) {
                        solverVariable5 = constraintAnchor5.f15933i;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget12 != constraintWidget14) {
                        ConstraintAnchor constraintAnchor213 = constraintWidget12.f15959R[i18].f15930f;
                        solverVariable5 = constraintAnchor213 != null ? constraintAnchor213.f15933i : null;
                    }
                    if (constraintWidget13 == constraintWidget14) {
                        constraintAnchor3 = constraintAnchorArr2[i18];
                    }
                    if (solverVariable4 == null) {
                    }
                }
            } else {
                cVarArr2 = cVarArr;
                i16 = i13;
            }
            i21 = i16 + 1;
            dVar2 = dVar;
            i11 = i14;
            cVarArr = cVarArr2;
        }
    }
}
