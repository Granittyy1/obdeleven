package p150m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.X;
import p246u0.a;
import p246u0.b;
import p246u0.c;

/* JADX INFO: compiled from: MenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f44548d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f44548d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f44548d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f44548d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f44548d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        X<b, MenuItem> x10 = this.f44535b;
        if (x10 != null) {
            x10.clear();
        }
        X<c, SubMenu> x11 = this.f44536c;
        if (x11 != null) {
            x11.clear();
        }
        this.f44548d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f44548d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(this.f44548d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(this.f44548d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f44548d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f44548d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f44548d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f44548d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f44535b != null) {
            int i11 = 0;
            while (true) {
                X<b, MenuItem> x10 = this.f44535b;
                if (i11 >= x10.f9139d) {
                    break;
                }
                if (x10.h(i11).getGroupId() == i10) {
                    this.f44535b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f44548d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f44535b != null) {
            int i11 = 0;
            while (true) {
                X<b, MenuItem> x10 = this.f44535b;
                if (i11 >= x10.f9139d) {
                    break;
                }
                if (x10.h(i11).getItemId() == i10) {
                    this.f44535b.k(i11);
                    break;
                }
                i11++;
            }
        }
        this.f44548d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f44548d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f44548d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f44548d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f44548d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f44548d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(this.f44548d.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return d(this.f44548d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f44548d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f44548d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f44548d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f44548d.addSubMenu(i10, i11, i12, i13));
    }
}
