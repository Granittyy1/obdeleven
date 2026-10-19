package androidx.compose.foundation.text;

import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyTextFieldState$onValueChange$1 extends Lambda implements Ia.l<TextFieldValue, p293xa.r> {
    final /* synthetic */ LegacyTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onValueChange$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.this$0 = legacyTextFieldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ia.l
    public final p293xa.r invoke(TextFieldValue textFieldValue) {
        TextFieldValue textFieldValue2 = textFieldValue;
        String str = textFieldValue2.f15491a.f15408c;
        C1260a c1260a = this.this$0.j;
        if (!kotlin.jvm.internal.i.a(str, c1260a != null ? c1260a.f15408c : null)) {
            this.this$0.f11186k.setValue(HandleState.f11117b);
            if (((Boolean) this.this$0.f11195t.getValue()).booleanValue()) {
                this.this$0.f11195t.setValue(Boolean.FALSE);
            } else {
                this.this$0.f11194s.setValue(Boolean.FALSE);
            }
        }
        LegacyTextFieldState legacyTextFieldState = this.this$0;
        long j = androidx.compose.ui.text.E.f15314b;
        legacyTextFieldState.f(j);
        this.this$0.e(j);
        this.this$0.f11196u.invoke(textFieldValue2);
        this.this$0.f11178b.invalidate();
        return p293xa.r.f47939a;
    }
}
