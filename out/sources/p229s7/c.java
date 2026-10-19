package p229s7;

import com.google.firebase.perf.config.RemoteConfigManager;
import p268va.a;

/* JADX INFO: compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {
    @Override // p268va.a
    public final Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        p111ia.c.d(remoteConfigManager);
        return remoteConfigManager;
    }
}
