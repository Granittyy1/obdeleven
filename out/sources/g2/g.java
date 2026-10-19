package g2;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = A.f40996a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j10 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j10 += Long.parseLong(strTrim);
        }
        return j10 * 1000;
    }

    public static void c(r rVar) throws ParserException {
        int i10 = rVar.f41063b;
        Charset charset = StandardCharsets.UTF_8;
        String strI = rVar.i(charset);
        if (strI == null || !strI.startsWith("WEBVTT")) {
            rVar.G(i10);
            throw ParserException.a(null, "Expected WEBVTT. Got " + rVar.i(charset));
        }
    }
}
