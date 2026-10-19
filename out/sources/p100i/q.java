package p100i;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p100i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f36404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f36405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f36406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<i.a.b> f36410g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f36411h = new a();

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q qVar = q.this;
            Window.Callback callback = qVar.f36405b;
            Menu menuV = qVar.v();
            f fVar = menuV instanceof f ? (f) menuV : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                menuV.clear();
                if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                    menuV.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.v();
                }
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class c implements j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f36414b;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(f fVar, boolean z10) {
            if (this.f36414b) {
                return;
            }
            this.f36414b = true;
            q qVar = q.this;
            qVar.f36404a.h();
            qVar.f36405b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            this.f36414b = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(f fVar) {
            q.this.f36405b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            q qVar = q.this;
            boolean zIsOverflowMenuShowing = qVar.f36404a.f8963a.isOverflowMenuShowing();
            Window.Callback callback = qVar.f36405b;
            if (zIsOverflowMenuShowing) {
                callback.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class e {
        public e() {
        }
    }

    public q(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        h0 h0Var = new h0(toolbar, false);
        this.f36404a = h0Var;
        callback.getClass();
        this.f36405b = callback;
        h0Var.f8972k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        h0Var.setWindowTitle(charSequence);
        this.f36406c = new e();
    }

    @Override // p100i.a
    public final boolean a() {
        return this.f36404a.f8963a.hideOverflowMenu();
    }

    @Override // p100i.a
    public final boolean b() {
        h0 h0Var = this.f36404a;
        if (!h0Var.f8963a.hasExpandedActionView()) {
            return false;
        }
        h0Var.collapseActionView();
        return true;
    }

    @Override // p100i.a
    public final void c(boolean z10) {
        if (z10 == this.f36409f) {
            return;
        }
        this.f36409f = z10;
        ArrayList<i.a.b> arrayList = this.f36410g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // p100i.a
    public final int d() {
        return this.f36404a.f8964b;
    }

    @Override // p100i.a
    public final Context e() {
        return this.f36404a.f8963a.getContext();
    }

    @Override // p100i.a
    public final boolean f() {
        h0 h0Var = this.f36404a;
        Toolbar toolbar = h0Var.f8963a;
        a aVar = this.f36411h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = h0Var.f8963a;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // p100i.a
    public final void h() {
        this.f36404a.f8963a.removeCallbacks(this.f36411h);
    }

    @Override // p100i.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i10, keyEvent, 0);
    }

    @Override // p100i.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // p100i.a
    public final boolean k() {
        return this.f36404a.f8963a.showOverflowMenu();
    }

    @Override // p100i.a
    public final void m(boolean z10) {
        w(4, 4);
    }

    @Override // p100i.a
    public final void n() {
        w(2, 2);
    }

    @Override // p100i.a
    public final void o() {
        w(8, 8);
    }

    @Override // p100i.a
    public final void p(int i10) {
        this.f36404a.o(i10);
    }

    @Override // p100i.a
    public final void q(p125k.b bVar) {
        this.f36404a.p(bVar);
    }

    @Override // p100i.a
    public final void s(String str) {
        this.f36404a.setTitle(str);
    }

    @Override // p100i.a
    public final void t(CharSequence charSequence) {
        this.f36404a.setWindowTitle(charSequence);
    }

    public final Menu v() {
        boolean z10 = this.f36408e;
        h0 h0Var = this.f36404a;
        if (!z10) {
            h0Var.f8963a.setMenuCallbacks(new c(), new d());
            this.f36408e = true;
        }
        return h0Var.f8963a.getMenu();
    }

    public final void w(int i10, int i11) {
        h0 h0Var = this.f36404a;
        h0Var.j((i10 & i11) | ((~i11) & h0Var.f8964b));
    }

    @Override // p100i.a
    public final void g() {
    }

    @Override // p100i.a
    public final void l(boolean z10) {
    }

    @Override // p100i.a
    public final void r(boolean z10) {
    }
}
