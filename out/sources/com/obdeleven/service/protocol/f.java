package com.obdeleven.service.protocol;

import V8.m;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: UdsProtocol.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends Protocol {
    public f() {
        this("UDS");
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public long b(Protocol.State state) {
        return state == Protocol.State.f29532c ? 2000L : 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String str) {
        return new p230s8.a(str).a().continueWithTask(new m(8, this));
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public Task<Void> e() {
        return c("1001").makeVoid();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
        g("3E00");
    }

    public f(String str) {
        super(str);
        O.e.j(str, "");
    }
}
