package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1286a;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class K extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f19513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19514b;

    /* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends C1286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f19515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakHashMap f19516b = new WeakHashMap();

        public a(K k10) {
            this.f19515a = k10;
        }

        @Override // androidx.core.view.C1286a
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            return c1286a != null ? c1286a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1286a
        public final B0.t getAccessibilityNodeProvider(View view) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            return c1286a != null ? c1286a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            if (c1286a != null) {
                c1286a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
            K k10 = this.f19515a;
            if (!k10.f19513a.Q()) {
                RecyclerView recyclerView = k10.f19513a;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().a0(view, sVar);
                    C1286a c1286a = (C1286a) this.f19516b.get(view);
                    if (c1286a != null) {
                        c1286a.onInitializeAccessibilityNodeInfo(view, sVar);
                        return;
                    } else {
                        super.onInitializeAccessibilityNodeInfo(view, sVar);
                        return;
                    }
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, sVar);
        }

        @Override // androidx.core.view.C1286a
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            if (c1286a != null) {
                c1286a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1286a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1286a c1286a = (C1286a) this.f19516b.get(viewGroup);
            return c1286a != null ? c1286a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1286a
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            K k10 = this.f19515a;
            if (!k10.f19513a.Q()) {
                RecyclerView recyclerView = k10.f19513a;
                if (recyclerView.getLayoutManager() != null) {
                    C1286a c1286a = (C1286a) this.f19516b.get(view);
                    if (c1286a != null) {
                        if (c1286a.performAccessibilityAction(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.performAccessibilityAction(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.s sVar = recyclerView.getLayoutManager().f19682b.f19626d;
                    return false;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }

        @Override // androidx.core.view.C1286a
        public final void sendAccessibilityEvent(View view, int i10) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            if (c1286a != null) {
                c1286a.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.C1286a
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1286a c1286a = (C1286a) this.f19516b.get(view);
            if (c1286a != null) {
                c1286a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public K(RecyclerView recyclerView) {
        this.f19513a = recyclerView;
        a aVar = this.f19514b;
        if (aVar != null) {
            this.f19514b = aVar;
        } else {
            this.f19514b = new a(this);
        }
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f19513a.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Y(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1286a
    public void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        RecyclerView recyclerView = this.f19513a;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f19682b;
        layoutManager.Z(recyclerView2.f19626d, recyclerView2.f19655y0, sVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.core.view.C1286a
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        int iK;
        int I10;
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f19513a;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        RecyclerView.s sVar = layoutManager.f19682b.f19626d;
        int iHeight = layoutManager.f19694o;
        int iWidth = layoutManager.f19693n;
        Rect rect = new Rect();
        if (layoutManager.f19682b.getMatrix().isIdentity() && layoutManager.f19682b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i10 == 4096) {
            iK = layoutManager.f19682b.canScrollVertically(1) ? (iHeight - layoutManager.K()) - layoutManager.H() : 0;
            if (layoutManager.f19682b.canScrollHorizontally(1)) {
                I10 = (iWidth - layoutManager.I()) - layoutManager.J();
            } else {
                I10 = 0;
            }
        } else if (i10 != 8192) {
            iK = 0;
            I10 = 0;
        } else {
            iK = layoutManager.f19682b.canScrollVertically(-1) ? -((iHeight - layoutManager.K()) - layoutManager.H()) : 0;
            if (layoutManager.f19682b.canScrollHorizontally(-1)) {
                I10 = -((iWidth - layoutManager.I()) - layoutManager.J());
            } else {
                I10 = 0;
            }
        }
        if (iK == 0 && I10 == 0) {
            return false;
        }
        layoutManager.f19682b.l0(I10, iK, true);
        return true;
    }
}
