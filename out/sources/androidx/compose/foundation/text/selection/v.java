package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.A;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.text.input.TextFieldValue;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements androidx.compose.foundation.text.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11628b;

    public v(TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        this.f11627a = textFieldSelectionManager;
        this.f11628b = z10;
    }

    @Override // androidx.compose.foundation.text.t
    public final void a() {
        TextFieldSelectionManager textFieldSelectionManager = this.f11627a;
        TextFieldSelectionManager.a(textFieldSelectionManager, null);
        textFieldSelectionManager.f11569s.setValue(null);
        textFieldSelectionManager.r(true);
    }

    @Override // androidx.compose.foundation.text.t
    public final void c() {
        TextFieldSelectionManager textFieldSelectionManager = this.f11627a;
        TextFieldSelectionManager.a(textFieldSelectionManager, null);
        textFieldSelectionManager.f11569s.setValue(null);
        textFieldSelectionManager.r(true);
    }

    @Override // androidx.compose.foundation.text.t
    public final void d() {
        A aD;
        boolean z10 = this.f11628b;
        Handle handle = z10 ? Handle.f11114c : Handle.f11115d;
        TextFieldSelectionManager textFieldSelectionManager = this.f11627a;
        TextFieldSelectionManager.a(textFieldSelectionManager, handle);
        long jA = n.a(textFieldSelectionManager.k(z10));
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null) {
            return;
        }
        long jE = aD.e(jA);
        textFieldSelectionManager.f11565o = jE;
        textFieldSelectionManager.f11569s.setValue(new I.d(jE));
        textFieldSelectionManager.f11567q = 0L;
        textFieldSelectionManager.f11570t = -1;
        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.f11192q.setValue(Boolean.TRUE);
        }
        textFieldSelectionManager.r(false);
    }

    @Override // androidx.compose.foundation.text.t
    public final void e(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.f11627a;
        long jG = I.d.g(textFieldSelectionManager.f11567q, j);
        textFieldSelectionManager.f11567q = jG;
        textFieldSelectionManager.f11569s.setValue(new I.d(I.d.g(textFieldSelectionManager.f11565o, jG)));
        TextFieldValue textFieldValueL = textFieldSelectionManager.l();
        I.d dVarH = textFieldSelectionManager.h();
        kotlin.jvm.internal.i.b(dVarH);
        H6.c cVar = j.a.f11611d;
        TextFieldSelectionManager.b(textFieldSelectionManager, textFieldValueL, dVarH.f3754a, false, this.f11628b, cVar, true);
        textFieldSelectionManager.r(false);
    }

    @Override // androidx.compose.foundation.text.t
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.t
    public final void b(long j) {
    }
}
