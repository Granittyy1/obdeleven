package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements Ia.l<List<? extends androidx.compose.ui.text.input.g>, p293xa.r> {
    final /* synthetic */ androidx.compose.ui.text.input.h $editProcessor;
    final /* synthetic */ Ia.l<TextFieldValue, p293xa.r> $onValueChange;
    final /* synthetic */ Ref$ObjectRef<androidx.compose.ui.text.input.C> $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldDelegate$Companion$restartInput$1(androidx.compose.ui.text.input.h hVar, Ia.l<? super TextFieldValue, p293xa.r> lVar, Ref$ObjectRef<androidx.compose.ui.text.input.C> ref$ObjectRef) {
        super(1);
        this.$editProcessor = hVar;
        this.$onValueChange = lVar;
        this.$session = ref$ObjectRef;
    }

    @Override // Ia.l
    public final p293xa.r invoke(List<? extends androidx.compose.ui.text.input.g> list) {
        androidx.compose.ui.text.input.h hVar = this.$editProcessor;
        Ia.l<TextFieldValue, p293xa.r> lVar = this.$onValueChange;
        androidx.compose.ui.text.input.C c10 = this.$session.element;
        TextFieldValue textFieldValueA = hVar.a(list);
        if (c10 != null) {
            c10.a(null, textFieldValueA);
        }
        lVar.invoke(textFieldValueA);
        return p293xa.r.f47939a;
    }
}
