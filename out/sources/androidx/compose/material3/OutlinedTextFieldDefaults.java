package androidx.compose.material3;

import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.N0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OutlinedTextFieldDefaults f12253a = new OutlinedTextFieldDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12254b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12255c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12256d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12257e = 2;

    public static TextFieldColors c(InterfaceC1084f interfaceC1084f, int i10) {
        return d((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a), interfaceC1084f);
    }

    public static TextFieldColors d(C1061m c1061m, InterfaceC1084f interfaceC1084f) {
        TextFieldColors textFieldColors = c1061m.f12617T;
        interfaceC1084f.L(1540400102);
        if (textFieldColors == null) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f12717i;
            long jC = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens);
            long jC2 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens);
            long jB = androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens));
            long jC3 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens);
            long j = androidx.compose.ui.graphics.H.f13503k;
            ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f12721n;
            long jC4 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens2);
            ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f12710b;
            long jC5 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3);
            androidx.compose.foundation.text.selection.y yVar = (androidx.compose.foundation.text.selection.y) interfaceC1084f.x(TextSelectionColorsKt.f11582a);
            long jC6 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens2);
            long jC7 = ColorSchemeKt.c(c1061m, ColorSchemeKeyTokens.f12719l);
            long jB2 = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens));
            long jC8 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3);
            ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.j;
            textFieldColors = new TextFieldColors(jC, jC2, jB, jC3, j, j, j, j, jC4, jC5, yVar, jC6, jC7, jB2, jC8, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens2), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4)), ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4));
            c1061m.f12617T = textFieldColors;
        }
        interfaceC1084f.D();
        return textFieldColors;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0119  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0157  */
    /* JADX WARN: Code duplicated, block: B:125:0x015a  */
    /* JADX WARN: Code duplicated, block: B:128:0x015f  */
    /* JADX WARN: Code duplicated, block: B:129:0x016a  */
    /* JADX WARN: Code duplicated, block: B:132:0x016f  */
    /* JADX WARN: Code duplicated, block: B:135:0x017c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0185  */
    /* JADX WARN: Code duplicated, block: B:139:0x0190  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x0231  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z10, final boolean z11, final androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.h hVar, TextFieldColors textFieldColors, androidx.compose.ui.graphics.l0 l0Var, float f10, float f11, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        TextFieldColors textFieldColors2;
        androidx.compose.ui.graphics.l0 l0VarA;
        float f12;
        float f13;
        int i13;
        androidx.compose.ui.h hVar3;
        TextFieldColors textFieldColorsC;
        androidx.compose.ui.h hVar4;
        TextFieldColors textFieldColors3;
        float f14;
        androidx.compose.ui.graphics.l0 l0Var2;
        float f15;
        boolean zBooleanValue;
        TextFieldColors textFieldColors4;
        long j;
        final androidx.compose.ui.graphics.l0 l0Var3;
        final TextFieldColors textFieldColors5;
        final androidx.compose.ui.h hVar5;
        final float f16;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1035477640);
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
            i12 |= c1086gP.c(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(jVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 3072) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    int i15 = c1086gP.K(textFieldColors2) ? 16384 : 8192;
                    i12 |= i15;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i12 |= i15;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    l0VarA = l0Var;
                    int i16 = c1086gP.K(l0VarA) ? 131072 : 65536;
                    i12 |= i16;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i16;
            } else {
                l0VarA = l0Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    f12 = f10;
                    int i17 = c1086gP.g(f12) ? 1048576 : 524288;
                    i12 |= i17;
                } else {
                    f12 = f10;
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    f13 = f11;
                    int i18 = c1086gP.g(f13) ? 8388608 : 4194304;
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(this)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i12 |= i13;
            }
            if ((38347923 & i12) == 38347922 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 16) != 0) {
                        textFieldColorsC = c(c1086gP, (i12 >> 24) & 14);
                        i12 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12736d, c1086gP);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        f12 = f12257e;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        hVar4 = hVar3;
                        textFieldColors3 = textFieldColorsC;
                        f14 = f12256d;
                        l0Var2 = l0VarA;
                        f15 = f12;
                    } else {
                        hVar4 = hVar3;
                        textFieldColors3 = textFieldColorsC;
                    }
                    c1086gP.U();
                    int i19 = i12 >> 6;
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, i19 & 14).getValue()).booleanValue();
                    androidx.compose.ui.graphics.l0 l0Var4 = l0Var2;
                    textFieldColors4 = textFieldColors3;
                    androidx.compose.runtime.X xD = TextFieldImplKt.d(z10, z11, zBooleanValue, textFieldColors3, f15, f14, c1086gP, ((i12 >> 3) & 7168) | (i12 & R.styleable.AppCompatTheme_windowNoTitle) | (57344 & i19) | (i19 & 458752));
                    if (!z10) {
                        j = textFieldColors4.f12350g;
                    } else if (z11) {
                        j = textFieldColors4.f12351h;
                    } else if (zBooleanValue) {
                        j = textFieldColors4.f12348e;
                    } else {
                        j = textFieldColors4.f12349f;
                    }
                    N0 n0A = androidx.compose.animation.x.a(j, C0907g.d(150, 0, null, 6), null, c1086gP, 48, 12);
                    C0937i c0937i = (C0937i) xD.getValue();
                    BoxKt.a(TextFieldImplKt.h(C0935g.b(hVar4, c0937i.f10065a, c0937i.f10066b, l0Var4), new TextFieldDefaults.a(new OutlinedTextFieldDefaults$Container$1(n0A, N0.class, "value", "getValue()Ljava/lang/Object;", 0)), l0Var4), c1086gP, 0);
                    l0Var3 = l0Var4;
                    textFieldColors5 = textFieldColors4;
                    hVar5 = hVar4;
                    f16 = f15;
                } else {
                    c1086gP.w();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                    }
                    hVar4 = hVar2;
                    textFieldColors3 = textFieldColors2;
                }
                f15 = f12;
                f14 = f13;
                l0Var2 = l0VarA;
                c1086gP.U();
                int i110 = i12 >> 6;
                zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, i110 & 14).getValue()).booleanValue();
                androidx.compose.ui.graphics.l0 l0Var5 = l0Var2;
                textFieldColors4 = textFieldColors3;
                androidx.compose.runtime.X xD2 = TextFieldImplKt.d(z10, z11, zBooleanValue, textFieldColors3, f15, f14, c1086gP, ((i12 >> 3) & 7168) | (i12 & R.styleable.AppCompatTheme_windowNoTitle) | (57344 & i110) | (i110 & 458752));
                if (!z10) {
                    j = textFieldColors4.f12350g;
                } else if (z11) {
                    j = textFieldColors4.f12351h;
                } else if (zBooleanValue) {
                    j = textFieldColors4.f12348e;
                } else {
                    j = textFieldColors4.f12349f;
                }
                N0 n0A2 = androidx.compose.animation.x.a(j, C0907g.d(150, 0, null, 6), null, c1086gP, 48, 12);
                C0937i c0937i2 = (C0937i) xD2.getValue();
                BoxKt.a(TextFieldImplKt.h(C0935g.b(hVar4, c0937i2.f10065a, c0937i2.f10066b, l0Var5), new TextFieldDefaults.a(new OutlinedTextFieldDefaults$Container$1(n0A2, N0.class, "value", "getValue()Ljava/lang/Object;", 0)), l0Var5), c1086gP, 0);
                l0Var3 = l0Var5;
                textFieldColors5 = textFieldColors4;
                hVar5 = hVar4;
                f16 = f15;
            } else {
                c1086gP.w();
                l0Var3 = l0VarA;
                f16 = f12;
                f14 = f13;
                hVar5 = hVar2;
                textFieldColors5 = textFieldColors2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f17 = f14;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(z10, z11, jVar, hVar5, textFieldColors5, l0Var3, f16, f17, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                textFieldColors2 = textFieldColors;
                if (c1086gP.K(textFieldColors2)) {
                }
                i12 |= i15;
            } else {
                textFieldColors2 = textFieldColors;
            }
            i12 |= i15;
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                l0VarA = l0Var;
                if (c1086gP.K(l0VarA)) {
                }
                i12 |= i16;
            } else {
                l0VarA = l0Var;
            }
            i12 |= i16;
        } else {
            l0VarA = l0Var;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                if (c1086gP.g(f12)) {
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            i12 |= i17;
        } else {
            f12 = f10;
        }
        if ((12582912 & i10) == 0) {
            if ((i11 & 128) == 0) {
                f13 = f11;
                if (c1086gP.g(f13)) {
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            i12 |= i18;
        } else {
            f13 = f11;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(this)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        if ((38347923 & i12) == 38347922) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 16) != 0) {
                    textFieldColorsC = c(c1086gP, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12736d, c1086gP);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f12 = f12257e;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f14 = f12256d;
                    l0Var2 = l0VarA;
                    f15 = f12;
                } else {
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f15 = f12;
                    f14 = f13;
                    l0Var2 = l0VarA;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 16) != 0) {
                    textFieldColorsC = c(c1086gP, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12736d, c1086gP);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f12 = f12257e;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f14 = f12256d;
                    l0Var2 = l0VarA;
                    f15 = f12;
                } else {
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f15 = f12;
                    f14 = f13;
                    l0Var2 = l0VarA;
                }
            }
            c1086gP.U();
            int i111 = i12 >> 6;
            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, i111 & 14).getValue()).booleanValue();
            androidx.compose.ui.graphics.l0 l0Var6 = l0Var2;
            textFieldColors4 = textFieldColors3;
            androidx.compose.runtime.X xD3 = TextFieldImplKt.d(z10, z11, zBooleanValue, textFieldColors3, f15, f14, c1086gP, ((i12 >> 3) & 7168) | (i12 & R.styleable.AppCompatTheme_windowNoTitle) | (57344 & i111) | (i111 & 458752));
            if (!z10) {
                j = textFieldColors4.f12350g;
            } else if (z11) {
                j = textFieldColors4.f12351h;
            } else if (zBooleanValue) {
                j = textFieldColors4.f12348e;
            } else {
                j = textFieldColors4.f12349f;
            }
            N0 n0A3 = androidx.compose.animation.x.a(j, C0907g.d(150, 0, null, 6), null, c1086gP, 48, 12);
            C0937i c0937i3 = (C0937i) xD3.getValue();
            BoxKt.a(TextFieldImplKt.h(C0935g.b(hVar4, c0937i3.f10065a, c0937i3.f10066b, l0Var6), new TextFieldDefaults.a(new OutlinedTextFieldDefaults$Container$1(n0A3, N0.class, "value", "getValue()Ljava/lang/Object;", 0)), l0Var6), c1086gP, 0);
            l0Var3 = l0Var6;
            textFieldColors5 = textFieldColors4;
            hVar5 = hVar4;
            f16 = f15;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 16) != 0) {
                    textFieldColorsC = c(c1086gP, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12736d, c1086gP);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f12 = f12257e;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f14 = f12256d;
                    l0Var2 = l0VarA;
                    f15 = f12;
                } else {
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f15 = f12;
                    f14 = f13;
                    l0Var2 = l0VarA;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 16) != 0) {
                    textFieldColorsC = c(c1086gP, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12736d, c1086gP);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f12 = f12257e;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f14 = f12256d;
                    l0Var2 = l0VarA;
                    f15 = f12;
                } else {
                    hVar4 = hVar3;
                    textFieldColors3 = textFieldColorsC;
                    f15 = f12;
                    f14 = f13;
                    l0Var2 = l0VarA;
                }
            }
            c1086gP.U();
            int i112 = i12 >> 6;
            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, i112 & 14).getValue()).booleanValue();
            androidx.compose.ui.graphics.l0 l0Var7 = l0Var2;
            textFieldColors4 = textFieldColors3;
            androidx.compose.runtime.X xD4 = TextFieldImplKt.d(z10, z11, zBooleanValue, textFieldColors3, f15, f14, c1086gP, ((i12 >> 3) & 7168) | (i12 & R.styleable.AppCompatTheme_windowNoTitle) | (57344 & i112) | (i112 & 458752));
            if (!z10) {
                j = textFieldColors4.f12350g;
            } else if (z11) {
                j = textFieldColors4.f12351h;
            } else if (zBooleanValue) {
                j = textFieldColors4.f12348e;
            } else {
                j = textFieldColors4.f12349f;
            }
            N0 n0A4 = androidx.compose.animation.x.a(j, C0907g.d(150, 0, null, 6), null, c1086gP, 48, 12);
            C0937i c0937i4 = (C0937i) xD4.getValue();
            BoxKt.a(TextFieldImplKt.h(C0935g.b(hVar4, c0937i4.f10065a, c0937i4.f10066b, l0Var7), new TextFieldDefaults.a(new OutlinedTextFieldDefaults$Container$1(n0A4, N0.class, "value", "getValue()Ljava/lang/Object;", 0)), l0Var7), c1086gP, 0);
            l0Var3 = l0Var7;
            textFieldColors5 = textFieldColors4;
            hVar5 = hVar4;
            f16 = f15;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f18 = f14;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.a(z10, z11, jVar, hVar5, textFieldColors5, l0Var3, f16, f18, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:140:0x019a  */
    /* JADX WARN: Code duplicated, block: B:142:0x019f  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:176:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0204  */
    /* JADX WARN: Code duplicated, block: B:181:0x0209  */
    /* JADX WARN: Code duplicated, block: B:183:0x020f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0215  */
    /* JADX WARN: Code duplicated, block: B:189:0x0225  */
    /* JADX WARN: Code duplicated, block: B:195:0x0252  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:207:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x028d  */
    /* JADX WARN: Code duplicated, block: B:209:0x028f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0294  */
    /* JADX WARN: Code duplicated, block: B:213:0x0296  */
    /* JADX WARN: Code duplicated, block: B:215:0x029a  */
    /* JADX WARN: Code duplicated, block: B:216:0x029c  */
    /* JADX WARN: Code duplicated, block: B:218:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:235:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:238:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:239:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:241:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:243:0x030f  */
    /* JADX WARN: Code duplicated, block: B:247:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    public final void b(final String str, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final boolean z10, final boolean z11, final androidx.compose.ui.text.input.E e10, final androidx.compose.foundation.interaction.j jVar, boolean z12, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8, TextFieldColors textFieldColors, androidx.compose.foundation.layout.L l10, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        final boolean z13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15;
        final TextFieldColors textFieldColorsC;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16;
        androidx.compose.foundation.layout.L n10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVarB;
        androidx.compose.foundation.layout.L l11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar20;
        TextFieldColors textFieldColors2;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21;
        boolean z14;
        C1086g c1086g;
        final boolean z15;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar22;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar23;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar24;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar25;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar26;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar27;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar28;
        final TextFieldColors textFieldColors3;
        final androidx.compose.foundation.layout.L l12;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar29;
        C1105p0 c1105p0V;
        int i36;
        C1086g c1086gP = interfaceC1084f.p(-350442135);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i12 & 8) == 0) {
            if ((i10 & 3072) == 0) {
                i13 |= c1086gP.c(z11) ? 2048 : 1024;
            }
            i14 = 8192;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                i28 = i12 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c1086gP.k(pVar6)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                i30 = i26;
                i31 = i12 & 4096;
                if (i31 != 0) {
                    if ((i11 & 384) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i33 = i12 & 8192;
                    if (i33 != 0) {
                        if ((i11 & 3072) == 0) {
                            i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0 && c1086gP.K(textFieldColors)) {
                                i14 = 16384;
                            }
                            i30 |= i14;
                        }
                        if ((i11 & 196608) != 0) {
                            if ((i12 & 32768) == 0 || !c1086gP.K(l10)) {
                                i36 = 65536;
                            } else {
                                i36 = 131072;
                            }
                            i30 |= i36;
                        }
                        i34 = i12 & 65536;
                        if (i34 != 0) {
                            i30 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                        }
                        if ((i12 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                        }
                        i35 = i13;
                        if ((i13 & 306783379) != 306783378 && (4793491 & i30) == 4793490 && c1086gP.s()) {
                            c1086gP.w();
                            z15 = z12;
                            pVar22 = pVar2;
                            pVar24 = pVar4;
                            pVar25 = pVar5;
                            pVar26 = pVar6;
                            pVar27 = pVar7;
                            pVar28 = pVar8;
                            textFieldColors3 = textFieldColors;
                            l12 = l10;
                            pVar29 = pVar9;
                            c1086g = c1086gP;
                            pVar23 = pVar3;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    pVar10 = null;
                                } else {
                                    pVar10 = pVar2;
                                }
                                if (i21 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar3;
                                }
                                if (i23 != 0) {
                                    pVar12 = null;
                                } else {
                                    pVar12 = pVar4;
                                }
                                if (i25 != 0) {
                                    pVar13 = null;
                                } else {
                                    pVar13 = pVar5;
                                }
                                if (i28 != 0) {
                                    pVar14 = null;
                                } else {
                                    pVar14 = pVar6;
                                }
                                if (i31 != 0) {
                                    pVar15 = null;
                                } else {
                                    pVar15 = pVar7;
                                }
                                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = i33 == 0 ? pVar8 : null;
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    textFieldColorsC = textFieldColors;
                                }
                                pVar16 = pVar12;
                                if ((i12 & 32768) != 0) {
                                    float f10 = TextFieldImplKt.f12498b;
                                    n10 = new androidx.compose.foundation.layout.N(f10, f10, f10, f10);
                                    i30 = (-458753) & i30;
                                } else {
                                    n10 = l10;
                                }
                                if (i34 != 0) {
                                    pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                                interfaceC1084f3.w();
                                            } else {
                                                OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, c1086gP);
                                } else {
                                    pVarB = pVar9;
                                }
                                l11 = n10;
                                pVar17 = pVar14;
                                pVar18 = pVar10;
                                pVar19 = pVar11;
                                pVar20 = pVar15;
                                textFieldColors2 = textFieldColorsC;
                                pVar21 = pVar30;
                                z14 = z13;
                            } else {
                                c1086gP.w();
                                if ((i12 & 16384) != 0) {
                                    i30 &= -57345;
                                }
                                if ((i12 & 32768) != 0) {
                                    i30 &= -458753;
                                }
                                z14 = z12;
                                pVar18 = pVar2;
                                pVar19 = pVar3;
                                pVar16 = pVar4;
                                pVar13 = pVar5;
                                pVar17 = pVar6;
                                pVar20 = pVar7;
                                pVar21 = pVar8;
                                textFieldColors2 = textFieldColors;
                                l11 = l10;
                                pVarB = pVar9;
                            }
                            c1086gP.U();
                            int i37 = i35 << 3;
                            int i38 = i35 >> 3;
                            int i39 = i35 >> 9;
                            int i40 = i30 << 21;
                            c1086g = c1086gP;
                            TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i37 & 896) | (i37 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i38 & 7168) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (29360128 & i40) | (234881024 & i40) | (i40 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i39 & 7168) | (57344 & i38) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            z15 = z14;
                            pVar22 = pVar18;
                            pVar23 = pVar19;
                            pVar24 = pVar16;
                            pVar25 = pVar13;
                            pVar26 = pVar17;
                            pVar27 = pVar20;
                            pVar28 = pVar21;
                            textFieldColors3 = textFieldColors2;
                            l12 = l11;
                            pVar29 = pVarB;
                        }
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i30 |= 3072;
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i14 = 16384;
                        }
                        i30 |= i14;
                    }
                    if ((i11 & 196608) != 0) {
                        if ((i12 & 32768) == 0) {
                            i36 = 65536;
                        } else {
                            i36 = 65536;
                        }
                        i30 |= i36;
                    }
                    i34 = i12 & 65536;
                    if (i34 != 0) {
                        i30 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                    }
                    if ((i12 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                    }
                    i35 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f11 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f11, f11, f11, f11);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f12 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f12, f12, f12, f12);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i310 = i35 << 3;
                        int i311 = i35 >> 3;
                        int i312 = i35 >> 9;
                        int i41 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i310 & 896) | (i310 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311 & 7168) | (57344 & i312) | (458752 & i312) | (3670016 & i312) | (29360128 & i41) | (234881024 & i41) | (i41 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i312 & 7168) | (57344 & i311) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f13 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f13, f13, f13, f13);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f14 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f14, f14, f14, f14);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i313 = i35 << 3;
                        int i314 = i35 >> 3;
                        int i315 = i35 >> 9;
                        int i42 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i313 & 896) | (i313 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i314 & 7168) | (57344 & i315) | (458752 & i315) | (3670016 & i315) | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i315 & 7168) | (57344 & i314) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 384;
                i33 = i12 & 8192;
                if (i33 != 0) {
                    if ((i11 & 3072) == 0) {
                        i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i14 = 16384;
                        }
                        i30 |= i14;
                    }
                    if ((i11 & 196608) != 0) {
                        if ((i12 & 32768) == 0) {
                            i36 = 65536;
                        } else {
                            i36 = 65536;
                        }
                        i30 |= i36;
                    }
                    i34 = i12 & 65536;
                    if (i34 != 0) {
                        i30 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                    }
                    if ((i12 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                    }
                    i35 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f15 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f15, f15, f15, f15);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f16 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f16, f16, f16, f16);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i316 = i35 << 3;
                        int i317 = i35 >> 3;
                        int i318 = i35 >> 9;
                        int i43 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i316 & 896) | (i316 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i317 & 7168) | (57344 & i318) | (458752 & i318) | (3670016 & i318) | (29360128 & i43) | (234881024 & i43) | (i43 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i318 & 7168) | (57344 & i317) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f17 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f17, f17, f17, f17);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f18 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f18, f18, f18, f18);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i319 = i35 << 3;
                        int i3110 = i35 >> 3;
                        int i3111 = i35 >> 9;
                        int i44 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i319 & 896) | (i319 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3110 & 7168) | (57344 & i3111) | (458752 & i3111) | (3670016 & i3111) | (29360128 & i44) | (234881024 & i44) | (i44 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111 & 7168) | (57344 & i3110) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 3072;
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f19 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f19, f19, f19, f19);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f110 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f110, f110, f110, f110);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i3112 = i35 << 3;
                    int i3113 = i35 >> 3;
                    int i3114 = i35 >> 9;
                    int i45 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3112 & 896) | (i3112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3113 & 7168) | (57344 & i3114) | (458752 & i3114) | (3670016 & i3114) | (29360128 & i45) | (234881024 & i45) | (i45 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3114 & 7168) | (57344 & i3113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111, f111, f111, f111);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f112 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f112, f112, f112, f112);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i3115 = i35 << 3;
                    int i3116 = i35 >> 3;
                    int i3117 = i35 >> 9;
                    int i46 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3115 & 896) | (i3115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3116 & 7168) | (57344 & i3117) | (458752 & i3117) | (3670016 & i3117) | (29360128 & i46) | (234881024 & i46) | (i46 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3117 & 7168) | (57344 & i3116) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(pVar6)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i31 = i12 & 4096;
            if (i31 != 0) {
                if ((i11 & 384) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    if ((i11 & 3072) == 0) {
                        i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i14 = 16384;
                        }
                        i30 |= i14;
                    }
                    if ((i11 & 196608) != 0) {
                        if ((i12 & 32768) == 0) {
                            i36 = 65536;
                        } else {
                            i36 = 65536;
                        }
                        i30 |= i36;
                    }
                    i34 = i12 & 65536;
                    if (i34 != 0) {
                        i30 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                    }
                    if ((i12 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                    }
                    i35 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f113 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f113, f113, f113, f113);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f114 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f114, f114, f114, f114);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i3118 = i35 << 3;
                        int i3119 = i35 >> 3;
                        int i31110 = i35 >> 9;
                        int i47 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3118 & 896) | (i3118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3119 & 7168) | (57344 & i31110) | (458752 & i31110) | (3670016 & i31110) | (29360128 & i47) | (234881024 & i47) | (i47 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31110 & 7168) | (57344 & i3119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f115 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f115, f115, f115, f115);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f116 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f116, f116, f116, f116);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i31111 = i35 << 3;
                        int i31112 = i35 >> 3;
                        int i31113 = i35 >> 9;
                        int i48 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111 & 896) | (i31111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31112 & 7168) | (57344 & i31113) | (458752 & i31113) | (3670016 & i31113) | (29360128 & i48) | (234881024 & i48) | (i48 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31113 & 7168) | (57344 & i31112) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 3072;
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f117 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f117, f117, f117, f117);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f118 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f118, f118, f118, f118);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i31114 = i35 << 3;
                    int i31115 = i35 >> 3;
                    int i31116 = i35 >> 9;
                    int i49 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31114 & 896) | (i31114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31115 & 7168) | (57344 & i31116) | (458752 & i31116) | (3670016 & i31116) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31116 & 7168) | (57344 & i31115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f119 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f119, f119, f119, f119);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f1110 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f1110, f1110, f1110, f1110);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i31117 = i35 << 3;
                    int i31118 = i35 >> 3;
                    int i31119 = i35 >> 9;
                    int i410 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31117 & 896) | (i31117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31118 & 7168) | (57344 & i31119) | (458752 & i31119) | (3670016 & i31119) | (29360128 & i410) | (234881024 & i410) | (i410 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31119 & 7168) | (57344 & i31118) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 384;
            i33 = i12 & 8192;
            if (i33 != 0) {
                if ((i11 & 3072) == 0) {
                    i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f1111 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f1111, f1111, f1111, f1111);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f1112 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f1112, f1112, f1112, f1112);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i311110 = i35 << 3;
                    int i311111 = i35 >> 3;
                    int i311112 = i35 >> 9;
                    int i411 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311110 & 896) | (i311110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111 & 7168) | (57344 & i311112) | (458752 & i311112) | (3670016 & i311112) | (29360128 & i411) | (234881024 & i411) | (i411 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311112 & 7168) | (57344 & i311111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f1113 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f1113, f1113, f1113, f1113);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f1114 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f1114, f1114, f1114, f1114);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i311113 = i35 << 3;
                    int i311114 = i35 >> 3;
                    int i311115 = i35 >> 9;
                    int i412 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311113 & 896) | (i311113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311114 & 7168) | (57344 & i311115) | (458752 & i311115) | (3670016 & i311115) | (29360128 & i412) | (234881024 & i412) | (i412 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311115 & 7168) | (57344 & i311114) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 3072;
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i14 = 16384;
                }
                i30 |= i14;
            }
            if ((i11 & 196608) != 0) {
                if ((i12 & 32768) == 0) {
                    i36 = 65536;
                } else {
                    i36 = 65536;
                }
                i30 |= i36;
            }
            i34 = i12 & 65536;
            if (i34 != 0) {
                i30 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
            }
            if ((i12 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i30 |= c1086gP.K(this) ? 8388608 : 4194304;
            }
            i35 = i13;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1115 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1115, f1115, f1115, f1115);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1116 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1116, f1116, f1116, f1116);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i311116 = i35 << 3;
                int i311117 = i35 >> 3;
                int i311118 = i35 >> 9;
                int i413 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311116 & 896) | (i311116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311117 & 7168) | (57344 & i311118) | (458752 & i311118) | (3670016 & i311118) | (29360128 & i413) | (234881024 & i413) | (i413 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311118 & 7168) | (57344 & i311117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1117 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1117, f1117, f1117, f1117);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1118 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1118, f1118, f1118, f1118);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i311119 = i35 << 3;
                int i3111110 = i35 >> 3;
                int i3111111 = i35 >> 9;
                int i414 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311119 & 896) | (i311119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111110 & 7168) | (57344 & i3111111) | (458752 & i3111111) | (3670016 & i3111111) | (29360128 & i414) | (234881024 & i414) | (i414 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111111 & 7168) | (57344 & i3111110) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        i14 = 8192;
        if ((i12 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.K(e10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(pVar6)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i31 = i12 & 4096;
            if (i31 != 0) {
                if ((i11 & 384) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    if ((i11 & 3072) == 0) {
                        i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i14 = 16384;
                        }
                        i30 |= i14;
                    }
                    if ((i11 & 196608) != 0) {
                        if ((i12 & 32768) == 0) {
                            i36 = 65536;
                        } else {
                            i36 = 65536;
                        }
                        i30 |= i36;
                    }
                    i34 = i12 & 65536;
                    if (i34 != 0) {
                        i30 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                    }
                    if ((i12 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                    }
                    i35 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f1119 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f1119, f1119, f1119, f1119);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f11110 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f11110, f11110, f11110, f11110);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i3111112 = i35 << 3;
                        int i3111113 = i35 >> 3;
                        int i3111114 = i35 >> 9;
                        int i415 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111112 & 896) | (i3111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111113 & 7168) | (57344 & i3111114) | (458752 & i3111114) | (3670016 & i3111114) | (29360128 & i415) | (234881024 & i415) | (i415 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111114 & 7168) | (57344 & i3111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f11111 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f11111, f11111, f11111, f11111);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i21 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i23 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i25 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar5;
                            }
                            if (i28 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar6;
                            }
                            if (i31 != 0) {
                                pVar15 = null;
                            } else {
                                pVar15 = pVar7;
                            }
                            if (i33 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                textFieldColorsC = textFieldColors;
                            }
                            pVar16 = pVar12;
                            if ((i12 & 32768) != 0) {
                                float f11112 = TextFieldImplKt.f12498b;
                                n10 = new androidx.compose.foundation.layout.N(f11112, f11112, f11112, f11112);
                                i30 = (-458753) & i30;
                            } else {
                                n10 = l10;
                            }
                            if (i34 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                pVarB = pVar9;
                            }
                            l11 = n10;
                            pVar17 = pVar14;
                            pVar18 = pVar10;
                            pVar19 = pVar11;
                            pVar20 = pVar15;
                            textFieldColors2 = textFieldColorsC;
                            pVar21 = pVar30;
                            z14 = z13;
                        }
                        c1086gP.U();
                        int i3111115 = i35 << 3;
                        int i3111116 = i35 >> 3;
                        int i3111117 = i35 >> 9;
                        int i416 = i30 << 21;
                        c1086g = c1086gP;
                        TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111115 & 896) | (i3111115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111116 & 7168) | (57344 & i3111117) | (458752 & i3111117) | (3670016 & i3111117) | (29360128 & i416) | (234881024 & i416) | (i416 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111117 & 7168) | (57344 & i3111116) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        z15 = z14;
                        pVar22 = pVar18;
                        pVar23 = pVar19;
                        pVar24 = pVar16;
                        pVar25 = pVar13;
                        pVar26 = pVar17;
                        pVar27 = pVar20;
                        pVar28 = pVar21;
                        textFieldColors3 = textFieldColors2;
                        l12 = l11;
                        pVar29 = pVarB;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 3072;
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11113 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11113, f11113, f11113, f11113);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11114 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11114, f11114, f11114, f11114);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i3111118 = i35 << 3;
                    int i3111119 = i35 >> 3;
                    int i31111110 = i35 >> 9;
                    int i417 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111118 & 896) | (i3111118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111119 & 7168) | (57344 & i31111110) | (458752 & i31111110) | (3670016 & i31111110) | (29360128 & i417) | (234881024 & i417) | (i417 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111110 & 7168) | (57344 & i3111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11115 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11115, f11115, f11115, f11115);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11116 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11116, f11116, f11116, f11116);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i31111111 = i35 << 3;
                    int i31111112 = i35 >> 3;
                    int i31111113 = i35 >> 9;
                    int i418 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111111 & 896) | (i31111111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111112 & 7168) | (57344 & i31111113) | (458752 & i31111113) | (3670016 & i31111113) | (29360128 & i418) | (234881024 & i418) | (i418 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111113 & 7168) | (57344 & i31111112) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 384;
            i33 = i12 & 8192;
            if (i33 != 0) {
                if ((i11 & 3072) == 0) {
                    i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11117 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11117, f11117, f11117, f11117);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11118 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11118, f11118, f11118, f11118);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i31111114 = i35 << 3;
                    int i31111115 = i35 >> 3;
                    int i31111116 = i35 >> 9;
                    int i419 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111114 & 896) | (i31111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111115 & 7168) | (57344 & i31111116) | (458752 & i31111116) | (3670016 & i31111116) | (29360128 & i419) | (234881024 & i419) | (i419 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111116 & 7168) | (57344 & i31111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f11119 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f11119, f11119, f11119, f11119);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111110 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111110, f111110, f111110, f111110);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i31111117 = i35 << 3;
                    int i31111118 = i35 >> 3;
                    int i31111119 = i35 >> 9;
                    int i4110 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111117 & 896) | (i31111117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111118 & 7168) | (57344 & i31111119) | (458752 & i31111119) | (3670016 & i31111119) | (29360128 & i4110) | (234881024 & i4110) | (i4110 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111119 & 7168) | (57344 & i31111118) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 3072;
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i14 = 16384;
                }
                i30 |= i14;
            }
            if ((i11 & 196608) != 0) {
                if ((i12 & 32768) == 0) {
                    i36 = 65536;
                } else {
                    i36 = 65536;
                }
                i30 |= i36;
            }
            i34 = i12 & 65536;
            if (i34 != 0) {
                i30 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
            }
            if ((i12 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i30 |= c1086gP.K(this) ? 8388608 : 4194304;
            }
            i35 = i13;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f111111 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f111111, f111111, f111111, f111111);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f111112 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f111112, f111112, f111112, f111112);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i311111110 = i35 << 3;
                int i311111111 = i35 >> 3;
                int i311111112 = i35 >> 9;
                int i4111 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311111110 & 896) | (i311111110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111111 & 7168) | (57344 & i311111112) | (458752 & i311111112) | (3670016 & i311111112) | (29360128 & i4111) | (234881024 & i4111) | (i4111 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311111112 & 7168) | (57344 & i311111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f111113 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f111113, f111113, f111113, f111113);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f111114 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f111114, f111114, f111114, f111114);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i311111113 = i35 << 3;
                int i311111114 = i35 >> 3;
                int i311111115 = i35 >> 9;
                int i4112 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311111113 & 896) | (i311111113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111114 & 7168) | (57344 & i311111115) | (458752 & i311111115) | (3670016 & i311111115) | (29360128 & i4112) | (234881024 & i4112) | (i4112 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311111115 & 7168) | (57344 & i311111114) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(jVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i13 |= i16;
        }
        i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.c(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.k(pVar2)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.k(pVar3)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(pVar4)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.k(pVar5)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        i28 = i12 & 2048;
        if (i28 != 0) {
            i26 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c1086gP.k(pVar6)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i26 |= i29;
        }
        i30 = i26;
        i31 = i12 & 4096;
        if (i31 != 0) {
            if ((i11 & 384) == 0) {
                if (c1086gP.k(pVar7)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                if ((i11 & 3072) == 0) {
                    i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i14 = 16384;
                    }
                    i30 |= i14;
                }
                if ((i11 & 196608) != 0) {
                    if ((i12 & 32768) == 0) {
                        i36 = 65536;
                    } else {
                        i36 = 65536;
                    }
                    i30 |= i36;
                }
                i34 = i12 & 65536;
                if (i34 != 0) {
                    i30 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
                }
                if ((i12 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i30 |= c1086gP.K(this) ? 8388608 : 4194304;
                }
                i35 = i13;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111115 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111115, f111115, f111115, f111115);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111116 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111116, f111116, f111116, f111116);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i311111116 = i35 << 3;
                    int i311111117 = i35 >> 3;
                    int i311111118 = i35 >> 9;
                    int i4113 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311111116 & 896) | (i311111116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111117 & 7168) | (57344 & i311111118) | (458752 & i311111118) | (3670016 & i311111118) | (29360128 & i4113) | (234881024 & i4113) | (i4113 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i311111118 & 7168) | (57344 & i311111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111117 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111117, f111117, f111117, f111117);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i21 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i23 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i25 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar5;
                        }
                        if (i28 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar6;
                        }
                        if (i31 != 0) {
                            pVar15 = null;
                        } else {
                            pVar15 = pVar7;
                        }
                        if (i33 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            textFieldColorsC = textFieldColors;
                        }
                        pVar16 = pVar12;
                        if ((i12 & 32768) != 0) {
                            float f111118 = TextFieldImplKt.f12498b;
                            n10 = new androidx.compose.foundation.layout.N(f111118, f111118, f111118, f111118);
                            i30 = (-458753) & i30;
                        } else {
                            n10 = l10;
                        }
                        if (i34 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            pVarB = pVar9;
                        }
                        l11 = n10;
                        pVar17 = pVar14;
                        pVar18 = pVar10;
                        pVar19 = pVar11;
                        pVar20 = pVar15;
                        textFieldColors2 = textFieldColorsC;
                        pVar21 = pVar30;
                        z14 = z13;
                    }
                    c1086gP.U();
                    int i311111119 = i35 << 3;
                    int i3111111110 = i35 >> 3;
                    int i3111111111 = i35 >> 9;
                    int i4114 = i30 << 21;
                    c1086g = c1086gP;
                    TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i311111119 & 896) | (i311111119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111110 & 7168) | (57344 & i3111111111) | (458752 & i3111111111) | (3670016 & i3111111111) | (29360128 & i4114) | (234881024 & i4114) | (i4114 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111111111 & 7168) | (57344 & i3111111110) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    z15 = z14;
                    pVar22 = pVar18;
                    pVar23 = pVar19;
                    pVar24 = pVar16;
                    pVar25 = pVar13;
                    pVar26 = pVar17;
                    pVar27 = pVar20;
                    pVar28 = pVar21;
                    textFieldColors3 = textFieldColors2;
                    l12 = l11;
                    pVar29 = pVarB;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 3072;
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i14 = 16384;
                }
                i30 |= i14;
            }
            if ((i11 & 196608) != 0) {
                if ((i12 & 32768) == 0) {
                    i36 = 65536;
                } else {
                    i36 = 65536;
                }
                i30 |= i36;
            }
            i34 = i12 & 65536;
            if (i34 != 0) {
                i30 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
            }
            if ((i12 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i30 |= c1086gP.K(this) ? 8388608 : 4194304;
            }
            i35 = i13;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f111119 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f111119, f111119, f111119, f111119);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111110 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111110, f1111110, f1111110, f1111110);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i3111111112 = i35 << 3;
                int i3111111113 = i35 >> 3;
                int i3111111114 = i35 >> 9;
                int i4115 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111111112 & 896) | (i3111111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111113 & 7168) | (57344 & i3111111114) | (458752 & i3111111114) | (3670016 & i3111111114) | (29360128 & i4115) | (234881024 & i4115) | (i4115 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111111114 & 7168) | (57344 & i3111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111111 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111111, f1111111, f1111111, f1111111);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111112 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111112, f1111112, f1111112, f1111112);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i3111111115 = i35 << 3;
                int i3111111116 = i35 >> 3;
                int i3111111117 = i35 >> 9;
                int i4116 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111111115 & 896) | (i3111111115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111116 & 7168) | (57344 & i3111111117) | (458752 & i3111111117) | (3670016 & i3111111117) | (29360128 & i4116) | (234881024 & i4116) | (i4116 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3111111117 & 7168) | (57344 & i3111111116) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i30 |= 384;
        i33 = i12 & 8192;
        if (i33 != 0) {
            if ((i11 & 3072) == 0) {
                i30 |= c1086gP.k(pVar8) ? 2048 : 1024;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i14 = 16384;
                }
                i30 |= i14;
            }
            if ((i11 & 196608) != 0) {
                if ((i12 & 32768) == 0) {
                    i36 = 65536;
                } else {
                    i36 = 65536;
                }
                i30 |= i36;
            }
            i34 = i12 & 65536;
            if (i34 != 0) {
                i30 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
            }
            if ((i12 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i30 |= c1086gP.K(this) ? 8388608 : 4194304;
            }
            i35 = i13;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111113 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111113, f1111113, f1111113, f1111113);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111114 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111114, f1111114, f1111114, f1111114);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i3111111118 = i35 << 3;
                int i3111111119 = i35 >> 3;
                int i31111111110 = i35 >> 9;
                int i4117 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i3111111118 & 896) | (i3111111118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111119 & 7168) | (57344 & i31111111110) | (458752 & i31111111110) | (3670016 & i31111111110) | (29360128 & i4117) | (234881024 & i4117) | (i4117 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111111110 & 7168) | (57344 & i3111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111115 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111115, f1111115, f1111115, f1111115);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i21 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i23 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i25 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar5;
                    }
                    if (i28 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar6;
                    }
                    if (i31 != 0) {
                        pVar15 = null;
                    } else {
                        pVar15 = pVar7;
                    }
                    if (i33 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        textFieldColorsC = textFieldColors;
                    }
                    pVar16 = pVar12;
                    if ((i12 & 32768) != 0) {
                        float f1111116 = TextFieldImplKt.f12498b;
                        n10 = new androidx.compose.foundation.layout.N(f1111116, f1111116, f1111116, f1111116);
                        i30 = (-458753) & i30;
                    } else {
                        n10 = l10;
                    }
                    if (i34 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        pVarB = pVar9;
                    }
                    l11 = n10;
                    pVar17 = pVar14;
                    pVar18 = pVar10;
                    pVar19 = pVar11;
                    pVar20 = pVar15;
                    textFieldColors2 = textFieldColorsC;
                    pVar21 = pVar30;
                    z14 = z13;
                }
                c1086gP.U();
                int i31111111111 = i35 << 3;
                int i31111111112 = i35 >> 3;
                int i31111111113 = i35 >> 9;
                int i4118 = i30 << 21;
                c1086g = c1086gP;
                TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111111111 & 896) | (i31111111111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111112 & 7168) | (57344 & i31111111113) | (458752 & i31111111113) | (3670016 & i31111111113) | (29360128 & i4118) | (234881024 & i4118) | (i4118 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111111113 & 7168) | (57344 & i31111111112) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                z15 = z14;
                pVar22 = pVar18;
                pVar23 = pVar19;
                pVar24 = pVar16;
                pVar25 = pVar13;
                pVar26 = pVar17;
                pVar27 = pVar20;
                pVar28 = pVar21;
                textFieldColors3 = textFieldColors2;
                l12 = l11;
                pVar29 = pVarB;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i30 |= 3072;
        if ((i11 & 24576) != 0) {
            if ((i12 & 16384) == 0) {
                i14 = 16384;
            }
            i30 |= i14;
        }
        if ((i11 & 196608) != 0) {
            if ((i12 & 32768) == 0) {
                i36 = 65536;
            } else {
                i36 = 65536;
            }
            i30 |= i36;
        }
        i34 = i12 & 65536;
        if (i34 != 0) {
            i30 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i30 |= c1086gP.k(pVar9) ? 1048576 : 524288;
        }
        if ((i12 & 131072) != 0) {
            i30 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i30 |= c1086gP.K(this) ? 8388608 : 4194304;
        }
        i35 = i13;
        if ((i13 & 306783379) != 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i21 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i23 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if (i28 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar6;
                }
                if (i31 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar7;
                }
                if (i33 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors;
                }
                pVar16 = pVar12;
                if ((i12 & 32768) != 0) {
                    float f1111117 = TextFieldImplKt.f12498b;
                    n10 = new androidx.compose.foundation.layout.N(f1111117, f1111117, f1111117, f1111117);
                    i30 = (-458753) & i30;
                } else {
                    n10 = l10;
                }
                if (i34 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    pVarB = pVar9;
                }
                l11 = n10;
                pVar17 = pVar14;
                pVar18 = pVar10;
                pVar19 = pVar11;
                pVar20 = pVar15;
                textFieldColors2 = textFieldColorsC;
                pVar21 = pVar30;
                z14 = z13;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i21 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i23 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if (i28 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar6;
                }
                if (i31 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar7;
                }
                if (i33 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors;
                }
                pVar16 = pVar12;
                if ((i12 & 32768) != 0) {
                    float f1111118 = TextFieldImplKt.f12498b;
                    n10 = new androidx.compose.foundation.layout.N(f1111118, f1111118, f1111118, f1111118);
                    i30 = (-458753) & i30;
                } else {
                    n10 = l10;
                }
                if (i34 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    pVarB = pVar9;
                }
                l11 = n10;
                pVar17 = pVar14;
                pVar18 = pVar10;
                pVar19 = pVar11;
                pVar20 = pVar15;
                textFieldColors2 = textFieldColorsC;
                pVar21 = pVar30;
                z14 = z13;
            }
            c1086gP.U();
            int i31111111114 = i35 << 3;
            int i31111111115 = i35 >> 3;
            int i31111111116 = i35 >> 9;
            int i4119 = i30 << 21;
            c1086g = c1086gP;
            TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111111114 & 896) | (i31111111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111115 & 7168) | (57344 & i31111111116) | (458752 & i31111111116) | (3670016 & i31111111116) | (29360128 & i4119) | (234881024 & i4119) | (i4119 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111111116 & 7168) | (57344 & i31111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
            z15 = z14;
            pVar22 = pVar18;
            pVar23 = pVar19;
            pVar24 = pVar16;
            pVar25 = pVar13;
            pVar26 = pVar17;
            pVar27 = pVar20;
            pVar28 = pVar21;
            textFieldColors3 = textFieldColors2;
            l12 = l11;
            pVar29 = pVarB;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i21 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i23 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if (i28 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar6;
                }
                if (i31 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar7;
                }
                if (i33 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors;
                }
                pVar16 = pVar12;
                if ((i12 & 32768) != 0) {
                    float f1111119 = TextFieldImplKt.f12498b;
                    n10 = new androidx.compose.foundation.layout.N(f1111119, f1111119, f1111119, f1111119);
                    i30 = (-458753) & i30;
                } else {
                    n10 = l10;
                }
                if (i34 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    pVarB = pVar9;
                }
                l11 = n10;
                pVar17 = pVar14;
                pVar18 = pVar10;
                pVar19 = pVar11;
                pVar20 = pVar15;
                textFieldColors2 = textFieldColorsC;
                pVar21 = pVar30;
                z14 = z13;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i21 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i23 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i25 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar5;
                }
                if (i28 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar6;
                }
                if (i31 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar7;
                }
                if (i33 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsC = c(c1086gP, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    textFieldColorsC = textFieldColors;
                }
                pVar16 = pVar12;
                if ((i12 & 32768) != 0) {
                    float f11111110 = TextFieldImplKt.f12498b;
                    n10 = new androidx.compose.foundation.layout.N(f11111110, f11111110, f11111110, f11111110);
                    i30 = (-458753) & i30;
                } else {
                    n10 = l10;
                }
                if (i34 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1448570018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                OutlinedTextFieldDefaults.f12253a.a(z10, z13, jVar, androidx.compose.ui.h.a.f13984b, textFieldColorsC, ShapesKt.a(ShapeKeyTokens.f12736d, interfaceC1084f3), OutlinedTextFieldDefaults.f12257e, OutlinedTextFieldDefaults.f12256d, interfaceC1084f3, 114822144, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    pVarB = pVar9;
                }
                l11 = n10;
                pVar17 = pVar14;
                pVar18 = pVar10;
                pVar19 = pVar11;
                pVar20 = pVar15;
                textFieldColors2 = textFieldColorsC;
                pVar21 = pVar30;
                z14 = z13;
            }
            c1086gP.U();
            int i31111111117 = i35 << 3;
            int i31111111118 = i35 >> 3;
            int i31111111119 = i35 >> 9;
            int i41110 = i30 << 21;
            c1086g = c1086gP;
            TextFieldImplKt.a(TextFieldType.f12513c, str, pVar, e10, pVar18, pVar19, pVar16, pVar13, pVar17, pVar20, pVar21, z11, z10, z14, jVar, l11, textFieldColors2, pVarB, c1086g, (i31111111117 & 896) | (i31111111117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111118 & 7168) | (57344 & i31111111119) | (458752 & i31111111119) | (3670016 & i31111111119) | (29360128 & i41110) | (234881024 & i41110) | (i41110 & 1879048192), (i35 & 896) | ((i30 >> 9) & 14) | ((i35 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i31111111119 & 7168) | (57344 & i31111111118) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
            z15 = z14;
            pVar22 = pVar18;
            pVar23 = pVar19;
            pVar24 = pVar16;
            pVar25 = pVar13;
            pVar26 = pVar17;
            pVar27 = pVar20;
            pVar28 = pVar21;
            textFieldColors3 = textFieldColors2;
            l12 = l11;
            pVar29 = pVarB;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.b(str, pVar, z10, z11, e10, jVar, z15, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, textFieldColors3, l12, pVar29, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
