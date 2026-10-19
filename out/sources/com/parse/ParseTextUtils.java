package com.parse;

/* JADX INFO: loaded from: classes3.dex */
class ParseTextUtils {
    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String join(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Object obj : iterable) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }
}
