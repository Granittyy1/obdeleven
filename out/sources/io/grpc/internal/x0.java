package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ReadableBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface x0 extends Closeable {
    void D0(OutputStream outputStream, int i10) throws IOException;

    void O0(ByteBuffer byteBuffer);

    int e();

    void e0(byte[] bArr, int i10, int i11);

    void i0();

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    x0 w(int i10);
}
