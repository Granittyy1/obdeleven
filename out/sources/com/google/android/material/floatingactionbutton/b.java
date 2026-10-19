package com.google.android.material.floatingactionbutton;

import K5.l;
import S5.i;
import S5.m;
import Z3.n;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final X0.a f27162C = p216r5.a.f46343c;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f27163D = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f27164E = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f27165F = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f27166G = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f27167H = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f27168I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f27169J = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int[] f27170K = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int[] f27171L = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int[] f27172M = new int[0];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public J5.e f27174B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f27175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5.f f27176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f27177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J5.a f27178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayerDrawable f27179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27180f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27183i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f27185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p216r5.g f27186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p216r5.g f27187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27188o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27190q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f27192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f27193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<f> f27194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f27195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FloatingActionButton.b f27196w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27181g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27189p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27191r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f27197x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f27198y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f27199z = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Matrix f27173A = new Matrix();

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class a extends p216r5.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            b.this.f27189p = f10;
            float[] fArr = this.f46350a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f46351b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr2[i10];
                float f12 = fArr[i10];
                fArr2[i10] = n.b(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.f46352c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class C0271b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f27201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f27202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f27203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f27204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f27205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f27206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f27207h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Matrix f27208i;

        public C0271b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f27201b = f10;
            this.f27202c = f11;
            this.f27203d = f12;
            this.f27204e = f13;
            this.f27205f = f14;
            this.f27206g = f15;
            this.f27207h = f16;
            this.f27208i = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b bVar = b.this;
            bVar.f27195v.setAlpha(p216r5.a.b(this.f27201b, this.f27202c, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = bVar.f27195v;
            float f10 = this.f27203d;
            float f11 = this.f27204e;
            floatingActionButton.setScaleX(p216r5.a.a(f10, f11, fFloatValue));
            bVar.f27195v.setScaleY(p216r5.a.a(this.f27205f, f11, fFloatValue));
            float f12 = this.f27206g;
            float f13 = this.f27207h;
            bVar.f27189p = p216r5.a.a(f12, f13, fFloatValue);
            float fA = p216r5.a.a(f12, f13, fFloatValue);
            Matrix matrix = this.f27208i;
            bVar.a(fA, matrix);
            bVar.f27195v.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class c extends h {
        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class d extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J5.f f27209f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J5.f fVar) {
            super(fVar);
            this.f27209f = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            J5.f fVar = this.f27209f;
            return fVar.f27182h + fVar.f27183i;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class e extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J5.f f27210f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(J5.f fVar) {
            super(fVar);
            this.f27210f = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            J5.f fVar = this.f27210f;
            return fVar.f27182h + fVar.j;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface f {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class g extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J5.f f27211f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(J5.f fVar) {
            super(fVar);
            this.f27211f = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return this.f27211f.f27182h;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f27213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f27214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J5.f f27215e;

        public h(J5.f fVar) {
            this.f27215e = fVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f10 = (int) this.f27214d;
            S5.f fVar = this.f27215e.f27176b;
            if (fVar != null) {
                fVar.j(f10);
            }
            this.f27212b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f27212b;
            J5.f fVar = this.f27215e;
            if (!z10) {
                S5.f fVar2 = fVar.f27176b;
                this.f27213c = fVar2 == null ? 0.0f : fVar2.f5566b.f5600m;
                this.f27214d = a();
                this.f27212b = true;
            }
            float f10 = this.f27213c;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f27214d - f10)) + f10);
            S5.f fVar3 = fVar.f27176b;
            if (fVar3 != null) {
                fVar3.j(animatedFraction);
            }
        }
    }

    public b(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f27195v = floatingActionButton;
        this.f27196w = bVar;
        l lVar = new l();
        J5.f fVar = (J5.f) this;
        lVar.a(f27167H, d(new e(fVar)));
        lVar.a(f27168I, d(new d(fVar)));
        lVar.a(f27169J, d(new d(fVar)));
        lVar.a(f27170K, d(new d(fVar)));
        lVar.a(f27171L, d(new g(fVar)));
        lVar.a(f27172M, d(new c(fVar)));
        this.f27188o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f27162C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f27195v.getDrawable();
        if (drawable == null || this.f27190q == 0) {
            return;
        }
        RectF rectF = this.f27198y;
        RectF rectF2 = this.f27199z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f11 = this.f27190q;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f27190q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(p216r5.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f27195v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        gVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        gVar.d("scale").a(objectAnimatorOfFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            J5.d dVar = new J5.d();
            dVar.f4037a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(dVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        gVar.d("scale").a(objectAnimatorOfFloat3);
        if (i10 == 26) {
            J5.d dVar2 = new J5.d();
            dVar2.f4037a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(dVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f27173A;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new p216r5.e(), new a(), new Matrix(matrix));
        gVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        Q3.d.F(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f27195v;
        valueAnimatorOfFloat.addUpdateListener(new C0271b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f27189p, f12, new Matrix(this.f27173A)));
        arrayList.add(valueAnimatorOfFloat);
        Q3.d.F(animatorSet, arrayList);
        animatorSet.setDuration(M5.l.c(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(M5.l.d(floatingActionButton.getContext(), i11, p216r5.a.f46342b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int iMax = this.f27180f ? Math.max((this.f27184k - this.f27195v.getSizeDimension()) / 2, 0) : 0;
        float fE = this.f27181g ? e() + this.j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fE));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f27194u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f27177c;
        if (drawable != null) {
            p234t0.a.C0532a.h(drawable, Q5.a.b(colorStateList));
        }
    }

    public final void n(i iVar) {
        this.f27175a = iVar;
        S5.f fVar = this.f27176b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        Object obj = this.f27177c;
        if (obj instanceof m) {
            ((m) obj).setShapeAppearanceModel(iVar);
        }
        J5.a aVar = this.f27178d;
        if (aVar != null) {
            aVar.f4027o = iVar;
            aVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f27197x;
        f(rect);
        A0.f.f(this.f27179e, "Didn't initialize content background");
        boolean zO = o();
        FloatingActionButton.b bVar = this.f27196w;
        if (zO) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27179e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f27179e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f27152m.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.j;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
