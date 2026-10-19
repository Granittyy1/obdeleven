package kotlin.text;

import D2.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes2.dex */
public class i extends V {
    public static String v(String str) {
        int length;
        Comparable comparable;
        String strR0;
        kotlin.jvm.internal.i.e(str, "<this>");
        List listV = n.V(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (!n.S((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!O.h.j(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listV.size();
        int iR = kotlin.collections.l.r(listV);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listV) {
            int i10 = length + 1;
            if (length < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iR) && n.S(str3)) {
                strR0 = null;
            } else {
                strR0 = o.r0(iIntValue, str3);
                StringsKt__IndentKt$getIndentFunction$1.f43117h.getClass();
            }
            if (strR0 != null) {
                arrayList3.add(strR0);
            }
            length = i10;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        q.T(arrayList3, sb2, "\n", null, R.styleable.AppCompatTheme_windowMinWidthMajor);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static String w(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (n.S("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listV = n.V(str);
        int length = str.length();
        listV.size();
        int iR = kotlin.collections.l.r(listV);
        ArrayList arrayList = new ArrayList();
        Iterator it = listV.iterator();
        int i10 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                q.T(arrayList, sb2, "\n", null, R.styleable.AppCompatTheme_windowMinWidthMajor);
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            String str2 = (String) next;
            if ((i10 != 0 && i10 != iR) || !n.S(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!O.h.j(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && m.H(str2, "|", i12, false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                }
                if (strSubstring != null) {
                    StringsKt__IndentKt$getIndentFunction$1.f43117h.getClass();
                } else {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
    }
}
