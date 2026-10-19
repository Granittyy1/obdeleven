package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import p139l0.d;
import p139l0.g;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f16152l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p139l0.g, androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f16152l = new e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f44124b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f16152l.f16111Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar = this.f16152l;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f16148w0 = dimensionPixelSize;
                    eVar.f16149x0 = dimensionPixelSize;
                    eVar.f16150y0 = dimensionPixelSize;
                    eVar.f16151z0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar2 = this.f16152l;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f16150y0 = dimensionPixelSize2;
                    eVar2.f16141A0 = dimensionPixelSize2;
                    eVar2.f16142B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f16152l.f16151z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f16152l.f16141A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f16152l.f16148w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f16152l.f16142B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f16152l.f16149x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f16152l.f16109X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f16152l.f16093H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f16152l.f16094I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f16152l.f16095J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f16152l.f16097L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f16152l.f16096K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f16152l.f16098M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f16152l.f16099N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f16152l.f16101P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f16152l.f16103R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f16152l.f16102Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f16152l.f16104S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f16152l.f16100O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f16152l.f16107V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f16152l.f16108W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f16152l.f16105T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f16152l.f16106U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f16152l.f16110Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f16475e = this.f16152l;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(b.a aVar, p089h0.b bVar, c.a aVar2, SparseArray sparseArray) {
        super.i(aVar, bVar, aVar2, sparseArray);
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            int i10 = aVar2.f16416V;
            if (i10 != -1) {
                eVar.f16111Z0 = i10;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(ConstraintWidget constraintWidget, boolean z10) {
        e eVar = this.f16152l;
        int i10 = eVar.f16150y0;
        if (i10 > 0 || eVar.f16151z0 > 0) {
            if (z10) {
                eVar.f16141A0 = eVar.f16151z0;
                eVar.f16142B0 = i10;
            } else {
                eVar.f16141A0 = i10;
                eVar.f16142B0 = eVar.f16151z0;
            }
        }
    }

    @Override // p139l0.g
    public final void l(i iVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.W(mode, size, mode2, size2);
            setMeasuredDimension(iVar.f16144D0, iVar.f16145E0);
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onMeasure(int i10, int i11) {
        l(this.f16152l, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f16152l.f16101P0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f16152l.f16095J0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f16152l.f16102Q0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f16152l.f16096K0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f16152l.f16107V0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f16152l.f16099N0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f16152l.f16105T0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f16152l.f16093H0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f16152l.f16103R0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f16152l.f16097L0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f16152l.f16104S0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f16152l.f16098M0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f16152l.f16110Y0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f16152l.f16111Z0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        e eVar = this.f16152l;
        eVar.f16148w0 = i10;
        eVar.f16149x0 = i10;
        eVar.f16150y0 = i10;
        eVar.f16151z0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f16152l.f16149x0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f16152l.f16141A0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f16152l.f16142B0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f16152l.f16148w0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f16152l.f16108W0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f16152l.f16100O0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f16152l.f16106U0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f16152l.f16094I0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f16152l.f16109X0 = i10;
        requestLayout();
    }
}
