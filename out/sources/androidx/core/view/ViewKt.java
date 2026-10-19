package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewKt {
    public static final kotlin.sequences.j a(View view) {
        return new kotlin.sequences.j(new ViewKt$allViews$1(view, null));
    }

    public static final kotlin.sequences.g<ViewParent> b(View view) {
        return SequencesKt__SequencesKt.z(view.getParent(), ViewKt$ancestors$1.f16882b);
    }
}
