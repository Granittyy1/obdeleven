package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: SfdAlreadyUnlockedException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdAlreadyUnlockedException extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SfdAlreadyUnlockedException f30424b = new SfdAlreadyUnlockedException();

    private SfdAlreadyUnlockedException() {
        super("SFD is already unlocked");
    }
}
