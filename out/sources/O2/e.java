package O2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> extends h<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f4773f;

    /* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.kt */
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f4774a;

        public a(e<T> eVar) {
            this.f4774a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(intent, "intent");
            this.f4774a.f(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, S2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        this.f4773f = new a(this);
    }

    @Override // O2.h
    public final void c() {
        androidx.work.k kVarC = androidx.work.k.c();
        int i10 = f.f4775a;
        kVarC.getClass();
        this.f4780b.registerReceiver(this.f4773f, e());
    }

    @Override // O2.h
    public final void d() {
        androidx.work.k kVarC = androidx.work.k.c();
        int i10 = f.f4775a;
        kVarC.getClass();
        this.f4780b.unregisterReceiver(this.f4773f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
