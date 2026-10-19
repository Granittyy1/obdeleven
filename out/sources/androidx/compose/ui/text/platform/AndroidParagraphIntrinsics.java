package androidx.compose.ui.text.platform;

import V.u;
import V.v;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.N0;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1263d;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.j;
import androidx.compose.ui.text.font.w;
import androidx.compose.ui.text.l;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.q;
import androidx.compose.ui.text.r;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.i;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.t;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.collections.m;
import p013b0.n;
import p013b0.o;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f15606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<C1260a.c<? extends C1260a.InterfaceC0160a>> f15607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<C1260a.c<p>> f15608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f15609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p013b0.c f15610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AndroidTextPaint f15611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f15612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f15613i;
    public D7.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15615l;

    /* JADX WARN: Code duplicated, block: B:11:0x006e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:244:0x047b  */
    /* JADX WARN: Code duplicated, block: B:258:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:259:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:262:0x04da  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:266:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:268:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:269:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:272:0x0521  */
    /* JADX WARN: Code duplicated, block: B:275:0x052b  */
    /* JADX WARN: Code duplicated, block: B:277:0x053c  */
    /* JADX WARN: Code duplicated, block: B:278:0x0541  */
    /* JADX WARN: Code duplicated, block: B:280:0x054c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0553  */
    /* JADX WARN: Code duplicated, block: B:284:0x055e  */
    /* JADX WARN: Code duplicated, block: B:286:0x056a  */
    /* JADX WARN: Code duplicated, block: B:287:0x056d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0570  */
    /* JADX WARN: Code duplicated, block: B:297:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:299:0x05be A[LOOP:6: B:298:0x05bc->B:299:0x05be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:303:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:305:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:306:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0609  */
    /* JADX WARN: Code duplicated, block: B:310:0x060c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0612  */
    /* JADX WARN: Code duplicated, block: B:313:0x0615  */
    /* JADX WARN: Code duplicated, block: B:316:0x0629  */
    /* JADX WARN: Code duplicated, block: B:317:0x062d  */
    /* JADX WARN: Code duplicated, block: B:319:0x0634  */
    /* JADX WARN: Code duplicated, block: B:320:0x0637  */
    /* JADX WARN: Code duplicated, block: B:322:0x063e  */
    /* JADX WARN: Code duplicated, block: B:323:0x0641  */
    /* JADX WARN: Code duplicated, block: B:325:0x0647  */
    /* JADX WARN: Code duplicated, block: B:326:0x064a  */
    /* JADX WARN: Code duplicated, block: B:328:0x0651  */
    /* JADX WARN: Code duplicated, block: B:329:0x0654  */
    /* JADX WARN: Code duplicated, block: B:331:0x065b  */
    /* JADX WARN: Code duplicated, block: B:332:0x065e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0665  */
    /* JADX WARN: Code duplicated, block: B:354:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0677 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List<androidx.compose.ui.text.a$c<? extends androidx.compose.ui.text.a$a>>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.a$c<? extends androidx.compose.ui.text.a$a>>, java.util.List<androidx.compose.ui.text.a$c<? extends androidx.compose.ui.text.a$a>>] */
    public AndroidParagraphIntrinsics(String str, F f10, List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>> list, List<C1260a.c<p>> list2, androidx.compose.ui.text.font.d.a aVar, p013b0.c cVar) {
        Locale locale;
        int i10;
        Object obj;
        ?? arrayList;
        CharSequence charSequence;
        int i11;
        k kVar;
        int i12;
        F f11;
        k kVar2;
        float fC;
        int size;
        int i13;
        int size2;
        int i14;
        Object[] spans;
        int length;
        int i15;
        long jB;
        long j;
        int i16;
        long jB2;
        int i17;
        int i18;
        Object obj2;
        C1263d c1263d;
        float fA;
        long j10;
        long jB3;
        long j11;
        boolean zA;
        long j12;
        long jB4;
        long j13;
        float fC2;
        long jB5;
        float fC3;
        r rVar;
        CharSequence charSequence2;
        Z.c cVar2;
        final AndroidParagraphIntrinsics androidParagraphIntrinsics = this;
        androidParagraphIntrinsics.f15605a = str;
        androidParagraphIntrinsics.f15606b = f10;
        androidParagraphIntrinsics.f15607c = list;
        androidParagraphIntrinsics.f15608d = list2;
        androidParagraphIntrinsics.f15609e = aVar;
        androidParagraphIntrinsics.f15610f = cVar;
        float density = cVar.getDensity();
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1);
        ((TextPaint) androidTextPaint).density = density;
        androidTextPaint.f15617b = androidx.compose.ui.text.style.h.f15670b;
        androidTextPaint.f15618c = 3;
        androidTextPaint.f15619d = k0.f13652d;
        androidParagraphIntrinsics.f15611g = androidTextPaint;
        t tVar = f10.f15320c;
        c cVar3 = e.f15631a;
        c cVar4 = e.f15631a;
        N0<Boolean> n0A = cVar4.f15627a;
        if (n0A == null) {
            if (androidx.emoji2.text.c.d()) {
                n0A = cVar4.a();
                cVar4.f15627a = n0A;
            } else {
                n0A = f.f15632a;
            }
        }
        androidParagraphIntrinsics.f15614k = n0A.getValue().booleanValue();
        int i19 = f10.f15319b.f15593b;
        Z.c cVar5 = f10.f15318a.f15699k;
        if (i.a(i19, 4)) {
            i10 = 2;
        } else if (i.a(i19, 5)) {
            i10 = 3;
        } else if (i.a(i19, 1)) {
            i10 = 0;
        } else if (i.a(i19, 2)) {
            i10 = 1;
        } else {
            if (!(i.a(i19, 3) ? true : i.a(i19, Integer.MIN_VALUE))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((cVar5 == null || (locale = cVar5.f7672b.get(0).f7670a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        }
        androidParagraphIntrinsics.f15615l = i10;
        Ia.r<androidx.compose.ui.text.font.d, androidx.compose.ui.text.font.l, j, androidx.compose.ui.text.font.k, Typeface> rVar2 = new Ia.r<androidx.compose.ui.text.font.d, androidx.compose.ui.text.font.l, j, androidx.compose.ui.text.font.k, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // Ia.r
            public final Typeface invoke(androidx.compose.ui.text.font.d dVar, androidx.compose.ui.text.font.l lVar, j jVar, androidx.compose.ui.text.font.k kVar3) {
                int i20 = jVar.f15436a;
                int i21 = kVar3.f15437a;
                w wVarA = this.this$0.f15609e.a(dVar, lVar, i20, i21);
                if (wVarA instanceof w.a) {
                    Object obj3 = ((w.a) wVarA).f15462b;
                    kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj3;
                }
                D7.l lVar2 = new D7.l(wVarA, this.this$0.j);
                this.this$0.j = lVar2;
                Object obj4 = lVar2.f2862c;
                kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj4;
            }
        };
        androidx.compose.ui.text.style.l lVar = f10.f15319b.f15600i;
        lVar = lVar == null ? androidx.compose.ui.text.style.l.f15681c : lVar;
        androidTextPaint.setFlags(lVar.f15684b ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int i20 = lVar.f15683a;
        if (androidx.compose.ui.text.style.l.a.a(i20, 1)) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (androidx.compose.ui.text.style.l.a.a(i20, 2)) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (androidx.compose.ui.text.style.l.a.a(i20, 3)) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
        androidx.compose.ui.text.v vVar = f10.f15318a;
        int size3 = ((Collection) list).size();
        int i21 = 0;
        while (true) {
            if (i21 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i21);
            if (((C1260a.c) obj).f15418a instanceof androidx.compose.ui.text.v) {
                break;
            } else {
                i21++;
            }
        }
        boolean z10 = obj != null;
        long jB6 = n.b(vVar.f15691b);
        boolean zA2 = o.a(jB6, 4294967296L);
        long j14 = vVar.f15691b;
        if (zA2) {
            androidTextPaint.setTextSize(cVar.s1(j14));
        } else if (o.a(jB6, 8589934592L)) {
            androidTextPaint.setTextSize(n.c(j14) * androidTextPaint.getTextSize());
        }
        androidx.compose.ui.text.font.d dVar = vVar.f15695f;
        if ((dVar == null && vVar.f15693d == null && vVar.f15692c == null) ? false : true) {
            androidx.compose.ui.text.font.l lVar2 = vVar.f15692c;
            lVar2 = lVar2 == null ? androidx.compose.ui.text.font.l.f15442g : lVar2;
            j jVar = vVar.f15693d;
            j jVar2 = new j(jVar != null ? jVar.f15436a : 0);
            androidx.compose.ui.text.font.k kVar3 = vVar.f15694e;
            androidTextPaint.setTypeface((Typeface) rVar2.invoke(dVar, lVar2, jVar2, new androidx.compose.ui.text.font.k(kVar3 != null ? kVar3.f15437a : 65535)));
        }
        Z.c cVar6 = vVar.f15699k;
        if (cVar6 != null) {
            Z.c cVar7 = Z.c.f7671d;
            Z.a aVar2 = Z.d.f7674a;
            aVar2.getClass();
            LocaleList localeList = LocaleList.getDefault();
            synchronized (aVar2.f7669c) {
                cVar2 = aVar2.f7668b;
                if (cVar2 == null || localeList != aVar2.f7667a) {
                    int size4 = localeList.size();
                    ArrayList arrayList2 = new ArrayList(size4);
                    for (int i22 = 0; i22 < size4; i22++) {
                        arrayList2.add(new Z.b(localeList.get(i22)));
                    }
                    Z.c cVar8 = new Z.c(arrayList2);
                    aVar2.f7667a = localeList;
                    aVar2.f7668b = cVar8;
                    cVar2 = cVar8;
                }
            }
            if (!cVar6.equals(cVar2)) {
                ArrayList arrayList3 = new ArrayList(m.y(cVar6, 10));
                Iterator<Z.b> it = cVar6.f7672b.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().f7670a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                androidTextPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        String str2 = vVar.f15696g;
        if (str2 != null && !str2.equals("")) {
            androidTextPaint.setFontFeatureSettings(str2);
        }
        androidx.compose.ui.text.style.j jVar3 = vVar.j;
        if (jVar3 != null && !jVar3.equals(androidx.compose.ui.text.style.j.f15675c)) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * jVar3.f15676a);
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + jVar3.f15677b);
        }
        TextForegroundStyle textForegroundStyle = vVar.f15690a;
        androidTextPaint.d(textForegroundStyle.c());
        androidTextPaint.c(textForegroundStyle.e(), 9205357640488583168L, textForegroundStyle.a());
        androidTextPaint.f(vVar.f15702n);
        androidTextPaint.g(vVar.f15701m);
        androidTextPaint.e(vVar.f15704p);
        long j15 = vVar.f15697h;
        if (o.a(n.b(j15), 4294967296L) && n.c(j15) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float fS1 = cVar.s1(j15);
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(fS1 / textScaleX);
            }
        } else if (o.a(n.b(j15), 8589934592L)) {
            androidTextPaint.setLetterSpacing(n.c(j15));
        }
        boolean z11 = z10 && o.a(n.b(j15), 4294967296L) && n.c(j15) != 0.0f;
        long j16 = H.f13504l;
        long j17 = vVar.f15700l;
        boolean z12 = (H.c(j17, j16) || H.c(j17, H.f13503k)) ? false : true;
        androidx.compose.ui.text.style.a aVar3 = vVar.f15698i;
        boolean z13 = (aVar3 == null || Float.compare(aVar3.f15654a, 0.0f) == 0) ? false : true;
        androidx.compose.ui.text.v vVar2 = (z11 || z12 || z13) ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, z11 ? j15 : n.f20493c, z13 ? aVar3 : null, null, null, z12 ? j17 : j16, null, null, 63103) : null;
        if (vVar2 != null) {
            int size5 = androidParagraphIntrinsics.f15607c.size() + 1;
            arrayList = new ArrayList(size5);
            int i23 = 0;
            while (i23 < size5) {
                arrayList.add(i23 == 0 ? new C1260a.c<>(0, androidParagraphIntrinsics.f15605a.length(), vVar2) : androidParagraphIntrinsics.f15607c.get(i23 - 1));
                i23++;
            }
        } else {
            arrayList = androidParagraphIntrinsics.f15607c;
        }
        String str3 = androidParagraphIntrinsics.f15605a;
        float textSize = androidParagraphIntrinsics.f15611g.getTextSize();
        F f12 = androidParagraphIntrinsics.f15606b;
        List<C1260a.c<p>> list3 = androidParagraphIntrinsics.f15608d;
        p013b0.c cVar9 = androidParagraphIntrinsics.f15610f;
        boolean z14 = androidParagraphIntrinsics.f15614k;
        a.C0164a c0164a = a.f15625a;
        if (z14 && androidx.emoji2.text.c.d()) {
            t tVar2 = f12.f15320c;
            if (tVar2 != null) {
                r rVar3 = tVar2.f15687b;
            }
            CharSequence charSequenceG = androidx.emoji2.text.c.a().g(0, str3.length(), 0, str3);
            kotlin.jvm.internal.i.b(charSequenceG);
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!arrayList.isEmpty() || !list3.isEmpty() || !kotlin.jvm.internal.i.a(f12.f15319b.f15595d, k.f15678c) || (f12.f15319b.f15594c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            if (kotlin.jvm.internal.i.a(f12.f15318a.f15701m, androidx.compose.ui.text.style.h.f15671c)) {
                androidx.compose.ui.text.platform.extensions.a.f(spannableString, a.f15625a, 0, str3.length());
            }
            t tVar3 = f12.f15320c;
            boolean z15 = (tVar3 == null || (rVar = tVar3.f15687b) == null) ? false : rVar.f15648a;
            androidx.compose.ui.text.n nVar = f12.f15319b;
            if (z15 && nVar.f15597f == null) {
                float fB = androidx.compose.ui.text.platform.extensions.a.b(nVar.f15594c, textSize, cVar9);
                if (!Float.isNaN(fB)) {
                    spannableString.setSpan(new X.g(fB), 0, spannableString.length(), 33);
                }
            } else {
                androidx.compose.ui.text.style.f fVar = nVar.f15597f;
                fVar = fVar == null ? androidx.compose.ui.text.style.f.f15661c : fVar;
                float fB2 = androidx.compose.ui.text.platform.extensions.a.b(nVar.f15594c, textSize, cVar9);
                if (!Float.isNaN(fB2)) {
                    int length2 = (spannableString.length() == 0 || kotlin.text.o.s0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i24 = fVar.f15663b;
                    boolean z16 = (i24 & 1) > 0;
                    boolean z17 = (i24 & 16) > 0;
                    i11 = 0;
                    spannableString.setSpan(new X.h(fB2, length2, z16, z17, fVar.f15662a, false), 0, spannableString.length(), 33);
                }
                kVar = nVar.f15595d;
                if (kVar != null) {
                    long jG = G0.a.g(i11);
                    j11 = kVar.f15679a;
                    zA = n.a(j11, jG);
                    j12 = kVar.f15680b;
                    if ((!zA && n.a(j12, G0.a.g(i11))) || (j11 & 1095216660480L) == 0 || (1095216660480L & j12) == 0) {
                        i12 = 0;
                    } else {
                        jB4 = n.b(j11);
                        if (o.a(jB4, 4294967296L)) {
                            fC2 = cVar9.s1(j11);
                            j13 = 8589934592L;
                        } else {
                            j13 = 8589934592L;
                            if (o.a(jB4, 8589934592L)) {
                                fC2 = n.c(j11) * textSize;
                            } else {
                                fC2 = 0.0f;
                            }
                        }
                        jB5 = n.b(j12);
                        float f13 = fC2;
                        if (o.a(jB5, 4294967296L)) {
                            fC3 = cVar9.s1(j12);
                        } else if (o.a(jB5, j13)) {
                            fC3 = n.c(j12) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        i12 = 0;
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(f13), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                    f11 = f12;
                } else {
                    i12 = i11;
                    f11 = f12;
                }
                androidx.compose.ui.text.platform.extensions.a.g(spannableString, f11, arrayList, cVar9, rVar2);
                kVar2 = nVar.f15595d;
                if (kVar2 != null) {
                    j10 = kVar2.f15679a;
                    jB3 = n.b(j10);
                    if (o.a(jB3, 4294967296L)) {
                        fC = cVar9.s1(j10);
                    } else if (o.a(jB3, 8589934592L)) {
                        fC = n.c(j10) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                } else {
                    fC = 0.0f;
                }
                size = ((Collection) arrayList).size();
                for (i13 = i12; i13 < size; i13++) {
                    C1260a.c cVar10 = (C1260a.c) arrayList.get(i13);
                    obj2 = cVar10.f15418a;
                    if (obj2 instanceof C1263d) {
                        c1263d = (C1263d) obj2;
                    } else {
                        c1263d = null;
                    }
                    if (c1263d != null) {
                        fA = androidx.compose.ui.text.platform.extensions.a.a(textSize, cVar9);
                        float fA2 = androidx.compose.ui.text.platform.extensions.a.a(textSize, cVar9);
                        if (Float.isNaN(fA) && !Float.isNaN(fA2)) {
                            androidx.compose.ui.text.platform.extensions.a.f(spannableString, new CustomBulletSpan(fA, fA, fA2, cVar9, fC), cVar10.f15419b, cVar10.f15420c);
                        }
                    }
                }
                size2 = list3.size();
                i14 = i12;
                while (i14 < size2) {
                    List<C1260a.c<p>> list4 = list3;
                    C1260a.c<p> cVar11 = list4.get(i14);
                    p pVar = cVar11.f15418a;
                    int i25 = cVar11.f15419b;
                    int i26 = cVar11.f15420c;
                    spans = spannableString.getSpans(i25, i26, R0.i.class);
                    length = spans.length;
                    for (i15 = i12; i15 < length; i15++) {
                        spannableString.removeSpan((R0.i) spans[i15]);
                    }
                    float fC4 = n.c(pVar.f15603a);
                    jB = n.b(pVar.f15603a);
                    if (o.a(jB, 4294967296L)) {
                        i16 = i12;
                        j = 8589934592L;
                    } else {
                        j = 8589934592L;
                        if (o.a(jB, 8589934592L)) {
                            i16 = 1;
                        } else {
                            i16 = 2;
                        }
                    }
                    long j18 = pVar.f15604b;
                    float fC5 = n.c(j18);
                    jB2 = n.b(j18);
                    if (o.a(jB2, 4294967296L)) {
                        i17 = i12;
                    } else if (o.a(jB2, j)) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    float density2 = cVar9.getDensity() * cVar9.P0();
                    if (q.a(4, 1)) {
                        i18 = i12;
                    } else if (q.a(4, 2)) {
                        i18 = 1;
                    } else if (q.a(4, 3)) {
                        i18 = 2;
                    } else if (q.a(4, 4)) {
                        i18 = 3;
                    } else if (q.a(4, 5)) {
                        i18 = 4;
                    } else if (q.a(4, 6)) {
                        i18 = 5;
                    } else {
                        if (q.a(4, 7)) {
                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                        }
                        i18 = 6;
                    }
                    spannableString.setSpan(new X.i(fC4, i16, fC5, i17, density2, i18), i25, i26, 33);
                    i14++;
                    list3 = list4;
                    i12 = 0;
                }
                androidParagraphIntrinsics = this;
                charSequence2 = spannableString;
            }
            i11 = 0;
            kVar = nVar.f15595d;
            if (kVar != null) {
                long jG2 = G0.a.g(i11);
                j11 = kVar.f15679a;
                zA = n.a(j11, jG2);
                j12 = kVar.f15680b;
                if (!zA) {
                    jB4 = n.b(j11);
                    if (o.a(jB4, 4294967296L)) {
                        fC2 = cVar9.s1(j11);
                        j13 = 8589934592L;
                    } else {
                        j13 = 8589934592L;
                        if (o.a(jB4, 8589934592L)) {
                            fC2 = n.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                    }
                    jB5 = n.b(j12);
                    float f14 = fC2;
                    if (o.a(jB5, 4294967296L)) {
                        fC3 = cVar9.s1(j12);
                    } else if (o.a(jB5, j13)) {
                        fC3 = n.c(j12) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    i12 = 0;
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(f14), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                } else {
                    jB4 = n.b(j11);
                    if (o.a(jB4, 4294967296L)) {
                        fC2 = cVar9.s1(j11);
                        j13 = 8589934592L;
                    } else {
                        j13 = 8589934592L;
                        if (o.a(jB4, 8589934592L)) {
                            fC2 = n.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                    }
                    jB5 = n.b(j12);
                    float f15 = fC2;
                    if (o.a(jB5, 4294967296L)) {
                        fC3 = cVar9.s1(j12);
                    } else if (o.a(jB5, j13)) {
                        fC3 = n.c(j12) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    i12 = 0;
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(f15), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                }
                f11 = f12;
            } else {
                i12 = i11;
                f11 = f12;
            }
            androidx.compose.ui.text.platform.extensions.a.g(spannableString, f11, arrayList, cVar9, rVar2);
            kVar2 = nVar.f15595d;
            if (kVar2 != null) {
                j10 = kVar2.f15679a;
                jB3 = n.b(j10);
                if (o.a(jB3, 4294967296L)) {
                    fC = cVar9.s1(j10);
                } else if (o.a(jB3, 8589934592L)) {
                    fC = n.c(j10) * textSize;
                } else {
                    fC = 0.0f;
                }
            } else {
                fC = 0.0f;
            }
            size = ((Collection) arrayList).size();
            while (i13 < size) {
                C1260a.c cVar12 = (C1260a.c) arrayList.get(i13);
                obj2 = cVar12.f15418a;
                if (obj2 instanceof C1263d) {
                    c1263d = (C1263d) obj2;
                } else {
                    c1263d = null;
                }
                if (c1263d != null) {
                    fA = androidx.compose.ui.text.platform.extensions.a.a(textSize, cVar9);
                    float fA3 = androidx.compose.ui.text.platform.extensions.a.a(textSize, cVar9);
                    if (Float.isNaN(fA)) {
                    }
                }
            }
            size2 = list3.size();
            i14 = i12;
            while (i14 < size2) {
                List<C1260a.c<p>> list5 = list3;
                C1260a.c<p> cVar13 = list5.get(i14);
                p pVar2 = cVar13.f15418a;
                int i27 = cVar13.f15419b;
                int i28 = cVar13.f15420c;
                spans = spannableString.getSpans(i27, i28, R0.i.class);
                length = spans.length;
                while (i15 < length) {
                    spannableString.removeSpan((R0.i) spans[i15]);
                }
                float fC6 = n.c(pVar2.f15603a);
                jB = n.b(pVar2.f15603a);
                if (o.a(jB, 4294967296L)) {
                    i16 = i12;
                    j = 8589934592L;
                } else {
                    j = 8589934592L;
                    if (o.a(jB, 8589934592L)) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                }
                long j19 = pVar2.f15604b;
                float fC7 = n.c(j19);
                jB2 = n.b(j19);
                if (o.a(jB2, 4294967296L)) {
                    i17 = i12;
                } else if (o.a(jB2, j)) {
                    i17 = 1;
                } else {
                    i17 = 2;
                }
                float density3 = cVar9.getDensity() * cVar9.P0();
                if (q.a(4, 1)) {
                    i18 = i12;
                } else if (q.a(4, 2)) {
                    i18 = 1;
                } else if (q.a(4, 3)) {
                    i18 = 2;
                } else if (q.a(4, 4)) {
                    i18 = 3;
                } else if (q.a(4, 5)) {
                    i18 = 4;
                } else if (q.a(4, 6)) {
                    i18 = 5;
                } else {
                    if (q.a(4, 7)) {
                        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                    }
                    i18 = 6;
                }
                spannableString.setSpan(new X.i(fC6, i16, fC7, i17, density3, i18), i27, i28, 33);
                i14++;
                list3 = list5;
                i12 = 0;
            }
            androidParagraphIntrinsics = this;
            charSequence2 = spannableString;
        }
        charSequence2 = charSequence;
        androidParagraphIntrinsics.f15612h = charSequence2;
        androidParagraphIntrinsics.f15613i = new v(charSequence2, androidParagraphIntrinsics.f15611g, androidParagraphIntrinsics.f15615l);
    }

    @Override // androidx.compose.ui.text.l
    public final boolean a() {
        D7.l lVar = this.j;
        if (!(lVar != null ? lVar.b() : false)) {
            if (this.f15614k) {
                return false;
            }
            t tVar = this.f15606b.f15320c;
            c cVar = e.f15631a;
            c cVar2 = e.f15631a;
            N0<Boolean> n0A = cVar2.f15627a;
            if (n0A == null) {
                if (androidx.emoji2.text.c.d()) {
                    n0A = cVar2.a();
                    cVar2.f15627a = n0A;
                } else {
                    n0A = f.f15632a;
                }
            }
            if (!n0A.getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.text.l
    public final float b() {
        float f10;
        v vVar = this.f15613i;
        if (!Float.isNaN(vVar.f6658e)) {
            return vVar.f6658e;
        }
        TextPaint textPaint = vVar.f6655b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = vVar.f6654a;
        lineInstance.setText(new V.q(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new u(0));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(vVar.b(), ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(vVar.b(), ((Number) pair3.a()).intValue(), ((Number) pair3.b()).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        vVar.f6658e = f10;
        return f10;
    }

    @Override // androidx.compose.ui.text.l
    public final float c() {
        return this.f15613i.c();
    }
}
