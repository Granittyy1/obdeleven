package p028c2;

import X1.c;
import X1.l;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p114j1.f;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: SubripParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f22276d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f22277e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f22278a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f22279b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f22280c = new r();

    public static p102i1.a c(Spanned spanned, String str) {
        byte b10;
        byte b11;
        float f10;
        p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
        c0382a.f36527a = spanned;
        if (str == null) {
            return c0382a.a();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            c0382a.f36535i = 0;
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            c0382a.f36535i = 2;
        } else {
            c0382a.f36535i = 1;
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            c0382a.f36533g = 2;
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            c0382a.f36533g = 0;
        } else {
            c0382a.f36533g = 1;
        }
        int i10 = c0382a.f36535i;
        float f11 = 0.08f;
        if (i10 == 0) {
            f10 = 0.08f;
        } else if (i10 == 1) {
            f10 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        c0382a.f36534h = f10;
        int i11 = c0382a.f36533g;
        if (i11 != 0) {
            if (i11 == 1) {
                f11 = 0.5f;
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                f11 = 0.92f;
            }
        }
        c0382a.f36531e = f11;
        c0382a.f36532f = 0;
        return c0382a.a();
    }

    public static long d(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        f<c> fVar2;
        String str;
        a aVar = this;
        f<c> fVar3 = fVar;
        r rVar = aVar.f22280c;
        rVar.E(i10 + i11, bArr);
        rVar.G(i10);
        Charset charsetC = rVar.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        long j = bVar.f7153a;
        ArrayList arrayList = (j == -9223372036854775807L || !bVar.f7154b) ? null : new ArrayList();
        while (true) {
            String strI = rVar.i(charsetC);
            if (strI == null) {
                break;
            }
            if (strI.length() != 0) {
                try {
                    Integer.parseInt(strI);
                    String strI2 = rVar.i(charsetC);
                    if (strI2 == null) {
                        k.f("Unexpected end");
                        break;
                    }
                    Matcher matcher = f22276d.matcher(strI2);
                    if (matcher.matches()) {
                        long jD = d(matcher, 1);
                        long jD2 = d(matcher, 6);
                        StringBuilder sb2 = aVar.f22278a;
                        sb2.setLength(0);
                        ArrayList<String> arrayList2 = aVar.f22279b;
                        arrayList2.clear();
                        for (String strI3 = rVar.i(charsetC); !TextUtils.isEmpty(strI3); strI3 = rVar.i(charsetC)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strI3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = f22277e.matcher(strTrim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                Matcher matcher3 = matcher2;
                                int iStart = matcher2.start() - i12;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i12 += length;
                                matcher2 = matcher3;
                                jD2 = jD2;
                            }
                            sb2.append(sb3.toString());
                            jD2 = jD2;
                        }
                        long j10 = jD2;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (j == -9223372036854775807L || jD >= j) {
                            c cVar = new c(jD, j10 - jD, ImmutableList.M(c(spannedFromHtml, str)));
                            fVar2 = fVar;
                            fVar2.a(cVar);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new c(jD, j10 - jD, ImmutableList.M(c(spannedFromHtml, str))));
                            }
                            fVar2 = fVar;
                        }
                    } else {
                        fVar2 = fVar3;
                        k.f("Skipping invalid timing: ".concat(strI2));
                    }
                    fVar3 = fVar2;
                    aVar = this;
                } catch (NumberFormatException unused) {
                    fVar2 = fVar3;
                    k.f("Skipping invalid index: ".concat(strI));
                }
            }
        }
        f<c> fVar4 = fVar3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar4.a((c) it.next());
            }
        }
    }
}
