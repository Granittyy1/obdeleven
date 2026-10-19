package com.google.accompanist.permissions;

import androidx.compose.runtime.A;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f25221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25222b;

    public g(Lifecycle lifecycle, r rVar) {
        this.f25221a = lifecycle;
        this.f25222b = rVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f25221a.c(this.f25222b);
    }
}
