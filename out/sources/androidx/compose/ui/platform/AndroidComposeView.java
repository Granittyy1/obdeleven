package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.C0884l;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1108r0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.autofill.PopulateViewStructure_androidKt;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.C1123e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1140p;
import androidx.compose.ui.input.pointer.C1150a;
import androidx.compose.ui.input.pointer.C1151b;
import androidx.compose.ui.input.pointer.HitPathTracker;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1194o;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.C1204z;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.InterfaceC1363f;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.U, androidx.compose.ui.node.a0, androidx.compose.ui.input.pointer.f, InterfaceC1363f {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static Class<?> f14644V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static Method f14645W0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14646A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C1213c0 f14647A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.g f14648B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final G f14649B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.u f14650C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final C1085f0 f14651C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Ia.l<? super Configuration, p293xa.r> f14652D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f14653D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final androidx.compose.ui.autofill.a f14654E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final C1085f0 f14655E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final androidx.compose.ui.autofill.b f14656F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final M.c f14657F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14658G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final N.c f14659G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1224i f14660H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final ModifierLocalManager f14661H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1222h f14662I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final I f14663I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final OwnerSnapshotObserver f14664J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public MotionEvent f14665J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14666K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public long f14667K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public L f14668L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final c1 f14669L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1223h0 f14670M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final androidx.collection.I<Ia.a<p293xa.r>> f14671M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public p013b0.a f14672N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final d f14673N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14674O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final androidx.compose.material.ripple.k f14675O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final androidx.compose.ui.node.E f14676P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f14677P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f14678Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final Ia.a<p293xa.r> f14679Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int[] f14680R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final V f14681R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float[] f14682S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f14683S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final float[] f14684T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final androidx.compose.ui.scrollcapture.g f14685T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final float[] f14686U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final c f14687U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f14688V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14689W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1202x f14692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f14693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FocusOwnerImpl f14694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlin.coroutines.e f14695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AndroidDragAndDropManager f14696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1239p0 f14697i;
    public final androidx.compose.ui.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.h f14698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.compose.ui.graphics.F f14699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final K f14700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LayoutNode f14701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.collection.B<LayoutNode> f14702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.compose.ui.spatial.b f14703p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f14704p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AndroidComposeView f14705q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f14706q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.ui.semantics.s f14707r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C1085f0 f14708r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AndroidComposeViewAccessibilityDelegateCompat f14709s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final DerivedSnapshotState f14710s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AndroidContentCaptureManager f14711t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Ia.l<? super b, p293xa.r> f14712t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1220g f14713u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1228k f14714u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1140p f14715v;
    public final ViewTreeObserverOnScrollChangedListenerC1230l v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.compose.ui.autofill.k f14716w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC1232m f14717w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f14718x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final TextInputServiceAndroid f14719x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f14720y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final androidx.compose.ui.text.input.y f14721y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14722z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final AtomicReference f14723z0;

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class a {
        public static final boolean a() {
            Class<?> cls = AndroidComposeView.f14644V0;
            try {
                if (AndroidComposeView.f14644V0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.f14644V0 = cls2;
                    AndroidComposeView.f14645W0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f14645W0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1376t f14724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p248u2.e f14725b;

        public b(InterfaceC1376t interfaceC1376t, p248u2.e eVar) {
            this.f14724a = interfaceC1376t;
            this.f14725b = eVar;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class c implements androidx.compose.ui.input.pointer.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.compose.ui.input.pointer.m f14727a;

        public c() {
            androidx.compose.ui.input.pointer.m.f14096a.getClass();
        }

        @Override // androidx.compose.ui.input.pointer.n
        public final androidx.compose.ui.input.pointer.m a() {
            return this.f14727a;
        }

        @Override // androidx.compose.ui.input.pointer.n
        public final void b(androidx.compose.ui.input.pointer.m mVar) {
            this.f14727a = mVar;
        }

        @Override // androidx.compose.ui.input.pointer.n
        public final void c(androidx.compose.ui.input.pointer.m mVar) {
            if (mVar == null) {
                androidx.compose.ui.input.pointer.m.f14096a.getClass();
                mVar = androidx.compose.ui.input.pointer.o.f14098a;
            }
            A.f14643a.a(AndroidComposeView.this, mVar);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f14665J0;
            if (motionEvent != null) {
                boolean z10 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                androidComposeView2.U(motionEvent, i10, androidComposeView2.f14667K0, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.compose.ui.platform.k] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.ui.platform.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.compose.ui.platform.m] */
    public AndroidComposeView(Context context, kotlin.coroutines.e eVar) {
        LayoutDirection layoutDirection;
        super(context);
        this.f14690b = 9205357640488583168L;
        int i10 = 1;
        this.f14691c = true;
        this.f14692d = new C1202x();
        p013b0.e eVarB = I.e.b(context);
        C1108r0 c1108r0 = C1108r0.f13116a;
        this.f14693e = new C1085f0(eVarB, c1108r0);
        androidx.compose.ui.semantics.f fVar = new androidx.compose.ui.semantics.f();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        androidx.compose.ui.node.H<U> h8 = new androidx.compose.ui.node.H<U>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.ui.node.H
            public final androidx.compose.ui.h.c a() {
                U u10 = new U();
                u10.f14970p = this.f14726b;
                return u10;
            }

            @Override // androidx.compose.ui.node.H
            public final void e(androidx.compose.ui.h.c cVar) {
                ((U) cVar).f14970p = this.f14726b;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f14726b.hashCode();
            }
        };
        this.f14694f = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new AndroidComposeView$focusOwner$2(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new AndroidComposeView$focusOwner$3(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new AndroidComposeView$focusOwner$4(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new AndroidComposeView$focusOwner$5(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new AndroidComposeView$focusOwner$6(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.f14695g = eVar;
        this.f14696h = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.f14697i = new C1239p0();
        androidx.compose.ui.h hVarA = androidx.compose.ui.input.key.a.a(new Ia.l<O.c, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(O.c cVar) {
                final C1123e c1123e;
                KeyEvent keyEvent = cVar.f4721a;
                this.this$0.getClass();
                long jN = O.e.n(keyEvent);
                if (O.b.a(jN, O.b.f4714g)) {
                    c1123e = new C1123e(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (O.b.a(jN, O.b.f4712e)) {
                    c1123e = new C1123e(4);
                } else if (O.b.a(jN, O.b.f4711d)) {
                    c1123e = new C1123e(3);
                } else {
                    if (O.b.a(jN, O.b.f4709b) ? true : O.b.a(jN, O.b.f4717k)) {
                        c1123e = new C1123e(5);
                    } else {
                        if (O.b.a(jN, O.b.f4710c) ? true : O.b.a(jN, O.b.f4718l)) {
                            c1123e = new C1123e(6);
                        } else {
                            if (O.b.a(jN, O.b.f4713f) ? true : O.b.a(jN, O.b.f4716i) ? true : O.b.a(jN, O.b.f4719m)) {
                                c1123e = new C1123e(7);
                            } else {
                                c1123e = O.b.a(jN, O.b.f4708a) ? true : O.b.a(jN, O.b.j) ? new C1123e(8) : null;
                            }
                        }
                    }
                }
                if (c1123e == null || !O.d.a(O.e.r(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                int i11 = c1123e.f13449a;
                Integer numN = C.e.n(i11);
                I.f fVarG = this.this$0.G();
                Boolean boolE = this.this$0.getFocusOwner().e(i11, fVarG, new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.D(c1123e.f13449a));
                    }
                });
                if (boolE != null ? boolE.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(C1123e.a(i11, 1) ? true : C1123e.a(i11, 2))) {
                    return Boolean.FALSE;
                }
                if (numN != null) {
                    AndroidComposeView androidComposeView = this.this$0;
                    int iIntValue = numN.intValue();
                    androidComposeView.getClass();
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View viewFindNextFocus = androidComposeView;
                    loop0: while (true) {
                        if (viewFindNextFocus == null) {
                            viewFindNextFocus = null;
                            break;
                        }
                        View rootView = androidComposeView.getRootView();
                        kotlin.jvm.internal.i.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                        if (viewFindNextFocus != null) {
                            Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> lVar = AndroidComposeView_androidKt.f14790a;
                            if (!kotlin.jvm.internal.i.a(viewFindNextFocus, androidComposeView)) {
                                ViewParent parent = viewFindNextFocus.getParent();
                                while (true) {
                                    if (parent == null) {
                                        break loop0;
                                    }
                                    if (parent == androidComposeView) {
                                        break;
                                    }
                                    parent = parent.getParent();
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (kotlin.jvm.internal.i.a(viewFindNextFocus, this.this$0)) {
                        viewFindNextFocus = null;
                    }
                    if (viewFindNextFocus != null) {
                        Rect rectA = fVarG != null ? androidx.compose.ui.graphics.g0.a(fVarG) : null;
                        if (rectA == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        viewFindNextFocus.getLocationInWindow(this.this$0.f14680R);
                        AndroidComposeView androidComposeView2 = this.this$0;
                        int[] iArr = androidComposeView2.f14680R;
                        int i12 = iArr[0];
                        int i13 = iArr[1];
                        androidComposeView2.getLocationInWindow(iArr);
                        int[] iArr2 = this.this$0.f14680R;
                        rectA.offset(iArr2[0] - i12, iArr2[1] - i13);
                        if (C.e.m(viewFindNextFocus, numN, rectA)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!this.this$0.getFocusOwner().m(i11, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolE2 = this.this$0.getFocusOwner().e(i11, null, new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.D(c1123e.f13449a));
                    }
                });
                return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
            }
        });
        this.j = hVarA;
        androidx.compose.ui.h hVarA2 = androidx.compose.ui.input.rotary.a.a(new Ia.l<Q.c, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Boolean invoke(Q.c cVar) {
                return Boolean.FALSE;
            }
        });
        this.f14698k = hVarA2;
        this.f14699l = new androidx.compose.ui.graphics.F();
        this.f14700m = new K(ViewConfiguration.get(context));
        LayoutNode layoutNode = new LayoutNode(false, 3, 0);
        layoutNode.d(RootMeasurePolicy.f14208b);
        layoutNode.i0(getDensity());
        layoutNode.k0(getViewConfiguration());
        layoutNode.e(emptySemanticsElement.i(hVarA2).i(hVarA).i(getFocusOwner().d()).i(getDragAndDropManager().f13352d).i(h8));
        this.f14701n = layoutNode;
        androidx.collection.B b10 = C0884l.f9191a;
        this.f14702o = new androidx.collection.B<>();
        m5getLayoutNodes();
        this.f14703p = new androidx.compose.ui.spatial.b();
        this.f14705q = this;
        this.f14707r = new androidx.compose.ui.semantics.s(getRoot(), fVar, m5getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f14709s = androidComposeViewAccessibilityDelegateCompat;
        this.f14711t = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(0, this, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.f14713u = new C1220g(context);
        this.f14715v = new C1140p(this);
        this.f14716w = new androidx.compose.ui.autofill.k();
        this.f14718x = new ArrayList();
        this.f14648B = new androidx.compose.ui.input.pointer.g();
        this.f14650C = new androidx.compose.ui.input.pointer.u(getRoot());
        this.f14652D = new Ia.l<Configuration, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(Configuration configuration) {
                return p293xa.r.f47939a;
            }
        };
        this.f14654E = new androidx.compose.ui.autofill.a(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw C4.v.g("Autofill service could not be located.");
        }
        this.f14656F = new androidx.compose.ui.autofill.b(new androidx.compose.ui.autofill.n(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f14660H = new C1224i(context);
        this.f14662I = new C1222h(getClipboardManager());
        this.f14664J = new OwnerSnapshotObserver(new Ia.l<Ia.a<? extends p293xa.r>, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Ia.a<? extends p293xa.r> aVar) {
                Ia.a<? extends p293xa.r> aVar2 = aVar;
                Handler handler = this.this$0.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar2.invoke();
                } else {
                    Handler handler2 = this.this$0.getHandler();
                    if (handler2 != null) {
                        handler2.post(new T5.h(1, aVar2));
                    }
                }
                return p293xa.r.f47939a;
            }
        });
        this.f14676P = new androidx.compose.ui.node.E(getRoot());
        long j = BrazeLogger.SUPPRESS;
        this.f14678Q = (j & 4294967295L) | (j << 32);
        this.f14680R = new int[]{0, 0};
        float[] fArrA = androidx.compose.ui.graphics.a0.a();
        this.f14682S = fArrA;
        this.f14684T = androidx.compose.ui.graphics.a0.a();
        this.f14686U = androidx.compose.ui.graphics.a0.a();
        this.f14688V = -1L;
        this.f14704p0 = 9187343241974906880L;
        this.f14706q0 = true;
        androidx.compose.ui.scrollcapture.g gVar = null;
        this.f14708r0 = androidx.compose.runtime.J0.f(null);
        this.f14710s0 = androidx.compose.runtime.J0.d(new Ia.a<b>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // Ia.a
            public final AndroidComposeView.b invoke() {
                return this.this$0.get_viewTreeOwners();
            }
        });
        this.f14714u0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f15057b.V();
            }
        };
        this.v0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.l
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f15059b.V();
            }
        };
        this.f14717w0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                N.c cVar = this.f15062b.f14659G0;
                int i11 = z10 ? 1 : 2;
                cVar.getClass();
                cVar.f4619b.setValue(new N.a(i11));
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.f14719x0 = textInputServiceAndroid;
        ((AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1) AndroidComposeView_androidKt.f14790a).getClass();
        this.f14721y0 = new androidx.compose.ui.text.input.y(textInputServiceAndroid);
        this.f14723z0 = new AtomicReference(null);
        this.f14647A0 = new C1213c0(getTextInputService());
        this.f14649B0 = new G();
        this.f14651C0 = new C1085f0(androidx.compose.ui.text.font.g.a(context), c1108r0);
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = Build.VERSION.SDK_INT;
        this.f14653D0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection2 = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection2 != 0) {
            layoutDirection = layoutDirection2 != 1 ? null : LayoutDirection.f15718c;
        } else {
            layoutDirection = LayoutDirection.f15717b;
        }
        this.f14655E0 = androidx.compose.runtime.J0.f(layoutDirection == null ? LayoutDirection.f15717b : layoutDirection);
        this.f14657F0 = new M.c(this);
        this.f14659G0 = new N.c(new Ia.l<N.a, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(N.a aVar) {
                int i12 = aVar.f4617a;
                boolean zRequestFocusFromTouch = true;
                if (i12 == 1) {
                    zRequestFocusFromTouch = this.this$0.isInTouchMode();
                } else if (i12 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (this.this$0.isInTouchMode()) {
                    zRequestFocusFromTouch = this.this$0.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }
        }, isInTouchMode() ? 1 : 2);
        this.f14661H0 = new ModifierLocalManager(this);
        this.f14663I0 = new I(this);
        this.f14669L0 = new c1();
        this.f14671M0 = new androidx.collection.I<>(gVar);
        this.f14673N0 = new d();
        this.f14675O0 = new androidx.compose.material.ripple.k(i10, this);
        this.f14679Q0 = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                int actionMasked;
                MotionEvent motionEvent = this.this$0.f14665J0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    this.this$0.f14667K0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = this.this$0;
                    androidComposeView.post(androidComposeView.f14673N0);
                }
                return p293xa.r.f47939a;
            }
        };
        this.f14681R0 = i11 < 29 ? new androidx.compose.foundation.gestures.n(fArrA) : new W();
        addOnAttachStateChangeListener(this.f14711t);
        setWillNotDraw(false);
        setFocusable(true);
        B.f14821a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.O.n(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(getDragAndDropManager());
        getRoot().n(this);
        if (i11 >= 29) {
            C1245t.f15093a.a(this);
        }
        this.f14685T0 = i11 >= 31 ? new androidx.compose.ui.scrollcapture.g() : null;
        this.f14687U0 = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b get_viewTreeOwners() {
        return (b) this.f14708r0.getValue();
    }

    public static final void j(AndroidComposeView androidComposeView, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.f14709s;
        if (kotlin.jvm.internal.i.a(str, androidComposeViewAccessibilityDelegateCompat.f14737D)) {
            int iB2 = androidComposeViewAccessibilityDelegateCompat.f14735B.b(i10);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.i.a(str, androidComposeViewAccessibilityDelegateCompat.f14738E) || (iB = androidComposeViewAccessibilityDelegateCompat.f14736C.b(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB);
    }

    public static final boolean n(AndroidComposeView androidComposeView, C1123e c1123e, I.f fVar) {
        Integer numN;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((c1123e == null || (numN = C.e.n(c1123e.f13449a)) == null) ? 130 : numN.intValue(), fVar != null ? androidx.compose.ui.graphics.g0.a(fVar) : null);
    }

    public static void o(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).F();
            } else if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt);
            }
        }
    }

    public static long q(int i10) {
        long j;
        long j10;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                j = ((long) 0) << 32;
                size = BrazeLogger.SUPPRESS;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j10 = size;
                j = j10 << 32;
            }
            return j | j10;
        }
        j = ((long) 0) << 32;
        j10 = size;
        return j | j10;
    }

    public static View r(int i10, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.i.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewR = r(i10, viewGroup.getChildAt(i11));
                    if (viewR != null) {
                        return viewR;
                    }
                }
            }
        }
        return null;
    }

    private void setDensity(p013b0.c cVar) {
        this.f14693e.setValue(cVar);
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.d.a aVar) {
        this.f14651C0.setValue(aVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f14655E0.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f14708r0.setValue(bVar);
    }

    public static void v(LayoutNode layoutNode) {
        layoutNode.N();
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            v(layoutNodeArr[i11]);
        }
    }

    public static boolean y(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & BrazeLogger.SUPPRESS) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & BrazeLogger.SUPPRESS) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & BrazeLogger.SUPPRESS) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & BrazeLogger.SUPPRESS) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & BrazeLogger.SUPPRESS) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & BrazeLogger.SUPPRESS) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C1244s0.f15092a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    public final boolean A(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f14665J0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long B(long j) {
        L();
        long jB = androidx.compose.ui.graphics.a0.b(j, this.f14684T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f14704p0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f14704p0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void C(boolean z10) {
        Ia.a<p293xa.r> aVar;
        androidx.compose.ui.node.E e10 = this.f14676P;
        if (e10.f14351b.d() || ((androidx.compose.runtime.collection.c) e10.f14354e.f6730b).f12945d != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    aVar = this.f14679Q0;
                } finally {
                    Trace.endSection();
                }
            } else {
                aVar = null;
            }
            if (e10.j(aVar)) {
                requestLayout();
            }
            e10.a(false);
            if (this.f14646A) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f14646A = false;
            }
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public final void D(LayoutNode layoutNode, long j) {
        androidx.compose.ui.node.E e10 = this.f14676P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            e10.k(layoutNode, j);
            if (!e10.f14351b.d()) {
                e10.a(false);
                if (this.f14646A) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f14646A = false;
                }
            }
            getRectManager().a();
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            Trace.endSection();
        }
    }

    public final void E(androidx.compose.ui.node.T t8, boolean z10) {
        ArrayList arrayList = this.f14718x;
        if (!z10) {
            if (this.f14722z) {
                return;
            }
            arrayList.remove(t8);
            ArrayList arrayList2 = this.f14720y;
            if (arrayList2 != null) {
                arrayList2.remove(t8);
                return;
            }
            return;
        }
        if (!this.f14722z) {
            arrayList.add(t8);
            return;
        }
        ArrayList arrayList3 = this.f14720y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f14720y = arrayList3;
        }
        arrayList3.add(t8);
    }

    public final void F() {
        if (this.f14658G) {
            getSnapshotObserver().a();
            this.f14658G = false;
        }
        L l10 = this.f14668L;
        if (l10 != null) {
            o(l10);
        }
        androidx.compose.ui.autofill.b bVar = this.f14656F;
        if (bVar != null) {
            androidx.collection.C c10 = bVar.f13293h;
            if (c10.f9195d == 0 && bVar.f13294i) {
                bVar.f13286a.f13303a.commit();
                bVar.f13294i = false;
            }
            if (c10.f9195d != 0) {
                bVar.f13294i = true;
            }
        }
        while (true) {
            androidx.collection.I<Ia.a<p293xa.r>> i10 = this.f14671M0;
            if (!i10.e() || i10.b(0) == null) {
                return;
            }
            int i11 = i10.f9109b;
            for (int i12 = 0; i12 < i11; i12++) {
                Ia.a<p293xa.r> aVarB = i10.b(i12);
                if (i12 < 0 || i12 >= i10.f9109b) {
                    i10.f(i12);
                    throw null;
                }
                Object[] objArr = i10.f9108a;
                Object obj = objArr[i12];
                objArr[i12] = null;
                if (aVarB != null) {
                    aVarB.invoke();
                }
            }
            i10.l(0, i11);
        }
    }

    public final I.f G() {
        if (isFocused()) {
            return getFocusOwner().l();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return C.e.g(viewFindFocus, this);
        }
        return null;
    }

    public final void H(LayoutNode layoutNode) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f14709s;
        androidComposeViewAccessibilityDelegateCompat.f14768x = true;
        if (androidComposeViewAccessibilityDelegateCompat.l()) {
            androidComposeViewAccessibilityDelegateCompat.m(layoutNode);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.f14711t;
        androidContentCaptureManager.f13313h = true;
        if (androidContentCaptureManager.f()) {
            androidContentCaptureManager.f13314i.n(p293xa.r.f47939a);
        }
    }

    public final void I(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12) {
        LayoutNode layoutNodeG;
        LayoutNode layoutNodeG2;
        LookaheadPassDelegate lookaheadPassDelegate;
        androidx.compose.ui.node.A a10;
        androidx.compose.ui.node.E e10 = this.f14676P;
        if (!z10) {
            if (e10.p(layoutNode, z11) && z12) {
                R(layoutNode);
                return;
            }
            return;
        }
        e10.getClass();
        if (layoutNode.f14407i == null) {
            R.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        C1204z c1204z = layoutNode.f14390H;
        int iOrdinal = c1204z.f14630d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!c1204z.f14631e || z11) {
                    c1204z.f14631e = true;
                    c1204z.f14641p.f14499w = true;
                    if (layoutNode.f14399Q) {
                        return;
                    }
                    boolean zA = kotlin.jvm.internal.i.a(layoutNode.R(), Boolean.TRUE);
                    K3.b bVar = e10.f14351b;
                    if ((zA || (c1204z.f14631e && (layoutNode.E() == LayoutNode.UsageByParent.f14431b || !((lookaheadPassDelegate = c1204z.f14642q) == null || (a10 = lookaheadPassDelegate.f14456t) == null || !a10.f())))) && ((layoutNodeG = layoutNode.G()) == null || !layoutNodeG.f14390H.f14631e)) {
                        bVar.c(layoutNode, true);
                    } else if ((layoutNode.r() || androidx.compose.ui.node.E.h(layoutNode)) && ((layoutNodeG2 = layoutNode.G()) == null || !layoutNodeG2.D())) {
                        bVar.c(layoutNode, false);
                    }
                    if (e10.f14353d || !z12) {
                        return;
                    }
                    R(layoutNode);
                    return;
                }
                return;
            }
        }
        e10.f14357h.b(new androidx.compose.ui.node.E.a(layoutNode, true, z11));
    }

    public final void J(LayoutNode layoutNode, boolean z10, boolean z11) {
        androidx.compose.ui.node.E e10 = this.f14676P;
        if (!z10) {
            e10.getClass();
            int iOrdinal = layoutNode.f14390H.f14630d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            LayoutNode layoutNodeG = layoutNode.G();
            boolean z12 = layoutNodeG == null || layoutNodeG.r();
            C1204z c1204z = layoutNode.f14390H;
            if (!z11) {
                if (layoutNode.D()) {
                    return;
                }
                if (layoutNode.C() && layoutNode.r() == z12 && layoutNode.r() == c1204z.f14641p.f14498v) {
                    return;
                }
            }
            MeasurePassDelegate measurePassDelegate = c1204z.f14641p;
            measurePassDelegate.f14500x = true;
            measurePassDelegate.f14501y = true;
            if (!layoutNode.f14399Q && measurePassDelegate.f14498v && z12) {
                if ((layoutNodeG == null || !layoutNodeG.C()) && (layoutNodeG == null || !layoutNodeG.D())) {
                    e10.f14351b.c(layoutNode, false);
                }
                if (e10.f14353d) {
                    return;
                }
                R(null);
                return;
            }
            return;
        }
        e10.getClass();
        int iOrdinal2 = layoutNode.f14390H.f14630d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        C1204z c1204z2 = layoutNode.f14390H;
        if ((c1204z2.f14631e || c1204z2.f14632f) && !z11) {
            return;
        }
        c1204z2.f14632f = true;
        c1204z2.f14633g = true;
        MeasurePassDelegate measurePassDelegate2 = c1204z2.f14641p;
        measurePassDelegate2.f14500x = true;
        measurePassDelegate2.f14501y = true;
        if (layoutNode.f14399Q) {
            return;
        }
        LayoutNode layoutNodeG2 = layoutNode.G();
        boolean zA = kotlin.jvm.internal.i.a(layoutNode.R(), Boolean.TRUE);
        K3.b bVar = e10.f14351b;
        if (zA && ((layoutNodeG2 == null || !layoutNodeG2.f14390H.f14631e) && (layoutNodeG2 == null || !layoutNodeG2.f14390H.f14632f))) {
            bVar.c(layoutNode, true);
        } else if (layoutNode.r() && ((layoutNodeG2 == null || !layoutNodeG2.C()) && (layoutNodeG2 == null || !layoutNodeG2.D()))) {
            bVar.c(layoutNode, false);
        }
        if (e10.f14353d) {
            return;
        }
        R(null);
    }

    public final void K() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f14709s;
        androidComposeViewAccessibilityDelegateCompat.f14768x = true;
        if (androidComposeViewAccessibilityDelegateCompat.l() && !androidComposeViewAccessibilityDelegateCompat.f14742I) {
            androidComposeViewAccessibilityDelegateCompat.f14742I = true;
            androidComposeViewAccessibilityDelegateCompat.f14754i.post(androidComposeViewAccessibilityDelegateCompat.f14743J);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.f14711t;
        androidContentCaptureManager.f13313h = true;
        if (!androidContentCaptureManager.f() || androidContentCaptureManager.f13319o) {
            return;
        }
        androidContentCaptureManager.f13319o = true;
        androidContentCaptureManager.j.post(androidContentCaptureManager.f13320p);
    }

    public final void L() {
        if (this.f14689W) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f14688V) {
            this.f14688V = jCurrentAnimationTimeMillis;
            V v10 = this.f14681R0;
            float[] fArr = this.f14684T;
            v10.a(this, fArr);
            A8.A.f(fArr, this.f14686U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f14680R;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f14704p0 = (((long) Float.floatToRawIntBits(f10 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f11 - iArr[1])) & 4294967295L);
        }
    }

    public final void M(MotionEvent motionEvent) {
        this.f14688V = AnimationUtils.currentAnimationTimeMillis();
        V v10 = this.f14681R0;
        float[] fArr = this.f14684T;
        v10.a(this, fArr);
        A8.A.f(fArr, this.f14686U);
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jB = androidx.compose.ui.graphics.a0.b((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.f14704p0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final void N(androidx.compose.ui.node.T t8) {
        c1 c1Var;
        Reference referencePoll;
        androidx.compose.runtime.collection.c cVar;
        if (this.f14670M != null) {
            Ia.p<View, Matrix, p293xa.r> pVar = ViewLayer.f14977q;
        }
        do {
            c1Var = this.f14669L0;
            referencePoll = ((ReferenceQueue) c1Var.f15036b).poll();
            cVar = (androidx.compose.runtime.collection.c) c1Var.f15035a;
            if (referencePoll != null) {
                cVar.m(referencePoll);
            }
        } while (referencePoll != null);
        cVar.b(new WeakReference(t8, (ReferenceQueue) c1Var.f15036b));
        this.f14718x.remove(t8);
    }

    public final void O(Ia.a<p293xa.r> aVar) {
        androidx.collection.I<Ia.a<p293xa.r>> i10 = this.f14671M0;
        if (i10.c(aVar) >= 0) {
            return;
        }
        i10.g(aVar);
    }

    public final void P(final AndroidViewHolder androidViewHolder) {
        O(new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                this.this$0.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                this.this$0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(this.this$0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                androidViewHolder.setImportantForAccessibility(0);
                return p293xa.r.f47939a;
            }
        });
    }

    public final void Q(LayoutNode layoutNode) {
        ((androidx.compose.runtime.collection.c) this.f14676P.f14354e.f6730b).b(layoutNode);
        layoutNode.f14398P = true;
        R(null);
    }

    public final void R(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.f14390H.f14641p.f14489m == LayoutNode.UsageByParent.f14431b) {
                if (!this.f14674O) {
                    LayoutNode layoutNodeG = layoutNode.G();
                    if (layoutNodeG == null) {
                        break;
                    }
                    long j = layoutNodeG.f14389G.f14365b.f14223e;
                    if (p013b0.a.f(j) && p013b0.a.e(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.G();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long S(long j) {
        L();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f14704p0 >> 32));
        return androidx.compose.ui.graphics.a0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f14704p0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f14686U);
    }

    public final int T(MotionEvent motionEvent) {
        Object obj;
        int iA = 0;
        if (this.f14683S0) {
            this.f14683S0 = false;
            int metaState = motionEvent.getMetaState();
            this.f14697i.getClass();
            e1.f15042a.setValue(new androidx.compose.ui.input.pointer.x(metaState));
        }
        androidx.compose.ui.input.pointer.g gVar = this.f14648B;
        androidx.compose.ui.input.pointer.s sVarA = gVar.a(motionEvent, this);
        androidx.compose.ui.input.pointer.u uVar = this.f14650C;
        if (sVarA != null) {
            ArrayList arrayList = (ArrayList) sVarA.f14118a;
            int size = arrayList.size() - 1;
            if (size < 0) {
                obj = null;
                break;
            }
            while (true) {
                int i10 = size - 1;
                obj = arrayList.get(size);
                if (((androidx.compose.ui.input.pointer.t) obj).f14124e) {
                    break;
                }
                if (i10 < 0) {
                    obj = null;
                    break;
                }
                size = i10;
            }
            androidx.compose.ui.input.pointer.t tVar = (androidx.compose.ui.input.pointer.t) obj;
            if (tVar != null) {
                this.f14690b = tVar.f14123d;
            }
            iA = uVar.a(sVarA, this, z(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (iA & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                gVar.f14078c.delete(pointerId);
                gVar.f14077b.delete(pointerId);
            }
        } else if (!uVar.f14134e) {
            uVar.f14132c.f14114a.a();
            uVar.f14131b.c();
        }
        return iA;
    }

    public final void U(MotionEvent motionEvent, int i10, long j, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jB = B((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jB >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jB & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.input.pointer.s sVarA = this.f14648B.a(motionEventObtain, this);
        kotlin.jvm.internal.i.b(sVarA);
        this.f14650C.a(sVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public final void V() {
        boolean z10;
        boolean z11;
        int[] iArr = this.f14680R;
        getLocationOnScreen(iArr);
        long j = this.f14678Q;
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        int i12 = iArr[0];
        if (i10 == i12 && i11 == iArr[1] && this.f14688V >= 0) {
            z10 = false;
        } else {
            this.f14678Q = (4294967295L & ((long) iArr[1])) | (((long) i12) << 32);
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                z10 = false;
            } else {
                getRoot().f14390H.f14641p.C0();
                z10 = true;
            }
        }
        L();
        androidx.compose.ui.spatial.b rectManager = getRectManager();
        long j10 = this.f14678Q;
        long jL = Cb.a.l(this.f14704p0);
        rectManager.getClass();
        float[] fArr = this.f14684T;
        if ((C.e.b(fArr) & 2) != 0) {
            fArr = null;
        }
        androidx.compose.ui.spatial.c cVar = rectManager.f15260b;
        if (p013b0.j.b(jL, cVar.f15270c)) {
            z11 = false;
        } else {
            cVar.f15270c = jL;
            z11 = true;
        }
        if (!p013b0.j.b(j10, cVar.f15271d)) {
            cVar.f15271d = j10;
            z11 = true;
        }
        if (fArr != null) {
            z11 = true;
        }
        rectManager.f15263e = z11 || rectManager.f15263e;
        this.f14676P.a(z10);
        getRectManager().a();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        androidx.compose.ui.semantics.l lVarF;
        androidx.compose.ui.semantics.a aVar;
        Ia.l lVar;
        androidx.compose.ui.autofill.b bVar = this.f14656F;
        if (bVar != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                if (autofillValue.isText()) {
                    androidx.compose.ui.semantics.m mVar = (androidx.compose.ui.semantics.m) bVar.f13287b.f15249c.b(iKeyAt);
                    if (mVar != null && (lVarF = mVar.f()) != null && (aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVarF, androidx.compose.ui.semantics.k.f15215g)) != null && (lVar = (Ia.l) aVar.f15191b) != null) {
                    }
                } else if (!autofillValue.isDate() && !autofillValue.isList()) {
                    autofillValue.isToggle();
                }
            }
        }
        androidx.compose.ui.autofill.a aVar2 = this.f14654E;
        if (aVar2 != null) {
            androidx.compose.ui.autofill.k kVar = (androidx.compose.ui.autofill.k) aVar2.f13283b;
            if (kVar.f13298a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iKeyAt2 = sparseArray.keyAt(i11);
                AutofillValue autofillValue2 = sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                } else {
                    if (autofillValue2.isDate()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void c(InterfaceC1376t interfaceC1376t) {
        setShowLayoutBounds(a.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f14709s.d(i10, this.f14690b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f14709s.d(i10, this.f14690b, true);
    }

    @Override // androidx.compose.ui.input.pointer.f
    public final void d(float[] fArr) {
        L();
        androidx.compose.ui.graphics.a0.e(fArr, this.f14684T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f14704p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f14704p0 & 4294967295L));
        Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> lVar = AndroidComposeView_androidKt.f14790a;
        float[] fArr2 = this.f14682S;
        androidx.compose.ui.graphics.a0.d(fArr2);
        androidx.compose.ui.graphics.a0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2, 0.0f);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            v(getRoot());
        }
        C(true);
        SnapshotKt.k().m();
        this.f14722z = true;
        androidx.compose.ui.graphics.F f10 = this.f14699l;
        C1138n c1138n = f10.f13476a;
        Canvas canvas2 = c1138n.f13771a;
        c1138n.f13771a = canvas;
        getRoot().w(c1138n, null);
        f10.f13476a.f13771a = canvas2;
        ArrayList arrayList = this.f14718x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.compose.ui.node.T) arrayList.get(i10)).l();
            }
        }
        if (ViewLayer.f14982v) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f14722z = false;
        ArrayList arrayList2 = this.f14720y;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.f14677P0) {
            androidx.compose.material.ripple.k kVar = this.f14675O0;
            removeCallbacks(kVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f14677P0 = false;
            } else {
                kVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (y(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (u(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        getContext();
        float fB = androidx.core.view.Q.b(viewConfiguration) * f10;
        getContext();
        return getFocusOwner().f(new Q.c(fB, androidx.core.view.Q.a(viewConfiguration) * f10, motionEvent.getDeviceId(), motionEvent.getEventTime()), new Ia.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent));
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10 = this.f14677P0;
        androidx.compose.material.ripple.k kVar = this.f14675O0;
        if (z10) {
            removeCallbacks(kVar);
            kVar.run();
        }
        if (y(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f14709s;
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.f14749d;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f14746a;
            if (action == 7 || action == 9) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                androidComposeView.C(true);
                C1194o c1194o = new C1194o();
                LayoutNode root = androidComposeView.getRoot();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
                LayoutNode.b bVar = LayoutNode.f14379R;
                androidx.compose.ui.node.K k10 = root.f14389G;
                NodeCoordinator nodeCoordinator = k10.f14366c;
                Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
                k10.f14366c.E1(NodeCoordinator.f14513R, nodeCoordinator.p1(jFloatToRawIntBits, true), c1194o, 1, true);
                int iR = kotlin.collections.l.r(c1194o);
                while (true) {
                    if (-1 < iR) {
                        Object objB = c1194o.f14591b.b(iR);
                        kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        LayoutNode layoutNodeF = C1185f.f((androidx.compose.ui.h.c) objB);
                        if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeF) == null) {
                            if (layoutNodeF.f14389G.d(8)) {
                                int iQ = androidComposeViewAccessibilityDelegateCompat.q(layoutNodeF.f14401c);
                                androidx.compose.ui.semantics.q qVarA = androidx.compose.ui.semantics.r.a(layoutNodeF, false);
                                if (K0.f(qVarA)) {
                                    if (!qVarA.i().f15234b.b(SemanticsProperties.f15171y)) {
                                        i10 = iQ;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            iR--;
                        }
                    }
                    i10 = Integer.MIN_VALUE;
                    break;
                }
                androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i11 = androidComposeViewAccessibilityDelegateCompat.f14747b;
                if (i11 != i10) {
                    androidComposeViewAccessibilityDelegateCompat.f14747b = i10;
                    AndroidComposeViewAccessibilityDelegateCompat.u(androidComposeViewAccessibilityDelegateCompat, i10, 128, null, 12);
                    AndroidComposeViewAccessibilityDelegateCompat.u(androidComposeViewAccessibilityDelegateCompat, i11, 256, null, 12);
                }
            } else if (action == 10) {
                int i12 = androidComposeViewAccessibilityDelegateCompat.f14747b;
                if (i12 == Integer.MIN_VALUE) {
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i12 != Integer.MIN_VALUE) {
                    androidComposeViewAccessibilityDelegateCompat.f14747b = Integer.MIN_VALUE;
                    AndroidComposeViewAccessibilityDelegateCompat.u(androidComposeViewAccessibilityDelegateCompat, Integer.MIN_VALUE, 128, null, 12);
                    AndroidComposeViewAccessibilityDelegateCompat.u(androidComposeViewAccessibilityDelegateCompat, i12, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && z(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f14665J0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f14665J0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f14677P0 = true;
                postDelayed(kVar, 8L);
                return false;
            }
        } else if (!A(motionEvent)) {
            return false;
        }
        return (u(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().j(keyEvent, new Ia.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Boolean invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
                }
            });
        }
        int metaState = keyEvent.getMetaState();
        this.f14697i.getClass();
        e1.f15042a.setValue(new androidx.compose.ui.input.pointer.x(metaState));
        return getFocusOwner().j(keyEvent, new Ia.a<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.FALSE;
            }
        }) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().p(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C1243s.f15091a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14677P0) {
            androidx.compose.material.ripple.k kVar = this.f14675O0;
            removeCallbacks(kVar);
            MotionEvent motionEvent2 = this.f14665J0;
            kotlin.jvm.internal.i.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f14677P0 = false;
            } else {
                kVar.run();
            }
        }
        if (y(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !A(motionEvent)) {
            return false;
        }
        int iU = u(motionEvent);
        if ((iU & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iU & 1) != 0;
    }

    @Override // androidx.compose.ui.node.U
    public final androidx.compose.ui.node.T e(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar, androidx.compose.ui.graphics.layer.b bVar, boolean z10) {
        Reference referencePoll;
        androidx.compose.runtime.collection.c cVar;
        Object obj;
        if (bVar != null) {
            return new GraphicsLayerOwnerLayer(bVar, null, this, pVar, aVar);
        }
        if (z10) {
            if (isHardwareAccelerated() && this.f14706q0) {
                try {
                    return new RenderNodeLayer(this, pVar, aVar);
                } catch (Throwable unused) {
                    this.f14706q0 = false;
                }
            }
            if (this.f14670M == null) {
                if (!ViewLayer.f14981u) {
                    ViewLayer.b.a(new View(getContext()));
                }
                C1223h0 c1223h0 = ViewLayer.f14982v ? new C1223h0(getContext()) : new Z0(getContext());
                this.f14670M = c1223h0;
                addView(c1223h0, -1);
            }
            C1223h0 c1223h1 = this.f14670M;
            kotlin.jvm.internal.i.b(c1223h1);
            return new ViewLayer(this, c1223h1, pVar, aVar);
        }
        do {
            c1 c1Var = this.f14669L0;
            referencePoll = ((ReferenceQueue) c1Var.f15036b).poll();
            cVar = (androidx.compose.runtime.collection.c) c1Var.f15035a;
            if (referencePoll != null) {
                cVar.m(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i10 = cVar.f12945d;
            if (i10 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) cVar.p(i10 - 1)).get();
        } while (obj == null);
        androidx.compose.ui.node.T t8 = (androidx.compose.ui.node.T) obj;
        if (t8 == null) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        }
        t8.g(pVar, aVar);
        return t8;
    }

    @Override // androidx.compose.ui.node.U
    public final void f() {
        this.f14646A = true;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        View viewR = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (objInvoke instanceof View) {
                    viewR = (View) objInvoke;
                }
            } else {
                viewR = r(i10, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (androidx.compose.ui.focus.F.g(androidx.compose.ui.focus.D.b((androidx.compose.ui.focus.FocusTargetNode) r7), C.e.g(r0, r6), r1, r2) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L7d
            androidx.compose.ui.node.E r0 = r6.f14676P
            boolean r0 = r0.f14352c
            if (r0 == 0) goto La
            goto L7d
        La:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r6, r7, r8)
            if (r7 != r6) goto L23
            androidx.compose.ui.focus.p r1 = r6.getFocusOwner()
            I.f r1 = r1.l()
            if (r1 != 0) goto L27
            I.f r1 = C.e.g(r7, r6)
            goto L27
        L23:
            I.f r1 = C.e.g(r7, r6)
        L27:
            androidx.compose.ui.focus.e r2 = C.e.o(r8)
            if (r2 == 0) goto L30
            int r2 = r2.f13449a
            goto L31
        L30:
            r2 = 6
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            androidx.compose.ui.focus.p r4 = r6.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1 r5 = new androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            r5.<init>()
            java.lang.Boolean r4 = r4.e(r2, r1, r5)
            if (r4 != 0) goto L46
            goto L7c
        L46:
            T r4 = r3.element
            if (r4 != 0) goto L4d
            if (r0 != 0) goto L7b
            goto L7c
        L4d:
            if (r0 != 0) goto L51
        L4f:
            r7 = r6
            goto L7c
        L51:
            r4 = 1
            boolean r5 = androidx.compose.ui.focus.C1123e.a(r2, r4)
            if (r5 == 0) goto L59
            goto L5e
        L59:
            r4 = 2
            boolean r4 = androidx.compose.ui.focus.C1123e.a(r2, r4)
        L5e:
            if (r4 == 0) goto L65
            android.view.View r7 = super.focusSearch(r7, r8)
            goto L7c
        L65:
            T r7 = r3.element
            kotlin.jvm.internal.i.b(r7)
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            I.f r7 = androidx.compose.ui.focus.D.b(r7)
            I.f r8 = C.e.g(r0, r6)
            boolean r7 = androidx.compose.ui.focus.F.g(r7, r8, r1, r2)
            if (r7 == 0) goto L7b
            goto L4f
        L7b:
            r7 = r0
        L7c:
            return r7
        L7d:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.U
    public final void g(Ia.p pVar, ContinuationImpl continuationImpl) {
        AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        if (continuationImpl instanceof AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (AndroidComposeView$textInputSession$1) continuationImpl;
            int i10 = androidComposeView$textInputSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
            }
        } else {
            androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
        }
        Object obj = androidComposeView$textInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = androidComposeView$textInputSession$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            AtomicReference atomicReference = this.f14723z0;
            Ia.l<kotlinx.coroutines.A, H> lVar = new Ia.l<kotlinx.coroutines.A, H>() { // from class: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
                {
                    super(1);
                }

                @Override // Ia.l
                public final H invoke(kotlinx.coroutines.A a10) {
                    AndroidComposeView androidComposeView = this.this$0;
                    return new H(androidComposeView, androidComposeView.getTextInputService(), a10);
                }
            };
            androidComposeView$textInputSession$1.label = 1;
            if (androidx.compose.ui.k.a(atomicReference, lVar, pVar, androidComposeView$textInputSession$1) == coroutineSingletons) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final L getAndroidViewsHandler$ui_release() {
        if (this.f14668L == null) {
            L l10 = new L(getContext());
            this.f14668L = l10;
            addView(l10, -1);
            requestLayout();
        }
        L l11 = this.f14668L;
        kotlin.jvm.internal.i.b(l11);
        return l11;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.autofill.e getAutofill() {
        return this.f14654E;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.autofill.i getAutofillManager() {
        return this.f14656F;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.autofill.k getAutofillTree() {
        return this.f14716w;
    }

    public final Ia.l<Configuration, p293xa.r> getConfigurationChangeObserver() {
        return this.f14652D;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.f14711t;
    }

    @Override // androidx.compose.ui.node.U
    public kotlin.coroutines.e getCoroutineContext() {
        return this.f14695g;
    }

    @Override // androidx.compose.ui.node.U
    public p013b0.c getDensity() {
        return (p013b0.c) this.f14693e.getValue();
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.focus.p getFocusOwner() {
        return this.f14694f;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        I.f fVarG = G();
        if (fVarG != null) {
            rect.left = Math.round(fVarG.f3757a);
            rect.top = Math.round(fVarG.f3758b);
            rect.right = Math.round(fVarG.f3759c);
            rect.bottom = Math.round(fVarG.f3760d);
            return;
        }
        if (kotlin.jvm.internal.i.a(getFocusOwner().e(6, null, new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.getFocusedRect.1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.text.font.d.a getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.d.a) this.f14651C0.getValue();
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.text.font.c.a getFontLoader() {
        return this.f14649B0;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.graphics.S getGraphicsContext() {
        return this.f14715v;
    }

    @Override // androidx.compose.ui.node.U
    public M.a getHapticFeedBack() {
        return this.f14657F0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f14676P.f14351b.d();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.U
    public N.b getInputModeManager() {
        return this.f14659G0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f14688V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.U
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f14655E0.getValue();
    }

    public long getMeasureIteration() {
        androidx.compose.ui.node.E e10 = this.f14676P;
        if (!e10.f14352c) {
            R.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return e10.f14356g;
    }

    @Override // androidx.compose.ui.node.U
    public ModifierLocalManager getModifierLocalManager() {
        return this.f14661H0;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.layout.Y.a getPlacementScope() {
        Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
        return new androidx.compose.ui.layout.V(this);
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.input.pointer.n getPointerIconService() {
        return this.f14687U0;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.spatial.b getRectManager() {
        return this.f14703p;
    }

    @Override // androidx.compose.ui.node.U
    public LayoutNode getRoot() {
        return this.f14701n;
    }

    public androidx.compose.ui.node.a0 getRootForTest() {
        return this.f14705q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress$ui_release() {
        androidx.compose.ui.scrollcapture.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.f14685T0) == null) {
            return false;
        }
        return ((Boolean) gVar.f15125a.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.semantics.s getSemanticsOwner() {
        return this.f14707r;
    }

    @Override // androidx.compose.ui.node.U
    public C1202x getSharedDrawScope() {
        return this.f14692d;
    }

    @Override // androidx.compose.ui.node.U
    public boolean getShowLayoutBounds() {
        return this.f14666K;
    }

    @Override // androidx.compose.ui.node.U
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f14664J;
    }

    @Override // androidx.compose.ui.node.U
    public M0 getSoftwareKeyboardController() {
        return this.f14647A0;
    }

    @Override // androidx.compose.ui.node.U
    public androidx.compose.ui.text.input.y getTextInputService() {
        return this.f14721y0;
    }

    @Override // androidx.compose.ui.node.U
    public P0 getTextToolbar() {
        return this.f14663I0;
    }

    @Override // androidx.compose.ui.node.U
    public Y0 getViewConfiguration() {
        return this.f14700m;
    }

    public final b getViewTreeOwners() {
        return (b) this.f14710s0.getValue();
    }

    @Override // androidx.compose.ui.node.U
    public d1 getWindowInfo() {
        return this.f14697i;
    }

    public final androidx.compose.ui.autofill.b get_autofillManager$ui_release() {
        return this.f14656F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Lifecycle lifecycle;
        InterfaceC1376t interfaceC1376t;
        super.onAttachedToWindow();
        Boolean boolValueOf = Boolean.valueOf(hasWindowFocus());
        C1239p0 c1239p0 = this.f14697i;
        c1239p0.f15084b.setValue(boolValueOf);
        c1239p0.f15083a = new Ia.a<p013b0.l>() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
            {
                super(0);
            }

            @Override // Ia.a
            public final p013b0.l invoke() {
                Activity activity;
                int iRound;
                long j;
                O o10;
                Context context = AndroidComposeView.this.getContext();
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    } else {
                        activity = (Activity) baseContext;
                        break;
                    }
                }
                if (activity != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        o10 = T.f14963a;
                    } else if (i10 >= 29) {
                        o10 = S.f14960a;
                    } else {
                        o10 = i10 >= 28 ? Q.f14944a : P.f14941a;
                    }
                    Rect rectA = o10.a(activity);
                    int iWidth = rectA.width();
                    iRound = rectA.height();
                    j = iWidth;
                } else {
                    Configuration configuration = context.getResources().getConfiguration();
                    float f10 = context.getResources().getDisplayMetrics().density;
                    int iRound2 = Math.round(configuration.screenWidthDp * f10);
                    iRound = Math.round(configuration.screenHeightDp * f10);
                    j = iRound2;
                }
                return new p013b0.l((((long) iRound) & 4294967295L) | (j << 32));
            }
        };
        c1239p0.getClass();
        w(getRoot());
        v(getRoot());
        getSnapshotObserver().f14552a.e();
        androidx.compose.ui.autofill.a aVar = this.f14654E;
        if (aVar != null) {
            androidx.compose.ui.autofill.h hVar = androidx.compose.ui.autofill.h.f13297a;
            hVar.getClass();
            ((AutofillManager) aVar.f13284c).registerCallback(hVar);
        }
        InterfaceC1376t interfaceC1376tG = P3.d.g(this);
        p248u2.e eVarI = I2.e.i(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1376tG != null && eVarI != null && (interfaceC1376tG != (interfaceC1376t = viewTreeOwners.f14724a) || eVarI != interfaceC1376t))) {
            if (interfaceC1376tG == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarI == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f14724a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            interfaceC1376tG.getLifecycle().a(this);
            b bVar = new b(interfaceC1376tG, eVarI);
            set_viewTreeOwners(bVar);
            Ia.l<? super b, p293xa.r> lVar = this.f14712t0;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.f14712t0 = null;
        }
        int i10 = isInTouchMode() ? 1 : 2;
        N.c cVar = this.f14659G0;
        cVar.getClass();
        cVar.f4619b.setValue(new N.a(i10));
        b viewTreeOwners2 = getViewTreeOwners();
        Lifecycle lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f14724a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw C4.v.g("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f14711t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f14714u0);
        getViewTreeObserver().addOnScrollChangedListener(this.v0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f14717w0);
        if (Build.VERSION.SDK_INT >= 31) {
            C1257z.f15110a.b(this);
        }
        androidx.compose.ui.autofill.b bVar2 = this.f14656F;
        if (bVar2 != null) {
            getFocusOwner().s().g(bVar2);
            getSemanticsOwner().f15250d.g(bVar2);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        androidx.compose.ui.k.a aVar = (androidx.compose.ui.k.a) this.f14723z0.get();
        H h8 = (H) (aVar != null ? aVar.f14154b : null);
        if (h8 == null) {
            return this.f14719x0.f15499d;
        }
        androidx.compose.ui.k.a aVar2 = (androidx.compose.ui.k.a) h8.f14916e.get();
        C1233m0 c1233m0 = (C1233m0) (aVar2 != null ? aVar2.f14154b : null);
        return c1233m0 != null && (c1233m0.f15067e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(I.e.b(getContext()));
        this.f14697i.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f14653D0) {
            this.f14653D0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(androidx.compose.ui.text.font.g.a(getContext()));
        }
        this.f14652D.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        androidx.compose.ui.k.a aVar = (androidx.compose.ui.k.a) this.f14723z0.get();
        InputConnection qVar = null;
        H h8 = (H) (aVar != null ? aVar.f14154b : null);
        if (h8 != null) {
            androidx.compose.ui.k.a aVar2 = (androidx.compose.ui.k.a) h8.f14916e.get();
            final C1233m0 c1233m0 = (C1233m0) (aVar2 != null ? aVar2.f14154b : null);
            if (c1233m0 != null) {
                synchronized (c1233m0.f15065c) {
                    if (!c1233m0.f15067e) {
                        RecordingInputConnection recordingInputConnectionA = c1233m0.f15063a.a(editorInfo);
                        Ia.l<androidx.compose.ui.text.input.o, p293xa.r> lVar = new Ia.l<androidx.compose.ui.text.input.o, p293xa.r>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.text.input.o oVar) {
                                androidx.compose.ui.text.input.o oVar2 = oVar;
                                oVar2.a();
                                androidx.compose.runtime.collection.c<androidx.compose.ui.node.g0<androidx.compose.ui.text.input.o>> cVar = c1233m0.f15066d;
                                androidx.compose.ui.node.g0<androidx.compose.ui.text.input.o>[] g0VarArr = cVar.f12943b;
                                int i10 = cVar.f12945d;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= i10) {
                                        i11 = -1;
                                        break;
                                    }
                                    if (kotlin.jvm.internal.i.a(g0VarArr[i11], oVar2)) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (i11 >= 0) {
                                    c1233m0.f15066d.p(i11);
                                }
                                C1233m0 c1233m1 = c1233m0;
                                if (c1233m1.f15066d.f12945d == 0) {
                                    c1233m1.f15064b.invoke();
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        qVar = Build.VERSION.SDK_INT >= 34 ? new androidx.compose.ui.text.input.q(recordingInputConnectionA, lVar) : new androidx.compose.ui.text.input.p(recordingInputConnectionA, lVar);
                        c1233m0.f15066d.b(new androidx.compose.ui.node.g0(qVar));
                    }
                }
            }
            return qVar;
        }
        TextInputServiceAndroid textInputServiceAndroid = this.f14719x0;
        if (!textInputServiceAndroid.f15499d) {
            return null;
        }
        androidx.compose.ui.text.input.l lVar2 = textInputServiceAndroid.f15503h;
        TextFieldValue textFieldValue = textInputServiceAndroid.f15502g;
        int i10 = lVar2.f15554e;
        boolean zA = androidx.compose.ui.text.input.k.a(i10, 1);
        boolean z10 = lVar2.f15550a;
        int i11 = 0;
        if (zA) {
            if (z10) {
                i11 = 6;
            }
        } else if (androidx.compose.ui.text.input.k.a(i10, 0)) {
            i11 = 1;
        } else if (androidx.compose.ui.text.input.k.a(i10, 2)) {
            i11 = 2;
        } else if (androidx.compose.ui.text.input.k.a(i10, 6)) {
            i11 = 5;
        } else if (androidx.compose.ui.text.input.k.a(i10, 5)) {
            i11 = 7;
        } else if (androidx.compose.ui.text.input.k.a(i10, 3)) {
            i11 = 3;
        } else if (androidx.compose.ui.text.input.k.a(i10, 4)) {
            i11 = 4;
        } else {
            if (!androidx.compose.ui.text.input.k.a(i10, 7)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i11 = 6;
        }
        editorInfo.imeOptions = i11;
        int i12 = lVar2.f15553d;
        if (androidx.compose.ui.text.input.n.a(i12, 1)) {
            editorInfo.inputType = 1;
        } else if (androidx.compose.ui.text.input.n.a(i12, 2)) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (androidx.compose.ui.text.input.n.a(i12, 3)) {
            editorInfo.inputType = 2;
        } else if (androidx.compose.ui.text.input.n.a(i12, 4)) {
            editorInfo.inputType = 3;
        } else if (androidx.compose.ui.text.input.n.a(i12, 5)) {
            editorInfo.inputType = 17;
        } else if (androidx.compose.ui.text.input.n.a(i12, 6)) {
            editorInfo.inputType = 33;
        } else if (androidx.compose.ui.text.input.n.a(i12, 7)) {
            editorInfo.inputType = 129;
        } else if (androidx.compose.ui.text.input.n.a(i12, 8)) {
            editorInfo.inputType = 18;
        } else {
            if (!androidx.compose.ui.text.input.n.a(i12, 9)) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!z10) {
            int i13 = editorInfo.inputType;
            if ((i13 & 1) == 1) {
                editorInfo.inputType = i13 | 131072;
                if (androidx.compose.ui.text.input.k.a(lVar2.f15554e, 1)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i14 = lVar2.f15551b;
            if (androidx.compose.ui.text.input.m.a(i14, 1)) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.m.a(i14, 2)) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.m.a(i14, 3)) {
                editorInfo.inputType |= 16384;
            }
            if (lVar2.f15552c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = textFieldValue.f15492b;
        int i15 = androidx.compose.ui.text.E.f15315c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        F0.a.a(editorInfo, textFieldValue.f15491a.f15408c);
        editorInfo.imeOptions |= 33554432;
        if (androidx.emoji2.text.c.d()) {
            androidx.emoji2.text.c.a().i(editorInfo);
        }
        androidx.compose.ui.text.input.u uVar = new androidx.compose.ui.text.input.u(textInputServiceAndroid.f15502g, new androidx.compose.foundation.gestures.snapping.c(textInputServiceAndroid), textInputServiceAndroid.f15503h.f15552c);
        textInputServiceAndroid.f15504i.add(new WeakReference(uVar));
        return uVar;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        androidx.compose.ui.semantics.q qVar;
        String strB;
        AndroidContentCaptureManager androidContentCaptureManager = this.f14711t;
        androidContentCaptureManager.getClass();
        for (long j : jArr) {
            J0 j0B = androidContentCaptureManager.e().b((int) j);
            if (j0B != null && (qVar = j0B.f14934a) != null) {
                N2.b.d();
                ViewTranslationRequest.Builder builderB = androidx.compose.ui.contentcapture.h.b(androidContentCaptureManager.f13307b.getAutofillId(), qVar.f15245g);
                List list = (List) SemanticsConfigurationKt.a(qVar.f15242d, SemanticsProperties.f15172z);
                if (list != null && (strB = p039d0.a.b(list, "\n", null, 62)) != null) {
                    builderB.setValue("android:text", TranslationRequestValue.forText(new C1260a(strB)));
                    consumer.accept(builderB.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f14552a;
        androidx.compose.runtime.snapshots.f fVar = snapshotStateObserver.f13174h;
        if (fVar != null) {
            fVar.dispose();
        }
        snapshotStateObserver.b();
        this.f14697i.getClass();
        b viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = viewTreeOwners != null ? viewTreeOwners.f14724a.getLifecycle() : null;
        if (lifecycle == null) {
            throw C4.v.g("No lifecycle owner exists");
        }
        lifecycle.c(this.f14711t);
        lifecycle.c(this);
        androidx.compose.ui.autofill.a aVar = this.f14654E;
        if (aVar != null) {
            androidx.compose.ui.autofill.h hVar = androidx.compose.ui.autofill.h.f13297a;
            hVar.getClass();
            ((AutofillManager) aVar.f13284c).unregisterCallback(hVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f14714u0);
        getViewTreeObserver().removeOnScrollChangedListener(this.v0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f14717w0);
        if (Build.VERSION.SDK_INT >= 31) {
            C1257z.f15110a.a(this);
        }
        androidx.compose.ui.autofill.b bVar = this.f14656F;
        if (bVar != null) {
            getSemanticsOwner().f15250d.j(bVar);
            getFocusOwner().s().j(bVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        getFocusOwner().q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f14688V = 0L;
        this.f14676P.j(this.f14679Q0);
        this.f14672N = null;
        V();
        if (this.f14668L != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        androidx.compose.ui.node.E e10 = this.f14676P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                w(getRoot());
            }
            long jQ = q(i10);
            long jQ2 = q(i11);
            long jA = p013b0.a.C0206a.a((int) (jQ >>> 32), (int) (jQ & 4294967295L), (int) (jQ2 >>> 32), (int) (4294967295L & jQ2));
            p013b0.a aVar = this.f14672N;
            if (aVar == null) {
                this.f14672N = new p013b0.a(jA);
                this.f14674O = false;
            } else if (!p013b0.a.b(aVar.f20475a, jA)) {
                this.f14674O = true;
            }
            e10.q(jA);
            e10.l();
            setMeasuredDimension(getRoot().f14390H.f14641p.f14220b, getRoot().f14390H.f14641p.f14221c);
            if (this.f14668L != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f14390H.f14641p.f14220b, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f14390H.f14641p.f14221c, 1073741824));
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        if (viewStructure != null) {
            androidx.compose.ui.autofill.b bVar = this.f14656F;
            if (bVar != null) {
                LayoutNode layoutNode = bVar.f13287b.f15247a;
                AutofillId autofillId = bVar.f13292g;
                String str = bVar.f13290e;
                androidx.compose.ui.spatial.b bVar2 = bVar.f13289d;
                PopulateViewStructure_androidKt.a(viewStructure, layoutNode, autofillId, str, bVar2);
                Object[] objArr = androidx.collection.Q.f9119a;
                androidx.collection.I i11 = new androidx.collection.I(2);
                i11.g(layoutNode);
                i11.g(viewStructure);
                while (i11.e()) {
                    Object objK = i11.k(i11.f9109b - 1);
                    kotlin.jvm.internal.i.c(objK, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = i11.k(i11.f9109b - 1);
                    kotlin.jvm.internal.i.c(objK2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    List<androidx.compose.ui.semantics.m> listI = ((androidx.compose.ui.semantics.m) objK2).i();
                    int size = listI.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        androidx.compose.ui.semantics.m mVar = listI.get(i12);
                        if (!mVar.t() && mVar.c() && mVar.r()) {
                            androidx.compose.ui.semantics.l lVarF = mVar.f();
                            if (lVarF != null) {
                                androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.l<C1260a, Boolean>>> vVar = androidx.compose.ui.semantics.k.f15215g;
                                androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVarF.f15234b;
                                if (k10.a(vVar) || k10.a(SemanticsProperties.f15162p) || k10.a(SemanticsProperties.f15163q)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    PopulateViewStructure_androidKt.a(viewStructureNewChild, mVar, autofillId, str, bVar2);
                                    i11.g(mVar);
                                    i11.g(viewStructureNewChild);
                                } else {
                                    i11.g(mVar);
                                    i11.g(viewStructure2);
                                }
                            } else {
                                i11.g(mVar);
                                i11.g(viewStructure2);
                            }
                        }
                    }
                }
            }
            androidx.compose.ui.autofill.a aVar = this.f14654E;
            if (aVar != null) {
                androidx.compose.ui.autofill.k kVar = (androidx.compose.ui.autofill.k) aVar.f13283b;
                if (kVar.f13298a.isEmpty()) {
                    return;
                }
                LinkedHashMap linkedHashMap = kVar.f13298a;
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    androidx.compose.ui.autofill.j jVar = (androidx.compose.ui.autofill.j) entry.getValue();
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) aVar.f13285d, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((AndroidComposeView) aVar.f13282a).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    jVar.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        androidx.compose.ui.input.pointer.m mVarA;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (mVarA = getPointerIconService().a()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        if (mVarA instanceof C1150a) {
            return null;
        }
        return mVarA instanceof C1151b ? PointerIcon.getSystemIcon(context, ((C1151b) mVarA).f14069b) : PointerIcon.getSystemIcon(context, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        LayoutDirection layoutDirection;
        if (this.f14691c) {
            if (i10 != 0) {
                layoutDirection = i10 != 1 ? null : LayoutDirection.f15718c;
            } else {
                layoutDirection = LayoutDirection.f15717b;
            }
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.f15717b;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        androidx.compose.ui.scrollcapture.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.f14685T0) == null) {
            return;
        }
        gVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.f14711t;
        androidContentCaptureManager.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AndroidContentCaptureManager.a.a(androidContentCaptureManager, longSparseArray);
        } else {
            androidContentCaptureManager.f13307b.post(new androidx.compose.ui.contentcapture.i(androidContentCaptureManager, 0, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zA;
        this.f14697i.f15084b.setValue(Boolean.valueOf(z10));
        this.f14683S0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zA = a.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        v(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().i().a()) {
            return super.requestFocus(i10, rect);
        }
        C1123e c1123eO = C.e.o(i10);
        final int i11 = c1123eO != null ? c1123eO.f13449a : 7;
        return kotlin.jvm.internal.i.a(getFocusOwner().e(i11, rect != null ? androidx.compose.ui.graphics.g0.d(rect) : null, new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.D(i11));
            }
        }), Boolean.TRUE);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f14709s.f14750e = j;
    }

    public final void setConfigurationChangeObserver(Ia.l<? super Configuration, p293xa.r> lVar) {
        this.f14652D = lVar;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.f14711t = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(kotlin.coroutines.e eVar) {
        this.f14695g = eVar;
        ?? r11 = getRoot().f14389G.f14368e;
        if (r11 instanceof androidx.compose.ui.input.pointer.D) {
            ((androidx.compose.ui.input.pointer.D) r11).D1();
        }
        if (!r11.f13985b.f13997o) {
            R.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar2 = r11.f13985b;
        androidx.compose.ui.h.c cVar3 = cVar2.f13990g;
        if (cVar3 == null) {
            C1185f.a(cVar, cVar2);
        } else {
            cVar.b(cVar3);
        }
        while (true) {
            int i10 = cVar.f12945d;
            if (i10 == 0) {
                return;
            }
            androidx.compose.ui.h.c cVar4 = (androidx.compose.ui.h.c) cVar.p(i10 - 1);
            if ((cVar4.f13988e & 16) != 0) {
                for (androidx.compose.ui.h.c cVar5 = cVar4; cVar5 != null; cVar5 = cVar5.f13990g) {
                    if ((cVar5.f13987d & 16) != 0) {
                        ?? B10 = cVar5;
                        ?? cVar6 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof androidx.compose.ui.node.Y) {
                                androidx.compose.ui.node.Y y10 = (androidx.compose.ui.node.Y) B10;
                                if (y10 instanceof androidx.compose.ui.input.pointer.D) {
                                    ((androidx.compose.ui.input.pointer.D) y10).D1();
                                }
                            } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                                androidx.compose.ui.h.c cVar7 = ((AbstractC1187h) B10).f14585q;
                                int i11 = 0;
                                B10 = B10;
                                cVar6 = cVar6;
                                while (cVar7 != null) {
                                    if ((cVar7.f13987d & 16) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar6 = cVar6;
                                            B10 = cVar7;
                                        } else {
                                            if (cVar6 == 0) {
                                                cVar6 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (B10 != 0) {
                                                cVar6.b(B10);
                                                B10 = 0;
                                            }
                                            cVar6.b(cVar7);
                                        }
                                    }
                                    cVar7 = cVar7.f13990g;
                                    B10 = B10;
                                    cVar6 = cVar6;
                                }
                                if (i11 == 1) {
                                }
                            }
                            B10 = C1185f.b(cVar6);
                        }
                    }
                }
            }
            C1185f.a(cVar, cVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f14688V = j;
    }

    public final void setOnViewTreeOwnersAvailable(Ia.l<? super b, p293xa.r> lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f14712t0 = lVar;
    }

    @Override // androidx.compose.ui.node.U
    public void setShowLayoutBounds(boolean z10) {
        this.f14666K = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(LayoutNode layoutNode, boolean z10) {
        this.f14676P.f(layoutNode, z10);
    }

    public final int u(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.f14673N0);
        try {
            M(motionEvent);
            this.f14689W = true;
            C(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f14665J0;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                androidx.compose.ui.input.pointer.u uVar = this.f14650C;
                if (motionEvent2 != null) {
                    if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            if (!uVar.f14134e) {
                                uVar.f14132c.f14114a.a();
                                uVar.f14131b.c();
                            }
                        } else if (motionEvent2.getActionMasked() != 10 && z10) {
                            U(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (!z10 && z11 && actionMasked2 != 3 && actionMasked2 != 9 && z(motionEvent)) {
                    U(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f14665J0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f14665J0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    androidx.compose.ui.input.pointer.g gVar = this.f14648B;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            gVar.f14078c.delete(pointerId);
                            gVar.f14077b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f14665J0;
                        float x10 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f14665J0;
                        boolean z12 = (x10 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f14665J0;
                        boolean z13 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                gVar.f14078c.delete(pointerId);
                                gVar.f14077b.delete(pointerId);
                            }
                            HitPathTracker hitPathTracker = uVar.f14131b;
                            if (hitPathTracker.f14020d) {
                                hitPathTracker.f14020d = true;
                            } else {
                                hitPathTracker.f14023g.f14089a.j();
                            }
                        }
                    }
                }
                this.f14665J0 = MotionEvent.obtainNoHistory(motionEvent);
                int iT = T(motionEvent);
                Trace.endSection();
                this.f14689W = false;
                return iT;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.f14689W = false;
            throw th2;
        }
    }

    public final void w(LayoutNode layoutNode) {
        this.f14676P.p(layoutNode, false);
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            w(layoutNodeArr[i11]);
        }
    }

    public final boolean z(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        kotlin.jvm.internal.i.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.U
    public C1220g getAccessibilityManager() {
        return this.f14713u;
    }

    @Override // androidx.compose.ui.node.U
    public C1222h getClipboard() {
        return this.f14662I;
    }

    @Override // androidx.compose.ui.node.U
    public C1224i getClipboardManager() {
        return this.f14660H;
    }

    @Override // androidx.compose.ui.node.U
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.f14696h;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public androidx.collection.B<LayoutNode> m5getLayoutNodes() {
        return this.f14702o;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        p293xa.r rVar = p293xa.r.f47939a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @p293xa.d
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @p293xa.d
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
