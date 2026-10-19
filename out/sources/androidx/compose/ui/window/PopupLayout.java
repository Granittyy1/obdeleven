package androidx.compose.ui.window;

import Ia.p;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.material3.Q;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.C;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.voltasit.obdeleven.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;
import p293xa.r;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Ia.l<PopupLayout, r> f15801u = new Ia.l<PopupLayout, r>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // Ia.l
        public final r invoke(PopupLayout popupLayout) {
            PopupLayout popupLayout2 = popupLayout;
            if (popupLayout2.isAttachedToWindow()) {
                popupLayout2.h();
            }
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ia.a<r> f15802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f15803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f15805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f15806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowManager f15807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WindowManager.LayoutParams f15808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f15809i;
    public LayoutDirection j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f15810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1085f0 f15811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p013b0.k f15812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DerivedSnapshotState f15813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f15814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SnapshotStateObserver f15815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q f15816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1085f0 f15817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f15819t;

    public PopupLayout() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout(Ia.a aVar, n nVar, String str, View view, p013b0.c cVar, m mVar, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        j kVar = Build.VERSION.SDK_INT >= 29 ? new k() : new l();
        this.f15802b = aVar;
        this.f15803c = nVar;
        this.f15804d = str;
        this.f15805e = view;
        this.f15806f = kVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f15807g = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        n nVar2 = this.f15803c;
        boolean zB = AndroidPopup_androidKt.b(view);
        boolean z10 = nVar2.f15840b;
        int i10 = nVar2.f15839a;
        if (z10 && zB) {
            i10 |= 8192;
        } else if (z10 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f15808h = layoutParams;
        this.f15809i = mVar;
        this.j = LayoutDirection.f15717b;
        this.f15810k = J0.f(null);
        this.f15811l = J0.f(null);
        this.f15813n = J0.d(new Ia.a<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                InterfaceC1170p parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.c()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m6getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.f15814o = new Rect();
        this.f15815p = new SnapshotStateObserver(new Ia.l<Ia.a<? extends r>, r>() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Ia.a<? extends r> aVar2) {
                final Ia.a<? extends r> aVar3 = aVar2;
                Handler handler = this.this$0.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar3.invoke();
                } else {
                    Handler handler2 = this.this$0.getHandler();
                    if (handler2 != null) {
                        handler2.post(new Runnable() { // from class: androidx.compose.ui.window.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar3.invoke();
                            }
                        });
                    }
                }
                return r.f47939a;
            }
        });
        setId(android.R.id.content);
        P3.d.u(this, P3.d.g(view));
        kotlin.jvm.internal.h.h(this, kotlin.jvm.internal.h.f(view));
        I2.e.p(this, I2.e.i(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.T0((float) 8));
        setOutlineProvider(new h());
        this.f15817r = J0.f(ComposableSingletons$AndroidPopup_androidKt.f15795a);
        this.f15819t = new int[2];
    }

    private final p<InterfaceC1084f, Integer, r> getContent() {
        return (p) this.f15817r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1170p getParentLayoutCoordinates() {
        return (InterfaceC1170p) this.f15811l.getValue();
    }

    private final p013b0.k getVisibleDisplayBounds() {
        j jVar = this.f15806f;
        View view = this.f15805e;
        Rect rect = this.f15814o;
        jVar.a(rect, view);
        C c10 = AndroidPopup_androidKt.f15783a;
        return new p013b0.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(p<? super InterfaceC1084f, ? super Integer, r> pVar) {
        this.f15817r.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC1170p interfaceC1170p) {
        this.f15811l.setValue(interfaceC1170p);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-857613600);
        getContent().invoke(interfaceC1084f, 0);
        interfaceC1084f.D();
    }

    public final void c(AbstractC1094k abstractC1094k, p<? super InterfaceC1084f, ? super Integer, r> pVar) {
        setParentCompositionContext(abstractC1094k);
        setContent(pVar);
        this.f15818s = true;
    }

    public final void d(Ia.a<r> aVar, n nVar, String str, LayoutDirection layoutDirection) {
        int i10;
        this.f15802b = aVar;
        this.f15804d = str;
        if (!kotlin.jvm.internal.i.a(this.f15803c, nVar)) {
            boolean z10 = nVar.f15844f;
            WindowManager.LayoutParams layoutParams = this.f15808h;
            if (z10 && !this.f15803c.f15844f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f15803c = nVar;
            boolean zB = AndroidPopup_androidKt.b(this.f15805e);
            boolean z11 = nVar.f15840b;
            int i11 = nVar.f15839a;
            if (z11 && zB) {
                i11 |= 8192;
            } else if (z11 && !zB) {
                i11 &= -8193;
            }
            layoutParams.flags = i11;
            this.f15806f.c(this.f15807g, this, layoutParams);
        }
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15803c.f15841c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Ia.a<r> aVar = this.f15802b;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        InterfaceC1170p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.c()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jW = parentLayoutCoordinates.w(0L);
            p013b0.k kVarA = A8.p.a((((long) Math.round(Float.intBitsToFloat((int) (jW >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jW & 4294967295L))))), jA);
            if (kVarA.equals(this.f15812m)) {
                return;
            }
            this.f15812m = kVarA;
            h();
        }
    }

    public final void f(InterfaceC1170p interfaceC1170p) {
        setParentLayoutCoordinates(interfaceC1170p);
        e();
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f15813n.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f15808h;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p013b0.l m6getPopupContentSizebOM6tXw() {
        return (p013b0.l) this.f15810k.getValue();
    }

    public final m getPositionProvider() {
        return this.f15809i;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15818s;
    }

    public final String getTestTag() {
        return this.f15804d;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h() {
        p013b0.l lVarM6getPopupContentSizebOM6tXw;
        final p013b0.k kVar = this.f15812m;
        if (kVar == null || (lVarM6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        p013b0.k visibleDisplayBounds = getVisibleDisplayBounds();
        final long jD = (((long) visibleDisplayBounds.d()) << 32) | (((long) visibleDisplayBounds.b()) & 4294967295L);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        Ia.l<PopupLayout, r> lVar = f15801u;
        final long j = lVarM6getPopupContentSizebOM6tXw.f20490a;
        this.f15815p.d(this, lVar, new Ia.a<r>() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                ref$LongRef.element = this.getPositionProvider().a(kVar, jD, this.getParentLayoutDirection(), j);
                return r.f47939a;
            }
        });
        WindowManager.LayoutParams layoutParams = this.f15808h;
        long j10 = ref$LongRef.element;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        boolean z10 = this.f15803c.f15843e;
        j jVar = this.f15806f;
        if (z10) {
            jVar.b(this, (int) (jD >> 32), (int) (4294967295L & jD));
        }
        jVar.c(this.f15807g, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (this.f15803c.f15844f || (childAt = getChildAt(0)) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f15808h;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f15806f.c(this.f15807g, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f15803c.f15844f) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            p013b0.k visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15815p.e();
        if (!this.f15803c.f15841c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f15816q == null) {
            this.f15816q = new Q(1, this.f15802b);
        }
        d.a(this, this.f15816q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.f15815p;
        androidx.compose.runtime.snapshots.f fVar = snapshotStateObserver.f13174h;
        if (fVar != null) {
            fVar.dispose();
        }
        snapshotStateObserver.b();
        if (Build.VERSION.SDK_INT >= 33) {
            d.b(this, this.f15816q);
        }
        this.f15816q = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15803c.f15842d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Ia.a<r> aVar = this.f15802b;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Ia.a<r> aVar2 = this.f15802b;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.j = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(p013b0.l lVar) {
        this.f15810k.setValue(lVar);
    }

    public final void setPositionProvider(m mVar) {
        this.f15809i = mVar;
    }

    public final void setTestTag(String str) {
        this.f15804d = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
