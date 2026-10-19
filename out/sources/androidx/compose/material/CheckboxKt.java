package androidx.compose.material;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.b0;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.C2479a;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CheckboxKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11687b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11690e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11686a = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11688c = 20;

    static {
        float f10 = 2;
        f11687b = f10;
        f11689d = f10;
        f11690e = f10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:119:0x0186  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4 A[PHI: r3 r5 r22 r23
      0x00e4: PHI (r3v25 int) = (r3v18 int), (r3v27 int) binds: [B:93:0x00fd, B:81:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r5v14 androidx.compose.ui.h) = (r5v10 androidx.compose.ui.h), (r5v16 androidx.compose.ui.h) binds: [B:93:0x00fd, B:81:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r22v4 boolean) = (r22v1 boolean), (r22v5 boolean) binds: [B:93:0x00fd, B:81:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r23v4 androidx.compose.foundation.interaction.k) = (r23v1 androidx.compose.foundation.interaction.k), (r23v5 androidx.compose.foundation.interaction.k) binds: [B:93:0x00fd, B:81:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    public static final void a(final boolean z10, final Ia.l<? super Boolean, p293xa.r> lVar, androidx.compose.ui.h hVar, boolean z11, androidx.compose.foundation.interaction.k kVar, InterfaceC1033i interfaceC1033i, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        InterfaceC1033i interfaceC1033i2;
        boolean z13;
        final androidx.compose.ui.h hVar3;
        final boolean z14;
        final androidx.compose.foundation.interaction.k kVar3;
        final InterfaceC1033i interfaceC1033i3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        boolean z15;
        androidx.compose.foundation.interaction.k kVar4;
        int i17;
        InterfaceC1033i interfaceC1033iE;
        ToggleableState toggleableState;
        Ia.a aVar;
        boolean z16;
        boolean z17;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(-2118660998);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(lVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c1086gP.c(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            interfaceC1033i2 = interfaceC1033i;
                            int i19 = c1086gP.K(interfaceC1033i2) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            interfaceC1033i2 = interfaceC1033i;
                        }
                        i12 |= i19;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    if ((74899 & i12) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i18 != 0) {
                                hVar4 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar4 = hVar2;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i15 != 0) {
                                kVar4 = null;
                            } else {
                                kVar4 = kVar2;
                            }
                            if ((i11 & 32) != 0) {
                                i17 = i12 & (-458753);
                                interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                            }
                            c1086gP.U();
                            if (z10) {
                                toggleableState = ToggleableState.f15273b;
                            } else {
                                toggleableState = ToggleableState.f15274c;
                            }
                            if (lVar != null) {
                                c1086gP.L(-1450332004);
                                if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z17 = z16 | ((i17 & 14) == 4);
                                objF = c1086gP.f();
                                if (z17 || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            lVar.invoke(Boolean.valueOf(!z10));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                aVar = (Ia.a) objF;
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-1450267308);
                                c1086gP.T(false);
                                aVar = null;
                            }
                            c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                            interfaceC1033i3 = interfaceC1033iE;
                            hVar3 = hVar4;
                            z14 = z15;
                            kVar3 = kVar4;
                        } else {
                            c1086gP.w();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            hVar4 = hVar2;
                            z15 = z12;
                            kVar4 = kVar2;
                        }
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                        c1086gP.U();
                        if (z10) {
                            toggleableState = ToggleableState.f15273b;
                        } else {
                            toggleableState = ToggleableState.f15274c;
                        }
                        if (lVar != null) {
                            c1086gP.L(-1450332004);
                            if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i17 & 14) == 4);
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        lVar.invoke(Boolean.valueOf(!z10));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        lVar.invoke(Boolean.valueOf(!z10));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            aVar = (Ia.a) objF;
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1450267308);
                            c1086gP.T(false);
                            aVar = null;
                        }
                        c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                        interfaceC1033i3 = interfaceC1033iE;
                        hVar3 = hVar4;
                        z14 = z15;
                        kVar3 = kVar4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        z14 = z12;
                        kVar3 = kVar2;
                        interfaceC1033i3 = interfaceC1033i2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                kVar2 = kVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i19;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (z10) {
                        toggleableState = ToggleableState.f15273b;
                    } else {
                        toggleableState = ToggleableState.f15274c;
                    }
                    if (lVar != null) {
                        c1086gP.L(-1450332004);
                        if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i17 & 14) == 4);
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        aVar = (Ia.a) objF;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1450267308);
                        c1086gP.T(false);
                        aVar = null;
                    }
                    c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                    interfaceC1033i3 = interfaceC1033iE;
                    hVar3 = hVar4;
                    z14 = z15;
                    kVar3 = kVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    kVar3 = kVar2;
                    interfaceC1033i3 = interfaceC1033i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i19;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (z10) {
                        toggleableState = ToggleableState.f15273b;
                    } else {
                        toggleableState = ToggleableState.f15274c;
                    }
                    if (lVar != null) {
                        c1086gP.L(-1450332004);
                        if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i17 & 14) == 4);
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        aVar = (Ia.a) objF;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1450267308);
                        c1086gP.T(false);
                        aVar = null;
                    }
                    c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                    interfaceC1033i3 = interfaceC1033iE;
                    hVar3 = hVar4;
                    z14 = z15;
                    kVar3 = kVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    kVar3 = kVar2;
                    interfaceC1033i3 = interfaceC1033i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i19;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (z10) {
                    toggleableState = ToggleableState.f15273b;
                } else {
                    toggleableState = ToggleableState.f15274c;
                }
                if (lVar != null) {
                    c1086gP.L(-1450332004);
                    if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i17 & 14) == 4);
                    objF = c1086gP.f();
                    if (z17) {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    aVar = (Ia.a) objF;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1450267308);
                    c1086gP.T(false);
                    aVar = null;
                }
                c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                interfaceC1033i3 = interfaceC1033iE;
                hVar3 = hVar4;
                z14 = z15;
                kVar3 = kVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                kVar3 = kVar2;
                interfaceC1033i3 = interfaceC1033i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c1086gP.c(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i19;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            i17 = i12;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (z10) {
                        toggleableState = ToggleableState.f15273b;
                    } else {
                        toggleableState = ToggleableState.f15274c;
                    }
                    if (lVar != null) {
                        c1086gP.L(-1450332004);
                        if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i17 & 14) == 4);
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Boolean.valueOf(!z10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        aVar = (Ia.a) objF;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1450267308);
                        c1086gP.T(false);
                        aVar = null;
                    }
                    c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                    interfaceC1033i3 = interfaceC1033iE;
                    hVar3 = hVar4;
                    z14 = z15;
                    kVar3 = kVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    kVar3 = kVar2;
                    interfaceC1033i3 = interfaceC1033i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i19;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (z10) {
                    toggleableState = ToggleableState.f15273b;
                } else {
                    toggleableState = ToggleableState.f15274c;
                }
                if (lVar != null) {
                    c1086gP.L(-1450332004);
                    if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i17 & 14) == 4);
                    objF = c1086gP.f();
                    if (z17) {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    aVar = (Ia.a) objF;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1450267308);
                    c1086gP.T(false);
                    aVar = null;
                }
                c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                interfaceC1033i3 = interfaceC1033iE;
                hVar3 = hVar4;
                z14 = z15;
                kVar3 = kVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                kVar3 = kVar2;
                interfaceC1033i3 = interfaceC1033i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i19;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i19;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        i17 = i12;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (z10) {
                    toggleableState = ToggleableState.f15273b;
                } else {
                    toggleableState = ToggleableState.f15274c;
                }
                if (lVar != null) {
                    c1086gP.L(-1450332004);
                    if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i17 & 14) == 4);
                    objF = c1086gP.f();
                    if (z17) {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                lVar.invoke(Boolean.valueOf(!z10));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    aVar = (Ia.a) objF;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1450267308);
                    c1086gP.T(false);
                    aVar = null;
                }
                c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
                interfaceC1033i3 = interfaceC1033iE;
                hVar3 = hVar4;
                z14 = z15;
                kVar3 = kVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                kVar3 = kVar2;
                interfaceC1033i3 = interfaceC1033i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                interfaceC1033i2 = interfaceC1033i;
                if (c1086gP.K(interfaceC1033i2)) {
                }
                i12 |= i19;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            i12 |= i19;
        } else {
            interfaceC1033i2 = interfaceC1033i;
        }
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c1086gP.C(i12 & 1, z13)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    kVar4 = null;
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                } else {
                    i17 = i12;
                    interfaceC1033iE = interfaceC1033i2;
                }
            } else {
                if (i18 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    kVar4 = null;
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                } else {
                    i17 = i12;
                    interfaceC1033iE = interfaceC1033i2;
                }
            }
            c1086gP.U();
            if (z10) {
                toggleableState = ToggleableState.f15273b;
            } else {
                toggleableState = ToggleableState.f15274c;
            }
            if (lVar != null) {
                c1086gP.L(-1450332004);
                if ((i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i17 & 14) == 4);
                objF = c1086gP.f();
                if (z17) {
                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            lVar.invoke(Boolean.valueOf(!z10));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            lVar.invoke(Boolean.valueOf(!z10));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                aVar = (Ia.a) objF;
                c1086gP.T(false);
            } else {
                c1086gP.L(-1450267308);
                c1086gP.T(false);
                aVar = null;
            }
            c(toggleableState, aVar, hVar4, z15, kVar4, interfaceC1033iE, c1086gP, i17 & 524160, 0);
            interfaceC1033i3 = interfaceC1033iE;
            hVar3 = hVar4;
            z14 = z15;
            kVar3 = kVar4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            z14 = z12;
            kVar3 = kVar2;
            interfaceC1033i3 = interfaceC1033i2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CheckboxKt.a(z10, lVar, hVar3, z14, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(final boolean z10, final ToggleableState toggleableState, final androidx.compose.ui.h hVar, final InterfaceC1033i interfaceC1033i, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        float f10;
        float f11;
        float f12;
        C1086g c1086gP = interfaceC1084f.p(-2118895727);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(toggleableState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(interfaceC1033i) ? 2048 : 1024;
        }
        if (c1086gP.C(i11 & 1, (i11 & 1171) != 1170)) {
            Transition transitionF = TransitionKt.f(toggleableState, null, c1086gP, (i11 >> 3) & 14, 2);
            e0 e0Var = VectorConvertersKt.f9477a;
            b0<S> b0Var = transitionF.f9429a;
            ToggleableState toggleableState2 = (ToggleableState) b0Var.a();
            c1086gP.L(-1798345588);
            int iOrdinal = toggleableState2.ordinal();
            float f13 = 0.0f;
            if (iOrdinal == 0) {
                f10 = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c1086gP.T(false);
            Float fValueOf = Float.valueOf(f10);
            C1085f0 c1085f0 = transitionF.f9432d;
            ToggleableState toggleableState3 = (ToggleableState) c1085f0.getValue();
            c1086gP.L(-1798345588);
            int iOrdinal2 = toggleableState3.ordinal();
            if (iOrdinal2 == 0) {
                f11 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            c1086gP.T(false);
            final Transition.d dVarD = TransitionKt.d(transitionF, fValueOf, Float.valueOf(f11), CheckboxKt$CheckboxImpl$checkDrawFraction$2.f11692h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 0);
            ToggleableState toggleableState4 = (ToggleableState) b0Var.a();
            c1086gP.L(-2098942571);
            int iOrdinal3 = toggleableState4.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                f12 = 0.0f;
            } else {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 1.0f;
            }
            c1086gP.T(false);
            Float fValueOf2 = Float.valueOf(f12);
            ToggleableState toggleableState5 = (ToggleableState) c1085f0.getValue();
            c1086gP.L(-2098942571);
            int iOrdinal4 = toggleableState5.ordinal();
            if (iOrdinal4 != 0 && iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
            }
            c1086gP.T(false);
            final Transition.d dVarD2 = TransitionKt.d(transitionF, fValueOf2, Float.valueOf(f13), CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.f11691h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 0);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new C1032h(0);
                c1086gP.E(objF);
            }
            final C1032h c1032h = (C1032h) objF;
            final N0 n0B = interfaceC1033i.b(toggleableState, c1086gP);
            final N0 n0A = interfaceC1033i.a(z10, toggleableState, c1086gP);
            final N0 n0C = interfaceC1033i.c(z10, toggleableState, c1086gP);
            androidx.compose.ui.h hVarI = W.i(W.t(hVar, androidx.compose.ui.d.a.f13339e, 2), f11688c);
            boolean zK = c1086gP.K(n0A) | c1086gP.K(n0C) | c1086gP.K(n0B) | c1086gP.K(dVarD) | c1086gP.K(dVarD2);
            Object objF2 = c1086gP.f();
            if (zK || objF2 == c0153a) {
                objF2 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        CheckboxKt$CheckboxImpl$1$1 checkboxKt$CheckboxImpl$1$1 = this;
                        J.e eVar2 = eVar;
                        float fFloor = (float) Math.floor(eVar2.T0(CheckboxKt.f11689d));
                        long j = n0A.getValue().f13506a;
                        long j10 = n0C.getValue().f13506a;
                        float fT0 = eVar2.T0(CheckboxKt.f11690e);
                        float f14 = fFloor / 2.0f;
                        J.i iVar = new J.i(fFloor, 0.0f, 0, 0, 30);
                        float fD = I.h.d(eVar2.j());
                        if (androidx.compose.ui.graphics.H.c(j, j10)) {
                            eVar2.R(j, (240 & 2) != 0 ? 0L : 0L, Cb.a.b(fD, fD), C2479a.a(fT0), (240 & 16) != 0 ? J.h.f3954a : J.h.f3954a, 1.0f, null, 3);
                        } else {
                            float f15 = fD - (2 * fFloor);
                            eVar2.R(j, (240 & 2) != 0 ? 0L : I.e.c(fFloor, fFloor), Cb.a.b(f15, f15), C2479a.a(Math.max(0.0f, fT0 - fFloor)), (240 & 16) != 0 ? J.h.f3954a : J.h.f3954a, 1.0f, null, 3);
                            float f16 = fD - fFloor;
                            eVar2.R(j10, (240 & 2) != 0 ? 0L : I.e.c(f14, f14), Cb.a.b(f16, f16), C2479a.a(fT0 - f14), (240 & 16) != 0 ? J.h.f3954a : iVar, 1.0f, null, 3);
                            checkboxKt$CheckboxImpl$1$1 = this;
                        }
                        long j11 = n0B.getValue().f13506a;
                        float fFloatValue = dVarD.getValue().floatValue();
                        float fFloatValue2 = dVarD2.getValue().floatValue();
                        C1032h c1032h2 = c1032h;
                        J.i iVar2 = new J.i(fFloor, 0.0f, 2, 0, 26);
                        float fD2 = I.h.d(eVar2.j());
                        float fN = D9.o.n(0.4f, 0.5f, fFloatValue2);
                        float fN2 = D9.o.n(0.7f, 0.5f, fFloatValue2);
                        float fN3 = D9.o.n(0.5f, 0.5f, fFloatValue2);
                        float fN4 = D9.o.n(0.3f, 0.5f, fFloatValue2);
                        c1032h2.f11886a.reset();
                        Path path = c1032h2.f11886a;
                        path.l(0.2f * fD2, fN3 * fD2);
                        path.t(fN * fD2, fN2 * fD2);
                        path.t(0.8f * fD2, fD2 * fN4);
                        androidx.compose.ui.graphics.e0 e0Var2 = c1032h2.f11887b;
                        e0Var2.b(path);
                        Path path2 = c1032h2.f11888c;
                        path2.reset();
                        e0Var2.a(0.0f, e0Var2.getLength() * fFloatValue, path2);
                        J.e.N(eVar2, c1032h2.f11888c, j11, iVar2, null, 52);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            CanvasKt.a(hVarI, (Ia.l) objF2, c1086gP, 0);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CheckboxKt.b(z10, toggleableState, hVar, interfaceC1033i, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final void c(final ToggleableState toggleableState, final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.foundation.interaction.k kVar, InterfaceC1033i interfaceC1033i, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        InterfaceC1033i interfaceC1033i2;
        int i17;
        boolean z12;
        final androidx.compose.ui.h hVar3;
        final boolean z13;
        final androidx.compose.foundation.interaction.k kVar3;
        C1105p0 c1105p0V;
        int i18;
        androidx.compose.ui.h hVar4;
        androidx.compose.ui.h hVar5;
        boolean z14;
        androidx.compose.foundation.interaction.k kVar4;
        androidx.compose.foundation.interaction.k kVar5;
        androidx.compose.ui.h hVar6;
        InterfaceC1033i interfaceC1033iE;
        androidx.compose.ui.h hVarB;
        C1086g c1086gP = interfaceC1084f.p(2031255194);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(toggleableState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(aVar) ? 32 : 16;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
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
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            interfaceC1033i2 = interfaceC1033i;
                            int i20 = c1086gP.K(interfaceC1033i2) ? 131072 : 65536;
                            i12 |= i20;
                        } else {
                            interfaceC1033i2 = interfaceC1033i;
                        }
                        i12 |= i20;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i17 = i12;
                    if ((i17 & 74899) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c1086gP.C(i17 & 1, z12)) {
                        c1086gP.r0();
                        i18 = i10 & 1;
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i18 != 0 || c1086gP.a0()) {
                            if (i19 != 0) {
                                hVar5 = hVar4;
                            } else {
                                hVar5 = hVar2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                kVar4 = null;
                            } else {
                                kVar4 = kVar2;
                            }
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                                kVar5 = kVar4;
                                hVar6 = hVar5;
                                interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                            } else {
                                kVar5 = kVar4;
                                hVar6 = hVar5;
                                interfaceC1033iE = interfaceC1033i2;
                            }
                        } else {
                            c1086gP.w();
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                            }
                            z14 = z11;
                            kVar5 = kVar2;
                            interfaceC1033iE = interfaceC1033i2;
                            hVar6 = hVar2;
                        }
                        c1086gP.U();
                        if (aVar != null) {
                            hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                        } else {
                            hVarB = hVar4;
                        }
                        if (aVar != null) {
                            O0 o10 = InteractiveComponentSizeKt.f11762a;
                            hVar4 = MinimumInteractiveModifier.f11774b;
                        }
                        b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                        hVar3 = hVar6;
                        kVar3 = kVar5;
                        interfaceC1033i2 = interfaceC1033iE;
                        z13 = z14;
                    } else {
                        c1086gP = c1086gP;
                        c1086gP.w();
                        hVar3 = hVar2;
                        z13 = z11;
                        kVar3 = kVar2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final InterfaceC1033i interfaceC1033i3 = interfaceC1033i2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                kVar2 = kVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i20;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i17 & 1, z12)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (aVar != null) {
                        hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                    } else {
                        hVarB = hVar4;
                    }
                    if (aVar != null) {
                        O0 o11 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                    hVar3 = hVar6;
                    kVar3 = kVar5;
                    interfaceC1033i2 = interfaceC1033iE;
                    z13 = z14;
                } else {
                    c1086gP = c1086gP;
                    c1086gP.w();
                    hVar3 = hVar2;
                    z13 = z11;
                    kVar3 = kVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1033i interfaceC1033i4 = interfaceC1033i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i20;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i17 & 1, z12)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (aVar != null) {
                        hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                    } else {
                        hVarB = hVar4;
                    }
                    if (aVar != null) {
                        O0 o12 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                    hVar3 = hVar6;
                    kVar3 = kVar5;
                    interfaceC1033i2 = interfaceC1033iE;
                    z13 = z14;
                } else {
                    c1086gP = c1086gP;
                    c1086gP.w();
                    hVar3 = hVar2;
                    z13 = z11;
                    kVar3 = kVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1033i interfaceC1033i5 = interfaceC1033i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i20;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i17 & 1, z12)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (aVar != null) {
                    hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                } else {
                    hVarB = hVar4;
                }
                if (aVar != null) {
                    O0 o13 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                hVar3 = hVar6;
                kVar3 = kVar5;
                interfaceC1033i2 = interfaceC1033iE;
                z13 = z14;
            } else {
                c1086gP = c1086gP;
                c1086gP.w();
                hVar3 = hVar2;
                z13 = z11;
                kVar3 = kVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1033i interfaceC1033i6 = interfaceC1033i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i6, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
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
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        interfaceC1033i2 = interfaceC1033i;
                        if (c1086gP.K(interfaceC1033i2)) {
                        }
                        i12 |= i20;
                    } else {
                        interfaceC1033i2 = interfaceC1033i;
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i17 & 1, z12)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    } else {
                        if (i19 != 0) {
                            hVar5 = hVar4;
                        } else {
                            hVar5 = hVar2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            kVar4 = null;
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 &= -458753;
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                        } else {
                            kVar5 = kVar4;
                            hVar6 = hVar5;
                            interfaceC1033iE = interfaceC1033i2;
                        }
                    }
                    c1086gP.U();
                    if (aVar != null) {
                        hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                    } else {
                        hVarB = hVar4;
                    }
                    if (aVar != null) {
                        O0 o14 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                    hVar3 = hVar6;
                    kVar3 = kVar5;
                    interfaceC1033i2 = interfaceC1033iE;
                    z13 = z14;
                } else {
                    c1086gP = c1086gP;
                    c1086gP.w();
                    hVar3 = hVar2;
                    z13 = z11;
                    kVar3 = kVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1033i interfaceC1033i7 = interfaceC1033i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i7, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i20;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i17 & 1, z12)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (aVar != null) {
                    hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                } else {
                    hVarB = hVar4;
                }
                if (aVar != null) {
                    O0 o15 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                hVar3 = hVar6;
                kVar3 = kVar5;
                interfaceC1033i2 = interfaceC1033iE;
                z13 = z14;
            } else {
                c1086gP = c1086gP;
                c1086gP.w();
                hVar3 = hVar2;
                z13 = z11;
                kVar3 = kVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1033i interfaceC1033i8 = interfaceC1033i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i8, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    interfaceC1033i2 = interfaceC1033i;
                    if (c1086gP.K(interfaceC1033i2)) {
                    }
                    i12 |= i20;
                } else {
                    interfaceC1033i2 = interfaceC1033i;
                }
                i12 |= i20;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i17 & 1, z12)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                } else {
                    if (i19 != 0) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                    } else {
                        kVar5 = kVar4;
                        hVar6 = hVar5;
                        interfaceC1033iE = interfaceC1033i2;
                    }
                }
                c1086gP.U();
                if (aVar != null) {
                    hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
                } else {
                    hVarB = hVar4;
                }
                if (aVar != null) {
                    O0 o16 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
                hVar3 = hVar6;
                kVar3 = kVar5;
                interfaceC1033i2 = interfaceC1033iE;
                z13 = z14;
            } else {
                c1086gP = c1086gP;
                c1086gP.w();
                hVar3 = hVar2;
                z13 = z11;
                kVar3 = kVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1033i interfaceC1033i9 = interfaceC1033i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i9, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                interfaceC1033i2 = interfaceC1033i;
                if (c1086gP.K(interfaceC1033i2)) {
                }
                i12 |= i20;
            } else {
                interfaceC1033i2 = interfaceC1033i;
            }
            i12 |= i20;
        } else {
            interfaceC1033i2 = interfaceC1033i;
        }
        i17 = i12;
        if ((i17 & 74899) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c1086gP.C(i17 & 1, z12)) {
            c1086gP.r0();
            i18 = i10 & 1;
            hVar4 = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                if (i19 != 0) {
                    hVar5 = hVar4;
                } else {
                    hVar5 = hVar2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    kVar4 = null;
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i17 &= -458753;
                    kVar5 = kVar4;
                    hVar6 = hVar5;
                    interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                } else {
                    kVar5 = kVar4;
                    hVar6 = hVar5;
                    interfaceC1033iE = interfaceC1033i2;
                }
            } else {
                if (i19 != 0) {
                    hVar5 = hVar4;
                } else {
                    hVar5 = hVar2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    kVar4 = null;
                } else {
                    kVar4 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i17 &= -458753;
                    kVar5 = kVar4;
                    hVar6 = hVar5;
                    interfaceC1033iE = p111ia.c.e(0L, 0L, 0L, 0L, c1086gP, 196608, 31);
                } else {
                    kVar5 = kVar4;
                    hVar6 = hVar5;
                    interfaceC1033iE = interfaceC1033i2;
                }
            }
            c1086gP.U();
            if (aVar != null) {
                hVarB = androidx.compose.foundation.selection.c.b(toggleableState, kVar5, RippleKt.a(f11686a, 4, 0L), z14, new androidx.compose.ui.semantics.i(1), aVar);
            } else {
                hVarB = hVar4;
            }
            if (aVar != null) {
                O0 o17 = InteractiveComponentSizeKt.f11762a;
                hVar4 = MinimumInteractiveModifier.f11774b;
            }
            b(z14, toggleableState, PaddingKt.f(hVar6.i(hVar4).i(hVarB), f11687b), interfaceC1033iE, c1086gP, ((i17 >> 9) & 14) | ((i17 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i17 >> 6) & 7168));
            hVar3 = hVar6;
            kVar3 = kVar5;
            interfaceC1033i2 = interfaceC1033iE;
            z13 = z14;
        } else {
            c1086gP = c1086gP;
            c1086gP.w();
            hVar3 = hVar2;
            z13 = z11;
            kVar3 = kVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final InterfaceC1033i interfaceC1033i10 = interfaceC1033i2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.CheckboxKt$TriStateCheckbox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CheckboxKt.c(toggleableState, aVar, hVar3, z13, kVar3, interfaceC1033i10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
