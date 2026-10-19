package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends a {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f16363l;

    public Barrier(Context context) {
        super(context);
        this.f16472b = new int[32];
        this.f16478h = null;
        this.f16479i = new HashMap<>();
        this.f16474d = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f16363l.f16019x0;
    }

    public int getMargin() {
        return this.f16363l.f16020y0;
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f16363l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p139l0.d.f44124b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f16363l.f16019x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f16363l.f16020y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f16475e = this.f16363l;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(b.a aVar, p089h0.b bVar, c.a aVar2, SparseArray sparseArray) {
        super.i(aVar, bVar, aVar2, sparseArray);
        if (bVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar3 = (androidx.constraintlayout.core.widgets.a) bVar;
            boolean z10 = ((androidx.constraintlayout.core.widgets.d) bVar.f15963V).f16092z0;
            b.C0170b c0170b = aVar.f16493e;
            l(aVar3, c0170b.f16548g0, z10);
            aVar3.f16019x0 = c0170b.f16563o0;
            aVar3.f16020y0 = c0170b.f16550h0;
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(ConstraintWidget constraintWidget, boolean z10) {
        l(constraintWidget, this.j, z10);
    }

    public final void l(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f16362k = i10;
        if (z10) {
            int i11 = this.j;
            if (i11 == 5) {
                this.f16362k = 1;
            } else if (i11 == 6) {
                this.f16362k = 0;
            }
        } else {
            int i12 = this.j;
            if (i12 == 5) {
                this.f16362k = 0;
            } else if (i12 == 6) {
                this.f16362k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).f16018w0 = this.f16362k;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f16363l.f16019x0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f16363l.f16020y0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f16363l.f16020y0 = i10;
    }

    public void setType(int i10) {
        this.j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
