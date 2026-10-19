package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C4.l;
import C4.x;
import I4.c;
import I4.d;
import I4.o;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25274b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(InAppMessageBase.EXTRAS);
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        x.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        Priority priorityB = M4.a.b(i10);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        o oVar = x.a().f2410d;
        l lVar = new l(string, bArrDecode, priorityB);
        c cVar = new c(this, 0, jobParameters);
        oVar.getClass();
        oVar.f3875e.execute(new d(oVar, lVar, i11, cVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
