package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.voltasit.obdeleven.domain.exceptions.ServiceNotFoundException;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: TelephonyServiceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements J8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30298a;

    public z(Context context) {
        this.f30298a = context;
    }

    @Override // J8.w
    public final C8.a.b a() {
        return new C8.a.b(this.f30298a.getResources().getConfiguration().getLocales().get(0).getCountry());
    }

    @Override // J8.w
    public final C8.a<String> b() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f30298a.getSystemService(AttributeType.PHONE);
        return telephonyManager == null ? new C8.a.C0024a(new ServiceNotFoundException()) : new C8.a.b(telephonyManager.getSimCountryIso());
    }

    @Override // J8.w
    public final C8.a<String> c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f30298a.getSystemService(AttributeType.PHONE);
        return telephonyManager == null ? new C8.a.C0024a(new ServiceNotFoundException()) : new C8.a.b(telephonyManager.getNetworkCountryIso());
    }
}
