package p100i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: compiled from: ActionBar.java */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n();

    public abstract void o();

    public abstract void p(int i10);

    public abstract void q(p125k.b bVar);

    public abstract void r(boolean z10);

    public abstract void s(String str);

    public abstract void t(CharSequence charSequence);

    public p138l.a u(g.d dVar) {
        return null;
    }

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBar.java */
    public static class C0378a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36271a;

        public C0378a(C0378a c0378a) {
            super((ViewGroup.MarginLayoutParams) c0378a);
            this.f36271a = 0;
            this.f36271a = c0378a.f36271a;
        }

        public C0378a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36271a = 0;
        }
    }

    public void h() {
    }
}
