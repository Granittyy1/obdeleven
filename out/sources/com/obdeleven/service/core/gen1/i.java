package com.obdeleven.service.core.gen1;

import com.obdeleven.service.exception.CommandException;
import java.util.Arrays;

/* JADX INFO: compiled from: RequestCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends com.obdeleven.service.core.d<String> {
    public i(String str) {
        super(j(str), true);
    }

    public static String j(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() % 2 != 0) {
            throw new RuntimeException("Command data length must be even");
        }
        int length = str.length() / 2;
        return String.format("21%02X%02X%s", Integer.valueOf(length & 255), Integer.valueOf((length >> 8) & 255), str);
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if (bArr.length <= 1 || (bArr[0] & 255) != 33) {
            return;
        }
        int i10 = bArr[1] & 255;
        if (i10 != 0) {
            g(new CommandException(i10));
        } else if (bArr.length > 3) {
            i(((bArr[3] << 8) | (bArr[2] & 255)) == 0 ? new byte[0] : Arrays.copyOfRange(bArr, 4, bArr.length));
        }
    }

    public abstract void i(byte[] bArr);

    public i(String str, long j) {
        super(j, j(str), true);
    }
}
