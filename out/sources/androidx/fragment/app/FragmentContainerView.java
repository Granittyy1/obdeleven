package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.n0;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: FragmentContainerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f17472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        kotlin.jvm.internal.i.e(context, "context");
        this.f17470b = new ArrayList();
        this.f17471c = new ArrayList();
        this.f17473e = true;
    }

    public final void a(View view) {
        if (this.f17471c.contains(view)) {
            this.f17470b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        n0 n0VarI;
        kotlin.jvm.internal.i.e(insets, "insets");
        n0 n0VarH = n0.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f17472d;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.i.b(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.i.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            n0VarI = n0.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            n0VarI = androidx.core.view.O.i(this, n0VarH);
        }
        kotlin.jvm.internal.i.d(n0VarI, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!n0VarI.f16948a.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.O.b(getChildAt(i10), n0VarI);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
        if (this.f17473e) {
            Iterator it = this.f17470b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
        kotlin.jvm.internal.i.e(child, "child");
        if (this.f17473e) {
            ArrayList arrayList = this.f17470b;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        this.f17471c.remove(view);
        if (this.f17470b.remove(view)) {
            this.f17473e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        ActivityC1347l activityC1347l;
        Fragment fragment;
        y supportFragmentManager;
        View view = this;
        while (true) {
            activityC1347l = null;
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof ActivityC1347l) {
                    activityC1347l = (ActivityC1347l) context;
                    break;
                }
            }
            if (activityC1347l == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = activityC1347l.getSupportFragmentManager();
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.i.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.i.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.i.d(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f17473e = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f17472d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        if (view.getParent() == this) {
            this.f17471c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        kotlin.jvm.internal.i.e(context, "context");
        this.f17470b = new ArrayList();
        this.f17471c = new ArrayList();
        this.f17473e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V0.a.f6663b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = Name.LABEL;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, y fm) {
        View view;
        super(context, attrs);
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(attrs, "attrs");
        kotlin.jvm.internal.i.e(fm, "fm");
        this.f17470b = new ArrayList();
        this.f17471c = new ArrayList();
        this.f17473e = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, V0.a.f6663b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentC = fm.C(id);
        if (classAttribute != null && fragmentC == null) {
            if (id == -1) {
                throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C1351p c1351pJ = fm.J();
            context.getClassLoader();
            Fragment fragmentInstantiate = Fragment.instantiate(y.this.f17696x.f17632c, classAttribute, null);
            kotlin.jvm.internal.i.d(fragmentInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentInstantiate.mFragmentId = id;
            fragmentInstantiate.mContainerId = id;
            fragmentInstantiate.mTag = string;
            fragmentInstantiate.mFragmentManager = fm;
            fragmentInstantiate.mHost = fm.f17696x;
            fragmentInstantiate.onInflate(context, attrs, (Bundle) null);
            C1336a c1336a = new C1336a(fm);
            c1336a.f17498p = true;
            fragmentInstantiate.mContainer = this;
            fragmentInstantiate.mInDynamicContainer = true;
            c1336a.d(getId(), fragmentInstantiate, string, 1);
            if (!c1336a.f17490g) {
                c1336a.f17491h = false;
                c1336a.f17569r.A(c1336a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (G g10 : fm.f17676c.d()) {
            Fragment fragment = g10.f17476c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                g10.a();
                g10.i();
            }
        }
    }
}
