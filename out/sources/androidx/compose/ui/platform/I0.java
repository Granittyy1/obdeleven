package androidx.compose.ui.platform;

import androidx.collection.AbstractC0883k;
import java.util.List;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.semantics.l f14927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.C f14928b;

    public I0(androidx.compose.ui.semantics.q qVar, AbstractC0883k<J0> abstractC0883k) {
        this.f14927a = qVar.f15242d;
        this.f14928b = new androidx.collection.C(androidx.compose.ui.semantics.q.h(qVar, true, 4).size());
        List listH = androidx.compose.ui.semantics.q.h(qVar, true, 4);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.semantics.q qVar2 = (androidx.compose.ui.semantics.q) listH.get(i10);
            if (abstractC0883k.a(qVar2.f15245g)) {
                this.f14928b.b(qVar2.f15245g);
            }
        }
    }
}
