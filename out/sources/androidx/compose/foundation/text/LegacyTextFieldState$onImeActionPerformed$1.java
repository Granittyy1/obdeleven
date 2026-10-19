package androidx.compose.foundation.text;

import androidx.compose.ui.platform.M0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyTextFieldState$onImeActionPerformed$1 extends Lambda implements Ia.l<androidx.compose.ui.text.input.k, p293xa.r> {
    final /* synthetic */ LegacyTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onImeActionPerformed$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.this$0 = legacyTextFieldState;
    }

    @Override // Ia.l
    public final p293xa.r invoke(androidx.compose.ui.text.input.k kVar) {
        Ia.l<InterfaceC1000i, p293xa.r> lVar;
        p293xa.r rVar;
        M0 m7;
        int i10 = kVar.f15548a;
        C0999h c0999h = this.this$0.f11193r;
        c0999h.getClass();
        if (androidx.compose.ui.text.input.k.a(i10, 7)) {
            lVar = c0999h.a().f11345a;
        } else if (androidx.compose.ui.text.input.k.a(i10, 2)) {
            lVar = c0999h.a().f11346b;
        } else if (androidx.compose.ui.text.input.k.a(i10, 6)) {
            lVar = c0999h.a().f11347c;
        } else if (androidx.compose.ui.text.input.k.a(i10, 5)) {
            lVar = c0999h.a().f11348d;
        } else if (androidx.compose.ui.text.input.k.a(i10, 3)) {
            lVar = c0999h.a().f11349e;
        } else if (androidx.compose.ui.text.input.k.a(i10, 4)) {
            lVar = c0999h.a().f11350f;
        } else {
            if (!(androidx.compose.ui.text.input.k.a(i10, 1) ? true : androidx.compose.ui.text.input.k.a(i10, 0))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(c0999h);
            rVar = p293xa.r.f47939a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            if (androidx.compose.ui.text.input.k.a(i10, 6)) {
                androidx.compose.ui.focus.n nVar = c0999h.f11254c;
                if (nVar == null) {
                    kotlin.jvm.internal.i.m("focusManager");
                    throw null;
                }
                nVar.o(1);
            } else if (androidx.compose.ui.text.input.k.a(i10, 5)) {
                androidx.compose.ui.focus.n nVar2 = c0999h.f11254c;
                if (nVar2 == null) {
                    kotlin.jvm.internal.i.m("focusManager");
                    throw null;
                }
                nVar2.o(2);
            } else if (androidx.compose.ui.text.input.k.a(i10, 7) && (m7 = c0999h.f11252a) != null) {
                m7.b();
            }
        }
        return p293xa.r.f47939a;
    }
}
