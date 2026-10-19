package com.voltasit.obdeleven.domain.usecases.odx;

import C4.v;
import java.util.List;
import kotlin.text.n;

/* JADX INFO: compiled from: ExtractOdxNameAndVersionFromFilenameUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static com.obdeleven.service.odx.d a(String odxFileName) {
        String str;
        kotlin.jvm.internal.i.e(odxFileName, "odxFileName");
        List listE0 = n.e0(odxFileName, new String[]{"_"}, 0, 6);
        if (listE0.size() <= 2 || ((String) v.e(1, listE0)).length() >= 6 || ((String) v.e(2, listE0)).length() != 6) {
            str = (listE0.size() <= 1 || ((String) v.e(1, listE0)).length() != 6) ? null : (String) v.e(1, listE0);
        } else {
            str = v.e(2, listE0) + "_" + v.e(1, listE0);
        }
        if (str == null) {
            return null;
        }
        String strSubstring = odxFileName.substring(0, (odxFileName.length() - str.length()) - 1);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return new com.obdeleven.service.odx.d(strSubstring, str);
    }
}
