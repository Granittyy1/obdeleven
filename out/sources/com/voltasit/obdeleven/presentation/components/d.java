package com.voltasit.obdeleven.presentation.components;

import Ia.l;
import Ia.p;
import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PrivacyPolicyCheckbox.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(final String htmlText, final Ia.a onCheckChanged, final boolean z10, h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        h hVar2;
        int i13;
        int i14;
        h.a aVar;
        h hVar3;
        boolean z11;
        Object objF;
        int i15;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        int i16;
        boolean z12;
        Object objF2;
        final h hVar4;
        C1105p0 c1105p0V;
        i.e(htmlText, "htmlText");
        i.e(onCheckChanged, "onCheckChanged");
        C1086g c1086gP = interfaceC1084f.p(-310390805);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(htmlText) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                if (c1086gP.c(z10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onCheckChanged)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                aVar = h.a.f13984b;
                if (i17 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                float f10 = 16;
                h hVarJ = PaddingKt.j(hVar3, 0.0f, f10, 0.0f, 0.0f, 13);
                c1086gP.L(2026083915);
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (z11 || objF == c0153a) {
                    objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onCheckChanged.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                h hVarC = ClickableKt.c(hVarJ, false, null, (Ia.a) objF, 7);
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                if (z10) {
                    i16 = com.voltasit.obdeleven.R.drawable.ic_checkbox;
                } else {
                    i16 = com.voltasit.obdeleven.R.drawable.ic_not_checked;
                }
                ImageKt.a(U.c.a(i16, c1086gP, 0), null, PaddingKt.j(aVar, 0.0f, 0.0f, f10, 0.0f, 11), null, null, 0.0f, null, c1086gP, 440, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                c1086gP.L(-417058681);
                if ((i12 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12 || objF2 == c0153a) {
                    objF2 = new l<Context, TextView>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final TextView invoke(Context context) {
                            Context context2 = context;
                            i.e(context2, "context");
                            TextView textView = new TextView(context2);
                            W8.d.d(textView, htmlText);
                            textView.setMovementMethod(new LinkMovementMethod());
                            textView.setTextColor(p0.a.b.a(context2, com.voltasit.obdeleven.R.color.white));
                            textView.setTextSize(2, 16.0f);
                            textView.setTypeface(Typeface.create("sans-serif", 0));
                            return textView;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                AndroidView_androidKt.b((l) objF2, new VerticalAlignElement(androidx.compose.ui.d.a.f13344k), null, c1086gP, 0, 4);
                c1086gP.T(true);
                hVar4 = hVar3;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        String str = htmlText;
                        h hVar5 = hVar4;
                        boolean z13 = z10;
                        d.a(str, onCheckChanged, z13, hVar5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (c1086gP.c(z10)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onCheckChanged)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i12 & 5851) == 1170) {
            aVar = h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            float f11 = 16;
            h hVarJ2 = PaddingKt.j(hVar3, 0.0f, f11, 0.0f, 0.0f, 13);
            c1086gP.L(2026083915);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (z11) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckChanged.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckChanged.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            h hVarC3 = ClickableKt.c(hVarJ2, false, null, (Ia.a) objF, 7);
            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC4 = ComposedModifierKt.c(c1086gP, hVarC3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
            if (z10) {
                i16 = com.voltasit.obdeleven.R.drawable.ic_checkbox;
            } else {
                i16 = com.voltasit.obdeleven.R.drawable.ic_not_checked;
            }
            ImageKt.a(U.c.a(i16, c1086gP, 0), null, PaddingKt.j(aVar, 0.0f, 0.0f, f11, 0.0f, 11), null, null, 0.0f, null, c1086gP, 440, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            c1086gP.L(-417058681);
            if ((i12 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new l<Context, TextView>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final TextView invoke(Context context) {
                        Context context2 = context;
                        i.e(context2, "context");
                        TextView textView = new TextView(context2);
                        W8.d.d(textView, htmlText);
                        textView.setMovementMethod(new LinkMovementMethod());
                        textView.setTextColor(p0.a.b.a(context2, com.voltasit.obdeleven.R.color.white));
                        textView.setTextSize(2, 16.0f);
                        textView.setTypeface(Typeface.create("sans-serif", 0));
                        return textView;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new l<Context, TextView>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final TextView invoke(Context context) {
                        Context context2 = context;
                        i.e(context2, "context");
                        TextView textView = new TextView(context2);
                        W8.d.d(textView, htmlText);
                        textView.setMovementMethod(new LinkMovementMethod());
                        textView.setTextColor(p0.a.b.a(context2, com.voltasit.obdeleven.R.color.white));
                        textView.setTextSize(2, 16.0f);
                        textView.setTypeface(Typeface.create("sans-serif", 0));
                        return textView;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            AndroidView_androidKt.b((l) objF2, new VerticalAlignElement(androidx.compose.ui.d.a.f13344k), null, c1086gP, 0, 4);
            c1086gP.T(true);
            hVar4 = hVar3;
        } else {
            aVar = h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            float f12 = 16;
            h hVarJ3 = PaddingKt.j(hVar3, 0.0f, f12, 0.0f, 0.0f, 13);
            c1086gP.L(2026083915);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
            if (z11) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckChanged.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckChanged.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            h hVarC5 = ClickableKt.c(hVarJ3, false, null, (Ia.a) objF, 7);
            T tA3 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC6 = ComposedModifierKt.c(c1086gP, hVarC5);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            if (z10) {
                i16 = com.voltasit.obdeleven.R.drawable.ic_checkbox;
            } else {
                i16 = com.voltasit.obdeleven.R.drawable.ic_not_checked;
            }
            ImageKt.a(U.c.a(i16, c1086gP, 0), null, PaddingKt.j(aVar, 0.0f, 0.0f, f12, 0.0f, 11), null, null, 0.0f, null, c1086gP, 440, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            c1086gP.L(-417058681);
            if ((i12 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new l<Context, TextView>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final TextView invoke(Context context) {
                        Context context2 = context;
                        i.e(context2, "context");
                        TextView textView = new TextView(context2);
                        W8.d.d(textView, htmlText);
                        textView.setMovementMethod(new LinkMovementMethod());
                        textView.setTextColor(p0.a.b.a(context2, com.voltasit.obdeleven.R.color.white));
                        textView.setTextSize(2, 16.0f);
                        textView.setTypeface(Typeface.create("sans-serif", 0));
                        return textView;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new l<Context, TextView>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final TextView invoke(Context context) {
                        Context context2 = context;
                        i.e(context2, "context");
                        TextView textView = new TextView(context2);
                        W8.d.d(textView, htmlText);
                        textView.setMovementMethod(new LinkMovementMethod());
                        textView.setTextColor(p0.a.b.a(context2, com.voltasit.obdeleven.R.color.white));
                        textView.setTextSize(2, 16.0f);
                        textView.setTypeface(Typeface.create("sans-serif", 0));
                        return textView;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            AndroidView_androidKt.b((l) objF2, new VerticalAlignElement(androidx.compose.ui.d.a.f13344k), null, c1086gP, 0, 4);
            c1086gP.T(true);
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.PrivacyPolicyCheckboxKt$PrivacyPolicyCheckbox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    String str = htmlText;
                    h hVar5 = hVar4;
                    boolean z13 = z10;
                    d.a(str, onCheckChanged, z13, hVar5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
