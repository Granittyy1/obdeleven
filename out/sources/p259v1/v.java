package p259v1;

import Q6.d;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.source.h;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.i;
import com.google.common.primitives.Ints;
import com.voltasit.obdeleven.domain.usecases.gateway.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p078g1.B;
import p078g1.x;
import p078g1.y;
import p078g1.z;
import p114j1.A;
import p114j1.k;
import p235t1.n;
import p235t1.w;
import p272w1.c;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends x {

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f47616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w[] f47617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f47618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[][][] f47619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final w f47620f;

        public a(int[] iArr, w[] wVarArr, int[] iArr2, int[][][] iArr3, w wVar) {
            this.f47616b = iArr;
            this.f47617c = wVarArr;
            this.f47619e = iArr3;
            this.f47618d = iArr2;
            this.f47620f = wVar;
            this.f47615a = iArr.length;
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0385  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p259v1.x
    public final y e(n0[] n0VarArr, w wVar, h.b bVar, x xVar) throws ExoPlaybackException {
        final j.d dVar;
        w[] wVarArr;
        int[] iArr;
        int i10;
        final boolean z10;
        String str;
        j jVar;
        Point point;
        Pair pairM;
        String languageTag;
        w[] wVarArr2;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        j.d dVar2;
        int i15;
        long j;
        int i16;
        int i17;
        t.a aVar;
        w[] wVarArr3;
        int i18;
        y yVar;
        w[] wVarArr4;
        CaptioningManager captioningManager;
        Locale locale;
        int i19;
        int[] iArr2;
        int i20 = 1;
        int[] iArr3 = new int[n0VarArr.length + 1];
        int length = n0VarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr4 = new int[n0VarArr.length + 1][][];
        for (int i21 = 0; i21 < length; i21++) {
            int i22 = wVar.f47102a;
            yVarArr[i21] = new y[i22];
            iArr4[i21] = new int[i22][];
        }
        int length2 = n0VarArr.length;
        final int[] iArr5 = new int[length2];
        for (int i23 = 0; i23 < length2; i23++) {
            iArr5[i23] = n0VarArr[i23].u();
        }
        int i24 = 0;
        while (i24 < wVar.f47102a) {
            y yVarA = wVar.a(i24);
            int i25 = yVarA.f35493c == 5 ? i20 : 0;
            int length3 = n0VarArr.length;
            int i26 = i20;
            int i27 = 0;
            for (int i28 = 0; i28 < n0VarArr.length; i28++) {
                n0 n0Var = n0VarArr[i28];
                int iMax = 0;
                for (int i29 = 0; i29 < yVarA.f35491a; i29++) {
                    iMax = Math.max(iMax, n0Var.c(yVarA.f35494d[i29]) & 7);
                }
                int i30 = iArr3[i28] == 0 ? 1 : 0;
                if (iMax > i27 || (iMax == i27 && i25 != 0 && i26 == 0 && i30 != 0)) {
                    i26 = i30;
                    i27 = iMax;
                    length3 = i28;
                }
            }
            if (length3 == n0VarArr.length) {
                iArr2 = new int[yVarA.f35491a];
                i19 = 1;
            } else {
                n0 n0Var2 = n0VarArr[length3];
                int[] iArr6 = new int[yVarA.f35491a];
                for (int i31 = 0; i31 < yVarA.f35491a; i31++) {
                    iArr6[i31] = n0Var2.c(yVarA.f35494d[i31]);
                }
                i19 = 1;
                iArr2 = iArr6;
            }
            int i32 = iArr3[length3];
            yVarArr[length3][i32] = yVarA;
            iArr4[length3][i32] = iArr2;
            iArr3[length3] = i32 + i19;
            i24 += i19;
            i20 = i19;
        }
        w[] wVarArr5 = new w[n0VarArr.length];
        String[] strArr = new String[n0VarArr.length];
        int[] iArr7 = new int[n0VarArr.length];
        for (int i33 = 0; i33 < n0VarArr.length; i33++) {
            int i34 = iArr3[i33];
            wVarArr5[i33] = new w((y[]) A.H(i34, yVarArr[i33]));
            iArr4[i33] = (int[][]) A.H(i34, iArr4[i33]);
            strArr[i33] = n0VarArr[i33].getName();
            iArr7[i33] = ((AbstractC1389g) n0VarArr[i33]).f18363c;
        }
        a aVar2 = new a(iArr7, wVarArr5, iArr5, iArr4, new w((y[]) A.H(iArr3[n0VarArr.length], yVarArr[n0VarArr.length])));
        final j jVar2 = (j) this;
        synchronized (jVar2.f47531c) {
            dVar = jVar2.f47534f;
        }
        if (dVar.f47569z && A.f40996a >= 32 && jVar2.f47535g == null) {
            jVar2.f47535g = new j.f(jVar2.f47532d, jVar2);
        }
        int i35 = aVar2.f47615a;
        t.a[] aVarArr = new t.a[i35];
        int i36 = 0;
        while (true) {
            wVarArr = aVar2.f47617c;
            iArr = aVar2.f47616b;
            if (i36 >= aVar2.f47615a) {
                i10 = 1;
                z10 = false;
                break;
            }
            if (2 == iArr[i36] && wVarArr[i36].f47102a > 0) {
                z10 = true;
                i10 = 1;
                break;
            }
            i36++;
        }
        Pair pairM2 = j.m(i10, aVar2, iArr4, new j.h.a() { // from class: v1.g
            @Override // v1.j.h.a
            public final List c(int i37, y yVar2, int[] iArr8) {
                g gVar = this;
                j jVar3 = jVar2;
                j.d dVar3 = dVar;
                i iVar = new i(jVar3, dVar3);
                int i38 = iArr5[i37];
                ImmutableList.b bVar2 = ImmutableList.f27874c;
                ImmutableList.a aVar3 = new ImmutableList.a();
                int i39 = 0;
                while (i39 < yVar2.f35491a) {
                    aVar3.c(new j.a(i37, yVar2, i39, dVar3, iArr8[i39], z10, iVar, i38));
                    i39++;
                    gVar = this;
                }
                return aVar3.h();
            }
        }, new D6.a(2));
        if (pairM2 != null) {
            aVarArr[((Integer) pairM2.second).intValue()] = (t.a) pairM2.first;
        }
        if (pairM2 == null) {
            str = null;
        } else {
            t.a aVar3 = (t.a) pairM2.first;
            str = aVar3.f47613a.f35494d[aVar3.f47614b[0]].f35293d;
        }
        dVar.f35194o.getClass();
        boolean z12 = dVar.f35187g;
        Context context = jVar2.f47532d;
        if (!z12 || context == null) {
            jVar = jVar2;
            point = null;
        } else {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            int displayId = display.getDisplayId();
            int i37 = A.f40996a;
            if (displayId == 0 && A.E(context)) {
                String strW = i37 < 28 ? A.w("sys.display-size") : A.w("vendor.display-size");
                if (TextUtils.isEmpty(strW)) {
                    jVar = jVar2;
                } else {
                    try {
                        jVar = jVar2;
                        try {
                            String[] strArrSplit = strW.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i38 = Integer.parseInt(strArrSplit[0]);
                                int i39 = Integer.parseInt(strArrSplit[1]);
                                if (i38 > 0 && i39 > 0) {
                                    point = new Point(i38, i39);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        jVar = jVar2;
                    }
                    k.c("Util", "Invalid display size: " + strW);
                }
                if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                }
            } else {
                jVar = jVar2;
            }
            point = new Point();
            if (i37 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
        }
        Pair pairM3 = j.m(2, aVar2, iArr4, new b(dVar, str, iArr5, point), new f());
        g1.A.a aVar4 = dVar.f35194o;
        int i40 = 4;
        if (pairM3 == null) {
            aVar4.getClass();
            pairM = j.m(4, aVar2, iArr4, new d(dVar), new e());
        } else {
            pairM = null;
        }
        if (pairM != null) {
            aVarArr[((Integer) pairM.second).intValue()] = (t.a) pairM.first;
        } else if (pairM3 != null) {
            aVarArr[((Integer) pairM3.second).intValue()] = (t.a) pairM3.first;
        }
        aVar4.getClass();
        if (!dVar.f35196q || context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            int i41 = A.f40996a;
            languageTag = locale.toLanguageTag();
        }
        int i42 = 3;
        Pair pairM4 = j.m(3, aVar2, iArr4, new n(dVar, str, languageTag), new h());
        if (pairM4 != null) {
            aVarArr[((Integer) pairM4.second).intValue()] = (t.a) pairM4.first;
        }
        int i43 = 0;
        while (i43 < i35) {
            int i44 = iArr[i43];
            if (i44 == 2) {
                wVarArr3 = wVarArr;
                i18 = 1;
            } else if (i44 != 1) {
                if (i44 == i42 || i44 == i40) {
                    wVarArr3 = wVarArr;
                } else {
                    w wVar2 = wVarArr[i43];
                    int[][] iArr8 = iArr4[i43];
                    y yVar2 = null;
                    j.c cVar = null;
                    int i45 = 0;
                    int i46 = 0;
                    while (i45 < wVar2.f47102a) {
                        y yVarA2 = wVar2.a(i45);
                        int[] iArr9 = iArr8[i45];
                        j.c cVar2 = cVar;
                        y yVar3 = yVar2;
                        int i47 = 0;
                        while (i47 < yVarA2.f35491a) {
                            w wVar3 = wVar2;
                            if (n0.j(iArr9[i47], dVar.f47561A)) {
                                yVar = yVarA2;
                                j.c cVar3 = new j.c(yVarA2.f35494d[i47], iArr9[i47]);
                                if (cVar2 != null) {
                                    wVarArr4 = wVarArr;
                                    if (i.f27974a.c(cVar3.f47559c, cVar2.f47559c).c(cVar3.f47558b, cVar2.f47558b).e() > 0) {
                                    }
                                } else {
                                    wVarArr4 = wVarArr;
                                }
                                cVar2 = cVar3;
                                i46 = i47;
                                yVar3 = yVar;
                            } else {
                                yVar = yVarA2;
                                wVarArr4 = wVarArr;
                            }
                            i47++;
                            wVar2 = wVar3;
                            yVarA2 = yVar;
                            wVarArr = wVarArr4;
                        }
                        i45++;
                        yVar2 = yVar3;
                        wVar2 = wVar2;
                        cVar = cVar2;
                    }
                    wVarArr3 = wVarArr;
                    aVarArr[i43] = yVar2 == null ? null : new t.a(yVar2, new int[]{i46});
                }
                i18 = 1;
            } else {
                wVarArr3 = wVarArr;
                i18 = 1;
            }
            i43 += i18;
            wVarArr = wVarArr3;
            i42 = 3;
            i40 = 4;
        }
        int i48 = aVar2.f47615a;
        HashMap map = new HashMap();
        int i49 = 0;
        while (true) {
            wVarArr2 = aVar2.f47617c;
            if (i49 >= i48) {
                break;
            }
            j.i(wVarArr2[i49], dVar, map);
            i49++;
        }
        j.i(aVar2.f47620f, dVar, map);
        for (int i50 = 0; i50 < i48; i50++) {
            z zVar = (z) map.get(Integer.valueOf(aVar2.f47616b[i50]));
            if (zVar != null) {
                ImmutableList<Integer> immutableList = zVar.f35497b;
                if (immutableList.isEmpty()) {
                    aVar = null;
                } else {
                    w wVar4 = wVarArr2[i50];
                    y yVar4 = zVar.f35496a;
                    int iIndexOf = wVar4.f47103b.indexOf(yVar4);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        aVar = new t.a(yVar4, Ints.l0(immutableList));
                    } else {
                        aVar = null;
                    }
                }
                aVarArr[i50] = aVar;
            }
        }
        int i51 = aVar2.f47615a;
        for (int i52 = 0; i52 < i51; i52++) {
            w wVar5 = aVar2.f47617c[i52];
            Map<w, j.e> map2 = dVar.f47563C.get(i52);
            if (map2 != null && map2.containsKey(wVar5)) {
                Map<w, j.e> map3 = dVar.f47563C.get(i52);
                if ((map3 != null ? map3.get(wVar5) : null) != null) {
                    throw null;
                }
                aVarArr[i52] = null;
            }
        }
        for (int i53 = 0; i53 < i35; i53++) {
            int i54 = aVar2.f47616b[i53];
            if (dVar.f47564D.get(i53) || dVar.f35199t.contains(Integer.valueOf(i54))) {
                aVarArr[i53] = null;
            }
        }
        j jVar3 = jVar;
        v1.a.b bVar2 = jVar3.f47533e;
        c cVar4 = jVar3.f47622b;
        p241t7.b.l(cVar4);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i55 = 0; i55 < aVarArr.length; i55 += i17) {
            t.a aVar5 = aVarArr[i55];
            if (aVar5 != null) {
                i17 = 1;
                if (aVar5.f47614b.length > 1) {
                    ImmutableList.a aVarB = ImmutableList.B();
                    aVarB.e(new p259v1.a.C0543a(0L, 0L));
                    arrayList.add(aVarB);
                }
            } else {
                i17 = 1;
            }
            arrayList.add(null);
        }
        int length4 = aVarArr.length;
        long[][] jArr = new long[length4][];
        int i56 = 0;
        while (i56 < aVarArr.length) {
            t.a aVar6 = aVarArr[i56];
            if (aVar6 == null) {
                jArr[i56] = new long[0];
                i16 = 1;
            } else {
                int[] iArr10 = aVar6.f47614b;
                jArr[i56] = new long[iArr10.length];
                int i57 = 0;
                while (i57 < iArr10.length) {
                    int[] iArr11 = iArr10;
                    long j10 = aVar6.f47613a.f35494d[iArr10[i57]].j;
                    long[] jArr2 = jArr[i56];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i57] = j10;
                    i57++;
                    iArr10 = iArr11;
                }
                i16 = 1;
                Arrays.sort(jArr[i56]);
            }
            i56 += i16;
        }
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i58 = 0; i58 < length4; i58++) {
            long[] jArr4 = jArr[i58];
            jArr3[i58] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        int i59 = 1;
        p259v1.a.m(arrayList, jArr3);
        com.google.common.collect.n nVarB = MultimapBuilder.a().a().b();
        int i60 = 0;
        while (i60 < length4) {
            long[] jArr5 = jArr[i60];
            if (jArr5.length <= i59) {
                i14 = i35;
                dVar2 = dVar;
                i13 = length4;
                i15 = i59;
                j = -1;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i61 = 0;
                while (true) {
                    long[] jArr6 = jArr[i60];
                    i13 = length4;
                    double dLog = 0.0d;
                    if (i61 >= jArr6.length) {
                        break;
                    }
                    int i62 = i35;
                    j.d dVar3 = dVar;
                    long j11 = jArr6[i61];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i61] = dLog;
                    i61++;
                    length4 = i13;
                    dVar = dVar3;
                    i35 = i62;
                }
                i14 = i35;
                dVar2 = dVar;
                i15 = 1;
                j = -1;
                int i63 = length5 - 1;
                double d10 = dArr[i63] - dArr[0];
                int i64 = 0;
                while (i64 < i63) {
                    double d11 = dArr[i64];
                    i64 += i15;
                    nVarB.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i64]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i60));
                    i15 = 1;
                }
            }
            i60 += i15;
            i59 = i15;
            length4 = i13;
            dVar = dVar2;
            i35 = i14;
        }
        int i65 = i35;
        j.d dVar4 = dVar;
        ImmutableList immutableListG = ImmutableList.G(nVarB.values());
        for (int i66 = 0; i66 < immutableListG.size(); i66++) {
            int iIntValue = ((Integer) immutableListG.get(i66)).intValue();
            int i67 = iArr12[iIntValue] + 1;
            iArr12[iIntValue] = i67;
            jArr3[iIntValue] = jArr[iIntValue][i67];
            p259v1.a.m(arrayList, jArr3);
        }
        for (int i68 = 0; i68 < aVarArr.length; i68++) {
            if (arrayList.get(i68) != null) {
                jArr3[i68] = jArr3[i68] * 2;
            }
        }
        p259v1.a.m(arrayList, jArr3);
        ImmutableList.a aVarB2 = ImmutableList.B();
        for (int i69 = 0; i69 < arrayList.size(); i69++) {
            ImmutableList.a aVar7 = (ImmutableList.a) arrayList.get(i69);
            aVarB2.e(aVar7 == null ? ImmutableList.K() : aVar7.h());
        }
        ImmutableList immutableListH = aVarB2.h();
        t[] tVarArr = new t[aVarArr.length];
        for (int i70 = 0; i70 < aVarArr.length; i70++) {
            t.a aVar8 = aVarArr[i70];
            if (aVar8 != null) {
                int[] iArr13 = aVar8.f47614b;
                if (iArr13.length != 0) {
                    tVarArr[i70] = iArr13.length == 1 ? new u(aVar8.f47613a, new int[]{iArr13[0]}) : new p259v1.a(aVar8.f47613a, iArr13, cVar4, 10000, 25000, (ImmutableList) immutableListH.get(i70));
                }
            }
        }
        o0[] o0VarArr = new o0[i65];
        int i71 = 0;
        while (i71 < i65) {
            j.d dVar5 = dVar4;
            o0VarArr[i71] = (dVar5.f47564D.get(i71) || dVar5.f35199t.contains(Integer.valueOf(aVar2.f47616b[i71])) || (aVar2.f47616b[i71] != -2 && tVarArr[i71] == null)) ? null : o0.f18589c;
            i71++;
            dVar4 = dVar5;
        }
        dVar4.f35194o.getClass();
        Pair pairCreate = Pair.create(o0VarArr, tVarArr);
        w[] wVarArr6 = (w[]) pairCreate.second;
        List[] listArr = new List[wVarArr6.length];
        for (int i72 = 0; i72 < wVarArr6.length; i72++) {
            w wVar6 = wVarArr6[i72];
            listArr[i72] = wVar6 != null ? ImmutableList.M(wVar6) : ImmutableList.K();
        }
        ImmutableList.a aVar9 = new ImmutableList.a();
        for (int i73 = 0; i73 < aVar2.f47615a; i73++) {
            w[] wVarArr7 = aVar2.f47617c;
            w wVar7 = wVarArr7[i73];
            List list = listArr[i73];
            int i74 = 0;
            while (i74 < wVar7.f47102a) {
                y yVarA3 = wVar7.a(i74);
                int i75 = wVarArr7[i73].a(i74).f35491a;
                int[] iArr14 = new int[i75];
                int i76 = 0;
                int i77 = 0;
                while (i76 < i75) {
                    if ((aVar2.f47619e[i73][i74][i76] & 7) != 4) {
                        i12 = 1;
                    } else {
                        i12 = 1;
                        iArr14[i77] = i76;
                        i77++;
                    }
                    i76 += i12;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr14, i77);
                int iMin = 16;
                String str2 = null;
                int i78 = 0;
                boolean z13 = false;
                int i79 = 0;
                while (i78 < iArrCopyOf.length) {
                    List[] listArr2 = listArr;
                    String str3 = wVarArr7[i73].a(i74).f35494d[iArrCopyOf[i78]].f35302n;
                    int i80 = i79 + 1;
                    if (i79 == 0) {
                        str2 = str3;
                    } else {
                        z13 = (!Objects.equals(str2, str3)) | z13;
                    }
                    iMin = Math.min(iMin, aVar2.f47619e[i73][i74][i78] & 24);
                    i78++;
                    listArr = listArr2;
                    i79 = i80;
                }
                List[] listArr3 = listArr;
                if (z13) {
                    iMin = Math.min(iMin, aVar2.f47618d[i73]);
                }
                boolean z14 = iMin != 0;
                int i81 = yVarA3.f35491a;
                int[] iArr15 = new int[i81];
                boolean[] zArr = new boolean[i81];
                int i82 = 0;
                while (i82 < yVarA3.f35491a) {
                    iArr15[i82] = aVar2.f47619e[i73][i74][i82] & 7;
                    int i83 = 0;
                    while (true) {
                        if (i83 >= list.size()) {
                            i11 = 1;
                            z11 = false;
                            break;
                        }
                        w wVar8 = (w) list.get(i83);
                        if (wVar8.a().equals(yVarA3) && wVar8.l(i82) != -1) {
                            i11 = 1;
                            z11 = true;
                            break;
                        }
                        i83++;
                    }
                    zArr[i82] = z11;
                    i82 += i11;
                }
                aVar9.c(new B.a(yVarA3, z14, iArr15, zArr));
                i74++;
                listArr = listArr3;
            }
        }
        int i84 = 0;
        while (true) {
            w wVar9 = aVar2.f47620f;
            if (i84 >= wVar9.f47102a) {
                return new y((o0[]) pairCreate.first, (t[]) pairCreate.second, new B(aVar9.h()), aVar2);
            }
            y yVarA4 = wVar9.a(i84);
            int[] iArr16 = new int[yVarA4.f35491a];
            Arrays.fill(iArr16, 0);
            aVar9.c(new B.a(yVarA4, false, iArr16, new boolean[yVarA4.f35491a]));
            i84++;
        }
    }

    @Override // p259v1.x
    public final void c(a aVar) {
    }
}
