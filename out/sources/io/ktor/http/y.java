package io.ktor.http;

import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: URLBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final void a(x xVar, StringBuilder sb2) {
        List listK;
        sb2.append(xVar.f40516a.f40445a);
        String str = xVar.f40516a.f40445a;
        if (str.equals("file")) {
            CharSequence charSequence = xVar.f40517b;
            String strC = c(xVar);
            sb2.append("://");
            sb2.append(charSequence);
            if (!kotlin.text.n.g0(strC, '/')) {
                sb2.append('/');
            }
            sb2.append((CharSequence) strC);
            return;
        }
        if (str.equals("mailto")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = xVar.f40520e;
            String str3 = xVar.f40521f;
            if (str2 != null) {
                sb3.append(str2);
                if (str3 != null) {
                    sb3.append(':');
                    sb3.append(str3);
                }
                sb3.append("@");
            }
            CharSequence string = sb3.toString();
            kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
            CharSequence charSequence2 = xVar.f40517b;
            sb2.append(":");
            sb2.append(string);
            sb2.append(charSequence2);
            return;
        }
        sb2.append("://");
        sb2.append(b(xVar));
        String encodedPath = c(xVar);
        t encodedQueryParameters = xVar.f40524i;
        boolean z10 = xVar.f40519d;
        kotlin.jvm.internal.i.e(encodedPath, "encodedPath");
        kotlin.jvm.internal.i.e(encodedQueryParameters, "encodedQueryParameters");
        if (!kotlin.text.n.S(encodedPath) && !kotlin.text.m.I(encodedPath, "/", false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) encodedPath);
        if (!encodedQueryParameters.f40530a.isEmpty() || z10) {
            sb2.append("?");
        }
        Set<Map.Entry<String, List<String>>> setA = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listK = M1.k(new Pair(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it2.next()));
                }
                listK = arrayList2;
            }
            kotlin.collections.p.z(arrayList, listK);
        }
        kotlin.collections.q.T(arrayList, sb2, "&", new Ia.l<Pair<? extends String, ? extends String>, CharSequence>() { // from class: io.ktor.http.URLUtilsKt$appendUrlFullPath$2
            @Override // Ia.l
            public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
                Pair<? extends String, ? extends String> it3 = pair;
                kotlin.jvm.internal.i.e(it3, "it");
                String strC2 = it3.c();
                if (it3.d() == null) {
                    return strC2;
                }
                return strC2 + '=' + String.valueOf(it3.d());
            }
        }, 60);
        if (xVar.f40522g.length() > 0) {
            sb2.append('#');
            sb2.append(xVar.f40522g);
        }
    }

    public static final String b(x xVar) {
        kotlin.jvm.internal.i.e(xVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = xVar.f40520e;
        String str2 = xVar.f40521f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(xVar.f40517b);
        int i10 = xVar.f40518c;
        if (i10 != 0 && i10 != xVar.f40516a.f40446b) {
            sb2.append(":");
            sb2.append(String.valueOf(xVar.f40518c));
        }
        String string2 = sb2.toString();
        kotlin.jvm.internal.i.d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public static final String c(x xVar) {
        kotlin.jvm.internal.i.e(xVar, "<this>");
        List<String> list = xVar.f40523h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) kotlin.collections.q.O(list)).length() == 0 ? "/" : (String) kotlin.collections.q.O(list);
        }
        return kotlin.collections.q.U(list, "/", null, null, null, 62);
    }

    public static final void d(x xVar, String value) {
        List<String> listP0;
        kotlin.jvm.internal.i.e(xVar, "<this>");
        kotlin.jvm.internal.i.e(value, "value");
        if (kotlin.text.n.S(value)) {
            listP0 = EmptyList.f42983b;
        } else {
            listP0 = value.equals("/") ? z.f40525a : kotlin.collections.q.p0(kotlin.text.n.f0(value, new char[]{'/'}));
        }
        kotlin.jvm.internal.i.e(listP0, "<set-?>");
        xVar.f40523h = listP0;
    }
}
