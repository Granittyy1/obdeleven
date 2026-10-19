package K5;

import android.view.SubMenu;

/* JADX INFO: compiled from: NavigationMenu.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends androidx.appcompat.view.menu.f {
    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.h hVarA = a(i10, i11, i12, charSequence);
        i iVar = new i(this.f8458a, this, hVarA);
        hVarA.f8500o = iVar;
        iVar.setHeaderTitle(hVarA.f8491e);
        return iVar;
    }
}
