package io.intercom.android.sdk.models;

import I7.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TeamPresence.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresence {

    @b("active_admins")
    private final List<Participant.Builder> activeAdmins;

    @b("active_bot")
    private final ActiveBot activeBot;

    @b("expected_response_delay_long_text")
    private final String expectedResponseDelayLongText;

    @b("expected_response_delay_short_text")
    private final String expectedResponseDelayShortText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final TeamPresence NULL = new TeamPresence(null, null, null, null, 15, null);

    /* JADX INFO: compiled from: TeamPresence.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public TeamPresence() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPresence copy$default(TeamPresence teamPresence, List list, ActiveBot activeBot, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamPresence.activeAdmins;
        }
        if ((i10 & 2) != 0) {
            activeBot = teamPresence.activeBot;
        }
        if ((i10 & 4) != 0) {
            str = teamPresence.expectedResponseDelayShortText;
        }
        if ((i10 & 8) != 0) {
            str2 = teamPresence.expectedResponseDelayLongText;
        }
        return teamPresence.copy(list, activeBot, str, str2);
    }

    public final List<Participant.Builder> component1() {
        return this.activeAdmins;
    }

    public final ActiveBot component2() {
        return this.activeBot;
    }

    public final String component3() {
        return this.expectedResponseDelayShortText;
    }

    public final String component4() {
        return this.expectedResponseDelayLongText;
    }

    public final TeamPresence copy(List<Participant.Builder> list, ActiveBot activeBot, String str, String str2) {
        return new TeamPresence(list, activeBot, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPresence)) {
            return false;
        }
        TeamPresence teamPresence = (TeamPresence) obj;
        return i.a(this.activeAdmins, teamPresence.activeAdmins) && i.a(this.activeBot, teamPresence.activeBot) && i.a(this.expectedResponseDelayShortText, teamPresence.expectedResponseDelayShortText) && i.a(this.expectedResponseDelayLongText, teamPresence.expectedResponseDelayLongText);
    }

    public final List<Participant.Builder> getActiveAdmins() {
        return this.activeAdmins;
    }

    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    public final List<Participant> getBuiltActiveAdmins() {
        Iterable iterable = this.activeAdmins;
        if (iterable == null) {
            iterable = EmptyList.f42983b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(m.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Participant.Builder) it.next()).build());
        }
        return arrayList;
    }

    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    public int hashCode() {
        List<Participant.Builder> list = this.activeAdmins;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActiveBot activeBot = this.activeBot;
        int iHashCode2 = (iHashCode + (activeBot == null ? 0 : activeBot.hashCode())) * 31;
        String str = this.expectedResponseDelayShortText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expectedResponseDelayLongText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TeamPresence(activeAdmins=");
        sb2.append(this.activeAdmins);
        sb2.append(", activeBot=");
        sb2.append(this.activeBot);
        sb2.append(", expectedResponseDelayShortText=");
        sb2.append(this.expectedResponseDelayShortText);
        sb2.append(", expectedResponseDelayLongText=");
        return B7.b.g(sb2, this.expectedResponseDelayLongText, ')');
    }

    public TeamPresence(List<Participant.Builder> list, ActiveBot activeBot, String str, String str2) {
        this.activeAdmins = list;
        this.activeBot = activeBot;
        this.expectedResponseDelayShortText = str;
        this.expectedResponseDelayLongText = str2;
    }

    public /* synthetic */ TeamPresence(List list, ActiveBot activeBot, String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : activeBot, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
