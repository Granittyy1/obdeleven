package io.intercom.android.sdk.survey.ui.components.validation;

import Ia.p;
import L4.b;
import android.content.Context;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.components.icons.ErrorKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ValidationErrorComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ValidationErrorComponentKt {
    public static final void ErrorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1851250451);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ValidationErrorComponentKt.INSTANCE.m405getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ErrorPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorPreview(interfaceC1084f, b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: renamed from: ValidationErrorComponent-FNF3uiM, reason: not valid java name */
    public static final void m406ValidationErrorComponentFNF3uiM(h hVar, final ValidationError.ValidationStringError validationStringError, final long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        i.e(validationStringError, "validationStringError");
        C1086g c1086gP = interfaceC1084f.p(-1195832801);
        int i12 = i11 & 1;
        h.a aVar = h.a.f13984b;
        final h hVar2 = i12 != 0 ? aVar : hVar;
        float f10 = 2;
        h hVarJ = PaddingKt.j(W.d(hVar2, 1.0f), 0.0f, f10, 0.0f, f10, 5);
        T tA = S.a(C0945e.f10284a, d.a.f13344k, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        IconKt.b(ErrorKt.getError(p282x.a.f47838a), null, W.q(aVar, 16), j, c1086gP, ((i10 << 3) & 7168) | 432, 0);
        Phrase phraseFrom = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), validationStringError.getStringRes());
        Iterator<T> it = validationStringError.getParams().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            phraseFrom.put((String) pair.c(), (CharSequence) pair.d());
        }
        TextKt.b(phraseFrom.format().toString(), PaddingKt.j(W.d(aVar, 1.0f), 4, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, (i10 & 896) | 48, 0, 65528);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.validation.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ValidationErrorComponentKt.ValidationErrorComponent_FNF3uiM$lambda$2(hVar2, validationStringError, j, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ValidationErrorComponent_FNF3uiM$lambda$2(h hVar, ValidationError.ValidationStringError validationStringError, long j, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(validationStringError, "$validationStringError");
        m406ValidationErrorComponentFNF3uiM(hVar, validationStringError, j, interfaceC1084f, b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
