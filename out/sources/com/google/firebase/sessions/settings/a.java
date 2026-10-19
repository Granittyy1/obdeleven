package com.google.firebase.sessions.settings;

import U4.C0804l;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: LocalOverrideSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28761a;

    public a(Service service) {
        C0804l.h(service);
        Context applicationContext = service.getApplicationContext();
        C0804l.h(applicationContext);
        this.f28761a = applicationContext;
    }

    public Boolean a() {
        Bundle bundle = (Bundle) this.f28761a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public a(Context context) {
        i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f28761a = bundle == null ? Bundle.EMPTY : bundle;
    }
}
