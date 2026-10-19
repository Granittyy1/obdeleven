package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import okio.ByteString;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final a Companion = new a();

    /* JADX INFO: compiled from: RequestBody.kt */
    public static final class a {
        public static x a(String str, r rVar) {
            kotlin.jvm.internal.i.e(str, "<this>");
            Charset charset = kotlin.text.a.f43120b;
            if (rVar != null) {
                Pattern pattern = r.f45588d;
                Charset charsetA = rVar.a(null);
                if (charsetA == null) {
                    rVar = r.a.b(rVar + "; charset=utf-8");
                } else {
                    charset = charsetA;
                }
            }
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
            return b(rVar, bytes, 0, bytes.length);
        }

        public static x b(r rVar, byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.i.e(bArr, "<this>");
            long length = bArr.length;
            long j = i10;
            long j10 = i11;
            byte[] bArr2 = p172nb.b.f45026a;
            if ((j | j10) < 0 || j > length || length - j < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new x(rVar, bArr, i11, i10);
        }

        public static /* synthetic */ x c(a aVar, byte[] bArr, r rVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                rVar = null;
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return b(rVar, bArr, i10, length);
        }
    }

    public static final y create(String str, r rVar) {
        Companion.getClass();
        return a.a(str, rVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract r contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC2840g interfaceC2840g) throws IOException;

    @p293xa.d
    public static final y create(r rVar, File file) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(file, "file");
        return new v(rVar, file);
    }

    @p293xa.d
    public static final y create(r rVar, String content) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(content, "content");
        return a.a(content, rVar);
    }

    @p293xa.d
    public static final y create(r rVar, ByteString content) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(content, "content");
        return new w(rVar, content);
    }

    @p293xa.d
    public static final y create(r rVar, byte[] content) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(content, "content");
        return a.b(rVar, content, 0, content.length);
    }

    @p293xa.d
    public static final y create(r rVar, byte[] content, int i10) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(content, "content");
        return a.b(rVar, content, i10, content.length);
    }

    public static final y create(byte[] bArr) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.i.e(bArr, "<this>");
        return a.c(aVar, bArr, null, 0, 7);
    }

    public static final y create(byte[] bArr, r rVar) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.i.e(bArr, "<this>");
        return a.c(aVar, bArr, rVar, 0, 6);
    }

    public static final y create(byte[] bArr, r rVar, int i10) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.i.e(bArr, "<this>");
        return a.c(aVar, bArr, rVar, i10, 4);
    }

    public static final y create(byte[] bArr, r rVar, int i10, int i11) {
        Companion.getClass();
        return a.b(rVar, bArr, i10, i11);
    }

    public static final y create(ByteString byteString, r rVar) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(byteString, "<this>");
        return new w(rVar, byteString);
    }

    public static final y create(File file, r rVar) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(file, "<this>");
        return new v(rVar, file);
    }

    @p293xa.d
    public static final y create(r rVar, byte[] content, int i10, int i11) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(content, "content");
        return a.b(rVar, content, i10, i11);
    }
}
