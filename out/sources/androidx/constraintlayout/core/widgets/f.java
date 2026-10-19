package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ConstraintWidget {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f16135u0 = -1.0f;
    public int v0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f16136w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ConstraintAnchor f16137x0 = this.f15952K;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f16138y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16139z0;

    public f() {
        this.f15960S.clear();
        this.f15960S.add(this.f16137x0);
        int length = this.f15959R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f15959R[i10] = this.f16137x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.f16139z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.f16139z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void U(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (this.f15963V == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f16137x0;
        cVar.getClass();
        int iN = androidx.constraintlayout.core.c.n(constraintAnchor);
        if (this.f16138y0 == 1) {
            this.f15969a0 = iN;
            this.f15971b0 = 0;
            P(this.f15963V.o());
            S(0);
            return;
        }
        this.f15969a0 = 0;
        this.f15971b0 = iN;
        S(this.f15963V.u());
        P(0);
    }

    public final void V(int i10) {
        this.f16137x0.l(i10);
        this.f16139z0 = true;
    }

    public final void W(int i10) {
        if (this.f16138y0 == i10) {
            return;
        }
        this.f16138y0 = i10;
        ArrayList<ConstraintAnchor> arrayList = this.f15960S;
        arrayList.clear();
        if (this.f16138y0 == 1) {
            this.f16137x0 = this.f15951J;
        } else {
            this.f16137x0 = this.f15952K;
        }
        arrayList.add(this.f16137x0);
        ConstraintAnchor[] constraintAnchorArr = this.f15959R;
        int length = constraintAnchorArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            constraintAnchorArr[i11] = this.f16137x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        d dVar = (d) this.f15963V;
        if (dVar == null) {
            return;
        }
        Object objM = dVar.m(ConstraintAnchor.Type.f15934b);
        Object objM2 = dVar.m(ConstraintAnchor.Type.f15936d);
        ConstraintWidget constraintWidget = this.f15963V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16014c;
        boolean z11 = constraintWidget != null && constraintWidget.f15962U[0] == dimensionBehaviour;
        if (this.f16138y0 == 0) {
            objM = dVar.m(ConstraintAnchor.Type.f15935c);
            objM2 = dVar.m(ConstraintAnchor.Type.f15937e);
            ConstraintWidget constraintWidget2 = this.f15963V;
            z11 = constraintWidget2 != null && constraintWidget2.f15962U[1] == dimensionBehaviour;
        }
        if (this.f16139z0) {
            ConstraintAnchor constraintAnchor = this.f16137x0;
            if (constraintAnchor.f15927c) {
                SolverVariable solverVariableK = cVar.k(constraintAnchor);
                cVar.d(solverVariableK, this.f16137x0.d());
                if (this.v0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(objM2), solverVariableK, 0, 5);
                    }
                } else if (this.f16136w0 != -1 && z11) {
                    SolverVariable solverVariableK2 = cVar.k(objM2);
                    cVar.f(solverVariableK, cVar.k(objM), 0, 5);
                    cVar.f(solverVariableK2, solverVariableK, 0, 5);
                }
                this.f16139z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            SolverVariable solverVariableK3 = cVar.k(this.f16137x0);
            cVar.e(solverVariableK3, cVar.k(objM), this.v0, 8);
            if (z11) {
                cVar.f(cVar.k(objM2), solverVariableK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f16136w0 != -1) {
            SolverVariable solverVariableK4 = cVar.k(this.f16137x0);
            SolverVariable solverVariableK5 = cVar.k(objM2);
            cVar.e(solverVariableK4, solverVariableK5, -this.f16136w0, 8);
            if (z11) {
                cVar.f(solverVariableK4, cVar.k(objM), 0, 5);
                cVar.f(solverVariableK5, solverVariableK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f16135u0 != -1.0f) {
            SolverVariable solverVariableK6 = cVar.k(this.f16137x0);
            SolverVariable solverVariableK7 = cVar.k(objM2);
            float f10 = this.f16135u0;
            androidx.constraintlayout.core.b bVarL = cVar.l();
            bVarL.f15901d.d(solverVariableK6, -1.0f);
            bVarL.f15901d.d(solverVariableK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.f16135u0 = fVar.f16135u0;
        this.v0 = fVar.v0;
        this.f16136w0 = fVar.f16136w0;
        W(fVar.f16138y0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor m(ConstraintAnchor.Type type) {
        int iOrdinal = type.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f16138y0 == 0) {
                return this.f16137x0;
            }
            return null;
        }
        if (this.f16138y0 == 1) {
            return this.f16137x0;
        }
        return null;
    }
}
