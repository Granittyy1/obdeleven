package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.Z;
import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.InterfaceC1184e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p013b0.c f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9697b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC1187h f9704i;

    public AndroidEdgeEffectOverscrollEffect(Context context, p013b0.c cVar, long j, androidx.compose.foundation.layout.L l10) {
        this.f9696a = cVar;
        o oVar = new o(context, Q3.d.K(j));
        this.f9698c = oVar;
        this.f9699d = new C1085f0(p293xa.r.f47939a, Z.f12934a);
        this.f9700e = true;
        this.f9702g = 0L;
        this.f9703h = -1L;
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: AndroidOverscroll.android.kt */
            @Aa.c(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // Ia.p
                public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0082  */
                /* JADX WARN: Code duplicated, block: B:28:0x0094 A[LOOP:1: B:24:0x0080->B:28:0x0094, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:43:0x0098 A[EDGE_INSN: B:43:0x0098->B:30:0x0098 BREAK  A[LOOP:1: B:24:0x0080->B:28:0x0094], SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                        int r1 = r12.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L25
                        if (r1 == r4) goto L1d
                        if (r1 != r3) goto L15
                        java.lang.Object r1 = r12.L$0
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
                        kotlin.b.b(r13)
                        goto L51
                    L15:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1d:
                        java.lang.Object r1 = r12.L$0
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
                        kotlin.b.b(r13)
                        goto L38
                    L25:
                        kotlin.b.b(r13)
                        java.lang.Object r13 = r12.L$0
                        r1 = r13
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC1152c) r1
                        r12.L$0 = r1
                        r12.label = r4
                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r2, r12, r3)
                        if (r13 != r0) goto L38
                        return r0
                    L38:
                        androidx.compose.ui.input.pointer.q r13 = (androidx.compose.ui.input.pointer.q) r13
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r4 = r12.this$0
                        long r5 = r13.f14100a
                        r4.f9703h = r5
                        long r5 = r13.f14102c
                        r4.f9697b = r5
                    L44:
                        r12.L$0 = r1
                        r12.label = r3
                        androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.f14030c
                        java.lang.Object r13 = r1.K(r13, r12)
                        if (r13 != r0) goto L51
                        return r0
                    L51:
                        androidx.compose.ui.input.pointer.j r13 = (androidx.compose.ui.input.pointer.j) r13
                        java.lang.Object r13 = r13.f14091a
                        java.util.ArrayList r4 = new java.util.ArrayList
                        int r5 = r13.size()
                        r4.<init>(r5)
                        r5 = r13
                        java.util.Collection r5 = (java.util.Collection) r5
                        int r5 = r5.size()
                        r6 = 0
                        r7 = r6
                    L67:
                        if (r7 >= r5) goto L7a
                        java.lang.Object r8 = r13.get(r7)
                        r9 = r8
                        androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.q) r9
                        boolean r9 = r9.f14103d
                        if (r9 == 0) goto L77
                        r4.add(r8)
                    L77:
                        int r7 = r7 + 1
                        goto L67
                    L7a:
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                        int r5 = r4.size()
                    L80:
                        if (r6 >= r5) goto L97
                        java.lang.Object r7 = r4.get(r6)
                        r8 = r7
                        androidx.compose.ui.input.pointer.q r8 = (androidx.compose.ui.input.pointer.q) r8
                        long r8 = r8.f14100a
                        long r10 = r13.f9703h
                        boolean r8 = androidx.compose.ui.input.pointer.p.a(r8, r10)
                        if (r8 == 0) goto L94
                        goto L98
                    L94:
                        int r6 = r6 + 1
                        goto L80
                    L97:
                        r7 = r2
                    L98:
                        androidx.compose.ui.input.pointer.q r7 = (androidx.compose.ui.input.pointer.q) r7
                        if (r7 != 0) goto La3
                        java.lang.Object r13 = kotlin.collections.q.P(r4)
                        r7 = r13
                        androidx.compose.ui.input.pointer.q r7 = (androidx.compose.ui.input.pointer.q) r7
                    La3:
                        if (r7 == 0) goto Laf
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                        long r5 = r7.f14100a
                        r13.f9703h = r5
                        long r5 = r7.f14102c
                        r13.f9697b = r5
                    Laf:
                        boolean r13 = r4.isEmpty()
                        if (r13 == 0) goto L44
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r13 = r12.this$0
                        r0 = -1
                        r13.f9703h = r0
                        xa.r r13 = p293xa.r.f47939a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
                Object objB = ForEachGestureKt.b(wVar, new AnonymousClass1(this.f9705b, null), cVar2);
                return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
            }
        };
        androidx.compose.ui.input.pointer.j jVar = androidx.compose.ui.input.pointer.B.f14012a;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
        this.f9704i = Build.VERSION.SDK_INT >= 31 ? new M(suspendingPointerInputModifierNodeImpl, this, oVar) : new s(suspendingPointerInputModifierNodeImpl, this, oVar, l10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:105:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x0239  */
    /* JADX WARN: Code duplicated, block: B:116:0x023d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0246  */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0289  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x030d  */
    /* JADX WARN: Code duplicated, block: B:174:0x032a  */
    /* JADX WARN: Code duplicated, block: B:176:0x033b  */
    /* JADX WARN: Code duplicated, block: B:177:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x034f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0357  */
    /* JADX WARN: Code duplicated, block: B:191:0x035b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128 A[PHI: r12
      0x0128: PHI (r12v11 float) = (r12v10 float), (r12v14 float) binds: [B:72:0x0156, B:61:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.E
    public final long a(long j, int i10, Ia.l<? super I.d, I.d> lVar) {
        float fIntBitsToFloat;
        float fI;
        float fIntBitsToFloat2;
        char c10;
        boolean z10;
        boolean zF;
        boolean z11;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        r rVar;
        float f10;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        r rVar2;
        float f11;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        r rVar3;
        float f12;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        if (I.h.e(this.f9702g)) {
            return lVar.invoke(new I.d(j)).f3754a;
        }
        boolean z14 = this.f9701f;
        o oVar = this.f9698c;
        if (!z14) {
            if (o.g(oVar.f10911f)) {
                h(0L);
            }
            if (o.g(oVar.f10912g)) {
                i(0L);
            }
            if (o.g(oVar.f10909d)) {
                j(0L);
            }
            if (o.g(oVar.f10910e)) {
                g(0L);
            }
            this.f9701f = true;
        }
        int i13 = C0930b.f9863a;
        float f13 = androidx.compose.ui.input.nestedscroll.c.a(i10, 2) ? 4.0f : 1.0f;
        long jH = I.d.h(f13, j);
        int i14 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i14) == 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else if (o.g(oVar.f10909d) && Float.intBitsToFloat(i14) < 0.0f) {
            float fJ = j(jH);
            if (!o.g(oVar.f10909d)) {
                oVar.e().finish();
            }
            fIntBitsToFloat = fJ == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i14) : fJ / f13;
        } else if (!o.g(oVar.f10910e) || Float.intBitsToFloat(i14) <= 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fG = g(jH);
            if (!o.g(oVar.f10910e)) {
                oVar.b().finish();
            }
            fIntBitsToFloat = fG == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i14) : fG / f13;
        }
        int i15 = (int) (j >> 32);
        if (Float.intBitsToFloat(i15) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (o.g(oVar.f10911f) && Float.intBitsToFloat(i15) < 0.0f) {
            fI = h(jH);
            if (!o.g(oVar.f10911f)) {
                oVar.c().finish();
            }
            if (fI == Float.intBitsToFloat((int) (jH >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i15);
            } else {
                fIntBitsToFloat2 = fI / f13;
            }
        } else if (!o.g(oVar.f10912g) || Float.intBitsToFloat(i15) <= 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fI = i(jH);
            if (!o.g(oVar.f10912g)) {
                oVar.d().finish();
            }
            if (fI == Float.intBitsToFloat((int) (jH >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i15);
            } else {
                fIntBitsToFloat2 = fI / f13;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
        if (!I.d.b(jFloatToRawIntBits, 0L)) {
            f();
        }
        long jF = I.d.f(j, jFloatToRawIntBits);
        long j10 = lVar.invoke(new I.d(jF)).f3754a;
        long jF2 = I.d.f(jF, j10);
        if (Float.intBitsToFloat((int) (jF >> 32)) == 0.0f) {
            if (Float.intBitsToFloat((int) (jF & 4294967295L)) != 0.0f) {
                c10 = ' ';
            }
            if (androidx.compose.ui.input.nestedscroll.c.a(i10, 1)) {
                i11 = (int) (jF2 >> 32);
                if (Float.intBitsToFloat(i11) > 0.5f) {
                    h(jF2);
                } else {
                    if (Float.intBitsToFloat(i11) < -0.5f) {
                        i(jF2);
                    } else {
                        z12 = false;
                    }
                    i12 = (int) (jF2 & 4294967295L);
                    if (Float.intBitsToFloat(i12) > 0.5f) {
                        j(jF2);
                    } else {
                        if (Float.intBitsToFloat(i12) < -0.5f) {
                            g(jF2);
                        } else {
                            z13 = false;
                        }
                        if (!z12 || z13) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    z13 = true;
                    if (z12) {
                    }
                    z10 = true;
                }
                z12 = true;
                i12 = (int) (jF2 & 4294967295L);
                if (Float.intBitsToFloat(i12) > 0.5f) {
                    j(jF2);
                } else {
                    if (Float.intBitsToFloat(i12) < -0.5f) {
                        g(jF2);
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                    }
                    z10 = true;
                }
                z13 = true;
                if (z12) {
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!I.d.b(jF, 0L)) {
                if (o.f(oVar.f10911f) || Float.intBitsToFloat(i15) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = oVar.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i15);
                    if (edgeEffectC instanceof r) {
                        r rVar4 = (r) edgeEffectC;
                        float f14 = rVar4.f11022b + fIntBitsToFloat6;
                        rVar4.f11022b = f14;
                        if (Math.abs(f14) > rVar4.f11021a) {
                            rVar4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = o.f(oVar.f10911f);
                }
                if (o.f(oVar.f10912g) && Float.intBitsToFloat(i15) > 0.0f) {
                    edgeEffectD = oVar.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i15);
                    if (edgeEffectD instanceof r) {
                        rVar3 = (r) edgeEffectD;
                        f12 = rVar3.f11022b + fIntBitsToFloat5;
                        rVar3.f11022b = f12;
                        if (Math.abs(f12) > rVar3.f11021a) {
                            rVar3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || o.f(oVar.f10912g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (o.f(oVar.f10909d) && Float.intBitsToFloat(i14) < 0.0f) {
                    edgeEffectE = oVar.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i14);
                    if (edgeEffectE instanceof r) {
                        rVar2 = (r) edgeEffectE;
                        f11 = rVar2.f11022b + fIntBitsToFloat4;
                        rVar2.f11022b = f11;
                        if (Math.abs(f11) > rVar2.f11021a) {
                            rVar2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || o.f(oVar.f10909d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (o.f(oVar.f10910e) && Float.intBitsToFloat(i14) > 0.0f) {
                    edgeEffectB = oVar.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i14);
                    if (edgeEffectB instanceof r) {
                        rVar = (r) edgeEffectB;
                        f10 = rVar.f11022b + fIntBitsToFloat3;
                        rVar.f11022b = f10;
                        if (Math.abs(f10) > rVar.f11021a) {
                            rVar.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || o.f(oVar.f10910e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 = z11;
            }
            if (z10) {
                f();
            }
            return I.d.g(jFloatToRawIntBits, j10);
        }
        c10 = ' ';
        if ((Float.intBitsToFloat((int) (j10 >> c10)) != 0.0f || Float.intBitsToFloat((int) (j10 & 4294967295L)) != 0.0f) && (o.g(oVar.f10911f) || o.g(oVar.f10909d) || o.g(oVar.f10912g) || o.g(oVar.f10910e))) {
            d();
        }
        if (androidx.compose.ui.input.nestedscroll.c.a(i10, 1)) {
            i11 = (int) (jF2 >> 32);
            if (Float.intBitsToFloat(i11) > 0.5f) {
                h(jF2);
            } else {
                if (Float.intBitsToFloat(i11) < -0.5f) {
                    i(jF2);
                } else {
                    z12 = false;
                }
                i12 = (int) (jF2 & 4294967295L);
                if (Float.intBitsToFloat(i12) > 0.5f) {
                    j(jF2);
                } else {
                    if (Float.intBitsToFloat(i12) < -0.5f) {
                        g(jF2);
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                    }
                    z10 = true;
                }
                z13 = true;
                if (z12) {
                }
                z10 = true;
            }
            z12 = true;
            i12 = (int) (jF2 & 4294967295L);
            if (Float.intBitsToFloat(i12) > 0.5f) {
                j(jF2);
            } else {
                if (Float.intBitsToFloat(i12) < -0.5f) {
                    g(jF2);
                } else {
                    z13 = false;
                }
                if (z12) {
                }
                z10 = true;
            }
            z13 = true;
            if (z12) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!I.d.b(jF, 0L)) {
            if (o.f(oVar.f10911f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (o.f(oVar.f10912g)) {
                edgeEffectD = oVar.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i15);
                if (edgeEffectD instanceof r) {
                    rVar3 = (r) edgeEffectD;
                    f12 = rVar3.f11022b + fIntBitsToFloat5;
                    rVar3.f11022b = f12;
                    if (Math.abs(f12) > rVar3.f11021a) {
                        rVar3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (o.f(oVar.f10909d)) {
                edgeEffectE = oVar.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i14);
                if (edgeEffectE instanceof r) {
                    rVar2 = (r) edgeEffectE;
                    f11 = rVar2.f11022b + fIntBitsToFloat4;
                    rVar2.f11022b = f11;
                    if (Math.abs(f11) > rVar2.f11021a) {
                        rVar2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (o.f(oVar.f10910e)) {
                edgeEffectB = oVar.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i14);
                if (edgeEffectB instanceof r) {
                    rVar = (r) edgeEffectB;
                    f10 = rVar.f11022b + fIntBitsToFloat3;
                    rVar.f11022b = f10;
                    if (Math.abs(f10) > rVar.f11021a) {
                        rVar.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z11 = true;
            } else {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            f();
        }
        return I.d.g(jFloatToRawIntBits, j10);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.E
    public final Object b(long j, Ia.p pVar, ContinuationImpl continuationImpl) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        float fA;
        float fA2;
        long jD;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jD2;
        float fB;
        o oVar;
        EdgeEffect edgeEffectD;
        int i10;
        EdgeEffect edgeEffectB;
        int i11;
        EdgeEffect edgeEffectE;
        int iB;
        EdgeEffect edgeEffectC;
        int iB2;
        if (continuationImpl instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuationImpl;
            int i12 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i12 - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
            }
        } else {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                kotlin.b.b(objInvoke);
                return p293xa.r.f47939a;
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jD = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
            kotlin.b.b(objInvoke);
            jD2 = p013b0.p.d(jD, ((p013b0.p) objInvoke).f20496a);
            androidEdgeEffectOverscrollEffect.f9701f = false;
            fB = p013b0.p.b(jD2);
            oVar = androidEdgeEffectOverscrollEffect.f9698c;
            if (fB > 0.0f) {
                edgeEffectC = oVar.c();
                iB2 = Ka.a.b(p013b0.p.b(jD2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectC.isFinished()) {
                    edgeEffectC.onAbsorb(iB2);
                }
            } else if (p013b0.p.b(jD2) < 0.0f) {
                edgeEffectD = oVar.d();
                i10 = -Ka.a.b(p013b0.p.b(jD2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectD.isFinished()) {
                    edgeEffectD.onAbsorb(i10);
                }
            }
            if (p013b0.p.c(jD2) > 0.0f) {
                edgeEffectE = oVar.e();
                iB = Ka.a.b(p013b0.p.c(jD2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectE.isFinished()) {
                    edgeEffectE.onAbsorb(iB);
                }
            } else if (p013b0.p.c(jD2) < 0.0f) {
                edgeEffectB = oVar.b();
                i11 = -Ka.a.b(p013b0.p.c(jD2));
                if (Build.VERSION.SDK_INT < 31 || edgeEffectB.isFinished()) {
                    edgeEffectB.onAbsorb(i11);
                }
            }
            androidEdgeEffectOverscrollEffect.d();
            return p293xa.r.f47939a;
        }
        kotlin.b.b(objInvoke);
        if (I.h.e(this.f9702g)) {
            p013b0.p pVar2 = new p013b0.p(j);
            androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
            if (pVar.invoke(pVar2, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
        o oVar2 = this.f9698c;
        boolean zG = o.g(oVar2.f10911f);
        p013b0.c cVar = this.f9696a;
        if (!zG || p013b0.p.b(j) >= 0.0f) {
            fA = (!o.g(oVar2.f10912g) || p013b0.p.b(j) <= 0.0f) ? 0.0f : -C0990m.a(oVar2.d(), -p013b0.p.b(j), Float.intBitsToFloat((int) (this.f9702g >> 32)), cVar);
        } else {
            fA = C0990m.a(oVar2.c(), p013b0.p.b(j), Float.intBitsToFloat((int) (this.f9702g >> 32)), cVar);
        }
        if (!o.g(oVar2.f10909d) || p013b0.p.c(j) >= 0.0f) {
            fA2 = (!o.g(oVar2.f10910e) || p013b0.p.c(j) <= 0.0f) ? 0.0f : -C0990m.a(oVar2.b(), -p013b0.p.c(j), Float.intBitsToFloat((int) (4294967295L & this.f9702g)), cVar);
        } else {
            fA2 = C0990m.a(oVar2.e(), p013b0.p.c(j), Float.intBitsToFloat((int) (4294967295L & this.f9702g)), cVar);
        }
        long jA = I2.e.a(fA, fA2);
        if (jA != 0) {
            f();
        }
        jD = p013b0.p.d(j, jA);
        p013b0.p pVar3 = new p013b0.p(jD);
        androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
        androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = jD;
        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
        objInvoke = pVar.invoke(pVar3, androidEdgeEffectOverscrollEffect$applyToFling$1);
        if (objInvoke == coroutineSingletons) {
            return coroutineSingletons;
        }
        androidEdgeEffectOverscrollEffect = this;
        jD2 = p013b0.p.d(jD, ((p013b0.p) objInvoke).f20496a);
        androidEdgeEffectOverscrollEffect.f9701f = false;
        fB = p013b0.p.b(jD2);
        oVar = androidEdgeEffectOverscrollEffect.f9698c;
        if (fB > 0.0f) {
            edgeEffectC = oVar.c();
            iB2 = Ka.a.b(p013b0.p.b(jD2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectC.onAbsorb(iB2);
            } else {
                edgeEffectC.onAbsorb(iB2);
            }
        } else if (p013b0.p.b(jD2) < 0.0f) {
            edgeEffectD = oVar.d();
            i10 = -Ka.a.b(p013b0.p.b(jD2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectD.onAbsorb(i10);
            } else {
                edgeEffectD.onAbsorb(i10);
            }
        }
        if (p013b0.p.c(jD2) > 0.0f) {
            edgeEffectE = oVar.e();
            iB = Ka.a.b(p013b0.p.c(jD2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectE.onAbsorb(iB);
            } else {
                edgeEffectE.onAbsorb(iB);
            }
        } else if (p013b0.p.c(jD2) < 0.0f) {
            edgeEffectB = oVar.b();
            i11 = -Ka.a.b(p013b0.p.c(jD2));
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffectB.onAbsorb(i11);
            } else {
                edgeEffectB.onAbsorb(i11);
            }
        }
        androidEdgeEffectOverscrollEffect.d();
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.E
    public final boolean c() {
        o oVar = this.f9698c;
        EdgeEffect edgeEffect = oVar.f10909d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? C0931c.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = oVar.f10910e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? C0931c.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = oVar.f10911f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? C0931c.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = oVar.f10912g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? C0931c.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void d() {
        boolean z10;
        o oVar = this.f9698c;
        EdgeEffect edgeEffect = oVar.f10909d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = oVar.f10910e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = oVar.f10911f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = oVar.f10912g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            f();
        }
    }

    public final long e() {
        long jG = this.f9697b;
        if ((9223372034707292159L & jG) == 9205357640488583168L) {
            jG = Cb.a.g(this.f9702g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32)) / Float.intBitsToFloat((int) (this.f9702g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG & 4294967295L)) / Float.intBitsToFloat((int) (this.f9702g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.f9700e) {
            this.f9699d.setValue(p293xa.r.f47939a);
        }
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f9702g & 4294967295L));
        EdgeEffect edgeEffectB = this.f9698c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = C0931c.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i11 >= 31 ? C0931c.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f9702g)) * (-fC) : Float.intBitsToFloat(i10);
    }

    @Override // androidx.compose.foundation.E
    public final InterfaceC1184e getNode() {
        return this.f9704i;
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f9702g >> 32));
        EdgeEffect edgeEffectC = this.f9698c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = C0931c.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i11 >= 31 ? C0931c.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9702g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f9702g >> 32));
        EdgeEffect edgeEffectD = this.f9698c.d();
        float fC = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = C0931c.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i11 >= 31 ? C0931c.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9702g >> 32)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f9702g & 4294967295L));
        EdgeEffect edgeEffectE = this.f9698c.e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = C0931c.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? C0931c.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9702g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final void k(long j) {
        boolean zA = I.h.a(this.f9702g, 0L);
        boolean zA2 = I.h.a(j, this.f9702g);
        this.f9702g = j;
        if (!zA2) {
            int iB = Ka.a.b(Float.intBitsToFloat((int) (j >> 32)));
            long jB = (((long) Ka.a.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            o oVar = this.f9698c;
            oVar.f10908c = jB;
            EdgeEffect edgeEffect = oVar.f10909d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = oVar.f10910e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = oVar.f10911f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = oVar.f10912g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = oVar.f10913h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = oVar.f10914i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = oVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = oVar.f10915k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }
}
