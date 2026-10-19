package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class m extends f implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final h f8544A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f8545z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f8545z = fVar;
        this.f8544A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.f8545z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.f8545z.e(fVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.f8545z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f8544A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        h hVar = this.f8544A;
        int i10 = hVar != null ? hVar.f8487a : 0;
        if (i10 == 0) {
            return null;
        }
        return J4.i.b(i10, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.f8545z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.f8545z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.f8545z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.f8545z.o();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f8545z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f8544A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f8545z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f8544A.setIcon(i10);
        return this;
    }
}
