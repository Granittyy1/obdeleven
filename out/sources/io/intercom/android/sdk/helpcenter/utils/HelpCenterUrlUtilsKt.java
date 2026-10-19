package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: compiled from: HelpCenterUrlUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterUrlUtilsKt {
    public static final String extractIdFromLastSegment(String lastSegment) {
        i.e(lastSegment, "lastSegment");
        List listE0 = n.e0(lastSegment, new String[]{"-"}, 0, 6);
        return !listE0.isEmpty() ? (String) listE0.get(0) : "";
    }

    public static final boolean isHelpCenterArticleUrl(String url, Set<String> helpCenterUrls) {
        i.e(url, "url");
        i.e(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && n.J(url, "/articles/", false);
    }

    public static final boolean isHelpCenterCollectionUrl(String url, Set<String> helpCenterUrls) {
        i.e(url, "url");
        i.e(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && n.J(url, "/collections/", false);
    }

    private static final boolean isHelpCenterUrl(String str, Set<String> set) {
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (m.I(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final void openArticle(Context context, String articleId, String place) {
        i.e(context, "context");
        i.e(articleId, "articleId");
        i.e(place, "place");
        openArticle$default(context, articleId, place, false, 8, null);
    }

    public static /* synthetic */ void openArticle$default(Context context, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openArticle(context, str, str2, z10);
    }

    public static final void openCollection(Context context, String collectionId, String place) {
        i.e(context, "context");
        i.e(collectionId, "collectionId");
        i.e(place, "place");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, collectionId, place);
    }

    public static final void openCollections(Context context, List<String> collectionIds, String place) {
        i.e(context, "context");
        i.e(collectionIds, "collectionIds");
        i.e(place, "place");
        if (collectionIds.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String) q.O(collectionIds), place);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, collectionIds, place);
        }
    }

    public static final void openArticle(Context context, String articleId, String place, boolean z10) {
        i.e(context, "context");
        i.e(articleId, "articleId");
        i.e(place, "place");
        context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, place, false, z10, 4, null)));
    }
}
