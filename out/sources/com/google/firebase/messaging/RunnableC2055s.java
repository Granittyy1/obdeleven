package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2055s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28410d;

    public /* synthetic */ RunnableC2055s(Object obj, int i10, Object obj2) {
        this.f28408b = i10;
        this.f28409c = obj;
        this.f28410d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f28410d;
        Object obj2 = this.f28409c;
        switch (this.f28408b) {
            case 0:
                ((FirebaseMessaging) obj2).lambda$getToken$7((p191p5.h) obj);
                break;
            default:
                p175o1.j jVar = (p175o1.j) obj2;
                jVar.getClass();
                int i10 = p114j1.A.f40996a;
                androidx.media3.exoplayer.K.this.f18039s.S((p175o1.k) obj);
                break;
        }
    }
}
