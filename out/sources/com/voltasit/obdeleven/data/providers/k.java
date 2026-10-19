package com.voltasit.obdeleven.data.providers;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: InputValidationProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements J8.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30266a = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    @Override // J8.l
    public final boolean a(String str) {
        return f30266a.matcher(str).matches();
    }
}
