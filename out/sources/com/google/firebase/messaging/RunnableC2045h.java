package com.google.firebase.messaging;

import android.content.Intent;

/* JADX INFO: renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2045h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28373e;

    public /* synthetic */ RunnableC2045h(Object obj, Object obj2, Object obj3, int i10) {
        this.f28370b = i10;
        this.f28371c = obj;
        this.f28372d = obj2;
        this.f28373e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28370b) {
            case 0:
                ((AbstractServiceC2046i) this.f28371c).lambda$processIntent$0((Intent) this.f28372d, (p191p5.h) this.f28373e);
                break;
            default:
                p240t6.h hVar = (p240t6.h) this.f28371c;
                hVar.getClass();
                hVar.f47347b.execute(new p005a4.i((Runnable) this.f28372d, 2, (t6.i.a) this.f28373e));
                break;
        }
    }
}
