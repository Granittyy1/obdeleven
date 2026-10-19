package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: SubstituteLoggerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements cc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f45787a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f45788b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue<dc.c> f45789c = new LinkedBlockingQueue<>();

    @Override // cc.a
    public final synchronized cc.b a(String str) {
        c cVar;
        cVar = (c) this.f45788b.get(str);
        if (cVar == null) {
            cVar = new c(str, this.f45789c, this.f45787a);
            this.f45788b.put(str, cVar);
        }
        return cVar;
    }
}
