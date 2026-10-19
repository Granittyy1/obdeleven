package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<p293xa.r> f8266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8269d;

    public x(ComponentActivity.e executor, Ia.a aVar) {
        kotlin.jvm.internal.i.e(executor, "executor");
        this.f8266a = aVar;
        this.f8267b = new Object();
        this.f8269d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f8267b) {
            try {
                this.f8268c = true;
                Iterator it = this.f8269d.iterator();
                while (it.hasNext()) {
                    ((Ia.a) it.next()).invoke();
                }
                this.f8269d.clear();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
