package com.voltasit.obdeleven.domain.exceptions;

import D8.a;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SfdInvalidCountryCodeException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdInvalidCountryCodeException extends Throwable implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SfdInvalidCountryCodeException f30426b = new SfdInvalidCountryCodeException();

    private SfdInvalidCountryCodeException() {
        super("The country code is invalid");
    }

    @Override // D8.a
    public final int a() {
        return R.string.dialog_sfd_country_not_supported_message;
    }
}
