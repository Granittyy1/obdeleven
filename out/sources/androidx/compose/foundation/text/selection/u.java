package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.A;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.text.E;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u implements androidx.compose.foundation.text.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f11626a;

    public u(TextFieldSelectionManager textFieldSelectionManager) {
        this.f11626a = textFieldSelectionManager;
    }

    @Override // androidx.compose.foundation.text.t
    public final void a() {
        TextFieldSelectionManager textFieldSelectionManager = this.f11626a;
        TextFieldSelectionManager.a(textFieldSelectionManager, null);
        textFieldSelectionManager.f11569s.setValue(null);
    }

    @Override // androidx.compose.foundation.text.t
    public final void b(long j) {
        A aD;
        TextFieldSelectionManager textFieldSelectionManager = this.f11626a;
        long jA = n.a(textFieldSelectionManager.k(true));
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null) {
            return;
        }
        long jE = aD.e(jA);
        textFieldSelectionManager.f11565o = jE;
        textFieldSelectionManager.f11569s.setValue(new I.d(jE));
        textFieldSelectionManager.f11567q = 0L;
        textFieldSelectionManager.f11568r.setValue(Handle.f11113b);
        textFieldSelectionManager.r(false);
    }

    @Override // androidx.compose.foundation.text.t
    public final void c() {
        TextFieldSelectionManager textFieldSelectionManager = this.f11626a;
        TextFieldSelectionManager.a(textFieldSelectionManager, null);
        textFieldSelectionManager.f11569s.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.text.t
    public final void e(long j) {
        A aD;
        M.a aVar;
        TextFieldSelectionManager textFieldSelectionManager = this.f11626a;
        textFieldSelectionManager.f11567q = I.d.g(textFieldSelectionManager.f11567q, j);
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null) {
            return;
        }
        textFieldSelectionManager.f11569s.setValue(new I.d(I.d.g(textFieldSelectionManager.f11565o, textFieldSelectionManager.f11567q)));
        androidx.compose.ui.text.input.r rVar = textFieldSelectionManager.f11553b;
        I.d dVarH = textFieldSelectionManager.h();
        kotlin.jvm.internal.i.b(dVarH);
        int iA = rVar.a(aD.b(dVarH.f3754a, true));
        long jB = O.h.b(iA, iA);
        if (E.a(jB, textFieldSelectionManager.l().f15492b)) {
            return;
        }
        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
        if ((legacyTextFieldState2 == null || ((Boolean) legacyTextFieldState2.f11192q.getValue()).booleanValue()) && (aVar = textFieldSelectionManager.f11561k) != null) {
            aVar.a(9);
        }
        textFieldSelectionManager.f11554c.invoke(TextFieldSelectionManager.d(textFieldSelectionManager.l().f15491a, jB));
    }

    @Override // androidx.compose.foundation.text.t
    public final void d() {
    }

    @Override // androidx.compose.foundation.text.t
    public final void onCancel() {
    }
}
