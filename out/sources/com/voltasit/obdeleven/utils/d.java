package com.voltasit.obdeleven.utils;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: HelpGroupHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFragment f34392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f34393b;

    public d(BaseFragment baseFragment) {
        this.f34392a = baseFragment;
        if (baseFragment.getClass().isAnnotationPresent(O8.b.class)) {
            baseFragment.setHasOptionsMenu(true);
            baseFragment.setMenuVisibility(true);
        }
    }

    public static MenuItem a(Menu menu, ArrayList arrayList) {
        MenuItem menuItem = null;
        for (int i10 = 0; i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.getSubMenu() != null) {
                a(item.getSubMenu(), arrayList);
            }
            if (item.getItemId() == 78) {
                arrayList.add(item);
            } else if (item.getItemId() == 77) {
                menuItem = item;
            }
        }
        return menuItem;
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        BaseFragment baseFragment = this.f34392a;
        sb2.append(baseFragment.u());
        sb2.append(" ");
        sb2.append(baseFragment.getString(R.string.common_help));
        return sb2.toString();
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 78 || !b().contentEquals(menuItem.getTitle())) {
            return false;
        }
        BaseFragment baseFragment = this.f34392a;
        if (!baseFragment.getClass().isAnnotationPresent(O8.b.class)) {
            return false;
        }
        baseFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((O8.b) baseFragment.getClass().getAnnotation(O8.b.class)).value())));
        UserTrackingUtils.c(UserTrackingUtils.Key.f34255P, 1);
        return false;
    }
}
