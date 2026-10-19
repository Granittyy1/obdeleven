package Zb;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* JADX INFO: compiled from: AbstractContainerBox.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends Tb.a implements Tb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7973c;

    public b(String str) {
        this.f6057b = new ArrayList();
        this.f7973c = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(i());
        h(writableByteChannel);
    }

    public long getSize() {
        long jC = c();
        return jC + ((long) (8 + jC >= 4294967296L ? 16 : 8));
    }

    public final ByteBuffer i() {
        ByteBuffer byteBufferWrap;
        long size = getSize();
        String str = this.f7973c;
        if (size >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            byteBufferWrap.putLong(getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, str.getBytes()[0], str.getBytes()[1], str.getBytes()[2], str.getBytes()[3]});
            byteBufferWrap.putInt((int) getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }
}
