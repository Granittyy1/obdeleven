package com.airbnb.lottie.compose;

import A8.A;
import Ia.l;
import Ia.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.provider.Settings;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.M;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.RunnableC1240q;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: LottieAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimationKt {
    public static final void a(final p079g3.b bVar, final Ia.a<Float> progress, androidx.compose.ui.h hVar, boolean z10, boolean z11, boolean z12, RenderMode renderMode, boolean z13, e eVar, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, boolean z14, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        i.e(progress, "progress");
        C1086g c1086gP = interfaceC1084f.p(-1070242582);
        androidx.compose.ui.h hVar2 = (i12 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        boolean z15 = (i12 & 8) != 0 ? false : z10;
        boolean z16 = (i12 & 16) != 0 ? false : z11;
        boolean z17 = (i12 & 32) != 0 ? false : z12;
        RenderMode renderMode2 = (i12 & 64) != 0 ? RenderMode.f23340b : renderMode;
        boolean z18 = (i12 & 128) != 0 ? false : z13;
        e eVar2 = (i12 & 256) != 0 ? null : eVar;
        androidx.compose.ui.d dVar2 = (i12 & 512) != 0 ? androidx.compose.ui.d.a.f13339e : dVar;
        InterfaceC1161g interfaceC1161g2 = (i12 & 1024) != 0 ? InterfaceC1161g.a.f14244b : interfaceC1161g;
        boolean z19 = (i12 & 2048) != 0 ? true : z14;
        Map<String, ? extends Typeface> map2 = (i12 & 4096) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i12 & 8192) != 0 ? AsyncUpdates.f23299b : asyncUpdates;
        c1086gP.e(-492369756);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = new LottieDrawable();
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        final LottieDrawable lottieDrawable = (LottieDrawable) objF;
        c1086gP.e(-492369756);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = new Matrix();
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        final Matrix matrix = (Matrix) objF2;
        c1086gP.e(1157296644);
        boolean zK = c1086gP.K(bVar);
        Object objF3 = c1086gP.f();
        if (zK || objF3 == c0153a) {
            objF3 = J0.f(null);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        final X x10 = (X) objF3;
        c1086gP.e(185151773);
        if (bVar == null || bVar.b() == 0.0f) {
            final androidx.compose.ui.h hVar3 = hVar2;
            c1086gP.T(false);
            C1105p0 c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z20 = z15;
                final boolean z21 = z16;
                final boolean z22 = z17;
                final RenderMode renderMode3 = renderMode2;
                final boolean z23 = z18;
                final e eVar3 = eVar2;
                final androidx.compose.ui.d dVar3 = dVar2;
                final InterfaceC1161g interfaceC1161g3 = interfaceC1161g2;
                final boolean z24 = z19;
                final Map<String, ? extends Typeface> map3 = map2;
                final AsyncUpdates asyncUpdates3 = asyncUpdates2;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LottieAnimationKt.a(bVar, progress, hVar3, z20, z21, z22, renderMode3, z23, eVar3, dVar3, interfaceC1161g3, z24, map3, asyncUpdates3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return r.f47939a;
                    }
                };
            }
            BoxKt.a(hVar3, c1086gP, (i10 >> 6) & 14);
            return;
        }
        c1086gP.T(false);
        float fC = p214r3.g.c();
        androidx.compose.ui.h hVarN = W.n(bVar.f35560i.width() / fC, bVar.f35560i.height() / fC, hVar2);
        final InterfaceC1161g interfaceC1161g4 = interfaceC1161g2;
        final androidx.compose.ui.d dVar4 = dVar2;
        final boolean z25 = z17;
        final RenderMode renderMode4 = renderMode2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final Map<String, ? extends Typeface> map4 = map2;
        final e eVar4 = eVar2;
        final androidx.compose.ui.h hVar4 = hVar2;
        final boolean z26 = z15;
        final boolean z27 = z16;
        final boolean z28 = z18;
        final boolean z29 = z19;
        CanvasKt.a(hVarN, new l<J.e, r>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(J.e eVar5) {
                J.e Canvas = eVar5;
                i.e(Canvas, "$this$Canvas");
                p079g3.b bVar2 = bVar;
                InterfaceC1161g interfaceC1161g5 = interfaceC1161g4;
                androidx.compose.ui.d dVar5 = dVar4;
                Matrix matrix2 = matrix;
                LottieDrawable lottieDrawable2 = lottieDrawable;
                boolean z30 = z25;
                RenderMode renderMode5 = renderMode4;
                AsyncUpdates asyncUpdates5 = asyncUpdates4;
                Map<String, Typeface> map5 = map4;
                e eVar6 = eVar4;
                boolean z31 = z26;
                boolean z32 = z27;
                boolean z33 = z28;
                boolean z34 = z29;
                Ia.a<Float> aVar = progress;
                X<e> x11 = x10;
                E eA = Canvas.W0().a();
                long jB = Cb.a.b(bVar2.f35560i.width(), bVar2.f35560i.height());
                long jA = A.a(Ka.a.b(I.h.d(Canvas.j())), Ka.a.b(I.h.b(Canvas.j())));
                long jA2 = interfaceC1161g5.a(jB, Canvas.j());
                float fD = I.h.d(jB);
                int i13 = c0.f14231a;
                int i14 = (int) (jA2 >> 32);
                int i15 = (int) (jA2 & 4294967295L);
                long jA3 = dVar5.a(A.a((int) (Float.intBitsToFloat(i14) * fD), (int) (Float.intBitsToFloat(i15) * I.h.b(jB))), jA, Canvas.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate((int) (jA3 >> 32), (int) (jA3 & 4294967295L));
                matrix2.preScale(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
                if (lottieDrawable2.j != z30) {
                    lottieDrawable2.j = z30;
                    if (lottieDrawable2.f23312b != null) {
                        lottieDrawable2.a();
                    }
                }
                lottieDrawable2.f23326q = renderMode5;
                lottieDrawable2.b();
                lottieDrawable2.f23307E = asyncUpdates5;
                lottieDrawable2.h(bVar2);
                if (map5 != lottieDrawable2.f23319i) {
                    lottieDrawable2.f23319i = map5;
                    lottieDrawable2.invalidateSelf();
                }
                if (eVar6 != x11.getValue()) {
                    if (x11.getValue() != null || eVar6 != null) {
                        throw null;
                    }
                    x11.setValue(eVar6);
                }
                if (lottieDrawable2.f23324o != z31) {
                    lottieDrawable2.f23324o = z31;
                    com.airbnb.lottie.model.layer.b bVar3 = lottieDrawable2.f23322m;
                    if (bVar3 != null) {
                        bVar3.n(z31);
                    }
                }
                lottieDrawable2.f23325p = z32;
                lottieDrawable2.f23320k = z33;
                if (z34 != lottieDrawable2.f23321l) {
                    lottieDrawable2.f23321l = z34;
                    com.airbnb.lottie.model.layer.b bVar4 = lottieDrawable2.f23322m;
                    if (bVar4 != null) {
                        bVar4.f23507I = z34;
                    }
                    lottieDrawable2.invalidateSelf();
                }
                lottieDrawable2.j(aVar.invoke().floatValue());
                lottieDrawable2.setBounds(0, 0, bVar2.f35560i.width(), bVar2.f35560i.height());
                Canvas canvasA = C1139o.a(eA);
                com.airbnb.lottie.model.layer.b bVar5 = lottieDrawable2.f23322m;
                p079g3.b bVar6 = lottieDrawable2.f23312b;
                if (bVar5 != null && bVar6 != null) {
                    boolean z35 = lottieDrawable2.f23307E == AsyncUpdates.f23300c;
                    ThreadPoolExecutor threadPoolExecutor = LottieDrawable.f23302J;
                    Semaphore semaphore = lottieDrawable2.f23308F;
                    RunnableC1240q runnableC1240q = lottieDrawable2.f23309G;
                    p214r3.e eVar7 = lottieDrawable2.f23313c;
                    if (z35) {
                        try {
                            semaphore.acquire();
                            if (lottieDrawable2.k()) {
                                lottieDrawable2.j(eVar7.c());
                            }
                        } catch (InterruptedException unused) {
                            if (z35) {
                                semaphore.release();
                                if (bVar5.f23506H != eVar7.c()) {
                                }
                            }
                            return r.f47939a;
                        } catch (Throwable th) {
                            if (z35) {
                                semaphore.release();
                                if (bVar5.f23506H != eVar7.c()) {
                                    threadPoolExecutor.execute(runnableC1240q);
                                }
                            }
                            throw th;
                        }
                    }
                    if (lottieDrawable2.f23327r) {
                        canvasA.save();
                        canvasA.concat(matrix2);
                        lottieDrawable2.f(canvasA, bVar5);
                        canvasA.restore();
                    } else {
                        bVar5.f(canvasA, matrix2, lottieDrawable2.f23323n);
                    }
                    lottieDrawable2.f23311I = false;
                    if (z35) {
                        semaphore.release();
                        if (bVar5.f23506H != eVar7.c()) {
                            threadPoolExecutor.execute(runnableC1240q);
                        }
                    }
                }
                return r.f47939a;
            }
        }, c1086gP, 0);
        C1105p0 c1105p0V2 = c1086gP.V();
        if (c1105p0V2 == null) {
            return;
        }
        final boolean z30 = z15;
        final boolean z31 = z16;
        final boolean z32 = z17;
        final RenderMode renderMode5 = renderMode2;
        final boolean z33 = z18;
        final e eVar5 = eVar2;
        final androidx.compose.ui.d dVar5 = dVar2;
        final InterfaceC1161g interfaceC1161g5 = interfaceC1161g2;
        final boolean z34 = z19;
        final Map<String, ? extends Typeface> map5 = map2;
        final AsyncUpdates asyncUpdates5 = asyncUpdates2;
        c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                num.intValue();
                LottieAnimationKt.a(bVar, progress, hVar4, z30, z31, z32, renderMode5, z33, eVar5, dVar5, interfaceC1161g5, z34, map5, asyncUpdates5, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                return r.f47939a;
            }
        };
    }

    public static final void b(final p079g3.b bVar, androidx.compose.ui.h hVar, boolean z10, boolean z11, c cVar, float f10, int i10, boolean z12, boolean z13, boolean z14, RenderMode renderMode, boolean z15, boolean z16, e eVar, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, boolean z17, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, InterfaceC1084f interfaceC1084f, final int i11, final int i12, final int i13) {
        C1086g c1086gP = interfaceC1084f.p(1541656025);
        final androidx.compose.ui.h hVar2 = (i13 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final boolean z18 = (i13 & 4) != 0 ? true : z10;
        final boolean z19 = (i13 & 8) != 0 ? true : z11;
        final c cVar2 = (i13 & 16) != 0 ? null : cVar;
        float f11 = (i13 & 32) != 0 ? 1.0f : f10;
        int i14 = (i13 & 64) != 0 ? 1 : i10;
        boolean z20 = (i13 & 128) != 0 ? false : z12;
        boolean z21 = (i13 & 256) != 0 ? false : z13;
        boolean z22 = (i13 & 512) != 0 ? false : z14;
        RenderMode renderMode2 = (i13 & 1024) != 0 ? RenderMode.f23340b : renderMode;
        boolean z23 = (i13 & 2048) != 0 ? false : z15;
        boolean z24 = (i13 & 4096) != 0 ? false : z16;
        e eVar2 = (i13 & 8192) != 0 ? null : eVar;
        androidx.compose.ui.d dVar2 = (i13 & 16384) != 0 ? androidx.compose.ui.d.a.f13339e : dVar;
        InterfaceC1161g interfaceC1161g2 = (32768 & i13) != 0 ? InterfaceC1161g.a.f14244b : interfaceC1161g;
        boolean z25 = (65536 & i13) != 0 ? true : z17;
        Map<String, ? extends Typeface> map2 = (131072 & i13) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (262144 & i13) != 0 ? AsyncUpdates.f23299b : asyncUpdates;
        c1086gP.e(683659508);
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f23356b;
        if (i14 <= 0) {
            throw new IllegalArgumentException(J4.i.c(i14, "Iterations must be a positive number (", ").").toString());
        }
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + '.').toString());
        }
        c1086gP.e(2024497114);
        c1086gP.e(-492369756);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = new LottieAnimatableImpl();
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        final a aVar = (a) objF;
        c1086gP.T(false);
        c1086gP.e(-492369756);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = J0.f(Boolean.valueOf(z18));
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        c1086gP.e(-180606834);
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        r3.g.a aVar2 = p214r3.g.f46332a;
        final RenderMode renderMode3 = renderMode2;
        final boolean z26 = z22;
        float f12 = f11 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        c1086gP.T(false);
        final float f13 = f11;
        final boolean z27 = z21;
        Object[] objArr = {bVar, Boolean.valueOf(z18), cVar2, Float.valueOf(f12), Integer.valueOf(i14)};
        AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 animateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 = new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z18, z19, aVar, bVar, i14, z23, f12, cVar2, lottieCancellationBehavior, false, (X) objF2, null);
        B b10 = androidx.compose.runtime.E.f12831a;
        kotlin.coroutines.e eVarI = c1086gP.f12999b.i();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 5);
        int i15 = 0;
        boolean zK = false;
        for (int length = objArrCopyOf.length; i15 < length; length = length) {
            zK |= c1086gP.K(objArrCopyOf[i15]);
            i15++;
        }
        Object objF3 = c1086gP.f();
        if (zK || objF3 == c0153a) {
            c1086gP.E(new M(eVarI, animateLottieCompositionAsStateKt$animateLottieCompositionAsState$3));
        }
        c1086gP.T(false);
        c1086gP.e(1157296644);
        boolean zK2 = c1086gP.K(aVar);
        Object objF4 = c1086gP.f();
        if (zK2 || objF4 == c0153a) {
            objF4 = new Ia.a<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Float invoke() {
                    return Float.valueOf(aVar.getValue().floatValue());
                }
            };
            c1086gP.E(objF4);
        }
        c1086gP.T(false);
        int i16 = i11 >> 12;
        int i17 = ((i11 << 3) & 896) | 134217736 | (i16 & 7168) | (57344 & i16) | (i16 & 458752) | ((i12 << 18) & 3670016);
        int i18 = i12 << 15;
        int i19 = i17 | (29360128 & i18) | (i18 & 1879048192);
        int i20 = i12 >> 15;
        a(bVar, (Ia.a) objF4, hVar2, z20, z27, z26, renderMode3, z24, eVar2, dVar2, interfaceC1161g2, z25, map2, asyncUpdates2, c1086gP, i19, (i20 & 7168) | (i20 & 14) | 512 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V == null) {
            return;
        }
        final int i21 = i14;
        final boolean z28 = z20;
        final boolean z29 = z23;
        final boolean z30 = z24;
        final e eVar3 = eVar2;
        final androidx.compose.ui.d dVar3 = dVar2;
        final InterfaceC1161g interfaceC1161g3 = interfaceC1161g2;
        final boolean z31 = z25;
        final Map<String, ? extends Typeface> map3 = map2;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                num.intValue();
                LottieAnimationKt.b(bVar, hVar2, z18, z19, cVar2, f13, i21, z28, z27, z26, renderMode3, z29, z30, eVar3, dVar3, interfaceC1161g3, z31, map3, asyncUpdates3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                return r.f47939a;
            }
        };
    }
}
