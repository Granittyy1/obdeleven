package io.intercom.android.sdk.m5.data;

import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: UnreadCountTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadCountTracker {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final ConcurrentHashMap<UnreadConversationCountListener, InterfaceC2694i0> listeners;

    public UnreadCountTracker(IntercomDataLayer dataLayer) {
        i.e(dataLayer, "dataLayer");
        this.dataLayer = dataLayer;
        this.listeners = new ConcurrentHashMap<>();
    }

    public static void addListener$default(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, AbstractC2712w abstractC2712w, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC2712w = N.f43198a;
        }
        unreadCountTracker.addListener(unreadConversationCountListener, abstractC2712w);
    }

    public final void addListener(UnreadConversationCountListener listener, AbstractC2712w dispatcher) {
        i.e(listener, "listener");
        i.e(dispatcher, "dispatcher");
        this.listeners.put(listener, C2680e.c(B.a(dispatcher), null, null, new UnreadCountTracker$addListener$job$1(this, listener, null), 3));
    }

    public final IntercomDataLayer getDataLayer() {
        return this.dataLayer;
    }

    public final ConcurrentHashMap<UnreadConversationCountListener, InterfaceC2694i0> getListeners() {
        return this.listeners;
    }

    public final void removeListener(UnreadConversationCountListener listener) {
        InterfaceC2694i0 interfaceC2694i0Remove;
        i.e(listener, "listener");
        if (!this.listeners.containsKey(listener) || (interfaceC2694i0Remove = this.listeners.remove(listener)) == null) {
            return;
        }
        interfaceC2694i0Remove.i(null);
    }
}
