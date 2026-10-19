package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p271w0.j;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p309z2.b<Boolean> {

    public static class a extends androidx.emoji2.text.c.AbstractC0181c {
    }

    public static class b implements androidx.emoji2.text.c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17340a;

        public b(Context context) {
            this.f17340a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(final androidx.emoji2.text.c.h hVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new R0.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: R0.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = this.f5149b;
                    androidx.emoji2.text.c.h hVar2 = hVar;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    bVar.getClass();
                    try {
                        androidx.emoji2.text.e eVarA = androidx.emoji2.text.a.a(bVar.f17340a);
                        if (eVarA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        androidx.emoji2.text.e.b bVar2 = (androidx.emoji2.text.e.b) eVarA.f17355a;
                        synchronized (bVar2.f17366d) {
                            bVar2.f17368f = threadPoolExecutor2;
                        }
                        eVarA.f17355a.a(new androidx.emoji2.text.d(hVar2, threadPoolExecutor2));
                    } catch (Throwable th) {
                        hVar2.a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i10 = j.f47686a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.d()) {
                    androidx.emoji2.text.c.a().e();
                }
            } finally {
                int i11 = j.f47686a;
                Trace.endSection();
            }
        }
    }

    @Override // p309z2.b
    public final List<Class<? extends p309z2.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p309z2.b
    public final Boolean b(Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.f17356b = 1;
        if (androidx.emoji2.text.c.f17342k == null) {
            synchronized (androidx.emoji2.text.c.j) {
                try {
                    if (androidx.emoji2.text.c.f17342k == null) {
                        androidx.emoji2.text.c.f17342k = new androidx.emoji2.text.c(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p309z2.a aVarC = p309z2.a.c(context);
        aVarC.getClass();
        synchronized (p309z2.a.f48780e) {
            try {
                objB = aVarC.f48781a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Lifecycle lifecycle = ((InterfaceC1376t) objB).getLifecycle();
        lifecycle.a(new R0.e(this, lifecycle));
        return Boolean.TRUE;
    }
}
