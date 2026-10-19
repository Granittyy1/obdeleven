package p049da;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;
import p036ca.b;

/* JADX INFO: compiled from: CharsetJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CharBuffer f34632a = CharBuffer.allocate(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f34633b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        i.b(byteBufferAllocate);
        f34633b = byteBufferAllocate;
    }

    public static final boolean a(CharsetEncoder charsetEncoder, p074fa.a aVar) {
        int i10 = aVar.f34857c;
        int i11 = aVar.f34859e - i10;
        ByteBuffer byteBuffer = b.f22529a;
        ByteBuffer byteBufferJ = n.j(aVar.f34855a, i10, i11);
        CoderResult coderResultEncode = charsetEncoder.encode(f34632a, byteBufferJ, true);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        boolean zIsUnderflow = coderResultEncode.isUnderflow();
        if (byteBufferJ.limit() != i11) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        aVar.a(byteBufferJ.position());
        return zIsUnderflow;
    }

    public static final int b(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11, p074fa.a aVar) {
        i.e(input, "input");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i10, i11);
        int iRemaining = charBufferWrap.remaining();
        int i12 = aVar.f34857c;
        int i13 = aVar.f34859e - i12;
        ByteBuffer byteBuffer = b.f22529a;
        ByteBuffer byteBufferJ = n.j(aVar.f34855a, i12, i13);
        CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBufferJ, false);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        if (byteBufferJ.limit() != i13) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        aVar.a(byteBufferJ.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final String c(Charset charset) {
        i.e(charset, "<this>");
        String strName = charset.name();
        i.d(strName, "name()");
        return strName;
    }

    public static final void d(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.io.charsets.MalformedInputException(message);
        }
    }
}
