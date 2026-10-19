package com.voltasit.obdeleven.data.repositories;

import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLockRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements K8.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f30399a;

    @Override // K8.y
    public final void a() {
        PowerManager.WakeLock wakeLock = this.f30399a;
        if (wakeLock == null || !wakeLock.isHeld() || wakeLock == null) {
            return;
        }
        wakeLock.release();
    }

    @Override // K8.y
    public final void b() {
        PowerManager.WakeLock wakeLock = this.f30399a;
        if (wakeLock == null || wakeLock.isHeld() || wakeLock == null) {
            return;
        }
        wakeLock.acquire(600000L);
    }
}
