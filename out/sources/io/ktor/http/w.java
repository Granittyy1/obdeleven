package io.ktor.http;

import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Query.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final void a(t tVar, String str, int i10, int i11, int i12, boolean z10) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iC = c(str, i10, i12);
            int iB = b(str, iC, i12);
            if (iB > iC) {
                if (z10) {
                    strSubstring3 = CodecsKt.e(str, iC, iB, false, 12);
                } else {
                    strSubstring3 = str.substring(iC, iB);
                    kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                tVar.b(strSubstring3, EmptyList.f42983b);
                return;
            }
            return;
        }
        int iC2 = c(str, i10, i11);
        int iB2 = b(str, iC2, i11);
        if (iB2 > iC2) {
            if (z10) {
                strSubstring = CodecsKt.e(str, iC2, iB2, false, 12);
            } else {
                strSubstring = str.substring(iC2, iB2);
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int iC3 = c(str, i11 + 1, i12);
            int iB3 = b(str, iC3, i12);
            if (z10) {
                strSubstring2 = CodecsKt.e(str, iC3, iB3, true, 8);
            } else {
                strSubstring2 = str.substring(iC3, iB3);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            tVar.d(strSubstring, strSubstring2);
        }
    }

    public static final int b(String str, int i10, int i11) {
        while (i11 > i10 && O.h.j(str.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    public static final int c(String str, int i10, int i11) {
        while (i10 < i11 && O.h.j(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
