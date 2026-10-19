package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import p191p5.B;

/* JADX INFO: compiled from: InAppReviewProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements J8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.d f30263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.grid.x f30265c;

    public j(J8.d dVar, J8.p pVar) {
        this.f30263a = dVar;
        this.f30264b = pVar;
        Context context = dVar.getContext();
        Context applicationContext = context.getApplicationContext();
        this.f30265c = new androidx.compose.foundation.lazy.grid.x(new p045d6.g(applicationContext != null ? applicationContext : context));
    }

    @Override // J8.k
    public final void a() {
        try {
            B b10 = this.f30265c.b();
            kotlin.jvm.internal.i.d(b10, "requestReviewFlow(...)");
            b10.c(new I4.r(this));
        } catch (Throwable th) {
            this.f30264b.d(th, false);
        }
    }
}
