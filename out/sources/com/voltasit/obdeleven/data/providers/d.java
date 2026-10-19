package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ControlUnitProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements J8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.channels.a<Short> f30260a = kotlinx.coroutines.channels.b.a(-1);

    @Override // J8.e
    public final kotlinx.coroutines.channels.a<Short> a() {
        return this.f30260a;
    }

    @Override // J8.e
    public final Object b(short s10, ContinuationImpl continuationImpl) {
        Object objT = this.f30260a.t(new Short(s10), continuationImpl);
        return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
    }
}
