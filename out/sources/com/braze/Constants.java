package com.braze;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class Constants {
    public static final String BRAZE = "Appboy";
    public static final String BRAZE_ACTION_CLICKED_ACTION = "com.braze.action.BRAZE_ACTION_CLICKED";
    public static final String BRAZE_ACTION_ID_KEY = "braze_action_id";
    public static final String BRAZE_ACTION_INDEX_KEY = "braze_action_index";
    public static final String BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION = "com.braze.action.receiver.BRAZE_GEOFENCE_UPDATE";
    public static final String BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION = "com.braze.action.receiver.SINGLE_LOCATION_UPDATE";
    public static final String BRAZE_ACTION_TYPE_KEY = "braze_action_type";
    public static final String BRAZE_ACTION_URI_KEY = "braze_action_uri";
    public static final String BRAZE_ACTION_USE_WEBVIEW_KEY = "braze_action_use_webview";
    public static final String BRAZE_CAMPAIGN_ID = "braze_campaign_id";
    public static final String BRAZE_CANCEL_NOTIFICATION_ACTION = "com.braze.action.CANCEL_NOTIFICATION";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE = "ab_c_mp*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE = "ab_c_mt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE = "ab_c_mw*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE = "ab_c_pi*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE = "ab_c_pb*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE = "ab_c_pt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE = "ab_c_pn*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE = "ab_c_pu*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY = "ab_c_rpi";
    public static final String BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY = "ab_c_si";
    public static final String BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY = "ab_cp";
    public static final int BRAZE_DEFAULT_NOTIFICATION_ID = -1;
    public static final int BRAZE_GEOFENCE_MAX_NUM_TO_REGISTER_DEFAULT = 20;
    public static final int BRAZE_MAX_PURCHASE_QUANTITY = 100;
    public static final int BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS = 1000;
    public static final String BRAZE_PUSH_ACCENT_KEY = "ac";
    public static final String BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE = "ab_a*_id";
    public static final String BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE = "ab_a*_t";
    public static final String BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE = "ab_a*_a";
    public static final String BRAZE_PUSH_ACTION_TYPE_NONE = "ab_none";
    public static final String BRAZE_PUSH_ACTION_TYPE_OPEN = "ab_open";
    public static final String BRAZE_PUSH_ACTION_TYPE_URI = "ab_uri";
    public static final String BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE = "ab_a*_uri";
    public static final String BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE = "ab_a*_use_webview";
    public static final String BRAZE_PUSH_BIG_IMAGE_URL_KEY = "appboy_image_url";
    public static final String BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY = "ab_iu";
    public static final String BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY = "ab_bs";
    public static final String BRAZE_PUSH_BIG_TITLE_TEXT_KEY = "ab_bt";
    public static final String BRAZE_PUSH_BRAZE_KEY = "_ab";
    public static final String BRAZE_PUSH_CAMPAIGN_ID_KEY = "cid";
    public static final String BRAZE_PUSH_CATEGORY_KEY = "ab_ct";
    public static final String BRAZE_PUSH_CLICKED_ACTION = "com.braze.action.BRAZE_PUSH_CLICKED";
    public static final String BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY = "ab_cd";
    public static final String BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY = "ab_cd_uid";
    public static final String BRAZE_PUSH_CONTENT_KEY = "a";
    public static final String BRAZE_PUSH_CUSTOM_NOTIFICATION_ID = "n";
    public static final String BRAZE_PUSH_DEEP_LINK_KEY = "uri";
    public static final String BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID = "com_appboy_default_notification_channel";
    public static final String BRAZE_PUSH_DELETED_ACTION = "com.braze.action.BRAZE_PUSH_DELETED";
    public static final String BRAZE_PUSH_DELIVERY_ENABLED_KEY = "bz_p_e";
    public static final String BRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY = "bz_p_fx";
    public static final String BRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY = "bz_p_fn";
    public static final String BRAZE_PUSH_EXTRAS_KEY = "extra";
    public static final String BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY = "ab_push_fetch_test_triggers_key";
    public static final String BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY = "ab_iip";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_DELETED = "com.braze.push.intent.NOTIFICATION_DELETED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_OPENED = "com.braze.push.intent.NOTIFICATION_OPENED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED = "com.braze.push.intent.NOTIFICATION_RECEIVED";
    public static final String BRAZE_PUSH_LARGE_ICON_KEY = "ab_li";
    public static final String BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY = "ab_bc";
    public static final String BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY = "ab_nc";
    public static final String BRAZE_PUSH_NOTIFICATION_DURATION_KEY = "nd";
    public static final String BRAZE_PUSH_NOTIFICATION_ID = "nid";
    public static final String BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE = "d";
    public static final String BRAZE_PUSH_NOTIFICATION_SOUND_KEY = "sd";
    public static final String BRAZE_PUSH_NOTIFICATION_TAG = "appboy_notification";
    public static final String BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY = "ab_use_webview";
    public static final String BRAZE_PUSH_PRIORITY_KEY = "p";
    public static final String BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY = "ab_pn";
    public static final String BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS = "braze_push_received_timestamp";
    public static final String BRAZE_PUSH_REFRESH_FEATURE_FLAGS = "br_ffr";
    public static final String BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE = "ab_c*_uri";
    public static final String BRAZE_PUSH_STORY_ID_KEY_TEMPLATE = "ab_c*_id";
    public static final String BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE = "ab_c*_i";
    public static final String BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED = "braze_story_newly_received";
    public static final String BRAZE_PUSH_STORY_KEY = "ab_c";
    public static final String BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_st_j";
    public static final String BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE = "ab_c*_st";
    public static final String BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_t_j";
    public static final String BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE = "ab_c*_t";
    public static final String BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE = "ab_c*_use_webview";
    public static final String BRAZE_PUSH_SUMMARY_TEXT_KEY = "s";
    public static final String BRAZE_PUSH_SYNC_GEOFENCES_KEY = "ab_sync_geos";
    public static final String BRAZE_PUSH_TITLE_KEY = "t";
    public static final String BRAZE_PUSH_UNINSTALL_TRACKING_KEY = "appboy_uninstall_tracking";
    public static final String BRAZE_PUSH_UNIQUE_ID = "br_p_id";
    public static final String BRAZE_PUSH_VISIBILITY_KEY = "ab_vs";
    public static final String BRAZE_SDK_VERSION = "30.0.0";
    public static final String BRAZE_STORY_CLICKED_ACTION = "com.braze.action.BRAZE_STORY_CLICKED";
    public static final String BRAZE_STORY_INDEX_KEY = "braze_story_index";
    public static final String BRAZE_STORY_PAGE_ID = "braze_story_page_id";
    public static final String BRAZE_STORY_TRAVERSE_CLICKED_ACTION = "com.braze.action.STORY_TRAVERSE";
    public static final String BRAZE_WEBVIEW_URL_EXTRA = "url";
    public static final long EVENT_PROPERTIES_MAX_SIZE_BYTES = 51200;
    public static final int JSON_TO_STRING_INDENT_SPACES = 2;
    public static final String LOG_TAG_PREFIX = "Braze v30.0.0 .";
    public static final int TRAFFIC_STATS_THREAD_TAG = 1337;
    public static final String TRIGGERS_ASSETS_FOLDER = "ab_triggers";
    public static final long USER_ID_MAX_LENGTH_BYTES = 997;
    public static final Constants INSTANCE = new Constants();
    private static final boolean isAmazonDevice = "Amazon".equals(Build.MANUFACTURER);

    private Constants() {
    }

    public static final boolean isAmazonDevice() {
        return isAmazonDevice;
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_ENABLED_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY$annotations() {
    }

    public static /* synthetic */ void isAmazonDevice$annotations() {
    }
}
