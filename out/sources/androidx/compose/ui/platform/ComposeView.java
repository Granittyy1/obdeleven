package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f14838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14839c;

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(420213850);
        Ia.p pVar = (Ia.p) this.f14838b.getValue();
        if (pVar == null) {
            interfaceC1084f.L(358356153);
        } else {
            interfaceC1084f.L(150107208);
            pVar.invoke(interfaceC1084f, 0);
        }
        interfaceC1084f.D();
        interfaceC1084f.D();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14839c;
    }

    public final void setContent(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
        this.f14839c = true;
        this.f14838b.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
        this.f14838b = androidx.compose.runtime.J0.f(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
