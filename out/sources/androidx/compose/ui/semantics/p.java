package androidx.compose.ui.semantics;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f15238a = new AtomicInteger(0);

    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, Ia.l<? super w, p293xa.r> lVar) {
        return hVar.i(new ClearAndSetSemanticsElement(lVar));
    }

    public static final androidx.compose.ui.h b(androidx.compose.ui.h hVar, boolean z10, Ia.l<? super w, p293xa.r> lVar) {
        return hVar.i(new AppendedSemanticsElement(lVar, z10));
    }
}
