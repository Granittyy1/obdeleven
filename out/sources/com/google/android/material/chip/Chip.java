package com.google.android.material.chip;

import A8.p;
import B0.s;
import K5.o;
import K5.t;
import P5.c;
import P5.d;
import S5.i;
import S5.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p216r5.g;
import p307z0.e;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.a.InterfaceC0269a, m, Checkable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Rect f26924x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f26925y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f26926z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.material.chip.a f26927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InsetDrawable f26928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RippleDrawable f26929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f26930i;
    public CompoundButton.OnCheckedChangeListener j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f26938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f26939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f26940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f26941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f26942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f26943w;

    public class b extends L0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // L0.a
        public final void c(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.f26924x;
            Chip chip = Chip.this;
            if (chip.d()) {
                com.google.android.material.chip.a aVar = chip.f26927f;
                if (aVar != null && aVar.f26972M) {
                    z10 = true;
                }
                if (!z10 || chip.f26930i == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // L0.a
        public final void f(int i10, s sVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = sVar.f1411a;
            if (i10 != 1) {
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(Chip.f26924x);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfo.setContentDescription(chip.getContext().getString(com.voltasit.obdeleven.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            sVar.b(s.a.f1416g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.voltasit.obdeleven.R.attr.chipStyle);
        this.f26941u = new Rect();
        this.f26942v = new RectF();
        this.f26943w = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        int[] iArr = p204q5.a.f46113f;
        TypedArray typedArrayD = o.d(aVar.v0, attributeSet, iArr, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.f26991V0 = typedArrayD.hasValue(37);
        Context context3 = aVar.v0;
        ColorStateList colorStateListA = c.a(context3, typedArrayD, 24);
        if (aVar.f27005z != colorStateListA) {
            aVar.f27005z = colorStateListA;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListA2 = c.a(context3, typedArrayD, 11);
        if (aVar.f26948A != colorStateListA2) {
            aVar.f26948A = colorStateListA2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (aVar.f26950B != dimension) {
            aVar.f26950B = dimension;
            aVar.invalidateSelf();
            aVar.v();
        }
        if (typedArrayD.hasValue(12)) {
            aVar.B(typedArrayD.getDimension(12, 0.0f));
        }
        aVar.G(c.a(context3, typedArrayD, 22));
        aVar.H(typedArrayD.getDimension(23, 0.0f));
        aVar.Q(c.a(context3, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(aVar.f26960G, text);
        K5.m mVar = aVar.f26951B0;
        if (!zEquals) {
            aVar.f26960G = text;
            mVar.f4352e = true;
            aVar.invalidateSelf();
            aVar.v();
        }
        d dVar = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new d(context3, resourceId);
        dVar.f4941k = typedArrayD.getDimension(1, dVar.f4941k);
        mVar.b(dVar, context3);
        int i10 = typedArrayD.getInt(3, 0);
        if (i10 == 1) {
            aVar.f26985S0 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            aVar.f26985S0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            aVar.f26985S0 = TextUtils.TruncateAt.END;
        }
        aVar.F(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.F(typedArrayD.getBoolean(15, false));
        }
        aVar.C(c.c(context3, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            aVar.E(c.a(context3, typedArrayD, 17));
        }
        aVar.D(typedArrayD.getDimension(16, -1.0f));
        aVar.N(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.N(typedArrayD.getBoolean(26, false));
        }
        aVar.I(c.c(context3, typedArrayD, 25));
        aVar.M(c.a(context3, typedArrayD, 30));
        aVar.K(typedArrayD.getDimension(28, 0.0f));
        aVar.x(typedArrayD.getBoolean(6, false));
        aVar.A(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.A(typedArrayD.getBoolean(8, false));
        }
        aVar.y(c.c(context3, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            aVar.z(c.a(context3, typedArrayD, 9));
        }
        aVar.f26992W = g.a(context3, typedArrayD, 39);
        aVar.f26993X = g.a(context3, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (aVar.f26994Y != dimension2) {
            aVar.f26994Y = dimension2;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.P(typedArrayD.getDimension(35, 0.0f));
        aVar.O(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (aVar.f26997q0 != dimension3) {
            aVar.f26997q0 = dimension3;
            aVar.invalidateSelf();
            aVar.v();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (aVar.f26998r0 != dimension4) {
            aVar.f26998r0 = dimension4;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.L(typedArrayD.getDimension(29, 0.0f));
        aVar.J(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (aVar.f27001u0 != dimension5) {
            aVar.f27001u0 = dimension5;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.f26989U0 = typedArrayD.getDimensionPixelSize(4, BrazeLogger.SUPPRESS);
        typedArrayD.recycle();
        o.a(context2, attributeSet, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action);
        this.f26935o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f26937q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(t.a(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.j(O.d.i(this));
        o.a(context2, attributeSet, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f26939s = new b(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new B5.b(this));
        }
        setChecked(this.f26931k);
        setText(aVar.f26960G);
        setEllipsize(aVar.f26985S0);
        i();
        if (!this.f26927f.f26987T0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f26935o) {
            setMinHeight(this.f26937q);
        }
        this.f26936p = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: B5.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f1588b.j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f26942v;
        rectF.setEmpty();
        if (d() && this.f26930i != null) {
            com.google.android.material.chip.a aVar = this.f26927f;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f10 = aVar.f27001u0 + aVar.f27000t0 + aVar.f26980Q + aVar.f26999s0 + aVar.f26998r0;
                if (t0.a.b.a(aVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f26941u;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26951B0.f4354g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f26933m != z10) {
            this.f26933m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f26932l != z10) {
            this.f26932l = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0269a
    public final void a() {
        c(this.f26937q);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i10) {
        this.f26937q = i10;
        if (!this.f26935o) {
            InsetDrawable insetDrawable = this.f26928g;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f26928g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f26927f.f26950B));
        int iMax2 = Math.max(0, i10 - this.f26927f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f26928g;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f26928g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f26928g != null) {
            Rect rect = new Rect();
            this.f26928g.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f26928g = new InsetDrawable((Drawable) this.f26927f, i11, i12, i11, i12);
        g();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            Object objB = aVar.f26974N;
            if (objB == null) {
                objB = null;
            } else if (objB instanceof p234t0.b) {
                objB = ((p234t0.b) objB).b();
            }
            if (objB != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        if (!this.f26940t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        b bVar = this.f26939s;
        AccessibilityManager accessibilityManager = bVar.f4390e;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = Chip.this;
                int i11 = (chip.d() && chip.getCloseIconTouchBounds().contains(x10, y10)) ? 1 : 0;
                int i12 = bVar.j;
                if (i12 != i11) {
                    bVar.j = i11;
                    bVar.h(i11, 128);
                    bVar.h(i12, 256);
                }
                if (i11 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i10 = bVar.j) != Integer.MIN_VALUE) {
                if (i10 == Integer.MIN_VALUE) {
                    return true;
                }
                bVar.j = Integer.MIN_VALUE;
                bVar.h(i10, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f26940t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f26939s;
        bVar.getClass();
        boolean zD = false;
        int i11 = 0;
        zD = false;
        zD = false;
        zD = false;
        zD = false;
        zD = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i12 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i12 = 33;
                                } else if (keyCode == 21) {
                                    i12 = 17;
                                } else if (keyCode != 22) {
                                    i12 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i11 < repeatCount && bVar.d(i12, null)) {
                                    i11++;
                                    z10 = true;
                                }
                                zD = z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i10 = bVar.f4394i;
                                if (i10 != Integer.MIN_VALUE) {
                                    chip = Chip.this;
                                    if (i10 == 0) {
                                        chip.performClick();
                                    } else if (i10 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f26930i;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f26940t) {
                                            chip.f26939s.h(1, 1);
                                        }
                                    }
                                }
                                zD = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i10 = bVar.f4394i;
                    if (i10 != Integer.MIN_VALUE) {
                        chip = Chip.this;
                        if (i10 == 0) {
                            chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f26930i;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f26940t) {
                                chip.f26939s.h(1, 1);
                            }
                        }
                    }
                    zD = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zD = bVar.d(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zD = bVar.d(1, null);
            }
        }
        if (!zD || bVar.f4394i == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        int i11;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f26927f;
        boolean zW = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.f26974N)) {
            com.google.android.material.chip.a aVar2 = this.f26927f;
            ?? IsEnabled = isEnabled();
            if (this.f26934n) {
                i10 = IsEnabled;
                i10 = IsEnabled + 1;
            }
            i10 = IsEnabled;
            int i12 = i10;
            if (this.f26933m) {
                i12 = i10 + 1;
            }
            int i13 = i12;
            if (this.f26932l) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.f26934n) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f26933m) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f26932l) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            if (!Arrays.equals(aVar2.f26979P0, iArr)) {
                aVar2.f26979P0 = iArr;
                if (aVar2.T()) {
                    zW = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f26927f;
        return aVar != null && aVar.f26984S;
    }

    public final void f() {
        com.google.android.material.chip.a aVar;
        if (!d() || (aVar = this.f26927f) == null || !aVar.f26972M || this.f26930i == null) {
            O.n(this, null);
            this.f26940t = false;
        } else {
            O.n(this, this.f26939s);
            this.f26940t = true;
        }
    }

    public final void g() {
        this.f26929h = new RippleDrawable(Q5.a.b(this.f26927f.f26958F), getBackgroundDrawable(), null);
        this.f26927f.getClass();
        RippleDrawable rippleDrawable = this.f26929h;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f26938r)) {
            return this.f26938r;
        }
        if (!e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof B5.c)) {
            return "android.widget.Button";
        }
        ((B5.c) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f26928g;
        return insetDrawable == null ? this.f26927f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26988U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26990V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26948A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f26927f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f27001u0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object objB;
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || (objB = aVar.f26964I) == null) {
            return null;
        }
        if (objB instanceof p234t0.b) {
            objB = ((p234t0.b) objB).b();
        }
        return objB;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26968K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26966J;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26950B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26994Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26954D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26956E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getCloseIcon() {
        Object objB;
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || (objB = aVar.f26974N) == null) {
            return null;
        }
        if (objB instanceof p234t0.b) {
            objB = ((p234t0.b) objB).b();
        }
        return objB;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26982R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f27000t0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26980Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26999s0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26978P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26985S0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f26940t) {
            b bVar = this.f26939s;
            if (bVar.f4394i == 1 || bVar.f4393h == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26993X;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26996p0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26995Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26958F;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f26927f.f5566b.f5589a;
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26992W;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26998r0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            return aVar.f26997q0;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f26927f) == null) {
            return;
        }
        int iR = (int) (aVar.r() + aVar.f27001u0 + aVar.f26998r0);
        com.google.android.material.chip.a aVar2 = this.f26927f;
        int iQ = (int) (aVar2.q() + aVar2.f26994Y + aVar2.f26997q0);
        if (this.f26928g != null) {
            Rect rect = new Rect();
            this.f26928g.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setPaddingRelative(iQ, paddingTop, iR, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f26943w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.F(this, this.f26927f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26925y);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26926z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f26940t) {
            b bVar = this.f26939s;
            int i11 = bVar.f4394i;
            if (i11 != Integer.MIN_VALUE) {
                bVar.a(i11);
            }
            if (z10) {
                bVar.d(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof B5.c) {
            B5.c cVar = (B5.c) getParent();
            if (cVar.f4287d) {
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= cVar.getChildCount()) {
                        i12 = -1;
                        break;
                    }
                    View childAt = cVar.getChildAt(i11);
                    if ((childAt instanceof Chip) && cVar.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
                i10 = i12;
            } else {
                i10 = -1;
            }
            Object tag = getTag(com.voltasit.obdeleven.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(s.f.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i10, 1, false, isChecked()).f1433a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f26936p != i10) {
            this.f26936p = i10;
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f26932l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f26932l) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f26930i;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f26940t) {
                        this.f26939s.h(1, 1);
                    }
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f26938r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26929h) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26929h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.x(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.x(aVar.v0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null) {
            this.f26931k = z10;
        } else if (aVar.f26984S) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.y(v.e(aVar.v0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.z(p186p0.a.b(aVar.v0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.A(aVar.v0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26948A == colorStateList) {
            return;
        }
        aVar.f26948A = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListB;
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26948A == (colorStateListB = p186p0.a.b(aVar.v0, i10))) {
            return;
        }
        aVar.f26948A = colorStateListB;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.B(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.B(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f26927f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f26983R0 = new WeakReference<>(null);
            }
            this.f26927f = aVar;
            aVar.f26987T0 = false;
            aVar.f26983R0 = new WeakReference<>(this);
            c(this.f26937q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f27001u0 == f10) {
            return;
        }
        aVar.f27001u0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float dimension = aVar.v0.getResources().getDimension(i10);
            if (aVar.f27001u0 != dimension) {
                aVar.f27001u0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.C(v.e(aVar.v0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.D(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.D(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.E(p186p0.a.b(aVar.v0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.F(aVar.v0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26950B == f10) {
            return;
        }
        aVar.f26950B = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float dimension = aVar.v0.getResources().getDimension(i10);
            if (aVar.f26950B != dimension) {
                aVar.f26950B = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26994Y == f10) {
            return;
        }
        aVar.f26994Y = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float dimension = aVar.v0.getResources().getDimension(i10);
            if (aVar.f26994Y != dimension) {
                aVar.f26994Y = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.G(p186p0.a.b(aVar.v0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.H(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.H(aVar.v0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.I(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26982R == charSequence) {
            return;
        }
        p307z0.a aVarC = p307z0.a.c();
        aVarC.getClass();
        e.c cVar = e.f48695a;
        aVar.f26982R = aVarC.d(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.J(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.I(v.e(aVar.v0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.K(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.L(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.M(p186p0.a.b(aVar.v0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.j(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f26927f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26985S0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f26935o = z10;
        c(this.f26937q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            return;
        }
        super.setGravity(i10);
    }

    public void setHideMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26993X = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26993X = g.b(aVar.v0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.O(aVar.v0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.P(aVar.v0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f26927f == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26989U0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f26930i = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        this.f26927f.getClass();
        g();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.Q(p186p0.a.b(aVar.v0, i10));
            this.f26927f.getClass();
            g();
        }
    }

    @Override // S5.m
    public void setShapeAppearanceModel(i iVar) {
        this.f26927f.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26992W = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26992W = g.b(aVar.v0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.f26987T0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f26927f;
        if (aVar2 == null || TextUtils.equals(aVar2.f26960G, charSequence)) {
            return;
        }
        aVar2.f26960G = charSequence;
        aVar2.f26951B0.f4352e = true;
        aVar2.invalidateSelf();
        aVar2.v();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.f26951B0.b(dVar, aVar.v0);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26998r0 == f10) {
            return;
        }
        aVar.f26998r0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float dimension = aVar.v0.getResources().getDimension(i10);
            if (aVar.f26998r0 != dimension) {
                aVar.f26998r0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            K5.m mVar = aVar.f26951B0;
            d dVar = mVar.f4354g;
            if (dVar != null) {
                dVar.f4941k = fApplyDimension;
                mVar.f4348a.setTextSize(fApplyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar == null || aVar.f26997q0 == f10) {
            return;
        }
        aVar.f26997q0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            float dimension = aVar.v0.getResources().getDimension(i10);
            if (aVar.f26997q0 != dimension) {
                aVar.f26997q0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.N(z10);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            Context context2 = aVar.v0;
            aVar.f26951B0.b(new d(context2, i10), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f26927f;
        if (aVar != null) {
            Context context = aVar.v0;
            aVar.f26951B0.b(new d(context, i10), context);
        }
        i();
    }

    public class a extends C.g {
        public a() {
        }

        @Override // C.g
        public final void a0(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f26927f;
            chip.setText(aVar.f26987T0 ? aVar.f26960G : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // C.g
        public final void Z(int i10) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setInternalOnCheckedChangeListener(K5.e<Chip> eVar) {
    }
}
