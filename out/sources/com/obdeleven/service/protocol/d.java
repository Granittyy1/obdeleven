package com.obdeleven.service.protocol;

import O.h;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ObdIIMultiMessageProtocol.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends Protocol {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O3.d f29545f;

    public d(O3.d dVar) {
        super("OBDIIMultiMessage");
        this.f29545f = dVar;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return state == Protocol.State.f29532c ? 1000L : 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String request) {
        i.e(request, "request");
        String strConcat = "686AF1".concat(request);
        int i10 = 0;
        int i11 = 0;
        while (i10 < strConcat.length()) {
            int i12 = i10 + 2;
            String strSubstring = strConcat.substring(i10, i12);
            i.d(strSubstring, "substring(...)");
            h.c(16);
            i11 += Integer.parseInt(strSubstring, 16) & 255;
            i10 = i12;
        }
        String command = strConcat.concat(String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i11 & 255)}, 1)));
        this.f29545f.getClass();
        i.e(command, "command");
        X7.a aVar = new X7.a(command);
        aVar.f7371h = "";
        return aVar.a();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        Task<Void> taskDelay = Task.delay(5000L);
        i.d(taskDelay, "delay(...)");
        return taskDelay;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        i.e(state, "state");
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
        g("0100");
    }
}
