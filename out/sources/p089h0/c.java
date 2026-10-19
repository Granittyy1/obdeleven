package p089h0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p064f0.a;

/* JADX INFO: compiled from: WidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends ConstraintWidget {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f35715u0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void G() {
        this.f35715u0.clear();
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void J(a aVar) {
        super.J(aVar);
        int size = this.f35715u0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35715u0.get(i10).J(aVar);
        }
    }

    public void V() {
        ArrayList<ConstraintWidget> arrayList = this.f35715u0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f35715u0.get(i10);
            if (constraintWidget instanceof c) {
                ((c) constraintWidget).V();
            }
        }
    }
}
