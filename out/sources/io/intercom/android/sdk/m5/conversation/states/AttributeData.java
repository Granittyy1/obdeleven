package io.intercom.android.sdk.m5.conversation.states;

import B1.a;
import Z3.o;
import io.intercom.android.sdk.models.Attribute;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AttributeData {
    public static final int $stable = 8;
    private final Attribute attribute;
    private final boolean isFormDisabled;
    private final String partId;

    public AttributeData(Attribute attribute, String partId, boolean z10) {
        i.e(attribute, "attribute");
        i.e(partId, "partId");
        this.attribute = attribute;
        this.partId = partId;
        this.isFormDisabled = z10;
    }

    public static /* synthetic */ AttributeData copy$default(AttributeData attributeData, Attribute attribute, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            attribute = attributeData.attribute;
        }
        if ((i10 & 2) != 0) {
            str = attributeData.partId;
        }
        if ((i10 & 4) != 0) {
            z10 = attributeData.isFormDisabled;
        }
        return attributeData.copy(attribute, str, z10);
    }

    public final Attribute component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.partId;
    }

    public final boolean component3() {
        return this.isFormDisabled;
    }

    public final AttributeData copy(Attribute attribute, String partId, boolean z10) {
        i.e(attribute, "attribute");
        i.e(partId, "partId");
        return new AttributeData(attribute, partId, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) obj;
        return i.a(this.attribute, attributeData.attribute) && i.a(this.partId, attributeData.partId) && this.isFormDisabled == attributeData.isFormDisabled;
    }

    public final Attribute getAttribute() {
        return this.attribute;
    }

    public final String getPartId() {
        return this.partId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFormDisabled) + a.b(this.partId, this.attribute.hashCode() * 31, 31);
    }

    public final boolean isFormDisabled() {
        return this.isFormDisabled;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AttributeData(attribute=");
        sb2.append(this.attribute);
        sb2.append(", partId=");
        sb2.append(this.partId);
        sb2.append(", isFormDisabled=");
        return o.d(sb2, this.isFormDisabled, ')');
    }
}
