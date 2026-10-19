package androidx.compose.foundation;

import androidx.compose.ui.node.InterfaceC1184e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
public interface E {

    /* JADX INFO: compiled from: Overscroll.kt */
    public static final class a extends androidx.compose.ui.h.c {
    }

    long a(long j, int i10, Ia.l<? super I.d, I.d> lVar);

    Object b(long j, Ia.p pVar, ContinuationImpl continuationImpl);

    boolean c();

    default InterfaceC1184e getNode() {
        return new a();
    }
}
