package com.airbnb.lottie.compose;

import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import p079g3.q;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g<T> implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2693i f23364a;

    public g(C2693i c2693i) {
        this.f23364a = c2693i;
    }

    @Override // p079g3.q
    public final void onResult(Object obj) {
        Throwable e10 = (Throwable) obj;
        C2693i c2693i = this.f23364a;
        if (c2693i.x()) {
            return;
        }
        i.d(e10, "e");
        c2693i.resumeWith(kotlin.b.a(e10));
    }
}
