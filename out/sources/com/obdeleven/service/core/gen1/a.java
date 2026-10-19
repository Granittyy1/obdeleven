package com.obdeleven.service.core.gen1;

/* JADX INFO: compiled from: ConnectObd2Command.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {
    public a() {
        super("0900");
    }

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        if (data.length == 0) {
            return;
        }
        byte b10 = data[0];
        byte[] bArr = p172nb.b.f45026a;
        if ((b10 & 255) == 127 && data.length >= 3 && (data[2] & 255) == 120) {
            return;
        }
        h(com.obdeleven.service.util.b.a(data));
    }
}
