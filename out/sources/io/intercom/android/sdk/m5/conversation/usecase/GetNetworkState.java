package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.InterfaceC2686c;
import p293xa.r;

/* JADX INFO: compiled from: GetNetworkState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetNetworkState {
    public static final int $stable = 8;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetNetworkState.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", f = "GetNetworkState.kt", l = {24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<n<? super NetworkState>, kotlin.coroutines.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
            getNetworkState.networkConnectivityMonitor.setListener(null);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = GetNetworkState.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final n nVar = (n) this.L$0;
                GetNetworkState.this.networkConnectivityMonitor.setListener(new NetworkConnectivityMonitor.ConnectivityEventListener() { // from class: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState.invoke.1.1
                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onDisconnect() {
                        nVar.n(NetworkState.Disconnected.INSTANCE);
                    }

                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onReconnect() {
                        nVar.n(NetworkState.Reconnected.INSTANCE);
                    }
                });
                final GetNetworkState getNetworkState = GetNetworkState.this;
                Ia.a aVar = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.usecase.a
                    @Override // Ia.a
                    public final Object invoke() {
                        return GetNetworkState.AnonymousClass1.invokeSuspend$lambda$0(getNetworkState);
                    }
                };
                this.label = 1;
                if (l.a(nVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(n<? super NetworkState> nVar, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(nVar, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public GetNetworkState(NetworkConnectivityMonitor networkConnectivityMonitor) {
        i.e(networkConnectivityMonitor, "networkConnectivityMonitor");
        this.networkConnectivityMonitor = networkConnectivityMonitor;
    }

    public final InterfaceC2686c<NetworkState> invoke() {
        return new CallbackFlowBuilder(new AnonymousClass1(null), EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
    }
}
