package com.voltasit.obdeleven.presentation.appList;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;

/* JADX INFO: compiled from: AppAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements T3.c<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.b f31312a;

    public b(a.b bVar) {
        this.f31312a = bVar;
    }

    @Override // T3.c
    public final void b(Object obj) {
        ((a.b.ViewOnClickListenerC0328b) this.f31312a).f31306d.setVisibility(8);
    }

    @Override // T3.c
    public final void c(GlideException glideException) {
        ((a.b.ViewOnClickListenerC0328b) this.f31312a).f31306d.setVisibility(8);
    }
}
