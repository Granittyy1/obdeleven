package com.braze.enums;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public enum CardKey {
    ID("id", "id"),
    VIEWED(MetricTracker.Action.VIEWED, "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS(InAppMessageBase.EXTRAS, "e"),
    OPEN_URI_IN_WEBVIEW(InAppMessageBase.OPEN_URI_IN_WEBVIEW, "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    REMOVED("", "r"),
    PINNED("", Constants.BRAZE_PUSH_PRIORITY_KEY),
    DISMISSIBLE("", "db"),
    IS_TEST("", Constants.BRAZE_PUSH_TITLE_KEY),
    READ("", "read"),
    CLICKED("", "cl"),
    IMAGE_ONLY_IMAGE(AppearanceType.IMAGE, "i"),
    IMAGE_ONLY_URL(Constants.BRAZE_WEBVIEW_URL_EXTRA, "u"),
    IMAGE_ONLY_DOMAIN("domain", ""),
    IMAGE_ONLY_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE(AppearanceType.IMAGE, "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION("description", "ds"),
    CAPTIONED_IMAGE_URL(Constants.BRAZE_WEBVIEW_URL_EXTRA, "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", "ds"),
    TEXT_ANNOUNCEMENT_URL(Constants.BRAZE_WEBVIEW_URL_EXTRA, "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE(AppearanceType.IMAGE, "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION("description", "ds"),
    SHORT_NEWS_URL(Constants.BRAZE_WEBVIEW_URL_EXTRA, "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");

    private final String contentCardsKey;
    private final String feedKey;
    public static final a Companion = new a(null);
    private static final String IMAGE_ONLY_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String CONTROL_KEY = "control";
    private static final Map<String, CardType> cardTypeMap = y.s(new Pair(IMAGE_ONLY_KEY, CardType.IMAGE), new Pair(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), new Pair(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), new Pair(SHORT_NEWS_KEY, CardType.SHORT_NEWS), new Pair(CONTROL_KEY, CardType.CONTROL));

    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final a Companion = new a(null);
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        public static final class a {
            public /* synthetic */ a(e eVar) {
                this();
            }

            private a() {
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f24057b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JSONObject jSONObject) {
                super(0);
                this.f24057b = jSONObject;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + this.f24057b;
            }
        }

        public Provider(boolean z10) {
            this.isContentCardProvider = z10;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            String optionalString;
            i.e(jsonObject, "jsonObject");
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.TYPE));
            if (optionalString2 != null && optionalString2.length() != 0 && this.isContentCardProvider && i.a(optionalString2, CardKey.SHORT_NEWS_KEY) && ((optionalString = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.SHORT_NEWS_IMAGE))) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(jsonObject), 2, (Object) null);
                optionalString2 = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getKey(CardKey key) {
            i.e(key, "key");
            return this.isContentCardProvider ? key.getContentCardsKey() : key.getFeedKey();
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            i.e(cardType, "cardType");
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
