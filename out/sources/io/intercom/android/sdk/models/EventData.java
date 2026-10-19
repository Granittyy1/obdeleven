package io.intercom.android.sdk.models;

import I7.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EventData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EventData implements Parcelable {

    @b("eventAsPlainText")
    private final String _eventAsPlainText;

    @b("participant")
    private final EventParticipant.Builder _participant;

    @b("status")
    private final String _status;

    @b("customStateLabel")
    private final String customStateLabel;

    @b("customStatePrefix")
    private final String customStatePrefix;
    private final String description;
    private final String mergedConversationId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();
    public static final EventData NULL = new EventData(null, null, null, null, null, null, null, 127, null);

    /* JADX INFO: compiled from: EventData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: EventData.kt */
    public static final class Creator implements Parcelable.Creator<EventData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EventData((EventParticipant.Builder) parcel.readValue(EventData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i10) {
            return new EventData[i10];
        }
    }

    public EventData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final EventParticipant.Builder component1() {
        return this._participant;
    }

    private final String component2() {
        return this._eventAsPlainText;
    }

    private final String component3() {
        return this._status;
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = eventData._participant;
        }
        if ((i10 & 2) != 0) {
            str = eventData._eventAsPlainText;
        }
        String str7 = str;
        if ((i10 & 4) != 0) {
            str2 = eventData._status;
        }
        String str8 = str2;
        if ((i10 & 8) != 0) {
            str3 = eventData.customStateLabel;
        }
        String str9 = str3;
        if ((i10 & 16) != 0) {
            str4 = eventData.customStatePrefix;
        }
        String str10 = str4;
        if ((i10 & 32) != 0) {
            str5 = eventData.mergedConversationId;
        }
        String str11 = str5;
        if ((i10 & 64) != 0) {
            str6 = eventData.description;
        }
        return eventData.copy(builder, str7, str8, str9, str10, str11, str6);
    }

    public final String component4() {
        return this.customStateLabel;
    }

    public final String component5() {
        return this.customStatePrefix;
    }

    public final String component6() {
        return this.mergedConversationId;
    }

    public final String component7() {
        return this.description;
    }

    public final EventData copy(EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6) {
        return new EventData(builder, str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return i.a(this._participant, eventData._participant) && i.a(this._eventAsPlainText, eventData._eventAsPlainText) && i.a(this._status, eventData._status) && i.a(this.customStateLabel, eventData.customStateLabel) && i.a(this.customStatePrefix, eventData.customStatePrefix) && i.a(this.mergedConversationId, eventData.mergedConversationId) && i.a(this.description, eventData.description);
    }

    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventAsPlainText() {
        String str = this._eventAsPlainText;
        return str == null ? "" : str;
    }

    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    public final EventParticipant getParticipant() {
        EventParticipant eventParticipantBuild;
        EventParticipant.Builder builder = this._participant;
        if (builder != null && (eventParticipantBuild = builder.build()) != null) {
            return eventParticipantBuild;
        }
        EventParticipant NULL2 = EventParticipant.NULL;
        i.d(NULL2, "NULL");
        return NULL2;
    }

    public final String getStatus() {
        String str = this._status;
        return str == null ? "" : str;
    }

    public int hashCode() {
        EventParticipant.Builder builder = this._participant;
        int iHashCode = (builder == null ? 0 : builder.hashCode()) * 31;
        String str = this._eventAsPlainText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customStateLabel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStatePrefix;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mergedConversationId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventData(_participant=");
        sb2.append(this._participant);
        sb2.append(", _eventAsPlainText=");
        sb2.append(this._eventAsPlainText);
        sb2.append(", _status=");
        sb2.append(this._status);
        sb2.append(", customStateLabel=");
        sb2.append(this.customStateLabel);
        sb2.append(", customStatePrefix=");
        sb2.append(this.customStatePrefix);
        sb2.append(", mergedConversationId=");
        sb2.append(this.mergedConversationId);
        sb2.append(", description=");
        return B7.b.g(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeValue(this._participant);
        dest.writeString(this._eventAsPlainText);
        dest.writeString(this._status);
        dest.writeString(this.customStateLabel);
        dest.writeString(this.customStatePrefix);
        dest.writeString(this.mergedConversationId);
        dest.writeString(this.description);
    }

    public EventData(EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6) {
        this._participant = builder;
        this._eventAsPlainText = str;
        this._status = str2;
        this.customStateLabel = str3;
        this.customStatePrefix = str4;
        this.mergedConversationId = str5;
        this.description = str6;
    }

    public /* synthetic */ EventData(EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : builder, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
    }
}
