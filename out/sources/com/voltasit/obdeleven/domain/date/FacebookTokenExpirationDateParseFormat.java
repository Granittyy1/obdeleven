package com.voltasit.obdeleven.domain.date;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: FacebookTokenExpirationDateParseFormat.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FacebookTokenExpirationDateParseFormat extends SimpleDateFormat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FacebookTokenExpirationDateParseFormat f30400b = new FacebookTokenExpirationDateParseFormat();

    private FacebookTokenExpirationDateParseFormat() {
        super("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
