package io.intercom.android.sdk.m5.notification;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import p293xa.r;

/* JADX INFO: compiled from: InAppNotificationCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InAppNotificationCardKt {
    public static final ComposableSingletons$InAppNotificationCardKt INSTANCE = new ComposableSingletons$InAppNotificationCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f231lambda1 = new ComposableLambdaImpl(false, -690804227, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, M1.k(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), null, interfaceC1084f, 8, 2);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f232lambda2 = new ComposableLambdaImpl(false, 779369617, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, M1.k(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null), null, interfaceC1084f, 8, 2);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m342getLambda1$intercom_sdk_base_release() {
        return f231lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m343getLambda2$intercom_sdk_base_release() {
        return f232lambda2;
    }
}
