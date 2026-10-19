package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* JADX INFO: compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class U {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, X x10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return hVar.i(new LegacyAdaptingPlatformTextInputModifier(x10, legacyTextFieldState, textFieldSelectionManager));
    }
}
