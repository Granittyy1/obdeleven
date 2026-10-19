package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.h;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import androidx.compose.ui.node.C1190k;

/* JADX INFO: compiled from: StylusHandwriting.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1190k f11260a;

    static {
        float f10 = 40;
        float f11 = 10;
        f11260a = new C1190k(f11, f10, f11, f10);
    }

    public static final h a(boolean z10, boolean z11, Ia.a aVar) {
        h stylusHoverIconModifierElement = h.a.f13984b;
        if (!z10 || !b.f11261a) {
            return stylusHoverIconModifierElement;
        }
        if (z11) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f11260a);
        }
        return stylusHoverIconModifierElement.i(new StylusHandwritingElement(aVar));
    }
}
