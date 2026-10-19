package io.intercom.android.sdk.m5.home.data;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Link {
    public static final int $stable = 0;

    @b("label")
    private final String label;

    @b("href")
    private final String url;

    public Link(String label, String url) {
        i.e(label, "label");
        i.e(url, "url");
        this.label = label;
        this.url = url;
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = link.label;
        }
        if ((i10 & 2) != 0) {
            str2 = link.url;
        }
        return link.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final Link copy(String label, String url) {
        i.e(label, "label");
        i.e(url, "url");
        return new Link(label, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return i.a(this.label, link.label) && i.a(this.url, link.url);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Link(label=");
        sb2.append(this.label);
        sb2.append(", url=");
        return B7.b.g(sb2, this.url, ')');
    }
}
