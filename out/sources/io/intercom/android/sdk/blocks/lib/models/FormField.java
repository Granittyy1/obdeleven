package io.intercom.android.sdk.blocks.lib.models;

import B1.a;
import I7.b;
import Z3.o;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketTypeV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FormField {
    public static final int $stable = 8;

    @b("id")
    private final String id;

    @b("identifier")
    private final String identifier;

    @b("is_controlling_attribute")
    private final boolean isControllingAttribute;

    @b("name")
    private final String name;

    @b("options")
    private final Options options;

    @b("required")
    private final boolean required;

    @b("type")
    private final String type;

    @b("value")
    private final String value;

    public FormField(String id, String name, String str, String type, boolean z10, Options options, String str2, boolean z11) {
        i.e(id, "id");
        i.e(name, "name");
        i.e(type, "type");
        this.id = id;
        this.name = name;
        this.value = str;
        this.type = type;
        this.required = z10;
        this.options = options;
        this.identifier = str2;
        this.isControllingAttribute = z11;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.required;
    }

    public final Options component6() {
        return this.options;
    }

    public final String component7() {
        return this.identifier;
    }

    public final boolean component8() {
        return this.isControllingAttribute;
    }

    public final FormField copy(String id, String name, String str, String type, boolean z10, Options options, String str2, boolean z11) {
        i.e(id, "id");
        i.e(name, "name");
        i.e(type, "type");
        return new FormField(id, name, str, type, z10, options, str2, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        return i.a(this.id, formField.id) && i.a(this.name, formField.name) && i.a(this.value, formField.value) && i.a(this.type, formField.type) && this.required == formField.required && i.a(this.options, formField.options) && i.a(this.identifier, formField.identifier) && this.isControllingAttribute == formField.isControllingAttribute;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iB = a.b(this.name, this.id.hashCode() * 31, 31);
        String str = this.value;
        int iB2 = D.b(a.b(this.type, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.required);
        Options options = this.options;
        int iHashCode = (iB2 + (options == null ? 0 : options.hashCode())) * 31;
        String str2 = this.identifier;
        return Boolean.hashCode(this.isControllingAttribute) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isControllingAttribute() {
        return this.isControllingAttribute;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormField(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", identifier=");
        sb2.append(this.identifier);
        sb2.append(", isControllingAttribute=");
        return o.d(sb2, this.isControllingAttribute, ')');
    }

    public /* synthetic */ FormField(String str, String str2, String str3, String str4, boolean z10, Options options, String str5, boolean z11, int i10, e eVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, str4, z10, (i10 & 32) != 0 ? null : options, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? false : z11);
    }
}
