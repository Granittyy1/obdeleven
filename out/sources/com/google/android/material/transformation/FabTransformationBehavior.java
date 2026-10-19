package com.google.android.material.transformation;

import A0.f;
import C.e;
import C5.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.X;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p216r5.g;
import p216r5.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f27689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f27690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f27691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f27692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27694i;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f27695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f27697d;

        public a(boolean z10, View view, View view2) {
            this.f27695b = z10;
            this.f27696c = view;
            this.f27697d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f27695b) {
                return;
            }
            this.f27696c.setVisibility(4);
            View view = this.f27697d;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f27695b) {
                this.f27696c.setVisibility(0);
                View view = this.f27697d;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f27698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f27699b;
    }

    public FabTransformationBehavior() {
        this.f27689d = new Rect();
        this.f27690e = new RectF();
        this.f27691f = new RectF();
        this.f27692g = new int[2];
    }

    public static float B(b bVar, h hVar, float f10) {
        long j = hVar.f46355a;
        h hVarD = bVar.f27698a.d("expansion");
        return p216r5.a.a(f10, 0.0f, hVar.b().getInterpolation((((hVarD.f46355a + hVarD.f46356b) + 17) - j) / hVar.f46356b));
    }

    public static Pair y(float f10, float f11, boolean z10, b bVar) {
        h hVarD;
        h hVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVarD = bVar.f27698a.d("translationXLinear");
            hVarD2 = bVar.f27698a.d("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            hVarD = bVar.f27698a.d("translationXCurveDownwards");
            hVarD2 = bVar.f27698a.d("translationYCurveDownwards");
        } else {
            hVarD = bVar.f27698a.d("translationXCurveUpwards");
            hVarD2 = bVar.f27698a.d("translationYCurveUpwards");
        }
        return new Pair(hVarD, hVarD2);
    }

    public final float A(View view, View view2, f fVar) {
        RectF rectF = this.f27690e;
        RectF rectF2 = this.f27691f;
        C(view, rectF);
        rectF.offset(this.f27693h, this.f27694i);
        C(view2, rectF2);
        fVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f27692g;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b D(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        if (fVar.f16656h == 0) {
            fVar.f16656h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x015b  */
    /* JADX WARN: Code duplicated, block: B:97:0x035c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        boolean z12;
        b bVar;
        AnimatorSet animatorSet;
        boolean z13;
        ObjectAnimator objectAnimatorOfInt;
        b bVar2;
        int i10;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt2;
        b bVarD = D(view2.getContext(), z10);
        if (z10) {
            this.f27693h = view.getTranslationX();
            this.f27694i = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        float fI = O.d.i(view2) - O.d.i(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        bVarD.f27698a.d("elevation").a(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat);
        RectF rectF = this.f27690e;
        float fZ = z(view, view2, bVarD.f27699b);
        float fA = A(view, view2, bVarD.f27699b);
        Pair pairY = y(fZ, fA, z10, bVarD);
        h hVar = (h) pairY.first;
        h hVar2 = (h) pairY.second;
        RectF rectF2 = this.f27691f;
        Rect rect = this.f27689d;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(bVarD, hVar, -fZ);
            float fB2 = B(bVarD, hVar2, -fA);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        hVar.a(objectAnimatorOfFloat2);
        hVar2.a(objectAnimatorOfFloat3);
        arrayList2.add(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fZ2 = z(view, view2, bVarD.f27699b);
        float fA2 = A(view, view2, bVarD.f27699b);
        Pair pairY2 = y(fZ2, fA2, z10, bVarD);
        h hVar3 = (h) pairY2.first;
        h hVar4 = (h) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fZ2 = this.f27693h;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fZ2);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, z10 ? fA2 : this.f27694i);
        hVar3.a(objectAnimatorOfFloat7);
        hVar4.a(objectAnimatorOfFloat8);
        arrayList2.add(objectAnimatorOfFloat7);
        arrayList2.add(objectAnimatorOfFloat8);
        boolean z14 = view2 instanceof d;
        if (z14 && (view instanceof ImageView)) {
            d dVar = (d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList3;
            } else {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, p216r5.d.f46348a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, p216r5.d.f46348a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                bVarD.f27698a.d("iconFade").a(objectAnimatorOfInt2);
                arrayList2.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.b bVar3 = new com.google.android.material.transformation.b(dVar, drawable);
                arrayList = arrayList3;
                arrayList.add(bVar3);
            }
        } else {
            arrayList = arrayList3;
        }
        if (z14) {
            d dVar2 = (d) view2;
            f fVar = bVarD.f27699b;
            C(view, rectF);
            rectF.offset(this.f27693h, this.f27694i);
            C(view2, rectF2);
            rectF2.offset(-z(view, view2, fVar), 0.0f);
            float fCenterX = rectF.centerX() - rectF2.left;
            f fVar2 = bVarD.f27699b;
            C(view, rectF);
            rectF.offset(this.f27693h, this.f27694i);
            C(view2, rectF2);
            rectF2.offset(0.0f, -A(view, view2, fVar2));
            float fCenterY = rectF.centerY() - rectF2.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (floatingActionButton.isLaidOut()) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.l(rect);
            }
            float fWidth2 = rect.width() / 2.0f;
            h hVarD = bVarD.f27698a.d("expansion");
            if (z10) {
                if (!z11) {
                    dVar2.setRevealInfo(new d.C0023d(fCenterX, fCenterY, fWidth2));
                }
                if (z11) {
                    fWidth2 = dVar2.getRevealInfo().f2421c;
                }
                float fI2 = e.i(fCenterX, fCenterY, 0.0f, 0.0f);
                float fI3 = e.i(fCenterX, fCenterY, fWidth, 0.0f);
                float fI4 = e.i(fCenterX, fCenterY, fWidth, fHeight);
                float fI5 = e.i(fCenterX, fCenterY, 0.0f, fHeight);
                if (fI2 > fI3 && fI2 > fI4 && fI2 > fI5) {
                    fI4 = fI2;
                } else if (fI3 > fI4 && fI3 > fI5) {
                    fI4 = fI3;
                } else if (fI4 <= fI5) {
                    fI4 = fI5;
                }
                AnimatorSet animatorSetA = C5.b.a(dVar2, fCenterX, fCenterY, fI4);
                animatorSetA.addListener(new c(dVar2));
                long j = hVarD.f46355a;
                int i11 = (int) fCenterX;
                int i12 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i11, i12, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList2.add(animatorCreateCircularReveal);
                }
                z12 = z14;
                bVar = bVarD;
                animatorSet = animatorSetA;
            } else {
                float f10 = dVar2.getRevealInfo().f2421c;
                AnimatorSet animatorSetA2 = C5.b.a(dVar2, fCenterX, fCenterY, fWidth2);
                long j10 = hVarD.f46355a;
                int i13 = (int) fCenterX;
                int i14 = (int) fCenterY;
                long jMax = 0;
                if (j10 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, f10, f10);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j10);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                X<String, h> x10 = bVarD.f27698a.f46353a;
                int i15 = x10.f9139d;
                int i16 = 0;
                while (i16 < i15) {
                    X<String, h> x11 = x10;
                    h hVarM = x10.m(i16);
                    jMax = Math.max(jMax, hVarM.f46355a + hVarM.f46356b);
                    i16++;
                    bVarD = bVarD;
                    x10 = x11;
                    z14 = z14;
                    animatorSetA2 = animatorSetA2;
                }
                AnimatorSet animatorSet2 = animatorSetA2;
                z12 = z14;
                bVar = bVarD;
                long j11 = hVarD.f46355a + hVarD.f46356b;
                if (j11 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j11);
                    animatorCreateCircularReveal3.setDuration(jMax - j11);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
                animatorSet = animatorSet2;
            }
            hVarD.a(animatorSet);
            arrayList2.add(animatorSet);
            arrayList.add(new C5.a(dVar2));
        } else {
            z12 = z14;
            bVar = bVarD;
        }
        if (z12) {
            d dVar3 = (d) view2;
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            ColorStateList colorStateListG = O.d.g(view);
            int colorForState = colorStateListG != null ? colorStateListG.getColorForState(view.getDrawableState(), colorStateListG.getDefaultColor()) : 0;
            int i17 = 16777215 & colorForState;
            z13 = z10;
            if (z13) {
                if (!z11) {
                    dVar3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar3, d.c.f2418a, i17);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar3, d.c.f2418a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(p216r5.b.f46346a);
            bVar2 = bVar;
            bVar2.f27698a.d("color").a(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        } else {
            z13 = z10;
            bVar2 = bVar;
        }
        if (view2 instanceof ViewGroup) {
            boolean z15 = view2 instanceof d;
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof p007a6.c) || (view2 instanceof p007a6.b)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i10 = 0;
            } else {
                if (z13) {
                    if (!z11) {
                        p216r5.c.f46347a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, p216r5.c.f46347a, 1.0f);
                } else {
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, p216r5.c.f46347a, 0.0f);
                }
                bVar2.f27698a.d("contentFade").a(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
        } else {
            i10 = 0;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        Q3.d.F(animatorSet3, arrayList2);
        animatorSet3.addListener(new a(z13, view2, view));
        int size = arrayList.size();
        for (int i18 = i10; i18 < size; i18++) {
            animatorSet3.addListener((Animator.AnimatorListener) arrayList.get(i18));
        }
        return animatorSet3;
    }

    public final float z(View view, View view2, f fVar) {
        RectF rectF = this.f27690e;
        RectF rectF2 = this.f27691f;
        C(view, rectF);
        rectF.offset(this.f27693h, this.f27694i);
        C(view2, rectF2);
        fVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27689d = new Rect();
        this.f27690e = new RectF();
        this.f27691f = new RectF();
        this.f27692g = new int[2];
    }
}
