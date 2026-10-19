package p101i0;

import androidx.compose.ui.text.font.s;
import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import androidx.constraintlayout.core.widgets.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p005a4.q;

/* JADX INFO: compiled from: WidgetGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f36486f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f36487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<a> f36490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36491e;

    /* JADX INFO: compiled from: WidgetGroup.java */
    public static class a {
    }

    public final void a(ArrayList<j> arrayList) {
        int size = this.f36487a.size();
        if (this.f36491e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j jVar = arrayList.get(i10);
                if (this.f36491e == jVar.f36488b) {
                    c(this.f36489c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList<ConstraintWidget> arrayList = this.f36487a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d dVar = (d) arrayList.get(0).f15963V;
        cVar.t();
        dVar.e(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).e(cVar, false);
        }
        if (i10 == 0 && dVar.f16076D0 > 0) {
            b.a(dVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.f16077E0 > 0) {
            b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f36490d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ConstraintWidget constraintWidget = arrayList.get(i12);
            a aVar = new a();
            new WeakReference(constraintWidget);
            c.n(constraintWidget.f15951J);
            c.n(constraintWidget.f15952K);
            c.n(constraintWidget.f15953L);
            c.n(constraintWidget.f15954M);
            c.n(constraintWidget.f15955N);
            this.f36490d.add(aVar);
        }
        if (i10 == 0) {
            iN = c.n(dVar.f15951J);
            iN2 = c.n(dVar.f15953L);
            cVar.t();
        } else {
            iN = c.n(dVar.f15952K);
            iN2 = c.n(dVar.f15954M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, j jVar) {
        for (ConstraintWidget constraintWidget : this.f36487a) {
            ArrayList<ConstraintWidget> arrayList = jVar.f36487a;
            if (!arrayList.contains(constraintWidget)) {
                arrayList.add(constraintWidget);
            }
            int i11 = jVar.f36488b;
            if (i10 == 0) {
                constraintWidget.f16004s0 = i11;
            } else {
                constraintWidget.f16006t0 = i11;
            }
        }
        this.f36491e = jVar.f36488b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f36489c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strC = q.c(sb2, this.f36488b, "] <");
        for (ConstraintWidget constraintWidget : this.f36487a) {
            StringBuilder sbF = C4.b.f(strC, " ");
            sbF.append(constraintWidget.f15988k0);
            strC = sbF.toString();
        }
        return s.b(strC, " >");
    }
}
