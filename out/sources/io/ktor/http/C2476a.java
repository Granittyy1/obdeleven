package io.ktor.http;

import androidx.compose.animation.core.H;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: io.ktor.http.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ContentTypes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2476a extends H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2476a f40466f = new C2476a("*", "*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40468e;

    /* JADX INFO: renamed from: io.ktor.http.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class C0457a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2476a f40469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2476a f40470b;

        static {
            new C2476a("application", "*");
            new C2476a("application", "atom+xml");
            new C2476a("application", "cbor");
            f40469a = new C2476a("application", "json");
            new C2476a("application", "hal+json");
            new C2476a("application", "javascript");
            f40470b = new C2476a("application", "octet-stream");
            new C2476a("application", "rss+xml");
            new C2476a("application", "xml");
            new C2476a("application", "xml-dtd");
            new C2476a("application", "zip");
            new C2476a("application", "gzip");
            new C2476a("application", "x-www-form-urlencoded");
            new C2476a("application", "pdf");
            new C2476a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            new C2476a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
            new C2476a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
            new C2476a("application", "protobuf");
            new C2476a("application", "wasm");
            new C2476a("application", "problem+json");
            new C2476a("application", "problem+xml");
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.a$b */
    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class b {
        public static C2476a a(String str) throws BadContentTypeFormatException {
            int i10;
            Pair pair;
            if (kotlin.text.n.S(str)) {
                return C2476a.f40466f;
            }
            p293xa.g gVarB = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<ArrayList<d>>() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseHeaderValue$items$1
                @Override // Ia.a
                public final ArrayList<d> invoke() {
                    return new ArrayList<>();
                }
            });
            for (int i11 = 0; i11 <= kotlin.text.n.N(str); i11 = i10) {
                p293xa.g gVarB2 = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<ArrayList<e>>() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseHeaderValueItem$parameters$1
                    @Override // Ia.a
                    public final ArrayList<e> invoke() {
                        return new ArrayList<>();
                    }
                });
                Integer numValueOf = null;
                i10 = i11;
                while (true) {
                    if (i10 > kotlin.text.n.N(str)) {
                        ((ArrayList) gVarB.getValue()).add(new d(j.b(str, i11, numValueOf != null ? numValueOf.intValue() : i10), gVarB2.d() ? (List) gVarB2.getValue() : EmptyList.f42983b));
                        break;
                    }
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == ',') {
                        ((ArrayList) gVarB.getValue()).add(new d(j.b(str, i11, numValueOf != null ? numValueOf.intValue() : i10), gVarB2.d() ? (List) gVarB2.getValue() : EmptyList.f42983b));
                        i10++;
                        break;
                    }
                    if (cCharAt == ';') {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i10);
                        }
                        int i12 = i10 + 1;
                        int i13 = i12;
                        while (true) {
                            if (i13 <= kotlin.text.n.N(str)) {
                                char cCharAt2 = str.charAt(i13);
                                if (cCharAt2 == '=') {
                                    int i14 = i13 + 1;
                                    if (str.length() != i14) {
                                        char c10 = '\"';
                                        if (str.charAt(i14) != '\"') {
                                            int i15 = i14;
                                            while (true) {
                                                if (i15 > kotlin.text.n.N(str)) {
                                                    pair = new Pair(Integer.valueOf(i15), j.b(str, i14, i15));
                                                    break;
                                                }
                                                char cCharAt3 = str.charAt(i15);
                                                if (cCharAt3 == ';' || cCharAt3 == ',') {
                                                    pair = new Pair(Integer.valueOf(i15), j.b(str, i14, i15));
                                                    break;
                                                }
                                                i15++;
                                            }
                                        } else {
                                            int i16 = i13 + 2;
                                            StringBuilder sb2 = new StringBuilder();
                                            while (true) {
                                                if (i16 > kotlin.text.n.N(str)) {
                                                    Integer numValueOf2 = Integer.valueOf(i16);
                                                    String string = sb2.toString();
                                                    kotlin.jvm.internal.i.d(string, "builder.toString()");
                                                    pair = new Pair(numValueOf2, "\"".concat(string));
                                                    break;
                                                }
                                                char cCharAt4 = str.charAt(i16);
                                                if (cCharAt4 == c10) {
                                                    int i17 = i16 + 1;
                                                    int i18 = i17;
                                                    while (i18 < str.length() && str.charAt(i18) == ' ') {
                                                        i18++;
                                                    }
                                                    if (i18 == str.length() || str.charAt(i18) == ';') {
                                                        Integer numValueOf3 = Integer.valueOf(i17);
                                                        String string2 = sb2.toString();
                                                        kotlin.jvm.internal.i.d(string2, "builder.toString()");
                                                        pair = new Pair(numValueOf3, string2);
                                                        break;
                                                    }
                                                }
                                                if (cCharAt4 != '\\' || i16 >= kotlin.text.n.N(str) - 2) {
                                                    sb2.append(cCharAt4);
                                                    i16++;
                                                } else {
                                                    sb2.append(str.charAt(i16 + 1));
                                                    i16 += 2;
                                                }
                                                c10 = '\"';
                                            }
                                        }
                                    } else {
                                        pair = new Pair(Integer.valueOf(i14), "");
                                    }
                                    int iIntValue = ((Number) pair.a()).intValue();
                                    j.a(gVarB2, str, i12, i13, (String) pair.b());
                                    i10 = iIntValue;
                                    break;
                                }
                                if (cCharAt2 == ';' || cCharAt2 == ',') {
                                    j.a(gVarB2, str, i12, i13, "");
                                } else {
                                    i13++;
                                }
                            } else {
                                j.a(gVarB2, str, i12, i13, "");
                            }
                            i10 = i13;
                            break;
                        }
                    }
                    i10++;
                }
            }
            d dVar = (d) kotlin.collections.q.V(gVarB.d() ? (List) gVarB.getValue() : EmptyList.f42983b);
            String str2 = dVar.f40474a;
            int iP = kotlin.text.n.P(str2, '/', 0, false, 6);
            if (iP == -1) {
                if (kotlin.jvm.internal.i.a(kotlin.text.n.p0(str2).toString(), "*")) {
                    return C2476a.f40466f;
                }
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            String strSubstring = str2.substring(0, iP);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string3 = kotlin.text.n.p0(strSubstring).toString();
            if (string3.length() == 0) {
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            String strSubstring2 = str2.substring(iP + 1);
            kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string4 = kotlin.text.n.p0(strSubstring2).toString();
            if (kotlin.text.n.K(string3, ' ') || kotlin.text.n.K(string4, ' ')) {
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            if (string4.length() == 0 || kotlin.text.n.K(string4, '/')) {
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            return new C2476a(string3, string4, dVar.f40475b);
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.a$c */
    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2476a f40471a;

        static {
            new C2476a(AttributeType.TEXT, "*");
            f40471a = new C2476a(AttributeType.TEXT, "plain");
            new C2476a(AttributeType.TEXT, "css");
            new C2476a(AttributeType.TEXT, "csv");
            new C2476a(AttributeType.TEXT, "html");
            new C2476a(AttributeType.TEXT, "javascript");
            new C2476a(AttributeType.TEXT, "vcard");
            new C2476a(AttributeType.TEXT, "xml");
            new C2476a(AttributeType.TEXT, "event-stream");
        }
    }

    public C2476a(String str, String str2, String str3, List<e> list) {
        super(str3, list);
        this.f40467d = str;
        this.f40468e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2476a) {
            C2476a c2476a = (C2476a) obj;
            if (kotlin.text.m.D(this.f40467d, c2476a.f40467d, true) && kotlin.text.m.D(this.f40468e, c2476a.f40468e, true)) {
                if (kotlin.jvm.internal.i.a((List) this.f9363c, (List) c2476a.f9363c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f40467d.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f40468e.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (((List) this.f9363c).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2476a(String contentType, String contentSubtype, List<e> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        kotlin.jvm.internal.i.e(contentType, "contentType");
        kotlin.jvm.internal.i.e(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.i.e(parameters, "parameters");
    }

    public C2476a(String str, String str2) {
        this(str, str2, EmptyList.f42983b);
    }
}
