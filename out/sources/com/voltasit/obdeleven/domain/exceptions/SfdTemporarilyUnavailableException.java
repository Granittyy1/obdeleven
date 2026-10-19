package com.voltasit.obdeleven.domain.exceptions;

import D8.a;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SfdTemporarilyUnavailableException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdTemporarilyUnavailableException extends Throwable implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SfdTemporarilyUnavailableException f30432b = new SfdTemporarilyUnavailableException();

    private SfdTemporarilyUnavailableException() {
        super("SFD is temporarily unavailable");
    }

    @Override // D8.a
    public final int a() {
        return R.string.dialog_sfd_temporarily_unavailable_message;
    }
}
