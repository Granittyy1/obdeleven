package X5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0871y;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f7279A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f7280B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f7284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f7285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f7286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f7287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f7288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f7289i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f7290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f7291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f7292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f7295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0871y f7297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f7298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7300u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f7301v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f7302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0871y f7304y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7305z;

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f7307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f7308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TextView f7309e;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f7306b = i10;
            this.f7307c = textView;
            this.f7308d = i11;
            this.f7309e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C0871y c0871y;
            int i10 = this.f7306b;
            u uVar = u.this;
            uVar.f7293n = i10;
            uVar.f7291l = null;
            TextView textView = this.f7307c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7308d == 1 && (c0871y = uVar.f7297r) != null) {
                    c0871y.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f7309e;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f7309e;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7287g = context;
        this.f7288h = textInputLayout;
        this.f7292m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f7281a = M5.l.c(context, R.attr.motionDurationShort4, 217);
        this.f7282b = M5.l.c(context, R.attr.motionDurationMedium4, 167);
        this.f7283c = M5.l.c(context, R.attr.motionDurationShort4, 167);
        this.f7284d = M5.l.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, p216r5.a.f46344d);
        LinearInterpolator linearInterpolator = p216r5.a.f46341a;
        this.f7285e = M5.l.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f7286f = M5.l.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0871y c0871y, int i10) {
        if (this.f7289i == null && this.f7290k == null) {
            Context context = this.f7287g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f7289i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f7289i;
            TextInputLayout textInputLayout = this.f7288h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7290k = new FrameLayout(context);
            this.f7289i.addView(this.f7290k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f7290k.setVisibility(0);
            this.f7290k.addView(c0871y);
        } else {
            this.f7289i.addView(c0871y, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7289i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f7289i != null) {
            TextInputLayout textInputLayout = this.f7288h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f7287g;
                boolean zD = P5.c.d(context);
                LinearLayout linearLayout = this.f7289i;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f7291l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, C0871y c0871y, int i10, int i11, int i12) {
        if (c0871y == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0871y, (Property<C0871y, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f7283c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f7282b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f7285e : this.f7286f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0871y, (Property<C0871y, Float>) View.TRANSLATION_Y, -this.f7292m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f7281a);
            objectAnimatorOfFloat2.setInterpolator(this.f7284d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f7297r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f7304y;
    }

    public final void f() {
        this.f7295p = null;
        c();
        if (this.f7293n == 1) {
            if (!this.f7303x || TextUtils.isEmpty(this.f7302w)) {
                this.f7294o = 0;
            } else {
                this.f7294o = 2;
            }
        }
        i(this.f7293n, this.f7294o, h(this.f7297r, ""));
    }

    public final void g(C0871y c0871y, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f7289i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f7290k) != null) {
            frameLayout.removeView(c0871y);
        } else {
            linearLayout.removeView(c0871y);
        }
        int i11 = this.j - 1;
        this.j = i11;
        LinearLayout linearLayout2 = this.f7289i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0871y c0871y, CharSequence charSequence) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        TextInputLayout textInputLayout = this.f7288h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f7294o == this.f7293n && c0871y != null && TextUtils.equals(c0871y.getText(), charSequence));
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7291l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f7303x, this.f7304y, 2, i10, i11);
            d(arrayList, this.f7296q, this.f7297r, 1, i10, i11);
            Q3.d.F(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f7293n = i11;
        }
        TextInputLayout textInputLayout = this.f7288h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}
