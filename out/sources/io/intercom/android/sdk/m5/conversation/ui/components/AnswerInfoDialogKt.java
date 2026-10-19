package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: AnswerInfoDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AnswerInfoDialogKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$AnswerInfoDialog$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnswerInfoDialog.kt */
    public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AiAnswerInfo $info;
        final /* synthetic */ IntercomColors $intercomColors;
        final /* synthetic */ Ia.a<p293xa.r> $onDismiss;

        public AnonymousClass2(IntercomColors intercomColors, AiAnswerInfo aiAnswerInfo, Ia.a<p293xa.r> aVar, Context context) {
            this.$intercomColors = intercomColors;
            this.$info = aiAnswerInfo;
            this.$onDismiss = aVar;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2$lambda$0(Ia.a aVar, AiAnswerInfo info, Context context) {
            kotlin.jvm.internal.i.e(info, "$info");
            kotlin.jvm.internal.i.e(context, "$context");
            aVar.invoke();
            LinkOpener.handleUrl(info.getUrl(), context, Injector.get().getApi());
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarB = C0932d.b(aVar, this.$intercomColors.m621getBackground0d7_KjU(), p270w.g.b(10));
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
            final AiAnswerInfo aiAnswerInfo = this.$info;
            final Ia.a<p293xa.r> aVar3 = this.$onDismiss;
            final Context context = this.$context;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar2, interfaceC1084f, 48);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, interfaceC1084f, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, interfaceC1084f, hVarC);
            float f10 = 24;
            float f11 = 16;
            androidx.compose.ui.h hVarG = PaddingKt.g(f10, f11, aVar);
            String text = aiAnswerInfo.getText();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TextKt.b(text, hVarG, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04(), interfaceC1084f, 48, 0, 65532);
            interfaceC1084f.L(1930856679);
            String url = aiAnswerInfo.getUrl();
            if (url != null && url.length() != 0) {
                IntercomDividerKt.IntercomDivider(null, interfaceC1084f, 0, 1);
                androidx.compose.ui.h hVarG2 = PaddingKt.g(f10, f11, androidx.compose.foundation.layout.W.d(ClickableKt.c(aVar, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.c
                    @Override // Ia.a
                    public final Object invoke() {
                        return AnswerInfoDialogKt.AnonymousClass2.invoke$lambda$2$lambda$0(aVar3, aiAnswerInfo, context);
                    }
                }, 7), 1.0f));
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, interfaceC1084f, 54);
                int iF2 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarG2);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar, interfaceC1084f, tA);
                R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar3);
                }
                R0.a(pVar4, interfaceC1084f, hVarC2);
                androidx.compose.ui.text.F fA = androidx.compose.ui.text.F.a(intercomTheme.getTypography(interfaceC1084f, i11).getType04(), 0L, 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777211);
                long j = androidx.compose.ui.graphics.H.f13495b;
                TextKt.b("Learn more", null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fA, interfaceC1084f, 390, 0, 65530);
                Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.m(aVar, 8));
                IconKt.a(U.c.a(R.drawable.intercom_external_link, interfaceC1084f, 0), null, androidx.compose.foundation.layout.W.m(aVar, f11), j, interfaceC1084f, 3512, 0);
                interfaceC1084f.J();
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    public static final void AnswerInfoDialog(final AiAnswerInfo info, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.i.e(info, "info");
        C1086g c1086gP = interfaceC1084f.p(-1053952237);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(info) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                aVar = new C2327a();
            }
            AndroidDialog_androidKt.a(aVar, null, androidx.compose.runtime.internal.a.b(-890896278, new AnonymousClass2((IntercomColors) c1086gP.x(IntercomColorsKt.getLocalIntercomColors()), info, aVar, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), c1086gP), c1086gP, ((i12 >> 3) & 14) | 384, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AnswerInfoDialogKt.AnswerInfoDialog$lambda$1(info, aVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AnswerInfoDialog$lambda$1(AiAnswerInfo info, Ia.a aVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(info, "$info");
        AnswerInfoDialog(info, aVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void AnswerInfoDialogPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1630534767);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct.", "https://www.intercom.com"), null, c1086gP, 0, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AnswerInfoDialogPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AnswerInfoDialogPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void AnswerInfoWithoutExternalLinkPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1688173056);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct.", null), null, c1086gP, 0, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AnswerInfoWithoutExternalLinkPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AnswerInfoWithoutExternalLinkPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
