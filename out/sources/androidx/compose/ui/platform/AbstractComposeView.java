package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1092j;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<AbstractC1094k> cachedViewTreeCompositionContext;
    private InterfaceC1092j composition;
    private boolean creatingComposition;
    private Ia.a<p293xa.r> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private AbstractC1094k parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final AbstractC1094k cacheIfAlive(AbstractC1094k abstractC1094k) {
        AbstractC1094k abstractC1094k2 = isAlive(abstractC1094k) ? abstractC1094k : null;
        if (abstractC1094k2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC1094k2);
        }
        return abstractC1094k;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = m1.a(this, resolveParentCompositionContext(), new ComposableLambdaImpl(true, -656146368, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.1
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            AbstractComposeView.this.Content(interfaceC1084f2, 0);
                        } else {
                            interfaceC1084f2.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean isAlive(AbstractC1094k abstractC1094k) {
        return !(abstractC1094k instanceof Recomposer) || ((Recomposer.State) ((Recomposer) abstractC1094k).f12909t.getValue()).compareTo(Recomposer.State.f12914c) > 0;
    }

    private final AbstractC1094k resolveParentCompositionContext() {
        AbstractC1094k abstractC1094k;
        Recomposer recomposerA;
        AbstractC1094k abstractC1094k2 = this.parentContext;
        if (abstractC1094k2 != null) {
            return abstractC1094k2;
        }
        AbstractC1094k abstractC1094kB = l1.b(this);
        if (abstractC1094kB == null) {
            for (ViewParent parent = getParent(); abstractC1094kB == null && (parent instanceof View); parent = parent.getParent()) {
                abstractC1094kB = l1.b((View) parent);
            }
        }
        AbstractC1094k abstractC1094kCacheIfAlive = abstractC1094kB != null ? cacheIfAlive(abstractC1094kB) : null;
        if (abstractC1094kCacheIfAlive != null) {
            return abstractC1094kCacheIfAlive;
        }
        WeakReference<AbstractC1094k> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference == null || (abstractC1094k = weakReference.get()) == null || !isAlive(abstractC1094k)) {
            abstractC1094k = null;
        }
        if (abstractC1094k != null) {
            return abstractC1094k;
        }
        if (!isAttachedToWindow()) {
            R.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
        }
        Object parent2 = getParent();
        View view = this;
        while (parent2 instanceof View) {
            View view2 = (View) parent2;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            parent2 = view2.getParent();
        }
        AbstractC1094k abstractC1094kB2 = l1.b(view);
        if (abstractC1094kB2 == null) {
            recomposerA = i1.f15052a.get().a(view);
            view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerA);
            C2673a0 c2673a0 = C2673a0.f43223b;
            Handler handler = view.getHandler();
            int i10 = kotlinx.coroutines.android.g.f43232a;
            view.addOnAttachStateChangeListener(new h1(C2680e.c(c2673a0, new kotlinx.coroutines.android.e(handler, "windowRecomposer cleanup", false).f43231f, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerA, view, null), 2)));
        } else {
            if (!(abstractC1094kB2 instanceof Recomposer)) {
                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
            }
            recomposerA = (Recomposer) abstractC1094kB2;
        }
        return cacheIfAlive(recomposerA);
    }

    private final void setParentContext(AbstractC1094k abstractC1094k) {
        if (this.parentContext != abstractC1094k) {
            this.parentContext = abstractC1094k;
            if (abstractC1094k != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC1092j interfaceC1092j = this.composition;
            if (interfaceC1092j != null) {
                interfaceC1092j.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(InterfaceC1084f interfaceC1084f, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        InterfaceC1092j interfaceC1092j = this.composition;
        if (interfaceC1092j != null) {
            interfaceC1092j.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC1094k abstractC1094k) {
        setParentContext(abstractC1094k);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.U) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        Ia.a<p293xa.r> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.e eVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        checkAddView();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        checkAddView();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.platform.U0, java.lang.Object] */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        final V0 v0 = new V0(this);
        addOnAttachStateChangeListener(v0);
        final ?? r10 = new J0.a() { // from class: androidx.compose.ui.platform.U0
            @Override // J0.a
            public final void a() {
                this.f14971a.disposeComposition();
            }
        };
        p241t7.b.t(this).f3959a.add((J0.a) r10);
        this.disposeViewCompositionStrategy = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                this.$view.removeOnAttachStateChangeListener(v0);
                AbstractComposeView abstractComposeView = this.$view;
                J0.a listener = r10;
                kotlin.jvm.internal.i.e(abstractComposeView, "<this>");
                kotlin.jvm.internal.i.e(listener, "listener");
                p241t7.b.t(abstractComposeView).f3959a.remove(listener);
                return p293xa.r.f47939a;
            }
        };
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        checkAddView();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
