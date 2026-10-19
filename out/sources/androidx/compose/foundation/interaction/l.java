package androidx.compose.foundation.interaction;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import p293xa.r;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f10073a = w.b(0, 16, BufferOverflow.f43244c, 1);

    @Override // androidx.compose.foundation.interaction.k
    public final boolean a(i iVar) {
        return this.f10073a.f(iVar);
    }

    @Override // androidx.compose.foundation.interaction.j
    public final v b() {
        return this.f10073a;
    }

    @Override // androidx.compose.foundation.interaction.k
    public final Object c(i iVar, ContinuationImpl continuationImpl) {
        Object objEmit = this.f10073a.emit(iVar, continuationImpl);
        return objEmit == CoroutineSingletons.f43038b ? objEmit : r.f47939a;
    }
}
