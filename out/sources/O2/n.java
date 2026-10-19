package O2;

import android.content.Context;

/* JADX INFO: compiled from: Trackers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<Boolean> f4790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<androidx.work.impl.constraints.c> f4792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h<Boolean> f4793d;

    public n() {
        throw null;
    }

    public n(Context context, S2.b taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        a aVar = new a(applicationContext, taskExecutor);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext2, "context.applicationContext");
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        c cVar = new c(applicationContext2, taskExecutor);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext3, "context.applicationContext");
        String str = k.f4788a;
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        j jVar = new j(applicationContext3, taskExecutor);
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext4, "context.applicationContext");
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        l lVar = new l(applicationContext4, taskExecutor);
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        this.f4790a = aVar;
        this.f4791b = cVar;
        this.f4792c = jVar;
        this.f4793d = lVar;
    }
}
