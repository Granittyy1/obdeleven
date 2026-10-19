package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C4.l;
import C4.x;
import I4.d;
import I4.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25273a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(InAppMessageBase.EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        x.b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        Priority priorityB = M4.a.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        o oVar = x.a().f2410d;
        l lVar = new l(queryParameter, bArrDecode, priorityB);
        I4.a aVar = new I4.a();
        oVar.getClass();
        oVar.f3875e.execute(new d(oVar, lVar, i10, aVar));
    }
}
