package com.obdeleven.service.core.gen1;

import com.obdeleven.service.exception.CommandException;

/* JADX INFO: loaded from: classes3.dex */
public final class SetProtocolCommand extends com.obdeleven.service.core.d<Void> {

    public enum Protocol {
        NULL("00"),
        CAN("01"),
        ISO_TP("02"),
        TP20("03"),
        TP16("04"),
        K_LINE("05"),
        ISO_TP_OBD2("06");

        final String id;

        Protocol(String str) {
            this.id = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.id;
        }
    }

    public SetProtocolCommand(Protocol protocol) {
        super("20" + protocol, true);
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if (bArr.length == 0) {
            O.e.l("SetProtocolCommand", "SetProtocolCommand response length is 0");
            return;
        }
        if ((bArr[0] & 255) == 32) {
            int i10 = bArr[1] & 255;
            if (i10 == 0) {
                h(null);
            } else {
                g(new CommandException(i10));
            }
        }
    }
}
