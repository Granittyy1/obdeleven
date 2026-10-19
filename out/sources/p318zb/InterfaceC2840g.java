package p318zb;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: renamed from: zb.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2840g extends F, WritableByteChannel {
    InterfaceC2840g E(int i10) throws IOException;

    InterfaceC2840g Q0(long j) throws IOException;

    OutputStream U0();

    InterfaceC2840g Z(String str) throws IOException;

    InterfaceC2840g a(byte[] bArr, int i10, int i11) throws IOException;

    C2839f f();

    long k0(H h8) throws IOException;

    InterfaceC2840g w0(byte[] bArr) throws IOException;

    InterfaceC2840g z0(ByteString byteString) throws IOException;
}
