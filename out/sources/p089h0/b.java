package p089h0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p101i0.g;
import p101i0.j;

/* JADX INFO: compiled from: HelperWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends ConstraintWidget implements a {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ConstraintWidget[] f35714u0 = new ConstraintWidget[4];
    public int v0 = 0;

    public final void V(int i10, j jVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.v0; i11++) {
            ConstraintWidget constraintWidget = this.f35714u0[i11];
            ArrayList<ConstraintWidget> arrayList2 = jVar.f36487a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i12 = 0; i12 < this.v0; i12++) {
            g.a(this.f35714u0[i12], i10, arrayList, jVar);
        }
    }

    @Override // p089h0.a
    public final void a() {
        this.v0 = 0;
        Arrays.fill(this.f35714u0, (Object) null);
    }

    @Override // p089h0.a
    public final void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i10 = this.v0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f35714u0;
        if (i10 > constraintWidgetArr.length) {
            this.f35714u0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f35714u0;
        int i11 = this.v0;
        constraintWidgetArr2[i11] = constraintWidget;
        this.v0 = i11 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        b bVar = (b) constraintWidget;
        this.v0 = 0;
        int i10 = bVar.v0;
        for (int i11 = 0; i11 < i10; i11++) {
            b(map.get(bVar.f35714u0[i11]));
        }
    }

    public void c() {
    }
}
