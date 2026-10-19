package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1287b;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.ArrayList;

/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p246u0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1287b f8484A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f8485B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f8492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f8493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f8494h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8497l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f8499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f8500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f8502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8503r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8511z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8495i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8496k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8498m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f8504s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f8505t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8506u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8507v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8508w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8509x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8486C = false;

    /* JADX INFO: compiled from: MenuItemImpl.java */
    public class a {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f8499n = fVar;
        this.f8487a = i11;
        this.f8488b = i10;
        this.f8489c = i12;
        this.f8490d = i13;
        this.f8491e = charSequence;
        this.f8510y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // p246u0.b
    public final p246u0.b a(AbstractC1287b abstractC1287b) {
        this.f8511z = null;
        this.f8484A = abstractC1287b;
        this.f8499n.p(true);
        AbstractC1287b abstractC1287b2 = this.f8484A;
        if (abstractC1287b2 != null) {
            abstractC1287b2.h(new a());
        }
        return this;
    }

    @Override // p246u0.b
    public final AbstractC1287b b() {
        return this.f8484A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8510y & 8) == 0) {
            return false;
        }
        if (this.f8511z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8485B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8499n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f8508w && (this.f8506u || this.f8507v)) {
            drawable = drawable.mutate();
            if (this.f8506u) {
                p234t0.a.C0532a.h(drawable, this.f8504s);
            }
            if (this.f8507v) {
                p234t0.a.C0532a.i(drawable, this.f8505t);
            }
            this.f8508w = false;
        }
        return drawable;
    }

    public final boolean e() {
        AbstractC1287b abstractC1287b;
        if ((this.f8510y & 8) == 0) {
            return false;
        }
        if (this.f8511z == null && (abstractC1287b = this.f8484A) != null) {
            this.f8511z = abstractC1287b.d(this);
        }
        return this.f8511z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8485B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8499n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f8509x & 32) == 32;
    }

    public final void g(boolean z10) {
        this.f8509x = (z10 ? 4 : 0) | (this.f8509x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8511z;
        if (view != null) {
            return view;
        }
        AbstractC1287b abstractC1287b = this.f8484A;
        if (abstractC1287b == null) {
            return null;
        }
        View viewD = abstractC1287b.d(this);
        this.f8511z = viewD;
        return viewD;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8496k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8502q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8488b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8497l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f8498m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableE = v.e(this.f8499n.f8458a, i10);
        this.f8498m = 0;
        this.f8497l = drawableE;
        return d(drawableE);
    }

    @Override // p246u0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8504s;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8505t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8493g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f8487a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8495i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8494h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8489c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8500o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f8491e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8492f;
        return charSequence != null ? charSequence : this.f8491e;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8503r;
    }

    public final void h(boolean z10) {
        if (z10) {
            this.f8509x |= 32;
        } else {
            this.f8509x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8500o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8486C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8509x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8509x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8509x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC1287b abstractC1287b = this.f8484A;
        if (abstractC1287b == null || !abstractC1287b.g()) {
            return (this.f8509x & 8) == 0;
        }
        return (this.f8509x & 8) == 0 && this.f8484A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f8511z = view;
        this.f8484A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f8487a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f8499n;
        fVar.f8467k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f8509x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f8509x = i11;
        if (i10 != i11) {
            this.f8499n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f8509x;
        if ((i10 & 4) != 0) {
            f fVar = this.f8499n;
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f8463f;
            int size = arrayList.size();
            fVar.w();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = arrayList.get(i11);
                if (hVar.f8488b == this.f8488b && (hVar.f8509x & 4) != 0 && hVar.isCheckable()) {
                    boolean z11 = hVar == this;
                    int i12 = hVar.f8509x;
                    int i13 = (z11 ? 2 : 0) | (i12 & (-3));
                    hVar.f8509x = i13;
                    if (i12 != i13) {
                        hVar.f8499n.p(false);
                    }
                }
            }
            fVar.v();
        } else {
            int i14 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f8509x = i14;
            if (i10 != i14) {
                this.f8499n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f8509x |= 16;
        } else {
            this.f8509x &= -17;
        }
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8498m = 0;
        this.f8497l = drawable;
        this.f8508w = true;
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8504s = colorStateList;
        this.f8506u = true;
        this.f8508w = true;
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8505t = mode;
        this.f8507v = true;
        this.f8508w = true;
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8493g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f8494h == c10) {
            return this;
        }
        this.f8494h = c10;
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8485B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8501p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f8494h = c10;
        this.j = Character.toLowerCase(c11);
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8510y = i10;
        f fVar = this.f8499n;
        fVar.f8467k = true;
        fVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8491e = charSequence;
        this.f8499n.p(false);
        m mVar = this.f8500o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8492f = charSequence;
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f8509x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f8509x = i11;
        if (i10 != i11) {
            f fVar = this.f8499n;
            fVar.f8465h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8491e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final p246u0.b setContentDescription(CharSequence charSequence) {
        this.f8502q = charSequence;
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final p246u0.b setTooltipText(CharSequence charSequence) {
        this.f8503r = charSequence;
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.j == c10 && this.f8496k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f8496k = KeyEvent.normalizeMetaState(i10);
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f8494h == c10 && this.f8495i == i10) {
            return this;
        }
        this.f8494h = c10;
        this.f8495i = KeyEvent.normalizeMetaState(i10);
        this.f8499n.p(false);
        return this;
    }

    @Override // p246u0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f8494h = c10;
        this.f8495i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c11);
        this.f8496k = KeyEvent.normalizeMetaState(i11);
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f8497l = null;
        this.f8498m = i10;
        this.f8508w = true;
        this.f8499n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f8499n.f8458a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f8499n.f8458a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f8511z = viewInflate;
        this.f8484A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f8487a) > 0) {
            viewInflate.setId(i11);
        }
        f fVar = this.f8499n;
        fVar.f8467k = true;
        fVar.p(true);
        return this;
    }
}
