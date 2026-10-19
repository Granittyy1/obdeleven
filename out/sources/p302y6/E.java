package p302y6;

import F6.h;
import W.f;
import android.content.Context;
import android.util.Log;
import androidx.compose.material.ripple.j;
import androidx.compose.ui.graphics.colorspace.n;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.ExecutorService;
import p144l6.e;
import p191p5.g;
import p264v6.c;
import p264v6.i;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f48299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f48300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f48302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f48303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f48304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f48305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D6.f f48306i;
    public final n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.E f48307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f48308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2818n f48309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2813i f48310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f48311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f48312p;

    public E(e eVar, M m7, c cVar, I i10, n nVar, androidx.media3.exoplayer.E e10, D6.f fVar, ExecutorService executorService, C2813i c2813i, i iVar) {
        this.f48299b = i10;
        eVar.a();
        this.f48298a = eVar.f44388a;
        this.f48305h = m7;
        this.f48311o = cVar;
        this.j = nVar;
        this.f48307k = e10;
        this.f48308l = executorService;
        this.f48306i = fVar;
        this.f48309m = new C2818n(executorService);
        this.f48310n = c2813i;
        this.f48312p = iVar;
        this.f48301d = System.currentTimeMillis();
        this.f48300c = new j(2);
    }

    public static g a(final E e10, h hVar) {
        g gVarD;
        C c10;
        Boolean bool = Boolean.TRUE;
        C2818n c2818n = e10.f48309m;
        if (!bool.equals(c2818n.f48384d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        e10.f48302e.d();
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                e10.j.c(new p289x6.a() { // from class: y6.A
                    @Override // p289x6.a
                    public final void a(String str) {
                        E e11 = this.f48293a;
                        long jCurrentTimeMillis = System.currentTimeMillis() - e11.f48301d;
                        a aVar = e11.f48304g;
                        aVar.getClass();
                        aVar.f28086e.a(new w(aVar, jCurrentTimeMillis, str));
                    }
                });
                e10.f48304g.f();
                com.google.firebase.crashlytics.internal.settings.a aVar = (com.google.firebase.crashlytics.internal.settings.a) hVar;
                if (aVar.b().f3262b.f3267a) {
                    e10.f48304g.d(aVar);
                    gVarD = e10.f48304g.g(aVar.f28110i.get().f45811a);
                    c10 = new C(e10);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    gVarD = p191p5.j.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    c10 = new C(e10);
                }
            } catch (Exception e11) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e11);
                gVarD = p191p5.j.d(e11);
                c10 = new C(e10);
            }
            c2818n.a(c10);
            return gVarD;
        } catch (Throwable th) {
            c2818n.a(new C(e10));
            throw th;
        }
    }
}
