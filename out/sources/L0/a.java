package L0;

import B0.s;
import B0.t;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.Y;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.support.BrazeLogger;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ExploreByTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C1286a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Rect f4383k = new Rect(BrazeLogger.SUPPRESS, BrazeLogger.SUPPRESS, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0063a f4384l = new C0063a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f4385m = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccessibilityManager f4390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Chip f4391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f4392g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f4386a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f4387b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f4388c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f4389d = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4393h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4394i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: L0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class C0063a {
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class b {
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class c extends t {
        public c() {
        }

        @Override // B0.t
        public final s b(int i10) {
            return new s(AccessibilityNodeInfo.obtain(a.this.e(i10).f1411a));
        }

        @Override // B0.t
        public final s c(int i10) {
            a aVar = a.this;
            int i11 = i10 == 2 ? aVar.f4393h : aVar.f4394i;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x004e  */
        @Override // B0.t
        public final boolean d(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            Chip chip = aVar.f4391f;
            if (i10 == -1) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                return chip.performAccessibilityAction(i11, bundle);
            }
            boolean z10 = true;
            if (i11 == 1) {
                return aVar.g(i10);
            }
            if (i11 == 2) {
                return aVar.a(i10);
            }
            boolean z11 = false;
            if (i11 == 64) {
                AccessibilityManager accessibilityManager = aVar.f4390e;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = aVar.f4393h) != i10) {
                    if (i12 != Integer.MIN_VALUE) {
                        aVar.f4393h = Integer.MIN_VALUE;
                        aVar.f4391f.invalidate();
                        aVar.h(i12, 65536);
                    }
                    aVar.f4393h = i10;
                    chip.invalidate();
                    aVar.h(i10, 32768);
                } else {
                    z10 = false;
                }
            } else {
                if (i11 != 128) {
                    Chip.b bVar = (Chip.b) aVar;
                    if (i11 != 16) {
                        return false;
                    }
                    Chip chip2 = Chip.this;
                    if (i10 == 0) {
                        return chip2.performClick();
                    }
                    if (i10 != 1) {
                        return false;
                    }
                    chip2.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip2.f26930i;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip2);
                        z11 = true;
                    }
                    if (!chip2.f26940t) {
                        return z11;
                    }
                    chip2.f26939s.h(1, 1);
                    return z11;
                }
                if (aVar.f4393h == i10) {
                    aVar.f4393h = Integer.MIN_VALUE;
                    chip.invalidate();
                    aVar.h(i10, 65536);
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public a(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f4391f = chip;
        this.f4390e = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    public final boolean a(int i10) {
        if (this.f4394i != i10) {
            return false;
        }
        this.f4394i = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f26934n = false;
            chip.refreshDrawableState();
        }
        h(i10, 8);
        return true;
    }

    public final s b(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        s sVar = new s(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        sVar.i("android.view.View");
        Rect rect = f4383k;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        sVar.h(rect);
        sVar.f1412b = -1;
        Chip chip = this.f4391f;
        accessibilityNodeInfoObtain.setParent(chip);
        f(i10, sVar);
        if (sVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4387b;
        sVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        sVar.f1413c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.f4393h == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            sVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            sVar.a(64);
        }
        boolean z10 = this.f4394i == i10;
        if (z10) {
            sVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            sVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        int[] iArr = this.f4389d;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f4386a;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            sVar.f(rect3);
            if (sVar.f1412b != -1) {
                s sVar2 = new s(AccessibilityNodeInfo.obtain());
                for (int i11 = sVar.f1412b; i11 != -1; i11 = sVar2.f1412b) {
                    sVar2.f1412b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = sVar2.f1411a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    f(i11, sVar2);
                    sVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f4388c;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                sVar.h(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        sVar.f1411a.setVisibleToUser(true);
                    }
                }
            }
        }
        return sVar;
    }

    public abstract void c(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:117:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x01aa  */
    public final boolean d(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        s sVar;
        int i13;
        Rect rect2;
        int iF;
        Rect rect3;
        int i14;
        s sVar2;
        int i15;
        int iD;
        int iE;
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        Y y10 = new Y();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            y10.e(((Integer) arrayList.get(i16)).intValue(), b(((Integer) arrayList.get(i16)).intValue()));
        }
        int i17 = this.f4394i;
        int iD2 = Integer.MIN_VALUE;
        s sVar3 = i17 == Integer.MIN_VALUE ? null : (s) y10.c(i17);
        C0063a c0063a = f4384l;
        b bVar = f4385m;
        Chip chip = this.f4391f;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            i12 = -1;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            boolean z10 = chip.getLayoutDirection() == 1;
            bVar.getClass();
            int iF2 = y10.f();
            ArrayList arrayList2 = new ArrayList(iF2);
            for (int i18 = 0; i18 < iF2; i18++) {
                arrayList2.add((s) y10.g(i18));
            }
            Collections.sort(arrayList2, new L0.b.a(z10, c0063a));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (sVar3 != null) {
                    size = arrayList2.indexOf(sVar3);
                }
                int i19 = size - 1;
                if (i19 >= 0) {
                    obj = arrayList2.get(i19);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (sVar3 == null ? -1 : arrayList2.lastIndexOf(sVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            sVar = (s) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i20 = this.f4394i;
            if (i20 != Integer.MIN_VALUE) {
                e(i20).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i10 == 17) {
                        i12 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i12 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i12 = -1;
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i12 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i10 != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i10 != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                bVar.getClass();
                iF = y10.f();
                rect3 = new Rect();
                sVar = null;
                for (i14 = i11; i14 < iF; i14++) {
                    sVar2 = (s) y10.g(i14);
                    if (sVar2 == sVar3) {
                        c0063a.getClass();
                        sVar2.f(rect3);
                        if (L0.b.c(i10, rect4, rect3)) {
                            if (L0.b.c(i10, rect4, rect2) || L0.b.a(i10, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                sVar = sVar2;
                            } else if (L0.b.a(i10, rect4, rect2, rect3)) {
                                int iD3 = L0.b.d(i10, rect4, rect3);
                                int iE2 = L0.b.e(i10, rect4, rect3);
                                i15 = (iE2 * iE2) + (iD3 * 13 * iD3);
                                iD = L0.b.d(i10, rect4, rect2);
                                iE = L0.b.e(i10, rect4, rect2);
                                if (i15 < (iE * iE) + (iD * 13 * iD)) {
                                    rect2.set(rect3);
                                    sVar = sVar2;
                                }
                            }
                        }
                    }
                }
            }
            i12 = -1;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i10 != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i10 != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            bVar.getClass();
            iF = y10.f();
            rect3 = new Rect();
            sVar = null;
            while (i14 < iF) {
                sVar2 = (s) y10.g(i14);
                if (sVar2 == sVar3) {
                    c0063a.getClass();
                    sVar2.f(rect3);
                    if (L0.b.c(i10, rect4, rect3)) {
                        if (L0.b.c(i10, rect4, rect2)) {
                            rect2.set(rect3);
                            sVar = sVar2;
                        } else if (L0.b.a(i10, rect4, rect2, rect3)) {
                            int iD4 = L0.b.d(i10, rect4, rect3);
                            int iE3 = L0.b.e(i10, rect4, rect3);
                            i15 = (iE3 * iE3) + (iD4 * 13 * iD4);
                            iD = L0.b.d(i10, rect4, rect2);
                            iE = L0.b.e(i10, rect4, rect2);
                            if (i15 < (iE * iE) + (iD * 13 * iD)) {
                                rect2.set(rect3);
                                sVar = sVar2;
                            }
                        }
                    }
                }
            }
        }
        s sVar4 = sVar;
        if (sVar4 != null) {
            if (y10.f9140b) {
                androidx.collection.Z.a(y10);
            }
            int i21 = y10.f9143e;
            int i22 = i11;
            while (true) {
                if (i22 >= i21) {
                    i13 = i12;
                    break;
                }
                if (y10.f9142d[i22] == sVar4) {
                    i13 = i22;
                    break;
                }
                i22++;
            }
            iD2 = y10.d(i13);
        }
        return g(iD2);
    }

    public final s e(int i10) {
        if (i10 != -1) {
            return b(i10);
        }
        Chip chip = this.f4391f;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        s sVar = new s(accessibilityNodeInfoObtain);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sVar.f1411a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return sVar;
    }

    public abstract void f(int i10, s sVar);

    public final boolean g(int i10) {
        int i11;
        Chip chip = this.f4391f;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.f4394i) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            a(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4394i = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip2 = Chip.this;
            chip2.f26934n = true;
            chip2.refreshDrawableState();
        }
        h(i10, 8);
        return true;
    }

    @Override // androidx.core.view.C1286a
    public final t getAccessibilityNodeProvider(View view) {
        if (this.f4392g == null) {
            this.f4392g = new c();
        }
        return this.f4392g;
    }

    public final void h(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f4390e.isEnabled() || (parent = (view = this.f4391f).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            s sVarE = e(i10);
            accessibilityEventObtain.getText().add(sVarE.g());
            AccessibilityNodeInfo accessibilityNodeInfo = sVarE.f1411a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        Chip chip = Chip.this;
        sVar.f1411a.setCheckable(chip.e());
        sVar.j(chip.isClickable());
        sVar.i(chip.getAccessibilityClassName());
        sVar.o(chip.getText());
    }
}
