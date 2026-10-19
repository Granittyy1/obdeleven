package J5;

import S5.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.google.android.material.floatingactionbutton.b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public StateListAnimator f4039N;

    /* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends S5.f {
        @Override // S5.f, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final float e() {
        return this.f27195v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void f(Rect rect) {
        if (FloatingActionButton.this.f27151l) {
            super.f(rect);
            return;
        }
        if (this.f27180f) {
            FloatingActionButton floatingActionButton = this.f27195v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f27184k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        i iVar = this.f27175a;
        iVar.getClass();
        a aVar = new a(iVar);
        this.f27176b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.f27176b.setTintMode(mode);
        }
        S5.f fVar = this.f27176b;
        FloatingActionButton floatingActionButton = this.f27195v;
        fVar.i(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            i iVar2 = this.f27175a;
            iVar2.getClass();
            J5.a aVar2 = new J5.a(iVar2);
            int iA = p0.a.b.a(context, R.color.design_fab_stroke_top_outer_color);
            int iA2 = p0.a.b.a(context, R.color.design_fab_stroke_top_inner_color);
            int iA3 = p0.a.b.a(context, R.color.design_fab_stroke_end_inner_color);
            int iA4 = p0.a.b.a(context, R.color.design_fab_stroke_end_outer_color);
            aVar2.f4022i = iA;
            aVar2.j = iA2;
            aVar2.f4023k = iA3;
            aVar2.f4024l = iA4;
            float f10 = i10;
            if (aVar2.f4021h != f10) {
                aVar2.f4021h = f10;
                aVar2.f4015b.setStrokeWidth(f10 * 1.3333f);
                aVar2.f4026n = true;
                aVar2.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar2.f4025m = colorStateList.getColorForState(aVar2.getState(), aVar2.f4025m);
            }
            aVar2.f4028p = colorStateList;
            aVar2.f4026n = true;
            aVar2.invalidateSelf();
            this.f27178d = aVar2;
            J5.a aVar3 = this.f27178d;
            aVar3.getClass();
            S5.f fVar2 = this.f27176b;
            fVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{aVar3, fVar2});
        } else {
            this.f27178d = null;
            layerDrawable = this.f27176b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(Q5.a.b(colorStateList2), layerDrawable, null);
        this.f27177c = rippleDrawable;
        this.f27179e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void i() {
        q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.floatingactionbutton.b
    public final void k(float f10, float f11, float f12) {
        FloatingActionButton floatingActionButton = this.f27195v;
        if (floatingActionButton.getStateListAnimator() == this.f4039N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27167H, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27168I, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27169J, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27170K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.b.f27162C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27171L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f27172M, r(0.0f, 0.0f));
            this.f4039N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f27177c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(Q5.a.b(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final boolean o() {
        return FloatingActionButton.this.f27151l || (this.f27180f && this.f27195v.getSizeDimension() < this.f27184k);
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f27195v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.b.f27162C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void j(int[] iArr) {
    }
}
