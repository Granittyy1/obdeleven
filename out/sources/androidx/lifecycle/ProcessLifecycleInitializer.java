package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: ProcessLifecycleInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p309z2.b<InterfaceC1376t> {
    @Override // p309z2.b
    public final List<Class<? extends p309z2.b<?>>> a() {
        return EmptyList.f42983b;
    }

    @Override // p309z2.b
    public final InterfaceC1376t b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        p309z2.a aVarC = p309z2.a.c(context);
        kotlin.jvm.internal.i.d(aVarC, "getInstance(...)");
        if (!aVarC.f48782b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!C1374q.f17825a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1374q.a());
        }
        G g10 = G.j;
        g10.getClass();
        g10.f17733f = new Handler();
        g10.f17734g.f(Lifecycle.Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new H(g10));
        return g10;
    }
}
