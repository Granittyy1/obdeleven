package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.D;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Attribute.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Attribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @b("custom_bot_control_id")
    private final String customBotControlId;

    @b("identifier")
    private final String identifier;

    @b("multiline")
    private final Boolean multiline;

    @b("name")
    private final String name;

    @b("options")
    private final List<String> options;

    @b(MetricTracker.Action.SUBMITTED)
    private final boolean submitted;

    @b("type")
    private final String type;

    @b("value")
    private final String value;

    /* JADX INFO: compiled from: Attribute.kt */
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            i.e(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Attribute(string, string2, string3, z10, string4, arrayListCreateStringArrayList, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i10) {
            return new Attribute[i10];
        }
    }

    public Attribute(String identifier, String name, String type, boolean z10, String str, List<String> list, Boolean bool, String str2) {
        i.e(identifier, "identifier");
        i.e(name, "name");
        i.e(type, "type");
        this.identifier = identifier;
        this.name = name;
        this.type = type;
        this.submitted = z10;
        this.customBotControlId = str;
        this.options = list;
        this.multiline = bool;
        this.value = str2;
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.submitted;
    }

    public final String component5() {
        return this.customBotControlId;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final Boolean component7() {
        return this.multiline;
    }

    public final String component8() {
        return this.value;
    }

    public final Attribute copy(String identifier, String name, String type, boolean z10, String str, List<String> list, Boolean bool, String str2) {
        i.e(identifier, "identifier");
        i.e(name, "name");
        i.e(type, "type");
        return new Attribute(identifier, name, type, z10, str, list, bool, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return i.a(this.identifier, attribute.identifier) && i.a(this.name, attribute.name) && i.a(this.type, attribute.type) && this.submitted == attribute.submitted && i.a(this.customBotControlId, attribute.customBotControlId) && i.a(this.options, attribute.options) && i.a(this.multiline, attribute.multiline) && i.a(this.value, attribute.value);
    }

    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getMultiline() {
        return this.multiline;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r0.equals(io.intercom.android.sdk.models.AttributeType.FLOAT) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0.equals("boolean") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0.equals(io.intercom.android.sdk.models.AttributeType.DATE) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRenderType() {
        /*
            r3 = this;
            java.lang.String r0 = r3.type
            int r1 = r0.hashCode()
            switch(r1) {
                case -891985903: goto L35;
                case 3076014: goto L2c;
                case 64711720: goto L23;
                case 97526364: goto L17;
                case 1958052158: goto La;
                default: goto L9;
            }
        L9:
            goto L3d
        La:
            java.lang.String r1 = "integer"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            goto L3d
        L13:
            java.lang.String r0 = "number"
            goto L85
        L17:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3d
        L20:
            r0 = r1
            goto L85
        L23:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3d
        L2c:
            java.lang.String r1 = "date"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3d
        L35:
            java.lang.String r1 = "string"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
        L3d:
            java.lang.String r0 = "unknown"
            goto L85
        L40:
            java.util.List<java.lang.String> r0 = r3.options
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L50
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4d
            goto L50
        L4d:
            java.lang.String r0 = "list"
            return r0
        L50:
            java.lang.String r0 = r3.identifier
            int r1 = r0.hashCode()
            r2 = 75849770(0x485602a, float:3.1356462E-36)
            if (r1 == r2) goto L78
            r2 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r1 == r2) goto L6f
            r2 = 106642798(0x65b3d6e, float:4.1234453E-35)
            if (r1 == r2) goto L66
            goto L83
        L66:
            java.lang.String r1 = "phone"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            goto L83
        L6f:
            java.lang.String r1 = "email"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            goto L83
        L78:
            java.lang.String r1 = "company.website"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L83
        L80:
            java.lang.String r0 = r3.identifier
            goto L85
        L83:
            java.lang.String r0 = "text"
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Attribute.getRenderType():java.lang.String");
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        String str = this.value;
        return !(str == null || str.length() == 0);
    }

    public int hashCode() {
        int iB = D.b(a.b(this.type, a.b(this.name, this.identifier.hashCode() * 31, 31), 31), 31, this.submitted);
        String str = this.customBotControlId;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Attribute(identifier=");
        sb2.append(this.identifier);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", submitted=");
        sb2.append(this.submitted);
        sb2.append(", customBotControlId=");
        sb2.append(this.customBotControlId);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", multiline=");
        sb2.append(this.multiline);
        sb2.append(", value=");
        return B7.b.g(sb2, this.value, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        ?? BooleanValue;
        i.e(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.submitted ? 1 : 0);
        dest.writeString(this.customBotControlId);
        dest.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.value);
    }

    public /* synthetic */ Attribute(String str, String str2, String str3, boolean z10, String str4, List list, Boolean bool, String str5, int i10, e eVar) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : str5);
    }
}
