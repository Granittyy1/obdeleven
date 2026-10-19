package com.voltasit.sharednetwork.integrity;

import Ia.l;
import Ia.p;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: IntegrityHeaders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntegrityHeadersConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p<? super byte[], ? super c<? super a>, ? extends Object> f34461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l<? super Integer, byte[]> f34462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lambda f34463c = new l<io.ktor.client.request.a, Boolean>() { // from class: com.voltasit.sharednetwork.integrity.IntegrityHeadersConfig$shouldAttach$1
        @Override // Ia.l
        public final Boolean invoke(io.ktor.client.request.a aVar) {
            io.ktor.client.request.a it = aVar;
            i.e(it, "it");
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lambda f34464d = new l<Throwable, r>() { // from class: com.voltasit.sharednetwork.integrity.IntegrityHeadersConfig$onError$1
        @Override // Ia.l
        public final r invoke(Throwable th) {
            Throwable it = th;
            i.e(it, "it");
            return r.f47939a;
        }
    };
}
