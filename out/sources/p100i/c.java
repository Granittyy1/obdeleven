package p100i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements DrawerLayout.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f36274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p125k.b f36275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36278f = false;

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface a {
        boolean a();

        Context b();

        void c(p125k.b bVar, int i10);

        Drawable d();

        void e(int i10);
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface b {
        a getDrawerToggleDelegate();
    }

    /* JADX INFO: renamed from: i.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public static class C0379c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Toolbar f36279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f36280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f36281c;

        public C0379c(Toolbar toolbar) {
            this.f36279a = toolbar;
            this.f36280b = toolbar.getNavigationIcon();
            this.f36281c = toolbar.getNavigationContentDescription();
        }

        @Override // i.c.a
        public final boolean a() {
            return true;
        }

        @Override // i.c.a
        public final Context b() {
            return this.f36279a.getContext();
        }

        @Override // i.c.a
        public final void c(p125k.b bVar, int i10) {
            this.f36279a.setNavigationIcon(bVar);
            e(i10);
        }

        @Override // i.c.a
        public final Drawable d() {
            return this.f36280b;
        }

        @Override // i.c.a
        public final void e(int i10) {
            Toolbar toolbar = this.f36279a;
            if (i10 == 0) {
                toolbar.setNavigationContentDescription(this.f36281c);
            } else {
                toolbar.setNavigationContentDescription(i10);
            }
        }
    }

    public c(MainActivity mainActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f36273a = new C0379c(toolbar);
            toolbar.setNavigationOnClickListener(new p100i.b(this));
        } else {
            this.f36273a = mainActivity.getDrawerToggleDelegate();
        }
        this.f36274b = drawerLayout;
        this.f36276d = R.string.view_main_navigation_drawer_open;
        this.f36277e = R.string.view_main_navigation_drawer_close;
        this.f36275c = new p125k.b(this.f36273a.b());
        this.f36273a.d();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public final void a(float f10) {
        d(Math.min(1.0f, Math.max(0.0f, f10)));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public final void b(View view) {
        d(1.0f);
        this.f36273a.e(this.f36277e);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public final void c(View view) {
        d(0.0f);
        this.f36273a.e(this.f36276d);
    }

    public final void d(float f10) {
        p125k.b bVar = this.f36275c;
        if (f10 == 1.0f) {
            if (!bVar.f41224i) {
                bVar.f41224i = true;
                bVar.invalidateSelf();
            }
        } else if (f10 == 0.0f && bVar.f41224i) {
            bVar.f41224i = false;
            bVar.invalidateSelf();
        }
        if (bVar.j != f10) {
            bVar.j = f10;
            bVar.invalidateSelf();
        }
    }
}
