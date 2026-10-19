package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28265b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28268e;

    public /* synthetic */ B(Context context, boolean z10, p191p5.h hVar) {
        this.f28267d = context;
        this.f28266c = z10;
        this.f28268e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28265b) {
            case 0:
                Context context = (Context) this.f28267d;
                p191p5.h hVar = (p191p5.h) this.f28268e;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = E.a(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f28266c) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    hVar.d(null);
                }
            default:
                NexusWrapper.connect$lambda$0((NexusWrapper) this.f28267d, (NexusConfig) this.f28268e, this.f28266c);
                return;
        }
    }

    public /* synthetic */ B(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z10) {
        this.f28267d = nexusWrapper;
        this.f28268e = nexusConfig;
        this.f28266c = z10;
    }
}
