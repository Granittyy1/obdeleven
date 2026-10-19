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
import java.util.List;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ChatFullNotification.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ChatFullNotificationKt {
    public static final ComposableSingletons$ChatFullNotificationKt INSTANCE = new ComposableSingletons$ChatFullNotificationKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f226lambda1 = new ComposableLambdaImpl(false, 424986995, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, M1.k(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("Hello There! This is a longer message that should wrap to multiple lines in the chat full notification. We want to make sure it displays correctly.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, interfaceC1084f, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f227lambda2 = new ComposableLambdaImpl(false, -2029839298, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, M1.k(new Participant.Builder().withName("Alex").withIsBot(false).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("Quick question about your recent order.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, interfaceC1084f, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f228lambda3 = new ComposableLambdaImpl(false, -1139271226, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, M1.k(new Participant.Builder().withName("Support Bot").withIsBot(true).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("I'm here to help! Let me know what you need assistance with today.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, interfaceC1084f, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f229lambda4 = new ComposableLambdaImpl(false, -1302298593, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, M1.k(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), M1.k(new Part.Builder().withSummary("Hello There! This is a ticket-related message.")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null), ChatFullNotificationKt.previewAppConfig, null, interfaceC1084f, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f230lambda5 = new ComposableLambdaImpl(false, 19293965, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-5$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            List listK = M1.k(new Participant.Builder().withName("Maria").withIsBot(false).withType(Participant.ADMIN_TYPE));
            List listK2 = M1.k(new Part.Builder().withSummary("I've looked into your request and we'll be implementing this feature in our next release."));
            Ticket.Status status = new Ticket.Status("In Progress", "in_progress", null, false, 0L, 28, null);
            Participant.Builder builderWithName = new Participant.Builder().withName("Maria Johnson");
            i.d(builderWithName, "withName(...)");
            ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, listK, listK2, null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, status, null, null, 0, builderWithName, null, null, null, 0L, 31675, null), null, null, null, null, null, null, null, 1044467, null), ChatFullNotificationKt.previewAppConfig, null, interfaceC1084f, 72, 4);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m337getLambda1$intercom_sdk_base_release() {
        return f226lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m338getLambda2$intercom_sdk_base_release() {
        return f227lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m339getLambda3$intercom_sdk_base_release() {
        return f228lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m340getLambda4$intercom_sdk_base_release() {
        return f229lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m341getLambda5$intercom_sdk_base_release() {
        return f230lambda5;
    }
}
