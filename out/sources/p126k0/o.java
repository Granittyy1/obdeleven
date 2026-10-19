package p126k0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import p139l0.d;

/* JADX INFO: compiled from: MotionHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a implements MotionLayout.h {
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View[] f41366m;

    public float getProgress() {
        return this.f41365l;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f44134m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.j = typedArrayObtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == 0) {
                    this.f41364k = typedArrayObtainStyledAttributes.getBoolean(index, this.f41364k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f41365l = f10;
        int i10 = 0;
        if (this.f16473c <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                boolean z10 = viewGroup.getChildAt(i10) instanceof o;
                i10++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f16478h;
        if (viewArr == null || viewArr.length != this.f16473c) {
            this.f16478h = new View[this.f16473c];
        }
        for (int i11 = 0; i11 < this.f16473c; i11++) {
            this.f16478h[i11] = constraintLayout.c(this.f16472b[i11]);
        }
        this.f41366m = this.f16478h;
        while (i10 < this.f16473c) {
            View view = this.f41366m[i10];
            i10++;
        }
    }
}
