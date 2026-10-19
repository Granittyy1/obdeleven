package com.voltasit.obdeleven.presentation.dialogs.backup;

import java.util.concurrent.CountDownLatch;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32185b;

    public /* synthetic */ d(Object obj) {
        this.f32185b = obj;
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        ((CountDownLatch) this.f32185b).countDown();
        return null;
    }
}
