package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: UserNotFoundException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UserNotFoundException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UserNotFoundException f30437b = new UserNotFoundException();

    private UserNotFoundException() {
        super("User object not found");
    }
}
