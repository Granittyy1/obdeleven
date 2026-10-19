package androidx.compose.runtime.internal;

import android.content.ComponentName;
import java.util.concurrent.atomic.AtomicReference;
import p293xa.r;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13066c;

    public f() {
        this.f13064a = new AtomicReference(g.f13067a);
        this.f13065b = new Object();
    }

    public Object a() {
        long jF = I.b.f();
        if (jF == i.f13071a) {
            return this.f13066c;
        }
        h hVar = (h) ((AtomicReference) this.f13064a).get();
        int iA = hVar.a(jF);
        if (iA >= 0) {
            return hVar.f13070c[iA];
        }
        return null;
    }

    public void b(Object obj) {
        boolean z10;
        long jF = I.b.f();
        if (jF == i.f13071a) {
            this.f13066c = obj;
            return;
        }
        synchronized (this.f13065b) {
            h hVar = (h) ((AtomicReference) this.f13064a).get();
            int iA = hVar.a(jF);
            if (iA < 0) {
                z10 = false;
            } else {
                hVar.f13070c[iA] = obj;
                z10 = true;
            }
            if (z10) {
                return;
            }
            ((AtomicReference) this.f13064a).set(hVar.b(obj, jF));
            r rVar = r.f47939a;
        }
    }

    public f(p012b.b bVar, p198q.b bVar2, ComponentName componentName) {
        this.f13064a = bVar;
        this.f13065b = bVar2;
        this.f13066c = componentName;
    }
}
