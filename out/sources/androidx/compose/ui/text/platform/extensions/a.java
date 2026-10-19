package androidx.compose.ui.text.platform.extensions;

import Ia.q;
import Ia.r;
import J.f;
import Q3.d;
import X.e;
import Z.b;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1262c;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.font.j;
import androidx.compose.ui.text.font.k;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.m;
import p013b0.c;
import p013b0.n;
import p013b0.o;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final float a(float f10, c cVar) {
        if (n.a(0L, n.f20493c)) {
            return f10;
        }
        long jB = n.b(0L);
        if (o.a(jB, 4294967296L)) {
            return cVar.s1(0L);
        }
        if (o.a(jB, 8589934592L)) {
            return f10 * n.c(0L);
        }
        return Float.NaN;
    }

    public static final float b(long j, float f10, c cVar) {
        float fC;
        long jB = n.b(j);
        if (o.a(jB, 4294967296L)) {
            if (cVar.P0() <= 1.05d) {
                return cVar.s1(j);
            }
            fC = n.c(j) / n.c(cVar.A0(f10));
        } else {
            if (!o.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = n.c(j);
        }
        return fC * f10;
    }

    public static final void c(Spannable spannable, long j, int i10, int i11) {
        if (j != 16) {
            f(spannable, new ForegroundColorSpan(d.K(j)), i10, i11);
        }
    }

    public static final void d(Spannable spannable, long j, c cVar, int i10, int i11) {
        long jB = n.b(j);
        if (o.a(jB, 4294967296L)) {
            f(spannable, new AbsoluteSizeSpan(Ka.a.b(cVar.s1(j)), false), i10, i11);
        } else if (o.a(jB, 8589934592L)) {
            f(spannable, new RelativeSizeSpan(n.c(j)), i10, i11);
        }
    }

    public static final void e(Spannable spannable, Z.c cVar, int i10, int i11) {
        if (cVar != null) {
            ArrayList arrayList = new ArrayList(m.y(cVar, 10));
            Iterator<b> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f7670a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            f(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11);
        }
    }

    public static final void f(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final Spannable spannable, F f10, List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>> list, c cVar, final r<? super androidx.compose.ui.text.font.d, ? super l, ? super j, ? super k, ? extends Typeface> rVar) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        v vVar;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>> list2 = list;
        int size = list2.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            C1260a.c<? extends C1260a.InterfaceC0160a> cVar2 = list.get(i16);
            T t8 = cVar2.f15418a;
            if (t8 instanceof v) {
                v vVar2 = (v) t8;
                if (vVar2.f15695f != null || vVar2.f15693d != null || vVar2.f15692c != null || ((v) t8).f15694e != null) {
                    arrayList2.add(cVar2);
                }
            }
        }
        v vVar3 = f10.f15318a;
        androidx.compose.ui.text.font.d dVar = vVar3.f15695f;
        v vVar4 = ((dVar != null || vVar3.f15693d != null || vVar3.f15692c != null) || vVar3.f15694e != null) ? new v(0L, 0L, vVar3.f15692c, vVar3.f15693d, vVar3.f15694e, dVar, null, 0L, null, null, null, 0L, null, null, 65475) : null;
        q<v, Integer, Integer, p293xa.r> qVar = new q<v, Integer, Integer, p293xa.r>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // Ia.q
            public final p293xa.r invoke(v vVar5, Integer num, Integer num2) {
                v vVar6 = vVar5;
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                Spannable spannable2 = spannable;
                r<androidx.compose.ui.text.font.d, l, j, k, Typeface> rVar2 = rVar;
                androidx.compose.ui.text.font.d dVar2 = vVar6.f15695f;
                l lVar = vVar6.f15692c;
                if (lVar == null) {
                    lVar = l.f15442g;
                }
                j jVar = vVar6.f15693d;
                j jVar2 = new j(jVar != null ? jVar.f15436a : 0);
                k kVar = vVar6.f15694e;
                spannable2.setSpan(new X.m(rVar2.invoke(dVar2, lVar, jVar2, new k(kVar != null ? kVar.f15437a : 65535))), iIntValue, iIntValue2, 33);
                return p293xa.r.f47939a;
            }
        };
        if (arrayList2.size() > 1) {
            int size2 = arrayList2.size();
            int i17 = size2 * 2;
            int[] iArr = new int[i17];
            int size3 = arrayList2.size();
            for (int i18 = 0; i18 < size3; i18++) {
                C1260a.c cVar3 = (C1260a.c) arrayList2.get(i18);
                iArr[i18] = cVar3.f15419b;
                iArr[i18 + size2] = cVar3.f15420c;
            }
            if (i17 > 1) {
                Arrays.sort(iArr);
            }
            if (i17 == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            int i19 = iArr[0];
            int i20 = 0;
            while (i20 < i17) {
                int i21 = iArr[i20];
                if (i21 == i19) {
                    arrayList = arrayList2;
                } else {
                    int size4 = arrayList2.size();
                    v vVar5 = vVar4;
                    int i22 = i15;
                    while (i22 < size4) {
                        C1260a.c cVar4 = (C1260a.c) arrayList2.get(i22);
                        int i23 = cVar4.f15419b;
                        ArrayList arrayList3 = arrayList2;
                        int i24 = cVar4.f15420c;
                        if (i23 != i24 && C1262c.b(i19, i21, i23, i24)) {
                            v vVarC = (v) cVar4.f15418a;
                            if (vVar5 != null) {
                                vVarC = vVar5.c(vVarC);
                            }
                            vVar5 = vVarC;
                        }
                        i22++;
                        arrayList2 = arrayList3;
                    }
                    arrayList = arrayList2;
                    if (vVar5 != null) {
                        qVar.invoke(vVar5, Integer.valueOf(i19), Integer.valueOf(i21));
                    }
                    i19 = i21;
                }
                i20++;
                arrayList2 = arrayList;
                i15 = 0;
            }
        } else if (!arrayList2.isEmpty()) {
            v vVarC2 = (v) ((C1260a.c) arrayList2.get(0)).f15418a;
            if (vVar4 != null) {
                vVarC2 = vVar4.c(vVarC2);
            }
            qVar.invoke(vVarC2, Integer.valueOf(((C1260a.c) arrayList2.get(0)).f15419b), Integer.valueOf(((C1260a.c) arrayList2.get(0)).f15420c));
        }
        int size5 = list2.size();
        boolean z10 = false;
        for (int i25 = 0; i25 < size5; i25++) {
            C1260a.c<? extends C1260a.InterfaceC0160a> cVar5 = list.get(i25);
            if ((cVar5.f15418a instanceof v) && (i12 = cVar5.f15419b) >= 0 && i12 < spannable.length() && (i13 = cVar5.f15420c) > i12 && i13 <= spannable.length()) {
                v vVar6 = (v) cVar5.f15418a;
                androidx.compose.ui.text.style.a aVar = vVar6.f15698i;
                if (aVar != null) {
                    spannable.setSpan(new X.a(aVar.f15654a), i12, i13, 33);
                }
                TextForegroundStyle textForegroundStyle = vVar6.f15690a;
                c(spannable, textForegroundStyle.c(), i12, i13);
                C cE = textForegroundStyle.e();
                float fA = textForegroundStyle.a();
                if (cE != null) {
                    if (cE instanceof m0) {
                        c(spannable, ((m0) cE).f13770a, i12, i13);
                    } else {
                        spannable.setSpan(new ShaderBrushSpan((j0) cE, fA), i12, i13, 33);
                    }
                }
                h hVar = vVar6.f15701m;
                if (hVar != null) {
                    int i26 = hVar.f15673a;
                    spannable.setSpan(new X.l((i26 | 1) == i26, (i26 | 2) == i26), i12, i13, 33);
                }
                d(spannable, vVar6.f15691b, cVar, i12, i13);
                String str = vVar6.f15696g;
                if (str != null) {
                    spannable.setSpan(new X.b(str), i12, i13, 33);
                }
                androidx.compose.ui.text.style.j jVar = vVar6.j;
                if (jVar != null) {
                    spannable.setSpan(new ScaleXSpan(jVar.f15676a), i12, i13, 33);
                    spannable.setSpan(new X.k(jVar.f15677b), i12, i13, 33);
                }
                e(spannable, vVar6.f15699k, i12, i13);
                long j = vVar6.f15700l;
                if (j != 16) {
                    f(spannable, new BackgroundColorSpan(d.K(j)), i12, i13);
                }
                k0 k0Var = vVar6.f15702n;
                if (k0Var != null) {
                    int iK = d.K(k0Var.f13653a);
                    long j10 = k0Var.f13654b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    float f11 = k0Var.f13655c;
                    if (f11 == 0.0f) {
                        f11 = Float.MIN_VALUE;
                    }
                    X.j jVar2 = new X.j(iK, fIntBitsToFloat, fIntBitsToFloat2, f11);
                    i14 = 33;
                    spannable.setSpan(jVar2, i12, i13, 33);
                    vVar = vVar6;
                } else {
                    i14 = 33;
                    vVar = vVar6;
                }
                f fVar = vVar.f15704p;
                if (fVar != null) {
                    spannable.setSpan(new androidx.compose.ui.text.platform.style.a(fVar), i12, i13, i14);
                }
                if (o.a(n.b(vVar.f15697h), 4294967296L) || o.a(n.b(vVar.f15697h), 8589934592L)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size6 = list2.size();
            for (int i27 = 0; i27 < size6; i27++) {
                C1260a.c<? extends C1260a.InterfaceC0160a> cVar6 = list.get(i27);
                C1260a.InterfaceC0160a interfaceC0160a = (C1260a.InterfaceC0160a) cVar6.f15418a;
                if ((interfaceC0160a instanceof v) && (i10 = cVar6.f15419b) >= 0 && i10 < spannable.length() && (i11 = cVar6.f15420c) > i10 && i11 <= spannable.length()) {
                    long j11 = ((v) interfaceC0160a).f15697h;
                    long jB = n.b(j11);
                    Object fVar2 = o.a(jB, 4294967296L) ? new X.f(cVar.s1(j11)) : o.a(jB, 8589934592L) ? new e(n.c(j11)) : null;
                    if (fVar2 != null) {
                        spannable.setSpan(fVar2, i10, i11, 33);
                    }
                }
            }
        }
    }
}
