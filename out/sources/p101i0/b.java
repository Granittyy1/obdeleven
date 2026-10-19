package p101i0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: BasicMeasure.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f36461a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36462b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f36463c;

    /* JADX INFO: compiled from: BasicMeasure.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f36464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f36465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36471h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f36472i;
        public int j;
    }

    /* JADX INFO: renamed from: i0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public interface InterfaceC0381b {
    }

    public b(d dVar) {
        this.f36463c = dVar;
    }

    public final boolean a(int i10, ConstraintWidget constraintWidget, InterfaceC0381b interfaceC0381b) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f36462b;
        aVar.f36464a = dimensionBehaviour;
        aVar.f36465b = dimensionBehaviourArr[1];
        aVar.f36466c = constraintWidget.u();
        aVar.f36467d = constraintWidget.o();
        aVar.f36472i = false;
        aVar.j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f36464a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
        boolean z10 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z11 = aVar.f36465b == dimensionBehaviour3;
        boolean z12 = z10 && constraintWidget.f15966Y > 0.0f;
        boolean z13 = z11 && constraintWidget.f15966Y > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16013b;
        int[] iArr = constraintWidget.f16005t;
        if (z12 && iArr[0] == 4) {
            aVar.f36464a = dimensionBehaviour4;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f36465b = dimensionBehaviour4;
        }
        ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget, aVar);
        constraintWidget.S(aVar.f36468e);
        constraintWidget.P(aVar.f36469f);
        constraintWidget.f15946E = aVar.f36471h;
        constraintWidget.M(aVar.f36470g);
        aVar.j = 0;
        return aVar.f36472i;
    }

    public final void b(d dVar, int i10, int i11, int i12) {
        dVar.getClass();
        int i13 = dVar.f15975d0;
        int i14 = dVar.f15977e0;
        dVar.f15975d0 = 0;
        dVar.f15977e0 = 0;
        dVar.S(i11);
        dVar.P(i12);
        if (i13 < 0) {
            dVar.f15975d0 = 0;
        } else {
            dVar.f15975d0 = i13;
        }
        if (i14 < 0) {
            dVar.f15977e0 = 0;
        } else {
            dVar.f15977e0 = i14;
        }
        d dVar2 = this.f36463c;
        dVar2.f16090x0 = i10;
        dVar2.V();
    }

    public final void c(d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.f36461a;
        arrayList.clear();
        int size = dVar.f35715u0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = dVar.f35715u0.get(i10);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16015d;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.f16089w0.f36476b = true;
    }
}
