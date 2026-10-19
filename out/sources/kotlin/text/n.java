package kotlin.text;

import Ia.p;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public class n extends m {
    public static boolean J(CharSequence charSequence, String other, boolean z10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return Q(charSequence, other, 0, z10, 2) >= 0;
    }

    public static boolean K(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return P(charSequence, c10, 0, false, 2) >= 0;
    }

    public static boolean L(String str, char c10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return str.length() > 0 && O.h.g(str.charAt(N(str)), c10, false);
    }

    public static boolean M(String str, CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence instanceof String ? m.C((String) charSequence, str, false) : Y(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int N(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int O(int i10, CharSequence charSequence, String string, boolean z10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        Na.i iVar = new Na.i(i10, length, 1);
        boolean z11 = charSequence instanceof String;
        int i11 = iVar.f4689d;
        int i12 = iVar.f4688c;
        int i13 = iVar.f4687b;
        if (!z11 || string == null) {
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (!Y(string, 0, charSequence, i13, string.length(), z10)) {
                    if (i13 != i12) {
                        i13 += i11;
                    }
                }
                return i13;
            }
            return -1;
        }
        if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            while (!m.E(0, i13, string.length(), string, (String) charSequence, z10)) {
                if (i13 != i12) {
                    i13 += i11;
                }
            }
            return i13;
        }
        return -1;
    }

    public static int P(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? R(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return O(i10, charSequence, str, z10);
    }

    public static final int R(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.k.Z(chars), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iN = N(charSequence);
        if (i10 > iN) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c10 : chars) {
                if (O.h.g(c10, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iN) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean S(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!O.h.j(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int T(int i10, String str, String string) {
        int iN = (i10 & 2) != 0 ? N(str) : 0;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        return str.lastIndexOf(string, iN);
    }

    public static int U(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = N(charSequence);
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.k.Z(cArr), i10);
        }
        int iN = N(charSequence);
        if (i10 > iN) {
            i10 = iN;
        }
        while (-1 < i10) {
            if (O.h.g(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static final List V(final String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return SequencesKt___SequencesKt.F(new kotlin.sequences.n(X(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new Ia.l<Na.i, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final String invoke(Na.i iVar) {
                Na.i it = iVar;
                kotlin.jvm.internal.i.e(it, "it");
                return n.i0(str, it);
            }
        }));
    }

    public static String W(int i10, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static b X(CharSequence charSequence, String[] strArr, final boolean z10, int i10) {
        c0(i10);
        final List listH = Q3.d.h(strArr);
        return new b(charSequence, 0, i10, new p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[EDGE_INSN: B:59:0x00f9->B:60:0x00fa BREAK  A[LOOP:0: B:31:0x0083->B:42:0x00b9]] */
            @Override // Ia.p
            public final Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                Object next;
                Pair pair;
                String str;
                Object next2;
                String str2;
                Object objF0;
                CharSequence $receiver = charSequence2;
                int iIntValue = num.intValue();
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                List<String> list = listH;
                boolean z11 = z10;
                if (z11 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    Na.i iVar = new Na.i(iIntValue, $receiver.length(), 1);
                    boolean z12 = $receiver instanceof String;
                    int i11 = iVar.f4689d;
                    int i12 = iVar.f4688c;
                    if (!z12) {
                        if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                            while (true) {
                                Iterator<T> it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str = (String) next;
                                } while (!n.Y(str, 0, $receiver, iIntValue, str.length(), z11));
                                String str3 = (String) next;
                                if (str3 == null) {
                                    if (iIntValue == i12) {
                                        pair = null;
                                        break;
                                    }
                                    iIntValue += i11;
                                } else {
                                    pair = new Pair(Integer.valueOf(iIntValue), str3);
                                    break;
                                }
                            }
                        } else {
                            pair = null;
                            break;
                        }
                    } else if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                        while (true) {
                            Iterator<T> it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str2 = (String) next2;
                            } while (!m.E(0, iIntValue, str2.length(), str2, (String) $receiver, z11));
                            String str4 = (String) next2;
                            if (str4 == null) {
                                if (iIntValue == i12) {
                                    pair = null;
                                    break;
                                }
                                iIntValue += i11;
                            } else {
                                pair = new Pair(Integer.valueOf(iIntValue), str4);
                                break;
                            }
                        }
                    } else {
                        pair = null;
                        break;
                    }
                } else {
                    List<String> list2 = list;
                    if (list2 instanceof List) {
                        objF0 = q.f0(list2);
                    } else {
                        Iterator<T> it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next3 = it3.next();
                        if (it3.hasNext()) {
                            throw new IllegalArgumentException("Collection has more than one element.");
                        }
                        objF0 = next3;
                    }
                    String str5 = (String) objF0;
                    int iQ = n.Q($receiver, str5, iIntValue, false, 4);
                    if (iQ < 0) {
                        pair = null;
                        break;
                    }
                    pair = new Pair(Integer.valueOf(iQ), str5);
                }
                if (pair != null) {
                    return new Pair<>(pair.c(), Integer.valueOf(((String) pair.d()).length()));
                }
                return null;
            }
        });
    }

    public static final boolean Y(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!O.h.g(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String Z(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        if (!h0(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a0(String str, String str2) {
        if (!M(str2, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (str.length() < 2 || !h0(str, "\"") || !M("\"", str)) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void c0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List d0(int i10, CharSequence charSequence, String str, boolean z10) {
        c0(i10);
        int length = 0;
        int iO = O(0, charSequence, str, z10);
        if (iO == -1 || i10 == 1) {
            return M1.k(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i11 = 10;
        if (z11 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(length, iO).toString());
            length = str.length() + iO;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iO = O(length, charSequence, str, z10);
        } while (iO != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List e0(CharSequence charSequence, String[] strArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return d0(i10, charSequence, str, false);
            }
        }
        kotlin.sequences.l lVar = new kotlin.sequences.l(X(charSequence, strArr, false, i10));
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (true) {
            b.a aVar = (b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(i0(charSequence, (Na.i) aVar.next()));
        }
    }

    public static List f0(String str, final char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        final boolean z10 = false;
        if (cArr.length == 1) {
            return d0(0, str, String.valueOf(cArr[0]), false);
        }
        c0(0);
        kotlin.sequences.l lVar = new kotlin.sequences.l(new b(str, 0, 0, new p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
                CharSequence $receiver = charSequence;
                int iIntValue = num.intValue();
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                int iR = n.R($receiver, cArr, iIntValue, z10);
                if (iR < 0) {
                    return null;
                }
                return new Pair<>(Integer.valueOf(iR), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (true) {
            b.a aVar = (b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(i0(str, (Na.i) aVar.next()));
        }
    }

    public static boolean g0(String str, char c10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return str.length() > 0 && O.h.g(str.charAt(0), c10, false);
    }

    public static boolean h0(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return m.I(str, prefix, false);
    }

    public static final String i0(CharSequence charSequence, Na.i range) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(range, "range");
        return charSequence.subSequence(range.f4687b, range.f4688c + 1).toString();
    }

    public static String j0(char c10, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iP = P(str, c10, 0, false, 6);
        if (iP == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iP + 1, str.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String k0(String missingDelimiterValue, String delimiter) {
        kotlin.jvm.internal.i.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iQ = Q(missingDelimiterValue, delimiter, 0, false, 6);
        if (iQ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iQ, missingDelimiterValue.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String l0(char c10, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iU = U(str, c10, 0, 6);
        if (iU == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iU + 1, str.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String m0(String str, char c10) {
        int iP = P(str, c10, 0, false, 6);
        if (iP == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iP);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String n0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.i.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iQ = Q(missingDelimiterValue, str, 0, false, 6);
        if (iQ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iQ);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o0(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.i.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iU = U(missingDelimiterValue, c10, 0, 6);
        if (iU == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iU);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence p0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zJ = O.h.j(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zJ) {
                    break;
                }
                length--;
            } else if (zJ) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
