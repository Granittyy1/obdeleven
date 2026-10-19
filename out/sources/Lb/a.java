package Lb;

import I.b;
import Ia.p;
import Q2.C0738o;
import Q2.z;
import android.text.TextUtils;
import androidx.compose.animation.k;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SpacerMeasurePolicy;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;
import kotlin.time.DurationUnit;
import p245u.c;
import p293xa.r;

/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final void a(InterfaceC1084f interfaceC1084f, h hVar) {
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f10214a;
        int iF = interfaceC1084f.F();
        h hVarC = ComposedModifierKt.c(interfaceC1084f, hVar);
        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        if (interfaceC1084f.u() == null) {
            b.k();
            throw null;
        }
        interfaceC1084f.r();
        if (interfaceC1084f.m()) {
            interfaceC1084f.v(aVar);
        } else {
            interfaceC1084f.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, spacerMeasurePolicy);
        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
            k.b(iF, interfaceC1084f, iF, pVar);
        }
        interfaceC1084f.J();
    }

    public static final void b(long j, Orientation orientation) {
        if (orientation == Orientation.f9957b) {
            if (p013b0.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            c.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (p013b0.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            c.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final double c(double d10, DurationUnit durationUnit, DurationUnit targetUnit) {
        i.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.a().convert(1L, durationUnit.a());
        return jConvert > 0 ? d10 * jConvert : d10 / durationUnit.a().convert(1L, targetUnit.a());
    }

    public static final long d(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        i.e(sourceUnit, "sourceUnit");
        i.e(targetUnit, "targetUnit");
        return targetUnit.a().convert(j, sourceUnit.a());
    }

    public static final long e(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        i.e(sourceUnit, "sourceUnit");
        i.e(targetUnit, "targetUnit");
        return targetUnit.a().convert(j, sourceUnit.a());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0103 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[ADDED_TO_REGION] */
    public static final int f(ByteBuffer encodeUTF8, CharSequence text, int i10, int i11, int i12, int i13) {
        char c10;
        short s10;
        short s11;
        short s12;
        int i14;
        int i15;
        int i16;
        int iCharAt;
        int i17;
        int i18;
        int iCharAt2;
        i.e(encodeUTF8, "$this$encodeUTF8");
        i.e(text, "text");
        int iMin = Math.min(i11, i10 + 65535);
        int i19 = i13;
        if (i19 > 65535) {
            i19 = 65535;
        }
        int i20 = i10;
        int i21 = i12;
        while (i21 < i19 && i20 < iMin) {
            int i22 = i20 + 1;
            char cCharAt = text.charAt(i20);
            int i23 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                int i24 = i19 - 3;
                while (true) {
                    c10 = 56320;
                    if (i24 - i21 <= 0 || i20 >= iMin) {
                        break;
                    }
                    int i25 = i20 + 1;
                    char cCharAt2 = text.charAt(i20);
                    if (Character.isHighSurrogate(cCharAt2)) {
                        if (i25 == iMin || !Character.isLowSurrogate(text.charAt(i25))) {
                            i20 = i25;
                            i17 = 63;
                        } else {
                            i20 += 2;
                            iCharAt2 = ((cCharAt2 - 55232) << 10) | (text.charAt(i25) - 56320);
                        }
                        if (i17 < 0 && i17 < 128) {
                            encodeUTF8.put(i21, (byte) i17);
                            i18 = 1;
                        } else if (128 > i17 && i17 < 2048) {
                            encodeUTF8.put(i21, (byte) (((i17 >> 6) & 31) | 192));
                            encodeUTF8.put(i21 + 1, (byte) ((i17 & 63) | 128));
                            i18 = 2;
                        } else if (2048 > i17 && i17 < 65536) {
                            encodeUTF8.put(i21, (byte) (((i17 >> 12) & 15) | 224));
                            encodeUTF8.put(i21 + 1, (byte) (((i17 >> 6) & 63) | 128));
                            encodeUTF8.put(i21 + 2, (byte) ((i17 & 63) | 128));
                            i18 = 3;
                        } else {
                            if (65536 <= i17 || i17 >= 1114112) {
                                j(i17);
                                throw null;
                            }
                            encodeUTF8.put(i21, (byte) (((i17 >> 18) & 7) | 240));
                            encodeUTF8.put(i21 + 1, (byte) (((i17 >> 12) & 63) | 128));
                            encodeUTF8.put(i21 + 2, (byte) (((i17 >> 6) & 63) | 128));
                            encodeUTF8.put(i21 + 3, (byte) ((i17 & 63) | 128));
                            i18 = 4;
                        }
                        i21 += i18;
                    } else {
                        i20 = i25;
                        iCharAt2 = cCharAt2;
                    }
                    i17 = iCharAt2;
                    if (i17 < 0) {
                        if (128 > i17) {
                            if (2048 > i17) {
                                if (65536 <= i17) {
                                }
                                j(i17);
                                throw null;
                            }
                            if (65536 <= i17) {
                            }
                            j(i17);
                            throw null;
                        }
                        if (2048 > i17) {
                            if (65536 <= i17) {
                            }
                            j(i17);
                            throw null;
                        }
                        if (65536 <= i17) {
                        }
                        j(i17);
                        throw null;
                    }
                    if (128 > i17) {
                        if (2048 > i17) {
                            if (65536 <= i17) {
                            }
                            j(i17);
                            throw null;
                        }
                        if (65536 <= i17) {
                        }
                        j(i17);
                        throw null;
                    }
                    if (2048 > i17) {
                        if (65536 <= i17) {
                        }
                        j(i17);
                        throw null;
                    }
                    if (65536 <= i17) {
                    }
                    j(i17);
                    throw null;
                    i21 += i18;
                }
                if (i21 == i24) {
                    while (true) {
                        int i26 = i19 - i21;
                        if (i26 <= 0 || i20 >= iMin) {
                            break;
                        }
                        int i27 = i20 + 1;
                        char cCharAt3 = text.charAt(i20);
                        if (Character.isHighSurrogate(cCharAt3)) {
                            if (i27 == iMin || !Character.isLowSurrogate(text.charAt(i27))) {
                                i20 = i27;
                                i14 = 63;
                            } else {
                                i20 += 2;
                                iCharAt = ((cCharAt3 - 55232) << 10) | (text.charAt(i27) - c10);
                            }
                            i15 = 1;
                            if (1 <= i14 || i14 >= 128) {
                                if (128 > i14 && i14 < 2048) {
                                    i15 = 2;
                                } else if (2048 > i14 && i14 < 65536) {
                                    i15 = 3;
                                } else {
                                    if (65536 <= i14 || i14 >= 1114112) {
                                        j(i14);
                                        throw null;
                                    }
                                    i15 = 4;
                                }
                            }
                            if (i15 > i26) {
                                i20--;
                                break;
                            }
                            if (i14 < 0 && i14 < 128) {
                                encodeUTF8.put(i21, (byte) i14);
                                i16 = 1;
                            } else if (128 > i14 && i14 < 2048) {
                                encodeUTF8.put(i21, (byte) (((i14 >> 6) & 31) | 192));
                                encodeUTF8.put(i21 + 1, (byte) ((i14 & 63) | 128));
                                i16 = 2;
                            } else if (2048 > i14 && i14 < 65536) {
                                encodeUTF8.put(i21, (byte) (((i14 >> 12) & 15) | 224));
                                encodeUTF8.put(i21 + 1, (byte) (((i14 >> 6) & 63) | 128));
                                encodeUTF8.put(i21 + 2, (byte) ((i14 & 63) | 128));
                                i16 = 3;
                            } else {
                                if (65536 <= i14 || i14 >= 1114112) {
                                    j(i14);
                                    throw null;
                                }
                                encodeUTF8.put(i21, (byte) (((i14 >> 18) & 7) | 240));
                                encodeUTF8.put(i21 + 1, (byte) (((i14 >> 12) & 63) | 128));
                                encodeUTF8.put(i21 + 2, (byte) (((i14 >> 6) & 63) | 128));
                                encodeUTF8.put(i21 + 3, (byte) ((i14 & 63) | 128));
                                i16 = 4;
                            }
                            i21 += i16;
                            c10 = 56320;
                        } else {
                            i20 = i27;
                            iCharAt = cCharAt3;
                        }
                        i14 = iCharAt;
                        i15 = 1;
                        if (1 <= i14) {
                            if (128 > i14) {
                                if (2048 > i14) {
                                    if (65536 <= i14) {
                                    }
                                    j(i14);
                                    throw null;
                                }
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (2048 > i14) {
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (128 > i14) {
                            if (2048 > i14) {
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (2048 > i14) {
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (65536 <= i14) {
                        }
                        j(i14);
                        throw null;
                        if (i15 > i26) {
                            i20--;
                            break;
                        }
                        if (i14 < 0) {
                            if (128 > i14) {
                                if (2048 > i14) {
                                    if (65536 <= i14) {
                                    }
                                    j(i14);
                                    throw null;
                                }
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (2048 > i14) {
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (128 > i14) {
                            if (2048 > i14) {
                                if (65536 <= i14) {
                                }
                                j(i14);
                                throw null;
                            }
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (2048 > i14) {
                            if (65536 <= i14) {
                            }
                            j(i14);
                            throw null;
                        }
                        if (65536 <= i14) {
                        }
                        j(i14);
                        throw null;
                        i21 += i16;
                        c10 = 56320;
                    }
                    s11 = (short) (i20 - i10);
                    s12 = (short) (i21 - i12);
                    s10 = 65535;
                } else {
                    s10 = 65535;
                    s11 = (short) (i20 - i10);
                    s12 = (short) (i21 - i12);
                }
                return ((s11 & s10) << 16) | (s12 & s10);
            }
            encodeUTF8.put(i21, (byte) i23);
            i21++;
            i20 = i22;
        }
        return ((((short) (i20 - i10)) & 65535) << 16) | (((short) (i21 - i12)) & 65535);
    }

    public static final C0738o g(z zVar) {
        i.e(zVar, "<this>");
        return new C0738o(zVar.f5036a, zVar.f5054t);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int i10 = Integer.parseInt(str.substring(0, 2), 16);
        String strSubstring = str.substring(2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(": ");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            String strSubstring2 = strSubstring.substring(i12, i12 + 8);
            String strSubstring3 = strSubstring2.substring(0, 4);
            String strSubstring4 = strSubstring2.substring(4, 8);
            int i13 = Integer.parseInt(strSubstring3, 16);
            int i14 = Integer.parseInt(strSubstring4, 16);
            sb2.append(i13);
            sb2.append("(");
            sb2.append(i14);
            sb2.append(") ");
        }
        return sb2.toString();
    }

    public static final String i(Oa.c clazz, Pb.a aVar, Pb.b scopeQualifier) {
        String value;
        i.e(clazz, "clazz");
        i.e(scopeQualifier, "scopeQualifier");
        if (aVar == null || (value = aVar.getValue()) == null) {
            value = "";
        }
        return Sb.a.a(clazz) + ':' + value + ':' + scopeQualifier;
    }

    public static final void j(int i10) {
        throw new IllegalArgumentException(J4.i.c(i10, "Malformed code-point ", " found"));
    }
}
