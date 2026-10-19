package kotlinx.coroutines.flow;

import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StartedWhileSubscribed implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43361b;

    public StartedWhileSubscribed(long j, long j10) {
        this.f43360a = j;
        this.f43361b = j10;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.z
    public final InterfaceC2686c<SharingCommand> b(A<Integer> a10) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i10 = k.f43411a;
        return C2688e.h(new j(new ChannelFlowTransformLatest(startedWhileSubscribed$command$1, a10, EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b), new StartedWhileSubscribed$command$2(2, null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f43360a == startedWhileSubscribed.f43360a && this.f43361b == startedWhileSubscribed.f43361b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43361b) + (Long.hashCode(this.f43360a) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.f43360a;
        if (j > 0) {
            listBuilder.add("stopTimeout=" + j + "ms");
        }
        long j10 = this.f43361b;
        if (j10 < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j10 + "ms");
        }
        return B7.b.g(new StringBuilder("SharingStarted.WhileSubscribed("), kotlin.collections.q.U(listBuilder.I(), null, null, null, null, 63), ')');
    }
}
