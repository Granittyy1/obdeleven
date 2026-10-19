package com.voltasit.obdeleven.data.providers;

import java.util.Locale;

/* JADX INFO: compiled from: LocaleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements J8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.o f30267a;

    public l(K8.o oVar) {
        this.f30267a = oVar;
    }

    @Override // J8.n
    public final String a(String countryCode) {
        kotlin.jvm.internal.i.e(countryCode, "countryCode");
        String displayCountry = new Locale("", countryCode).getDisplayCountry(this.f30267a.Y().f());
        kotlin.jvm.internal.i.d(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }
}
