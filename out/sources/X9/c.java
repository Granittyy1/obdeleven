package X9;

import io.ktor.http.C2476a;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.i;
import kotlin.text.o;

/* JADX INFO: compiled from: TextContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2476a f7432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7433c;

    public c(String text, C2476a contentType) {
        byte[] bytes;
        i.e(text, "text");
        i.e(contentType, "contentType");
        this.f7431a = text;
        this.f7432b = contentType;
        Charset charsetC = p241t7.b.c(contentType);
        charsetC = charsetC == null ? kotlin.text.a.f43120b : charsetC;
        Charset charset = kotlin.text.a.f43120b;
        if (i.a(charsetC, charset)) {
            bytes = text.getBytes(charset);
            i.d(bytes, "getBytes(...)");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetC.newEncoder();
            i.d(charsetEncoderNewEncoder, "charset.newEncoder()");
            int length = text.length();
            CharBuffer charBuffer = p049da.a.f34632a;
            if (length == text.length()) {
                bytes = text.getBytes(charsetEncoderNewEncoder.charset());
                i.d(bytes, "input as java.lang.String).getBytes(charset())");
            } else {
                String strSubstring = text.substring(0, length);
                i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                bytes = strSubstring.getBytes(charsetEncoderNewEncoder.charset());
                i.d(bytes, "input.substring(fromInde…ring).getBytes(charset())");
            }
        }
        this.f7433c = bytes;
    }

    @Override // X9.b
    public final Long a() {
        return Long.valueOf(this.f7433c.length);
    }

    @Override // X9.b
    public final C2476a b() {
        return this.f7432b;
    }

    @Override // X9.b.a
    public final byte[] d() {
        return this.f7433c;
    }

    public final String toString() {
        return "TextContent[" + this.f7432b + "] \"" + o.t0(30, this.f7431a) + '\"';
    }
}
