package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ConstraintWidget[] f16116e1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f16093H0 = -1;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f16094I0 = -1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f16095J0 = -1;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f16096K0 = -1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f16097L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f16098M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f16099N0 = 0.5f;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f16100O0 = 0.5f;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public float f16101P0 = 0.5f;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public float f16102Q0 = 0.5f;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public float f16103R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public float f16104S0 = 0.5f;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f16105T0 = 0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f16106U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f16107V0 = 2;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public int f16108W0 = 2;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f16109X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f16110Y0 = -1;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f16111Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final ArrayList<a> f16112a1 = new ArrayList<>();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ConstraintWidget[] f16113b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ConstraintWidget[] f16114c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int[] f16115d1 = null;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f16117f1 = 0;

    /* JADX INFO: compiled from: Flow.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16118a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ConstraintAnchor f16121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f16122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f16123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f16124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16126i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16127k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16133q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget f16119b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16120c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16128l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16129m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f16130n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f16131o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16132p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f16125h = 0;
            this.f16126i = 0;
            this.j = 0;
            this.f16127k = 0;
            this.f16133q = 0;
            this.f16118a = i10;
            this.f16121d = constraintAnchor;
            this.f16122e = constraintAnchor2;
            this.f16123f = constraintAnchor3;
            this.f16124g = constraintAnchor4;
            this.f16125h = e.this.f16141A0;
            this.f16126i = e.this.f16148w0;
            this.j = e.this.f16142B0;
            this.f16127k = e.this.f16149x0;
            this.f16133q = i11;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i10 = this.f16118a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
            e eVar = e.this;
            if (i10 == 0) {
                int iZ = eVar.Z(constraintWidget, this.f16133q);
                if (constraintWidget.f15962U[0] == dimensionBehaviour) {
                    this.f16132p++;
                    iZ = 0;
                }
                this.f16128l = iZ + (constraintWidget.f15985i0 != 8 ? eVar.f16105T0 : 0) + this.f16128l;
                int iY = eVar.Y(constraintWidget, this.f16133q);
                if (this.f16119b == null || this.f16120c < iY) {
                    this.f16119b = constraintWidget;
                    this.f16120c = iY;
                    this.f16129m = iY;
                }
            } else {
                int iZ2 = eVar.Z(constraintWidget, this.f16133q);
                int iY2 = eVar.Y(constraintWidget, this.f16133q);
                if (constraintWidget.f15962U[1] == dimensionBehaviour) {
                    this.f16132p++;
                    iY2 = 0;
                }
                this.f16129m = iY2 + (constraintWidget.f15985i0 != 8 ? eVar.f16106U0 : 0) + this.f16129m;
                if (this.f16119b == null || this.f16120c < iZ2) {
                    this.f16119b = constraintWidget;
                    this.f16120c = iZ2;
                    this.f16128l = iZ2;
                }
            }
            this.f16131o++;
        }

        public final void b(int i10, boolean z10, boolean z11) {
            e eVar;
            int i11;
            int i12;
            ConstraintWidget constraintWidget;
            char c10;
            int i13;
            float f10;
            int i14;
            int i15;
            int i16 = this.f16131o;
            int i17 = 0;
            while (true) {
                eVar = e.this;
                if (i17 >= i16 || (i15 = this.f16130n + i17) >= eVar.f16117f1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f16116e1[i15];
                if (constraintWidget2 != null) {
                    constraintWidget2.H();
                }
                i17++;
            }
            if (i16 == 0 || this.f16119b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < i16; i20++) {
                int i21 = this.f16130n + (z10 ? (i16 - 1) - i20 : i20);
                if (i21 >= eVar.f16117f1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = eVar.f16116e1[i21];
                if (constraintWidget3 != null && constraintWidget3.f15985i0 == 0) {
                    if (i18 == -1) {
                        i18 = i20;
                    }
                    i19 = i20;
                }
            }
            if (this.f16118a != 0) {
                ConstraintWidget constraintWidget4 = this.f16119b;
                constraintWidget4.f15990l0 = eVar.f16093H0;
                int i22 = this.f16125h;
                if (i10 > 0) {
                    i22 += eVar.f16105T0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget4.f15951J;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.f15953L;
                if (z10) {
                    constraintAnchor2.a(this.f16123f, i22);
                    if (z11) {
                        constraintAnchor.a(this.f16121d, this.j);
                    }
                    if (i10 > 0) {
                        this.f16123f.f15928d.f15951J.a(constraintAnchor2, 0);
                    }
                } else {
                    constraintAnchor.a(this.f16121d, i22);
                    if (z11) {
                        constraintAnchor2.a(this.f16123f, this.j);
                    }
                    if (i10 > 0) {
                        this.f16121d.f15928d.f15953L.a(constraintAnchor, 0);
                    }
                }
                ConstraintWidget constraintWidget5 = null;
                for (int i23 = 0; i23 < i16; i23++) {
                    int i24 = this.f16130n + i23;
                    if (i24 >= eVar.f16117f1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = eVar.f16116e1[i24];
                    if (constraintWidget6 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.f15952K;
                        if (i23 == 0) {
                            constraintWidget6.i(constraintAnchor3, this.f16122e, this.f16126i);
                            int i25 = eVar.f16094I0;
                            float f11 = eVar.f16100O0;
                            if (this.f16130n == 0) {
                                i12 = eVar.f16096K0;
                                i11 = -1;
                                if (i12 != -1) {
                                    f11 = eVar.f16102Q0;
                                }
                                constraintWidget6.f15992m0 = i12;
                                constraintWidget6.f15981g0 = f11;
                            } else {
                                i11 = -1;
                            }
                            if (!z11 || (i12 = eVar.f16098M0) == i11) {
                                i12 = i25;
                            } else {
                                f11 = eVar.f16104S0;
                            }
                            constraintWidget6.f15992m0 = i12;
                            constraintWidget6.f15981g0 = f11;
                        }
                        if (i23 == i16 - 1) {
                            constraintWidget6.i(constraintWidget6.f15954M, this.f16124g, this.f16127k);
                        }
                        if (constraintWidget5 != null) {
                            int i26 = eVar.f16106U0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget5.f15954M;
                            constraintAnchor3.a(constraintAnchor4, i26);
                            if (i23 == i18) {
                                int i27 = this.f16126i;
                                if (constraintAnchor3.h()) {
                                    constraintAnchor3.f15932h = i27;
                                }
                            }
                            constraintAnchor4.a(constraintAnchor3, 0);
                            if (i23 == i19 + 1) {
                                int i28 = this.f16127k;
                                if (constraintAnchor4.h()) {
                                    constraintAnchor4.f15932h = i28;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget6.f15953L;
                            ConstraintAnchor constraintAnchor6 = constraintWidget6.f15951J;
                            if (z10) {
                                int i29 = eVar.f16107V0;
                                if (i29 == 0) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i29 == 1) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i29 == 2) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                }
                            } else {
                                int i30 = eVar.f16107V0;
                                if (i30 == 0) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i30 == 1) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i30 == 2) {
                                    if (z12) {
                                        constraintAnchor6.a(this.f16121d, this.f16125h);
                                        constraintAnchor5.a(this.f16123f, this.j);
                                    } else {
                                        constraintAnchor6.a(constraintAnchor, 0);
                                        constraintAnchor5.a(constraintAnchor2, 0);
                                    }
                                }
                            }
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f16119b;
            constraintWidget7.f15992m0 = eVar.f16094I0;
            int i31 = this.f16126i;
            if (i10 > 0) {
                i31 += eVar.f16106U0;
            }
            ConstraintAnchor constraintAnchor7 = this.f16122e;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.f15952K;
            constraintAnchor8.a(constraintAnchor7, i31);
            ConstraintAnchor constraintAnchor9 = constraintWidget7.f15954M;
            if (z11) {
                constraintAnchor9.a(this.f16124g, this.f16127k);
            }
            if (i10 > 0) {
                this.f16122e.f15928d.f15954M.a(constraintAnchor8, 0);
            }
            if (eVar.f16108W0 != 3 || constraintWidget7.f15946E) {
                constraintWidget = constraintWidget7;
                break;
            }
            int i32 = 0;
            while (true) {
                if (i32 < i16) {
                    int i33 = this.f16130n + (z10 ? (i16 - 1) - i32 : i32);
                    if (i33 < eVar.f16117f1) {
                        constraintWidget = eVar.f16116e1[i33];
                        if (constraintWidget.f15946E) {
                            break;
                        } else {
                            i32++;
                        }
                    }
                }
                constraintWidget = constraintWidget7;
                break;
            }
            int i34 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (i34 < i16) {
                int i35 = z10 ? (i16 - 1) - i34 : i34;
                int i36 = this.f16130n + i35;
                if (i36 >= eVar.f16117f1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = eVar.f16116e1[i36];
                if (constraintWidget9 == null) {
                    i16 = i16;
                    c10 = 3;
                } else {
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.f15951J;
                    if (i34 == 0) {
                        constraintWidget9.i(constraintAnchor10, this.f16121d, this.f16125h);
                    }
                    if (i35 == 0) {
                        int i37 = eVar.f16093H0;
                        float f12 = z10 ? 1.0f - eVar.f16099N0 : eVar.f16099N0;
                        if (this.f16130n == 0 && (i14 = eVar.f16095J0) != -1) {
                            f10 = z10 ? 1.0f - eVar.f16101P0 : eVar.f16101P0;
                            i13 = i14;
                        } else if (!z11 || (i13 = eVar.f16097L0) == -1) {
                            i13 = i37;
                            f10 = f12;
                        } else {
                            f10 = z10 ? 1.0f - eVar.f16103R0 : eVar.f16103R0;
                        }
                        constraintWidget9.f15990l0 = i13;
                        constraintWidget9.f15979f0 = f10;
                    }
                    if (i34 == i16 - 1) {
                        constraintWidget9.i(constraintWidget9.f15953L, this.f16123f, this.j);
                    }
                    if (constraintWidget8 != null) {
                        int i38 = eVar.f16105T0;
                        ConstraintAnchor constraintAnchor11 = constraintWidget8.f15953L;
                        constraintAnchor10.a(constraintAnchor11, i38);
                        if (i34 == i18) {
                            int i39 = this.f16125h;
                            if (constraintAnchor10.h()) {
                                constraintAnchor10.f15932h = i39;
                            }
                        }
                        constraintAnchor11.a(constraintAnchor10, 0);
                        if (i34 == i19 + 1) {
                            int i40 = this.j;
                            if (constraintAnchor11.h()) {
                                constraintAnchor11.f15932h = i40;
                            }
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        int i41 = eVar.f16108W0;
                        c10 = 3;
                        if (i41 == 3 && constraintWidget.f15946E && constraintWidget9 != constraintWidget && constraintWidget9.f15946E) {
                            constraintWidget9.f15955N.a(constraintWidget.f15955N, 0);
                        } else {
                            ConstraintAnchor constraintAnchor12 = constraintWidget9.f15952K;
                            if (i41 != 0) {
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.f15954M;
                                if (i41 == 1) {
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                } else if (z12) {
                                    constraintAnchor12.a(this.f16122e, this.f16126i);
                                    constraintAnchor13.a(this.f16124g, this.f16127k);
                                } else {
                                    constraintAnchor12.a(constraintAnchor8, 0);
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                }
                            } else {
                                constraintAnchor12.a(constraintAnchor8, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    constraintWidget8 = constraintWidget9;
                }
                i34++;
                i16 = i16;
            }
        }

        public final int c() {
            return this.f16118a == 1 ? this.f16129m - e.this.f16106U0 : this.f16129m;
        }

        public final int d() {
            return this.f16118a == 0 ? this.f16128l - e.this.f16105T0 : this.f16128l;
        }

        public final void e(int i10) {
            int i11 = this.f16132p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f16131o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.f16130n;
                int i16 = i15 + i14;
                e eVar = e.this;
                if (i16 >= eVar.f16117f1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f16116e1[i15 + i14];
                int i17 = this.f16118a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16013b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16015d;
                if (i17 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.f16001r == 0) {
                            eVar.X(constraintWidget, dimensionBehaviour, i13, dimensionBehaviourArr[1], constraintWidget.o());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f15962U;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.f16003s == 0) {
                        eVar.X(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.u(), dimensionBehaviour, i13);
                    }
                }
            }
            this.f16128l = 0;
            this.f16129m = 0;
            this.f16119b = null;
            this.f16120c = 0;
            int i18 = this.f16131o;
            for (int i19 = 0; i19 < i18; i19++) {
                int i20 = this.f16130n + i19;
                e eVar2 = e.this;
                if (i20 >= eVar2.f16117f1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = eVar2.f16116e1[i20];
                if (this.f16118a == 0) {
                    int iU = constraintWidget2.u();
                    int i21 = eVar2.f16105T0;
                    if (constraintWidget2.f15985i0 == 8) {
                        i21 = 0;
                    }
                    this.f16128l = iU + i21 + this.f16128l;
                    int iY = eVar2.Y(constraintWidget2, this.f16133q);
                    if (this.f16119b == null || this.f16120c < iY) {
                        this.f16119b = constraintWidget2;
                        this.f16120c = iY;
                        this.f16129m = iY;
                    }
                } else {
                    int iZ = eVar2.Z(constraintWidget2, this.f16133q);
                    int iY2 = eVar2.Y(constraintWidget2, this.f16133q);
                    int i22 = eVar2.f16106U0;
                    if (constraintWidget2.f15985i0 == 8) {
                        i22 = 0;
                    }
                    this.f16129m = iY2 + i22 + this.f16129m;
                    if (this.f16119b == null || this.f16120c < iZ) {
                        this.f16119b = constraintWidget2;
                        this.f16120c = iZ;
                        this.f16128l = iZ;
                    }
                }
            }
        }

        public final void f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f16118a = i10;
            this.f16121d = constraintAnchor;
            this.f16122e = constraintAnchor2;
            this.f16123f = constraintAnchor3;
            this.f16124g = constraintAnchor4;
            this.f16125h = i11;
            this.f16126i = i12;
            this.j = i13;
            this.f16127k = i14;
            this.f16133q = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:397:0x075b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0761 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:400:0x0763  */
    /* JADX WARN: Code duplicated, block: B:401:0x076b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0771  */
    /* JADX WARN: Code duplicated, block: B:406:0x0774  */
    /* JADX WARN: Code duplicated, block: B:407:0x0777 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x0779  */
    /* JADX WARN: Code duplicated, block: B:409:0x0780 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x0782  */
    /* JADX WARN: Code duplicated, block: B:411:0x0784  */
    /* JADX WARN: Code duplicated, block: B:414:0x0793  */
    /* JADX WARN: Code duplicated, block: B:415:0x0795  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.i
    public final void W(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        a aVar;
        int i19;
        char c10;
        int iMin;
        int i20;
        int i21;
        int iMin2;
        boolean z10;
        int i22;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i23;
        int i24;
        int i25;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget;
        int i26;
        int i27;
        int iCeil;
        int iCeil2;
        Object obj;
        ConstraintWidget constraintWidget2;
        int i28;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i29;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        int i30;
        int i31;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget constraintWidget3;
        int i32;
        int i33;
        int i34 = this.v0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f16014c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f16015d;
        if (i34 > 0) {
            ConstraintWidget constraintWidget4 = this.f15963V;
            p101i0.b.InterfaceC0381b interfaceC0381b = constraintWidget4 != null ? ((d) constraintWidget4).f16091y0 : null;
            if (interfaceC0381b == null) {
                this.f16144D0 = 0;
                this.f16145E0 = 0;
                this.f16143C0 = false;
                return;
            }
            for (int i35 = 0; i35 < this.v0; i35++) {
                ConstraintWidget constraintWidget5 = this.f35714u0[i35];
                if (constraintWidget5 != null && !(constraintWidget5 instanceof f)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourN = constraintWidget5.n(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = constraintWidget5.n(1);
                    if (dimensionBehaviourN != dimensionBehaviour7 || constraintWidget5.f16001r == 1 || dimensionBehaviourN2 != dimensionBehaviour7 || constraintWidget5.f16003s == 1) {
                        if (dimensionBehaviourN == dimensionBehaviour7) {
                            dimensionBehaviourN = dimensionBehaviour6;
                        }
                        if (dimensionBehaviourN2 == dimensionBehaviour7) {
                            dimensionBehaviourN2 = dimensionBehaviour6;
                        }
                        i0.b.a aVar2 = this.f16146F0;
                        aVar2.f36464a = dimensionBehaviourN;
                        aVar2.f36465b = dimensionBehaviourN2;
                        aVar2.f36466c = constraintWidget5.u();
                        aVar2.f36467d = constraintWidget5.o();
                        ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget5, aVar2);
                        constraintWidget5.S(aVar2.f36468e);
                        constraintWidget5.P(aVar2.f36469f);
                        constraintWidget5.M(aVar2.f36470g);
                    }
                }
            }
        }
        int i36 = this.f16141A0;
        int i37 = this.f16142B0;
        int i38 = this.f16148w0;
        int i39 = this.f16149x0;
        int[] iArr2 = new int[2];
        int i40 = (i11 - i36) - i37;
        int i41 = this.f16111Z0;
        if (i41 == 1) {
            i40 = (i13 - i38) - i39;
        }
        int i42 = i40;
        if (i41 == 0) {
            if (this.f16093H0 == -1) {
                this.f16093H0 = 0;
            }
            if (this.f16094I0 == -1) {
                this.f16094I0 = 0;
            }
        } else {
            if (this.f16093H0 == -1) {
                this.f16093H0 = 0;
            }
            if (this.f16094I0 == -1) {
                this.f16094I0 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.f35714u0;
        int i43 = 0;
        int i44 = 0;
        while (true) {
            i14 = this.v0;
            if (i43 >= i14) {
                break;
            }
            if (this.f35714u0[i43].f15985i0 == 8) {
                i44++;
            }
            i43++;
        }
        if (i44 > 0) {
            constraintWidgetArr = new ConstraintWidget[i14 - i44];
            int i45 = 0;
            i14 = 0;
            while (i45 < this.v0) {
                ConstraintWidget constraintWidget6 = this.f35714u0[i45];
                int[] iArr3 = iArr2;
                int i46 = i39;
                if (constraintWidget6.f15985i0 != 8) {
                    constraintWidgetArr[i14] = constraintWidget6;
                    i14++;
                }
                i45++;
                iArr2 = iArr3;
                i39 = i46;
            }
        }
        int[] iArr4 = iArr2;
        int i47 = i39;
        int i48 = i14;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        this.f16116e1 = constraintWidgetArr2;
        this.f16117f1 = i48;
        int i49 = this.f16109X0;
        ArrayList<a> arrayList = this.f16112a1;
        if (i49 == 0) {
            i15 = i38;
            i16 = i37;
            i17 = i36;
            iArr = iArr4;
            i18 = i47;
            int i50 = this.f16111Z0;
            if (i48 != 0) {
                if (arrayList.size() == 0) {
                    aVar = new a(i50, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                    arrayList.add(aVar);
                } else {
                    aVar = arrayList.get(0);
                    aVar.f16120c = 0;
                    aVar.f16119b = null;
                    aVar.f16128l = 0;
                    aVar.f16129m = 0;
                    aVar.f16130n = 0;
                    aVar.f16131o = 0;
                    aVar.f16132p = 0;
                    aVar.f(i50, this.f15951J, this.f15952K, this.f15953L, this.f15954M, this.f16141A0, this.f16148w0, this.f16142B0, this.f16149x0, i42);
                }
                for (int i51 = 0; i51 < i48; i51++) {
                    aVar.a(constraintWidgetArr2[i51]);
                }
                i19 = 0;
                iArr[0] = aVar.d();
                c10 = 1;
                iArr[1] = aVar.c();
            }
            iMin = iArr[i19] + i17 + i16;
            i20 = iArr[c10] + i15 + i18;
            if (i10 == 1073741824) {
                if (i10 == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i11);
                } else {
                    c10 = c10;
                    i21 = i12;
                    if (i10 != 0) {
                        iMin = i19;
                    }
                }
                if (i21 == 1073741824) {
                    iMin2 = i13;
                } else if (i21 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(i20, i13);
                } else if (i21 == 0) {
                    iMin2 = i20;
                } else {
                    iMin2 = i19;
                }
                this.f16144D0 = iMin;
                this.f16145E0 = iMin2;
                S(iMin);
                P(iMin2);
                if (this.v0 > 0) {
                    z10 = c10;
                } else {
                    z10 = i19;
                }
                this.f16143C0 = z10;
            }
            iMin = i11;
            i21 = i12;
            if (i21 == 1073741824) {
                iMin2 = i13;
            } else if (i21 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i20, i13);
            } else if (i21 == 0) {
                iMin2 = i20;
            } else {
                iMin2 = i19;
            }
            this.f16144D0 = iMin;
            this.f16145E0 = iMin2;
            S(iMin);
            P(iMin2);
            if (this.v0 > 0) {
                z10 = c10;
            } else {
                z10 = i19;
            }
            this.f16143C0 = z10;
        }
        ConstraintAnchor constraintAnchor = this.f15952K;
        ConstraintAnchor constraintAnchor2 = this.f15951J;
        ConstraintAnchor constraintAnchor3 = this.f15953L;
        ConstraintAnchor constraintAnchor4 = this.f15954M;
        if (i49 == 1) {
            ConstraintAnchor constraintAnchor5 = constraintAnchor2;
            i15 = i38;
            i16 = i37;
            i17 = i36;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour6;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour7;
            iArr = iArr4;
            i18 = i47;
            int i52 = this.f16111Z0;
            if (i48 != 0) {
                arrayList.clear();
                a aVar3 = new a(i52, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                arrayList.add(aVar3);
                if (i52 == 0) {
                    i23 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    while (i54 < i48) {
                        ConstraintWidget constraintWidget7 = constraintWidgetArr2[i54];
                        int iZ = Z(constraintWidget7, i42);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour9;
                        if (constraintWidget7.f15962U[0] == dimensionBehaviour10) {
                            i23++;
                        }
                        int i55 = i23;
                        boolean z11 = (i53 == i42 || (this.f16105T0 + i53) + iZ > i42) && aVar3.f16119b != null;
                        if (!z11 && i54 > 0 && (i27 = this.f16110Y0) > 0 && i54 % i27 == 0) {
                            z11 = true;
                        }
                        if (z11) {
                            int i56 = i52;
                            dimensionBehaviour2 = dimensionBehaviour8;
                            i25 = i52;
                            constraintWidget = constraintWidget7;
                            dimensionBehaviour9 = dimensionBehaviour10;
                            i26 = i54;
                            aVar3 = new a(i56, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                            aVar3.f16130n = i26;
                            arrayList.add(aVar3);
                        } else {
                            dimensionBehaviour9 = dimensionBehaviour10;
                            i25 = i52;
                            dimensionBehaviour2 = dimensionBehaviour8;
                            constraintWidget = constraintWidget7;
                            i26 = i54;
                            if (i26 > 0) {
                                i53 = this.f16105T0 + iZ + i53;
                            }
                            aVar3.a(constraintWidget);
                            i54 = i26 + 1;
                            i23 = i55;
                            dimensionBehaviour8 = dimensionBehaviour2;
                            i52 = i25;
                        }
                        i53 = iZ;
                        aVar3.a(constraintWidget);
                        i54 = i26 + 1;
                        i23 = i55;
                        dimensionBehaviour8 = dimensionBehaviour2;
                        i52 = i25;
                    }
                    i22 = i52;
                    dimensionBehaviour = dimensionBehaviour8;
                } else {
                    i22 = i52;
                    dimensionBehaviour = dimensionBehaviour8;
                    i23 = 0;
                    int i57 = 0;
                    int i58 = 0;
                    while (i58 < i48) {
                        ConstraintWidget constraintWidget8 = constraintWidgetArr2[i58];
                        int iY = Y(constraintWidget8, i42);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour9;
                        if (constraintWidget8.f15962U[1] == dimensionBehaviour11) {
                            i23++;
                        }
                        int i59 = i23;
                        boolean z12 = (i57 == i42 || (this.f16106U0 + i57) + iY > i42) && aVar3.f16119b != null;
                        if (!z12 && i58 > 0 && (i24 = this.f16110Y0) > 0 && i58 % i24 == 0) {
                            z12 = true;
                        }
                        if (z12) {
                            dimensionBehaviour9 = dimensionBehaviour11;
                            aVar3 = new a(i22, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                            aVar3.f16130n = i58;
                            arrayList.add(aVar3);
                        } else {
                            dimensionBehaviour9 = dimensionBehaviour11;
                            if (i58 > 0) {
                                i57 = this.f16106U0 + iY + i57;
                            }
                            aVar3.a(constraintWidget8);
                            i58++;
                            i23 = i59;
                        }
                        i57 = iY;
                        aVar3.a(constraintWidget8);
                        i58++;
                        i23 = i59;
                    }
                }
                int size = arrayList.size();
                int i60 = this.f16141A0;
                int i61 = this.f16148w0;
                int i62 = this.f16142B0;
                int i63 = this.f16149x0;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f15962U;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour;
                boolean z13 = dimensionBehaviourArr[0] == dimensionBehaviour12 || dimensionBehaviourArr[1] == dimensionBehaviour12;
                if (i23 > 0 && z13) {
                    for (int i64 = 0; i64 < size; i64++) {
                        a aVar4 = arrayList.get(i64);
                        if (i22 == 0) {
                            aVar4.e(i42 - aVar4.d());
                        } else {
                            aVar4.e(i42 - aVar4.c());
                        }
                    }
                }
                ConstraintAnchor constraintAnchor6 = constraintAnchor;
                ConstraintAnchor constraintAnchor7 = constraintAnchor3;
                ConstraintAnchor constraintAnchor8 = constraintAnchor4;
                int i65 = 0;
                int i66 = 0;
                for (int i67 = 0; i67 < size; i67++) {
                    a aVar5 = arrayList.get(i67);
                    if (i22 == 0) {
                        if (i67 < size - 1) {
                            constraintAnchor8 = arrayList.get(i67 + 1).f16119b.f15952K;
                            i63 = 0;
                        } else {
                            i63 = this.f16149x0;
                            constraintAnchor8 = constraintAnchor4;
                        }
                        ConstraintAnchor constraintAnchor9 = aVar5.f16119b.f15954M;
                        aVar5.f(i22, constraintAnchor5, constraintAnchor6, constraintAnchor7, constraintAnchor8, i60, i61, i62, i63, i42);
                        int iMax = Math.max(i65, aVar5.d());
                        int iC = aVar5.c() + i66;
                        if (i67 > 0) {
                            iC += this.f16106U0;
                        }
                        i65 = iMax;
                        i66 = iC;
                        constraintAnchor6 = constraintAnchor9;
                        i61 = 0;
                    } else {
                        if (i67 < size - 1) {
                            constraintAnchor7 = arrayList.get(i67 + 1).f16119b.f15951J;
                            i62 = 0;
                        } else {
                            i62 = this.f16142B0;
                            constraintAnchor7 = constraintAnchor3;
                        }
                        ConstraintAnchor constraintAnchor10 = aVar5.f16119b.f15953L;
                        aVar5.f(i22, constraintAnchor5, constraintAnchor6, constraintAnchor7, constraintAnchor8, i60, i61, i62, i63, i42);
                        int iD = aVar5.d() + i65;
                        int iMax2 = Math.max(i66, aVar5.c());
                        if (i67 > 0) {
                            iD += this.f16105T0;
                        }
                        i66 = iMax2;
                        constraintAnchor5 = constraintAnchor10;
                        i65 = iD;
                        i60 = 0;
                    }
                }
                iArr[0] = i65;
                iArr[1] = i66;
            }
        } else if (i49 == 2) {
            i15 = i38;
            i16 = i37;
            i17 = i36;
            iArr = iArr4;
            i18 = i47;
            int i68 = this.f16111Z0;
            if (i68 == 0) {
                int i69 = this.f16110Y0;
                if (i69 <= 0) {
                    int i70 = 0;
                    iCeil2 = 0;
                    for (int i71 = 0; i71 < i48; i71++) {
                        if (i71 > 0) {
                            i70 += this.f16105T0;
                        }
                        ConstraintWidget constraintWidget9 = constraintWidgetArr2[i71];
                        if (constraintWidget9 != null) {
                            int iZ2 = Z(constraintWidget9, i42) + i70;
                            if (iZ2 > i42) {
                                break;
                            }
                            iCeil2++;
                            i70 = iZ2;
                        }
                    }
                } else {
                    iCeil2 = i69;
                }
                iCeil = 0;
            } else {
                iCeil = this.f16110Y0;
                if (iCeil <= 0) {
                    int i72 = 0;
                    int i73 = 0;
                    for (int i74 = 0; i74 < i48; i74++) {
                        if (i74 > 0) {
                            i72 += this.f16106U0;
                        }
                        ConstraintWidget constraintWidget10 = constraintWidgetArr2[i74];
                        if (constraintWidget10 != null) {
                            int iY2 = Y(constraintWidget10, i42) + i72;
                            if (iY2 > i42) {
                                break;
                            }
                            i73++;
                            i72 = iY2;
                        }
                    }
                    iCeil = i73;
                }
                iCeil2 = 0;
            }
            if (this.f16115d1 == null) {
                this.f16115d1 = new int[2];
            }
            boolean z14 = (iCeil == 0 && i68 == 1) || (iCeil2 == 0 && i68 == 0);
            while (!z14) {
                if (i68 == 0) {
                    iCeil = (int) Math.ceil(i48 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i48 / iCeil);
                }
                ConstraintWidget[] constraintWidgetArr3 = this.f16114c1;
                if (constraintWidgetArr3 == null || constraintWidgetArr3.length < iCeil2) {
                    obj = null;
                    this.f16114c1 = new ConstraintWidget[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(constraintWidgetArr3, (Object) null);
                }
                ConstraintWidget[] constraintWidgetArr4 = this.f16113b1;
                if (constraintWidgetArr4 == null || constraintWidgetArr4.length < iCeil) {
                    this.f16113b1 = new ConstraintWidget[iCeil];
                } else {
                    Arrays.fill(constraintWidgetArr4, obj);
                }
                for (int i75 = 0; i75 < iCeil2; i75++) {
                    for (int i76 = 0; i76 < iCeil; i76++) {
                        int i77 = (i76 * iCeil2) + i75;
                        if (i68 == 1) {
                            i77 = (i75 * iCeil) + i76;
                        }
                        if (i77 < constraintWidgetArr2.length && (constraintWidget2 = constraintWidgetArr2[i77]) != null) {
                            int iZ3 = Z(constraintWidget2, i42);
                            ConstraintWidget constraintWidget11 = this.f16114c1[i75];
                            if (constraintWidget11 == null || constraintWidget11.u() < iZ3) {
                                this.f16114c1[i75] = constraintWidget2;
                            }
                            int iY3 = Y(constraintWidget2, i42);
                            ConstraintWidget constraintWidget12 = this.f16113b1[i76];
                            if (constraintWidget12 == null || constraintWidget12.o() < iY3) {
                                this.f16113b1[i76] = constraintWidget2;
                            }
                        }
                    }
                }
                int iZ4 = 0;
                for (int i78 = 0; i78 < iCeil2; i78++) {
                    ConstraintWidget constraintWidget13 = this.f16114c1[i78];
                    if (constraintWidget13 != null) {
                        if (i78 > 0) {
                            iZ4 += this.f16105T0;
                        }
                        iZ4 = Z(constraintWidget13, i42) + iZ4;
                    }
                }
                int iY4 = 0;
                for (int i79 = 0; i79 < iCeil; i79++) {
                    ConstraintWidget constraintWidget14 = this.f16113b1[i79];
                    if (constraintWidget14 != null) {
                        if (i79 > 0) {
                            iY4 += this.f16106U0;
                        }
                        iY4 = Y(constraintWidget14, i42) + iY4;
                    }
                }
                iArr[0] = iZ4;
                iArr[1] = iY4;
                if (i68 == 0) {
                    if (iZ4 <= i42 || iCeil2 <= 1) {
                        z14 = true;
                    } else {
                        iCeil2--;
                    }
                } else if (iY4 <= i42 || iCeil <= 1) {
                    z14 = true;
                } else {
                    iCeil--;
                }
            }
            int[] iArr5 = this.f16115d1;
            iArr5[0] = iCeil2;
            iArr5[1] = iCeil;
        } else if (i49 != 3) {
            i15 = i38;
            i16 = i37;
            i17 = i36;
            iArr = iArr4;
            i18 = i47;
        } else {
            int i80 = this.f16111Z0;
            if (i48 == 0) {
                i15 = i38;
                i16 = i37;
                i17 = i36;
                iArr = iArr4;
                i18 = i47;
            } else {
                arrayList.clear();
                ConstraintAnchor constraintAnchor11 = constraintAnchor2;
                iArr = iArr4;
                i18 = i47;
                i15 = i38;
                i16 = i37;
                i17 = i36;
                a aVar6 = new a(i80, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                arrayList.add(aVar6);
                if (i80 == 0) {
                    int i81 = 0;
                    i29 = 0;
                    int i82 = 0;
                    int i83 = 0;
                    while (i83 < i48) {
                        i81++;
                        ConstraintWidget constraintWidget15 = constraintWidgetArr2[i83];
                        int i84 = i42;
                        int iZ5 = Z(constraintWidget15, i84);
                        if (constraintWidget15.f15962U[0] == dimensionBehaviour7) {
                            i29++;
                        }
                        int i85 = i29;
                        boolean z15 = (i82 == i84 || (this.f16105T0 + i82) + iZ5 > i84) && aVar6.f16119b != null;
                        if (!z15 && i83 > 0 && (i33 = this.f16110Y0) > 0 && i81 > i33) {
                            z15 = true;
                        }
                        if (z15) {
                            int i86 = i80;
                            i42 = i84;
                            dimensionBehaviour5 = dimensionBehaviour6;
                            constraintWidget3 = constraintWidget15;
                            i31 = i80;
                            i32 = i83;
                            a aVar7 = new a(i86, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i42);
                            aVar7.f16130n = i32;
                            arrayList.add(aVar7);
                            aVar6 = aVar7;
                            i82 = iZ5;
                            i81 = 1;
                        } else {
                            i42 = i84;
                            i31 = i80;
                            dimensionBehaviour5 = dimensionBehaviour6;
                            constraintWidget3 = constraintWidget15;
                            i32 = i83;
                            i82 = i32 > 0 ? this.f16105T0 + iZ5 + i82 : iZ5;
                        }
                        aVar6.a(constraintWidget3);
                        i83 = i32 + 1;
                        i29 = i85;
                        dimensionBehaviour6 = dimensionBehaviour5;
                        i80 = i31;
                    }
                    i28 = i80;
                    dimensionBehaviour3 = dimensionBehaviour6;
                } else {
                    i28 = i80;
                    dimensionBehaviour3 = dimensionBehaviour6;
                    int i87 = 0;
                    i29 = 0;
                    int i88 = 0;
                    int i89 = 0;
                    while (i89 < i48) {
                        int i90 = i87 + 1;
                        ConstraintWidget constraintWidget16 = constraintWidgetArr2[i89];
                        int i91 = i42;
                        int iY5 = Y(constraintWidget16, i91);
                        if (constraintWidget16.f15962U[1] == dimensionBehaviour7) {
                            i29++;
                        }
                        int i92 = i29;
                        boolean z16 = (i88 == i91 || (this.f16106U0 + i88) + iY5 > i91) && aVar6.f16119b != null;
                        if (!z16 && i89 > 0 && (i30 = this.f16110Y0) > 0 && i90 > i30) {
                            z16 = true;
                        }
                        if (z16) {
                            dimensionBehaviour4 = dimensionBehaviour7;
                            a aVar8 = new a(i28, this.f15951J, this.f15952K, this.f15953L, this.f15954M, i91);
                            aVar8.f16130n = i89;
                            arrayList.add(aVar8);
                            aVar6 = aVar8;
                            i88 = iY5;
                            i87 = 1;
                        } else {
                            dimensionBehaviour4 = dimensionBehaviour7;
                            if (i89 > 0) {
                                i88 = this.f16106U0 + iY5 + i88;
                                i87 = i90;
                            } else {
                                i87 = i90;
                                i88 = iY5;
                            }
                        }
                        aVar6.a(constraintWidget16);
                        i89++;
                        i42 = i91;
                        i29 = i92;
                        dimensionBehaviour7 = dimensionBehaviour4;
                    }
                }
                int i93 = i42;
                int size2 = arrayList.size();
                int i94 = this.f16141A0;
                int i95 = this.f16148w0;
                int i96 = this.f16142B0;
                int i97 = this.f16149x0;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f15962U;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviour3;
                boolean z17 = dimensionBehaviourArr2[0] == dimensionBehaviour13 || dimensionBehaviourArr2[1] == dimensionBehaviour13;
                if (i29 > 0 && z17) {
                    for (int i98 = 0; i98 < size2; i98++) {
                        a aVar9 = arrayList.get(i98);
                        if (i28 == 0) {
                            aVar9.e(i93 - aVar9.d());
                        } else {
                            aVar9.e(i93 - aVar9.c());
                        }
                    }
                }
                int i99 = i94;
                ConstraintAnchor constraintAnchor12 = constraintAnchor;
                ConstraintAnchor constraintAnchor13 = constraintAnchor3;
                ConstraintAnchor constraintAnchor14 = constraintAnchor4;
                int i100 = 0;
                int i101 = 0;
                for (int i102 = 0; i102 < size2; i102++) {
                    a aVar10 = arrayList.get(i102);
                    if (i28 == 0) {
                        if (i102 < size2 - 1) {
                            constraintAnchor14 = arrayList.get(i102 + 1).f16119b.f15952K;
                            i97 = 0;
                        } else {
                            i97 = this.f16149x0;
                            constraintAnchor14 = constraintAnchor4;
                        }
                        ConstraintAnchor constraintAnchor15 = aVar10.f16119b.f15954M;
                        aVar10.f(i28, constraintAnchor11, constraintAnchor12, constraintAnchor13, constraintAnchor14, i99, i95, i96, i97, i93);
                        int iMax3 = Math.max(i100, aVar10.d());
                        int iC2 = aVar10.c() + i101;
                        if (i102 > 0) {
                            iC2 += this.f16106U0;
                        }
                        i100 = iMax3;
                        i101 = iC2;
                        constraintAnchor12 = constraintAnchor15;
                        i95 = 0;
                    } else {
                        if (i102 < size2 - 1) {
                            constraintAnchor13 = arrayList.get(i102 + 1).f16119b.f15951J;
                            i96 = 0;
                        } else {
                            i96 = this.f16142B0;
                            constraintAnchor13 = constraintAnchor3;
                        }
                        ConstraintAnchor constraintAnchor16 = aVar10.f16119b.f15953L;
                        aVar10.f(i28, constraintAnchor11, constraintAnchor12, constraintAnchor13, constraintAnchor14, i99, i95, i96, i97, i93);
                        int iD2 = aVar10.d() + i100;
                        int iMax4 = Math.max(i101, aVar10.c());
                        if (i102 > 0) {
                            iD2 += this.f16105T0;
                        }
                        i101 = iMax4;
                        constraintAnchor11 = constraintAnchor16;
                        i100 = iD2;
                        i99 = 0;
                    }
                }
                iArr[0] = i100;
                iArr[1] = i101;
            }
        }
        i19 = 0;
        c10 = 1;
        iMin = iArr[i19] + i17 + i16;
        i20 = iArr[c10] + i15 + i18;
        if (i10 == 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i11);
            } else {
                c10 = c10;
                i21 = i12;
                if (i10 != 0) {
                    iMin = i19;
                }
            }
            if (i21 == 1073741824) {
                iMin2 = i13;
            } else if (i21 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i20, i13);
            } else if (i21 == 0) {
                iMin2 = i20;
            } else {
                iMin2 = i19;
            }
            this.f16144D0 = iMin;
            this.f16145E0 = iMin2;
            S(iMin);
            P(iMin2);
            if (this.v0 > 0) {
                z10 = c10;
            } else {
                z10 = i19;
            }
            this.f16143C0 = z10;
        }
        iMin = i11;
        i21 = i12;
        if (i21 == 1073741824) {
            iMin2 = i13;
        } else if (i21 == Integer.MIN_VALUE) {
            iMin2 = Math.min(i20, i13);
        } else if (i21 == 0) {
            iMin2 = i20;
        } else {
            iMin2 = i19;
        }
        this.f16144D0 = iMin;
        this.f16145E0 = iMin2;
        S(iMin);
        P(iMin2);
        if (this.v0 > 0) {
            z10 = c10;
        } else {
            z10 = i19;
        }
        this.f16143C0 = z10;
    }

    public final int Y(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f15962U[1] == ConstraintWidget.DimensionBehaviour.f16015d) {
            int i11 = constraintWidget.f16003s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f16012z * i10);
                if (i12 != constraintWidget.o()) {
                    constraintWidget.f15980g = true;
                    X(constraintWidget, constraintWidget.f15962U[0], constraintWidget.u(), ConstraintWidget.DimensionBehaviour.f16013b, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.o();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.u() * constraintWidget.f15966Y) + 0.5f);
            }
        }
        return constraintWidget.o();
    }

    public final int Z(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f15962U[0] == ConstraintWidget.DimensionBehaviour.f16015d) {
            int i11 = constraintWidget.f16001r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f16009w * i10);
                if (i12 != constraintWidget.u()) {
                    constraintWidget.f15980g = true;
                    X(constraintWidget, ConstraintWidget.DimensionBehaviour.f16013b, i12, constraintWidget.f15962U[1], constraintWidget.o());
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.u();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.o() * constraintWidget.f15966Y) + 0.5f);
            }
        }
        return constraintWidget.u();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        ConstraintWidget constraintWidget;
        float f10;
        int i10;
        super.e(cVar, z10);
        ConstraintWidget constraintWidget2 = this.f15963V;
        boolean z11 = constraintWidget2 != null && ((d) constraintWidget2).f16092z0;
        int i11 = this.f16109X0;
        ArrayList<a> arrayList = this.f16112a1;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    arrayList.get(i12).b(i12, z11, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        arrayList.get(i13).b(i13, z11, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.f16115d1 != null && this.f16114c1 != null && this.f16113b1 != null) {
                for (int i14 = 0; i14 < this.f16117f1; i14++) {
                    this.f16116e1[i14].H();
                }
                int[] iArr = this.f16115d1;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.f16099N0;
                ConstraintWidget constraintWidget3 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z11) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.f16099N0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    ConstraintWidget constraintWidget4 = this.f16114c1[i10];
                    if (constraintWidget4 != null && constraintWidget4.f15985i0 != 8) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.f15951J;
                        if (i17 == 0) {
                            constraintWidget4.i(constraintAnchor, this.f15951J, this.f16141A0);
                            constraintWidget4.f15990l0 = this.f16093H0;
                            constraintWidget4.f15979f0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            constraintWidget4.i(constraintWidget4.f15953L, this.f15953L, this.f16142B0);
                        }
                        if (i17 > 0 && constraintWidget3 != null) {
                            int i18 = this.f16105T0;
                            ConstraintAnchor constraintAnchor2 = constraintWidget3.f15953L;
                            constraintWidget4.i(constraintAnchor, constraintAnchor2, i18);
                            constraintWidget3.i(constraintAnchor2, constraintAnchor, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    ConstraintWidget constraintWidget5 = this.f16113b1[i19];
                    if (constraintWidget5 != null && constraintWidget5.f15985i0 != 8) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.f15952K;
                        if (i19 == 0) {
                            constraintWidget5.i(constraintAnchor3, this.f15952K, this.f16148w0);
                            constraintWidget5.f15992m0 = this.f16094I0;
                            constraintWidget5.f15981g0 = this.f16100O0;
                        }
                        if (i19 == i16 - 1) {
                            constraintWidget5.i(constraintWidget5.f15954M, this.f15954M, this.f16149x0);
                        }
                        if (i19 > 0 && constraintWidget3 != null) {
                            int i20 = this.f16106U0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget3.f15954M;
                            constraintWidget5.i(constraintAnchor3, constraintAnchor4, i20);
                            constraintWidget3.i(constraintAnchor4, constraintAnchor3, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i21 = 0; i21 < i15; i21++) {
                    for (int i22 = 0; i22 < i16; i22++) {
                        int i23 = (i22 * i15) + i21;
                        if (this.f16111Z0 == 1) {
                            i23 = (i21 * i16) + i22;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f16116e1;
                        if (i23 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i23]) != null && constraintWidget.f15985i0 != 8) {
                            ConstraintWidget constraintWidget6 = this.f16114c1[i21];
                            ConstraintWidget constraintWidget7 = this.f16113b1[i22];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.i(constraintWidget.f15951J, constraintWidget6.f15951J, 0);
                                constraintWidget.i(constraintWidget.f15953L, constraintWidget6.f15953L, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.i(constraintWidget.f15952K, constraintWidget7.f15952K, 0);
                                constraintWidget.i(constraintWidget.f15954M, constraintWidget7.f15954M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.f16143C0 = false;
    }

    @Override // p089h0.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        e eVar = (e) constraintWidget;
        this.f16093H0 = eVar.f16093H0;
        this.f16094I0 = eVar.f16094I0;
        this.f16095J0 = eVar.f16095J0;
        this.f16096K0 = eVar.f16096K0;
        this.f16097L0 = eVar.f16097L0;
        this.f16098M0 = eVar.f16098M0;
        this.f16099N0 = eVar.f16099N0;
        this.f16100O0 = eVar.f16100O0;
        this.f16101P0 = eVar.f16101P0;
        this.f16102Q0 = eVar.f16102Q0;
        this.f16103R0 = eVar.f16103R0;
        this.f16104S0 = eVar.f16104S0;
        this.f16105T0 = eVar.f16105T0;
        this.f16106U0 = eVar.f16106U0;
        this.f16107V0 = eVar.f16107V0;
        this.f16108W0 = eVar.f16108W0;
        this.f16109X0 = eVar.f16109X0;
        this.f16110Y0 = eVar.f16110Y0;
        this.f16111Z0 = eVar.f16111Z0;
    }
}
