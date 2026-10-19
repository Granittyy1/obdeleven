package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ArticleCountComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleCountComponentKt {
    public static final void ArticleCountComponent(androidx.compose.ui.h hVar, final int i10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        final androidx.compose.ui.h hVar2;
        int i13;
        CharSequence charSequence;
        C1086g c1086gP = interfaceC1084f.p(-731744304);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 14) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.h(i10) ? 32 : 16;
        }
        int i15 = i13;
        if ((i15 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVar3 = i14 != 0 ? androidx.compose.ui.h.a.f13984b : hVar2;
            if (i10 == 1) {
                c1086gP.L(1038713318);
                charSequence = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_single_article).format();
                c1086gP.T(false);
            } else {
                c1086gP.L(1038811929);
                charSequence = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_multiple_articles).put("total_articles", i10).format();
                c1086gP.T(false);
            }
            hVar2 = hVar3;
            TextKt.b(charSequence.toString(), hVar2, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), c1086gP, ((i15 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384, 0, 65528);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleCountComponentKt.ArticleCountComponent$lambda$0(hVar2, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleCountComponent$lambda$0(androidx.compose.ui.h hVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        ArticleCountComponent(hVar, i10, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ArticleCountComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1155458330);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m272getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ArticleCountComponentPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ArticleCountComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void SingleArticleCountComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1795936462);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m273getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SingleArticleCountComponentPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SingleArticleCountComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
