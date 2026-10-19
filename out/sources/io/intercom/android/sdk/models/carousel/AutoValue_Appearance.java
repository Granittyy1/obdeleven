package io.intercom.android.sdk.models.carousel;

import Q8.d;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Appearance extends Appearance {
    private final String alignment;
    private final String textColor;
    private final String type;

    public AutoValue_Appearance(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        if (str2 == null) {
            throw new NullPointerException("Null alignment");
        }
        this.alignment = str2;
        if (str3 == null) {
            throw new NullPointerException("Null textColor");
        }
        this.textColor = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Appearance)) {
            return false;
        }
        Appearance appearance = (Appearance) obj;
        return this.type.equals(appearance.getType()) && this.alignment.equals(appearance.getAlignment()) && this.textColor.equals(appearance.getTextColor());
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getAlignment() {
        return this.alignment;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.alignment.hashCode()) * 1000003) ^ this.textColor.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Appearance{type=");
        sb2.append(this.type);
        sb2.append(", alignment=");
        sb2.append(this.alignment);
        sb2.append(", textColor=");
        return d.a(sb2, this.textColor, "}");
    }
}
