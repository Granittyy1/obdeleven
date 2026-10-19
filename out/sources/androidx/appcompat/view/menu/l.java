package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.L;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p150m.d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f8525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f8526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f8530i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i.a f8532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f8533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f8534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.a f8535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f8536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8539s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8541u;
    public final a j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f8531k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8540t = 0;

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.b()) {
                L l10 = lVar.f8530i;
                if (l10.f8745z) {
                    return;
                }
                View view = lVar.f8534n;
                if (view == null || !view.isShown()) {
                    lVar.dismiss();
                } else {
                    l10.a();
                }
            }
        }
    }

    public l(int i10, Context context, View view, f fVar, boolean z10) {
        this.f8524c = context;
        this.f8525d = fVar;
        this.f8527f = z10;
        this.f8526e = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f8529h = i10;
        Resources resources = context.getResources();
        this.f8528g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8533m = view;
        this.f8530i = new L(context, null, i10);
        fVar.b(this, context);
    }

    @Override // p150m.f
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.f8537q || (view = this.f8533m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f8534n = view;
        L l10 = this.f8530i;
        l10.f8721A.setOnDismissListener(this);
        l10.f8736q = this;
        l10.f8745z = true;
        l10.f8721A.setFocusable(true);
        View view2 = this.f8534n;
        boolean z10 = this.f8536p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8536p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.f8531k);
        l10.f8735p = view2;
        l10.f8732m = this.f8540t;
        boolean z11 = this.f8538r;
        Context context = this.f8524c;
        e eVar = this.f8526e;
        if (!z11) {
            this.f8539s = p150m.d.o(eVar, context, this.f8528g);
            this.f8538r = true;
        }
        l10.r(this.f8539s);
        l10.f8721A.setInputMethodMode(2);
        Rect rect = this.f44547b;
        l10.f8744y = rect != null ? new Rect(rect) : null;
        l10.a();
        E e10 = l10.f8724d;
        e10.setOnKeyListener(this);
        if (this.f8541u) {
            f fVar = this.f8525d;
            if (fVar.f8469m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) e10, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.f8469m);
                }
                frameLayout.setEnabled(false);
                e10.addHeaderView(frameLayout, null, false);
            }
        }
        l10.p(eVar);
        l10.a();
    }

    @Override // p150m.f
    public final boolean b() {
        return !this.f8537q && this.f8530i.f8721A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        if (fVar != this.f8525d) {
            return;
        }
        dismiss();
        j.a aVar = this.f8535o;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
        return false;
    }

    @Override // p150m.f
    public final void dismiss() {
        if (b()) {
            this.f8530i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(j.a aVar) {
        this.f8535o = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i() {
        this.f8538r = false;
        e eVar = this.f8526e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // p150m.f
    public final E j() {
        return this.f8530i.f8724d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            View view = this.f8534n;
            i iVar = new i(this.f8529h, this.f8524c, view, mVar, this.f8527f);
            j.a aVar = this.f8535o;
            iVar.f8520h = aVar;
            p150m.d dVar = iVar.f8521i;
            if (dVar != null) {
                dVar.e(aVar);
            }
            boolean zW = p150m.d.w(mVar);
            iVar.f8519g = zW;
            p150m.d dVar2 = iVar.f8521i;
            if (dVar2 != null) {
                dVar2.q(zW);
            }
            iVar.j = this.f8532l;
            this.f8532l = null;
            this.f8525d.c(false);
            L l10 = this.f8530i;
            int width = l10.f8727g;
            int iN = l10.n();
            if ((Gravity.getAbsoluteGravity(this.f8540t, this.f8533m.getLayoutDirection()) & 7) == 5) {
                width += this.f8533m.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f8517e != null) {
                    iVar.d(width, iN, true, true);
                }
            }
            j.a aVar2 = this.f8535o;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8537q = true;
        this.f8525d.c(true);
        ViewTreeObserver viewTreeObserver = this.f8536p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8536p = this.f8534n.getViewTreeObserver();
            }
            this.f8536p.removeGlobalOnLayoutListener(this.j);
            this.f8536p = null;
        }
        this.f8534n.removeOnAttachStateChangeListener(this.f8531k);
        i.a aVar = this.f8532l;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p150m.d
    public final void p(View view) {
        this.f8533m = view;
    }

    @Override // p150m.d
    public final void q(boolean z10) {
        this.f8526e.f8453d = z10;
    }

    @Override // p150m.d
    public final void r(int i10) {
        this.f8540t = i10;
    }

    @Override // p150m.d
    public final void s(int i10) {
        this.f8530i.f8727g = i10;
    }

    @Override // p150m.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f8532l = (i.a) onDismissListener;
    }

    @Override // p150m.d
    public final void u(boolean z10) {
        this.f8541u = z10;
    }

    @Override // p150m.d
    public final void v(int i10) {
        this.f8530i.k(i10);
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.f8536p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.f8536p = view.getViewTreeObserver();
                }
                lVar.f8536p.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Parcelable parcelable) {
    }

    @Override // p150m.d
    public final void n(f fVar) {
    }
}
