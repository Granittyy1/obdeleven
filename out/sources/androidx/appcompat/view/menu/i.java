package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f8517e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j.a f8520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p150m.d f8521i;
    public PopupWindow.OnDismissListener j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8518f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f8522k = new a();

    /* JADX INFO: compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i10, Context context, View view, f fVar, boolean z10) {
        this.f8513a = context;
        this.f8514b = fVar;
        this.f8517e = view;
        this.f8515c = z10;
        this.f8516d = i10;
    }

    public final p150m.d a() {
        p150m.d lVar;
        if (this.f8521i == null) {
            Context context = this.f8513a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new b(context, this.f8517e, this.f8516d, this.f8515c);
            } else {
                View view = this.f8517e;
                Context context2 = this.f8513a;
                boolean z10 = this.f8515c;
                lVar = new l(this.f8516d, context2, view, this.f8514b, z10);
            }
            lVar.n(this.f8514b);
            lVar.t(this.f8522k);
            lVar.p(this.f8517e);
            lVar.e(this.f8520h);
            lVar.q(this.f8519g);
            lVar.r(this.f8518f);
            this.f8521i = lVar;
        }
        return this.f8521i;
    }

    public final boolean b() {
        p150m.d dVar = this.f8521i;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f8521i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        p150m.d dVarA = a();
        dVarA.u(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f8518f, this.f8517e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f8517e.getWidth();
            }
            dVarA.s(i10);
            dVarA.v(i11);
            int i12 = (int) ((this.f8513a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarA.f44547b = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        dVarA.a();
    }
}
