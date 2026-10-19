package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.F;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_PUSH_DELIVERY_MAX_FLUSH = 120;
    public static final long DEFAULT_PUSH_DELIVERY_MIN_FLUSH = 5;
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private String pushUniqueId;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshFeatureFlags;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;
    private Boolean useWebView;

    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle notificationExtras, int i10) {
            i.e(notificationExtras, "notificationExtras");
            this.actionIndex = i10;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void putIntoBundle(Bundle destination) {
            i.e(destination, "destination");
            destination.putInt(Constants.BRAZE_ACTION_INDEX_KEY, this.actionIndex);
            destination.putString(Constants.BRAZE_ACTION_TYPE_KEY, this.type);
            destination.putString(Constants.BRAZE_ACTION_ID_KEY, this.actionId);
            destination.putString(Constants.BRAZE_ACTION_URI_KEY, this.uri);
            destination.putString(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i10) {
            this.actionIndex = i10;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb2.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb2.append(companion.stringAndKey("Type", this.type));
            sb2.append(companion.stringAndKey("Id", this.actionId));
            sb2.append(companion.stringAndKey("Uri", this.uri));
            sb2.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb2.append(companion.stringAndKey("Text", this.text));
            return sb2.toString();
        }
    }

    public static final class Companion {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f24208b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse action field boolean. Returning default.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f24209b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse action field long. Returning default.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24211c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Bundle bundle) {
                super(0);
                this.f24210b = str;
                this.f24211c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse long with key " + this.f24210b + " and bundle: " + this.f24211c;
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24213c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, Bundle bundle) {
                super(0);
                this.f24212b = str;
                this.f24213c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse non blank string with key " + this.f24212b + " and bundle: " + this.f24213c;
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, Bundle bundle) {
                super(0);
                this.f24214b = str;
                this.f24215c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f24214b + " and bundle: " + this.f24215c;
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24216b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24217c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, Bundle bundle) {
                super(0);
                this.f24216b = str;
                this.f24217c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string with key " + this.f24216b + " and bundle: " + this.f24217c;
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24219c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, Bundle bundle) {
                super(0);
                this.f24218b = str;
                this.f24219c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string as boolean with key " + this.f24218b + " and bundle: " + this.f24219c;
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24221c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, Bundle bundle) {
                super(0);
                this.f24220b = str;
                this.f24221c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string as color int with key " + this.f24220b + " and bundle: " + this.f24221c;
            }
        }

        public static final class i extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24222b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24223c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str, Bundle bundle) {
                super(0);
                this.f24222b = str;
                this.f24223c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f24222b + " and bundle: " + this.f24223c;
            }
        }

        public static final class j extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f24225c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str, Bundle bundle) {
                super(0);
                this.f24224b = str;
                this.f24225c = bundle;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse string as long with key " + this.f24224b + " and bundle: " + this.f24225c;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj == null) {
                return "";
            }
            return "\n" + str + " = " + obj;
        }

        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle2 = bundle.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
                return bundle2 == null ? new Bundle() : bundle2;
            }
            if (Constants.isAmazonDevice()) {
                return new Bundle(bundle);
            }
            Object obj = bundle.get(Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (obj instanceof String) {
                return JsonUtils.parseJsonObjectIntoBundle((String) obj);
            }
            return obj instanceof Bundle ? (Bundle) obj : new Bundle();
        }

        public final int getPushStoryGravityAtIndex(int i10, Bundle notificationExtras, String actionFieldKeyTemplate) {
            kotlin.jvm.internal.i.e(notificationExtras, "notificationExtras");
            kotlin.jvm.internal.i.e(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(m.G(actionFieldKeyTemplate, "*", String.valueOf(i10)));
            if (string != null && !n.S(string)) {
                int iHashCode = string.hashCode();
                if (iHashCode == -1364013995) {
                    string.equals("center");
                } else if (iHashCode != 100571) {
                    if (iHashCode == 109757538 && string.equals(OpsMetricTracker.START)) {
                        return 8388611;
                    }
                } else if (string.equals("end")) {
                    return 8388613;
                }
            }
            return 17;
        }

        public final String getTemplateFieldAtIndex(int i10, Bundle notificationExtras, String actionFieldKeyTemplate) {
            kotlin.jvm.internal.i.e(notificationExtras, "notificationExtras");
            kotlin.jvm.internal.i.e(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i10, notificationExtras, actionFieldKeyTemplate, "");
        }

        public final Long parseLong(Bundle bundle, String key) {
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return Long.valueOf(bundle.getLong(key));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(key, bundle), 3, (Object) null);
                return null;
            }
        }

        public final String parseNonBlankString(Bundle bundle, String key) {
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                String string = parseString(bundle, key);
                if (string == null || n.S(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(key, bundle), 3, (Object) null);
                return null;
            }
        }

        public final int parseObjectAsInteger(Bundle bundle, String key, int i10) {
            Object obj;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (bundle.containsKey(key) && (obj = bundle.get(key)) != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(key, bundle), 3, (Object) null);
            }
            return i10;
        }

        public final String parseString(Bundle bundle, String key) {
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return bundle.getString(key);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(key, bundle), 3, (Object) null);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String key) {
            String string;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(key, bundle), 3, (Object) null);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String key) {
            String string;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(key, bundle), 3, (Object) null);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String key) {
            String string;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(key, bundle), 3, (Object) null);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String key) {
            String string;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(key, bundle), 3, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        public final String getTemplateFieldAtIndex(int i10, Bundle notificationExtras, String actionFieldKeyTemplate, String str) {
            kotlin.jvm.internal.i.e(notificationExtras, "notificationExtras");
            kotlin.jvm.internal.i.e(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(m.G(actionFieldKeyTemplate, "*", String.valueOf(i10)));
            return string == null ? str : string;
        }

        public final boolean getTemplateFieldAtIndex(int i10, Bundle notificationExtras, String actionFieldKeyTemplate, boolean z10) {
            kotlin.jvm.internal.i.e(notificationExtras, "notificationExtras");
            kotlin.jvm.internal.i.e(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(m.G(actionFieldKeyTemplate, "*", String.valueOf(i10)));
            if (string == null) {
                return z10;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, a.f24208b);
                return z10;
            }
        }

        public final long getTemplateFieldAtIndex(int i10, Bundle notificationExtras, String actionFieldKeyTemplate, long j10) {
            kotlin.jvm.internal.i.e(notificationExtras, "notificationExtras");
            kotlin.jvm.internal.i.e(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(m.G(actionFieldKeyTemplate, "*", String.valueOf(i10)));
            if (string == null) {
                return j10;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f24209b);
                return j10;
            }
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations() {
        }
    }

    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle notificationExtras, int i10) {
            i.e(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0L);
            this.personId = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb2.append(companion.stringAndKey("Message", this.message));
            sb2.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb2.append(companion.stringAndKey("PersonId", this.personId));
            return sb2.toString();
        }
    }

    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle notificationExtras, int i10) {
            i.e(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i10, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }

        public final String getName() {
            return this.name;
        }

        public final F getPerson() {
            String str = this.personId;
            String str2 = this.name;
            String str3 = this.uri;
            boolean z10 = this.isBot;
            boolean z11 = this.isImportant;
            F f10 = new F();
            f10.f16682a = str2;
            f10.f16683b = null;
            f10.f16684c = str3;
            f10.f16685d = str;
            f10.f16686e = z10;
            f10.f16687f = z11;
            return f10;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isBot() {
            return this.isBot;
        }

        public final boolean isImportant() {
            return this.isImportant;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb2.append(companion.stringAndKey("PersonId", this.personId));
            sb2.append(companion.stringAndKey("Name", this.name));
            sb2.append(companion.stringAndKey("Uri", this.uri));
            sb2.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb2.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb2.toString();
        }
    }

    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle notificationExtras, int i10) {
            i.e(notificationExtras, "notificationExtras");
            this.actionIndex = i10;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(notificationExtras, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i10) {
            this.actionIndex = i10;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i10) {
            this.subtitleGravity = i10;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i10) {
            this.titleGravity = i10;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb2.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb2.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb2.append(companion.stringAndKey("Title", this.title));
            sb2.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb2.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb2.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb2.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb2.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb2.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb2.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb2.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, null, null, null, 14, null);
    }

    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return Companion.getAttachedBrazeExtras(bundle);
    }

    public static final int getPushStoryGravityAtIndex(int i10, Bundle bundle, String str) {
        return Companion.getPushStoryGravityAtIndex(i10, bundle, str);
    }

    public static final long getTemplateFieldAtIndex(int i10, Bundle bundle, String str, long j) {
        return Companion.getTemplateFieldAtIndex(i10, bundle, str, j);
    }

    public static final Long parseLong(Bundle bundle, String str) {
        return Companion.parseLong(bundle, str);
    }

    public static final String parseNonBlankString(Bundle bundle, String str) {
        return Companion.parseNonBlankString(bundle, str);
    }

    public static final int parseObjectAsInteger(Bundle bundle, String str, int i10) {
        return Companion.parseObjectAsInteger(bundle, str, i10);
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i10 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i10, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || n.S(templateFieldAtIndex)) {
                return;
            }
            brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i10));
            i10++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        String str;
        String nonBlankString = Companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = nonBlankString;
        if ((nonBlankString != null && !n.S(nonBlankString)) || (str = brazeNotificationPayload.extras.get(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)) == null || n.S(str)) {
            return;
        }
        brazeNotificationPayload.bigImageUrl = str;
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i11, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || n.S(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i11));
            i11++;
        }
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i10, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (templateFieldAtIndex2 == null || n.S(templateFieldAtIndex2)) {
                return;
            }
            ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i10);
            brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
            i10++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PRIORITY_KEY);
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SYNC_GEOFENCES_KEY);
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_FEATURE_FLAGS);
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        brazeNotificationPayload.pushUniqueId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_UNIQUE_ID);
        brazeNotificationPayload.useWebView = Boolean.valueOf(companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY));
    }

    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        Integer stringAsInteger = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_ENABLED_KEY);
        brazeNotificationPayload.isPushDeliveryEnabled = (stringAsInteger != null ? stringAsInteger.intValue() : 0) == 1;
        Long stringAsLong = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY);
        brazeNotificationPayload.flushMinMinutes = stringAsLong != null ? stringAsLong.longValue() : 5L;
        Long stringAsLong2 = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY);
        brazeNotificationPayload.flushMaxMinutes = stringAsLong2 != null ? stringAsLong2.longValue() : 120L;
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_STORY_INDEX_KEY, 0);
        int i10 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i10, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || n.S(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i10));
            i10++;
        }
        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, false);
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_TITLE_KEY);
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_KEY);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACCENT_KEY);
    }

    public static final String parseString(Bundle bundle, String str) {
        return Companion.parseString(bundle, str);
    }

    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return Companion.parseStringAsBoolean(bundle, str);
    }

    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return Companion.parseStringAsColorInt(bundle, str);
    }

    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return Companion.parseStringAsInteger(bundle, str);
    }

    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return Companion.parseStringAsLong(bundle, str);
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final String getPushUniqueId() {
        return this.pushUniqueId;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Boolean getUseWebView() {
        return this.useWebView;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setActionButtons(List<ActionButton> actionButtons) {
        i.e(actionButtons, "actionButtons");
        this.actionButtonsInternal = actionButtons;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setBrazeExtras(Bundle bundle) {
        i.e(bundle, "<set-?>");
        this.brazeExtras = bundle;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public final void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z10) {
        this.isConversationalPush = z10;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setExtras(Map<String, String> map) {
        i.e(map, "<set-?>");
        this.extras = map;
    }

    public final void setFlushMaxMinutes(long j) {
        this.flushMaxMinutes = j;
    }

    public final void setFlushMinMinutes(long j) {
        this.flushMinMinutes = j;
    }

    public final void setInlineImagePush(boolean z10) {
        this.isInlineImagePush = z10;
    }

    public final void setIsInlineImagePush(boolean z10) {
        this.isInlineImagePush = z10;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z10) {
        this.isNewlyReceivedPushStory = z10;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l10) {
        this.notificationReceivedTimestampMillis = l10;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDeliveryEnabled(boolean z10) {
        this.isPushDeliveryEnabled = z10;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z10) {
        this.isPushStory = z10;
    }

    public final void setPushStoryPageIndex(int i10) {
        this.pushStoryPageIndex = i10;
    }

    public final void setPushStoryPages(List<PushStoryPage> pushStoryPages) {
        i.e(pushStoryPages, "pushStoryPages");
        this.pushStoryPagesInternal = pushStoryPages;
    }

    public final void setPushUniqueId(String str) {
        this.pushUniqueId = str;
    }

    public final void setShouldFetchTestTriggers(boolean z10) {
        this.shouldFetchTestTriggers = z10;
    }

    public final void setShouldRefreshFeatureFlags(boolean z10) {
        this.shouldRefreshFeatureFlags = z10;
    }

    public final void setShouldSyncGeofences(boolean z10) {
        this.shouldSyncGeofences = z10;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z10) {
        this.isUninstallTrackingPush = z10;
    }

    public final void setUseWebView(Boolean bool) {
        this.useWebView = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Companion companion = Companion;
        sb2.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb2.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb2.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb2.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb2.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb2.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb2.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb2.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb2.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb2.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb2.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb2.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb2.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb2.append(companion.stringAndKey("TitleText", this.titleText));
        sb2.append(companion.stringAndKey("ContentText", this.contentText));
        sb2.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb2.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb2.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb2.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb2.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb2.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb2.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb2.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb2.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb2.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb2.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb2.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb2.append(companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled)));
        sb2.append(companion.stringAndKey("PushUniqueId", this.pushUniqueId));
        sb2.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb2.toString();
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, null, null, 12, null);
    }

    public static final String getTemplateFieldAtIndex(int i10, Bundle bundle, String str) {
        return Companion.getTemplateFieldAtIndex(i10, bundle, str);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context) {
        this(bundle, bundle2, context, null, 8, null);
    }

    public static final String getTemplateFieldAtIndex(int i10, Bundle bundle, String str, String str2) {
        return Companion.getTemplateFieldAtIndex(i10, bundle, str, str2);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        this.context = context != null ? context.getApplicationContext() : null;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    public static final boolean getTemplateFieldAtIndex(int i10, Bundle bundle, String str, boolean z10) {
        return Companion.getTemplateFieldAtIndex(i10, bundle, str, z10);
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i10, e eVar) {
        this(bundle, (i10 & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i10 & 4) != 0 ? null : context, (i10 & 8) != 0 ? null : brazeConfigurationProvider);
    }

    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public static /* synthetic */ void getFlushMaxMinutes$annotations() {
    }

    public static /* synthetic */ void getFlushMinMinutes$annotations() {
    }

    public static /* synthetic */ void isPushDeliveryEnabled$annotations() {
    }
}
