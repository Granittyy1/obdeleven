package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1203y;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.input.TextFieldValue;

/* JADX INFO: compiled from: CoreTextFieldSemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends androidx.compose.ui.node.H<CoreTextFieldSemanticsModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.text.input.D f11267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextFieldValue f11268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LegacyTextFieldState f11269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.ui.text.input.r f11272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextFieldSelectionManager f11273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.text.input.l f11274i;
    public final FocusRequester j;

    public CoreTextFieldSemanticsModifier(androidx.compose.ui.text.input.D d10, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z10, boolean z11, androidx.compose.ui.text.input.r rVar, TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.l lVar, FocusRequester focusRequester) {
        this.f11267b = d10;
        this.f11268c = textFieldValue;
        this.f11269d = legacyTextFieldState;
        this.f11270e = z10;
        this.f11271f = z11;
        this.f11272g = rVar;
        this.f11273h = textFieldSelectionManager;
        this.f11274i = lVar;
        this.j = focusRequester;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        final CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = new CoreTextFieldSemanticsModifierNode();
        coreTextFieldSemanticsModifierNode.f11275r = this.f11267b;
        coreTextFieldSemanticsModifierNode.f11276s = this.f11268c;
        coreTextFieldSemanticsModifierNode.f11277t = this.f11269d;
        coreTextFieldSemanticsModifierNode.f11278u = this.f11270e;
        coreTextFieldSemanticsModifierNode.f11279v = this.f11271f;
        coreTextFieldSemanticsModifierNode.f11280w = this.f11272g;
        TextFieldSelectionManager textFieldSelectionManager = this.f11273h;
        coreTextFieldSemanticsModifierNode.f11281x = textFieldSelectionManager;
        coreTextFieldSemanticsModifierNode.f11282y = this.f11274i;
        coreTextFieldSemanticsModifierNode.f11283z = this.j;
        textFieldSelectionManager.f11558g = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
            public AnonymousClass1() {
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                androidx.compose.ui.autofill.b bVar;
                LayoutNode layoutNodeF = C1185f.f(CoreTextFieldSemanticsModifierNode.this);
                if (!layoutNodeF.f14418u && (bVar = ((AndroidComposeView) C1203y.a(layoutNodeF)).f14656F) != null) {
                    bVar.c(layoutNodeF);
                }
                return p293xa.r.f47939a;
            }
        };
        return coreTextFieldSemanticsModifierNode;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        final CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = (CoreTextFieldSemanticsModifierNode) cVar;
        boolean z10 = coreTextFieldSemanticsModifierNode.f11279v;
        boolean z11 = false;
        boolean z12 = z10 && !coreTextFieldSemanticsModifierNode.f11278u;
        androidx.compose.ui.text.input.l lVar = coreTextFieldSemanticsModifierNode.f11282y;
        TextFieldSelectionManager textFieldSelectionManager = coreTextFieldSemanticsModifierNode.f11281x;
        boolean z13 = this.f11270e;
        boolean z14 = this.f11271f;
        if (z14 && !z13) {
            z11 = true;
        }
        coreTextFieldSemanticsModifierNode.f11275r = this.f11267b;
        TextFieldValue textFieldValue = this.f11268c;
        coreTextFieldSemanticsModifierNode.f11276s = textFieldValue;
        coreTextFieldSemanticsModifierNode.f11277t = this.f11269d;
        coreTextFieldSemanticsModifierNode.f11278u = z13;
        coreTextFieldSemanticsModifierNode.f11279v = z14;
        coreTextFieldSemanticsModifierNode.f11280w = this.f11272g;
        TextFieldSelectionManager textFieldSelectionManager2 = this.f11273h;
        coreTextFieldSemanticsModifierNode.f11281x = textFieldSelectionManager2;
        androidx.compose.ui.text.input.l lVar2 = this.f11274i;
        coreTextFieldSemanticsModifierNode.f11282y = lVar2;
        coreTextFieldSemanticsModifierNode.f11283z = this.j;
        if (z14 != z10 || z11 != z12 || !kotlin.jvm.internal.i.a(lVar2, lVar) || !androidx.compose.ui.text.E.b(textFieldValue.f15492b)) {
            C1185f.f(coreTextFieldSemanticsModifierNode).P();
        }
        if (kotlin.jvm.internal.i.a(textFieldSelectionManager2, textFieldSelectionManager)) {
            return;
        }
        textFieldSelectionManager2.f11558g = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                androidx.compose.ui.autofill.b bVar;
                LayoutNode layoutNodeF = C1185f.f(coreTextFieldSemanticsModifierNode);
                if (!layoutNodeF.f14418u && (bVar = ((AndroidComposeView) C1203y.a(layoutNodeF)).f14656F) != null) {
                    bVar.c(layoutNodeF);
                }
                return p293xa.r.f47939a;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return kotlin.jvm.internal.i.a(this.f11267b, coreTextFieldSemanticsModifier.f11267b) && kotlin.jvm.internal.i.a(this.f11268c, coreTextFieldSemanticsModifier.f11268c) && kotlin.jvm.internal.i.a(this.f11269d, coreTextFieldSemanticsModifier.f11269d) && this.f11270e == coreTextFieldSemanticsModifier.f11270e && this.f11271f == coreTextFieldSemanticsModifier.f11271f && kotlin.jvm.internal.i.a(this.f11272g, coreTextFieldSemanticsModifier.f11272g) && kotlin.jvm.internal.i.a(this.f11273h, coreTextFieldSemanticsModifier.f11273h) && kotlin.jvm.internal.i.a(this.f11274i, coreTextFieldSemanticsModifier.f11274i) && kotlin.jvm.internal.i.a(this.j, coreTextFieldSemanticsModifier.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f11274i.hashCode() + ((this.f11273h.hashCode() + ((this.f11272g.hashCode() + androidx.compose.animation.D.b(androidx.compose.animation.D.b(androidx.compose.animation.D.b((this.f11269d.hashCode() + ((this.f11268c.hashCode() + (this.f11267b.hashCode() * 31)) * 31)) * 31, 31, this.f11270e), 31, this.f11271f), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f11267b + ", value=" + this.f11268c + ", state=" + this.f11269d + ", readOnly=" + this.f11270e + ", enabled=" + this.f11271f + ", isPassword=false, offsetMapping=" + this.f11272g + ", manager=" + this.f11273h + ", imeOptions=" + this.f11274i + ", focusRequester=" + this.j + ')';
    }
}
