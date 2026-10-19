package N1;

import C.g;
import I.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p078g1.s;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f4623e = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f4624c = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharsetDecoder f4625d = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // C.g
    public final s K(J1.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f4625d;
        CharsetDecoder charsetDecoder2 = this.f4624c;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new s(new c(null, bArr, null));
        }
        Matcher matcher = f4623e.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strL = e.l(strGroup);
                strL.getClass();
                if (strL.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strL.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new s(new c(str, bArr, str2));
    }
}
