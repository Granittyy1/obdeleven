package p150m;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1287b;
import p246u0.b;

/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f44519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f44520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f44521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f44522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f44524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f44526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f44527i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f44528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f44529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f44530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44533p;

    @Override // p246u0.b
    public final b a(AbstractC1287b abstractC1287b) {
        throw new UnsupportedOperationException();
    }

    @Override // p246u0.b
    public final AbstractC1287b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f44526h;
        if (drawable != null) {
            if (this.f44531n || this.f44532o) {
                this.f44526h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f44526h = drawableMutate;
                if (this.f44531n) {
                    p234t0.a.C0532a.h(drawableMutate, this.f44529l);
                }
                if (this.f44532o) {
                    p234t0.a.C0532a.i(this.f44526h, this.f44530m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f44525g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f44524f;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f44526h;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f44529l;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f44530m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f44521c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f44523e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f44522d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f44519a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f44520b;
        return charSequence != null ? charSequence : this.f44519a;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f44528k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f44533p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f44533p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f44533p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f44533p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f44524f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f44533p = (z10 ? 1 : 0) | (this.f44533p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f44533p = (z10 ? 2 : 0) | (this.f44533p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f44533p = (z10 ? 16 : 0) | (this.f44533p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f44526h = drawable;
        c();
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f44529l = colorStateList;
        this.f44531n = true;
        c();
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f44530m = mode;
        this.f44532o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f44521c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f44522d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f44522d = c10;
        this.f44524f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f44519a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f44520b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f44528k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f44533p = (this.f44533p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f44524f = Character.toLowerCase(c10);
        this.f44525g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final b setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f44522d = c10;
        this.f44523e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f44519a = this.f44527i.getResources().getString(i10);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final b setTooltipText(CharSequence charSequence) {
        this.f44528k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f44526h = p186p0.a.C0517a.b(this.f44527i, i10);
        c();
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f44522d = c10;
        this.f44523e = KeyEvent.normalizeMetaState(i10);
        this.f44524f = Character.toLowerCase(c11);
        this.f44525g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
