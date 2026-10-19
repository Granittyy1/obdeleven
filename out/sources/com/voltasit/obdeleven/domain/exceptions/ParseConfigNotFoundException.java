package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: ParseConfigNotFoundException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParseConfigNotFoundException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParseConfigNotFoundException f30414b = new ParseConfigNotFoundException();

    private ParseConfigNotFoundException() {
        super("Local parse config not available");
    }
}
