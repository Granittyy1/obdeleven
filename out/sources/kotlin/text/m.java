package kotlin.text;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public class m extends l {
    public static boolean C(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : E(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean D(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean E(int i10, int i11, int i12, String str, String other, boolean z10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String F(int i10, String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.b(string);
        return string;
    }

    public static String G(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(oldValue, "oldValue");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int iO = n.O(0, str, oldValue, false);
        if (iO < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iO);
            sb2.append(newValue);
            i11 = iO + length;
            if (iO >= str.length()) {
                break;
            }
            iO = n.O(iO + i10, str, oldValue, false);
        } while (iO > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static boolean H(String str, String str2, int i10, boolean z10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : E(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean I(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : E(0, 0, prefix.length(), str, prefix, z10);
    }
}
