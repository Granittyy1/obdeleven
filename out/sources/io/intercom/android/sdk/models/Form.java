package io.intercom.android.sdk.models;

import I7.b;
import Z3.o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: Form.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Form implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    @b("attributes")
    private final List<Attribute> attributes;

    @b("disabled")
    private final boolean disabled;

    @b("type")
    private final String type;

    /* JADX INFO: compiled from: Form.kt */
    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Attribute.CREATOR.createFromParcel(parcel));
            }
            return new Form(string, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i10) {
            return new Form[i10];
        }
    }

    public Form(String type, List<Attribute> attributes, boolean z10) {
        i.e(type, "type");
        i.e(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
        this.disabled = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Form copy$default(Form form, String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = form.type;
        }
        if ((i10 & 2) != 0) {
            list = form.attributes;
        }
        if ((i10 & 4) != 0) {
            z10 = form.disabled;
        }
        return form.copy(str, list, z10);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Attribute> component2() {
        return this.attributes;
    }

    public final boolean component3() {
        return this.disabled;
    }

    public final Form copy(String type, List<Attribute> attributes, boolean z10) {
        i.e(type, "type");
        i.e(attributes, "attributes");
        return new Form(type, attributes, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return i.a(this.type, form.type) && i.a(this.attributes, form.attributes) && this.disabled == form.disabled;
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disabled) + p.d(this.type.hashCode() * 31, 31, this.attributes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Form(type=");
        sb2.append(this.type);
        sb2.append(", attributes=");
        sb2.append(this.attributes);
        sb2.append(", disabled=");
        return o.d(sb2, this.disabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.type);
        List<Attribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<Attribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        dest.writeInt(this.disabled ? 1 : 0);
    }
}
