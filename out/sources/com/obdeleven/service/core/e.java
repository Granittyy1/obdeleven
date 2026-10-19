package com.obdeleven.service.core;

import com.obdeleven.service.exception.CommandException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: RawCanCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T> extends d<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public e(byte[] bArr) {
        String strConcat;
        if (bArr == null || bArr.length == 0) {
            strConcat = "";
        } else {
            int length = bArr.length + 5;
            strConcat = String.format(Locale.US, "21%02X%02X%02X%02X%02X%02X%02X", Integer.valueOf(length & 255), Integer.valueOf((length >> 8) & 255), 0, 7, 0, 0, Integer.valueOf(bArr.length)).concat(com.obdeleven.service.util.b.a(bArr));
        }
        super(5000L, strConcat, true);
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        byte[] bArrCopyOfRange;
        if (bArr.length <= 1 || (bArr[0] & 255) != 33) {
            return;
        }
        int i10 = bArr[1] & 255;
        if (i10 != 0) {
            g(new CommandException(i10));
            return;
        }
        if (bArr.length > 3) {
            int i11 = (bArr[3] << 8) | (bArr[2] & 255);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 4, bArr.length);
            if (i11 > bArrCopyOfRange2.length) {
                O.e.D("RawCanCommand", "Response length in response longer than response itself");
                return;
            }
            if (i11 < 5) {
                bArrCopyOfRange = new byte[0];
            } else {
                ByteBuffer.wrap(bArrCopyOfRange2, 0, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
                bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange2, 5, bArrCopyOfRange2.length);
            }
            i(bArrCopyOfRange);
        }
    }

    public abstract void i(byte[] bArr);
}
