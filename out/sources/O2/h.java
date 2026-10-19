package O2;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.q;
import p293xa.r;

/* JADX INFO: compiled from: ConstraintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.b f4779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<androidx.work.impl.constraints.a<T>> f4782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f4783e;

    public h(Context context, S2.b taskExecutor) {
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        this.f4779a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.f4780b = applicationContext;
        this.f4781c = new Object();
        this.f4782d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t8) {
        synchronized (this.f4781c) {
            T t10 = this.f4783e;
            if (t10 == null || !t10.equals(t8)) {
                this.f4783e = t8;
                this.f4779a.b().execute(new g(q.o0(this.f4782d), 0, this));
                r rVar = r.f47939a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
