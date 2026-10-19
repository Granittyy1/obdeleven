package p054e2;

import X1.c;
import X1.l;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p114j1.A;
import p114j1.f;
import p114j1.k;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: Tx3gParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34714a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34720g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f34716c = 0;
            this.f34717d = -1;
            this.f34718e = "sans-serif";
            this.f34715b = false;
            this.f34719f = 0.85f;
            this.f34720g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f34716c = bArr[24];
        this.f34717d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i10 = A.f40996a;
        this.f34718e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f34720g = i11;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f34715b = z10;
        if (z10) {
            this.f34719f = A.f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, 0.0f, 0.95f);
        } else {
            this.f34719f = 0.85f;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        String strS;
        r rVar = this.f34714a;
        rVar.E(i10 + i11, bArr);
        rVar.G(i10);
        int i12 = 1;
        int i13 = 0;
        b.e(rVar.a() >= 2);
        int iA = rVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i14 = rVar.f41063b;
            Charset charsetC = rVar.C();
            int i15 = iA - (rVar.f41063b - i14);
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strS = rVar.s(i15, charsetC);
        }
        if (strS.isEmpty()) {
            fVar.a(new c(-9223372036854775807L, -9223372036854775807L, ImmutableList.K()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        d(spannableStringBuilder, this.f34716c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.f34717d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f34718e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f34719f;
        while (rVar.a() >= 8) {
            int i16 = rVar.f41063b;
            int iH = rVar.h();
            int iH2 = rVar.h();
            if (iH2 == 1937013100) {
                b.e(rVar.a() >= 2 ? i12 : i13);
                int iA2 = rVar.A();
                int i17 = i13;
                while (i17 < iA2) {
                    b.e(rVar.a() >= 12 ? i12 : i13);
                    int iA3 = rVar.A();
                    int iA4 = rVar.A();
                    rVar.H(2);
                    int iU = rVar.u();
                    rVar.H(i12);
                    int iH3 = rVar.h();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbE = A8.f.e(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbE.append(spannableStringBuilder.length());
                        sbE.append(").");
                        k.f(sbE.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        k.f("Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                    } else {
                        int i18 = iA4;
                        d(spannableStringBuilder, iU, this.f34716c, iA3, i18, 0);
                        c(spannableStringBuilder, iH3, this.f34717d, iA3, i18, 0);
                    }
                    i17++;
                    i12 = 1;
                    i13 = 0;
                }
            } else if (iH2 == 1952608120 && this.f34715b) {
                b.e(rVar.a() >= 2);
                f10 = A.f(rVar.A() / this.f34720g, 0.0f, 0.95f);
            }
            rVar.G(i16 + iH);
            i12 = 1;
            i13 = 0;
        }
        p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
        c0382a.f36527a = spannableStringBuilder;
        c0382a.f36531e = f10;
        c0382a.f36532f = 0;
        c0382a.f36533g = 0;
        fVar.a(new c(-9223372036854775807L, -9223372036854775807L, ImmutableList.M(c0382a.a())));
    }
}
