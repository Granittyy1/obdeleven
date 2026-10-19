package p047d8;

import com.obdeleven.service.core.d;
import com.obdeleven.service.util.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: ReadVersionCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends d<String> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 16 && (bArr[1] & 255) == 0) {
            b.b(b.a(Arrays.copyOfRange(bArr, 2, 6)));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(bArr, 2, 6));
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            h(String.valueOf((int) byteBufferWrap.getShort()));
        }
    }
}
