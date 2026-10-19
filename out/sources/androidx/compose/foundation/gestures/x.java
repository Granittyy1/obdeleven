package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TargetedFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public interface x extends j {
    @Override // androidx.compose.foundation.gestures.j
    default Object a(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, kotlin.coroutines.c cVar) {
        return b(aVar, f10, TargetedFlingBehaviorKt.f10000a, (ContinuationImpl) cVar);
    }

    Object b(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, Ia.l lVar, ContinuationImpl continuationImpl);
}
