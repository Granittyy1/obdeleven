package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import Ia.l;
import J4.n;
import L4.b;
import S4.o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.p;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.f;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.style.g;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumberConfirmationScreenKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final String str2, h hVar, final FocusRequester focusRequester, final l<? super String, r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final h hVar2;
        int i13;
        int i14;
        int i15;
        h hVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1260603779);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(str2) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.K(focusRequester)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                if ((57344 & i10) == 0) {
                    if (c1086gP.k(lVar)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i12;
                if ((i15 & 46811) == 9362 || !c1086gP.s()) {
                    if (i16 != 0) {
                        hVar3 = h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    F fA = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
                    h hVarF = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
                    TextFieldKt.a(str, lVar, hVarF, false, false, fA, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j = e.a.f32283f;
                                long jG = G0.a.g(20);
                                TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                            }
                            return r.f47939a;
                        }
                    }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
                    hVar2 = hVar3;
                } else {
                    c1086gP.w();
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            NumberConfirmationScreenKt.a(str, str2, hVar2, focusRequester, lVar, interfaceC1084f2, b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            i15 = i12;
            if ((i15 & 46811) == 9362) {
                if (i16 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                F fA2 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
                h hVarF2 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11834a;
                TextFieldKt.a(str, lVar, hVarF2, false, false, fA2, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j = e.a.f32283f;
                            long jG = G0.a.g(20);
                            TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
                hVar2 = hVar3;
            } else {
                if (i16 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                F fA3 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
                h hVarF3 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11834a;
                TextFieldKt.a(str, lVar, hVarF3, false, false, fA3, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j = e.a.f32283f;
                            long jG = G0.a.g(20);
                            TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
                hVar2 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        NumberConfirmationScreenKt.a(str, str2, hVar2, focusRequester, lVar, interfaceC1084f2, b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.K(focusRequester)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            if ((57344 & i10) == 0) {
                if (c1086gP.k(lVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((i15 & 46811) == 9362) {
                if (i16 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                F fA4 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
                h hVarF4 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
                TextFieldDefaults textFieldDefaults4 = TextFieldDefaults.f11834a;
                TextFieldKt.a(str, lVar, hVarF4, false, false, fA4, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j = e.a.f32283f;
                            long jG = G0.a.g(20);
                            TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
                hVar2 = hVar3;
            } else {
                if (i16 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                F fA5 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
                h hVarF5 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
                TextFieldDefaults textFieldDefaults5 = TextFieldDefaults.f11834a;
                TextFieldKt.a(str, lVar, hVarF5, false, false, fA5, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j = e.a.f32283f;
                            long jG = G0.a.g(20);
                            TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
                hVar2 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        NumberConfirmationScreenKt.a(str, str2, hVar2, focusRequester, lVar, interfaceC1084f2, b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        i15 = i12;
        if ((i15 & 46811) == 9362) {
            if (i16 != 0) {
                hVar3 = h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            F fA6 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
            h hVarF6 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
            TextFieldDefaults textFieldDefaults6 = TextFieldDefaults.f11834a;
            TextFieldKt.a(str, lVar, hVarF6, false, false, fA6, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        long j = e.a.f32283f;
                        long jG = G0.a.g(20);
                        TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
            hVar2 = hVar3;
        } else {
            if (i16 != 0) {
                hVar3 = h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            F fA7 = F.a((F) c1086gP.x(TextKt.f11859a), 0L, G0.a.g(20), null, null, 0L, null, 3, 0L, null, null, 16744445);
            h hVarF7 = PaddingKt.f(u.a(p.a(W.d(hVar3, 1.0f), true, null), focusRequester), 0);
            TextFieldDefaults textFieldDefaults7 = TextFieldDefaults.f11834a;
            TextFieldKt.a(str, lVar, hVarF7, false, false, fA7, null, androidx.compose.runtime.internal.a.b(1425319544, new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        long j = e.a.f32283f;
                        long jG = G0.a.g(20);
                        TextKt.b(str2, W.d(h.a.f13984b, 1.0f), j, jG, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3504, 0, 130544);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, H.f13503k, 0L, 0L, 0L, 0L, c1086gP, 2097146), c1086gP, 12582912 | (i15 & 14) | ((i15 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 24576, 507736);
            hVar2 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$CenteredInputField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationScreenKt.a(str, str2, hVar2, focusRequester, lVar, interfaceC1084f2, b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final InterfaceC0954n interfaceC0954n, final a aVar, final l<? super String, r> lVar, final Ia.a<r> aVar2, final Ia.a<r> aVar3, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1910427038);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(interfaceC0954n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= c1086gP.k(aVar3) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar4 = h.a.f13984b;
            String strC = n.c(aVar4, 14, c1086gP, com.voltasit.obdeleven.R.string.view_number_confirmation_enter_code, c1086gP);
            long jG = G0.a.g(20);
            androidx.compose.ui.text.font.l lVar2 = androidx.compose.ui.text.font.l.f15442g;
            O0 o10 = ColorsKt.f11693a;
            TextKt.b(strC, null, ((C1034j) c1086gP.x(o10)).d(), jG, null, lVar2, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            Lb.a.a(c1086gP, W.e(aVar4, 32));
            String str = aVar.f33070b;
            c1086gP.L(-1993803707);
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new FocusRequester();
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            a(str, "000000", null, (FocusRequester) objF, lVar, c1086gP, ((i11 << 6) & 57344) | 3120, 4);
            Lb.a.a(c1086gP, W.e(aVar4, 4));
            TextKt.b(aVar.f33072d, W.d(aVar4, 1.0f), ((C1034j) c1086gP.x(o10)).b(), G0.a.g(12), null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 3120, 0, 130544);
            TextKt.b(n.c(aVar4, 12, c1086gP, com.voltasit.obdeleven.R.string.view_number_confirmation_code_sent_to, c1086gP), null, ((C1034j) c1086gP.x(o10)).d(), G0.a.g(16), null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            TextKt.b(aVar.f33069a, null, e.a.f32291o, G0.a.g(16), null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 130546);
            float f10 = 16;
            String strC2 = n.c(aVar4, f10, c1086gP, com.voltasit.obdeleven.R.string.view_number_confirmation_resend_code, c1086gP);
            long jG2 = G0.a.g(14);
            long j = e.a.f32284g;
            d.b bVar = d.a.f13347n;
            TextKt.b(strC2, ClickableKt.c(interfaceC0954n.b(aVar4, bVar), false, null, aVar3, 7), j, jG2, null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
            Lb.a.a(c1086gP, interfaceC0954n.a(true));
            com.voltasit.obdeleven.presentation.components.b.a(((i11 << 3) & 57344) | 384, 8, e.a.j, aVar2, c1086gP, W.d(interfaceC0954n.b(aVar4, bVar), 1.0f), o.p(c1086gP, com.voltasit.obdeleven.R.string.common_next), false, aVar.f33071c);
            Lb.a.a(c1086gP, W.e(aVar4, f10));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationScreenKt.b(interfaceC0954n, aVar, lVar, aVar2, aVar3, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void c(final a aVar, final l<? super String, r> lVar, final Ia.a<r> aVar2, final Ia.a<r> aVar3, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1258601157);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(aVar3) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            f.a aVar4 = d.a.f13347n;
            h hVarB = ScrollKt.b(PaddingKt.h(h.a.f13984b, 16, 0.0f, 2).i(W.f10226c), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar4, c1086gP, 48);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            int i13 = i11 << 3;
            b(C0955o.f10310a, aVar, lVar, aVar2, aVar3, c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i13 & 896) | (i13 & 7168) | (i13 & 57344));
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$NumberConfirmationScreen$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationScreenKt.c(aVar, lVar, aVar2, aVar3, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void d(final String mobile, final l<? super String, r> showToast, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(mobile, "mobile");
        i.e(showToast, "showToast");
        C1086g c1086gP = interfaceC1084f.p(249171135);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(mobile) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(showToast) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(1163403130);
            boolean z10 = (i11 & 14) == 4;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$NumberConfirmationScreen$viewModel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Ob.a invoke() {
                        return I.e.j(mobile);
                    }
                };
                c1086gP.E(objF);
            }
            Ia.a aVar = (Ia.a) objF;
            c1086gP.T(false);
            c1086gP.e(667488325);
            c0 c0VarA = p027c1.b.a(c1086gP);
            if (c0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
            org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
            c1086gP.e(-1614864554);
            Y yA = Gb.a.a(kotlin.jvm.internal.l.a(NumberConfirmationViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, aVar);
            c1086gP.T(false);
            c1086gP.T(false);
            NumberConfirmationViewModel numberConfirmationViewModel = (NumberConfirmationViewModel) yA;
            E.d(new NumberConfirmationScreenKt$NumberConfirmationScreen$1(numberConfirmationViewModel, showToast, null), c1086gP, "toast");
            c(numberConfirmationViewModel.b(), new NumberConfirmationScreenKt$NumberConfirmationScreen$2(1, numberConfirmationViewModel, NumberConfirmationViewModel.class, "onCodeChange", "onCodeChange(Ljava/lang/String;)V", 0), new NumberConfirmationScreenKt$NumberConfirmationScreen$3(0, numberConfirmationViewModel, NumberConfirmationViewModel.class, "onNextClick", "onNextClick()Lkotlinx/coroutines/Job;", 8), new NumberConfirmationScreenKt$NumberConfirmationScreen$4(0, numberConfirmationViewModel, NumberConfirmationViewModel.class, "onResendClick", "onResendClick()V", 0), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$NumberConfirmationScreen$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationScreenKt.d(mobile, showToast, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
