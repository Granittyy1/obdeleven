package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: MenuPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public final class L extends J implements K {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Method f8751E;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public androidx.appcompat.view.menu.b.c f8752D;

    /* JADX INFO: compiled from: MenuPopupWindow.java */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: compiled from: MenuPopupWindow.java */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* JADX INFO: compiled from: MenuPopupWindow.java */
    public static class c extends E {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f8753n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f8754o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public K f8755p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f8756q;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f8753n = 21;
                this.f8754o = 22;
            } else {
                this.f8753n = 22;
                this.f8754o = 21;
            }
        }

        @Override // androidx.appcompat.widget.E, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f8755p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= eVar.getCount()) ? null : eVar.getItem(i10);
                androidx.appcompat.view.menu.h hVar = this.f8756q;
                if (hVar != item) {
                    androidx.appcompat.view.menu.f fVar = eVar.f8451b;
                    if (hVar != null) {
                        this.f8755p.o(fVar, hVar);
                    }
                    this.f8756q = item;
                    if (item != null) {
                        this.f8755p.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f8753n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f8754o) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) adapter).f8451b.c(false);
            return true;
        }

        public void setHoverListener(K k10) {
            this.f8755p = k10;
        }

        @Override // androidx.appcompat.widget.E, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8751E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // androidx.appcompat.widget.K
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        androidx.appcompat.view.menu.b.c cVar = this.f8752D;
        if (cVar != null) {
            cVar.d(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.K
    public final void o(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        androidx.appcompat.view.menu.b.c cVar = this.f8752D;
        if (cVar != null) {
            cVar.o(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.J
    public final E q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
