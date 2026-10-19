package com.google.android.material.tabs;

import A8.p;
import B0.s;
import K5.o;
import K5.t;
import M5.l;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.core.view.C;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.viewpager.widget.ViewPager;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.domain.usecases.device.v;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.d
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final A0.e f27450W = new A0.e(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f27451A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f27452B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f27453C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27454D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f27455E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f27456F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f27457G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f27458H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public com.google.android.material.tabs.a f27459I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final TimeInterpolator f27460J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public c f27461K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList<c> f27462L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public j f27463M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ValueAnimator f27464N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ViewPager f27465O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public H2.a f27466P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public e f27467Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public h f27468R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public b f27469S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f27470T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f27471U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final A0.d f27472V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f27474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f27475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f27476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27480i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f27483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f27484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f27485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f27486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f27488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f27489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f27490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f27491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f27492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f27493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f27494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f27495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f27496z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27498a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, H2.a aVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27465O == viewPager) {
                tabLayout.j(aVar, this.f27498a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t8);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.h();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.h();
        }
    }

    public class f extends LinearLayout {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f27501d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ValueAnimator f27502b;

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27471U == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.a aVar = tabLayout.f27459I;
                Drawable drawable = tabLayout.f27486p;
                aVar.getClass();
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.f27473b = i10;
            }
        }

        public final void b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f27486p.getBounds();
            tabLayout.f27486p.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.f27486p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f27486p.getBounds().bottom);
            } else {
                tabLayout.f27459I.b(tabLayout, view, view2, f10, tabLayout.f27486p);
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            postInvalidateOnAnimation();
        }

        public final void d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27473b == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f27473b = i10;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (!z10) {
                this.f27502b.removeAllUpdateListeners();
                this.f27502b.addUpdateListener(bVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27502b = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f27460J);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(bVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.f27486p.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.f27486p.getIntrinsicHeight();
            }
            int i10 = tabLayout.f27452B;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.f27486p.getBounds().width() > 0) {
                Rect bounds = tabLayout.f27486p.getBounds();
                tabLayout.f27486p.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.f27486p.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f27502b;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f27473b == -1) {
                tabLayout.f27473b = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f27473b);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f27496z == 1 || tabLayout.f27453C == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) t.a(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    tabLayout.f27496z = 0;
                    tabLayout.m(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f27504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f27505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27506c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f27507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TabLayout f27508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i f27509f;
    }

    public static class h implements ViewPager.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<TabLayout> f27510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27512d;

        public h(TabLayout tabLayout) {
            this.f27510b = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void onPageScrollStateChanged(int i10) {
            this.f27511c = this.f27512d;
            this.f27512d = i10;
            TabLayout tabLayout = this.f27510b.get();
            if (tabLayout != null) {
                tabLayout.f27471U = this.f27512d;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f27510b.get();
            if (tabLayout != null) {
                int i12 = this.f27512d;
                tabLayout.k(i10, f10, i12 != 2 || this.f27511c == 1, (i12 == 2 && this.f27511c == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void onPageSelected(int i10) {
            TabLayout tabLayout = this.f27510b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f27512d;
            tabLayout.i((i10 < 0 || i10 >= tabLayout.getTabCount()) ? null : tabLayout.f27474c.get(i10), i11 == 0 || (i11 == 2 && this.f27511c == 0));
        }
    }

    public final class i extends LinearLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int f27513m = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f27514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f27515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f27516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f27517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p239t5.a f27518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f27519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f27520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImageView f27521i;
        public Drawable j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f27522k;

        public i(Context context) {
            super(context);
            this.f27522k = 2;
            e(context);
            int i10 = TabLayout.this.f27477f;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            setPaddingRelative(i10, TabLayout.this.f27478g, TabLayout.this.f27479h, TabLayout.this.f27480i);
            setGravity(17);
            setOrientation(!TabLayout.this.f27454D ? 1 : 0);
            setClickable(true);
            O.f.d(this, C.b(getContext(), 1002));
        }

        private p239t5.a getBadge() {
            return this.f27518f;
        }

        private p239t5.a getOrCreateBadge() {
            if (this.f27518f == null) {
                this.f27518f = new p239t5.a(getContext());
            }
            b();
            p239t5.a aVar = this.f27518f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.f27518f != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f27517e;
                if (view != null) {
                    p239t5.a aVar = this.f27518f;
                    if (aVar != null) {
                        if (aVar.c() != null) {
                            aVar.c().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f27517e = null;
                }
            }
        }

        public final void b() {
            if (this.f27518f != null) {
                if (this.f27519g != null) {
                    a();
                    return;
                }
                TextView textView = this.f27515c;
                if (textView == null || this.f27514b == null) {
                    a();
                    return;
                }
                if (this.f27517e == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f27515c;
                if (this.f27518f == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                p239t5.a aVar = this.f27518f;
                Rect rect = new Rect();
                textView2.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(textView2, null);
                if (aVar.c() != null) {
                    aVar.c().setForeground(aVar);
                } else {
                    textView2.getOverlay().add(aVar);
                }
                this.f27517e = textView2;
            }
        }

        public final void c(View view) {
            p239t5.a aVar = this.f27518f;
            if (aVar == null || view != this.f27517e) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.h(view, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0020  */
        public final void d() {
            boolean z10;
            f();
            g gVar = this.f27514b;
            if (gVar == null) {
                z10 = false;
            } else {
                TabLayout tabLayout = gVar.f27508e;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != gVar.f27506c) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            setSelected(z10);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.f27490t;
            if (i10 != 0) {
                Drawable drawableE = v.e(context, i10);
                this.j = drawableE;
                if (drawableE != null && drawableE.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            } else {
                this.j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.f27485o != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateList = tabLayout.f27485o;
                int[] iArr = Q5.a.f5103d;
                int iA = Q5.a.a(colorStateList, Q5.a.f5102c);
                int[] iArr2 = Q5.a.f5101b;
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, Q5.a.a(colorStateList, iArr2), Q5.a.a(colorStateList, Q5.a.f5100a)});
                boolean z10 = tabLayout.f27458H;
                if (z10) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z10 ? null : gradientDrawable3);
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i10;
            ViewParent parent;
            g gVar = this.f27514b;
            View view = gVar != null ? gVar.f27507d : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f27519g;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f27519g);
                    }
                    addView(view);
                }
                this.f27519g = view;
                TextView textView = this.f27515c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f27516d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f27516d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f27520h = textView2;
                if (textView2 != null) {
                    this.f27522k = textView2.getMaxLines();
                }
                this.f27521i = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f27519g;
                if (view3 != null) {
                    removeView(view3);
                    this.f27519g = null;
                }
                this.f27520h = null;
                this.f27521i = null;
            }
            if (this.f27519g == null) {
                if (this.f27516d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.voltasit.obdeleven.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f27516d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f27515c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.voltasit.obdeleven.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f27515c = textView3;
                    addView(textView3);
                    this.f27522k = this.f27515c.getMaxLines();
                }
                TextView textView4 = this.f27515c;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.j);
                if (!isSelected() || (i10 = tabLayout.f27482l) == -1) {
                    this.f27515c.setTextAppearance(tabLayout.f27481k);
                } else {
                    this.f27515c.setTextAppearance(i10);
                }
                ColorStateList colorStateList = tabLayout.f27483m;
                if (colorStateList != null) {
                    this.f27515c.setTextColor(colorStateList);
                }
                g(this.f27515c, this.f27516d, true);
                b();
                ImageView imageView3 = this.f27516d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView3));
                }
                TextView textView5 = this.f27515c;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView5));
                }
            } else {
                TextView textView6 = this.f27520h;
                if (textView6 != null || this.f27521i != null) {
                    g(textView6, this.f27521i, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f27505b)) {
                return;
            }
            setContentDescription(gVar.f27505b);
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            g gVar = this.f27514b;
            CharSequence charSequence = gVar != null ? gVar.f27504a : null;
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z11 = false;
                } else {
                    this.f27514b.getClass();
                    z11 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iA = (z11 && imageView.getVisibility() == 0) ? (int) t.a(getContext(), 8) : 0;
                if (TabLayout.this.f27454D) {
                    if (iA != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iA);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iA != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iA;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar2 = this.f27514b;
            CharSequence charSequence2 = gVar2 != null ? gVar2.f27505b : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            i0.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f27515c, this.f27516d, this.f27519g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f27515c, this.f27516d, this.f27519g};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f27514b;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0071  */
        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            p239t5.a aVar = this.f27518f;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) contentDescription);
                sb2.append(", ");
                p239t5.a aVar2 = this.f27518f;
                Object quantityString = null;
                if (aVar2.isVisible()) {
                    t5.b.a aVar3 = aVar2.f47270f.f47279b;
                    String str = aVar3.f47301k;
                    if (str != null) {
                        String str2 = aVar3.f47306p;
                        quantityString = str2 != null ? str2 : str;
                    } else if (!aVar2.f()) {
                        quantityString = aVar3.f47307q;
                    } else if (aVar3.f47308r != 0 && (context = aVar2.f47266b.get()) != null) {
                        if (aVar2.f47273i != -2) {
                            int iD = aVar2.d();
                            int i10 = aVar2.f47273i;
                            if (iD <= i10) {
                                quantityString = context.getResources().getQuantityString(aVar3.f47308r, aVar2.d(), Integer.valueOf(aVar2.d()));
                            } else {
                                quantityString = context.getString(aVar3.f47309s, Integer.valueOf(i10));
                            }
                        } else {
                            quantityString = context.getResources().getQuantityString(aVar3.f47308r, aVar2.d(), Integer.valueOf(aVar2.d()));
                        }
                    }
                }
                sb2.append(quantityString);
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            accessibilityNodeInfo.setCollectionItemInfo(s.f.a(0, 1, this.f27514b.f27506c, 1, false, isSelected()).f1433a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) s.a.f1416g.f1428a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.voltasit.obdeleven.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f27491u, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f27515c != null) {
                float f10 = tabLayout.f27488r;
                int i12 = this.f27522k;
                ImageView imageView = this.f27516d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f27515c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = tabLayout.f27489s;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f27515c.getTextSize();
                int lineCount = this.f27515c.getLineCount();
                int maxLines = this.f27515c.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (tabLayout.f27453C == 1 && f10 > textSize && lineCount == 1) {
                        Layout layout = this.f27515c.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f27515c.setTextSize(0, f10);
                    this.f27515c.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f27514b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            g gVar = this.f27514b;
            TabLayout tabLayout = gVar.f27508e;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.i(gVar, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f27515c;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f27516d;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f27519g;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f27514b) {
                this.f27514b = gVar;
                d();
            }
        }
    }

    public static class j implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f27524a;

        public j(ViewPager viewPager) {
            this.f27524a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(g gVar) {
            this.f27524a.setCurrentItem(gVar.f27506c);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.tabStyle, com.voltasit.obdeleven.R.style.Widget_Design_TabLayout), attributeSet, com.voltasit.obdeleven.R.attr.tabStyle);
        this.f27473b = -1;
        this.f27474c = new ArrayList<>();
        this.f27482l = -1;
        this.f27487q = 0;
        this.f27491u = BrazeLogger.SUPPRESS;
        this.f27456F = -1;
        this.f27462L = new ArrayList<>();
        this.f27472V = new A0.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f27476e = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = o.d(context2, attributeSet, p204q5.a.f46103G, com.voltasit.obdeleven.R.attr.tabStyle, com.voltasit.obdeleven.R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListA = G5.c.a(getBackground());
        if (colorStateListA != null) {
            S5.f fVar2 = new S5.f();
            fVar2.k(colorStateListA);
            fVar2.i(context2);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            fVar2.j(O.d.i(this));
            setBackground(fVar2);
        }
        setSelectedTabIndicator(P5.c.c(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        fVar.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.f27480i = dimensionPixelSize;
        this.f27479h = dimensionPixelSize;
        this.f27478g = dimensionPixelSize;
        this.f27477f = dimensionPixelSize;
        this.f27477f = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.f27478g = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.f27479h = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.f27480i = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (P5.b.b(context2, com.voltasit.obdeleven.R.attr.isMaterial3Theme, false)) {
            this.j = com.voltasit.obdeleven.R.attr.textAppearanceTitleSmall;
        } else {
            this.j = com.voltasit.obdeleven.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, com.voltasit.obdeleven.R.style.TextAppearance_Design_Tab);
        this.f27481k = resourceId;
        int[] iArr = p088h.a.f35711x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f27488r = dimensionPixelSize2;
            this.f27483m = P5.c.a(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.f27482l = typedArrayD.getResourceId(22, resourceId);
            }
            int i10 = this.f27482l;
            if (i10 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i10, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA2 = P5.c.a(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListA2 != null) {
                        this.f27483m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{colorStateListA2.getColorForState(new int[]{R.attr.state_selected}, colorStateListA2.getDefaultColor()), this.f27483m.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.f27483m = P5.c.a(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.f27483m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayD.getColor(23, 0), this.f27483m.getDefaultColor()});
            }
            this.f27484n = P5.c.a(context2, typedArrayD, 3);
            t.c(typedArrayD.getInt(4, -1), null);
            this.f27485o = P5.c.a(context2, typedArrayD, 21);
            this.f27451A = typedArrayD.getInt(6, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
            this.f27460J = l.d(context2, com.voltasit.obdeleven.R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46342b);
            this.f27492v = typedArrayD.getDimensionPixelSize(14, -1);
            this.f27493w = typedArrayD.getDimensionPixelSize(13, -1);
            this.f27490t = typedArrayD.getResourceId(0, 0);
            this.f27495y = typedArrayD.getDimensionPixelSize(1, 0);
            this.f27453C = typedArrayD.getInt(15, 1);
            this.f27496z = typedArrayD.getInt(2, 0);
            this.f27454D = typedArrayD.getBoolean(12, false);
            this.f27458H = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.f27489s = resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.design_tab_text_size_2line);
            this.f27494x = resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.f27474c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f27492v;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f27453C;
        if (i11 == 0 || i11 == 2) {
            return this.f27494x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27476e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        f fVar = this.f27476e;
        int childCount = fVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = fVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(g gVar, boolean z10) {
        ArrayList<g> arrayList = this.f27474c;
        int size = arrayList.size();
        if (gVar.f27508e != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        gVar.f27506c = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i10 = -1;
        for (int i11 = size + 1; i11 < size2; i11++) {
            if (arrayList.get(i11).f27506c == this.f27473b) {
                i10 = i11;
            }
            arrayList.get(i11).f27506c = i11;
        }
        this.f27473b = i10;
        i iVar = gVar.f27509f;
        iVar.setSelected(false);
        iVar.setActivated(false);
        int i12 = gVar.f27506c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f27453C == 1 && this.f27496z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f27476e.addView(iVar, i12, layoutParams);
        if (z10) {
            TabLayout tabLayout = gVar.f27508e;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.i(gVar, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof W5.c)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        W5.c cVar = (W5.c) view;
        g gVarG = g();
        cVar.getClass();
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            gVarG.f27505b = cVar.getContentDescription();
            i iVar = gVarG.f27509f;
            if (iVar != null) {
                iVar.d();
            }
        }
        a(gVarG, this.f27474c.isEmpty());
    }

    public final void c(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (isLaidOut()) {
                f fVar = this.f27476e;
                int childCount = fVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (fVar.getChildAt(i11).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(0.0f, i10);
                if (scrollX != iE) {
                    f();
                    this.f27464N.setIntValues(scrollX, iE);
                    this.f27464N.start();
                }
                ValueAnimator valueAnimator = fVar.f27502b;
                if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f27473b != i10) {
                    fVar.f27502b.cancel();
                }
                fVar.d(i10, this.f27451A, true);
                return;
            }
        }
        k(i10, 0.0f, true, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public final void d() {
        int i10 = this.f27453C;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.f27495y - this.f27477f) : 0;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        f fVar = this.f27476e;
        fVar.setPaddingRelative(iMax, 0, 0, 0);
        int i11 = this.f27453C;
        if (i11 == 0) {
            int i12 = this.f27496z;
            if (i12 == 0) {
                fVar.setGravity(8388611);
            } else if (i12 == 1) {
                fVar.setGravity(1);
            } else if (i12 == 2) {
                fVar.setGravity(8388611);
            }
        } else if (i11 == 1 || i11 == 2) {
            fVar.setGravity(1);
        }
        m(true);
    }

    public final int e(float f10, int i10) {
        f fVar;
        View childAt;
        int i11 = this.f27453C;
        if ((i11 != 0 && i11 != 2) || (childAt = (fVar = this.f27476e).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < fVar.getChildCount() ? fVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void f() {
        if (this.f27464N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27464N = valueAnimator;
            valueAnimator.setInterpolator(this.f27460J);
            this.f27464N.setDuration(this.f27451A);
            this.f27464N.addUpdateListener(new a());
        }
    }

    public final g g() {
        g gVar = (g) f27450W.a();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f27508e = this;
        A0.d dVar = this.f27472V;
        i iVar = dVar != null ? (i) dVar.a() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f27505b)) {
            iVar.setContentDescription(gVar.f27504a);
        } else {
            iVar.setContentDescription(gVar.f27505b);
        }
        gVar.f27509f = iVar;
        return gVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f27475d;
        if (gVar != null) {
            return gVar.f27506c;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f27474c.size();
    }

    public int getTabGravity() {
        return this.f27496z;
    }

    public ColorStateList getTabIconTint() {
        return this.f27484n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f27457G;
    }

    public int getTabIndicatorGravity() {
        return this.f27452B;
    }

    public int getTabMaxWidth() {
        return this.f27491u;
    }

    public int getTabMode() {
        return this.f27453C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f27485o;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f27486p;
    }

    public ColorStateList getTabTextColors() {
        return this.f27483m;
    }

    public final void h() {
        g gVar;
        int currentItem;
        f fVar = this.f27476e;
        int childCount = fVar.getChildCount() - 1;
        while (true) {
            gVar = null;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f27472V.b(iVar);
            }
            requestLayout();
            childCount--;
        }
        ArrayList<g> arrayList = this.f27474c;
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f27508e = null;
            next.f27509f = null;
            next.f27504a = null;
            next.f27505b = null;
            next.f27506c = -1;
            next.f27507d = null;
            f27450W.b(next);
        }
        this.f27475d = null;
        H2.a aVar = this.f27466P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                g gVarG = g();
                CharSequence pageTitle = this.f27466P.getPageTitle(i10);
                if (TextUtils.isEmpty(gVarG.f27505b) && !TextUtils.isEmpty(pageTitle)) {
                    gVarG.f27509f.setContentDescription(pageTitle);
                }
                gVarG.f27504a = pageTitle;
                i iVar2 = gVarG.f27509f;
                if (iVar2 != null) {
                    iVar2.d();
                }
                a(gVarG, false);
            }
            ViewPager viewPager = this.f27465O;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                gVar = arrayList.get(currentItem);
            }
            i(gVar, true);
        }
    }

    public final void i(g gVar, boolean z10) {
        g gVar2 = this.f27475d;
        ArrayList<c> arrayList = this.f27462L;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).getClass();
                }
                c(gVar.f27506c);
                return;
            }
            return;
        }
        int i10 = gVar != null ? gVar.f27506c : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.f27506c == -1) && i10 != -1) {
                k(i10, 0.0f, true, true, true);
            } else {
                c(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f27475d = gVar;
        if (gVar2 != null && gVar2.f27508e != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a(gVar);
            }
        }
    }

    public final void j(H2.a aVar, boolean z10) {
        e eVar;
        H2.a aVar2 = this.f27466P;
        if (aVar2 != null && (eVar = this.f27467Q) != null) {
            aVar2.unregisterDataSetObserver(eVar);
        }
        this.f27466P = aVar;
        if (z10 && aVar != null) {
            if (this.f27467Q == null) {
                this.f27467Q = new e();
            }
            aVar.registerDataSetObserver(this.f27467Q);
        }
        h();
    }

    public final void k(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            f fVar = this.f27476e;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z11) {
                TabLayout.this.f27473b = Math.round(f11);
                ValueAnimator valueAnimator = fVar.f27502b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f27502b.cancel();
                }
                fVar.c(fVar.getChildAt(i10), fVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.f27464N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f27464N.cancel();
            }
            int iE = e(f10, i10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iE >= scrollX) || (i10 > getSelectedTabPosition() && iE <= scrollX) || i10 == getSelectedTabPosition();
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (getLayoutDirection() == 1) {
                z13 = (i10 < getSelectedTabPosition() && iE <= scrollX) || (i10 > getSelectedTabPosition() && iE >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.f27471U == 1 || z12) {
                if (i10 < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void l(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f27465O;
        if (viewPager2 != null) {
            h hVar = this.f27468R;
            if (hVar != null && (arrayList2 = viewPager2.f20236S) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.f27469S;
            if (bVar != null && (arrayList = this.f27465O.f20238U) != null) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.f27463M;
        ArrayList<c> arrayList3 = this.f27462L;
        if (jVar != null) {
            arrayList3.remove(jVar);
            this.f27463M = null;
        }
        if (viewPager != null) {
            this.f27465O = viewPager;
            if (this.f27468R == null) {
                this.f27468R = new h(this);
            }
            h hVar2 = this.f27468R;
            hVar2.f27512d = 0;
            hVar2.f27511c = 0;
            if (viewPager.f20236S == null) {
                viewPager.f20236S = new ArrayList();
            }
            viewPager.f20236S.add(hVar2);
            j jVar2 = new j(viewPager);
            this.f27463M = jVar2;
            if (!arrayList3.contains(jVar2)) {
                arrayList3.add(jVar2);
            }
            H2.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                j(adapter, true);
            }
            if (this.f27469S == null) {
                this.f27469S = new b();
            }
            b bVar2 = this.f27469S;
            bVar2.f27498a = true;
            if (viewPager.f20238U == null) {
                viewPager.f20238U = new ArrayList();
            }
            viewPager.f20238U.add(bVar2);
            k(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f27465O = null;
            j(null, false);
        }
        this.f27470T = z10;
    }

    public final void m(boolean z10) {
        int i10 = 0;
        while (true) {
            f fVar = this.f27476e;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f27453C == 1 && this.f27496z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.G(this);
        if (this.f27465O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                l((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27470T) {
            setupWithViewPager(null);
            this.f27470T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            f fVar = this.f27476e;
            if (i10 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).j) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.j.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(s.e.a(1, getTabCount(), 1).f1432a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iRound = Math.round(t.a(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iA = this.f27493w;
            if (iA <= 0) {
                iA = (int) (size - t.a(getContext(), 56));
            }
            this.f27491u = iA;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f27453C;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.E(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f27454D == z10) {
            return;
        }
        this.f27454D = z10;
        int i10 = 0;
        while (true) {
            f fVar = this.f27476e;
            if (i10 >= fVar.getChildCount()) {
                d();
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                iVar.setOrientation(!TabLayout.this.f27454D ? 1 : 0);
                TextView textView = iVar.f27520h;
                if (textView == null && iVar.f27521i == null) {
                    iVar.g(iVar.f27515c, iVar.f27516d, true);
                } else {
                    iVar.g(textView, iVar.f27521i, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f27464N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f27486p = drawableMutate;
        int i10 = this.f27487q;
        if (i10 != 0) {
            p234t0.a.C0532a.g(drawableMutate, i10);
        } else {
            p234t0.a.C0532a.h(drawableMutate, null);
        }
        int intrinsicHeight = this.f27456F;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f27486p.getIntrinsicHeight();
        }
        this.f27476e.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f27487q = i10;
        Drawable drawable = this.f27486p;
        if (i10 != 0) {
            p234t0.a.C0532a.g(drawable, i10);
        } else {
            p234t0.a.C0532a.h(drawable, null);
        }
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f27452B != i10) {
            this.f27452B = i10;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            this.f27476e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f27456F = i10;
        this.f27476e.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f27496z != i10) {
            this.f27496z = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f27484n != colorStateList) {
            this.f27484n = colorStateList;
            ArrayList<g> arrayList = this.f27474c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = arrayList.get(i10).f27509f;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(p186p0.a.b(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f27457G = i10;
        if (i10 == 0) {
            this.f27459I = new com.google.android.material.tabs.a();
            return;
        }
        if (i10 == 1) {
            this.f27459I = new W5.a();
        } else {
            if (i10 == 2) {
                this.f27459I = new W5.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f27455E = z10;
        int i10 = f.f27501d;
        f fVar = this.f27476e;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.f27453C) {
            this.f27453C = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f27485o == colorStateList) {
            return;
        }
        this.f27485o = colorStateList;
        int i10 = 0;
        while (true) {
            f fVar = this.f27476e;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof i) {
                Context context = getContext();
                int i11 = i.f27513m;
                ((i) childAt).e(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(p186p0.a.b(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f27483m != colorStateList) {
            this.f27483m = colorStateList;
            ArrayList<g> arrayList = this.f27474c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = arrayList.get(i10).f27509f;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(H2.a aVar) {
        j(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f27458H == z10) {
            return;
        }
        this.f27458H = z10;
        int i10 = 0;
        while (true) {
            f fVar = this.f27476e;
            if (i10 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i10);
            if (childAt instanceof i) {
                Context context = getContext();
                int i11 = i.f27513m;
                ((i) childAt).e(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        l(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f27461K;
        ArrayList<c> arrayList = this.f27462L;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.f27461K = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(v.e(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
