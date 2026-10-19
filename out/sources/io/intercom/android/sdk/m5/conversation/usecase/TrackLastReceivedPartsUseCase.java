package io.intercom.android.sdk.m5.conversation.usecase;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.N;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TrackLastReceivedPartsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackLastReceivedPartsUseCase {
    public static final int $stable = 8;
    private Conversation currentConversation;
    private final MetricTracker metricTracker;
    private final Ia.a<UserIdentity> userIdentity;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$0() {
        return Injector.get().getUserIdentity();
    }

    public final synchronized void invoke(Conversation newConversation) {
        try {
            i.e(newConversation, "newConversation");
            int size = this.currentConversation.parts().size();
            int size2 = newConversation.parts().size();
            List<Part> listK = (size == 0 && this.currentConversation.getTicket() == null) ? (newConversation.isRead() || !newConversation.lastPart().isReply()) ? EmptyList.f42983b : M1.k(newConversation.lastPart()) : size2 > size ? newConversation.parts().subList(size, size2) : EmptyList.f42983b;
            ArrayList<Part> arrayList = new ArrayList();
            for (Object obj : listK) {
                Part part = (Part) obj;
                if (part.isAdmin() || (!part.getParticipant().isUserWithId(this.userIdentity.invoke().getIntercomId()) && !part.equals(Part.NULL))) {
                    arrayList.add(obj);
                }
            }
            for (Part part2 : arrayList) {
                this.metricTracker.receivedReply(part2.hasAttachments(), PartExtensionsKt.isLinkCard(part2), part2.getId(), newConversation.getId());
                if (i.a(part2.getId(), ((Part) q.V(listK)).getId())) {
                    List<ReplyOption> replyOptions = part2.getReplyOptions();
                    i.d(replyOptions, "getReplyOptions(...)");
                    Iterator<T> it = replyOptions.iterator();
                    while (it.hasNext()) {
                        this.metricTracker.receivedQuickReply(((ReplyOption) it.next()).getUuid(), newConversation.getId(), part2.getId());
                    }
                }
            }
            this.currentConversation = newConversation;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase(MetricTracker metricTracker, Ia.a<? extends UserIdentity> userIdentity) {
        i.e(metricTracker, "metricTracker");
        i.e(userIdentity, "userIdentity");
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.currentConversation = new Conversation(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ TrackLastReceivedPartsUseCase(MetricTracker metricTracker, Ia.a aVar, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 2) != 0 ? new N(1) : aVar);
    }
}
