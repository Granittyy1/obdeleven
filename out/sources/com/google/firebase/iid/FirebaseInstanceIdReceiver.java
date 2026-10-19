package com.google.firebase.iid;

import R4.AbstractC0755b;
import R4.C0754a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C2049l;
import com.google.firebase.messaging.y;
import java.util.concurrent.ExecutionException;
import p191p5.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC0755b {
    @Override // R4.AbstractC0755b
    public final int a(Context context, C0754a c0754a) {
        try {
            return ((Integer) j.a(new C2049l(context).b(c0754a.f5265b))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // R4.AbstractC0755b
    public final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (y.d(intentPutExtras)) {
            y.c(intentPutExtras.getExtras(), "_nd");
        }
    }
}
