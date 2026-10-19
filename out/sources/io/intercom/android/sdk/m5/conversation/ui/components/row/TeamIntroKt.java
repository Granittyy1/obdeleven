package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1260a;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TeamIntro.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamIntroKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void TeamIntro(final String text, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.h hVar2;
        androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(673666815);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c1086gP.s()) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                Spanned spannedA = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
                C1260a annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                TextKt.c(annotatedString, hVar3, 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(c1086gP, i14).getType04Point5(), intercomTheme.getColors(c1086gP, i14).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 130556);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.H
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeamIntroKt.TeamIntro$lambda$0(text, hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            Spanned spannedA2 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA2, "fromHtml(...)");
            C1260a annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            TextKt.c(annotatedString2, hVar3, 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, androidx.compose.ui.text.F.a(intercomTheme2.getTypography(c1086gP, i15).getType04Point5(), intercomTheme2.getColors(c1086gP, i15).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 130556);
            hVar2 = hVar3;
        } else {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            Spanned spannedA3 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA3, "fromHtml(...)");
            C1260a annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            TextKt.c(annotatedString3, hVar3, 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, androidx.compose.ui.text.F.a(intercomTheme3.getTypography(c1086gP, i16).getType04Point5(), intercomTheme3.getColors(c1086gP, i16).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 130556);
            hVar2 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.H
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamIntroKt.TeamIntro$lambda$0(text, hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamIntro$lambda$0(String text, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        TeamIntro(text, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TeamIntroPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(825513769);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamIntroKt.INSTANCE.m241getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamIntroPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeamIntroPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
