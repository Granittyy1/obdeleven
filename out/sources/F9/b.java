package F9;

import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import p237t3.x;
import p318zb.C2839f;

/* JADX INFO: compiled from: FrameWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public interface b extends Closeable {
    void D(x xVar) throws IOException;

    void F() throws IOException;

    void K(ErrorCode errorCode, byte[] bArr) throws IOException;

    int M0();

    void Q(int i10, long j) throws IOException;

    void W(int i10, int i11, boolean z10) throws IOException;

    void W0(boolean z10, int i10, ArrayList arrayList) throws IOException;

    void Y0(int i10, ErrorCode errorCode) throws IOException;

    void flush() throws IOException;

    void n(x xVar) throws IOException;

    void v(boolean z10, int i10, C2839f c2839f, int i11) throws IOException;
}
