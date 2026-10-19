package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.core.app.C1277b;

/* JADX INFO: compiled from: MutablePermissionState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f25214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f25215c = J0.f(a());

    public a(Context context, Activity activity) {
        this.f25213a = context;
        this.f25214b = activity;
    }

    public final e a() {
        return p186p0.a.a(this.f25213a, "android.permission.RECORD_AUDIO") == 0 ? e.b.f25218a : new e.a(C1277b.e(this.f25214b, "android.permission.RECORD_AUDIO"));
    }

    @Override // com.google.accompanist.permissions.c
    public final e d() {
        return (e) this.f25215c.getValue();
    }
}
