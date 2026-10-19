package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2057u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28416d;

    public /* synthetic */ RunnableC2057u(Object obj, int i10, Object obj2) {
        this.f28414b = i10;
        this.f28415c = obj;
        this.f28416d = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28414b) {
            case 0:
                ((FirebaseMessaging) this.f28415c).lambda$deleteToken$9((p191p5.h) this.f28416d);
                return;
            case 1:
                p175o1.j jVar = (p175o1.j) this.f28415c;
                jVar.getClass();
                int i10 = p114j1.A.f40996a;
                androidx.media3.exoplayer.K.a aVar = jVar.f45100b;
                androidx.media3.exoplayer.K.this.f18039s.O((Exception) this.f28416d);
                return;
            case 2:
                p228s6.m mVar = (p228s6.m) this.f28415c;
                p096h7.b bVar = (p096h7.b) this.f28416d;
                synchronized (mVar) {
                    try {
                        if (mVar.f46972b == 0) {
                            mVar.f46971a.add((p096h7.b<T>) bVar);
                        } else {
                            mVar.f46972b.add((T) bVar.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                y7.e eVar = (y7.e) this.f28415c;
                com.google.firebase.perf.v1.b bVarB = eVar.b((com.google.firebase.perf.util.h) this.f28416d);
                if (bVarB != null) {
                    eVar.f48423b.add(bVarB);
                    return;
                }
                return;
        }
    }
}
