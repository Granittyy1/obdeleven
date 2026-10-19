package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.C0937i;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1050e;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomPrimaryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPrimaryButtonKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void IntercomPrimaryButton(final String text, final androidx.compose.ui.h hVar, Integer num, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.h hVar2;
        Integer num2;
        final Integer num3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-801577387);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    if (c1086gP.K(num)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (c1086gP.k(onClick)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
                    hVar = hVar2;
                    num3 = num2;
                } else {
                    c1086gP.w();
                    num3 = num;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.w0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(text, hVar, num3, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onClick)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
                hVar = hVar2;
                num3 = num2;
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
                hVar = hVar2;
                num3 = num2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.w0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(text, hVar, num3, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                if (c1086gP.K(num)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onClick)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
                hVar = hVar2;
                num3 = num2;
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
                hVar = hVar2;
                num3 = num2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.w0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(text, hVar, num3, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onClick)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
            hVar = hVar2;
            num3 = num2;
        } else {
            if (i16 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            LegacyIntercomPrimaryButton(text, hVar2, num2, onClick, c1086gP, i12 & 8190, 0);
            hVar = hVar2;
            num3 = num2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.w0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(text, hVar, num3, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomPrimaryButton$lambda$0(String text, androidx.compose.ui.h hVar, Integer num, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        IntercomPrimaryButton(text, hVar, num, onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @p293xa.d
    private static final void LegacyIntercomPrimaryButton(final String str, androidx.compose.ui.h hVar, Integer num, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        Integer num2;
        int i13;
        androidx.compose.ui.h hVar2;
        final Integer num3;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(398234558);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                num2 = num;
                i12 |= c1086gP.K(num2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(aVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5771) == 1154 || !c1086gP.s()) {
                if ((i11 & 2) != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i14 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                LegacyIntercomPrimaryButton(aVar, (androidx.compose.ui.h) null, false, (Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r>) androidx.compose.runtime.internal.a.b(2099872974, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton.1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num4) {
                        invoke(u10, interfaceC1084f2, num4.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.layout.U LegacyIntercomPrimaryButton, InterfaceC1084f interfaceC1084f2, int i15) {
                        kotlin.jvm.internal.i.e(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                        if ((i15 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String str2 = str;
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        TextKt.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(interfaceC1084f2, i16).getType04(), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), interfaceC1084f2, 0, 0, 65534);
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        int iIntValue = num4.intValue();
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar2, 6));
                        IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar2, 16), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), interfaceC1084f2, 440, 0);
                    }
                }, c1086gP), (InterfaceC1084f) c1086gP, ((i12 >> 9) & 14) | 3072, 6);
                hVar3 = hVar2;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                num3 = num2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.y0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$1(str, hVar3, num3, aVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        num2 = num;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(aVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5771) == 1154) {
            if ((i11 & 2) != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i14 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            LegacyIntercomPrimaryButton(aVar, (androidx.compose.ui.h) null, false, (Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r>) androidx.compose.runtime.internal.a.b(2099872974, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(u10, interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.layout.U LegacyIntercomPrimaryButton, InterfaceC1084f interfaceC1084f2, int i15) {
                    kotlin.jvm.internal.i.e(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                    if ((i15 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String str2 = str;
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i16 = IntercomTheme.$stable;
                    TextKt.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(interfaceC1084f2, i16).getType04(), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), interfaceC1084f2, 0, 0, 65534);
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    int iIntValue = num4.intValue();
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar2, 6));
                    IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar2, 16), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), interfaceC1084f2, 440, 0);
                }
            }, c1086gP), (InterfaceC1084f) c1086gP, ((i12 >> 9) & 14) | 3072, 6);
            hVar3 = hVar2;
        } else {
            if ((i11 & 2) != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i14 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            LegacyIntercomPrimaryButton(aVar, (androidx.compose.ui.h) null, false, (Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r>) androidx.compose.runtime.internal.a.b(2099872974, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num4) {
                    invoke(u10, interfaceC1084f2, num4.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.layout.U LegacyIntercomPrimaryButton, InterfaceC1084f interfaceC1084f2, int i15) {
                    kotlin.jvm.internal.i.e(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                    if ((i15 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String str2 = str;
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i16 = IntercomTheme.$stable;
                    TextKt.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(interfaceC1084f2, i16).getType04(), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), interfaceC1084f2, 0, 0, 65534);
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    int iIntValue = num4.intValue();
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar2, 6));
                    IconKt.a(U.c.a(iIntValue, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar2, 16), intercomTheme.getColors(interfaceC1084f2, i16).m639getOnAction0d7_KjU(), interfaceC1084f2, 440, 0);
                }
            }, c1086gP), (InterfaceC1084f) c1086gP, ((i12 >> 9) & 14) | 3072, 6);
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.y0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$1(str, hVar3, num3, aVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LegacyIntercomPrimaryButton$lambda$1(String text, androidx.compose.ui.h hVar, Integer num, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        LegacyIntercomPrimaryButton(text, hVar, num, (Ia.a<p293xa.r>) onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LegacyIntercomPrimaryButton$lambda$2(Ia.a onClick, androidx.compose.ui.h hVar, boolean z10, Ia.q content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        kotlin.jvm.internal.i.e(content, "$content");
        LegacyIntercomPrimaryButton((Ia.a<p293xa.r>) onClick, hVar, z10, (Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r>) content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1925294537);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m103getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrimaryButtonPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PrimaryButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1297682962);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m104getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PrimaryButtonWithTrailingIconPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PrimaryButtonWithTrailingIconPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void LegacyIntercomPrimaryButton(final Ia.a<p293xa.r> onClick, androidx.compose.ui.h hVar, boolean z10, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.h hVar3;
        boolean z12;
        IntercomTheme intercomTheme;
        int i17;
        C0937i c0937iA;
        C1086g c1086g;
        final androidx.compose.ui.h hVar4;
        final boolean z13;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(onClick, "onClick");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-1285013288);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.k(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (c1086gP.k(content)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) != 1170 && c1086gP.s()) {
                    c1086gP.w();
                    c1086g = c1086gP;
                    hVar4 = hVar2;
                    z13 = z11;
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i17 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                        c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
                    } else {
                        c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
                    }
                    C0937i c0937i = c0937iA;
                    p270w.a aVar = intercomTheme.getShapes(c1086gP, i17).f12430b;
                    androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                    C1050e c1050eA = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
                    float f10 = 16;
                    float f11 = 12;
                    c1086g = c1086gP;
                    ButtonKt.a(onClick, hVar3, z12, aVar, c1050eA, null, c0937i, new androidx.compose.foundation.layout.N(f10, f11, f10, f11), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
                    hVar4 = hVar3;
                    z13 = z12;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.x0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, hVar4, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) != 1170) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i17 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
                } else {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
                }
                C0937i c0937i2 = c0937iA;
                p270w.a aVar2 = intercomTheme.getShapes(c1086gP, i17).f12430b;
                androidx.compose.foundation.layout.N n11 = C1051f.f12444a;
                C1050e c1050eA2 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
                float f12 = 16;
                float f13 = 12;
                c1086g = c1086gP;
                ButtonKt.a(onClick, hVar3, z12, aVar2, c1050eA2, null, c0937i2, new androidx.compose.foundation.layout.N(f12, f13, f12, f13), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
                hVar4 = hVar3;
                z13 = z12;
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i17 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
                } else {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
                }
                C0937i c0937i3 = c0937iA;
                p270w.a aVar3 = intercomTheme.getShapes(c1086gP, i17).f12430b;
                androidx.compose.foundation.layout.N n12 = C1051f.f12444a;
                C1050e c1050eA3 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
                float f14 = 16;
                float f15 = 12;
                c1086g = c1086gP;
                ButtonKt.a(onClick, hVar3, z12, aVar3, c1050eA3, null, c0937i3, new androidx.compose.foundation.layout.N(f14, f15, f14, f15), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
                hVar4 = hVar3;
                z13 = z12;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.x0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, hVar4, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) != 1170) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i17 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
                } else {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
                }
                C0937i c0937i4 = c0937iA;
                p270w.a aVar4 = intercomTheme.getShapes(c1086gP, i17).f12430b;
                androidx.compose.foundation.layout.N n13 = C1051f.f12444a;
                C1050e c1050eA4 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
                float f16 = 16;
                float f17 = 12;
                c1086g = c1086gP;
                ButtonKt.a(onClick, hVar3, z12, aVar4, c1050eA4, null, c0937i4, new androidx.compose.foundation.layout.N(f16, f17, f16, f17), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
                hVar4 = hVar3;
                z13 = z12;
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i17 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
                } else {
                    c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
                }
                C0937i c0937i5 = c0937iA;
                p270w.a aVar5 = intercomTheme.getShapes(c1086gP, i17).f12430b;
                androidx.compose.foundation.layout.N n14 = C1051f.f12444a;
                C1050e c1050eA5 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
                float f18 = 16;
                float f19 = 12;
                c1086g = c1086gP;
                ButtonKt.a(onClick, hVar3, z12, aVar5, c1050eA5, null, c0937i5, new androidx.compose.foundation.layout.N(f18, f19, f18, f19), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
                hVar4 = hVar3;
                z13 = z12;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.x0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, hVar4, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) != 1170) {
            if (i18 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i17 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
            } else {
                c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
            }
            C0937i c0937i6 = c0937iA;
            p270w.a aVar6 = intercomTheme.getShapes(c1086gP, i17).f12430b;
            androidx.compose.foundation.layout.N n15 = C1051f.f12444a;
            C1050e c1050eA6 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
            float f110 = 16;
            float f111 = 12;
            c1086g = c1086gP;
            ButtonKt.a(onClick, hVar3, z12, aVar6, c1050eA6, null, c0937i6, new androidx.compose.foundation.layout.N(f110, f111, f110, f111), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
            hVar4 = hVar3;
            z13 = z12;
        } else {
            if (i18 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i17 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU())) {
                c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13495b));
            } else {
                c0937iA = C1787c0.a(1, androidx.compose.ui.graphics.H.b(0.2f, androidx.compose.ui.graphics.H.f13499f));
            }
            C0937i c0937i7 = c0937iA;
            p270w.a aVar7 = intercomTheme.getShapes(c1086gP, i17).f12430b;
            androidx.compose.foundation.layout.N n16 = C1051f.f12444a;
            C1050e c1050eA7 = C1051f.a(intercomTheme.getColors(c1086gP, i17).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i17).m639getOnAction0d7_KjU(), androidx.compose.ui.graphics.H.b(0.2f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), androidx.compose.ui.graphics.H.b(0.4f, intercomTheme.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU()), c1086gP, 0);
            float f112 = 16;
            float f113 = 12;
            c1086g = c1086gP;
            ButtonKt.a(onClick, hVar3, z12, aVar7, c1050eA7, null, c0937i7, new androidx.compose.foundation.layout.N(f112, f113, f112, f113), null, content, c1086g, 12582912 | (i16 & 14) | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 896) | ((i16 << 18) & 1879048192), 288);
            hVar4 = hVar3;
            z13 = z12;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.x0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(onClick, hVar4, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }
}
