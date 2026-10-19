package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.datatransport.Priority;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2051n implements p191p5.f, p096h7.a.InterfaceC0377a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28386b;

    public /* synthetic */ C2051n(Object obj) {
        this.f28386b = obj;
    }

    public void a(byte[] bArr) {
        ((C4.w) ((p311z4.g) this.f28386b)).a(new p311z4.a(bArr, Priority.f25231b, null), new C4.v(0));
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        return FirebaseMessaging.lambda$subscribeToTopic$10((String) this.f28386b, (P) obj);
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(p096h7.b bVar) {
        p264v6.c cVar = (p264v6.c) this.f28386b;
        cVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        cVar.f47653b.set((p264v6.a) bVar.get());
    }
}
