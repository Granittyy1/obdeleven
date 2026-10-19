package p141l2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.ui.dialogs.A;
import io.intercom.android.sdk.b;
import io.intercom.android.sdk.m5.conversation.ui.C2404t;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.d;
import io.intercom.android.sdk.survey.ui.questiontype.files.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.l;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.e;
import kotlin.text.m;
import kotlin.text.n;
import p037cb.C1518c0;
import p248u2.f;
import p271w0.c;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: NavDeepLink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Regex f44321m = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Regex f44322n = new Regex("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Regex f44323o = new Regex("http[s]?://");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Regex f44324p = new Regex(".*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Regex f44325q = new Regex("([^/]*?|)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Regex f44326r = new Regex("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f44330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f44331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f44332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f44334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f44335i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f44336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f44337l;

    /* JADX INFO: compiled from: NavDeepLink.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f44339b = new ArrayList();
    }

    public z(String str) {
        this.f44327a = str;
        ArrayList arrayList = new ArrayList();
        this.f44328b = arrayList;
        this.f44330d = kotlin.a.a(new t(1, this));
        this.f44331e = kotlin.a.a(new A(2, this));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f44332f = kotlin.a.b(lazyThreadSafetyMode, new io.intercom.android.sdk.m5.inbox.a(1, this));
        this.f44334h = kotlin.a.b(lazyThreadSafetyMode, new d(1, this));
        int i10 = 4;
        this.f44335i = kotlin.a.b(lazyThreadSafetyMode, new b(i10, this));
        this.j = kotlin.a.b(lazyThreadSafetyMode, new C1518c0(i10, this));
        this.f44336k = kotlin.a.a(new Ya.d(2, this));
        kotlin.a.a(new C2404t(1, this));
        StringBuilder sb2 = new StringBuilder("^");
        if (!f44321m.a(str)) {
            sb2.append(f44323o.c());
        }
        kotlin.text.g gVarB = Regex.b(new Regex("(\\?|#|$)"), str);
        if (gVarB != null) {
            boolean z10 = false;
            String strSubstring = str.substring(0, gVarB.a().f4687b);
            i.d(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb2);
            if (!f44324p.a(sb2) && !f44325q.a(sb2)) {
                z10 = true;
            }
            this.f44337l = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        this.f44329c = g(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i10 = 0;
        for (kotlin.text.g gVarB = Regex.b(f44322n, str); gVarB != null; gVarB = gVarB.b()) {
            e eVarK = gVarB.f43153c.k(1);
            i.b(eVarK);
            arrayList.add(eVarK.f43149a);
            if (gVarB.a().f4687b > i10) {
                String strSubstring = str.substring(i10, gVarB.a().f4687b);
                i.d(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                i.d(strQuote, "quote(...)");
                sb2.append(strQuote);
            }
            sb2.append(f44325q.c());
            i10 = gVarB.a().f4688c + 1;
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            i.d(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            i.d(strQuote2, "quote(...)");
            sb2.append(strQuote2);
        }
    }

    public static String g(String str) {
        if (n.J(str, "\\Q", false) && n.J(str, "\\E", false)) {
            return m.G(str, ".*", "\\E.*\\Q");
        }
        return n.J(str, "\\.\\*", false) ? m.G(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        String str = this.f44327a;
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        i.d(uri2, "parse(...)");
        List<String> list = pathSegments;
        List<String> other = uri2.getPathSegments();
        i.e(list, "<this>");
        i.e(other, "other");
        Set setR0 = q.r0(list);
        if (!(other instanceof Collection)) {
            other = q.o0(other);
        }
        setR0.retainAll(other);
        return setR0.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, xa.g] */
    public final ArrayList c() {
        ArrayList arrayList = this.f44328b;
        Collection collectionValues = ((Map) this.f44332f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p.z(arrayList2, ((a) it.next()).f44339b);
        }
        return q.c0(q.c0(arrayList, arrayList2), (List) this.f44335i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, xa.g] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        kotlin.text.g gVarD;
        kotlin.text.g gVarD2;
        String strDecode;
        i.e(deepLink, "deepLink");
        i.e(arguments, "arguments");
        Regex regex = (Regex) this.f44330d.getValue();
        if (regex == null || (gVarD = regex.d(deepLink.toString())) == null) {
            return null;
        }
        y.p();
        int i10 = 0;
        Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        if (!e(gVarD, bundleB, arguments)) {
            return null;
        }
        if (((Boolean) this.f44331e.getValue()).booleanValue() && !f(deepLink, bundleB, arguments)) {
            return null;
        }
        String fragment = deepLink.getFragment();
        Regex regex2 = (Regex) this.f44336k.getValue();
        if (regex2 != null && (gVarD2 = regex2.d(String.valueOf(fragment))) != null) {
            List list = (List) this.f44335i.getValue();
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    l.x();
                    throw null;
                }
                String str = (String) obj;
                e eVarK = gVarD2.f43153c.k(i11);
                if (eVarK != null) {
                    strDecode = Uri.decode(eVarK.f43149a);
                    i.d(strDecode, "decode(...)");
                } else {
                    strDecode = null;
                }
                if (strDecode == null) {
                    strDecode = "";
                }
                r rVar = (r) arguments.get(str);
                if (rVar != null) {
                    try {
                        rVar.f44288a.parseAndPut(bundleB, str, strDecode);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    f.d(bundleB, str, strDecode);
                }
                arrayList.add(r.f47939a);
                i10 = i11;
            }
        }
        if (C.e.j(arguments, new io.intercom.android.sdk.tickets.create.model.e(1, bundleB)).isEmpty()) {
            return bundleB;
        }
        return null;
    }

    public final boolean e(kotlin.text.g gVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f44328b;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            String strDecode = null;
            if (i10 < 0) {
                l.x();
                throw null;
            }
            String str = (String) obj;
            e eVarK = gVar.f43153c.k(i11);
            if (eVarK != null) {
                strDecode = Uri.decode(eVarK.f43149a);
                i.d(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            r rVar = (r) linkedHashMap.get(str);
            if (rVar != null) {
                try {
                    rVar.f44288a.parseAndPut(bundle, str, strDecode);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                f.d(bundle, str, strDecode);
            }
            arrayList2.add(r.f47939a);
            i10 = i11;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        return this.f44327a.equals(((z) obj).f44327a) && i.a(null, null) && i.a(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xa.g] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z10;
        String query;
        for (Map.Entry entry : ((Map) this.f44332f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f44333g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = M1.k(query);
            }
            y.p();
            boolean z11 = false;
            Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = aVar.f44339b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                r rVar = (r) linkedHashMap.get(str2);
                L<Object> l10 = rVar != null ? rVar.f44288a : null;
                if ((l10 instanceof AbstractC2735e) && !rVar.f44290c) {
                    AbstractC2735e abstractC2735e = (AbstractC2735e) l10;
                    abstractC2735e.put(bundleB, str2, abstractC2735e.a());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = aVar.f44338a;
                kotlin.text.g gVarD = str4 != null ? new Regex(str4).d(str3) : null;
                if (gVarD == null) {
                    return z11;
                }
                ArrayList arrayList = aVar.f44339b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                ?? r13 = z11;
                for (Object obj : arrayList) {
                    int i10 = r13 + 1;
                    if (r13 < 0) {
                        l.x();
                        throw null;
                    }
                    String key = (String) obj;
                    e eVarK = gVarD.f43153c.k(i10);
                    String str5 = eVarK != null ? eVarK.f43149a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    r rVar2 = (r) linkedHashMap.get(key);
                    try {
                        i.e(key, "key");
                        if (bundleB.containsKey(key)) {
                            if (bundleB.containsKey(key)) {
                                if (rVar2 != null) {
                                    L<Object> l11 = rVar2.f44288a;
                                    l11.parseAndPut(bundleB, key, str5, l11.get(bundleB, key));
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            objValueOf = Boolean.valueOf(z10);
                        } else {
                            if (rVar2 != null) {
                                rVar2.f44288a.parseAndPut(bundleB, key, str5);
                            } else {
                                f.d(bundleB, key, str5);
                            }
                            objValueOf = r.f47939a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = r.f47939a;
                    }
                    arrayList2.add(objValueOf);
                    r13 = i10;
                    z11 = false;
                }
            }
            bundle.putAll(bundleB);
        }
        return true;
    }

    public final int hashCode() {
        return this.f44327a.hashCode() * 961;
    }
}
