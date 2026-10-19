package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1193n;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InterfaceC1256y0;
import androidx.compose.ui.platform.M0;

/* JADX INFO: compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T extends androidx.compose.ui.h.c implements InterfaceC1256y0, InterfaceC1182c, InterfaceC1193n, X.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X f11308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LegacyTextFieldState f11309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextFieldSelectionManager f11310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f11311s = J0.f(null);

    public T(X x10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.f11308p = x10;
        this.f11309q = legacyTextFieldState;
        this.f11310r = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        X x10 = this.f11308p;
        if (x10.f11328a != null) {
            p245u.c.c("Expected textInputModifierNode to be null");
        }
        x10.f11328a = this;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        this.f11308p.j(this);
    }

    public final M0 Q1() {
        return (M0) C1183d.a(this, CompositionLocalsKt.f14854p);
    }

    @Override // androidx.compose.foundation.text.input.internal.X.a
    public final InterfaceC1170p Y() {
        return (InterfaceC1170p) this.f11311s.getValue();
    }

    @Override // androidx.compose.ui.node.InterfaceC1193n
    public final void w1(NodeCoordinator nodeCoordinator) {
        this.f11311s.setValue(nodeCoordinator);
    }
}
