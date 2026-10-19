package p150m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.X;
import p246u0.c;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X<p246u0.b, MenuItem> f44535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X<c, SubMenu> f44536c;

    public b(Context context) {
        this.f44534a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof p246u0.b)) {
            return menuItem;
        }
        p246u0.b bVar = (p246u0.b) menuItem;
        if (this.f44535b == null) {
            this.f44535b = new X<>();
        }
        MenuItem menuItem2 = this.f44535b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f44534a, bVar);
        this.f44535b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f44536c == null) {
            this.f44536c = new X<>();
        }
        SubMenu subMenu2 = this.f44536c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f44534a, cVar);
        this.f44536c.put(cVar, gVar);
        return gVar;
    }
}
