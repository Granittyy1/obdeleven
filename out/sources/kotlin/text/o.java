package kotlin.text;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static ArrayList q0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        StringsKt___StringsKt$windowed$1 transform = StringsKt___StringsKt$windowed$1.f43118h;
        kotlin.jvm.internal.i.e(transform, "transform");
        Cb.a.d(4, 4);
        int length = charSequence.length();
        int i10 = 0;
        ArrayList arrayList = new ArrayList((length / 4) + (length % 4 == 0 ? 0 : 1));
        while (i10 >= 0 && i10 < length) {
            int i11 = i10 + 4;
            arrayList.add(transform.invoke(charSequence.subSequence(i10, (i11 < 0 || i11 > length) ? length : i11)));
            i10 = i11;
        }
        return arrayList;
    }

    public static String r0(int i10, String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static char s0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(n.N(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String t0(int i10, String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length();
        String strSubstring = str.substring(length - (2 > length ? length : 2));
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
