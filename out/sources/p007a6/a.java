package p007a6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: compiled from: ExpandableTransformationBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f8060b;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f8060b = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8060b.f27688c = null;
    }
}
