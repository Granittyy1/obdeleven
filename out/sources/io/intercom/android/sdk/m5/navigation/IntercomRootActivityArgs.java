package io.intercom.android.sdk.m5.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomRootActivityArgs implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class ConversationScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ConversationScreenArgs> CREATOR = new Creator();
        private final String articleId;
        private final String articleTitle;
        private final String conversationId;
        private final String initialMessage;
        private final boolean isLaunchedProgrammatically;
        private final TransitionArgs transitionArgs;

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<ConversationScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new ConversationScreenArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TransitionArgs.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs[] newArray(int i10) {
                return new ConversationScreenArgs[i10];
            }
        }

        public ConversationScreenArgs() {
            this(null, null, false, null, null, null, 63, null);
        }

        private final String component2() {
            return this.initialMessage;
        }

        public static /* synthetic */ ConversationScreenArgs copy$default(ConversationScreenArgs conversationScreenArgs, String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationScreenArgs.conversationId;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationScreenArgs.initialMessage;
            }
            String str5 = str2;
            if ((i10 & 4) != 0) {
                z10 = conversationScreenArgs.isLaunchedProgrammatically;
            }
            boolean z11 = z10;
            if ((i10 & 8) != 0) {
                str3 = conversationScreenArgs.articleId;
            }
            String str6 = str3;
            if ((i10 & 16) != 0) {
                str4 = conversationScreenArgs.articleTitle;
            }
            String str7 = str4;
            if ((i10 & 32) != 0) {
                transitionArgs = conversationScreenArgs.transitionArgs;
            }
            return conversationScreenArgs.copy(str, str5, z11, str6, str7, transitionArgs);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final boolean component3() {
            return this.isLaunchedProgrammatically;
        }

        public final String component4() {
            return this.articleId;
        }

        public final String component5() {
            return this.articleTitle;
        }

        public final TransitionArgs component6() {
            return this.transitionArgs;
        }

        public final ConversationScreenArgs copy(String str, String initialMessage, boolean z10, String str2, String str3, TransitionArgs transitionArgs) {
            kotlin.jvm.internal.i.e(initialMessage, "initialMessage");
            kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
            return new ConversationScreenArgs(str, initialMessage, z10, str2, str3, transitionArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationScreenArgs)) {
                return false;
            }
            ConversationScreenArgs conversationScreenArgs = (ConversationScreenArgs) obj;
            return kotlin.jvm.internal.i.a(this.conversationId, conversationScreenArgs.conversationId) && kotlin.jvm.internal.i.a(this.initialMessage, conversationScreenArgs.initialMessage) && this.isLaunchedProgrammatically == conversationScreenArgs.isLaunchedProgrammatically && kotlin.jvm.internal.i.a(this.articleId, conversationScreenArgs.articleId) && kotlin.jvm.internal.i.a(this.articleTitle, conversationScreenArgs.articleTitle) && kotlin.jvm.internal.i.a(this.transitionArgs, conversationScreenArgs.transitionArgs);
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getArticleTitle() {
            return this.articleTitle;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getEncodedInitialMessage() {
            String strEncode = Uri.encode(this.initialMessage);
            kotlin.jvm.internal.i.d(strEncode, "encode(...)");
            return strEncode;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "CONVERSATION?conversationId=" + this.conversationId + "&initialMessage=" + getEncodedInitialMessage() + "&articleId=" + this.articleId + "&articleTitle=" + this.articleTitle + "&isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + "&transitionArgs=" + this.transitionArgs;
        }

        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public int hashCode() {
            String str = this.conversationId;
            int iB = androidx.compose.animation.D.b(B1.a.b(this.initialMessage, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.isLaunchedProgrammatically);
            String str2 = this.articleId;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.articleTitle;
            return this.transitionArgs.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final boolean isLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        public String toString() {
            return "ConversationScreenArgs(conversationId=" + this.conversationId + ", initialMessage=" + this.initialMessage + ", isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + ", articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ", transitionArgs=" + this.transitionArgs + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.conversationId);
            dest.writeString(this.initialMessage);
            dest.writeInt(this.isLaunchedProgrammatically ? 1 : 0);
            dest.writeString(this.articleId);
            dest.writeString(this.articleTitle);
            this.transitionArgs.writeToParcel(dest, i10);
        }

        public /* synthetic */ ConversationScreenArgs(String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str3, (i10 & 16) == 0 ? str4 : null, (i10 & 32) != 0 ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationScreenArgs(String str, String initialMessage, boolean z10, String str2, String str3, TransitionArgs transitionArgs) {
            super(null);
            kotlin.jvm.internal.i.e(initialMessage, "initialMessage");
            kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
            this.conversationId = str;
            this.initialMessage = initialMessage;
            this.isLaunchedProgrammatically = z10;
            this.articleId = str2;
            this.articleTitle = str3;
            this.transitionArgs = transitionArgs;
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class HelpCenterCollectionArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpCenterCollectionArgs> CREATOR = new Creator();
        private final String collectionId;
        private final String metricPlace;

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new HelpCenterCollectionArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs[] newArray(int i10) {
                return new HelpCenterCollectionArgs[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionArgs(String collectionId, String metricPlace) {
            super(null);
            kotlin.jvm.internal.i.e(collectionId, "collectionId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            this.collectionId = collectionId;
            this.metricPlace = metricPlace;
        }

        public static /* synthetic */ HelpCenterCollectionArgs copy$default(HelpCenterCollectionArgs helpCenterCollectionArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpCenterCollectionArgs.collectionId;
            }
            if ((i10 & 2) != 0) {
                str2 = helpCenterCollectionArgs.metricPlace;
            }
            return helpCenterCollectionArgs.copy(str, str2);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionArgs copy(String collectionId, String metricPlace) {
            kotlin.jvm.internal.i.e(collectionId, "collectionId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            return new HelpCenterCollectionArgs(collectionId, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionArgs)) {
                return false;
            }
            HelpCenterCollectionArgs helpCenterCollectionArgs = (HelpCenterCollectionArgs) obj;
            return kotlin.jvm.internal.i.a(this.collectionId, helpCenterCollectionArgs.collectionId) && kotlin.jvm.internal.i.a(this.metricPlace, helpCenterCollectionArgs.metricPlace);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("HelpCenterCollectionArgs(collectionId=");
            sb2.append(this.collectionId);
            sb2.append(", metricPlace=");
            return B7.b.g(sb2, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.collectionId);
            dest.writeString(this.metricPlace);
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class HomeScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final HomeScreenArgs INSTANCE = new HomeScreenArgs();
        public static final Parcelable.Creator<HomeScreenArgs> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<HomeScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                parcel.readInt();
                return HomeScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs[] newArray(int i10) {
                return new HomeScreenArgs[i10];
            }
        }

        private HomeScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HOME";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class MessagesScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final MessagesScreenArgs INSTANCE = new MessagesScreenArgs();
        public static final Parcelable.Creator<MessagesScreenArgs> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<MessagesScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                parcel.readInt();
                return MessagesScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs[] newArray(int i10) {
                return new MessagesScreenArgs[i10];
            }
        }

        private MessagesScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "MESSAGES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class NoContent extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final NoContent INSTANCE = new NoContent();
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<NoContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                parcel.readInt();
                return NoContent.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent[] newArray(int i10) {
                return new NoContent[i10];
            }
        }

        private NoContent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class TicketDetailsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TicketDetailsScreenArgs> CREATOR = new Creator();
        private final String from;
        private final String ticketId;

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<TicketDetailsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new TicketDetailsScreenArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs[] newArray(int i10) {
                return new TicketDetailsScreenArgs[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketDetailsScreenArgs(String ticketId, String from) {
            super(null);
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            kotlin.jvm.internal.i.e(from, "from");
            this.ticketId = ticketId;
            this.from = from;
        }

        public static /* synthetic */ TicketDetailsScreenArgs copy$default(TicketDetailsScreenArgs ticketDetailsScreenArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketDetailsScreenArgs.ticketId;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketDetailsScreenArgs.from;
            }
            return ticketDetailsScreenArgs.copy(str, str2);
        }

        public final String component1() {
            return this.ticketId;
        }

        public final String component2() {
            return this.from;
        }

        public final TicketDetailsScreenArgs copy(String ticketId, String from) {
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            kotlin.jvm.internal.i.e(from, "from");
            return new TicketDetailsScreenArgs(ticketId, from);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailsScreenArgs)) {
                return false;
            }
            TicketDetailsScreenArgs ticketDetailsScreenArgs = (TicketDetailsScreenArgs) obj;
            return kotlin.jvm.internal.i.a(this.ticketId, ticketDetailsScreenArgs.ticketId) && kotlin.jvm.internal.i.a(this.from, ticketDetailsScreenArgs.from);
        }

        public final String getFrom() {
            return this.from;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKET_DETAIL/" + this.ticketId + "?from=" + this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.from.hashCode() + (this.ticketId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("TicketDetailsScreenArgs(ticketId=");
            sb2.append(this.ticketId);
            sb2.append(", from=");
            return B7.b.g(sb2, this.from, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeString(this.ticketId);
            dest.writeString(this.from);
        }
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class TicketsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final TicketsScreenArgs INSTANCE = new TicketsScreenArgs();
        public static final Parcelable.Creator<TicketsScreenArgs> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<TicketsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                parcel.readInt();
                return TicketsScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs[] newArray(int i10) {
                return new TicketsScreenArgs[i10];
            }
        }

        private TicketsScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKETS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ IntercomRootActivityArgs(kotlin.jvm.internal.e eVar) {
        this();
    }

    public abstract String getRoute();

    private IntercomRootActivityArgs() {
    }

    /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
    public static final class HelpCenterCollectionsArgs extends IntercomRootActivityArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HelpCenterCollectionsArgs> CREATOR = new Creator();
        private final List<String> collectionIds;
        private final String metricPlace;

        /* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionsArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new HelpCenterCollectionsArgs(parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs[] newArray(int i10) {
                return new HelpCenterCollectionsArgs[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionsArgs(List<String> collectionIds, String metricPlace) {
            super(null);
            kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            this.collectionIds = collectionIds;
            this.metricPlace = metricPlace;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollectionsArgs copy$default(HelpCenterCollectionsArgs helpCenterCollectionsArgs, List list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollectionsArgs.collectionIds;
            }
            if ((i10 & 2) != 0) {
                str = helpCenterCollectionsArgs.metricPlace;
            }
            return helpCenterCollectionsArgs.copy(list, str);
        }

        public final List<String> component1() {
            return this.collectionIds;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionsArgs copy(List<String> collectionIds, String metricPlace) {
            kotlin.jvm.internal.i.e(collectionIds, "collectionIds");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            return new HelpCenterCollectionsArgs(collectionIds, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionsArgs)) {
                return false;
            }
            HelpCenterCollectionsArgs helpCenterCollectionsArgs = (HelpCenterCollectionsArgs) obj;
            return kotlin.jvm.internal.i.a(this.collectionIds, helpCenterCollectionsArgs.collectionIds) && kotlin.jvm.internal.i.a(this.metricPlace, helpCenterCollectionsArgs.metricPlace);
        }

        public final List<String> getCollectionIds() {
            return this.collectionIds;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionIds.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("HelpCenterCollectionsArgs(collectionIds=");
            sb2.append(this.collectionIds);
            sb2.append(", metricPlace=");
            return B7.b.g(sb2, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.i.e(dest, "dest");
            dest.writeStringList(this.collectionIds);
            dest.writeString(this.metricPlace);
        }

        public HelpCenterCollectionsArgs(List list, String str, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? EmptyList.f42983b : list, str);
        }
    }
}
