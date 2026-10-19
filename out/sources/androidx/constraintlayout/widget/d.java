package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16620b;

    public d(Context context) {
        super(context);
        this.f16620b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f16620b = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f16620b && aVar.f16421a == i10) {
            return;
        }
        aVar.f16421a = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f16620b && aVar.f16423b == i10) {
            return;
        }
        aVar.f16423b = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f16620b && aVar.f16425c == f10) {
            return;
        }
        aVar.f16425c = f10;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
