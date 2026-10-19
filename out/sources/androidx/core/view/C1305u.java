package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1305u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f16988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f16989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f16990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16992e;

    public C1305u(ViewGroup viewGroup) {
        this.f16990c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentE;
        if (!this.f16991d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return W.a(viewParentE, this.f16990c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (!this.f16991d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return W.b(viewParentE, this.f16990c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f16991d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f16990c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f16992e == null) {
                this.f16992e = new int[2];
            }
            iArr3 = this.f16992e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC1306v) {
            ((InterfaceC1306v) viewParentE).o(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                W.c(viewParentE, viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f16991d || (viewParentE = e(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f16990c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f16992e == null) {
                this.f16992e = new int[2];
            }
            int[] iArr4 = this.f16992e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC1307w) {
            ((InterfaceC1307w) viewParentE).k(viewGroup, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (viewParentE instanceof InterfaceC1306v) {
                ((InterfaceC1306v) viewParentE).l(viewGroup, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    W.d(viewParentE, viewGroup, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f16988a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f16989b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zF;
        if (f(i11)) {
            return true;
        }
        if (this.f16991d) {
            ViewGroup viewGroup = this.f16990c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof InterfaceC1306v;
                if (z10) {
                    zF = ((InterfaceC1306v) parent).m(view, viewGroup, i10, i11);
                } else if (i11 == 0) {
                    try {
                        zF = W.f(parent, view, viewGroup, i10);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i11 == 0) {
                        this.f16988a = parent;
                    } else if (i11 == 1) {
                        this.f16989b = parent;
                    }
                    if (z10) {
                        ((InterfaceC1306v) parent).n(view, viewGroup, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            W.e(parent, view, viewGroup, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof InterfaceC1306v;
            ViewGroup viewGroup = this.f16990c;
            if (z10) {
                ((InterfaceC1306v) viewParentE).j(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    W.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f16988a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f16989b = null;
            }
        }
    }
}
