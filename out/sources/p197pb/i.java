package p197pb;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.text.m;
import okhttp3.Protocol;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Protocol f45956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45958c;

    /* JADX INFO: compiled from: StatusLine.kt */
    public static final class a {
        public static i a(String statusLine) throws IOException {
            int i10;
            String strSubstring;
            kotlin.jvm.internal.i.e(statusLine, "statusLine");
            boolean zI = m.I(statusLine, "HTTP/1.", false);
            Protocol protocol = Protocol.HTTP_1_0;
            if (zI) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!m.I(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new i(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public i(Protocol protocol, int i10, String str) {
        this.f45956a = protocol;
        this.f45957b = i10;
        this.f45958c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f45956a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f45957b);
        sb2.append(' ');
        sb2.append(this.f45958c);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
