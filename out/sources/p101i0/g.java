package p101i0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import p089h0.b;

/* JADX INFO: compiled from: Grouping.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static j a(ConstraintWidget constraintWidget, int i10, ArrayList<j> arrayList, j jVar) {
        int i11;
        int i12 = i10 == 0 ? constraintWidget.f16004s0 : constraintWidget.f16006t0;
        if (i12 != -1 && (jVar == null || i12 != jVar.f36488b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                j jVar2 = arrayList.get(i13);
                if (jVar2.f36488b == i12) {
                    if (jVar != null) {
                        jVar.c(i10, jVar2);
                        arrayList.remove(jVar);
                    }
                    jVar = jVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return jVar;
        }
        if (jVar == null) {
            if (constraintWidget instanceof b) {
                b bVar = (b) constraintWidget;
                int i14 = 0;
                while (true) {
                    if (i14 >= bVar.v0) {
                        i11 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = bVar.f35714u0[i14];
                    if ((i10 == 0 && (i11 = constraintWidget2.f16004s0) != -1) || (i10 == 1 && (i11 = constraintWidget2.f16006t0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        j jVar3 = arrayList.get(i15);
                        if (jVar3.f36488b == i11) {
                            jVar = jVar3;
                            break;
                        }
                    }
                }
            }
            if (jVar == null) {
                jVar = new j();
                jVar.f36487a = new ArrayList<>();
                jVar.f36490d = null;
                jVar.f36491e = -1;
                int i16 = j.f36486f;
                j.f36486f = i16 + 1;
                jVar.f36488b = i16;
                jVar.f36489c = i10;
            }
            arrayList.add(jVar);
        }
        ArrayList<ConstraintWidget> arrayList2 = jVar.f36487a;
        if (!arrayList2.contains(constraintWidget)) {
            arrayList2.add(constraintWidget);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                fVar.f16137x0.c(fVar.f16138y0 == 0 ? 1 : 0, jVar, arrayList);
            }
            int i17 = jVar.f36488b;
            if (i10 == 0) {
                constraintWidget.f16004s0 = i17;
                constraintWidget.f15951J.c(i10, jVar, arrayList);
                constraintWidget.f15953L.c(i10, jVar, arrayList);
            } else {
                constraintWidget.f16006t0 = i17;
                constraintWidget.f15952K.c(i10, jVar, arrayList);
                constraintWidget.f15955N.c(i10, jVar, arrayList);
                constraintWidget.f15954M.c(i10, jVar, arrayList);
            }
            constraintWidget.f15958Q.c(i10, jVar, arrayList);
        }
        return jVar;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f16013b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f16016e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f16014c;
        return (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour7 || (dimensionBehaviour3 == dimensionBehaviour6 && dimensionBehaviour != dimensionBehaviour7)) || (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == dimensionBehaviour7 || (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour2 != dimensionBehaviour7));
    }
}
