package androidx.compose.ui.platform;

import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements Comparator<Pair<? extends I.f, ? extends List<androidx.compose.ui.semantics.q>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q0 f14945b = new Q0();

    @Override // java.util.Comparator
    public final int compare(Pair<? extends I.f, ? extends List<androidx.compose.ui.semantics.q>> pair, Pair<? extends I.f, ? extends List<androidx.compose.ui.semantics.q>> pair2) {
        Pair<? extends I.f, ? extends List<androidx.compose.ui.semantics.q>> pair3 = pair;
        Pair<? extends I.f, ? extends List<androidx.compose.ui.semantics.q>> pair4 = pair2;
        int iCompare = Float.compare(pair3.c().f3758b, pair4.c().f3758b);
        return iCompare != 0 ? iCompare : Float.compare(pair3.c().f3760d, pair4.c().f3760d);
    }
}
