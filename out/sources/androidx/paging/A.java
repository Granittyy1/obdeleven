package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes.dex */
public interface A<Key, Value> extends B<Key, Value> {
    Object b(ContinuationImpl continuationImpl);

    StateFlowImpl getState();
}
