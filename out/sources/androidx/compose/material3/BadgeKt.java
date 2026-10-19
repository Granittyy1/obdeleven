package androidx.compose.material3;

import B.C0606a;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BadgeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12051a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12052b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12053c = 14;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12054d = 6;

    /* JADX WARN: Code duplicated, block: B:100:0x019b  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x0136  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    public static final void a(androidx.compose.ui.h hVar, long j, long j10, Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long jD;
        long jB;
        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2;
        int i13;
        androidx.compose.ui.h hVarH;
        float f10;
        ShapeKeyTokens shapeKeyTokens;
        androidx.compose.ui.graphics.l0 l0VarA;
        int i14;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        final long j11;
        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1298144073);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                jD = j;
                int i16 = c1086gP.i(jD) ? 32 : 16;
                i12 |= i16;
            } else {
                jD = j;
            }
            i12 |= i16;
        } else {
            jD = j;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                jB = j10;
                int i17 = c1086gP.i(jB) ? 256 : 128;
                i12 |= i17;
            } else {
                jB = j10;
            }
            i12 |= i17;
        } else {
            jB = j10;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 3072) == 0) {
                qVar2 = qVar;
                i12 |= c1086gP.k(qVar2) ? 2048 : 1024;
            }
            if ((i12 & 1171) == 1170 || !c1086gP.s()) {
                c1086gP.r0();
                i13 = i10 & 1;
                hVarH = androidx.compose.ui.h.a.f13984b;
                if (i13 != 0 || c1086gP.a0()) {
                    if (i15 != 0) {
                        hVar2 = hVarH;
                    }
                    if ((i11 & 2) != 0) {
                        float f11 = C0606a.f1168a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12710b, c1086gP);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(jD, c1086gP);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        qVar2 = null;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                c1086gP.U();
                if (qVar2 != null) {
                    f10 = C0606a.f1168a;
                } else {
                    f10 = C0606a.f1169b;
                }
                shapeKeyTokens = ShapeKeyTokens.f12738f;
                if (qVar2 != null) {
                    c1086gP.L(-1271801170);
                    l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1271743789);
                    l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.foundation.layout.W.a(f10, f10, hVar2), jD, l0VarA);
                if (qVar2 != null) {
                    hVarH = PaddingKt.h(hVarH, f12051a, 0.0f, 2);
                }
                androidx.compose.ui.h hVarI = hVarB.i(hVarH);
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c1086gP.L(-1705294841);
                if (qVar2 != null) {
                    ProvideContentColorTextStyleKt.a(jB, TypographyKt.a(TypographyKeyTokens.f12748h, c1086gP), androidx.compose.runtime.internal.a.b(719214594, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                        final /* synthetic */ androidx.compose.foundation.layout.U $this_Row = androidx.compose.foundation.layout.V.f10222a;

                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                qVar2.invoke(this.$this_Row, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, ((i12 >> 6) & 14) | 384);
                }
                c1086gP.T(false);
                c1086gP.T(true);
            } else {
                c1086gP.w();
            }
            j11 = jD;
            qVar3 = qVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar3 = hVar2;
                final long j12 = jB;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        BadgeKt.a(hVar3, j11, j12, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        qVar2 = qVar;
        if ((i12 & 1171) == 1170) {
            c1086gP.r0();
            i13 = i10 & 1;
            hVarH = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i15 != 0) {
                    hVar2 = hVarH;
                }
                if ((i11 & 2) != 0) {
                    float f12 = C0606a.f1168a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12710b, c1086gP);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(jD, c1086gP);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = hVarH;
                }
                if ((i11 & 2) != 0) {
                    float f13 = C0606a.f1168a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12710b, c1086gP);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(jD, c1086gP);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
            }
            c1086gP.U();
            if (qVar2 != null) {
                f10 = C0606a.f1168a;
            } else {
                f10 = C0606a.f1169b;
            }
            shapeKeyTokens = ShapeKeyTokens.f12738f;
            if (qVar2 != null) {
                c1086gP.L(-1271801170);
                l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1271743789);
                l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVarB2 = C0932d.b(androidx.compose.foundation.layout.W.a(f10, f10, hVar2), jD, l0VarA);
            if (qVar2 != null) {
                hVarH = PaddingKt.h(hVarH, f12051a, 0.0f, 2);
            }
            androidx.compose.ui.h hVarI2 = hVarB2.i(hVarH);
            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI2);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c1086gP.L(-1705294841);
            if (qVar2 != null) {
                ProvideContentColorTextStyleKt.a(jB, TypographyKt.a(TypographyKeyTokens.f12748h, c1086gP), androidx.compose.runtime.internal.a.b(719214594, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                    final /* synthetic */ androidx.compose.foundation.layout.U $this_Row = androidx.compose.foundation.layout.V.f10222a;

                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            qVar2.invoke(this.$this_Row, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i12 >> 6) & 14) | 384);
            }
            c1086gP.T(false);
            c1086gP.T(true);
        } else {
            c1086gP.r0();
            i13 = i10 & 1;
            hVarH = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i15 != 0) {
                    hVar2 = hVarH;
                }
                if ((i11 & 2) != 0) {
                    float f14 = C0606a.f1168a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12710b, c1086gP);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(jD, c1086gP);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = hVarH;
                }
                if ((i11 & 2) != 0) {
                    float f15 = C0606a.f1168a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12710b, c1086gP);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(jD, c1086gP);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
            }
            c1086gP.U();
            if (qVar2 != null) {
                f10 = C0606a.f1168a;
            } else {
                f10 = C0606a.f1169b;
            }
            shapeKeyTokens = ShapeKeyTokens.f12738f;
            if (qVar2 != null) {
                c1086gP.L(-1271801170);
                l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1271743789);
                l0VarA = ShapesKt.a(shapeKeyTokens, c1086gP);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVarB3 = C0932d.b(androidx.compose.foundation.layout.W.a(f10, f10, hVar2), jD, l0VarA);
            if (qVar2 != null) {
                hVarH = PaddingKt.h(hVarH, f12051a, 0.0f, 2);
            }
            androidx.compose.ui.h hVarI3 = hVarB3.i(hVarH);
            androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            c1086gP.L(-1705294841);
            if (qVar2 != null) {
                ProvideContentColorTextStyleKt.a(jB, TypographyKt.a(TypographyKeyTokens.f12748h, c1086gP), androidx.compose.runtime.internal.a.b(719214594, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                    final /* synthetic */ androidx.compose.foundation.layout.U $this_Row = androidx.compose.foundation.layout.V.f10222a;

                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            qVar2.invoke(this.$this_Row, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i12 >> 6) & 14) | 384);
            }
            c1086gP.T(false);
            c1086gP.T(true);
        }
        j11 = jD;
        qVar3 = qVar2;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar4 = hVar2;
            final long j13 = jB;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BadgeKt.a(hVar4, j11, j13, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x010a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void b(final Ia.q<? super InterfaceC0948h, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, androidx.compose.ui.h hVar, final Ia.q<? super InterfaceC0948h, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        androidx.compose.ui.h.a aVar;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final androidx.compose.runtime.U u10;
        Object objF2;
        final androidx.compose.runtime.U u11;
        Object objF3;
        final androidx.compose.runtime.U u12;
        Object objF4;
        final androidx.compose.runtime.U u13;
        Object objF5;
        Object objF6;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        int i15;
        int i16;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1404022535);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(qVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i17 != 0) {
                    hVar2 = aVar;
                }
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new C1079c0(0.0f);
                    c1086gP.E(objF);
                }
                u10 = (androidx.compose.runtime.U) objF;
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new C1079c0(0.0f);
                    c1086gP.E(objF2);
                }
                u11 = (androidx.compose.runtime.U) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new C1079c0(Float.POSITIVE_INFINITY);
                    c1086gP.E(objF3);
                }
                u12 = (androidx.compose.runtime.U) objF3;
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    objF4 = new C1079c0(Float.NEGATIVE_INFINITY);
                    c1086gP.E(objF4);
                }
                u13 = (androidx.compose.runtime.U) objF4;
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = new Ia.l<InterfaceC1170p, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(InterfaceC1170p interfaceC1170p) {
                            InterfaceC1170p interfaceC1170pX;
                            InterfaceC1170p interfaceC1170p2 = interfaceC1170p;
                            I.f fVarC = kotlin.jvm.internal.n.c(interfaceC1170p2);
                            androidx.compose.runtime.U u14 = u10;
                            float f10 = BadgeKt.f12051a;
                            u14.f(fVarC.f3757a);
                            u11.f(fVarC.f3758b);
                            InterfaceC1170p interfaceC1170pX2 = interfaceC1170p2.X();
                            InterfaceC1170p interfaceC1170pD = (interfaceC1170pX2 == null || (interfaceC1170pX = interfaceC1170pX2.X()) == null) ? null : interfaceC1170pX.D();
                            if (interfaceC1170pD != null) {
                                androidx.compose.runtime.U u15 = u12;
                                androidx.compose.runtime.U u16 = u13;
                                I.f fVarC2 = kotlin.jvm.internal.n.c(interfaceC1170pD);
                                u15.f(fVarC2.f3759c);
                                u16.f(fVarC2.f3758b);
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                }
                androidx.compose.ui.h hVarA = androidx.compose.ui.layout.O.a(hVar2, (Ia.l) objF5);
                objF6 = c1086gP.f();
                if (objF6 == c0153a) {
                    objF6 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                        @Override // androidx.compose.ui.layout.E
                        public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
                            int size = list.size();
                            for (int i18 = 0; i18 < size; i18++) {
                                androidx.compose.ui.layout.D d10 = list.get(i18);
                                if (kotlin.jvm.internal.i.a(C1171q.a(d10), MetricTracker.Object.BADGE)) {
                                    final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.a.a(j, 0, 0, 0, 0, 11));
                                    int size2 = list.size();
                                    for (int i19 = 0; i19 < size2; i19++) {
                                        androidx.compose.ui.layout.D d11 = list.get(i19);
                                        if (kotlin.jvm.internal.i.a(C1171q.a(d11), "anchor")) {
                                            final androidx.compose.ui.layout.Y yQ2 = d11.Q(j);
                                            C1165k c1165k = AlignmentLineKt.f14165a;
                                            int iV = yQ2.V(c1165k);
                                            C1165k c1165k2 = AlignmentLineKt.f14166b;
                                            int iV2 = yQ2.V(c1165k2);
                                            int i20 = yQ2.f14220b;
                                            int i21 = yQ2.f14221c;
                                            Map<AbstractC1155a, Integer> mapS = kotlin.collections.y.s(new Pair(c1165k, Integer.valueOf(iV)), new Pair(c1165k2, Integer.valueOf(iV2)));
                                            final androidx.compose.runtime.U u14 = u11;
                                            final androidx.compose.runtime.U u15 = u10;
                                            final androidx.compose.runtime.U u16 = u12;
                                            final androidx.compose.runtime.U u17 = u13;
                                            return h8.y1(i20, i21, mapS, new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar3) {
                                                    androidx.compose.ui.layout.Y.a aVar4 = aVar3;
                                                    boolean z10 = yQ.f14220b > h8.e1(C0606a.f1169b);
                                                    float f10 = z10 ? BadgeKt.f12052b : BadgeKt.f12054d;
                                                    float f11 = z10 ? BadgeKt.f12053c : BadgeKt.f12054d;
                                                    androidx.compose.ui.layout.Y.a.g(aVar4, yQ2, 0, 0);
                                                    int iE1 = yQ2.f14220b - h8.e1(f10);
                                                    int iE2 = h8.e1(f11) + (-yQ.f14221c);
                                                    float fJ = u14.j() + iE2;
                                                    float fJ2 = u16.j() - ((u15.j() + iE1) + yQ.f14220b);
                                                    float fJ3 = fJ - u17.j();
                                                    if (fJ2 < 0.0f) {
                                                        iE1 += Ka.a.b(fJ2);
                                                    }
                                                    if (fJ3 < 0.0f) {
                                                        iE2 -= Ka.a.b(fJ3);
                                                    }
                                                    androidx.compose.ui.layout.Y.a.g(aVar4, yQ, iE1, iE2);
                                                    return p293xa.r.f47939a;
                                                }
                                            });
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    };
                    c1086gP.E(objF6);
                }
                androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF6;
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar2, c1086gP, e10);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar3, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                androidx.compose.ui.h hVarB = C1171q.b(aVar, "anchor");
                int i18 = ((i12 << 3) & 7168) | 54;
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
                c1086gP.r();
                androidx.compose.ui.h hVar4 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, eD);
                R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                C0949i c0949i = C0949i.f10304a;
                qVar2.invoke(c0949i, c1086gP, Integer.valueOf(((i18 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                c1086gP.T(true);
                androidx.compose.ui.h hVarB2 = C1171q.b(aVar, MetricTracker.Object.BADGE);
                int i19 = ((i12 << 9) & 7168) | 6;
                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, eD2);
                R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(pVar4, c1086gP, hVarC3);
                qVar.invoke(c0949i, c1086gP, Integer.valueOf(((i19 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                c1086gP.T(true);
                c1086gP.T(true);
                hVar3 = hVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        BadgeKt.b(qVar, hVar3, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(qVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar2 = aVar;
            }
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new C1079c0(0.0f);
                c1086gP.E(objF);
            }
            u10 = (androidx.compose.runtime.U) objF;
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new C1079c0(0.0f);
                c1086gP.E(objF2);
            }
            u11 = (androidx.compose.runtime.U) objF2;
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new C1079c0(Float.POSITIVE_INFINITY);
                c1086gP.E(objF3);
            }
            u12 = (androidx.compose.runtime.U) objF3;
            objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new C1079c0(Float.NEGATIVE_INFINITY);
                c1086gP.E(objF4);
            }
            u13 = (androidx.compose.runtime.U) objF4;
            objF5 = c1086gP.f();
            if (objF5 == c0153a) {
                objF5 = new Ia.l<InterfaceC1170p, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC1170p interfaceC1170p) {
                        InterfaceC1170p interfaceC1170pX;
                        InterfaceC1170p interfaceC1170p2 = interfaceC1170p;
                        I.f fVarC = kotlin.jvm.internal.n.c(interfaceC1170p2);
                        androidx.compose.runtime.U u14 = u10;
                        float f10 = BadgeKt.f12051a;
                        u14.f(fVarC.f3757a);
                        u11.f(fVarC.f3758b);
                        InterfaceC1170p interfaceC1170pX2 = interfaceC1170p2.X();
                        InterfaceC1170p interfaceC1170pD = (interfaceC1170pX2 == null || (interfaceC1170pX = interfaceC1170pX2.X()) == null) ? null : interfaceC1170pX.D();
                        if (interfaceC1170pD != null) {
                            androidx.compose.runtime.U u15 = u12;
                            androidx.compose.runtime.U u16 = u13;
                            I.f fVarC2 = kotlin.jvm.internal.n.c(interfaceC1170pD);
                            u15.f(fVarC2.f3759c);
                            u16.f(fVarC2.f3758b);
                        }
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            androidx.compose.ui.h hVarA2 = androidx.compose.ui.layout.O.a(hVar2, (Ia.l) objF5);
            objF6 = c1086gP.f();
            if (objF6 == c0153a) {
                objF6 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
                        int size = list.size();
                        for (int i110 = 0; i110 < size; i110++) {
                            androidx.compose.ui.layout.D d10 = list.get(i110);
                            if (kotlin.jvm.internal.i.a(C1171q.a(d10), MetricTracker.Object.BADGE)) {
                                final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.a.a(j, 0, 0, 0, 0, 11));
                                int size2 = list.size();
                                for (int i111 = 0; i111 < size2; i111++) {
                                    androidx.compose.ui.layout.D d11 = list.get(i111);
                                    if (kotlin.jvm.internal.i.a(C1171q.a(d11), "anchor")) {
                                        final androidx.compose.ui.layout.Y yQ2 = d11.Q(j);
                                        C1165k c1165k = AlignmentLineKt.f14165a;
                                        int iV = yQ2.V(c1165k);
                                        C1165k c1165k2 = AlignmentLineKt.f14166b;
                                        int iV2 = yQ2.V(c1165k2);
                                        int i20 = yQ2.f14220b;
                                        int i21 = yQ2.f14221c;
                                        Map<AbstractC1155a, Integer> mapS = kotlin.collections.y.s(new Pair(c1165k, Integer.valueOf(iV)), new Pair(c1165k2, Integer.valueOf(iV2)));
                                        final androidx.compose.runtime.U u14 = u11;
                                        final androidx.compose.runtime.U u15 = u10;
                                        final androidx.compose.runtime.U u16 = u12;
                                        final androidx.compose.runtime.U u17 = u13;
                                        return h8.y1(i20, i21, mapS, new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar3) {
                                                androidx.compose.ui.layout.Y.a aVar4 = aVar3;
                                                boolean z10 = yQ.f14220b > h8.e1(C0606a.f1169b);
                                                float f10 = z10 ? BadgeKt.f12052b : BadgeKt.f12054d;
                                                float f11 = z10 ? BadgeKt.f12053c : BadgeKt.f12054d;
                                                androidx.compose.ui.layout.Y.a.g(aVar4, yQ2, 0, 0);
                                                int iE1 = yQ2.f14220b - h8.e1(f10);
                                                int iE2 = h8.e1(f11) + (-yQ.f14221c);
                                                float fJ = u14.j() + iE2;
                                                float fJ2 = u16.j() - ((u15.j() + iE1) + yQ.f14220b);
                                                float fJ3 = fJ - u17.j();
                                                if (fJ2 < 0.0f) {
                                                    iE1 += Ka.a.b(fJ2);
                                                }
                                                if (fJ3 < 0.0f) {
                                                    iE2 -= Ka.a.b(fJ3);
                                                }
                                                androidx.compose.ui.layout.Y.a.g(aVar4, yQ, iE1, iE2);
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                c1086gP.E(objF6);
            }
            androidx.compose.ui.layout.E e11 = (androidx.compose.ui.layout.E) objF6;
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, c1086gP, e11);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, c1086gP, interfaceC1089h0P4);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC4);
            androidx.compose.ui.h hVarB3 = C1171q.b(aVar, "anchor");
            int i110 = ((i12 << 3) & 7168) | 54;
            androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarB3);
            c1086gP.r();
            androidx.compose.ui.h hVar5 = hVar2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, eD3);
            R0.a(pVar6, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(pVar7, c1086gP, hVarC5);
            C0949i c0949i2 = C0949i.f10304a;
            qVar2.invoke(c0949i2, c1086gP, Integer.valueOf(((i110 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
            androidx.compose.ui.h hVarB4 = C1171q.b(aVar, MetricTracker.Object.BADGE);
            int i111 = ((i12 << 9) & 7168) | 6;
            androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarB4);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, eD4);
            R0.a(pVar6, c1086gP, interfaceC1089h0P6);
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(pVar7, c1086gP, hVarC6);
            qVar.invoke(c0949i2, c1086gP, Integer.valueOf(((i111 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
            c1086gP.T(true);
            hVar3 = hVar5;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar2 = aVar;
            }
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new C1079c0(0.0f);
                c1086gP.E(objF);
            }
            u10 = (androidx.compose.runtime.U) objF;
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new C1079c0(0.0f);
                c1086gP.E(objF2);
            }
            u11 = (androidx.compose.runtime.U) objF2;
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new C1079c0(Float.POSITIVE_INFINITY);
                c1086gP.E(objF3);
            }
            u12 = (androidx.compose.runtime.U) objF3;
            objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new C1079c0(Float.NEGATIVE_INFINITY);
                c1086gP.E(objF4);
            }
            u13 = (androidx.compose.runtime.U) objF4;
            objF5 = c1086gP.f();
            if (objF5 == c0153a) {
                objF5 = new Ia.l<InterfaceC1170p, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC1170p interfaceC1170p) {
                        InterfaceC1170p interfaceC1170pX;
                        InterfaceC1170p interfaceC1170p2 = interfaceC1170p;
                        I.f fVarC = kotlin.jvm.internal.n.c(interfaceC1170p2);
                        androidx.compose.runtime.U u14 = u10;
                        float f10 = BadgeKt.f12051a;
                        u14.f(fVarC.f3757a);
                        u11.f(fVarC.f3758b);
                        InterfaceC1170p interfaceC1170pX2 = interfaceC1170p2.X();
                        InterfaceC1170p interfaceC1170pD = (interfaceC1170pX2 == null || (interfaceC1170pX = interfaceC1170pX2.X()) == null) ? null : interfaceC1170pX.D();
                        if (interfaceC1170pD != null) {
                            androidx.compose.runtime.U u15 = u12;
                            androidx.compose.runtime.U u16 = u13;
                            I.f fVarC2 = kotlin.jvm.internal.n.c(interfaceC1170pD);
                            u15.f(fVarC2.f3759c);
                            u16.f(fVarC2.f3758b);
                        }
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            androidx.compose.ui.h hVarA3 = androidx.compose.ui.layout.O.a(hVar2, (Ia.l) objF5);
            objF6 = c1086gP.f();
            if (objF6 == c0153a) {
                objF6 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
                        int size = list.size();
                        for (int i112 = 0; i112 < size; i112++) {
                            androidx.compose.ui.layout.D d10 = list.get(i112);
                            if (kotlin.jvm.internal.i.a(C1171q.a(d10), MetricTracker.Object.BADGE)) {
                                final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.a.a(j, 0, 0, 0, 0, 11));
                                int size2 = list.size();
                                for (int i113 = 0; i113 < size2; i113++) {
                                    androidx.compose.ui.layout.D d11 = list.get(i113);
                                    if (kotlin.jvm.internal.i.a(C1171q.a(d11), "anchor")) {
                                        final androidx.compose.ui.layout.Y yQ2 = d11.Q(j);
                                        C1165k c1165k = AlignmentLineKt.f14165a;
                                        int iV = yQ2.V(c1165k);
                                        C1165k c1165k2 = AlignmentLineKt.f14166b;
                                        int iV2 = yQ2.V(c1165k2);
                                        int i20 = yQ2.f14220b;
                                        int i21 = yQ2.f14221c;
                                        Map<AbstractC1155a, Integer> mapS = kotlin.collections.y.s(new Pair(c1165k, Integer.valueOf(iV)), new Pair(c1165k2, Integer.valueOf(iV2)));
                                        final androidx.compose.runtime.U u14 = u11;
                                        final androidx.compose.runtime.U u15 = u10;
                                        final androidx.compose.runtime.U u16 = u12;
                                        final androidx.compose.runtime.U u17 = u13;
                                        return h8.y1(i20, i21, mapS, new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar3) {
                                                androidx.compose.ui.layout.Y.a aVar4 = aVar3;
                                                boolean z10 = yQ.f14220b > h8.e1(C0606a.f1169b);
                                                float f10 = z10 ? BadgeKt.f12052b : BadgeKt.f12054d;
                                                float f11 = z10 ? BadgeKt.f12053c : BadgeKt.f12054d;
                                                androidx.compose.ui.layout.Y.a.g(aVar4, yQ2, 0, 0);
                                                int iE1 = yQ2.f14220b - h8.e1(f10);
                                                int iE2 = h8.e1(f11) + (-yQ.f14221c);
                                                float fJ = u14.j() + iE2;
                                                float fJ2 = u16.j() - ((u15.j() + iE1) + yQ.f14220b);
                                                float fJ3 = fJ - u17.j();
                                                if (fJ2 < 0.0f) {
                                                    iE1 += Ka.a.b(fJ2);
                                                }
                                                if (fJ3 < 0.0f) {
                                                    iE2 -= Ka.a.b(fJ3);
                                                }
                                                androidx.compose.ui.layout.Y.a.g(aVar4, yQ, iE1, iE2);
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                c1086gP.E(objF6);
            }
            androidx.compose.ui.layout.E e12 = (androidx.compose.ui.layout.E) objF6;
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarA3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar8 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar8, c1086gP, e12);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar9 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar9, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar10 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar10, c1086gP, hVarC7);
            androidx.compose.ui.h hVarB5 = C1171q.b(aVar, "anchor");
            int i112 = ((i12 << 3) & 7168) | 54;
            androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarB5);
            c1086gP.r();
            androidx.compose.ui.h hVar6 = hVar2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar8, c1086gP, eD5);
            R0.a(pVar9, c1086gP, interfaceC1089h0P8);
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(pVar10, c1086gP, hVarC8);
            C0949i c0949i3 = C0949i.f10304a;
            qVar2.invoke(c0949i3, c1086gP, Integer.valueOf(((i112 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
            androidx.compose.ui.h hVarB6 = C1171q.b(aVar, MetricTracker.Object.BADGE);
            int i113 = ((i12 << 9) & 7168) | 6;
            androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
            androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarB6);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar8, c1086gP, eD6);
            R0.a(pVar9, c1086gP, interfaceC1089h0P9);
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(pVar10, c1086gP, hVarC9);
            qVar.invoke(c0949i3, c1086gP, Integer.valueOf(((i113 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
            c1086gP.T(true);
            hVar3 = hVar6;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BadgeKt.b(qVar, hVar3, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
