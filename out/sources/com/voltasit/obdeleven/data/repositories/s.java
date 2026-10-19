package com.voltasit.obdeleven.data.repositories;

import com.obdeleven.service.protocol.Protocol;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: ProtocolRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements p084g8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f30385a = new LinkedHashMap();

    @Override // p084g8.c
    public final void a(short s10, Protocol protocol) {
        kotlin.jvm.internal.i.e(protocol, "protocol");
        this.f30385a.put(new p293xa.p(s10), protocol);
    }

    @Override // p084g8.c
    public final void b(short s10, com.obdeleven.service.protocol.f fVar) {
        a(s10, fVar);
    }

    @Override // p084g8.c
    public final Protocol c(short s10) throws Exception {
        Protocol protocol = (Protocol) this.f30385a.get(new p293xa.p(s10));
        if (protocol != null) {
            return protocol;
        }
        throw new Exception(androidx.compose.foundation.gestures.d.b("Protocol for cu ", p293xa.p.a(s10), " not found"));
    }
}
