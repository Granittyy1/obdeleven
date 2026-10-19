package io.intercom.android.sdk;

import java.util.List;

/* JADX INFO: compiled from: Intercom.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomContent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Article extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(String id) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Article copy$default(Article article, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = article.id;
            }
            return article.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Article copy(String id) {
            kotlin.jvm.internal.i.e(id, "id");
            return new Article(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Article) && kotlin.jvm.internal.i.a(this.id, ((Article) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Article(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Carousel extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(String id) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = carousel.id;
            }
            return carousel.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Carousel copy(String id) {
            kotlin.jvm.internal.i.e(id, "id");
            return new Carousel(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Carousel) && kotlin.jvm.internal.i.a(this.id, ((Carousel) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Carousel(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Conversation extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(String id) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversation.id;
            }
            return conversation.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Conversation copy(String id) {
            kotlin.jvm.internal.i.e(id, "id");
            return new Conversation(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && kotlin.jvm.internal.i.a(this.id, ((Conversation) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Conversation(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;
        private final List<String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(List<String> ids) {
            super(null);
            kotlin.jvm.internal.i.e(ids, "ids");
            this.ids = ids;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        public final List<String> component1() {
            return this.ids;
        }

        public final HelpCenterCollections copy(List<String> ids) {
            kotlin.jvm.internal.i.e(ids, "ids");
            return new HelpCenterCollections(ids);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpCenterCollections) && kotlin.jvm.internal.i.a(this.ids, ((HelpCenterCollections) obj).ids);
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        public String toString() {
            return Q8.d.b(new StringBuilder("HelpCenterCollections(ids="), this.ids, ')');
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Survey extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(String id) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = survey.id;
            }
            return survey.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Survey copy(String id) {
            kotlin.jvm.internal.i.e(id, "id");
            return new Survey(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Survey) && kotlin.jvm.internal.i.a(this.id, ((Survey) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Survey(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Ticket extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ticket(String id) {
            super(null);
            kotlin.jvm.internal.i.e(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticket.id;
            }
            return ticket.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Ticket copy(String id) {
            kotlin.jvm.internal.i.e(id, "id");
            return new Ticket(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ticket) && kotlin.jvm.internal.i.a(this.id, ((Ticket) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Ticket(id="), this.id, ')');
        }
    }

    public /* synthetic */ IntercomContent(kotlin.jvm.internal.e eVar) {
        this();
    }

    private IntercomContent() {
    }
}
