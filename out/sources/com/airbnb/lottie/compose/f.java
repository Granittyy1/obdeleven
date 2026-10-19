package com.airbnb.lottie.compose;

import kotlinx.coroutines.C2693i;
import p079g3.q;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f<T> implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2693i f23363a;

    public f(C2693i c2693i) {
        this.f23363a = c2693i;
    }

    @Override // p079g3.q
    public final void onResult(T t8) {
        C2693i c2693i = this.f23363a;
        if (c2693i.x()) {
            return;
        }
        c2693i.resumeWith(t8);
    }
}
