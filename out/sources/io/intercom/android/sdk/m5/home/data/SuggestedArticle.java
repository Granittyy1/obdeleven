package io.intercom.android.sdk.m5.home.data;

import B1.a;
import I7.b;
import com.braze.Constants;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SuggestedArticle {
    public static final int $stable = 0;

    @b("id")
    private final String id;

    @b("title")
    private final String title;

    @b(Constants.BRAZE_WEBVIEW_URL_EXTRA)
    private final String url;

    public SuggestedArticle(String id, String title, String url) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(url, "url");
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public static /* synthetic */ SuggestedArticle copy$default(SuggestedArticle suggestedArticle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestedArticle.id;
        }
        if ((i10 & 2) != 0) {
            str2 = suggestedArticle.title;
        }
        if ((i10 & 4) != 0) {
            str3 = suggestedArticle.url;
        }
        return suggestedArticle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.url;
    }

    public final SuggestedArticle copy(String id, String title, String url) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(url, "url");
        return new SuggestedArticle(id, title, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedArticle)) {
            return false;
        }
        SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
        return i.a(this.id, suggestedArticle.id) && i.a(this.title, suggestedArticle.title) && i.a(this.url, suggestedArticle.url);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + a.b(this.title, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestedArticle(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", url=");
        return B7.b.g(sb2, this.url, ')');
    }
}
