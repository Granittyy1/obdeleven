package X5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f7265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f7266i;
    public final o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f7267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f7272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f7273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f7274r;

    /* JADX WARN: Type inference failed for: r0v1, types: [X5.o] */
    public r(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f7266i = new n(0, this);
        this.j = new View.OnFocusChangeListener() { // from class: X5.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                r rVar = this.f7259a;
                rVar.f7268l = z10;
                rVar.q();
                if (z10) {
                    return;
                }
                rVar.t(false);
                rVar.f7269m = false;
            }
        };
        this.f7267k = new p(this);
        this.f7271o = Long.MAX_VALUE;
        this.f7263f = M5.l.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f7262e = M5.l.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f7264g = M5.l.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, p216r5.a.f46341a);
    }

    @Override // X5.s
    public final void a() {
        if (this.f7272p.isTouchExplorationEnabled() && G0.a.h(this.f7265h) && !this.f7278d.hasFocus()) {
            this.f7265h.dismissDropDown();
        }
        this.f7265h.post(new N5.d(1, this));
    }

    @Override // X5.s
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // X5.s
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // X5.s
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // X5.s
    public final View.OnClickListener f() {
        return this.f7266i;
    }

    @Override // X5.s
    public final p h() {
        return this.f7267k;
    }

    @Override // X5.s
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // X5.s
    public final boolean j() {
        return this.f7268l;
    }

    @Override // X5.s
    public final boolean l() {
        return this.f7270n;
    }

    @Override // X5.s
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f7265h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X5.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                r rVar = this.f7255b;
                rVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - rVar.f7271o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        rVar.f7269m = false;
                    }
                    rVar.u();
                    rVar.f7269m = true;
                    rVar.f7271o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f7265h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: X5.m
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                r rVar = this.f7256a;
                rVar.f7269m = true;
                rVar.f7271o = System.currentTimeMillis();
                rVar.t(false);
            }
        });
        this.f7265h.setThreshold(0);
        TextInputLayout textInputLayout = this.f7275a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!G0.a.h(editText) && this.f7272p.isTouchExplorationEnabled()) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            this.f7278d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // X5.s
    public final void n(B0.s sVar) {
        if (!G0.a.h(this.f7265h)) {
            sVar.i(Spinner.class.getName());
        }
        if (sVar.f1411a.isShowingHintText()) {
            sVar.f1411a.setHintText(null);
        }
    }

    @Override // X5.s
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f7272p.isEnabled() || G0.a.h(this.f7265h)) {
            return;
        }
        boolean z10 = accessibilityEvent.getEventType() == 32768 && this.f7270n && !this.f7265h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            u();
            this.f7269m = true;
            this.f7271o = System.currentTimeMillis();
        }
    }

    @Override // X5.s
    public final void r() {
        int i10 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7264g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f7263f);
        valueAnimatorOfFloat.addUpdateListener(new k(i10, this));
        this.f7274r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f7262e);
        valueAnimatorOfFloat2.addUpdateListener(new k(i10, this));
        this.f7273q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new q(this));
        this.f7272p = (AccessibilityManager) this.f7277c.getSystemService("accessibility");
    }

    @Override // X5.s
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f7265h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f7265h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f7270n != z10) {
            this.f7270n = z10;
            this.f7274r.cancel();
            this.f7273q.start();
        }
    }

    public final void u() {
        if (this.f7265h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f7271o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f7269m = false;
        }
        if (this.f7269m) {
            this.f7269m = false;
            return;
        }
        t(!this.f7270n);
        if (!this.f7270n) {
            this.f7265h.dismissDropDown();
        } else {
            this.f7265h.requestFocus();
            this.f7265h.showDropDown();
        }
    }
}
