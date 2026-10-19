package io.intercom.android.sdk.models;

import Q8.d;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Attachments extends Attachments {
    private final String contentType;
    private final String humanFileSize;
    private final String name;
    private final String url;

    public AutoValue_Attachments(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.url = str2;
        if (str3 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str3;
        if (str4 == null) {
            throw new NullPointerException("Null humanFileSize");
        }
        this.humanFileSize = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attachments)) {
            return false;
        }
        Attachments attachments = (Attachments) obj;
        return this.name.equals(attachments.getName()) && this.url.equals(attachments.getUrl()) && this.contentType.equals(attachments.getContentType()) && this.humanFileSize.equals(attachments.getHumanFileSize());
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getContentType() {
        return this.contentType;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getName() {
        return this.name;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.humanFileSize.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Attachments{name=");
        sb2.append(this.name);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", contentType=");
        sb2.append(this.contentType);
        sb2.append(", humanFileSize=");
        return d.a(sb2, this.humanFileSize, "}");
    }
}
