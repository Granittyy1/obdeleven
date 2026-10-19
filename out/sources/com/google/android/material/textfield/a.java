package com.google.android.material.textfield;

import K5.n;
import K5.t;
import X5.A;
import X5.h;
import X5.i;
import X5.p;
import X5.r;
import X5.s;
import X5.y;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0871y;
import androidx.appcompat.widget.c0;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.internal.CheckableImageButton;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: EndCompoundLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f27613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f27614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f27615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f27616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f27617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f27618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f27619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f27620i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f27621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f27622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f27623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f27625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f27626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f27627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0871y f27628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f27630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f27631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f27632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0275a f27633w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class C0275a extends n {
        public C0275a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // K5.n, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.b().b();
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.f27630t == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.f27630t;
            C0275a c0275a = aVar.f27633w;
            if (editText != null) {
                editText.removeTextChangedListener(c0275a);
                if (aVar.f27630t.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.f27630t.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.f27630t = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0275a);
            }
            aVar.b().m(aVar.f27630t);
            aVar.j(aVar.b());
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.f27632v == null || (accessibilityManager = aVar.f27631u) == null) {
                return;
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (aVar.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new B0.b(aVar.f27632v));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            p pVar = aVar.f27632v;
            if (pVar == null || (accessibilityManager = aVar.f27631u) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new B0.b(pVar));
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<s> f27637a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f27638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27640d;

        public d(a aVar, c0 c0Var) {
            this.f27638b = aVar;
            TypedArray typedArray = c0Var.f8929b;
            this.f27639c = typedArray.getResourceId(28, 0);
            this.f27640d = typedArray.getResourceId(52, 0);
        }
    }

    public a(TextInputLayout textInputLayout, c0 c0Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.j = 0;
        this.f27621k = new LinkedHashSet<>();
        this.f27633w = new C0275a();
        b bVar = new b();
        this.f27631u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f27613b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f27614c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f27615d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f27619h = checkableImageButtonA2;
        this.f27620i = new d(this, c0Var);
        C0871y c0871y = new C0871y(getContext());
        this.f27628r = c0871y;
        TypedArray typedArray = c0Var.f8929b;
        if (typedArray.hasValue(38)) {
            this.f27616e = P5.c.b(getContext(), c0Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f27617f = t.c(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0Var.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f27622l = P5.c.b(getContext(), c0Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f27623m = t.c(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f27622l = P5.c.b(getContext(), c0Var, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f27623m = t.c(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f27624n) {
            this.f27624n = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = X5.t.b(typedArray.getInt(31, -1));
            this.f27625o = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        c0871y.setVisibility(8);
        c0871y.setId(R.id.textinput_suffix_text);
        c0871y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0871y.setAccessibilityLiveRegion(1);
        c0871y.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0871y.setTextColor(c0Var.a(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f27627q = TextUtils.isEmpty(text3) ? null : text3;
        c0871y.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c0871y);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f27597u0.add(bVar);
        if (textInputLayout.f27576e != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (P5.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final s b() {
        s iVar;
        int i10 = this.j;
        d dVar = this.f27620i;
        SparseArray<s> sparseArray = dVar.f27637a;
        s a10 = sparseArray.get(i10);
        if (a10 == null) {
            a aVar = dVar.f27638b;
            if (i10 == -1) {
                iVar = new i(aVar);
            } else if (i10 != 0) {
                if (i10 == 1) {
                    a10 = new A(aVar, dVar.f27640d);
                } else if (i10 == 2) {
                    iVar = new h(aVar);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(J4.i.b(i10, "Invalid end icon mode: "));
                    }
                    iVar = new r(aVar);
                }
                sparseArray.append(i10, a10);
            } else {
                iVar = new y(aVar);
            }
            a10 = iVar;
            sparseArray.append(i10, a10);
        }
        return a10;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f27619h;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return this.f27628r.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f27614c.getVisibility() == 0 && this.f27619h.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f27615d.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean z12;
        s sVarB = b();
        boolean zK = sVarB.k();
        CheckableImageButton checkableImageButton = this.f27619h;
        boolean z13 = true;
        if (!zK || (z12 = checkableImageButton.f27237e) == sVarB.l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(sVarB instanceof r) || (zIsActivated = checkableImageButton.isActivated()) == sVarB.j()) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z13) {
            X5.t.c(this.f27613b, checkableImageButton, this.f27622l);
        }
    }

    public final void g(int i10) {
        if (this.j == i10) {
            return;
        }
        s sVarB = b();
        p pVar = this.f27632v;
        AccessibilityManager accessibilityManager = this.f27631u;
        if (pVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new B0.b(pVar));
        }
        this.f27632v = null;
        sVarB.s();
        this.j = i10;
        Iterator<TextInputLayout.g> it = this.f27621k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i10 != 0);
        s sVarB2 = b();
        int iD = this.f27620i.f27639c;
        if (iD == 0) {
            iD = sVarB2.d();
        }
        Drawable drawableE = iD != 0 ? v.e(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f27619h;
        checkableImageButton.setImageDrawable(drawableE);
        TextInputLayout textInputLayout = this.f27613b;
        if (drawableE != null) {
            X5.t.a(textInputLayout, checkableImageButton, this.f27622l, this.f27623m);
            X5.t.c(textInputLayout, checkableImageButton, this.f27622l);
        }
        int iC = sVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(sVarB2.k());
        if (!sVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        sVarB2.r();
        p pVarH = sVarB2.h();
        this.f27632v = pVarH;
        if (pVarH != null && accessibilityManager != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new B0.b(this.f27632v));
            }
        }
        View.OnClickListener onClickListenerF = sVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f27626p;
        checkableImageButton.setOnClickListener(onClickListenerF);
        X5.t.d(checkableImageButton, onLongClickListener);
        EditText editText = this.f27630t;
        if (editText != null) {
            sVarB2.m(editText);
            j(sVarB2);
        }
        X5.t.a(textInputLayout, checkableImageButton, this.f27622l, this.f27623m);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.f27619h.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f27613b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f27615d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        X5.t.a(this.f27613b, checkableImageButton, this.f27616e, this.f27617f);
    }

    public final void j(s sVar) {
        if (this.f27630t == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f27630t.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f27619h.setOnFocusChangeListener(sVar.g());
        }
    }

    public final void k() {
        this.f27614c.setVisibility((this.f27619h.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f27627q == null || this.f27629s) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f27615d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f27613b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f27581k.f7296q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.j != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f27613b;
        if (textInputLayout.f27576e == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f27576e;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f27576e.getPaddingTop();
        int paddingBottom = textInputLayout.f27576e.getPaddingBottom();
        WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
        this.f27628r.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        C0871y c0871y = this.f27628r;
        int visibility = c0871y.getVisibility();
        int i10 = (this.f27627q == null || this.f27629s) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        k();
        c0871y.setVisibility(i10);
        this.f27613b.q();
    }
}
