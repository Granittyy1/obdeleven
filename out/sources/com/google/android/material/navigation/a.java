package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;

/* JADX INFO: compiled from: NavigationView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationView f27339b;

    public a(NavigationView navigationView) {
        this.f27339b = navigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        NavigationView.b bVar = this.f27339b.f27325k;
        return bVar != null && bVar.b(menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
    }
}
