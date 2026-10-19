package androidx.compose.foundation.text;

import androidx.compose.ui.text.C1260a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextLinkScope.kt */
/* JADX INFO: loaded from: classes.dex */
final class TextLinkScope$shouldMeasureLinks$1 extends Lambda implements Ia.a<Boolean> {
    final /* synthetic */ TextLinkScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$shouldMeasureLinks$1(TextLinkScope textLinkScope) {
        super(0);
        this.this$0 = textLinkScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ia.a
    public final Boolean invoke() {
        androidx.compose.ui.text.A a10;
        TextLinkScope textLinkScope = this.this$0;
        C1260a c1260a = textLinkScope.f11235b;
        androidx.compose.ui.text.B b10 = (androidx.compose.ui.text.B) textLinkScope.f11234a.getValue();
        return Boolean.valueOf(kotlin.jvm.internal.i.a(c1260a, (b10 == null || (a10 = b10.f15300a) == null) ? null : a10.f15276a));
    }
}
