package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC0921v;
import androidx.compose.animation.core.c0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DrawerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11730c = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0<Float> f11731d = new c0<>(256, (InterfaceC0921v) null, 6);

    static {
        float f10 = 56;
        f11728a = f10;
        f11729b = f10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x014d  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d A[PHI: r0 r1 r2 r3 r5 r7 r9
      0x015d: PHI (r0v10 float) = (r0v5 float), (r0v11 float) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r1v9 androidx.compose.ui.h) = (r1v6 androidx.compose.ui.h), (r1v10 androidx.compose.ui.h) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r2v25 androidx.compose.material.DrawerState) = (r2v20 androidx.compose.material.DrawerState), (r2v27 androidx.compose.material.DrawerState) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r3v10 boolean) = (r3v7 boolean), (r3v11 boolean) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r5v12 androidx.compose.ui.graphics.l0) = (r5v5 androidx.compose.ui.graphics.l0), (r5v3 androidx.compose.ui.graphics.l0) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r7v11 long) = (r7v7 long), (r7v3 long) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r9v28 long) = (r9v25 long), (r9v29 long) binds: [B:149:0x01b1, B:121:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0166  */
    /* JADX WARN: Code duplicated, block: B:129:0x016b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0172  */
    /* JADX WARN: Code duplicated, block: B:133:0x0178  */
    /* JADX WARN: Code duplicated, block: B:136:0x017d  */
    /* JADX WARN: Code duplicated, block: B:138:0x018b  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0193  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x0218  */
    /* JADX WARN: Code duplicated, block: B:158:0x022a  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void a(final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, androidx.compose.ui.h hVar, DrawerState drawerState, boolean z10, l0 l0Var, float f10, long j, long j10, long j11, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        DrawerState drawerState2;
        int i13;
        boolean z11;
        int i14;
        final l0 l0Var2;
        int i15;
        float f11;
        int i16;
        long jH;
        int i17;
        boolean z12;
        long j12;
        final androidx.compose.ui.h hVar3;
        final DrawerState drawerState3;
        long j13;
        float f12;
        final boolean z13;
        long j14;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        DrawerState drawerStateC;
        boolean z14;
        float f13;
        long jB;
        long jA;
        Object objF;
        int i18;
        int i19;
        C1086g c1086gP = interfaceC1084f.p(1305806945);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = 2 & i11;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (c1086gP.K(drawerState2)) {
                        i19 = 256;
                    }
                    i12 |= i19;
                } else {
                    drawerState2 = drawerState;
                }
                i19 = 128;
                i12 |= i19;
            } else {
                drawerState2 = drawerState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0Var2 = l0Var;
                        int i21 = c1086gP.K(l0Var2) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i21;
                } else {
                    l0Var2 = l0Var;
                }
                i15 = 32 & i11;
                if (i15 != 0) {
                    i12 |= 196608;
                    f11 = f10;
                } else {
                    f11 = f10;
                    if ((i10 & 196608) == 0) {
                        if (c1086gP.g(f11)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0 || !c1086gP.i(jH)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                } else {
                    jH = j;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.i(j11)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i12 & 1, z12)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if ((4 & i11) != 0) {
                            DrawerValue drawerValue = DrawerValue.f11736b;
                            drawerStateC = c(c1086gP);
                        } else {
                            drawerStateC = drawerState2;
                        }
                        z14 = i13 == 0 ? z11 : true;
                        if ((16 & i11) != 0) {
                            float f14 = w.f12028a;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        }
                        if (i15 != 0) {
                            f13 = w.f12028a;
                        } else {
                            f13 = f11;
                        }
                        if ((i11 & 64) != 0) {
                            float f15 = w.f12028a;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        }
                        if ((128 & i11) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j10;
                        }
                        if ((256 & i11) != 0) {
                            jA = w.a(c1086gP);
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) objF;
                        final DrawerState drawerState4 = drawerStateC;
                        final boolean z15 = z14;
                        final long j15 = jA;
                        final l0 l0Var3 = l0Var2;
                        final long j16 = jH;
                        final long j17 = jB;
                        final float f16 = f13;
                        BoxWithConstraintsKt.a(hVar4.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(816674999, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Code duplicated, block: B:45:0x014c  */
                            /* JADX WARN: Code duplicated, block: B:47:0x0155  */
                            /* JADX WARN: Code duplicated, block: B:48:0x0159  */
                            /* JADX WARN: Code duplicated, block: B:53:0x0176  */
                            /* JADX WARN: Code duplicated, block: B:56:0x018e  */
                            /* JADX WARN: Code duplicated, block: B:57:0x0190  */
                            /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
                            /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
                            /* JADX WARN: Code duplicated, block: B:69:0x0218  */
                            /* JADX WARN: Code duplicated, block: B:73:0x024a  */
                            /* JADX WARN: Code duplicated, block: B:75:0x027b  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                                float f17;
                                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
                                androidx.compose.ui.layout.E eD;
                                int iF;
                                InterfaceC1089h0 interfaceC1089h0Z;
                                androidx.compose.ui.h hVarC;
                                boolean z16;
                                boolean zC;
                                Object objF2;
                                final float f18;
                                boolean zG;
                                Object objF3;
                                final String strK;
                                boolean zK;
                                Object objF4;
                                boolean zK2;
                                Object objF5;
                                InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(interfaceC0950j2) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    long jC = interfaceC0950j2.c();
                                    if (!p013b0.a.d(jC)) {
                                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                                    }
                                    final float f19 = -p013b0.a.h(jC);
                                    O0 o10 = CompositionLocalsKt.f14847h;
                                    final p013b0.c cVar = (p013b0.c) interfaceC1084f3.x(o10);
                                    boolean zK3 = interfaceC1084f3.K(drawerState4) | interfaceC1084f3.K(cVar) | interfaceC1084f3.g(f19);
                                    final DrawerState drawerState5 = drawerState4;
                                    Object objF6 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF6 == c0153a) {
                                        objF6 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                            final /* synthetic */ float $maxValue = 0.0f;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                Object value;
                                                drawerState5.f11734b = cVar;
                                                final float f20 = f19;
                                                final float f21 = this.$maxValue;
                                                Ia.l<C1045v<DrawerValue>, p293xa.r> lVar = new Ia.l<C1045v<DrawerValue>, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(C1045v<DrawerValue> c1045v) {
                                                        C1045v<DrawerValue> c1045v2 = c1045v;
                                                        c1045v2.f12027a.put(DrawerValue.f11736b, Float.valueOf(f20));
                                                        c1045v2.f12027a.put(DrawerValue.f11737c, Float.valueOf(f21));
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                C1045v<DrawerValue> c1045v = new C1045v<>();
                                                lVar.invoke(c1045v);
                                                F f22 = new F(c1045v.f12027a);
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState5.f11733a;
                                                boolean zIsNaN = Float.isNaN(anchoredDraggableState.j.j());
                                                DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.f11675h;
                                                if (zIsNaN || (value = f22.c(anchoredDraggableState.j.j())) == null) {
                                                    value = derivedSnapshotState.getValue();
                                                }
                                                if (!kotlin.jvm.internal.i.a(anchoredDraggableState.d(), f22)) {
                                                    anchoredDraggableState.f11679m.setValue(f22);
                                                    if (!anchoredDraggableState.h((DrawerValue) value)) {
                                                        anchoredDraggableState.g((DrawerValue) value);
                                                    }
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF6);
                                    }
                                    androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                                    interfaceC1084f3.l((Ia.a) objF6);
                                    boolean z17 = interfaceC1084f3.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c;
                                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState4.f11733a;
                                    Orientation orientation = Orientation.f9957b;
                                    androidx.compose.ui.h hVarA = DraggableKt.a(aVar, anchoredDraggableState.f11673f, Orientation.f9958c, z15, null, anchoredDraggableState.f11678l.getValue() != 0, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z17, 32);
                                    final DrawerState drawerState6 = drawerState4;
                                    final boolean z18 = z15;
                                    final kotlinx.coroutines.A a11 = a10;
                                    long j18 = j15;
                                    l0 l0Var4 = l0Var3;
                                    long j19 = j16;
                                    long j20 = j17;
                                    float f20 = f16;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                                    final Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                                    androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                                    int iF2 = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
                                    R0.a(pVar4, interfaceC1084f3, eD2);
                                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
                                    R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z2);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m()) {
                                        f17 = f19;
                                    } else {
                                        f17 = f19;
                                        if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                        }
                                        pVar2 = ComposeUiNode.Companion.f14335d;
                                        R0.a(pVar2, interfaceC1084f3, hVarC2);
                                        eD = BoxKt.d(fVar, false);
                                        iF = interfaceC1084f3.F();
                                        interfaceC1089h0Z = interfaceC1084f3.z();
                                        hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                        if (interfaceC1084f3.u() != null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f3.r();
                                        if (interfaceC1084f3.m()) {
                                            interfaceC1084f3.v(aVar2);
                                        } else {
                                            interfaceC1084f3.A();
                                        }
                                        R0.a(pVar4, interfaceC1084f3, eD);
                                        R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                        }
                                        R0.a(pVar2, interfaceC1084f3, hVarC);
                                        androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                        if (((DrawerValue) drawerState6.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        zC = interfaceC1084f3.c(z18) | interfaceC1084f3.K(drawerState6) | interfaceC1084f3.k(a11);
                                        objF2 = interfaceC1084f3.f();
                                        if (zC || objF2 == c0153a) {
                                            objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new AnonymousClass1(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final p293xa.r invoke() {
                                                    if (z18 && drawerState6.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a11, null, null, new AnonymousClass1(drawerState6, null), 3);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF2);
                                        }
                                        Ia.a aVar3 = (Ia.a) objF2;
                                        f18 = f17;
                                        zG = interfaceC1084f3.g(f18) | interfaceC1084f3.K(drawerState6);
                                        objF3 = interfaceC1084f3.f();
                                        if (zG || objF3 == c0153a) {
                                            objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                                final /* synthetic */ float $maxValue = 0.0f;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Float invoke() {
                                                    float f21 = f18;
                                                    float f22 = this.$maxValue;
                                                    float fE = drawerState6.f11733a.e();
                                                    float f23 = DrawerKt.f11728a;
                                                    float f24 = (fE - f21) / (f22 - f21);
                                                    if (f24 < 0.0f) {
                                                        f24 = 0.0f;
                                                    }
                                                    if (f24 > 1.0f) {
                                                        f24 = 1.0f;
                                                    }
                                                    return Float.valueOf(f24);
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DrawerKt.b(z16, aVar3, (Ia.a) objF3, j18, interfaceC1084f3, 0);
                                        strK = P3.d.k(interfaceC1084f3, 0);
                                        p013b0.c cVar2 = (p013b0.c) interfaceC1084f3.x(o10);
                                        androidx.compose.ui.h hVarO = W.o(aVar, cVar2.u(p013b0.a.j(jC)), cVar2.u(p013b0.a.i(jC)), cVar2.u(p013b0.a.h(jC)), cVar2.u(p013b0.a.g(jC)));
                                        zK = interfaceC1084f3.K(drawerState6);
                                        objF4 = interfaceC1084f3.f();
                                        if (zK || objF4 == c0153a) {
                                            objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p013b0.j invoke(p013b0.c cVar3) {
                                                    return new p013b0.j(Cb.a.a(Ka.a.b(drawerState6.f11733a.e()), 0));
                                                }
                                            };
                                            interfaceC1084f3.E(objF4);
                                        }
                                        androidx.compose.ui.h hVarJ = PaddingKt.j(OffsetKt.a(hVarO, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                        zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState6) | interfaceC1084f3.k(a11);
                                        objF5 = interfaceC1084f3.f();
                                        if (zK2 || objF5 == c0153a) {
                                            objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // Ia.l
                                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                                    androidx.compose.ui.semantics.t.j(strK, wVar2);
                                                    if (((DrawerValue) drawerState6.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                        final DrawerState drawerState7 = drawerState6;
                                                        final kotlinx.coroutines.A a12 = a11;
                                                        wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            /* JADX INFO: compiled from: Drawer.kt */
                                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                            final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                                final /* synthetic */ DrawerState $drawerState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                                    super(2, cVar);
                                                                    this.$drawerState = drawerState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                                    return new C01421(this.$drawerState, cVar);
                                                                }

                                                                @Override // Ia.p
                                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                                    return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                                    int i10 = this.label;
                                                                    if (i10 == 0) {
                                                                        kotlin.b.b(obj);
                                                                        DrawerState drawerState = this.$drawerState;
                                                                        this.label = 1;
                                                                        drawerState.getClass();
                                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                        if (objB != obj2) {
                                                                            objB = p293xa.r.f47939a;
                                                                        }
                                                                        if (objB == obj2) {
                                                                            return obj2;
                                                                        }
                                                                    } else {
                                                                        if (i10 != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        kotlin.b.b(obj);
                                                                    }
                                                                    return p293xa.r.f47939a;
                                                                }
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // Ia.a
                                                            public final Boolean invoke() {
                                                                if (drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                                    C2680e.c(a12, null, null, new C01421(drawerState7, null), 3);
                                                                }
                                                                return Boolean.TRUE;
                                                            }
                                                        }));
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF5);
                                        }
                                        SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ, false, (Ia.l) objF5), l0Var4, j19, j20, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                int iIntValue2 = num2.intValue();
                                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    FillElement fillElement = W.f10226c;
                                                    Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                                    int iF3 = interfaceC1084f5.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f5.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f5.r();
                                                    if (interfaceC1084f5.m()) {
                                                        interfaceC1084f5.v(aVar4);
                                                    } else {
                                                        interfaceC1084f5.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                        androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                    qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                                    interfaceC1084f5.J();
                                                } else {
                                                    interfaceC1084f5.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                        interfaceC1084f3.J();
                                    }
                                    androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar6);
                                    pVar2 = ComposeUiNode.Companion.f14335d;
                                    R0.a(pVar2, interfaceC1084f3, hVarC2);
                                    eD = BoxKt.d(fVar, false);
                                    iF = interfaceC1084f3.F();
                                    interfaceC1089h0Z = interfaceC1084f3.z();
                                    hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                    if (interfaceC1084f3.u() != null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(pVar4, interfaceC1084f3, eD);
                                    R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                    if (interfaceC1084f3.m()) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                    } else {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                    }
                                    R0.a(pVar2, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                    if (((DrawerValue) drawerState6.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    zC = interfaceC1084f3.c(z18) | interfaceC1084f3.K(drawerState6) | interfaceC1084f3.k(a11);
                                    objF2 = interfaceC1084f3.f();
                                    if (zC) {
                                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: Drawer.kt */
                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                    super(2, cVar);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                    return new AnonymousClass1(this.$drawerState, cVar);
                                                }

                                                @Override // Ia.p
                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        kotlin.b.b(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        drawerState.getClass();
                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                        if (objB != obj2) {
                                                            objB = p293xa.r.f47939a;
                                                        }
                                                        if (objB == obj2) {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        kotlin.b.b(obj);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                if (z18 && drawerState6.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                    C2680e.c(a11, null, null, new AnonymousClass1(drawerState6, null), 3);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    } else {
                                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: Drawer.kt */
                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                    super(2, cVar);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                    return new AnonymousClass1(this.$drawerState, cVar);
                                                }

                                                @Override // Ia.p
                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        kotlin.b.b(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        drawerState.getClass();
                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                        if (objB != obj2) {
                                                            objB = p293xa.r.f47939a;
                                                        }
                                                        if (objB == obj2) {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        kotlin.b.b(obj);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                if (z18 && drawerState6.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                    C2680e.c(a11, null, null, new AnonymousClass1(drawerState6, null), 3);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    Ia.a aVar4 = (Ia.a) objF2;
                                    f18 = f17;
                                    zG = interfaceC1084f3.g(f18) | interfaceC1084f3.K(drawerState6);
                                    objF3 = interfaceC1084f3.f();
                                    if (zG) {
                                        objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            final /* synthetic */ float $maxValue = 0.0f;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final Float invoke() {
                                                float f21 = f18;
                                                float f22 = this.$maxValue;
                                                float fE = drawerState6.f11733a.e();
                                                float f23 = DrawerKt.f11728a;
                                                float f24 = (fE - f21) / (f22 - f21);
                                                if (f24 < 0.0f) {
                                                    f24 = 0.0f;
                                                }
                                                if (f24 > 1.0f) {
                                                    f24 = 1.0f;
                                                }
                                                return Float.valueOf(f24);
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    } else {
                                        objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            final /* synthetic */ float $maxValue = 0.0f;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final Float invoke() {
                                                float f21 = f18;
                                                float f22 = this.$maxValue;
                                                float fE = drawerState6.f11733a.e();
                                                float f23 = DrawerKt.f11728a;
                                                float f24 = (fE - f21) / (f22 - f21);
                                                if (f24 < 0.0f) {
                                                    f24 = 0.0f;
                                                }
                                                if (f24 > 1.0f) {
                                                    f24 = 1.0f;
                                                }
                                                return Float.valueOf(f24);
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DrawerKt.b(z16, aVar4, (Ia.a) objF3, j18, interfaceC1084f3, 0);
                                    strK = P3.d.k(interfaceC1084f3, 0);
                                    p013b0.c cVar3 = (p013b0.c) interfaceC1084f3.x(o10);
                                    androidx.compose.ui.h hVarO2 = W.o(aVar, cVar3.u(p013b0.a.j(jC)), cVar3.u(p013b0.a.i(jC)), cVar3.u(p013b0.a.h(jC)), cVar3.u(p013b0.a.g(jC)));
                                    zK = interfaceC1084f3.K(drawerState6);
                                    objF4 = interfaceC1084f3.f();
                                    if (zK) {
                                        objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p013b0.j invoke(p013b0.c cVar4) {
                                                return new p013b0.j(Cb.a.a(Ka.a.b(drawerState6.f11733a.e()), 0));
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    } else {
                                        objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p013b0.j invoke(p013b0.c cVar4) {
                                                return new p013b0.j(Cb.a.a(Ka.a.b(drawerState6.f11733a.e()), 0));
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    androidx.compose.ui.h hVarJ2 = PaddingKt.j(OffsetKt.a(hVarO2, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                    zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState6) | interfaceC1084f3.k(a11);
                                    objF5 = interfaceC1084f3.f();
                                    if (zK2) {
                                        objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.j(strK, wVar2);
                                                if (((DrawerValue) drawerState6.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                    final DrawerState drawerState7 = drawerState6;
                                                    final kotlinx.coroutines.A a12 = a11;
                                                    wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        /* JADX INFO: compiled from: Drawer.kt */
                                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                        final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                            final /* synthetic */ DrawerState $drawerState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                                super(2, cVar);
                                                                this.$drawerState = drawerState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                                return new C01421(this.$drawerState, cVar);
                                                            }

                                                            @Override // Ia.p
                                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                                return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                                Object obj2 = CoroutineSingletons.f43038b;
                                                                int i10 = this.label;
                                                                if (i10 == 0) {
                                                                    kotlin.b.b(obj);
                                                                    DrawerState drawerState = this.$drawerState;
                                                                    this.label = 1;
                                                                    drawerState.getClass();
                                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                    if (objB != obj2) {
                                                                        objB = p293xa.r.f47939a;
                                                                    }
                                                                    if (objB == obj2) {
                                                                        return obj2;
                                                                    }
                                                                } else {
                                                                    if (i10 != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    kotlin.b.b(obj);
                                                                }
                                                                return p293xa.r.f47939a;
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // Ia.a
                                                        public final Boolean invoke() {
                                                            if (drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                                C2680e.c(a12, null, null, new C01421(drawerState7, null), 3);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }));
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF5);
                                    } else {
                                        objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.j(strK, wVar2);
                                                if (((DrawerValue) drawerState6.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                    final DrawerState drawerState7 = drawerState6;
                                                    final kotlinx.coroutines.A a12 = a11;
                                                    wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        /* JADX INFO: compiled from: Drawer.kt */
                                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                        final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                            final /* synthetic */ DrawerState $drawerState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                                super(2, cVar);
                                                                this.$drawerState = drawerState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                                return new C01421(this.$drawerState, cVar);
                                                            }

                                                            @Override // Ia.p
                                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                                return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                                Object obj2 = CoroutineSingletons.f43038b;
                                                                int i10 = this.label;
                                                                if (i10 == 0) {
                                                                    kotlin.b.b(obj);
                                                                    DrawerState drawerState = this.$drawerState;
                                                                    this.label = 1;
                                                                    drawerState.getClass();
                                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                    if (objB != obj2) {
                                                                        objB = p293xa.r.f47939a;
                                                                    }
                                                                    if (objB == obj2) {
                                                                        return obj2;
                                                                    }
                                                                } else {
                                                                    if (i10 != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    kotlin.b.b(obj);
                                                                }
                                                                return p293xa.r.f47939a;
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // Ia.a
                                                        public final Boolean invoke() {
                                                            if (drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                                C2680e.c(a12, null, null, new C01421(drawerState7, null), 3);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }));
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF5);
                                    }
                                    SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ2, false, (Ia.l) objF5), l0Var4, j19, j20, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                FillElement fillElement = W.f10226c;
                                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar5);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                                interfaceC1084f5.J();
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 3072, 6);
                        z13 = z14;
                        j14 = jA;
                        drawerState3 = drawerStateC;
                        j13 = jB;
                        hVar3 = hVar4;
                        j12 = jH;
                        f12 = f13;
                    } else {
                        c1086gP.w();
                        f13 = f11;
                        hVar4 = hVar2;
                        drawerStateC = drawerState2;
                        z14 = z11;
                        jB = j10;
                    }
                    jA = j11;
                    c1086gP.U();
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) objF;
                    final DrawerState drawerState5 = drawerStateC;
                    final boolean z16 = z14;
                    final long j18 = jA;
                    final l0 l0Var4 = l0Var2;
                    final long j19 = jH;
                    final long j110 = jB;
                    final float f17 = f13;
                    BoxWithConstraintsKt.a(hVar4.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(816674999, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Code duplicated, block: B:45:0x014c  */
                        /* JADX WARN: Code duplicated, block: B:47:0x0155  */
                        /* JADX WARN: Code duplicated, block: B:48:0x0159  */
                        /* JADX WARN: Code duplicated, block: B:53:0x0176  */
                        /* JADX WARN: Code duplicated, block: B:56:0x018e  */
                        /* JADX WARN: Code duplicated, block: B:57:0x0190  */
                        /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
                        /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0218  */
                        /* JADX WARN: Code duplicated, block: B:73:0x024a  */
                        /* JADX WARN: Code duplicated, block: B:75:0x027b  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                            float f18;
                            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
                            androidx.compose.ui.layout.E eD;
                            int iF;
                            InterfaceC1089h0 interfaceC1089h0Z;
                            androidx.compose.ui.h hVarC;
                            boolean z17;
                            boolean zC;
                            Object objF2;
                            final float f19;
                            boolean zG;
                            Object objF3;
                            final String strK;
                            boolean zK;
                            Object objF4;
                            boolean zK2;
                            Object objF5;
                            InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(interfaceC0950j2) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                long jC = interfaceC0950j2.c();
                                if (!p013b0.a.d(jC)) {
                                    throw new IllegalStateException("Drawer shouldn't have infinite width");
                                }
                                final float f110 = -p013b0.a.h(jC);
                                O0 o10 = CompositionLocalsKt.f14847h;
                                final p013b0.c cVar = (p013b0.c) interfaceC1084f3.x(o10);
                                boolean zK3 = interfaceC1084f3.K(drawerState5) | interfaceC1084f3.K(cVar) | interfaceC1084f3.g(f110);
                                final DrawerState drawerState6 = drawerState5;
                                Object objF6 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF6 == c0153a) {
                                    objF6 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                        final /* synthetic */ float $maxValue = 0.0f;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            Object value;
                                            drawerState6.f11734b = cVar;
                                            final float f20 = f110;
                                            final float f21 = this.$maxValue;
                                            Ia.l<C1045v<DrawerValue>, p293xa.r> lVar = new Ia.l<C1045v<DrawerValue>, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1045v<DrawerValue> c1045v) {
                                                    C1045v<DrawerValue> c1045v2 = c1045v;
                                                    c1045v2.f12027a.put(DrawerValue.f11736b, Float.valueOf(f20));
                                                    c1045v2.f12027a.put(DrawerValue.f11737c, Float.valueOf(f21));
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            C1045v<DrawerValue> c1045v = new C1045v<>();
                                            lVar.invoke(c1045v);
                                            F f22 = new F(c1045v.f12027a);
                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState6.f11733a;
                                            boolean zIsNaN = Float.isNaN(anchoredDraggableState.j.j());
                                            DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.f11675h;
                                            if (zIsNaN || (value = f22.c(anchoredDraggableState.j.j())) == null) {
                                                value = derivedSnapshotState.getValue();
                                            }
                                            if (!kotlin.jvm.internal.i.a(anchoredDraggableState.d(), f22)) {
                                                anchoredDraggableState.f11679m.setValue(f22);
                                                if (!anchoredDraggableState.h((DrawerValue) value)) {
                                                    anchoredDraggableState.g((DrawerValue) value);
                                                }
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF6);
                                }
                                androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                                interfaceC1084f3.l((Ia.a) objF6);
                                boolean z18 = interfaceC1084f3.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState5.f11733a;
                                Orientation orientation = Orientation.f9957b;
                                androidx.compose.ui.h hVarA = DraggableKt.a(aVar, anchoredDraggableState.f11673f, Orientation.f9958c, z16, null, anchoredDraggableState.f11678l.getValue() != 0, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32);
                                final DrawerState drawerState7 = drawerState5;
                                final boolean z19 = z16;
                                final kotlinx.coroutines.A a12 = a11;
                                long j111 = j18;
                                l0 l0Var5 = l0Var4;
                                long j112 = j19;
                                long j20 = j110;
                                float f20 = f17;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                                final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                                int iF2 = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
                                R0.a(pVar4, interfaceC1084f3, eD2);
                                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z2);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m()) {
                                    f18 = f110;
                                } else {
                                    f18 = f110;
                                    if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                    }
                                    pVar2 = ComposeUiNode.Companion.f14335d;
                                    R0.a(pVar2, interfaceC1084f3, hVarC2);
                                    eD = BoxKt.d(fVar, false);
                                    iF = interfaceC1084f3.F();
                                    interfaceC1089h0Z = interfaceC1084f3.z();
                                    hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                    if (interfaceC1084f3.u() != null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(pVar4, interfaceC1084f3, eD);
                                    R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                    }
                                    R0.a(pVar2, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                    if (((DrawerValue) drawerState7.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    zC = interfaceC1084f3.c(z19) | interfaceC1084f3.K(drawerState7) | interfaceC1084f3.k(a12);
                                    objF2 = interfaceC1084f3.f();
                                    if (zC || objF2 == c0153a) {
                                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: Drawer.kt */
                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                    super(2, cVar);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                    return new AnonymousClass1(this.$drawerState, cVar);
                                                }

                                                @Override // Ia.p
                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        kotlin.b.b(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        drawerState.getClass();
                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                        if (objB != obj2) {
                                                            objB = p293xa.r.f47939a;
                                                        }
                                                        if (objB == obj2) {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        kotlin.b.b(obj);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                if (z19 && drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                    C2680e.c(a12, null, null, new AnonymousClass1(drawerState7, null), 3);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    Ia.a aVar4 = (Ia.a) objF2;
                                    f19 = f18;
                                    zG = interfaceC1084f3.g(f19) | interfaceC1084f3.K(drawerState7);
                                    objF3 = interfaceC1084f3.f();
                                    if (zG || objF3 == c0153a) {
                                        objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            final /* synthetic */ float $maxValue = 0.0f;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final Float invoke() {
                                                float f21 = f19;
                                                float f22 = this.$maxValue;
                                                float fE = drawerState7.f11733a.e();
                                                float f23 = DrawerKt.f11728a;
                                                float f24 = (fE - f21) / (f22 - f21);
                                                if (f24 < 0.0f) {
                                                    f24 = 0.0f;
                                                }
                                                if (f24 > 1.0f) {
                                                    f24 = 1.0f;
                                                }
                                                return Float.valueOf(f24);
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DrawerKt.b(z17, aVar4, (Ia.a) objF3, j111, interfaceC1084f3, 0);
                                    strK = P3.d.k(interfaceC1084f3, 0);
                                    p013b0.c cVar3 = (p013b0.c) interfaceC1084f3.x(o10);
                                    androidx.compose.ui.h hVarO2 = W.o(aVar, cVar3.u(p013b0.a.j(jC)), cVar3.u(p013b0.a.i(jC)), cVar3.u(p013b0.a.h(jC)), cVar3.u(p013b0.a.g(jC)));
                                    zK = interfaceC1084f3.K(drawerState7);
                                    objF4 = interfaceC1084f3.f();
                                    if (zK || objF4 == c0153a) {
                                        objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p013b0.j invoke(p013b0.c cVar4) {
                                                return new p013b0.j(Cb.a.a(Ka.a.b(drawerState7.f11733a.e()), 0));
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    androidx.compose.ui.h hVarJ2 = PaddingKt.j(OffsetKt.a(hVarO2, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                    zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState7) | interfaceC1084f3.k(a12);
                                    objF5 = interfaceC1084f3.f();
                                    if (zK2 || objF5 == c0153a) {
                                        objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.j(strK, wVar2);
                                                if (((DrawerValue) drawerState7.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                    final DrawerState drawerState8 = drawerState7;
                                                    final kotlinx.coroutines.A a13 = a12;
                                                    wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        /* JADX INFO: compiled from: Drawer.kt */
                                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                        final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                            final /* synthetic */ DrawerState $drawerState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                                super(2, cVar);
                                                                this.$drawerState = drawerState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                                return new C01421(this.$drawerState, cVar);
                                                            }

                                                            @Override // Ia.p
                                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                                return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                                Object obj2 = CoroutineSingletons.f43038b;
                                                                int i10 = this.label;
                                                                if (i10 == 0) {
                                                                    kotlin.b.b(obj);
                                                                    DrawerState drawerState = this.$drawerState;
                                                                    this.label = 1;
                                                                    drawerState.getClass();
                                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                    if (objB != obj2) {
                                                                        objB = p293xa.r.f47939a;
                                                                    }
                                                                    if (objB == obj2) {
                                                                        return obj2;
                                                                    }
                                                                } else {
                                                                    if (i10 != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    kotlin.b.b(obj);
                                                                }
                                                                return p293xa.r.f47939a;
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // Ia.a
                                                        public final Boolean invoke() {
                                                            if (drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                                C2680e.c(a13, null, null, new C01421(drawerState8, null), 3);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }));
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF5);
                                    }
                                    SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ2, false, (Ia.l) objF5), l0Var5, j112, j20, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                FillElement fillElement = W.f10226c;
                                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar5);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                                interfaceC1084f5.J();
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                    interfaceC1084f3.J();
                                }
                                androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar6);
                                pVar2 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar2, interfaceC1084f3, hVarC2);
                                eD = BoxKt.d(fVar, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar4, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m()) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                } else {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                }
                                R0.a(pVar2, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                if (((DrawerValue) drawerState7.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zC = interfaceC1084f3.c(z19) | interfaceC1084f3.K(drawerState7) | interfaceC1084f3.k(a12);
                                objF2 = interfaceC1084f3.f();
                                if (zC) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: Drawer.kt */
                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                return new AnonymousClass1(this.$drawerState, cVar);
                                            }

                                            @Override // Ia.p
                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object obj2 = CoroutineSingletons.f43038b;
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    kotlin.b.b(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    drawerState.getClass();
                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                    if (objB != obj2) {
                                                        objB = p293xa.r.f47939a;
                                                    }
                                                    if (objB == obj2) {
                                                        return obj2;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    kotlin.b.b(obj);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (z19 && drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                C2680e.c(a12, null, null, new AnonymousClass1(drawerState7, null), 3);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                } else {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: Drawer.kt */
                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                return new AnonymousClass1(this.$drawerState, cVar);
                                            }

                                            @Override // Ia.p
                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object obj2 = CoroutineSingletons.f43038b;
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    kotlin.b.b(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    drawerState.getClass();
                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                    if (objB != obj2) {
                                                        objB = p293xa.r.f47939a;
                                                    }
                                                    if (objB == obj2) {
                                                        return obj2;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    kotlin.b.b(obj);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (z19 && drawerState7.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                C2680e.c(a12, null, null, new AnonymousClass1(drawerState7, null), 3);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                Ia.a aVar5 = (Ia.a) objF2;
                                f19 = f18;
                                zG = interfaceC1084f3.g(f19) | interfaceC1084f3.K(drawerState7);
                                objF3 = interfaceC1084f3.f();
                                if (zG) {
                                    objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                        final /* synthetic */ float $maxValue = 0.0f;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final Float invoke() {
                                            float f21 = f19;
                                            float f22 = this.$maxValue;
                                            float fE = drawerState7.f11733a.e();
                                            float f23 = DrawerKt.f11728a;
                                            float f24 = (fE - f21) / (f22 - f21);
                                            if (f24 < 0.0f) {
                                                f24 = 0.0f;
                                            }
                                            if (f24 > 1.0f) {
                                                f24 = 1.0f;
                                            }
                                            return Float.valueOf(f24);
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                } else {
                                    objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                        final /* synthetic */ float $maxValue = 0.0f;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final Float invoke() {
                                            float f21 = f19;
                                            float f22 = this.$maxValue;
                                            float fE = drawerState7.f11733a.e();
                                            float f23 = DrawerKt.f11728a;
                                            float f24 = (fE - f21) / (f22 - f21);
                                            if (f24 < 0.0f) {
                                                f24 = 0.0f;
                                            }
                                            if (f24 > 1.0f) {
                                                f24 = 1.0f;
                                            }
                                            return Float.valueOf(f24);
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DrawerKt.b(z17, aVar5, (Ia.a) objF3, j111, interfaceC1084f3, 0);
                                strK = P3.d.k(interfaceC1084f3, 0);
                                p013b0.c cVar4 = (p013b0.c) interfaceC1084f3.x(o10);
                                androidx.compose.ui.h hVarO3 = W.o(aVar, cVar4.u(p013b0.a.j(jC)), cVar4.u(p013b0.a.i(jC)), cVar4.u(p013b0.a.h(jC)), cVar4.u(p013b0.a.g(jC)));
                                zK = interfaceC1084f3.K(drawerState7);
                                objF4 = interfaceC1084f3.f();
                                if (zK) {
                                    objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p013b0.j invoke(p013b0.c cVar5) {
                                            return new p013b0.j(Cb.a.a(Ka.a.b(drawerState7.f11733a.e()), 0));
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                } else {
                                    objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p013b0.j invoke(p013b0.c cVar5) {
                                            return new p013b0.j(Cb.a.a(Ka.a.b(drawerState7.f11733a.e()), 0));
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                androidx.compose.ui.h hVarJ3 = PaddingKt.j(OffsetKt.a(hVarO3, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState7) | interfaceC1084f3.k(a12);
                                objF5 = interfaceC1084f3.f();
                                if (zK2) {
                                    objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.j(strK, wVar2);
                                            if (((DrawerValue) drawerState7.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                final DrawerState drawerState8 = drawerState7;
                                                final kotlinx.coroutines.A a13 = a12;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    /* JADX INFO: compiled from: Drawer.kt */
                                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                    final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                            super(2, cVar);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                            return new C01421(this.$drawerState, cVar);
                                                        }

                                                        @Override // Ia.p
                                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                            return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                                            Object obj2 = CoroutineSingletons.f43038b;
                                                            int i10 = this.label;
                                                            if (i10 == 0) {
                                                                kotlin.b.b(obj);
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                drawerState.getClass();
                                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                if (objB != obj2) {
                                                                    objB = p293xa.r.f47939a;
                                                                }
                                                                if (objB == obj2) {
                                                                    return obj2;
                                                                }
                                                            } else {
                                                                if (i10 != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.b.b(obj);
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        if (drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                            C2680e.c(a13, null, null, new C01421(drawerState8, null), 3);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }));
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF5);
                                } else {
                                    objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.j(strK, wVar2);
                                            if (((DrawerValue) drawerState7.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                final DrawerState drawerState8 = drawerState7;
                                                final kotlinx.coroutines.A a13 = a12;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    /* JADX INFO: compiled from: Drawer.kt */
                                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                    final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                            super(2, cVar);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                            return new C01421(this.$drawerState, cVar);
                                                        }

                                                        @Override // Ia.p
                                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                            return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                                            Object obj2 = CoroutineSingletons.f43038b;
                                                            int i10 = this.label;
                                                            if (i10 == 0) {
                                                                kotlin.b.b(obj);
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                drawerState.getClass();
                                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                if (objB != obj2) {
                                                                    objB = p293xa.r.f47939a;
                                                                }
                                                                if (objB == obj2) {
                                                                    return obj2;
                                                                }
                                                            } else {
                                                                if (i10 != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.b.b(obj);
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        if (drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                            C2680e.c(a13, null, null, new C01421(drawerState8, null), 3);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }));
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF5);
                                }
                                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ3, false, (Ia.l) objF5), l0Var5, j112, j20, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            FillElement fillElement = W.f10226c;
                                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar6);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 3072, 6);
                    z13 = z14;
                    j14 = jA;
                    drawerState3 = drawerStateC;
                    j13 = jB;
                    hVar3 = hVar4;
                    j12 = jH;
                    f12 = f13;
                } else {
                    c1086gP.w();
                    j12 = jH;
                    hVar3 = hVar2;
                    drawerState3 = drawerState2;
                    j13 = j10;
                    f12 = f11;
                    z13 = z11;
                    j14 = j11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f18 = f12;
                    final long j20 = j12;
                    final long j21 = j13;
                    final long j22 = j14;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DrawerKt.a(qVar, hVar3, drawerState3, z13, l0Var2, f18, j20, j21, j22, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i21;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i21;
            } else {
                l0Var2 = l0Var;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 196608) == 0) {
                    if (c1086gP.g(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 1572864) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                jH = j;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.i(j11)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((4 & i11) != 0) {
                        DrawerValue drawerValue2 = DrawerValue.f11736b;
                        drawerStateC = c(c1086gP);
                    } else {
                        drawerStateC = drawerState2;
                    }
                    if (i13 == 0) {
                    }
                    if ((16 & i11) != 0) {
                        float f19 = w.f12028a;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    }
                    if (i15 != 0) {
                        f13 = w.f12028a;
                    } else {
                        f13 = f11;
                    }
                    if ((i11 & 64) != 0) {
                        float f110 = w.f12028a;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    }
                    if ((128 & i11) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j10;
                    }
                    if ((256 & i11) != 0) {
                        jA = w.a(c1086gP);
                    } else {
                        jA = j11;
                    }
                } else {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((4 & i11) != 0) {
                        DrawerValue drawerValue3 = DrawerValue.f11736b;
                        drawerStateC = c(c1086gP);
                    } else {
                        drawerStateC = drawerState2;
                    }
                    if (i13 == 0) {
                    }
                    if ((16 & i11) != 0) {
                        float f111 = w.f12028a;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    }
                    if (i15 != 0) {
                        f13 = w.f12028a;
                    } else {
                        f13 = f11;
                    }
                    if ((i11 & 64) != 0) {
                        float f112 = w.f12028a;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    }
                    if ((128 & i11) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j10;
                    }
                    if ((256 & i11) != 0) {
                        jA = w.a(c1086gP);
                    } else {
                        jA = j11;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final kotlinx.coroutines.A a12 = (kotlinx.coroutines.A) objF;
                final DrawerState drawerState6 = drawerStateC;
                final boolean z17 = z14;
                final long j111 = jA;
                final l0 l0Var5 = l0Var2;
                final long j112 = jH;
                final long j113 = jB;
                final float f113 = f13;
                BoxWithConstraintsKt.a(hVar4.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(816674999, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
                    /* JADX WARN: Code duplicated, block: B:56:0x018e  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
                    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
                    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0218  */
                    /* JADX WARN: Code duplicated, block: B:73:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:75:0x027b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        float f114;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        boolean z18;
                        boolean zC;
                        Object objF2;
                        final float f115;
                        boolean zG;
                        Object objF3;
                        final String strK;
                        boolean zK;
                        Object objF4;
                        boolean zK2;
                        Object objF5;
                        InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(interfaceC0950j2) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            long jC = interfaceC0950j2.c();
                            if (!p013b0.a.d(jC)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f116 = -p013b0.a.h(jC);
                            O0 o10 = CompositionLocalsKt.f14847h;
                            final p013b0.c cVar = (p013b0.c) interfaceC1084f3.x(o10);
                            boolean zK3 = interfaceC1084f3.K(drawerState6) | interfaceC1084f3.K(cVar) | interfaceC1084f3.g(f116);
                            final DrawerState drawerState7 = drawerState6;
                            Object objF6 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF6 == c0153a) {
                                objF6 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        Object value;
                                        drawerState7.f11734b = cVar;
                                        final float f20 = f116;
                                        final float f21 = this.$maxValue;
                                        Ia.l<C1045v<DrawerValue>, p293xa.r> lVar = new Ia.l<C1045v<DrawerValue>, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1045v<DrawerValue> c1045v) {
                                                C1045v<DrawerValue> c1045v2 = c1045v;
                                                c1045v2.f12027a.put(DrawerValue.f11736b, Float.valueOf(f20));
                                                c1045v2.f12027a.put(DrawerValue.f11737c, Float.valueOf(f21));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        C1045v<DrawerValue> c1045v = new C1045v<>();
                                        lVar.invoke(c1045v);
                                        F f22 = new F(c1045v.f12027a);
                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState7.f11733a;
                                        boolean zIsNaN = Float.isNaN(anchoredDraggableState.j.j());
                                        DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.f11675h;
                                        if (zIsNaN || (value = f22.c(anchoredDraggableState.j.j())) == null) {
                                            value = derivedSnapshotState.getValue();
                                        }
                                        if (!kotlin.jvm.internal.i.a(anchoredDraggableState.d(), f22)) {
                                            anchoredDraggableState.f11679m.setValue(f22);
                                            if (!anchoredDraggableState.h((DrawerValue) value)) {
                                                anchoredDraggableState.g((DrawerValue) value);
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF6);
                            }
                            androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                            interfaceC1084f3.l((Ia.a) objF6);
                            boolean z19 = interfaceC1084f3.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState6.f11733a;
                            Orientation orientation = Orientation.f9957b;
                            androidx.compose.ui.h hVarA = DraggableKt.a(aVar, anchoredDraggableState.f11673f, Orientation.f9958c, z17, null, anchoredDraggableState.f11678l.getValue() != 0, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z19, 32);
                            final DrawerState drawerState8 = drawerState6;
                            final boolean z110 = z17;
                            final kotlinx.coroutines.A a13 = a12;
                            long j114 = j111;
                            l0 l0Var6 = l0Var5;
                            long j115 = j112;
                            long j23 = j113;
                            float f20 = f113;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                            final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar4, interfaceC1084f3, eD2);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                f114 = f116;
                            } else {
                                f114 = f116;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar2 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar2, interfaceC1084f3, hVarC2);
                                eD = BoxKt.d(fVar, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar4, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                }
                                R0.a(pVar2, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                if (((DrawerValue) drawerState8.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zC = interfaceC1084f3.c(z110) | interfaceC1084f3.K(drawerState8) | interfaceC1084f3.k(a13);
                                objF2 = interfaceC1084f3.f();
                                if (zC || objF2 == c0153a) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: Drawer.kt */
                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                return new AnonymousClass1(this.$drawerState, cVar);
                                            }

                                            @Override // Ia.p
                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object obj2 = CoroutineSingletons.f43038b;
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    kotlin.b.b(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    drawerState.getClass();
                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                    if (objB != obj2) {
                                                        objB = p293xa.r.f47939a;
                                                    }
                                                    if (objB == obj2) {
                                                        return obj2;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    kotlin.b.b(obj);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (z110 && drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                C2680e.c(a13, null, null, new AnonymousClass1(drawerState8, null), 3);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                Ia.a aVar5 = (Ia.a) objF2;
                                f115 = f114;
                                zG = interfaceC1084f3.g(f115) | interfaceC1084f3.K(drawerState8);
                                objF3 = interfaceC1084f3.f();
                                if (zG || objF3 == c0153a) {
                                    objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                        final /* synthetic */ float $maxValue = 0.0f;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final Float invoke() {
                                            float f21 = f115;
                                            float f22 = this.$maxValue;
                                            float fE = drawerState8.f11733a.e();
                                            float f23 = DrawerKt.f11728a;
                                            float f24 = (fE - f21) / (f22 - f21);
                                            if (f24 < 0.0f) {
                                                f24 = 0.0f;
                                            }
                                            if (f24 > 1.0f) {
                                                f24 = 1.0f;
                                            }
                                            return Float.valueOf(f24);
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DrawerKt.b(z18, aVar5, (Ia.a) objF3, j114, interfaceC1084f3, 0);
                                strK = P3.d.k(interfaceC1084f3, 0);
                                p013b0.c cVar4 = (p013b0.c) interfaceC1084f3.x(o10);
                                androidx.compose.ui.h hVarO3 = W.o(aVar, cVar4.u(p013b0.a.j(jC)), cVar4.u(p013b0.a.i(jC)), cVar4.u(p013b0.a.h(jC)), cVar4.u(p013b0.a.g(jC)));
                                zK = interfaceC1084f3.K(drawerState8);
                                objF4 = interfaceC1084f3.f();
                                if (zK || objF4 == c0153a) {
                                    objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p013b0.j invoke(p013b0.c cVar5) {
                                            return new p013b0.j(Cb.a.a(Ka.a.b(drawerState8.f11733a.e()), 0));
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                androidx.compose.ui.h hVarJ3 = PaddingKt.j(OffsetKt.a(hVarO3, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState8) | interfaceC1084f3.k(a13);
                                objF5 = interfaceC1084f3.f();
                                if (zK2 || objF5 == c0153a) {
                                    objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.j(strK, wVar2);
                                            if (((DrawerValue) drawerState8.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                final DrawerState drawerState9 = drawerState8;
                                                final kotlinx.coroutines.A a14 = a13;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    /* JADX INFO: compiled from: Drawer.kt */
                                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                    final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                            super(2, cVar);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                            return new C01421(this.$drawerState, cVar);
                                                        }

                                                        @Override // Ia.p
                                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                            return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                                            Object obj2 = CoroutineSingletons.f43038b;
                                                            int i10 = this.label;
                                                            if (i10 == 0) {
                                                                kotlin.b.b(obj);
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                drawerState.getClass();
                                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                if (objB != obj2) {
                                                                    objB = p293xa.r.f47939a;
                                                                }
                                                                if (objB == obj2) {
                                                                    return obj2;
                                                                }
                                                            } else {
                                                                if (i10 != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.b.b(obj);
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        if (drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                            C2680e.c(a14, null, null, new C01421(drawerState9, null), 3);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }));
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF5);
                                }
                                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ3, false, (Ia.l) objF5), l0Var6, j115, j23, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            FillElement fillElement = W.f10226c;
                                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar6);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar6);
                            pVar2 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar2, interfaceC1084f3, hVarC2);
                            eD = BoxKt.d(fVar, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar4, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                            }
                            R0.a(pVar2, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                            if (((DrawerValue) drawerState8.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zC = interfaceC1084f3.c(z110) | interfaceC1084f3.K(drawerState8) | interfaceC1084f3.k(a13);
                            objF2 = interfaceC1084f3.f();
                            if (zC) {
                                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: Drawer.kt */
                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$drawerState, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                            Object obj2 = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                drawerState.getClass();
                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                if (objB != obj2) {
                                                    objB = p293xa.r.f47939a;
                                                }
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                if (i10 != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.b.b(obj);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        if (z110 && drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                            C2680e.c(a13, null, null, new AnonymousClass1(drawerState8, null), 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            } else {
                                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: Drawer.kt */
                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$drawerState, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                            Object obj2 = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                drawerState.getClass();
                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                if (objB != obj2) {
                                                    objB = p293xa.r.f47939a;
                                                }
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                if (i10 != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.b.b(obj);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        if (z110 && drawerState8.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                            C2680e.c(a13, null, null, new AnonymousClass1(drawerState8, null), 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            Ia.a aVar6 = (Ia.a) objF2;
                            f115 = f114;
                            zG = interfaceC1084f3.g(f115) | interfaceC1084f3.K(drawerState8);
                            objF3 = interfaceC1084f3.f();
                            if (zG) {
                                objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        float f21 = f115;
                                        float f22 = this.$maxValue;
                                        float fE = drawerState8.f11733a.e();
                                        float f23 = DrawerKt.f11728a;
                                        float f24 = (fE - f21) / (f22 - f21);
                                        if (f24 < 0.0f) {
                                            f24 = 0.0f;
                                        }
                                        if (f24 > 1.0f) {
                                            f24 = 1.0f;
                                        }
                                        return Float.valueOf(f24);
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            } else {
                                objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        float f21 = f115;
                                        float f22 = this.$maxValue;
                                        float fE = drawerState8.f11733a.e();
                                        float f23 = DrawerKt.f11728a;
                                        float f24 = (fE - f21) / (f22 - f21);
                                        if (f24 < 0.0f) {
                                            f24 = 0.0f;
                                        }
                                        if (f24 > 1.0f) {
                                            f24 = 1.0f;
                                        }
                                        return Float.valueOf(f24);
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            DrawerKt.b(z18, aVar6, (Ia.a) objF3, j114, interfaceC1084f3, 0);
                            strK = P3.d.k(interfaceC1084f3, 0);
                            p013b0.c cVar5 = (p013b0.c) interfaceC1084f3.x(o10);
                            androidx.compose.ui.h hVarO4 = W.o(aVar, cVar5.u(p013b0.a.j(jC)), cVar5.u(p013b0.a.i(jC)), cVar5.u(p013b0.a.h(jC)), cVar5.u(p013b0.a.g(jC)));
                            zK = interfaceC1084f3.K(drawerState8);
                            objF4 = interfaceC1084f3.f();
                            if (zK) {
                                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p013b0.j invoke(p013b0.c cVar6) {
                                        return new p013b0.j(Cb.a.a(Ka.a.b(drawerState8.f11733a.e()), 0));
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            } else {
                                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p013b0.j invoke(p013b0.c cVar6) {
                                        return new p013b0.j(Cb.a.a(Ka.a.b(drawerState8.f11733a.e()), 0));
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            androidx.compose.ui.h hVarJ4 = PaddingKt.j(OffsetKt.a(hVarO4, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                            zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState8) | interfaceC1084f3.k(a13);
                            objF5 = interfaceC1084f3.f();
                            if (zK2) {
                                objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.j(strK, wVar2);
                                        if (((DrawerValue) drawerState8.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            final DrawerState drawerState9 = drawerState8;
                                            final kotlinx.coroutines.A a14 = a13;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new C01421(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    if (drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a14, null, null, new C01421(drawerState9, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF5);
                            } else {
                                objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.j(strK, wVar2);
                                        if (((DrawerValue) drawerState8.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            final DrawerState drawerState9 = drawerState8;
                                            final kotlinx.coroutines.A a14 = a13;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new C01421(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    if (drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a14, null, null, new C01421(drawerState9, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF5);
                            }
                            SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ4, false, (Ia.l) objF5), l0Var6, j115, j23, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        FillElement fillElement = W.f10226c;
                                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar7);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 3072, 6);
                z13 = z14;
                j14 = jA;
                drawerState3 = drawerStateC;
                j13 = jB;
                hVar3 = hVar4;
                j12 = jH;
                f12 = f13;
            } else {
                c1086gP.w();
                j12 = jH;
                hVar3 = hVar2;
                drawerState3 = drawerState2;
                j13 = j10;
                f12 = f11;
                z13 = z11;
                j14 = j11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f114 = f12;
                final long j23 = j12;
                final long j24 = j13;
                final long j25 = j14;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DrawerKt.a(qVar, hVar3, drawerState3, z13, l0Var2, f114, j23, j24, j25, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                drawerState2 = drawerState;
                if (c1086gP.K(drawerState2)) {
                    i19 = 256;
                }
                i12 |= i19;
            } else {
                drawerState2 = drawerState;
            }
            i19 = 128;
            i12 |= i19;
        } else {
            drawerState2 = drawerState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i21;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i21;
            } else {
                l0Var2 = l0Var;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 196608) == 0) {
                    if (c1086gP.g(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i10 & 1572864) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                jH = j;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.i(j11)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((4 & i11) != 0) {
                        DrawerValue drawerValue4 = DrawerValue.f11736b;
                        drawerStateC = c(c1086gP);
                    } else {
                        drawerStateC = drawerState2;
                    }
                    if (i13 == 0) {
                    }
                    if ((16 & i11) != 0) {
                        float f115 = w.f12028a;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    }
                    if (i15 != 0) {
                        f13 = w.f12028a;
                    } else {
                        f13 = f11;
                    }
                    if ((i11 & 64) != 0) {
                        float f116 = w.f12028a;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    }
                    if ((128 & i11) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j10;
                    }
                    if ((256 & i11) != 0) {
                        jA = w.a(c1086gP);
                    } else {
                        jA = j11;
                    }
                } else {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((4 & i11) != 0) {
                        DrawerValue drawerValue5 = DrawerValue.f11736b;
                        drawerStateC = c(c1086gP);
                    } else {
                        drawerStateC = drawerState2;
                    }
                    if (i13 == 0) {
                    }
                    if ((16 & i11) != 0) {
                        float f117 = w.f12028a;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    }
                    if (i15 != 0) {
                        f13 = w.f12028a;
                    } else {
                        f13 = f11;
                    }
                    if ((i11 & 64) != 0) {
                        float f118 = w.f12028a;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    }
                    if ((128 & i11) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j10;
                    }
                    if ((256 & i11) != 0) {
                        jA = w.a(c1086gP);
                    } else {
                        jA = j11;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final kotlinx.coroutines.A a13 = (kotlinx.coroutines.A) objF;
                final DrawerState drawerState7 = drawerStateC;
                final boolean z18 = z14;
                final long j114 = jA;
                final l0 l0Var6 = l0Var2;
                final long j115 = jH;
                final long j116 = jB;
                final float f119 = f13;
                BoxWithConstraintsKt.a(hVar4.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(816674999, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
                    /* JADX WARN: Code duplicated, block: B:56:0x018e  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
                    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
                    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0218  */
                    /* JADX WARN: Code duplicated, block: B:73:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:75:0x027b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        float f1110;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        boolean z19;
                        boolean zC;
                        Object objF2;
                        final float f1111;
                        boolean zG;
                        Object objF3;
                        final String strK;
                        boolean zK;
                        Object objF4;
                        boolean zK2;
                        Object objF5;
                        InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(interfaceC0950j2) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            long jC = interfaceC0950j2.c();
                            if (!p013b0.a.d(jC)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f1112 = -p013b0.a.h(jC);
                            O0 o10 = CompositionLocalsKt.f14847h;
                            final p013b0.c cVar = (p013b0.c) interfaceC1084f3.x(o10);
                            boolean zK3 = interfaceC1084f3.K(drawerState7) | interfaceC1084f3.K(cVar) | interfaceC1084f3.g(f1112);
                            final DrawerState drawerState8 = drawerState7;
                            Object objF6 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF6 == c0153a) {
                                objF6 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        Object value;
                                        drawerState8.f11734b = cVar;
                                        final float f20 = f1112;
                                        final float f21 = this.$maxValue;
                                        Ia.l<C1045v<DrawerValue>, p293xa.r> lVar = new Ia.l<C1045v<DrawerValue>, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1045v<DrawerValue> c1045v) {
                                                C1045v<DrawerValue> c1045v2 = c1045v;
                                                c1045v2.f12027a.put(DrawerValue.f11736b, Float.valueOf(f20));
                                                c1045v2.f12027a.put(DrawerValue.f11737c, Float.valueOf(f21));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        C1045v<DrawerValue> c1045v = new C1045v<>();
                                        lVar.invoke(c1045v);
                                        F f22 = new F(c1045v.f12027a);
                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState8.f11733a;
                                        boolean zIsNaN = Float.isNaN(anchoredDraggableState.j.j());
                                        DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.f11675h;
                                        if (zIsNaN || (value = f22.c(anchoredDraggableState.j.j())) == null) {
                                            value = derivedSnapshotState.getValue();
                                        }
                                        if (!kotlin.jvm.internal.i.a(anchoredDraggableState.d(), f22)) {
                                            anchoredDraggableState.f11679m.setValue(f22);
                                            if (!anchoredDraggableState.h((DrawerValue) value)) {
                                                anchoredDraggableState.g((DrawerValue) value);
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF6);
                            }
                            androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                            interfaceC1084f3.l((Ia.a) objF6);
                            boolean z110 = interfaceC1084f3.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState7.f11733a;
                            Orientation orientation = Orientation.f9957b;
                            androidx.compose.ui.h hVarA = DraggableKt.a(aVar, anchoredDraggableState.f11673f, Orientation.f9958c, z18, null, anchoredDraggableState.f11678l.getValue() != 0, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z110, 32);
                            final DrawerState drawerState9 = drawerState7;
                            final boolean z111 = z18;
                            final kotlinx.coroutines.A a14 = a13;
                            long j117 = j114;
                            l0 l0Var7 = l0Var6;
                            long j118 = j115;
                            long j26 = j116;
                            float f20 = f119;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                            final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar4, interfaceC1084f3, eD2);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                f1110 = f1112;
                            } else {
                                f1110 = f1112;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar2 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar2, interfaceC1084f3, hVarC2);
                                eD = BoxKt.d(fVar, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar4, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                                }
                                R0.a(pVar2, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                                if (((DrawerValue) drawerState9.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zC = interfaceC1084f3.c(z111) | interfaceC1084f3.K(drawerState9) | interfaceC1084f3.k(a14);
                                objF2 = interfaceC1084f3.f();
                                if (zC || objF2 == c0153a) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: Drawer.kt */
                                        @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                return new AnonymousClass1(this.$drawerState, cVar);
                                            }

                                            @Override // Ia.p
                                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object obj2 = CoroutineSingletons.f43038b;
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    kotlin.b.b(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    drawerState.getClass();
                                                    DrawerValue drawerValue = DrawerValue.f11736b;
                                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                    Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                    if (objB != obj2) {
                                                        objB = p293xa.r.f47939a;
                                                    }
                                                    if (objB == obj2) {
                                                        return obj2;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    kotlin.b.b(obj);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (z111 && drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                C2680e.c(a14, null, null, new AnonymousClass1(drawerState9, null), 3);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                Ia.a aVar6 = (Ia.a) objF2;
                                f1111 = f1110;
                                zG = interfaceC1084f3.g(f1111) | interfaceC1084f3.K(drawerState9);
                                objF3 = interfaceC1084f3.f();
                                if (zG || objF3 == c0153a) {
                                    objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                        final /* synthetic */ float $maxValue = 0.0f;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final Float invoke() {
                                            float f21 = f1111;
                                            float f22 = this.$maxValue;
                                            float fE = drawerState9.f11733a.e();
                                            float f23 = DrawerKt.f11728a;
                                            float f24 = (fE - f21) / (f22 - f21);
                                            if (f24 < 0.0f) {
                                                f24 = 0.0f;
                                            }
                                            if (f24 > 1.0f) {
                                                f24 = 1.0f;
                                            }
                                            return Float.valueOf(f24);
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DrawerKt.b(z19, aVar6, (Ia.a) objF3, j117, interfaceC1084f3, 0);
                                strK = P3.d.k(interfaceC1084f3, 0);
                                p013b0.c cVar5 = (p013b0.c) interfaceC1084f3.x(o10);
                                androidx.compose.ui.h hVarO4 = W.o(aVar, cVar5.u(p013b0.a.j(jC)), cVar5.u(p013b0.a.i(jC)), cVar5.u(p013b0.a.h(jC)), cVar5.u(p013b0.a.g(jC)));
                                zK = interfaceC1084f3.K(drawerState9);
                                objF4 = interfaceC1084f3.f();
                                if (zK || objF4 == c0153a) {
                                    objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p013b0.j invoke(p013b0.c cVar6) {
                                            return new p013b0.j(Cb.a.a(Ka.a.b(drawerState9.f11733a.e()), 0));
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                androidx.compose.ui.h hVarJ4 = PaddingKt.j(OffsetKt.a(hVarO4, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                                zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState9) | interfaceC1084f3.k(a14);
                                objF5 = interfaceC1084f3.f();
                                if (zK2 || objF5 == c0153a) {
                                    objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.j(strK, wVar2);
                                            if (((DrawerValue) drawerState9.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                                final DrawerState drawerState10 = drawerState9;
                                                final kotlinx.coroutines.A a15 = a14;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    /* JADX INFO: compiled from: Drawer.kt */
                                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                    final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                            super(2, cVar);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                            return new C01421(this.$drawerState, cVar);
                                                        }

                                                        @Override // Ia.p
                                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                            return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                                            Object obj2 = CoroutineSingletons.f43038b;
                                                            int i10 = this.label;
                                                            if (i10 == 0) {
                                                                kotlin.b.b(obj);
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                drawerState.getClass();
                                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                                if (objB != obj2) {
                                                                    objB = p293xa.r.f47939a;
                                                                }
                                                                if (objB == obj2) {
                                                                    return obj2;
                                                                }
                                                            } else {
                                                                if (i10 != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.b.b(obj);
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        if (drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                            C2680e.c(a15, null, null, new C01421(drawerState10, null), 3);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }));
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF5);
                                }
                                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ4, false, (Ia.l) objF5), l0Var7, j118, j26, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            FillElement fillElement = W.f10226c;
                                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar7);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar6);
                            pVar2 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar2, interfaceC1084f3, hVarC2);
                            eD = BoxKt.d(fVar, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar4, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                            }
                            R0.a(pVar2, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                            if (((DrawerValue) drawerState9.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zC = interfaceC1084f3.c(z111) | interfaceC1084f3.K(drawerState9) | interfaceC1084f3.k(a14);
                            objF2 = interfaceC1084f3.f();
                            if (zC) {
                                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: Drawer.kt */
                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$drawerState, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                            Object obj2 = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                drawerState.getClass();
                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                if (objB != obj2) {
                                                    objB = p293xa.r.f47939a;
                                                }
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                if (i10 != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.b.b(obj);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        if (z111 && drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                            C2680e.c(a14, null, null, new AnonymousClass1(drawerState9, null), 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            } else {
                                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: Drawer.kt */
                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$drawerState, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                            Object obj2 = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                drawerState.getClass();
                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                if (objB != obj2) {
                                                    objB = p293xa.r.f47939a;
                                                }
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                if (i10 != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.b.b(obj);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        if (z111 && drawerState9.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                            C2680e.c(a14, null, null, new AnonymousClass1(drawerState9, null), 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            Ia.a aVar7 = (Ia.a) objF2;
                            f1111 = f1110;
                            zG = interfaceC1084f3.g(f1111) | interfaceC1084f3.K(drawerState9);
                            objF3 = interfaceC1084f3.f();
                            if (zG) {
                                objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        float f21 = f1111;
                                        float f22 = this.$maxValue;
                                        float fE = drawerState9.f11733a.e();
                                        float f23 = DrawerKt.f11728a;
                                        float f24 = (fE - f21) / (f22 - f21);
                                        if (f24 < 0.0f) {
                                            f24 = 0.0f;
                                        }
                                        if (f24 > 1.0f) {
                                            f24 = 1.0f;
                                        }
                                        return Float.valueOf(f24);
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            } else {
                                objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        float f21 = f1111;
                                        float f22 = this.$maxValue;
                                        float fE = drawerState9.f11733a.e();
                                        float f23 = DrawerKt.f11728a;
                                        float f24 = (fE - f21) / (f22 - f21);
                                        if (f24 < 0.0f) {
                                            f24 = 0.0f;
                                        }
                                        if (f24 > 1.0f) {
                                            f24 = 1.0f;
                                        }
                                        return Float.valueOf(f24);
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            DrawerKt.b(z19, aVar7, (Ia.a) objF3, j117, interfaceC1084f3, 0);
                            strK = P3.d.k(interfaceC1084f3, 0);
                            p013b0.c cVar6 = (p013b0.c) interfaceC1084f3.x(o10);
                            androidx.compose.ui.h hVarO5 = W.o(aVar, cVar6.u(p013b0.a.j(jC)), cVar6.u(p013b0.a.i(jC)), cVar6.u(p013b0.a.h(jC)), cVar6.u(p013b0.a.g(jC)));
                            zK = interfaceC1084f3.K(drawerState9);
                            objF4 = interfaceC1084f3.f();
                            if (zK) {
                                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p013b0.j invoke(p013b0.c cVar7) {
                                        return new p013b0.j(Cb.a.a(Ka.a.b(drawerState9.f11733a.e()), 0));
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            } else {
                                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p013b0.j invoke(p013b0.c cVar7) {
                                        return new p013b0.j(Cb.a.a(Ka.a.b(drawerState9.f11733a.e()), 0));
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            androidx.compose.ui.h hVarJ5 = PaddingKt.j(OffsetKt.a(hVarO5, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                            zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState9) | interfaceC1084f3.k(a14);
                            objF5 = interfaceC1084f3.f();
                            if (zK2) {
                                objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.j(strK, wVar2);
                                        if (((DrawerValue) drawerState9.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            final DrawerState drawerState10 = drawerState9;
                                            final kotlinx.coroutines.A a15 = a14;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new C01421(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    if (drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a15, null, null, new C01421(drawerState10, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF5);
                            } else {
                                objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.j(strK, wVar2);
                                        if (((DrawerValue) drawerState9.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            final DrawerState drawerState10 = drawerState9;
                                            final kotlinx.coroutines.A a15 = a14;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new C01421(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    if (drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a15, null, null, new C01421(drawerState10, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF5);
                            }
                            SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ5, false, (Ia.l) objF5), l0Var7, j118, j26, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        FillElement fillElement = W.f10226c;
                                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar8);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 3072, 6);
                z13 = z14;
                j14 = jA;
                drawerState3 = drawerStateC;
                j13 = jB;
                hVar3 = hVar4;
                j12 = jH;
                f12 = f13;
            } else {
                c1086gP.w();
                j12 = jH;
                hVar3 = hVar2;
                drawerState3 = drawerState2;
                j13 = j10;
                f12 = f11;
                z13 = z11;
                j14 = j11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f1110 = f12;
                final long j26 = j12;
                final long j27 = j13;
                final long j28 = j14;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DrawerKt.a(qVar, hVar3, drawerState3, z13, l0Var2, f1110, j26, j27, j28, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i21;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i21;
        } else {
            l0Var2 = l0Var;
        }
        i15 = 32 & i11;
        if (i15 != 0) {
            i12 |= 196608;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 196608) == 0) {
                if (c1086gP.g(f11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i10 & 1572864) == 0) {
            jH = j;
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        } else {
            jH = j;
        }
        if ((i10 & 12582912) != 0) {
            i12 |= ((i11 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 256) == 0 || !c1086gP.i(j11)) ? 33554432 : 67108864;
        }
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(pVar)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i12 |= i17;
        }
        if ((306783379 & i12) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c1086gP.C(i12 & 1, z12)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if ((4 & i11) != 0) {
                    DrawerValue drawerValue6 = DrawerValue.f11736b;
                    drawerStateC = c(c1086gP);
                } else {
                    drawerStateC = drawerState2;
                }
                if (i13 == 0) {
                }
                if ((16 & i11) != 0) {
                    float f1111 = w.f12028a;
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                }
                if (i15 != 0) {
                    f13 = w.f12028a;
                } else {
                    f13 = f11;
                }
                if ((i11 & 64) != 0) {
                    float f1112 = w.f12028a;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                }
                if ((128 & i11) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j10;
                }
                if ((256 & i11) != 0) {
                    jA = w.a(c1086gP);
                } else {
                    jA = j11;
                }
            } else {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if ((4 & i11) != 0) {
                    DrawerValue drawerValue7 = DrawerValue.f11736b;
                    drawerStateC = c(c1086gP);
                } else {
                    drawerStateC = drawerState2;
                }
                if (i13 == 0) {
                }
                if ((16 & i11) != 0) {
                    float f1113 = w.f12028a;
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                }
                if (i15 != 0) {
                    f13 = w.f12028a;
                } else {
                    f13 = f11;
                }
                if ((i11 & 64) != 0) {
                    float f1114 = w.f12028a;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                }
                if ((128 & i11) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j10;
                }
                if ((256 & i11) != 0) {
                    jA = w.a(c1086gP);
                } else {
                    jA = j11;
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF);
            }
            final kotlinx.coroutines.A a14 = (kotlinx.coroutines.A) objF;
            final DrawerState drawerState8 = drawerStateC;
            final boolean z19 = z14;
            final long j117 = jA;
            final l0 l0Var7 = l0Var2;
            final long j118 = jH;
            final long j119 = jB;
            final float f1115 = f13;
            BoxWithConstraintsKt.a(hVar4.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(816674999, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Code duplicated, block: B:45:0x014c  */
                /* JADX WARN: Code duplicated, block: B:47:0x0155  */
                /* JADX WARN: Code duplicated, block: B:48:0x0159  */
                /* JADX WARN: Code duplicated, block: B:53:0x0176  */
                /* JADX WARN: Code duplicated, block: B:56:0x018e  */
                /* JADX WARN: Code duplicated, block: B:57:0x0190  */
                /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
                /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
                /* JADX WARN: Code duplicated, block: B:69:0x0218  */
                /* JADX WARN: Code duplicated, block: B:73:0x024a  */
                /* JADX WARN: Code duplicated, block: B:75:0x027b  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.q
                public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                    float f1116;
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
                    androidx.compose.ui.layout.E eD;
                    int iF;
                    InterfaceC1089h0 interfaceC1089h0Z;
                    androidx.compose.ui.h hVarC;
                    boolean z110;
                    boolean zC;
                    Object objF2;
                    final float f1117;
                    boolean zG;
                    Object objF3;
                    final String strK;
                    boolean zK;
                    Object objF4;
                    boolean zK2;
                    Object objF5;
                    InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= interfaceC1084f3.K(interfaceC0950j2) ? 4 : 2;
                    }
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                        long jC = interfaceC0950j2.c();
                        if (!p013b0.a.d(jC)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f1118 = -p013b0.a.h(jC);
                        O0 o10 = CompositionLocalsKt.f14847h;
                        final p013b0.c cVar = (p013b0.c) interfaceC1084f3.x(o10);
                        boolean zK3 = interfaceC1084f3.K(drawerState8) | interfaceC1084f3.K(cVar) | interfaceC1084f3.g(f1118);
                        final DrawerState drawerState9 = drawerState8;
                        Object objF6 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (zK3 || objF6 == c0153a) {
                            objF6 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                final /* synthetic */ float $maxValue = 0.0f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    Object value;
                                    drawerState9.f11734b = cVar;
                                    final float f20 = f1118;
                                    final float f21 = this.$maxValue;
                                    Ia.l<C1045v<DrawerValue>, p293xa.r> lVar = new Ia.l<C1045v<DrawerValue>, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1045v<DrawerValue> c1045v) {
                                            C1045v<DrawerValue> c1045v2 = c1045v;
                                            c1045v2.f12027a.put(DrawerValue.f11736b, Float.valueOf(f20));
                                            c1045v2.f12027a.put(DrawerValue.f11737c, Float.valueOf(f21));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    C1045v<DrawerValue> c1045v = new C1045v<>();
                                    lVar.invoke(c1045v);
                                    F f22 = new F(c1045v.f12027a);
                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState9.f11733a;
                                    boolean zIsNaN = Float.isNaN(anchoredDraggableState.j.j());
                                    DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.f11675h;
                                    if (zIsNaN || (value = f22.c(anchoredDraggableState.j.j())) == null) {
                                        value = derivedSnapshotState.getValue();
                                    }
                                    if (!kotlin.jvm.internal.i.a(anchoredDraggableState.d(), f22)) {
                                        anchoredDraggableState.f11679m.setValue(f22);
                                        if (!anchoredDraggableState.h((DrawerValue) value)) {
                                            anchoredDraggableState.g((DrawerValue) value);
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF6);
                        }
                        androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                        interfaceC1084f3.l((Ia.a) objF6);
                        boolean z111 = interfaceC1084f3.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState8.f11733a;
                        Orientation orientation = Orientation.f9957b;
                        androidx.compose.ui.h hVarA = DraggableKt.a(aVar, anchoredDraggableState.f11673f, Orientation.f9958c, z19, null, anchoredDraggableState.f11678l.getValue() != 0, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z111, 32);
                        final DrawerState drawerState10 = drawerState8;
                        final boolean z112 = z19;
                        final kotlinx.coroutines.A a15 = a14;
                        long j1110 = j117;
                        l0 l0Var8 = l0Var7;
                        long j1111 = j118;
                        long j29 = j119;
                        float f20 = f1115;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                        final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                        androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                        int iF2 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar4, interfaceC1084f3, eD2);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z2);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m()) {
                            f1116 = f1118;
                        } else {
                            f1116 = f1118;
                            if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                            }
                            pVar2 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar2, interfaceC1084f3, hVarC2);
                            eD = BoxKt.d(fVar, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar4, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                            }
                            R0.a(pVar2, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                            if (((DrawerValue) drawerState10.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                z110 = true;
                            } else {
                                z110 = false;
                            }
                            zC = interfaceC1084f3.c(z112) | interfaceC1084f3.K(drawerState10) | interfaceC1084f3.k(a15);
                            objF2 = interfaceC1084f3.f();
                            if (zC || objF2 == c0153a) {
                                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: Drawer.kt */
                                    @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$drawerState, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) throws Throwable {
                                            Object obj2 = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                drawerState.getClass();
                                                DrawerValue drawerValue = DrawerValue.f11736b;
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                if (objB != obj2) {
                                                    objB = p293xa.r.f47939a;
                                                }
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                if (i10 != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.b.b(obj);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        if (z112 && drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                            C2680e.c(a15, null, null, new AnonymousClass1(drawerState10, null), 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            Ia.a aVar7 = (Ia.a) objF2;
                            f1117 = f1116;
                            zG = interfaceC1084f3.g(f1117) | interfaceC1084f3.K(drawerState10);
                            objF3 = interfaceC1084f3.f();
                            if (zG || objF3 == c0153a) {
                                objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    final /* synthetic */ float $maxValue = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        float f21 = f1117;
                                        float f22 = this.$maxValue;
                                        float fE = drawerState10.f11733a.e();
                                        float f23 = DrawerKt.f11728a;
                                        float f24 = (fE - f21) / (f22 - f21);
                                        if (f24 < 0.0f) {
                                            f24 = 0.0f;
                                        }
                                        if (f24 > 1.0f) {
                                            f24 = 1.0f;
                                        }
                                        return Float.valueOf(f24);
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            DrawerKt.b(z110, aVar7, (Ia.a) objF3, j1110, interfaceC1084f3, 0);
                            strK = P3.d.k(interfaceC1084f3, 0);
                            p013b0.c cVar6 = (p013b0.c) interfaceC1084f3.x(o10);
                            androidx.compose.ui.h hVarO5 = W.o(aVar, cVar6.u(p013b0.a.j(jC)), cVar6.u(p013b0.a.i(jC)), cVar6.u(p013b0.a.h(jC)), cVar6.u(p013b0.a.g(jC)));
                            zK = interfaceC1084f3.K(drawerState10);
                            objF4 = interfaceC1084f3.f();
                            if (zK || objF4 == c0153a) {
                                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p013b0.j invoke(p013b0.c cVar7) {
                                        return new p013b0.j(Cb.a.a(Ka.a.b(drawerState10.f11733a.e()), 0));
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            androidx.compose.ui.h hVarJ5 = PaddingKt.j(OffsetKt.a(hVarO5, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                            zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState10) | interfaceC1084f3.k(a15);
                            objF5 = interfaceC1084f3.f();
                            if (zK2 || objF5 == c0153a) {
                                objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.j(strK, wVar2);
                                        if (((DrawerValue) drawerState10.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                            final DrawerState drawerState11 = drawerState10;
                                            final kotlinx.coroutines.A a16 = a15;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* JADX INFO: compiled from: Drawer.kt */
                                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                                final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                    final /* synthetic */ DrawerState $drawerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                        super(2, cVar);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                        return new C01421(this.$drawerState, cVar);
                                                    }

                                                    @Override // Ia.p
                                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                        return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object obj2 = CoroutineSingletons.f43038b;
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            kotlin.b.b(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            drawerState.getClass();
                                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                            if (objB != obj2) {
                                                                objB = p293xa.r.f47939a;
                                                            }
                                                            if (objB == obj2) {
                                                                return obj2;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.b.b(obj);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    if (drawerState11.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                        C2680e.c(a16, null, null, new C01421(drawerState11, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF5);
                            }
                            SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ5, false, (Ia.l) objF5), l0Var8, j1111, j29, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        FillElement fillElement = W.f10226c;
                                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar8);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                            interfaceC1084f3.J();
                        }
                        androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar6);
                        pVar2 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar2, interfaceC1084f3, hVarC2);
                        eD = BoxKt.d(fVar, false);
                        iF = interfaceC1084f3.F();
                        interfaceC1089h0Z = interfaceC1084f3.z();
                        hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                        if (interfaceC1084f3.u() != null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar4, interfaceC1084f3, eD);
                        R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                        if (interfaceC1084f3.m()) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                        } else {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar6);
                        }
                        R0.a(pVar2, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, 0);
                        if (((DrawerValue) drawerState10.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                            z110 = true;
                        } else {
                            z110 = false;
                        }
                        zC = interfaceC1084f3.c(z112) | interfaceC1084f3.K(drawerState10) | interfaceC1084f3.k(a15);
                        objF2 = interfaceC1084f3.f();
                        if (zC) {
                            objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: Drawer.kt */
                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                        super(2, cVar);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                        return new AnonymousClass1(this.$drawerState, cVar);
                                    }

                                    @Override // Ia.p
                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                        Object obj2 = CoroutineSingletons.f43038b;
                                        int i10 = this.label;
                                        if (i10 == 0) {
                                            kotlin.b.b(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            drawerState.getClass();
                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                            if (objB != obj2) {
                                                objB = p293xa.r.f47939a;
                                            }
                                            if (objB == obj2) {
                                                return obj2;
                                            }
                                        } else {
                                            if (i10 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.b.b(obj);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    if (z112 && drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                        C2680e.c(a15, null, null, new AnonymousClass1(drawerState10, null), 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF2);
                        } else {
                            objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: Drawer.kt */
                                @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                        super(2, cVar);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                        return new AnonymousClass1(this.$drawerState, cVar);
                                    }

                                    @Override // Ia.p
                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                        Object obj2 = CoroutineSingletons.f43038b;
                                        int i10 = this.label;
                                        if (i10 == 0) {
                                            kotlin.b.b(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            drawerState.getClass();
                                            DrawerValue drawerValue = DrawerValue.f11736b;
                                            AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                            Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                            if (objB != obj2) {
                                                objB = p293xa.r.f47939a;
                                            }
                                            if (objB == obj2) {
                                                return obj2;
                                            }
                                        } else {
                                            if (i10 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.b.b(obj);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    if (z112 && drawerState10.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                        C2680e.c(a15, null, null, new AnonymousClass1(drawerState10, null), 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF2);
                        }
                        Ia.a aVar8 = (Ia.a) objF2;
                        f1117 = f1116;
                        zG = interfaceC1084f3.g(f1117) | interfaceC1084f3.K(drawerState10);
                        objF3 = interfaceC1084f3.f();
                        if (zG) {
                            objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                final /* synthetic */ float $maxValue = 0.0f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    float f21 = f1117;
                                    float f22 = this.$maxValue;
                                    float fE = drawerState10.f11733a.e();
                                    float f23 = DrawerKt.f11728a;
                                    float f24 = (fE - f21) / (f22 - f21);
                                    if (f24 < 0.0f) {
                                        f24 = 0.0f;
                                    }
                                    if (f24 > 1.0f) {
                                        f24 = 1.0f;
                                    }
                                    return Float.valueOf(f24);
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        } else {
                            objF3 = new Ia.a<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                final /* synthetic */ float $maxValue = 0.0f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    float f21 = f1117;
                                    float f22 = this.$maxValue;
                                    float fE = drawerState10.f11733a.e();
                                    float f23 = DrawerKt.f11728a;
                                    float f24 = (fE - f21) / (f22 - f21);
                                    if (f24 < 0.0f) {
                                        f24 = 0.0f;
                                    }
                                    if (f24 > 1.0f) {
                                        f24 = 1.0f;
                                    }
                                    return Float.valueOf(f24);
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        DrawerKt.b(z110, aVar8, (Ia.a) objF3, j1110, interfaceC1084f3, 0);
                        strK = P3.d.k(interfaceC1084f3, 0);
                        p013b0.c cVar7 = (p013b0.c) interfaceC1084f3.x(o10);
                        androidx.compose.ui.h hVarO6 = W.o(aVar, cVar7.u(p013b0.a.j(jC)), cVar7.u(p013b0.a.i(jC)), cVar7.u(p013b0.a.h(jC)), cVar7.u(p013b0.a.g(jC)));
                        zK = interfaceC1084f3.K(drawerState10);
                        objF4 = interfaceC1084f3.f();
                        if (zK) {
                            objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p013b0.j invoke(p013b0.c cVar8) {
                                    return new p013b0.j(Cb.a.a(Ka.a.b(drawerState10.f11733a.e()), 0));
                                }
                            };
                            interfaceC1084f3.E(objF4);
                        } else {
                            objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p013b0.j invoke(p013b0.c cVar8) {
                                    return new p013b0.j(Cb.a.a(Ka.a.b(drawerState10.f11733a.e()), 0));
                                }
                            };
                            interfaceC1084f3.E(objF4);
                        }
                        androidx.compose.ui.h hVarJ6 = PaddingKt.j(OffsetKt.a(hVarO6, (Ia.l) objF4), 0.0f, 0.0f, DrawerKt.f11728a, 0.0f, 11);
                        zK2 = interfaceC1084f3.K(strK) | interfaceC1084f3.K(drawerState10) | interfaceC1084f3.k(a15);
                        objF5 = interfaceC1084f3.f();
                        if (zK2) {
                            objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.j(strK, wVar2);
                                    if (((DrawerValue) drawerState10.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                        final DrawerState drawerState11 = drawerState10;
                                        final kotlinx.coroutines.A a16 = a15;
                                        wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                            /* JADX INFO: compiled from: Drawer.kt */
                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                            final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                    super(2, cVar);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                    return new C01421(this.$drawerState, cVar);
                                                }

                                                @Override // Ia.p
                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                    return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        kotlin.b.b(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        drawerState.getClass();
                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                        if (objB != obj2) {
                                                            objB = p293xa.r.f47939a;
                                                        }
                                                        if (objB == obj2) {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        kotlin.b.b(obj);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final Boolean invoke() {
                                                if (drawerState11.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                    C2680e.c(a16, null, null, new C01421(drawerState11, null), 3);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF5);
                        } else {
                            objF5 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.j(strK, wVar2);
                                    if (((DrawerValue) drawerState10.f11733a.f11674g.getValue()) == DrawerValue.f11737c) {
                                        final DrawerState drawerState11 = drawerState10;
                                        final kotlinx.coroutines.A a16 = a15;
                                        wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                            /* JADX INFO: compiled from: Drawer.kt */
                                            @Aa.c(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                            final class C01421 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C01421(DrawerState drawerState, kotlin.coroutines.c<? super C01421> cVar) {
                                                    super(2, cVar);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                                    return new C01421(this.$drawerState, cVar);
                                                }

                                                @Override // Ia.p
                                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                                    return ((C01421) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object obj2 = CoroutineSingletons.f43038b;
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        kotlin.b.b(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        drawerState.getClass();
                                                        DrawerValue drawerValue = DrawerValue.f11736b;
                                                        AnchoredDraggableState<DrawerValue> anchoredDraggableState = drawerState.f11733a;
                                                        Object objB = C1026b.b(anchoredDraggableState, drawerValue, anchoredDraggableState.f11677k.j(), this);
                                                        if (objB != obj2) {
                                                            objB = p293xa.r.f47939a;
                                                        }
                                                        if (objB == obj2) {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        kotlin.b.b(obj);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final Boolean invoke() {
                                                if (drawerState11.f11733a.f11671d.invoke(DrawerValue.f11736b).booleanValue()) {
                                                    C2680e.c(a16, null, null, new C01421(drawerState11, null), 3);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF5);
                        }
                        SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarJ6, false, (Ia.l) objF5), l0Var8, j1111, j29, null, f20, androidx.compose.runtime.internal.a.b(-1941234439, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    FillElement fillElement = W.f10226c;
                                    Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f5, 0);
                                    int iF3 = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, fillElement);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar9);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, c0953mA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                        androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar7);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                    qVar3.invoke(C0955o.f10310a, interfaceC1084f5, 6);
                                    interfaceC1084f5.J();
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 1572864, 16);
                        interfaceC1084f3.J();
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 3072, 6);
            z13 = z14;
            j14 = jA;
            drawerState3 = drawerStateC;
            j13 = jB;
            hVar3 = hVar4;
            j12 = jH;
            f12 = f13;
        } else {
            c1086gP.w();
            j12 = jH;
            hVar3 = hVar2;
            drawerState3 = drawerState2;
            j13 = j10;
            f12 = f11;
            z13 = z11;
            j14 = j11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f1116 = f12;
            final long j29 = j12;
            final long j210 = j13;
            final long j211 = j14;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DrawerKt.a(qVar, hVar3, drawerState3, z13, l0Var2, f1116, j29, j210, j211, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final Ia.a aVar, final Ia.a aVar2, final long j, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1983403750);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.i(j) ? 2048 : 1024;
        }
        if (c1086gP.C(i11 & 1, (i11 & 1171) != 1170)) {
            final String strK = P3.d.k(c1086gP, 1);
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            androidx.compose.ui.h hVarB = androidx.compose.ui.h.a.f13984b;
            if (z10) {
                c1086gP.L(487534424);
                int i12 = i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                boolean z11 = i12 == 32;
                Object objF = c1086gP.f();
                if (z11 || objF == c0153a) {
                    objF = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, null);
                    c1086gP.E(objF);
                }
                androidx.compose.ui.h hVarI = hVarB.i(new SuspendPointerInputElement(aVar, null, new androidx.compose.ui.input.pointer.B.a((Ia.p) objF), 6));
                boolean zK = (i12 == 32) | c1086gP.K(strK);
                Object objF2 = c1086gP.f();
                if (zK || objF2 == c0153a) {
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.w wVar2 = wVar;
                            androidx.compose.ui.semantics.t.g(strK, wVar2);
                            final Ia.a<p293xa.r> aVar3 = aVar;
                            androidx.compose.ui.semantics.t.e(wVar2, new Ia.a<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Boolean invoke() {
                                    aVar3.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                hVarB = androidx.compose.ui.semantics.p.b(hVarI, true, (Ia.l) objF2);
                c1086gP.T(false);
            } else {
                c1086gP.L(487858498);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVarI2 = W.f10226c.i(hVarB);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objF3 = c1086gP.f();
            if (z12 || objF3 == c0153a) {
                objF3 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e.s0(eVar, j, 0L, 0L, aVar2.invoke().floatValue(), R.styleable.AppCompatTheme_windowActionBarOverlay);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            CanvasKt.a(hVarI2, (Ia.l) objF3, c1086gP, 0);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DrawerKt.b(z10, aVar, aVar2, j, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final DrawerState c(InterfaceC1084f interfaceC1084f) {
        DrawerValue drawerValue = DrawerValue.f11736b;
        final DrawerKt$rememberDrawerState$1 drawerKt$rememberDrawerState$1 = new Ia.l<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Boolean invoke(DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        };
        Object[] objArr = new Object[0];
        Ia.l<DrawerValue, DrawerState> lVar = new Ia.l<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final DrawerState invoke(DrawerValue drawerValue2) {
                return new DrawerState(drawerValue2, drawerKt$rememberDrawerState$1);
            }
        };
        W.f fVar = SaverKt.f13134a;
        W.f fVar2 = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.p
            public final DrawerValue invoke(androidx.compose.runtime.saveable.j jVar, DrawerState drawerState) {
                return (DrawerValue) drawerState.f11733a.f11674g.getValue();
            }
        }, lVar);
        boolean zK = interfaceC1084f.K(drawerKt$rememberDrawerState$1);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                final /* synthetic */ DrawerValue $initialValue = DrawerValue.f11736b;

                {
                    super(0);
                }

                @Override // Ia.a
                public final DrawerState invoke() {
                    return new DrawerState(this.$initialValue, drawerKt$rememberDrawerState$1);
                }
            };
            interfaceC1084f.E(objF);
        }
        return (DrawerState) androidx.compose.runtime.saveable.b.c(objArr, fVar2, null, (Ia.a) objF, interfaceC1084f, 0, 4);
    }
}
