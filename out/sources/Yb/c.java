package Yb;

import com.google.android.gms.internal.measurement.M1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/* JADX INFO: compiled from: VisualSampleEntry.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f7662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f7663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7664i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long[] f7666l;

    public c() {
        super("avc1");
        this.f7662g = 72.0d;
        this.f7663h = 72.0d;
        this.f7664i = 1;
        this.j = "";
        this.f7665k = 24;
        this.f7666l = new long[3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                cVar.getBox(Channels.newChannel(byteArrayOutputStream2));
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        C6.b.i(this.f7655d, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        C6.b.i(0, byteBufferAllocate);
        long[] jArr = this.f7666l;
        byteBufferAllocate.putInt((int) jArr[0]);
        byteBufferAllocate.putInt((int) jArr[1]);
        byteBufferAllocate.putInt((int) jArr[2]);
        C6.b.i(this.f7660e, byteBufferAllocate);
        C6.b.i(this.f7661f, byteBufferAllocate);
        C6.b.g(byteBufferAllocate, this.f7662g);
        C6.b.g(byteBufferAllocate, this.f7663h);
        byteBufferAllocate.putInt((int) 0);
        C6.b.i(this.f7664i, byteBufferAllocate);
        byteBufferAllocate.put((byte) (M1.m(this.j) & 255));
        byteBufferAllocate.put(M1.e(this.j));
        int iM = M1.m(this.j);
        while (iM < 31) {
            iM++;
            byteBufferAllocate.put((byte) 0);
        }
        C6.b.i(this.f7665k, byteBufferAllocate);
        C6.b.i(65535, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        h(writableByteChannel);
    }

    @Override // Zb.b, Tb.b
    public final long getSize() {
        long jC = c();
        return 78 + jC + ((long) (jC + 86 >= 4294967296L ? 16 : 8));
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

    public c(String str) {
        super(str);
        this.f7662g = 72.0d;
        this.f7663h = 72.0d;
        this.f7664i = 1;
        this.j = "";
        this.f7665k = 24;
        this.f7666l = new long[3];
    }
}
