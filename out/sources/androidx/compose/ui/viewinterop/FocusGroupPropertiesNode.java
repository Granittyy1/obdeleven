package androidx.compose.ui.viewinterop;

import C.e;
import Ia.l;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.C;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC1124f;
import androidx.compose.ui.focus.p;
import androidx.compose.ui.focus.q;
import androidx.compose.ui.focus.s;
import androidx.compose.ui.h;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1186g;
import androidx.compose.ui.node.U;
import p293xa.r;

/* JADX INFO: compiled from: FocusGroupNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusGroupPropertiesNode extends h.c implements s, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f15767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f15768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l<InterfaceC1124f, r> f15769r = new l<InterfaceC1124f, r>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // Ia.l
        public final r invoke(InterfaceC1124f interfaceC1124f) {
            InterfaceC1124f interfaceC1124f2 = interfaceC1124f;
            View viewC = b.c(this.this$0);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!e.m(viewC, e.n(interfaceC1124f2.a()), b.b(C1185f.g(this.this$0).getFocusOwner(), C1186g.a(this.this$0), viewC))) {
                    interfaceC1124f2.b();
                }
            }
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l<InterfaceC1124f, r> f15770s = new l<InterfaceC1124f, r>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // Ia.l
        public final r invoke(InterfaceC1124f interfaceC1124f) {
            InterfaceC1124f interfaceC1124f2 = interfaceC1124f;
            View viewC = b.c(this.this$0);
            if (viewC.hasFocus()) {
                p focusOwner = C1185f.g(this.this$0).getFocusOwner();
                View viewA = C1186g.a(this.this$0);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = b.b(focusOwner, viewA, viewC);
                    Integer numN = e.n(interfaceC1124f2.a());
                    int iIntValue = numN != null ? numN.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = this.this$0.f15767p;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && b.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        interfaceC1124f2.b();
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
            return r.f47939a;
        }
    };

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        ViewTreeObserver viewTreeObserver = C1186g.a(this).getViewTreeObserver();
        this.f15768q = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        ViewTreeObserver viewTreeObserver = this.f15768q;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f15768q = null;
        C1186g.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f15767p = null;
    }

    public final FocusTargetNode Q1() {
        if (!this.f13985b.f13997o) {
            R.a.b("visitLocalDescendants called on an unattached node");
        }
        h.c cVar = this.f13985b;
        if ((cVar.f13988e & 1024) != 0) {
            boolean z10 = false;
            for (h.c cVar2 = cVar.f13990g; cVar2 != null; cVar2 = cVar2.f13990g) {
                if ((cVar2.f13987d & 1024) != 0) {
                    h.c cVarB = cVar2;
                    androidx.compose.runtime.collection.c cVar3 = null;
                    while (cVarB != null) {
                        if (cVarB instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                            int i10 = 0;
                            for (h.c cVar4 = ((AbstractC1187h) cVarB).f14585q; cVar4 != null; cVar4 = cVar4.f13990g) {
                                if ((cVar4.f13987d & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar4;
                                    } else {
                                        if (cVar3 == null) {
                                            cVar3 = new androidx.compose.runtime.collection.c(new h.c[16]);
                                        }
                                        if (cVarB != null) {
                                            cVar3.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar3.b(cVar4);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = C1185f.b(cVar3);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.ui.focus.s
    public final void g0(q qVar) {
        qVar.c(false);
        qVar.d(this.f15769r);
        qVar.a(this.f15770s);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (C1185f.f(this).f14412o == null) {
            return;
        }
        View viewC = b.c(this);
        p focusOwner = C1185f.g(this).getFocusOwner();
        U uG = C1185f.g(this);
        boolean z10 = (view == null || view.equals(uG) || !b.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(uG) || !b.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f15767p = view2;
            return;
        }
        if (z11) {
            this.f15767p = view2;
            FocusTargetNode focusTargetNodeQ1 = Q1();
            if (focusTargetNodeQ1.c0().a()) {
                return;
            }
            C.e(focusTargetNodeQ1);
            return;
        }
        if (!z10) {
            this.f15767p = null;
            return;
        }
        this.f15767p = null;
        if (Q1().c0().b()) {
            focusOwner.m(8, false, false);
        }
    }
}
