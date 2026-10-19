package com.voltasit.obdeleven.data.providers;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RemoteConfigCoreProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigCoreProviderImpl$configSettings$1 extends Lambda implements Ia.l<C7.j.a, p293xa.r> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RemoteConfigCoreProviderImpl$configSettings$1 f30251h = new RemoteConfigCoreProviderImpl$configSettings$1();

    public RemoteConfigCoreProviderImpl$configSettings$1() {
        super(1);
    }

    @Override // Ia.l
    public final p293xa.r invoke(C7.j.a aVar) {
        C7.j.a remoteConfigSettings = aVar;
        kotlin.jvm.internal.i.e(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.a(3600L);
        return p293xa.r.f47939a;
    }
}
