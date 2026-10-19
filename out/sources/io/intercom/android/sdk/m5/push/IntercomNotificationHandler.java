package io.intercom.android.sdk.m5.push;

import Ia.p;
import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.F;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.internal.measurement.M1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.ui.C2406v;
import io.intercom.android.sdk.m5.push.ui.ConversationShortcutKt;
import io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.DeepLinkStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: IntercomNotificationHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomNotificationHandler {
    public static final IntercomNotificationHandler INSTANCE = new IntercomNotificationHandler();
    private static List<IntercomPushConversation> conversations = EmptyList.f42983b;
    private static final Twig twig = LumberMill.getLogger();
    public static final int $stable = 8;

    private IntercomNotificationHandler() {
    }

    private final IntercomPushConversation getOrCreateConversation(Context context, List<IntercomPushConversation> list, IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri) {
        Object next;
        List listI;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!i.a(((IntercomPushConversation) next).getConversationId(), conversationPushData.getConversationId()));
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) next;
        if (intercomPushConversation == null) {
            String conversationId = conversationPushData.getConversationId();
            String authorName = conversationPushData.getAuthorName();
            if (n.S(authorName)) {
                authorName = context.getString(R.string.intercom_new_notifications);
                i.d(authorName, "getString(...)");
            }
            return new IntercomPushConversation(conversationId, authorName, M1.k(ConversationStylePushUIKt.toMessage(conversationPushData, j, bitmap, uri)));
        }
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) q.W(intercomPushConversation.getMessages());
        if (message == null || !message.isCurrentUser() || conversationPushData.isCurrentUser()) {
            ListBuilder listBuilderF = M1.f();
            listBuilderF.addAll(intercomPushConversation.getMessages());
            listBuilderF.add(ConversationStylePushUIKt.toMessage(conversationPushData, j, bitmap, uri));
            listI = listBuilderF.I();
        } else {
            listI = M1.k(ConversationStylePushUIKt.toMessage(conversationPushData, j, bitmap, uri));
        }
        List list2 = listI;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            F person = ((IntercomPushConversation.Message) obj).getPerson();
            if (hashSet.add(person != null ? person.f16685d : null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            F person2 = ((IntercomPushConversation.Message) it2.next()).getPerson();
            if (person2 != null) {
                arrayList2.add(person2);
            }
        }
        return IntercomPushConversation.copy$default(intercomPushConversation, null, arrayList2.size() > 1 ? GroupConversationTextFormatter.groupConversationTitle(String.valueOf(((F) q.V(arrayList2)).f16682a), l.r(arrayList2), context).toString() : intercomPushConversation.getConversationTitle(), list2, 1, null);
    }

    public static /* synthetic */ void processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData.ConversationPushData conversationPushData, TaskStackBuilder taskStackBuilder, boolean z10, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release(context, conversationPushData, taskStackBuilder, z11, timeProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r processConversationPushNotification$lambda$4(Context context, IntercomPushData.ConversationPushData conversationPushData, TimeProvider timeProvider, boolean z10, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        i.e(context, "$context");
        i.e(conversationPushData, "$conversationPushData");
        i.e(timeProvider, "$timeProvider");
        Pair<IntercomPushConversation, List<IntercomPushConversation>> pairUpdateConversations = INSTANCE.updateConversations(context, conversationPushData, timeProvider.currentTimeMillis(), bitmap2, bitmap != null ? IntercomPushBitmapUtilsKt.getBitmapUri(context, bitmap) : null);
        IntercomPushConversation intercomPushConversationA = pairUpdateConversations.a();
        List<IntercomPushConversation> listB = pairUpdateConversations.b();
        Pair<List<p199q0.c>, p199q0.c> pairCreateTemporaryShortcut = ConversationShortcutKt.createTemporaryShortcut(context, intercomPushConversationA.getConversationId(), intercomPushConversationA.getConversationTitle(), bitmap2);
        List<p199q0.c> listA = pairCreateTemporaryShortcut.a();
        p199q0.c cVarB = pairCreateTemporaryShortcut.b();
        NotificationChannel notificationChannel = conversationPushData.isNewConversation() ? NotificationChannel.NEW_CHATS_CHANNEL : NotificationChannel.CHAT_REPLIES_CHANNEL;
        Notification notificationBuildConversationStyleNotification = ConversationStylePushUIKt.buildConversationStyleNotification(context, intercomPushConversationA, cVarB, conversationPushData, notificationChannel, z10, taskStackBuilder);
        Notification notificationBuildConversationStyleSummaryNotification = listB.size() > 1 ? ConversationStylePushUIKt.buildConversationStyleSummaryNotification(context, listB, notificationChannel, taskStackBuilder) : null;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Integer.valueOf(conversationPushData.getNotificationId()), notificationBuildConversationStyleNotification);
        if (notificationBuildConversationStyleSummaryNotification != null) {
            mapBuilder.put(Integer.valueOf(ConversationStylePushUIKt.SUMMARY_NOTIFICATION_ID), notificationBuildConversationStyleSummaryNotification);
        }
        NotificationPermissionCheckerKt.showNotifications(context, mapBuilder.k());
        Twig twig2 = twig;
        i.d(twig2, "twig");
        ConversationShortcutKt.resetShortcuts(context, listA, cVarB, twig2);
        return r.f47939a;
    }

    private final void processDeepLinkPushNotification(final Context context, final IntercomPushData.DeepLinkPushData deepLinkPushData, final TaskStackBuilder taskStackBuilder) {
        twig.i("This is a push only message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushOnlyNotification("instance_id:" + deepLinkPushData.getInstanceId(), deepLinkPushData.getInstanceId());
        IntercomPushBitmapUtilsKt.loadBitmaps$default(context, deepLinkPushData.getContentImageUrl(), null, null, new p() { // from class: io.intercom.android.sdk.m5.push.c
            @Override // Ia.p
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processDeepLinkPushNotification$lambda$0(context, deepLinkPushData, taskStackBuilder, (Bitmap) obj, (Bitmap) obj2);
            }
        }, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r processDeepLinkPushNotification$lambda$0(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        i.e(context, "$context");
        i.e(deepLinkPushData, "$deepLinkPushData");
        NotificationPermissionCheckerKt.showNotification(context, deepLinkPushData.getNotificationId(), DeepLinkStylePushUIKt.buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder));
        return r.f47939a;
    }

    public static /* synthetic */ void processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release(context, intercomPushData, taskStackBuilder, timeProvider);
    }

    private final synchronized Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations(Context context, IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri) {
        IntercomPushConversation orCreateConversation;
        ArrayList arrayListP0;
        orCreateConversation = getOrCreateConversation(context, conversations, conversationPushData, j, bitmap, uri);
        arrayListP0 = q.p0(conversations);
        kotlin.collections.p.C(new C2406v(2, orCreateConversation), arrayListP0);
        arrayListP0.add(orCreateConversation);
        conversations = arrayListP0;
        return new Pair<>(orCreateConversation, arrayListP0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateConversations$lambda$6(IntercomPushConversation conversation, IntercomPushConversation it) {
        i.e(conversation, "$conversation");
        i.e(it, "it");
        return i.a(it.getConversationId(), conversation.getConversationId());
    }

    public final synchronized void clear(Context context) {
        try {
            i.e(context, "context");
            if (!conversations.isEmpty()) {
                twig.i("Removing Intercom push notifications.", new Object[0]);
            }
            NotificationManagerCompat.from(context).cancelAll();
            conversations = EmptyList.f42983b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<IntercomPushConversation> getConversations$intercom_sdk_base_release() {
        return conversations;
    }

    public final void processConversationPushNotification$intercom_sdk_base_release(final Context context, final IntercomPushData.ConversationPushData conversationPushData, final TaskStackBuilder taskStackBuilder, final boolean z10, final TimeProvider timeProvider) {
        i.e(context, "context");
        i.e(conversationPushData, "conversationPushData");
        i.e(timeProvider, "timeProvider");
        if (!Injector.get().getDataLayer().getHostAppState().getValue().isBackgrounded()) {
            twig.i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
            return;
        }
        twig.i("This is a background push message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushNotification(conversationPushData.getConversationId());
        IntercomPushBitmapUtilsKt.loadBitmaps(context, conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Image ? ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getUrl() : "", conversationPushData.getAvatarUrl(), conversationPushData.getAuthorName(), new p() { // from class: io.intercom.android.sdk.m5.push.b
            @Override // Ia.p
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processConversationPushNotification$lambda$4(context, conversationPushData, timeProvider, z10, taskStackBuilder, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public final void processIntercomPushNotification$intercom_sdk_base_release(Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider) {
        i.e(context, "context");
        i.e(intercomPushData, "intercomPushData");
        i.e(timeProvider, "timeProvider");
        if (intercomPushData instanceof IntercomPushData.DeepLinkPushData) {
            processDeepLinkPushNotification(context, (IntercomPushData.DeepLinkPushData) intercomPushData, taskStackBuilder);
        } else {
            if (!(intercomPushData instanceof IntercomPushData.ConversationPushData)) {
                throw new NoWhenBranchMatchedException();
            }
            processConversationPushNotification$intercom_sdk_base_release$default(this, context, (IntercomPushData.ConversationPushData) intercomPushData, taskStackBuilder, false, timeProvider, 8, null);
        }
    }

    public final void setConversations$intercom_sdk_base_release(List<IntercomPushConversation> list) {
        i.e(list, "<set-?>");
        conversations = list;
    }

    public final void setUpNotificationChannels$intercom_sdk_base_release(Context context) {
        i.e(context, "context");
        androidx.core.app.p pVar = new androidx.core.app.p(NotificationChannel.CHAT_REPLIES_CHANNEL.getChannelName(), 4);
        pVar.f16749b = context.getString(R.string.intercom_notification_channel_chat_replies_title);
        pVar.f16751d = context.getString(R.string.intercom_notification_channel_chat_replies_description);
        androidx.core.app.p pVar2 = new androidx.core.app.p(NotificationChannel.NEW_CHATS_CHANNEL.getChannelName(), 4);
        pVar2.f16749b = context.getString(R.string.intercom_notification_channel_new_chats_title);
        pVar2.f16751d = context.getString(R.string.intercom_notification_channel_new_chats_description);
        androidx.core.app.p pVar3 = new androidx.core.app.p(NotificationChannel.ACTIONS_CHANNEL.getChannelName(), 4);
        pVar3.f16749b = context.getString(R.string.intercom_notification_channel_actions_title);
        pVar3.f16751d = context.getString(R.string.intercom_notification_channel_actions_description);
        NotificationManagerCompat.from(context).createNotificationChannelsCompat(l.s(pVar, pVar2, pVar3));
    }

    public static /* synthetic */ void getConversations$intercom_sdk_base_release$annotations() {
    }
}
