package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1260a;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketStatusRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketStatusRowKt {
    @IntercomPreviews
    public static final void SimplePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1725833053);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketStatusRowKt.INSTANCE.m243getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SimplePreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SimplePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:108:0x028b  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x033b  */
    /* JADX WARN: Code duplicated, block: B:113:0x033f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0352  */
    /* JADX WARN: Code duplicated, block: B:118:0x0360  */
    /* JADX WARN: Code duplicated, block: B:123:0x03df  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x028b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x02c2, please report this as an issue */
    public static final void TicketStatusRow(final String eventStatus, final String statusText, final String time, androidx.compose.ui.h hVar, String str, String str2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        String str3;
        int i14;
        int i15;
        String str4;
        int i16;
        int i17;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        String str5;
        String str6;
        C1086g c1086g;
        String lowerCase;
        CharSequence charSequence;
        int i18;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        androidx.compose.ui.h hVar4;
        final String str7;
        final String str8;
        final androidx.compose.ui.h hVar5;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(eventStatus, "eventStatus");
        kotlin.jvm.internal.i.e(statusText, "statusText");
        kotlin.jvm.internal.i.e(time, "time");
        C1086g c1086gP = interfaceC1084f.p(-1382529243);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(eventStatus) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(statusText) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(time) ? 256 : 128;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 7168) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    str3 = str;
                    if (c1086gP.K(str3)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        str4 = str2;
                        if (c1086gP.K(str4)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i12;
                    if ((i17 & 374491) == 74898 || !c1086gP.s()) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i19 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i15 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (str5 != null || str6 == null) {
                            androidx.compose.ui.h hVar6 = hVar3;
                            c1086g = c1086gP;
                            c1086g.L(1098677964);
                            lowerCase = statusText.toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                            if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                                c1086g.L(1098747900);
                                charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                                c1086g.T(false);
                            } else {
                                c1086g.L(1098996489);
                                charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                                c1086g.T(false);
                            }
                            Spanned spannedA = p307z0.b.a(charSequence.toString(), 0);
                            kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
                            C1260a annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                            androidx.compose.ui.h hVarS = W.s(W.d(hVar6, 1.0f));
                            T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                            i18 = c1086g.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086g.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086g, hVarS);
                            ComposeUiNode.f14331c0.getClass();
                            aVar2 = ComposeUiNode.Companion.f14333b;
                            c1086g.r();
                            if (c1086g.f12995O) {
                                c1086g.v(aVar2);
                            } else {
                                c1086g.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086g.f12995O || !kotlin.jvm.internal.i.a(c1086g.f(), Integer.valueOf(i18))) {
                                J4.i.d(i18, c1086g, i18, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC);
                            Painter painterA = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            IconKt.a(painterA, null, null, intercomTheme.getColors(c1086g, i20).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                            Lb.a.a(c1086g, W.q(aVar, 8));
                            hVar4 = hVar6;
                            TextKt.c(annotatedString, null, intercomTheme.getColors(c1086g, i20).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c1086g, i20).getType04Point5(), c1086g, 0, 0, 131066);
                            c1086g.T(true);
                            c1086g.T(false);
                        } else {
                            c1086gP.L(1097247159);
                            androidx.compose.ui.h hVarS2 = W.s(W.d(hVar3, 1.0f));
                            C0953m c0953mA = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                            int i21 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarS2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar2, c1086gP, c0953mA);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                                J4.i.d(i21, c1086gP, i21, pVar4);
                            }
                            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar5, c1086gP, hVarC2);
                            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
                            int i22 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
                            c1086gP.r();
                            androidx.compose.ui.h hVar7 = hVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar2, c1086gP, tA2);
                            R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                                J4.i.d(i22, c1086gP, i22, pVar4);
                            }
                            R0.a(pVar5, c1086gP, hVarC3);
                            Painter painterA2 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086gP, 0);
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i23 = IntercomTheme.$stable;
                            IconKt.a(painterA2, null, null, intercomTheme2.getColors(c1086gP, i23).m630getDescriptionText0d7_KjU(), c1086gP, 56, 4);
                            Lb.a.a(c1086gP, W.q(aVar, 8));
                            TextWithSeparatorKt.m129TextWithSeparatorwV1YYcM(str6, time, null, null, intercomTheme2.getTypography(c1086gP, i23).getType04Point5(), intercomTheme2.getColors(c1086gP, i23).m630getDescriptionText0d7_KjU(), 2, 1, new androidx.compose.ui.text.style.g(3), c1086gP, ((i17 >> 15) & 14) | 14155776 | ((i17 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 12);
                            c1086g = c1086gP;
                            c1086g.T(true);
                            Lb.a.a(c1086g, W.e(aVar, 4));
                            TextKt.b(str5, null, intercomTheme2.getColors(c1086g, i23).m630getDescriptionText0d7_KjU(), 0L, null, androidx.compose.ui.text.font.l.j, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 2, false, 1, 0, null, intercomTheme2.getTypography(c1086g, i23).getType04Point5(), c1086g, ((i17 >> 12) & 14) | 196608, 3120, 54746);
                            c1086g.T(true);
                            c1086g.T(false);
                            hVar4 = hVar7;
                        }
                        str7 = str5;
                        str8 = str6;
                        hVar5 = hVar4;
                    } else {
                        c1086gP.w();
                        hVar5 = hVar2;
                        str7 = str3;
                        str8 = str4;
                        c1086g = c1086gP;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 196608;
                str4 = str2;
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar8 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA2 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA2, "fromHtml(...)");
                        C1260a annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS3 = W.s(W.d(hVar8, 1.0f));
                        T tA3 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086g.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086g, hVarS3);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P4);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC4);
                        Painter painterA3 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i24 = IntercomTheme.$stable;
                        IconKt.a(painterA3, null, null, intercomTheme3.getColors(c1086g, i24).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar8;
                        TextKt.c(annotatedString2, null, intercomTheme3.getColors(c1086g, i24).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c1086g, i24).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar9 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA3 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA3, "fromHtml(...)");
                        C1260a annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS4 = W.s(W.d(hVar9, 1.0f));
                        T tA4 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086g.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086g, hVarS4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P5);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC5);
                        Painter painterA4 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i25 = IntercomTheme.$stable;
                        IconKt.a(painterA4, null, null, intercomTheme4.getColors(c1086g, i25).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar9;
                        TextKt.c(annotatedString3, null, intercomTheme4.getColors(c1086g, i25).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme4.getTypography(c1086g, i25).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar10 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA4 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA4, "fromHtml(...)");
                        C1260a annotatedString4 = BlockExtensionsKt.toAnnotatedString(spannedA4, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS5 = W.s(W.d(hVar10, 1.0f));
                        T tA5 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P6 = c1086g.P();
                        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086g, hVarS5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P6);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC6);
                        Painter painterA5 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i26 = IntercomTheme.$stable;
                        IconKt.a(painterA5, null, null, intercomTheme5.getColors(c1086g, i26).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar10;
                        TextKt.c(annotatedString4, null, intercomTheme5.getColors(c1086g, i26).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme5.getTypography(c1086g, i26).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar11 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA5 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA5, "fromHtml(...)");
                        C1260a annotatedString5 = BlockExtensionsKt.toAnnotatedString(spannedA5, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS6 = W.s(W.d(hVar11, 1.0f));
                        T tA6 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P7 = c1086g.P();
                        androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086g, hVarS6);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA6);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P7);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC7);
                        Painter painterA6 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                        int i27 = IntercomTheme.$stable;
                        IconKt.a(painterA6, null, null, intercomTheme6.getColors(c1086g, i27).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar11;
                        TextKt.c(annotatedString5, null, intercomTheme6.getColors(c1086g, i27).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme6.getTypography(c1086g, i27).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            str3 = str;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    str4 = str2;
                    if (c1086gP.K(str4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar12 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA6 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA6, "fromHtml(...)");
                        C1260a annotatedString6 = BlockExtensionsKt.toAnnotatedString(spannedA6, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS7 = W.s(W.d(hVar12, 1.0f));
                        T tA7 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086g.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086g, hVarS7);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA7);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P8);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC8);
                        Painter painterA7 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                        int i28 = IntercomTheme.$stable;
                        IconKt.a(painterA7, null, null, intercomTheme7.getColors(c1086g, i28).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar12;
                        TextKt.c(annotatedString6, null, intercomTheme7.getColors(c1086g, i28).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme7.getTypography(c1086g, i28).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar13 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA7 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA7, "fromHtml(...)");
                        C1260a annotatedString7 = BlockExtensionsKt.toAnnotatedString(spannedA7, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS8 = W.s(W.d(hVar13, 1.0f));
                        T tA8 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086g.P();
                        androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086g, hVarS8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P9);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC9);
                        Painter painterA8 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i29 = IntercomTheme.$stable;
                        IconKt.a(painterA8, null, null, intercomTheme8.getColors(c1086g, i29).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar13;
                        TextKt.c(annotatedString7, null, intercomTheme8.getColors(c1086g, i29).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme8.getTypography(c1086g, i29).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar14 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA8 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA8, "fromHtml(...)");
                        C1260a annotatedString8 = BlockExtensionsKt.toAnnotatedString(spannedA8, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS9 = W.s(W.d(hVar14, 1.0f));
                        T tA9 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P10 = c1086g.P();
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086g, hVarS9);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P10);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC10);
                        Painter painterA9 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i210 = IntercomTheme.$stable;
                        IconKt.a(painterA9, null, null, intercomTheme9.getColors(c1086g, i210).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar14;
                        TextKt.c(annotatedString8, null, intercomTheme9.getColors(c1086g, i210).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme9.getTypography(c1086g, i210).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar15 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA9 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA9, "fromHtml(...)");
                        C1260a annotatedString9 = BlockExtensionsKt.toAnnotatedString(spannedA9, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS10 = W.s(W.d(hVar15, 1.0f));
                        T tA10 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11 = c1086g.P();
                        androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086g, hVarS10);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA10);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P11);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC11);
                        Painter painterA10 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                        int i211 = IntercomTheme.$stable;
                        IconKt.a(painterA10, null, null, intercomTheme10.getColors(c1086g, i211).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar15;
                        TextKt.c(annotatedString9, null, intercomTheme10.getColors(c1086g, i211).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme10.getTypography(c1086g, i211).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 196608;
            str4 = str2;
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar16 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA10 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA10, "fromHtml(...)");
                    C1260a annotatedString10 = BlockExtensionsKt.toAnnotatedString(spannedA10, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS11 = W.s(W.d(hVar16, 1.0f));
                    T tA11 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086g.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086g, hVarS11);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P12);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC12);
                    Painter painterA11 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i212 = IntercomTheme.$stable;
                    IconKt.a(painterA11, null, null, intercomTheme11.getColors(c1086g, i212).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar16;
                    TextKt.c(annotatedString10, null, intercomTheme11.getColors(c1086g, i212).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme11.getTypography(c1086g, i212).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar17 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA11 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA11, "fromHtml(...)");
                    C1260a annotatedString11 = BlockExtensionsKt.toAnnotatedString(spannedA11, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS12 = W.s(W.d(hVar17, 1.0f));
                    T tA12 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086g.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086g, hVarS12);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P13);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC13);
                    Painter painterA12 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i213 = IntercomTheme.$stable;
                    IconKt.a(painterA12, null, null, intercomTheme12.getColors(c1086g, i213).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar17;
                    TextKt.c(annotatedString11, null, intercomTheme12.getColors(c1086g, i213).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme12.getTypography(c1086g, i213).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar18 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA12 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA12, "fromHtml(...)");
                    C1260a annotatedString12 = BlockExtensionsKt.toAnnotatedString(spannedA12, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS13 = W.s(W.d(hVar18, 1.0f));
                    T tA13 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P14 = c1086g.P();
                    androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086g, hVarS13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P14);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC14);
                    Painter painterA13 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i214 = IntercomTheme.$stable;
                    IconKt.a(painterA13, null, null, intercomTheme13.getColors(c1086g, i214).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar18;
                    TextKt.c(annotatedString12, null, intercomTheme13.getColors(c1086g, i214).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme13.getTypography(c1086g, i214).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar19 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA13 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA13, "fromHtml(...)");
                    C1260a annotatedString13 = BlockExtensionsKt.toAnnotatedString(spannedA13, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS14 = W.s(W.d(hVar19, 1.0f));
                    T tA14 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086g.P();
                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086g, hVarS14);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA14);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P15);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC15);
                    Painter painterA14 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                    int i215 = IntercomTheme.$stable;
                    IconKt.a(painterA14, null, null, intercomTheme14.getColors(c1086g, i215).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar19;
                    TextKt.c(annotatedString13, null, intercomTheme14.getColors(c1086g, i215).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme14.getTypography(c1086g, i215).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                str3 = str;
                if (c1086gP.K(str3)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    str4 = str2;
                    if (c1086gP.K(str4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 374491) == 74898) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar110 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA14 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA14, "fromHtml(...)");
                        C1260a annotatedString14 = BlockExtensionsKt.toAnnotatedString(spannedA14, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS15 = W.s(W.d(hVar110, 1.0f));
                        T tA15 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086g.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086g, hVarS15);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA15);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P16);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC16);
                        Painter painterA15 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                        int i216 = IntercomTheme.$stable;
                        IconKt.a(painterA15, null, null, intercomTheme15.getColors(c1086g, i216).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar110;
                        TextKt.c(annotatedString14, null, intercomTheme15.getColors(c1086g, i216).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme15.getTypography(c1086g, i216).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar111 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA15 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA15, "fromHtml(...)");
                        C1260a annotatedString15 = BlockExtensionsKt.toAnnotatedString(spannedA15, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS16 = W.s(W.d(hVar111, 1.0f));
                        T tA16 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P17 = c1086g.P();
                        androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086g, hVarS16);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA16);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P17);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC17);
                        Painter painterA16 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        int i217 = IntercomTheme.$stable;
                        IconKt.a(painterA16, null, null, intercomTheme16.getColors(c1086g, i217).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar111;
                        TextKt.c(annotatedString15, null, intercomTheme16.getColors(c1086g, i217).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme16.getTypography(c1086g, i217).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i19 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i15 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (str5 != null) {
                        androidx.compose.ui.h hVar112 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA16 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA16, "fromHtml(...)");
                        C1260a annotatedString16 = BlockExtensionsKt.toAnnotatedString(spannedA16, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS17 = W.s(W.d(hVar112, 1.0f));
                        T tA17 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P18 = c1086g.P();
                        androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086g, hVarS17);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA17);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P18);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC18);
                        Painter painterA17 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                        int i218 = IntercomTheme.$stable;
                        IconKt.a(painterA17, null, null, intercomTheme17.getColors(c1086g, i218).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar112;
                        TextKt.c(annotatedString16, null, intercomTheme17.getColors(c1086g, i218).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme17.getTypography(c1086g, i218).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    } else {
                        androidx.compose.ui.h hVar113 = hVar3;
                        c1086g = c1086gP;
                        c1086g.L(1098677964);
                        lowerCase = statusText.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                            c1086g.L(1098747900);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        } else {
                            c1086g.L(1098996489);
                            charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                            c1086g.T(false);
                        }
                        Spanned spannedA17 = p307z0.b.a(charSequence.toString(), 0);
                        kotlin.jvm.internal.i.d(spannedA17, "fromHtml(...)");
                        C1260a annotatedString17 = BlockExtensionsKt.toAnnotatedString(spannedA17, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                        androidx.compose.ui.h hVarS18 = W.s(W.d(hVar113, 1.0f));
                        T tA18 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                        i18 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P19 = c1086g.P();
                        androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086g, hVarS18);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar2);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA18);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P19);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O) {
                            J4.i.d(i18, c1086g, i18, pVar);
                        } else {
                            J4.i.d(i18, c1086g, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC19);
                        Painter painterA18 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                        IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                        int i219 = IntercomTheme.$stable;
                        IconKt.a(painterA18, null, null, intercomTheme18.getColors(c1086g, i219).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                        Lb.a.a(c1086g, W.q(aVar, 8));
                        hVar4 = hVar113;
                        TextKt.c(annotatedString17, null, intercomTheme18.getColors(c1086g, i219).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme18.getTypography(c1086g, i219).getType04Point5(), c1086g, 0, 0, 131066);
                        c1086g.T(true);
                        c1086g.T(false);
                    }
                    str7 = str5;
                    str8 = str6;
                    hVar5 = hVar4;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 196608;
            str4 = str2;
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar114 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA18 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA18, "fromHtml(...)");
                    C1260a annotatedString18 = BlockExtensionsKt.toAnnotatedString(spannedA18, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS19 = W.s(W.d(hVar114, 1.0f));
                    T tA19 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086g.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086g, hVarS19);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P110);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC110);
                    Painter painterA19 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                    int i2110 = IntercomTheme.$stable;
                    IconKt.a(painterA19, null, null, intercomTheme19.getColors(c1086g, i2110).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar114;
                    TextKt.c(annotatedString18, null, intercomTheme19.getColors(c1086g, i2110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme19.getTypography(c1086g, i2110).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar115 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA19 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA19, "fromHtml(...)");
                    C1260a annotatedString19 = BlockExtensionsKt.toAnnotatedString(spannedA19, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS110 = W.s(W.d(hVar115, 1.0f));
                    T tA110 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086g.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086g, hVarS110);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P111);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC111);
                    Painter painterA110 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                    int i2111 = IntercomTheme.$stable;
                    IconKt.a(painterA110, null, null, intercomTheme110.getColors(c1086g, i2111).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar115;
                    TextKt.c(annotatedString19, null, intercomTheme110.getColors(c1086g, i2111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme110.getTypography(c1086g, i2111).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar116 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA110 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA110, "fromHtml(...)");
                    C1260a annotatedString110 = BlockExtensionsKt.toAnnotatedString(spannedA110, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS111 = W.s(W.d(hVar116, 1.0f));
                    T tA111 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P112 = c1086g.P();
                    androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086g, hVarS111);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA111);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P112);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC112);
                    Painter painterA111 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    int i2112 = IntercomTheme.$stable;
                    IconKt.a(painterA111, null, null, intercomTheme111.getColors(c1086g, i2112).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar116;
                    TextKt.c(annotatedString110, null, intercomTheme111.getColors(c1086g, i2112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme111.getTypography(c1086g, i2112).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar117 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA111 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA111, "fromHtml(...)");
                    C1260a annotatedString111 = BlockExtensionsKt.toAnnotatedString(spannedA111, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS112 = W.s(W.d(hVar117, 1.0f));
                    T tA112 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P113 = c1086g.P();
                    androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086g, hVarS112);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA112);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P113);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC113);
                    Painter painterA112 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                    int i2113 = IntercomTheme.$stable;
                    IconKt.a(painterA112, null, null, intercomTheme112.getColors(c1086g, i2113).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar117;
                    TextKt.c(annotatedString111, null, intercomTheme112.getColors(c1086g, i2113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme112.getTypography(c1086g, i2113).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        str3 = str;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                str4 = str2;
                if (c1086gP.K(str4)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((i17 & 374491) == 74898) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar118 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA112 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA112, "fromHtml(...)");
                    C1260a annotatedString112 = BlockExtensionsKt.toAnnotatedString(spannedA112, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS113 = W.s(W.d(hVar118, 1.0f));
                    T tA113 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086g.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086g, hVarS113);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA113);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P114);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC114);
                    Painter painterA113 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                    int i2114 = IntercomTheme.$stable;
                    IconKt.a(painterA113, null, null, intercomTheme113.getColors(c1086g, i2114).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar118;
                    TextKt.c(annotatedString112, null, intercomTheme113.getColors(c1086g, i2114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme113.getTypography(c1086g, i2114).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar119 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA113 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA113, "fromHtml(...)");
                    C1260a annotatedString113 = BlockExtensionsKt.toAnnotatedString(spannedA113, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS114 = W.s(W.d(hVar119, 1.0f));
                    T tA114 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086g.P();
                    androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086g, hVarS114);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA114);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P115);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC115);
                    Painter painterA114 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    int i2115 = IntercomTheme.$stable;
                    IconKt.a(painterA114, null, null, intercomTheme114.getColors(c1086g, i2115).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar119;
                    TextKt.c(annotatedString113, null, intercomTheme114.getColors(c1086g, i2115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme114.getTypography(c1086g, i2115).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i19 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i15 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (str5 != null) {
                    androidx.compose.ui.h hVar1110 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA114 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA114, "fromHtml(...)");
                    C1260a annotatedString114 = BlockExtensionsKt.toAnnotatedString(spannedA114, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS115 = W.s(W.d(hVar1110, 1.0f));
                    T tA115 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P116 = c1086g.P();
                    androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086g, hVarS115);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA115);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P116);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC116);
                    Painter painterA115 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                    int i2116 = IntercomTheme.$stable;
                    IconKt.a(painterA115, null, null, intercomTheme115.getColors(c1086g, i2116).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar1110;
                    TextKt.c(annotatedString114, null, intercomTheme115.getColors(c1086g, i2116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme115.getTypography(c1086g, i2116).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                } else {
                    androidx.compose.ui.h hVar1111 = hVar3;
                    c1086g = c1086gP;
                    c1086g.L(1098677964);
                    lowerCase = statusText.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                        c1086g.L(1098747900);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    } else {
                        c1086g.L(1098996489);
                        charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                        c1086g.T(false);
                    }
                    Spanned spannedA115 = p307z0.b.a(charSequence.toString(), 0);
                    kotlin.jvm.internal.i.d(spannedA115, "fromHtml(...)");
                    C1260a annotatedString115 = BlockExtensionsKt.toAnnotatedString(spannedA115, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                    androidx.compose.ui.h hVarS116 = W.s(W.d(hVar1111, 1.0f));
                    T tA116 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                    i18 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P117 = c1086g.P();
                    androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086g, hVarS116);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar2);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA116);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P117);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i18, c1086g, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086g, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC117);
                    Painter painterA116 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                    IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                    int i2117 = IntercomTheme.$stable;
                    IconKt.a(painterA116, null, null, intercomTheme116.getColors(c1086g, i2117).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                    Lb.a.a(c1086g, W.q(aVar, 8));
                    hVar4 = hVar1111;
                    TextKt.c(annotatedString115, null, intercomTheme116.getColors(c1086g, i2117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme116.getTypography(c1086g, i2117).getType04Point5(), c1086g, 0, 0, 131066);
                    c1086g.T(true);
                    c1086g.T(false);
                }
                str7 = str5;
                str8 = str6;
                hVar5 = hVar4;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 196608;
        str4 = str2;
        i17 = i12;
        if ((i17 & 374491) == 74898) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i19 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i15 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (str5 != null) {
                androidx.compose.ui.h hVar1112 = hVar3;
                c1086g = c1086gP;
                c1086g.L(1098677964);
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                    c1086g.L(1098747900);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                } else {
                    c1086g.L(1098996489);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                }
                Spanned spannedA116 = p307z0.b.a(charSequence.toString(), 0);
                kotlin.jvm.internal.i.d(spannedA116, "fromHtml(...)");
                C1260a annotatedString116 = BlockExtensionsKt.toAnnotatedString(spannedA116, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                androidx.compose.ui.h hVarS117 = W.s(W.d(hVar1112, 1.0f));
                T tA117 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                i18 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086g.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086g, hVarS117);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar2);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA117);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P118);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i18, c1086g, i18, pVar);
                } else {
                    J4.i.d(i18, c1086g, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC118);
                Painter painterA117 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                int i2118 = IntercomTheme.$stable;
                IconKt.a(painterA117, null, null, intercomTheme117.getColors(c1086g, i2118).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                Lb.a.a(c1086g, W.q(aVar, 8));
                hVar4 = hVar1112;
                TextKt.c(annotatedString116, null, intercomTheme117.getColors(c1086g, i2118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme117.getTypography(c1086g, i2118).getType04Point5(), c1086g, 0, 0, 131066);
                c1086g.T(true);
                c1086g.T(false);
            } else {
                androidx.compose.ui.h hVar1113 = hVar3;
                c1086g = c1086gP;
                c1086g.L(1098677964);
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                    c1086g.L(1098747900);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                } else {
                    c1086g.L(1098996489);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                }
                Spanned spannedA117 = p307z0.b.a(charSequence.toString(), 0);
                kotlin.jvm.internal.i.d(spannedA117, "fromHtml(...)");
                C1260a annotatedString117 = BlockExtensionsKt.toAnnotatedString(spannedA117, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                androidx.compose.ui.h hVarS118 = W.s(W.d(hVar1113, 1.0f));
                T tA118 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                i18 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086g.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086g, hVarS118);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar2);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P119);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i18, c1086g, i18, pVar);
                } else {
                    J4.i.d(i18, c1086g, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC119);
                Painter painterA118 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                int i2119 = IntercomTheme.$stable;
                IconKt.a(painterA118, null, null, intercomTheme118.getColors(c1086g, i2119).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                Lb.a.a(c1086g, W.q(aVar, 8));
                hVar4 = hVar1113;
                TextKt.c(annotatedString117, null, intercomTheme118.getColors(c1086g, i2119).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme118.getTypography(c1086g, i2119).getType04Point5(), c1086g, 0, 0, 131066);
                c1086g.T(true);
                c1086g.T(false);
            }
            str7 = str5;
            str8 = str6;
            hVar5 = hVar4;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i19 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i15 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (str5 != null) {
                androidx.compose.ui.h hVar1114 = hVar3;
                c1086g = c1086gP;
                c1086g.L(1098677964);
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                    c1086g.L(1098747900);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                } else {
                    c1086g.L(1098996489);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                }
                Spanned spannedA118 = p307z0.b.a(charSequence.toString(), 0);
                kotlin.jvm.internal.i.d(spannedA118, "fromHtml(...)");
                C1260a annotatedString118 = BlockExtensionsKt.toAnnotatedString(spannedA118, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                androidx.compose.ui.h hVarS119 = W.s(W.d(hVar1114, 1.0f));
                T tA119 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                i18 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1110 = c1086g.P();
                androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086g, hVarS119);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar2);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA119);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P1110);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i18, c1086g, i18, pVar);
                } else {
                    J4.i.d(i18, c1086g, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC1110);
                Painter painterA119 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                int i21110 = IntercomTheme.$stable;
                IconKt.a(painterA119, null, null, intercomTheme119.getColors(c1086g, i21110).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                Lb.a.a(c1086g, W.q(aVar, 8));
                hVar4 = hVar1114;
                TextKt.c(annotatedString118, null, intercomTheme119.getColors(c1086g, i21110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme119.getTypography(c1086g, i21110).getType04Point5(), c1086g, 0, 0, 131066);
                c1086g.T(true);
                c1086g.T(false);
            } else {
                androidx.compose.ui.h hVar1115 = hVar3;
                c1086g = c1086gP;
                c1086g.L(1098677964);
                lowerCase = statusText.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                if (eventStatus.equals(MetricTracker.Action.SUBMITTED)) {
                    c1086g.L(1098747900);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                } else {
                    c1086g.L(1098996489);
                    charSequence = Phrase.from((Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", time).format();
                    c1086g.T(false);
                }
                Spanned spannedA119 = p307z0.b.a(charSequence.toString(), 0);
                kotlin.jvm.internal.i.d(spannedA119, "fromHtml(...)");
                C1260a annotatedString119 = BlockExtensionsKt.toAnnotatedString(spannedA119, (Context) c1086g.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                androidx.compose.ui.h hVarS1110 = W.s(W.d(hVar1115, 1.0f));
                T tA1110 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086g, 54);
                i18 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111 = c1086g.P();
                androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086g, hVarS1110);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar2);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, tA1110);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P1111);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i18, c1086g, i18, pVar);
                } else {
                    J4.i.d(i18, c1086g, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC1111);
                Painter painterA1110 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, c1086g, 0);
                IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                int i21111 = IntercomTheme.$stable;
                IconKt.a(painterA1110, null, null, intercomTheme1110.getColors(c1086g, i21111).m630getDescriptionText0d7_KjU(), c1086g, 56, 4);
                Lb.a.a(c1086g, W.q(aVar, 8));
                hVar4 = hVar1115;
                TextKt.c(annotatedString119, null, intercomTheme1110.getColors(c1086g, i21111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme1110.getTypography(c1086g, i21111).getType04Point5(), c1086g, 0, 0, 131066);
                c1086g.T(true);
                c1086g.T(false);
            }
            str7 = str5;
            str8 = str6;
            hVar5 = hVar4;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.I
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketStatusRowKt.TicketStatusRow$lambda$3(eventStatus, statusText, time, hVar5, str7, str8, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketStatusRow$lambda$3(String eventStatus, String statusText, String time, androidx.compose.ui.h hVar, String str, String str2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(eventStatus, "$eventStatus");
        kotlin.jvm.internal.i.e(statusText, "$statusText");
        kotlin.jvm.internal.i.e(time, "$time");
        TicketStatusRow(eventStatus, statusText, time, hVar, str, str2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
