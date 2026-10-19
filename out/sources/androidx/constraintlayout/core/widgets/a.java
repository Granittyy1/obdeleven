package androidx.constraintlayout.core.widgets;

import androidx.compose.ui.text.font.s;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: compiled from: Barrier.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p089h0.b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f16018w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f16019x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f16020y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16021z0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.f16021z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.f16021z0;
    }

    public final boolean W() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.v0;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.f35714u0[i13];
            if ((this.f16019x0 || constraintWidget.f()) && ((((i11 = this.f16018w0) == 0 || i11 == 1) && !constraintWidget.E()) || (((i12 = this.f16018w0) == 2 || i12 == 3) && !constraintWidget.F()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.v0; i14++) {
            ConstraintWidget constraintWidget2 = this.f35714u0[i14];
            if (this.f16019x0 || constraintWidget2.f()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.f15937e;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f15935c;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f15936d;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f15934b;
                if (!z11) {
                    int i15 = this.f16018w0;
                    if (i15 == 0) {
                        iMax = constraintWidget2.m(type4).d();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.m(type3).d();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.m(type2).d();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.m(type).d();
                    }
                    z11 = true;
                }
                int i16 = this.f16018w0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.m(type4).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.m(type3).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.m(type2).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.m(type).d());
                }
            }
        }
        int i17 = iMax + this.f16020y0;
        int i18 = this.f16018w0;
        if (i18 == 0 || i18 == 1) {
            N(i17, i17);
        } else {
            O(i17, i17);
        }
        this.f16021z0 = true;
        return true;
    }

    public final int X() {
        int i10 = this.f16018w0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        int i10;
        ConstraintAnchor[] constraintAnchorArr = this.f15959R;
        ConstraintAnchor constraintAnchor = this.f15951J;
        constraintAnchorArr[0] = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = this.f15952K;
        int i11 = 2;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f15953L;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f15954M;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f15933i = cVar.k(constraintAnchor5);
        }
        int i12 = this.f16018w0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i12];
        if (!this.f16021z0) {
            W();
        }
        if (this.f16021z0) {
            this.f16021z0 = false;
            int i13 = this.f16018w0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(constraintAnchor.f15933i, this.f15969a0);
                cVar.d(constraintAnchor3.f15933i, this.f15969a0);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(constraintAnchor2.f15933i, this.f15971b0);
                    cVar.d(constraintAnchor4.f15933i, this.f15971b0);
                    return;
                }
                return;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.v0) {
                z11 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f35714u0[i14];
            if (this.f16019x0 || constraintWidget.f()) {
                int i15 = this.f16018w0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
                if (((i15 == 0 || i15 == 1) && constraintWidget.f15962U[0] == dimensionBehaviour && constraintWidget.f15951J.f15930f != null && constraintWidget.f15953L.f15930f != null) || ((i15 == 2 || i15 == 3) && constraintWidget.f15962U[1] == dimensionBehaviour && constraintWidget.f15952K.f15930f != null && constraintWidget.f15954M.f15930f != null)) {
                    z11 = true;
                    break;
                }
            }
            i14++;
        }
        boolean z12 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z13 = constraintAnchor2.g() || constraintAnchor4.g();
        int i16 = (z11 || !(((i10 = this.f16018w0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.v0) {
            ConstraintWidget constraintWidget2 = this.f35714u0[i17];
            if (this.f16019x0 || constraintWidget2.f()) {
                SolverVariable solverVariableK = cVar.k(constraintWidget2.f15959R[this.f16018w0]);
                int i18 = this.f16018w0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f15959R[i18];
                constraintAnchor7.f15933i = solverVariableK;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f15930f;
                int i19 = (constraintAnchor8 == null || constraintAnchor8.f15928d != this) ? 0 : constraintAnchor7.f15931g;
                if (i18 == 0 || i18 == i11) {
                    SolverVariable solverVariable = constraintAnchor6.f15933i;
                    int i20 = this.f16020y0 - i19;
                    androidx.constraintlayout.core.b bVarL = cVar.l();
                    SolverVariable solverVariableM = cVar.m();
                    solverVariableM.f15876e = 0;
                    bVarL.d(solverVariable, solverVariableK, solverVariableM, i20);
                    cVar.c(bVarL);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.f15933i;
                    int i21 = this.f16020y0 + i19;
                    androidx.constraintlayout.core.b bVarL2 = cVar.l();
                    SolverVariable solverVariableM2 = cVar.m();
                    solverVariableM2.f15876e = 0;
                    bVarL2.c(solverVariable2, solverVariableK, solverVariableM2, i21);
                    cVar.c(bVarL2);
                }
                cVar.e(constraintAnchor6.f15933i, solverVariableK, this.f16020y0 + i19, i16);
            }
            i17++;
            i11 = 2;
        }
        int i22 = this.f16018w0;
        if (i22 == 0) {
            cVar.e(constraintAnchor3.f15933i, constraintAnchor.f15933i, 0, 8);
            cVar.e(constraintAnchor.f15933i, this.f15963V.f15953L.f15933i, 0, 4);
            cVar.e(constraintAnchor.f15933i, this.f15963V.f15951J.f15933i, 0, 0);
            return;
        }
        if (i22 == 1) {
            cVar.e(constraintAnchor.f15933i, constraintAnchor3.f15933i, 0, 8);
            cVar.e(constraintAnchor.f15933i, this.f15963V.f15951J.f15933i, 0, 4);
            cVar.e(constraintAnchor.f15933i, this.f15963V.f15953L.f15933i, 0, 0);
        } else if (i22 == 2) {
            cVar.e(constraintAnchor4.f15933i, constraintAnchor2.f15933i, 0, 8);
            cVar.e(constraintAnchor2.f15933i, this.f15963V.f15954M.f15933i, 0, 4);
            cVar.e(constraintAnchor2.f15933i, this.f15963V.f15952K.f15933i, 0, 0);
        } else if (i22 == 3) {
            cVar.e(constraintAnchor2.f15933i, constraintAnchor4.f15933i, 0, 8);
            cVar.e(constraintAnchor2.f15933i, this.f15963V.f15952K.f15933i, 0, 4);
            cVar.e(constraintAnchor2.f15933i, this.f15963V.f15954M.f15933i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // p089h0.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        a aVar = (a) constraintWidget;
        this.f16018w0 = aVar.f16018w0;
        this.f16019x0 = aVar.f16019x0;
        this.f16020y0 = aVar.f16020y0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strA = Q8.d.a(new StringBuilder("[Barrier] "), this.f15988k0, " {");
        for (int i10 = 0; i10 < this.v0; i10++) {
            ConstraintWidget constraintWidget = this.f35714u0[i10];
            if (i10 > 0) {
                strA = s.b(strA, ", ");
            }
            StringBuilder sbE = C4.b.e(strA);
            sbE.append(constraintWidget.f15988k0);
            strA = sbE.toString();
        }
        return s.b(strA, "}");
    }
}
