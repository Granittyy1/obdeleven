package io.intercom.android.sdk.utilities;

import Aa.c;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.u;
import p293xa.r;

/* JADX INFO: compiled from: NexusClientUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NexusClientUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: NexusClientUtils.kt */
    @c(c = "io.intercom.android.sdk.utilities.NexusClientUtilsKt", f = "NexusClientUtils.kt", l = {11}, m = "handleNexusClientLifecycle")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NexusClientUtilsKt.handleNexusClientLifecycle(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object handleNexusClientLifecycle(final IntercomDataLayer intercomDataLayer, final NexusWrapper nexusWrapper, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(obj);
            u<IntercomEvent> event = intercomDataLayer.getEvent();
            InterfaceC2687d<? super IntercomEvent> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.utilities.NexusClientUtilsKt.handleNexusClientLifecycle.2
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar2) {
                    return emit((IntercomEvent) obj2, (kotlin.coroutines.c<? super r>) cVar2);
                }

                public final Object emit(IntercomEvent intercomEvent, kotlin.coroutines.c<? super r> cVar2) {
                    if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                        nexusWrapper.scheduleDisconnect(intercomDataLayer.getConfig().getValue().getNewSessionThresholdMs());
                    } else if (intercomEvent instanceof IntercomEvent.AppEnteredForeground) {
                        nexusWrapper.connect(intercomDataLayer.getConfig().getValue().getRealTimeConfig(), true);
                    } else if (intercomEvent instanceof IntercomEvent.BaseResponseReceived) {
                        NexusConfig realTimeConfig = ((IntercomEvent.BaseResponseReceived) intercomEvent).getBaseResponse().getConfig().getRealTimeConfig();
                        if (realTimeConfig.getEndpoints().isEmpty()) {
                            nexusWrapper.disconnect();
                        } else if (!intercomDataLayer.getHostAppState().getValue().isBackgrounded()) {
                            nexusWrapper.connect(realTimeConfig, true);
                        }
                    } else if (i.a(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
                        nexusWrapper.disconnect();
                    }
                    return r.f47939a;
                }
            };
            anonymousClass1.label = 1;
            if (event.collect(interfaceC2687d, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
