package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    @Override // androidx.constraintlayout.core.widgets.i
    public final void W(int i10, int i11, int i12, int i13) {
        int iU = this.f16141A0 + this.f16142B0;
        int iO = this.f16148w0 + this.f16149x0;
        if (this.v0 > 0) {
            iU += this.f35714u0[0].u();
            iO += this.f35714u0[0].o();
        }
        int iMax = Math.max(this.f15975d0, iU);
        int iMax2 = Math.max(this.f15977e0, iO);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(iMax, i11);
            } else {
                i11 = i10 == 0 ? iMax : 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(iMax2, i13);
            } else {
                i13 = i12 == 0 ? iMax2 : 0;
            }
        }
        this.f16144D0 = i11;
        this.f16145E0 = i13;
        S(i11);
        P(i13);
        this.f16143C0 = this.v0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        super.e(cVar, z10);
        if (this.v0 > 0) {
            ConstraintWidget constraintWidget = this.f35714u0[0];
            constraintWidget.H();
            constraintWidget.f15981g0 = 0.5f;
            constraintWidget.f15979f0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.f15934b;
            constraintWidget.h(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f15936d;
            constraintWidget.h(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f15935c;
            constraintWidget.h(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f15937e;
            constraintWidget.h(type4, this, type4, 0);
        }
    }
}
