package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z1 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC1803e2.j.incrementAndGet();
    }
}
