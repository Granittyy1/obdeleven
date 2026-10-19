package io.intercom.android.sdk.m5.conversation.reducers;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntroPartsReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntroPartsReducerKt {
    private static final List<ContentRow> reduceBotIntroParts(ConversationClientState conversationClientState, List<? extends Part> list) {
        ListBuilder listBuilderF = M1.f();
        boolean zIsEmpty = conversationClientState.getPendingMessages().isEmpty();
        List<? extends Part> list2 = list;
        ArrayList arrayList = new ArrayList(m.y(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l.x();
                throw null;
            }
            arrayList.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper((Part) obj, i10 == l.r(list) && zIsEmpty, true, null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(list, i10), null, false, false, 16, null));
            i10 = i11;
        }
        listBuilderF.addAll(arrayList);
        return listBuilderF.I();
    }

    public static final List<ContentRow> reduceIntroParts(ConversationClientState clientState, BotIntro botIntro, TimeProvider timeProvider) {
        Collection arrayList;
        List<Part.Builder> parts;
        Object next;
        i.e(clientState, "clientState");
        i.e(botIntro, "botIntro");
        i.e(timeProvider, "timeProvider");
        List<List<Block.Builder>> blocks = botIntro.getBlocks();
        Collection arrayList2 = new ArrayList(m.y(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            Part partBuild = new Part.Builder().withBlocks((List) it.next()).withParticipantIsAdmin(true).withCreatedAt(timeProvider.currentTimeMillis()).build();
            partBuild.setParticipant(botIntro.getBuiltParticipant());
            arrayList2.add(partBuild);
        }
        OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (newConversationData == null || (parts = newConversationData.getParts()) == null) {
            arrayList = EmptyList.f42983b;
        } else {
            List<Part.Builder> list = parts;
            arrayList = new ArrayList(m.y(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Part partBuild2 = ((Part.Builder) it2.next()).build();
                Iterator<T> it3 = newConversationData.getParticipants().iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!i.a(((Participant.Builder) next).build().getId(), partBuild2.getParticipantId()));
                Participant.Builder builder = (Participant.Builder) next;
                Participant participantBuild = builder != null ? builder.build() : null;
                if (participantBuild != null) {
                    partBuild2.setParticipant(participantBuild);
                }
                arrayList.add(partBuild2);
            }
        }
        Collection collection = arrayList;
        if (!collection.isEmpty()) {
            arrayList2 = collection;
        }
        List list2 = (List) arrayList2;
        return !list2.isEmpty() ? reduceBotIntroParts(clientState, list2) : EmptyList.f42983b;
    }
}
