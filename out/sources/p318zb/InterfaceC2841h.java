package p318zb;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: zb.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2841h extends H, ReadableByteChannel {
    byte[] A() throws IOException;

    short B0() throws IOException;

    long F0() throws IOException;

    int H(x xVar) throws IOException;

    void N0(long j) throws IOException;

    InputStream X0();

    boolean c0(long j, ByteString byteString) throws IOException;

    String d0(Charset charset) throws IOException;

    C2839f f();

    boolean g(long j) throws IOException;

    long o(InterfaceC2840g interfaceC2840g) throws IOException;

    int q0() throws IOException;

    byte readByte() throws IOException;

    void skip(long j) throws IOException;
}
