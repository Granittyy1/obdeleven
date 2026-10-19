package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f27688c;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f27688c;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z10, z12);
        this.f27688c = animatorSetX;
        animatorSetX.addListener(new p007a6.a(this));
        this.f27688c.start();
        if (z11) {
            return;
        }
        this.f27688c.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
