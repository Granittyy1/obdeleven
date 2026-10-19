package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: LocationProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements J8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30269b;

    public m(Context context, J8.p pVar) {
        this.f30268a = context;
        this.f30269b = pVar;
    }

    @Override // J8.o
    public final boolean a() {
        Context context = this.f30268a;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
                    return true;
                }
            } catch (Settings.SettingNotFoundException e10) {
                this.f30269b.d(e10, true);
                return true;
            }
        }
        return false;
    }
}
