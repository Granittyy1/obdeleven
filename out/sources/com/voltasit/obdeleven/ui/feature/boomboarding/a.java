package com.voltasit.obdeleven.ui.feature.boomboarding;

import androidx.compose.runtime.A;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.ui.d f34074a;

    public a(androidx.media3.ui.d dVar) {
        this.f34074a = dVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f34074a.setPlayer(null);
    }
}
