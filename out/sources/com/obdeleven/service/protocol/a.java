package com.obdeleven.service.protocol;

import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: CanObdIIProtocol.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {
    public a() {
        super("CAN_OBDII");
    }

    @Override // com.obdeleven.service.protocol.f, com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return 0L;
    }

    @Override // com.obdeleven.service.protocol.f, com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        return Task.forResult(null);
    }
}
