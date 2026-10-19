package p001a0;

import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.g;

/* JADX INFO: compiled from: PreviewParameter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public interface a<T> {
    g<T> a();

    default int getCount() {
        return SequencesKt___SequencesKt.A(a());
    }
}
