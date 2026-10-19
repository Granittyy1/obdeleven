package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements Ia.p<androidx.compose.runtime.saveable.j, Long, Long> {
    final /* synthetic */ androidx.compose.foundation.text.selection.r $selectionRegistrar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(androidx.compose.foundation.text.selection.r rVar) {
        super(2);
        this.$selectionRegistrar = rVar;
    }

    @Override // Ia.p
    public final Long invoke(androidx.compose.runtime.saveable.j jVar, Long l10) {
        long jLongValue = l10.longValue();
        if (SelectionRegistrarKt.a(this.$selectionRegistrar, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
