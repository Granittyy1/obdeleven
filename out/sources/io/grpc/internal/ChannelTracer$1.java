package io.grpc.internal;

import io.grpc.InternalChannelz$ChannelTrace$Event;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
class ChannelTracer$1 extends ArrayDeque<InternalChannelz$ChannelTrace$Event> {
    final /* synthetic */ C2230l this$0;
    final /* synthetic */ int val$maxEvents;

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = (InternalChannelz$ChannelTrace$Event) obj;
        if (size() == this.val$maxEvents) {
            removeFirst();
        }
        this.this$0.getClass();
        return super.add(internalChannelz$ChannelTrace$Event);
    }
}
