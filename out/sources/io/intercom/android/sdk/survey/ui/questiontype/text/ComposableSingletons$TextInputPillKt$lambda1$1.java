package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$TextInputPillKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: TextInputPill.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TextInputPillKt$lambda1$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$TextInputPillKt$lambda1$1 INSTANCE = new ComposableSingletons$TextInputPillKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$1$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        androidx.compose.ui.h hVarF = PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
        int iF = interfaceC1084f.F();
        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarF);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        if (interfaceC1084f.u() == null) {
            I.b.k();
            throw null;
        }
        interfaceC1084f.r();
        if (interfaceC1084f.m()) {
            interfaceC1084f.v(aVar);
        } else {
            interfaceC1084f.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
            androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
        TextInputPillKt.m457TextInputPillg5ZjG94(null, "Enter text...", new e(), null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)).m357getButton0d7_KjU(), 0, false, null, 0, 0, false, null, false, 0.0f, interfaceC1084f, 432, 0, 16361);
        interfaceC1084f.J();
    }
}
