package androidx.work.impl.diagnostics;

import K2.K;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.k;
import androidx.work.m;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20407a = k.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.c().getClass();
        try {
            K kB = K.b(context);
            m mVarA = new m.a(DiagnosticsWorker.class).a();
            kB.getClass();
            kB.a(Collections.singletonList(mVarA));
        } catch (IllegalStateException e10) {
            k.c().b(f20407a, "WorkManager is not initialized", e10);
        }
    }
}
