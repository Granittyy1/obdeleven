package I4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: JobInfoScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4.d f3840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f3841c;

    public b(Context context, J4.d dVar, SchedulerConfig schedulerConfig) {
        this.f3839a = context;
        this.f3840b = dVar;
        this.f3841c = schedulerConfig;
    }

    @Override // I4.u
    public final void a(C4.t tVar, int i10) {
        b(tVar, i10, false);
    }

    @Override // I4.u
    public final void b(C4.t tVar, int i10, boolean z10) {
        Context context = this.f3839a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(tVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(M4.a.a(tVar.c())).array());
        if (tVar.b() != null) {
            adler32.update(tVar.b());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    G4.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", tVar);
                    return;
                }
            }
        }
        long jG = this.f3840b.G(tVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityC = tVar.c();
        SchedulerConfig schedulerConfig = this.f3841c;
        builder.setMinimumLatency(schedulerConfig.b(priorityC, jG, i10));
        Set<SchedulerConfig.Flag> setB = schedulerConfig.c().get(priorityC).b();
        if (setB.contains(SchedulerConfig.Flag.f25275b)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(SchedulerConfig.Flag.f25277d)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(SchedulerConfig.Flag.f25276c)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", tVar.a());
        persistableBundle.putInt("priority", M4.a.a(tVar.c()));
        if (tVar.b() != null) {
            persistableBundle.putString(InAppMessageBase.EXTRAS, Base64.encodeToString(tVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {tVar, Integer.valueOf(value), Long.valueOf(schedulerConfig.b(tVar.c(), jG, i10)), Long.valueOf(jG), Integer.valueOf(i10)};
        if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
