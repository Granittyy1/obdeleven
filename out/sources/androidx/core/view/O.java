package androidx.core.view;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.appcompat.widget.C0857j;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, Z> f16859a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f16860b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16861c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f16862d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f16863e = new K();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16864f = new a();

    /* JADX INFO: compiled from: ViewCompat.java */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f16867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16869d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f16866a = i10;
            this.f16867b = cls;
            this.f16869d = i11;
            this.f16868c = i12;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t8);

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(View view, T t8) {
            Object tag;
            C1286a c1286a;
            if (Build.VERSION.SDK_INT >= this.f16868c) {
                b(view, t8);
                return;
            }
            if (Build.VERSION.SDK_INT >= this.f16868c) {
                tag = a(view);
            } else {
                tag = view.getTag(this.f16866a);
                if (!this.f16867b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (d(tag, t8)) {
                View.AccessibilityDelegate accessibilityDelegateD = O.d(view);
                if (accessibilityDelegateD == null) {
                    c1286a = null;
                } else {
                    c1286a = accessibilityDelegateD instanceof C1286a.C0173a ? ((C1286a.C0173a) accessibilityDelegateD).f16888a : new C1286a(accessibilityDelegateD);
                }
                if (c1286a == null) {
                    c1286a = new C1286a();
                }
                O.n(view, c1286a);
                view.setTag(this.f16866a, t8);
                O.h(this.f16869d, view);
            }
        }

        public abstract boolean d(T t8, T t10);
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class d {

        /* JADX INFO: compiled from: ViewCompat.java */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public n0 f16870a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f16871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1309y f16872c;

            public a(View view, InterfaceC1309y interfaceC1309y) {
                this.f16871b = view;
                this.f16872c = interfaceC1309y;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n0 n0VarH = n0.h(view, windowInsets);
                int i10 = Build.VERSION.SDK_INT;
                InterfaceC1309y interfaceC1309y = this.f16872c;
                if (i10 < 30) {
                    d.a(windowInsets, this.f16871b);
                    if (n0VarH.equals(this.f16870a)) {
                        return interfaceC1309y.g(view, n0VarH).g();
                    }
                }
                this.f16870a = n0VarH;
                n0 n0VarG = interfaceC1309y.g(view, n0VarH);
                if (i10 >= 30) {
                    return n0VarG.g();
                }
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                c.c(view);
                return n0VarG.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static n0 b(View view, n0 n0Var, Rect rect) {
            WindowInsets windowInsetsG = n0Var.g();
            if (windowInsetsG != null) {
                return n0.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
            }
            rect.setEmpty();
            return n0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static n0 j(View view) {
            n0.e cVar;
            if (!n0.a.f16952d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = n0.a.f16949a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) n0.a.f16950b.get(obj);
                Rect rect2 = (Rect) n0.a.f16951c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    cVar = new n0.d();
                } else {
                    cVar = i10 >= 29 ? new n0.c() : new n0.b();
                }
                cVar.e(p222s0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                cVar.g(p222s0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                n0 n0VarB = cVar.b();
                n0VarB.f16948a.t(n0VarB);
                n0VarB.f16948a.d(view.getRootView());
                return n0VarB;
            } catch (IllegalAccessException e10) {
                e10.getMessage();
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, InterfaceC1309y interfaceC1309y) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, interfaceC1309y);
            }
            if (interfaceC1309y == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC1309y));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class e {
        public static n0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n0 n0VarH = n0.h(null, rootWindowInsets);
            n0.k kVar = n0VarH.f16948a;
            kVar.t(n0VarH);
            kVar.d(view.getRootView());
            return n0VarH;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class f {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class g {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class h {
        public static void a(View view, final m mVar) {
            androidx.collection.X x10 = (androidx.collection.X) view.getTag(R.id.tag_unhandled_key_listeners);
            if (x10 == null) {
                x10 = new androidx.collection.X();
                view.setTag(R.id.tag_unhandled_key_listeners, x10);
            }
            Objects.requireNonNull(mVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.P
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return mVar.a();
                }
            };
            x10.put(mVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, m mVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.X x10 = (androidx.collection.X) view.getTag(R.id.tag_unhandled_key_listeners);
            if (x10 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) x10.get(mVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, D0.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class i {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void e(View view, E0.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class j {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static final class k {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1291f b(View view, C1291f c1291f) {
            ContentInfo contentInfoC = c1291f.f16919a.c();
            Objects.requireNonNull(contentInfoC);
            ContentInfo contentInfoA = androidx.compose.ui.contentcapture.h.a(contentInfoC);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoA ? c1291f : new C1291f(new C1291f.d(contentInfoPerformReceiveContent));
        }

        public static void c(View view, String[] strArr, InterfaceC1310z interfaceC1310z) {
            if (interfaceC1310z == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new l(interfaceC1310z));
            }
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static final class l implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1310z f16873a;

        public l(InterfaceC1310z interfaceC1310z) {
            this.f16873a = interfaceC1310z;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1291f c1291f = new C1291f(new C1291f.d(contentInfo));
            C1291f c1291fA = this.f16873a.a(view, c1291f);
            if (c1291fA == null) {
                return null;
            }
            if (c1291fA == c1291f) {
                return contentInfo;
            }
            ContentInfo contentInfoC = c1291fA.f16919a.c();
            Objects.requireNonNull(contentInfoC);
            return androidx.compose.ui.contentcapture.h.a(contentInfoC);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public interface m {
        boolean a();
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f16874d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f16875a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f16876b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f16877c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((m) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f16875a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewA != null) {
                            return viewA;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    @Deprecated
    public static Z a(View view) {
        if (f16859a == null) {
            f16859a = new WeakHashMap<>();
        }
        Z z10 = f16859a.get(view);
        if (z10 != null) {
            return z10;
        }
        Z z11 = new Z(view);
        f16859a.put(view, z11);
        return z11;
    }

    public static n0 b(View view, n0 n0Var) {
        WindowInsets windowInsetsG = n0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = c.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return n0.h(view, windowInsetsA);
            }
        }
        return n0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = n.f16874d;
        n nVar = (n) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (nVar == null) {
            nVar = new n();
            view.setTag(R.id.tag_unhandled_key_event_manager, nVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = nVar.f16875a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = n.f16874d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (nVar.f16875a == null) {
                            nVar.f16875a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = n.f16874d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                nVar.f16875a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    nVar.f16875a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = nVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (nVar.f16876b == null) {
                    nVar.f16876b = new SparseArray<>();
                }
                nVar.f16876b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (f16861c) {
            return null;
        }
        if (f16860b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16860b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16861c = true;
                return null;
            }
        }
        try {
            Object obj = f16860b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16861c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = h.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C0857j c0857j) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(c0857j) : (String[]) c0857j.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(int i10, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static n0 i(View view, n0 n0Var) {
        WindowInsets windowInsetsG = n0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = c.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return n0.h(view, windowInsetsB);
            }
        }
        return n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1291f j(View view, C1291f c1291f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c1291f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, c1291f);
        }
        InterfaceC1310z interfaceC1310z = (InterfaceC1310z) view.getTag(R.id.tag_on_receive_content_listener);
        A a10 = f16863e;
        if (interfaceC1310z == null) {
            if (view instanceof A) {
                a10 = (A) view;
            }
            return a10.a(c1291f);
        }
        C1291f c1291fA = interfaceC1310z.a(view, c1291f);
        if (c1291fA == null) {
            return null;
        }
        if (view instanceof A) {
            a10 = (A) view;
        }
        return a10.a(c1291fA);
    }

    public static void k(int i10, View view) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((B0.s.a) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void l(View view, B0.s.a aVar, B0.u uVar) {
        C1286a c1286a;
        if (uVar == null) {
            k(aVar.a(), view);
            h(0, view);
            return;
        }
        B0.s.a aVar2 = new B0.s.a(null, aVar.f1429b, null, uVar, aVar.f1430c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            c1286a = null;
        } else {
            c1286a = accessibilityDelegateD instanceof C1286a.C0173a ? ((C1286a.C0173a) accessibilityDelegateD).f16888a : new C1286a(accessibilityDelegateD);
        }
        if (c1286a == null) {
            c1286a = new C1286a();
        }
        n(view, c1286a);
        k(aVar2.a(), view);
        f(view).add(aVar2);
        h(0, view);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void n(View view, C1286a c1286a) {
        if (c1286a == null && (d(view) instanceof C1286a.C0173a)) {
            c1286a = new C1286a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1286a == null ? null : c1286a.getBridge());
    }

    public static void o(View view, CharSequence charSequence) {
        new M(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view, charSequence);
        a aVar = f16864f;
        if (charSequence == null) {
            aVar.f16865b.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f16865b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void p(View view, c0.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new c0.d.a(bVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = c0.c.f16894e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (bVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener aVar = new c0.c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f16865b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f16865b.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z10) {
                        O.h(z10 ? 16 : 32, key);
                        entry.setValue(Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
