package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0848a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0116a f8887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f8889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0850c f8890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.core.view.Z f8892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8894i;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    public class C0116a implements androidx.core.view.a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8895b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8896c;

        public C0116a() {
        }

        @Override // androidx.core.view.a0
        public final void a() {
            this.f8895b = true;
        }

        @Override // androidx.core.view.a0
        public final void c() {
            AbstractC0848a.super.setVisibility(0);
            this.f8895b = false;
        }

        @Override // androidx.core.view.a0
        public final void d() {
            if (this.f8895b) {
                return;
            }
            AbstractC0848a abstractC0848a = AbstractC0848a.this;
            abstractC0848a.f8892g = null;
            AbstractC0848a.super.setVisibility(this.f8896c);
        }
    }

    public AbstractC0848a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final androidx.core.view.Z e(int i10, long j) {
        androidx.core.view.Z z10 = this.f8892g;
        if (z10 != null) {
            z10.b();
        }
        C0116a c0116a = this.f8887b;
        if (i10 != 0) {
            androidx.core.view.Z zA = androidx.core.view.O.a(this);
            zA.a(0.0f);
            zA.c(j);
            AbstractC0848a.this.f8892g = zA;
            c0116a.f8896c = i10;
            zA.d(c0116a);
            return zA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.Z zA2 = androidx.core.view.O.a(this);
        zA2.a(1.0f);
        zA2.c(j);
        AbstractC0848a.this.f8892g = zA2;
        c0116a.f8896c = i10;
        zA2.d(c0116a);
        return zA2;
    }

    public int getAnimatedVisibility() {
        return this.f8892g != null ? this.f8887b.f8896c : getVisibility();
    }

    public int getContentHeight() {
        return this.f8891f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p088h.a.f35689a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0850c c0850c = this.f8890e;
        if (c0850c != null) {
            Configuration configuration2 = c0850c.f8402c.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            c0850c.f8910r = i10;
            androidx.appcompat.view.menu.f fVar = c0850c.f8403d;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8894i = false;
        }
        if (!this.f8894i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8894i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8894i = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8893h = false;
        }
        if (!this.f8893h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8893h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8893h = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f8891f = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.Z z10 = this.f8892g;
            if (z10 != null) {
                z10.b();
            }
            super.setVisibility(i10);
        }
    }

    public AbstractC0848a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8887b = new C0116a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f8888c = context;
        } else {
            this.f8888c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
