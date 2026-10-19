package X5;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f7245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f7246i;
    public final ViewOnClickListenerC0832a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0833b f7247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f7248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f7249m;

    /* JADX WARN: Type inference failed for: r0v1, types: [X5.b] */
    public h(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new ViewOnClickListenerC0832a(0, this);
        this.f7247k = new View.OnFocusChangeListener() { // from class: X5.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                h hVar = this.f7236a;
                hVar.t(hVar.u());
            }
        };
        this.f7242e = M5.l.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f7243f = M5.l.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f7244g = M5.l.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, p216r5.a.f46341a);
        this.f7245h = M5.l.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46344d);
    }

    @Override // X5.s
    public final void a() {
        if (this.f7276b.f27627q != null) {
            return;
        }
        t(u());
    }

    @Override // X5.s
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // X5.s
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // X5.s
    public final View.OnFocusChangeListener e() {
        return this.f7247k;
    }

    @Override // X5.s
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // X5.s
    public final View.OnFocusChangeListener g() {
        return this.f7247k;
    }

    @Override // X5.s
    public final void m(EditText editText) {
        this.f7246i = editText;
        this.f7275a.setEndIconVisible(u());
    }

    @Override // X5.s
    public final void p(boolean z10) {
        if (this.f7276b.f27627q == null) {
            return;
        }
        t(z10);
    }

    @Override // X5.s
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f7245h);
        valueAnimatorOfFloat.setDuration(this.f7243f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X5.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h hVar = this.f7239b;
                hVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = hVar.f7278d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7244g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f7242e;
        valueAnimatorOfFloat2.setDuration(i10);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X5.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h hVar = this.f7237b;
                hVar.getClass();
                hVar.f7278d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7248l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f7248l.addListener(new f(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X5.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h hVar = this.f7237b;
                hVar.getClass();
                hVar.f7278d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f7249m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new g(this));
    }

    @Override // X5.s
    public final void s() {
        EditText editText = this.f7246i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: X5.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7238b.t(true);
                }
            });
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f7276b.d() == z10;
        if (z10 && !this.f7248l.isRunning()) {
            this.f7249m.cancel();
            this.f7248l.start();
            if (z11) {
                this.f7248l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f7248l.cancel();
        this.f7249m.start();
        if (z11) {
            this.f7249m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f7246i;
        return editText != null && (editText.hasFocus() || this.f7278d.hasFocus()) && this.f7246i.getText().length() > 0;
    }
}
