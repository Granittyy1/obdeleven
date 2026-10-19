package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;

/* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p144l6.e f28783a;

    public x(p144l6.e eVar) {
        this.f28783a = eVar;
    }

    @Override // com.google.firebase.sessions.w
    public final void a(Messenger messenger, u.b serviceConnection) {
        boolean zBindService;
        kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
        p144l6.e eVar = this.f28783a;
        eVar.a();
        Context applicationContext = eVar.f44388a.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException unused) {
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        applicationContext.unbindService(serviceConnection);
    }
}
