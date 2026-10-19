package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N1 f25551a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(N1 n10) {
        super(null);
        this.f25551a = n10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f25551a.f25521a.set(true);
    }
}
