package io.ktor.http;

import java.util.ArrayList;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final void a(p293xa.g<? extends ArrayList<e>> gVar, String str, int i10, int i11, String str2) {
        String strB = b(str, i10, i11);
        if (strB.length() == 0) {
            return;
        }
        gVar.getValue().add(new e(strB, str2));
    }

    public static final String b(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return kotlin.text.n.p0(strSubstring).toString();
    }
}
