package Yb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/* JADX INFO: compiled from: AudioSampleEntry.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cc.b f7656h = cc.c.b(b.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7659g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                bVar.getBox(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // Zb.b, Tb.b
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(i());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        byteBufferAllocate.position(6);
        C6.b.i(this.f7655d, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        byteBufferAllocate.putInt((int) 0);
        C6.b.i(this.f7657e, byteBufferAllocate);
        C6.b.i(this.f7658f, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        if (this.f7973c.equals("mlpa")) {
            byteBufferAllocate.putInt((int) this.f7659g);
        } else {
            byteBufferAllocate.putInt((int) (this.f7659g << 16));
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        h(writableByteChannel);
    }

    @Override // Zb.b, Tb.b
    public final long getSize() {
        long jC = c() + ((long) 28);
        return jC + ((long) (8 + jC >= 4294967296L ? 16 : 8));
    }

    public final int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            return Arrays.hashCode(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // Tb.a
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f7659g + ", sampleSize=" + this.f7658f + ", channelCount=" + this.f7657e + ", boxes=" + this.f6057b + '}';
    }
}
