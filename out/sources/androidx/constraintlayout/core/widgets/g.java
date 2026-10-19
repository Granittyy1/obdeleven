package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Optimizer.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f16140a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f15995o = -1;
        constraintWidget.f15997p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f15962U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16014c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16016e;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f15962U[0] == dimensionBehaviour3) {
            ConstraintAnchor constraintAnchor = constraintWidget.f15951J;
            int i10 = constraintAnchor.f15931g;
            int iU = dVar.u();
            ConstraintAnchor constraintAnchor2 = constraintWidget.f15953L;
            int i11 = iU - constraintAnchor2.f15931g;
            constraintAnchor.f15933i = cVar.k(constraintAnchor);
            constraintAnchor2.f15933i = cVar.k(constraintAnchor2);
            cVar.d(constraintAnchor.f15933i, i10);
            cVar.d(constraintAnchor2.f15933i, i11);
            constraintWidget.f15995o = 2;
            constraintWidget.f15969a0 = i10;
            int i12 = i11 - i10;
            constraintWidget.f15964W = i12;
            int i13 = constraintWidget.f15975d0;
            if (i12 < i13) {
                constraintWidget.f15964W = i13;
            }
        }
        if (dVar.f15962U[1] == dimensionBehaviour2 || constraintWidget.f15962U[1] != dimensionBehaviour3) {
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f15952K;
        int i14 = constraintAnchor3.f15931g;
        int iO = dVar.o();
        ConstraintAnchor constraintAnchor4 = constraintWidget.f15954M;
        int i15 = iO - constraintAnchor4.f15931g;
        constraintAnchor3.f15933i = cVar.k(constraintAnchor3);
        constraintAnchor4.f15933i = cVar.k(constraintAnchor4);
        cVar.d(constraintAnchor3.f15933i, i14);
        cVar.d(constraintAnchor4.f15933i, i15);
        if (constraintWidget.f15973c0 > 0 || constraintWidget.f15985i0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f15955N;
            constraintAnchor5.f15933i = cVar.k(constraintAnchor5);
            cVar.d(constraintAnchor5.f15933i, constraintWidget.f15973c0 + i14);
        }
        constraintWidget.f15997p = 2;
        constraintWidget.f15971b0 = i14;
        int i16 = i15 - i14;
        constraintWidget.f15965X = i16;
        int i17 = constraintWidget.f15977e0;
        if (i16 < i17) {
            constraintWidget.f15965X = i17;
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
