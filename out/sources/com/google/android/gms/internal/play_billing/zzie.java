package com.google.android.gms.internal.play_billing;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzie implements K0 {
    REASON_UNSPECIFIED(0),
    SERVICE_CONNECTION_NOT_READY(1),
    GET_BUY_INTENT_ERROR(2),
    LAUNCH_BILLING_FLOW_TIMEOUT(3),
    LAUNCH_BILLING_FLOW_EXCEPTION(4),
    INVALID_BUNDLE(5),
    INVALID_REQUEST_CODE(6),
    INVALID_LISTENER(7),
    SUBSCRIPTIONS_NOT_SUPPORTED(8),
    SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED(9),
    NULL_BUNDLE_IN_BROADCAST_RECEIVER(10),
    MISSING_LISTENER(11),
    MISSING_PURCHASE_DATA(12),
    INVALID_FIRST_PARTY_PURCHASE_DATA(13),
    MISSING_ALTERNATIVE_BILLING_LISTENER(14),
    MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA(15),
    INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA(16),
    EXTRA_PARAMS_NOT_SUPPORTED(17),
    MULTI_ITEM_NOT_SUPPORTED(18),
    PRODUCT_DETAILS_NOT_SUPPORTED(19),
    OFFER_ID_TOKEN_NOT_SUPPORTED(20),
    NULL_BUNDLE_IN_ACTIVITY_RESULT(21),
    BILLING_RESULT_RECEIVED_FROM_PHONESKY(22),
    EXECUTE_ASYNC_TIMEOUT(23),
    MISSING_RESULT_FROM_EXECUTE_ASYNC(24),
    EMPTY_PURCHASE_TOKEN(25),
    API_VERSION_NOT_V9(26),
    ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION(27),
    CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION(28),
    IN_APP_MESSAGE_NOT_SUPPORTED(29),
    CROSS_APP_NOT_SUPPORTED(30),
    GET_BILLING_CONFIG_NOT_SUPPORTED(31),
    QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED(32),
    UNKNOWN_FEATURE(33),
    PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED(34),
    ONE_TIME_PRODUCT_NOT_SUPPORTED(35),
    BILLING_CLIENT_CONNECTING(36),
    BILLING_CLIENT_CLOSED(37),
    BILLING_SERVICE_BLOCKED(38),
    INVALID_PHONESKY_PACKAGE(39),
    INTENT_SERVICE_NOT_FOUND(40),
    IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION(41),
    GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION(42),
    NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL(43),
    MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE(44),
    NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE(45),
    ERROR_DECODING_SKU_DETAILS(46),
    EMPTY_SKU_LIST(47),
    EMPTY_SKU_TYPE(48),
    EMPTY_PRODUCT_TYPE(49),
    ERROR_DECODING_PURCHASE_DATA(50),
    GET_PURCHASE_SERVICE_CALL_EXCEPTION(51),
    INVALID_PURCHASES_BUNDLE(52),
    NULL_OWNED_ITEMS_LIST(53),
    MISSING_REQUIRED_PURCHASE_KEY(54),
    NULL_SKUS_LIST(55),
    NULL_PURCHASES_LIST(56),
    NULL_SIGNATURES_LIST(57),
    GET_PURCHASE_HISTORY_SERVICE_CALL_EXCEPTION(58),
    QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED(59),
    PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED(60),
    GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION(61),
    NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL(62),
    MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE(63),
    ERROR_DECODING_BILLING_CONFIG_DATA(64),
    ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED(65),
    NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL(66),
    ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_AVAILABILITY(67),
    IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION(68),
    CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION(69),
    NULL_BUNDLE_FROM_CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL(70),
    ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS(71),
    NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER(72),
    SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION(73),
    MISSING_ALTERNATIVE_BILLING_ONLY_DIALOG_RESULT_RECEIVER(74),
    RUNTIME_EXCEPTION_ON_LAUNCHING_ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT(75),
    MISSING_USER_CHOICE_BILLING_LISTENER(76),
    NULL_BUNDLE_FROM_GET_BUY_INTENT_EXTRA_PARAMS_SERVICE_CALL(77),
    NULL_BUNDLE_FROM_GET_BUY_INTENT_TO_REPLACE_SKUS_SERVICE_CALL(78),
    NULL_BUNDLE_FROM_GET_BUY_INTENT_SERVICE_CALL(79),
    IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION(90),
    NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL(91),
    EXTERNAL_OFFER_NOT_SUPPORTED(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu),
    CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION(93),
    NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL(94),
    ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS(R.styleable.AppCompatTheme_textAppearanceListItem),
    NULL_BUNDLE_IN_EXTERNAL_PAYMENT_INFORMATION_DIALOG_RECEIVER(96),
    SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION(97),
    RUNTIME_EXCEPTION_ON_LAUNCHING_EXTERNAL_PAYMENT_DIALOG_INTENT(98),
    IS_BILLING_SUPPORTED_REMOTE_EXCEPTION(99),
    IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION(100),
    IS_BILLING_SUPPORTED_SECURITY_EXCEPTION(R.styleable.AppCompatTheme_switchStyle),
    LICENSE_TESTER_BILLING_OVERRIDE(R.styleable.AppCompatTheme_textAppearanceListItemSecondary),
    BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY(105),
    BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader),
    NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle),
    ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle),
    NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu),
    MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE(R.styleable.AppCompatTheme_textColorAlertDialogListItem),
    ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT(R.styleable.AppCompatTheme_textColorSearchUrl),
    MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle),
    BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT(R.styleable.AppCompatTheme_toolbarStyle),
    BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR(R.styleable.AppCompatTheme_tooltipForegroundColor),
    MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED(R.styleable.AppCompatTheme_tooltipFrameBackground),
    BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING(R.styleable.AppCompatTheme_viewInflaterClass),
    SERVICE_CALL_EXCEPTION(R.styleable.AppCompatTheme_windowActionBar),
    SERVICE_RESET_TO_NULL(R.styleable.AppCompatTheme_windowActionBarOverlay),
    INVALID_BILLING_FLOW_PARAMS(R.styleable.AppCompatTheme_windowActionModeOverlay),
    SERVICE_DISCONNECTED(R.styleable.AppCompatTheme_windowFixedHeightMajor),
    BINDING_DIED(R.styleable.AppCompatTheme_windowFixedHeightMinor),
    FIRST_PARTY_CLIENT_MISSING_1P_LISTENER(R.styleable.AppCompatTheme_windowFixedWidthMajor),
    FIRST_PARTY_CLIENT_MISSING_3P_LISTENER(R.styleable.AppCompatTheme_windowFixedWidthMinor),
    NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT(R.styleable.AppCompatTheme_windowMinWidthMajor),
    NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT(R.styleable.AppCompatTheme_windowMinWidthMinor),
    NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE(145),
    NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE(146),
    NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT(R.styleable.AppCompatTheme_windowNoTitle),
    NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE(147),
    AUTO_PAY_NOT_SUPPORTED(127),
    BILLING_PROGRAM_NOT_SUPPORTED(128),
    LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED(129),
    NULL_BUNDLE_RETURNED_BY_PHONESKY(130),
    PBL_REASON_IN_DEVELOPMENT(131),
    RUNTIME_EXCEPTION_WHEN_LAUNCHING_INTENT(132),
    NULL_INTENT_RETURNED_BY_PHONESKY(133),
    ERROR_IN_ACTIVITY_RESULT(134),
    MISSING_RESPONSE_CODE_IN_PHONESKY_BUNDLE(135),
    BILLING_API_VERSION_NOT_SET_IN_BUNDLE(136),
    RESPONSE_CODE_NOT_SET_IN_BUNDLE(137),
    NON_OK_CODE_RETURNED_BY_PHONESKY(138),
    INITIALIZE_SERVICE_CALL_EXCEPTION(139),
    INITIALIZE_DEAD_OBJECT_EXCEPTION(140),
    INITIALIZE_SECURITY_EXCEPTION(141),
    INITIALIZE_REMOTE_EXCEPTION(142),
    PBL_REASON_IN_DEVELOPMENT2(143),
    PBL_REASON_IN_DEVELOPMENT3(144),
    INTENT_SENDER_EXCEPTION(148),
    INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED(149);

    private final int zzbJ;

    zzie(int i10) {
        this.zzbJ = i10;
    }

    public static zzie b(int i10) {
        if (i10 == 90) {
            return IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION;
        }
        if (i10 == 91) {
            return NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL;
        }
        if (i10 == 93) {
            return CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION;
        }
        if (i10 == 94) {
            return NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL;
        }
        switch (i10) {
            case 0:
                return REASON_UNSPECIFIED;
            case 1:
                return SERVICE_CONNECTION_NOT_READY;
            case 2:
                return GET_BUY_INTENT_ERROR;
            case 3:
                return LAUNCH_BILLING_FLOW_TIMEOUT;
            case 4:
                return LAUNCH_BILLING_FLOW_EXCEPTION;
            case 5:
                return INVALID_BUNDLE;
            case 6:
                return INVALID_REQUEST_CODE;
            case 7:
                return INVALID_LISTENER;
            case 8:
                return SUBSCRIPTIONS_NOT_SUPPORTED;
            case 9:
                return SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED;
            case 10:
                return NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            case 11:
                return MISSING_LISTENER;
            case 12:
                return MISSING_PURCHASE_DATA;
            case 13:
                return INVALID_FIRST_PARTY_PURCHASE_DATA;
            case 14:
                return MISSING_ALTERNATIVE_BILLING_LISTENER;
            case 15:
                return MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
            case 16:
                return INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
            case 17:
                return EXTRA_PARAMS_NOT_SUPPORTED;
            case 18:
                return MULTI_ITEM_NOT_SUPPORTED;
            case 19:
                return PRODUCT_DETAILS_NOT_SUPPORTED;
            case 20:
                return OFFER_ID_TOKEN_NOT_SUPPORTED;
            case 21:
                return NULL_BUNDLE_IN_ACTIVITY_RESULT;
            case 22:
                return BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            case 23:
                return EXECUTE_ASYNC_TIMEOUT;
            case 24:
                return MISSING_RESULT_FROM_EXECUTE_ASYNC;
            case 25:
                return EMPTY_PURCHASE_TOKEN;
            case 26:
                return API_VERSION_NOT_V9;
            case 27:
                return ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION;
            case 28:
                return CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION;
            case 29:
                return IN_APP_MESSAGE_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return CROSS_APP_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return GET_BILLING_CONFIG_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return UNKNOWN_FEATURE;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return ONE_TIME_PRODUCT_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return BILLING_CLIENT_CONNECTING;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return BILLING_CLIENT_CLOSED;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return BILLING_SERVICE_BLOCKED;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return INVALID_PHONESKY_PACKAGE;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return INTENT_SERVICE_NOT_FOUND;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL;
            case 44:
                return MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return ERROR_DECODING_SKU_DETAILS;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return EMPTY_SKU_LIST;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return EMPTY_SKU_TYPE;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return EMPTY_PRODUCT_TYPE;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return ERROR_DECODING_PURCHASE_DATA;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return GET_PURCHASE_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return INVALID_PURCHASES_BUNDLE;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return NULL_OWNED_ITEMS_LIST;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return MISSING_REQUIRED_PURCHASE_KEY;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return NULL_SKUS_LIST;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return NULL_PURCHASES_LIST;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return NULL_SIGNATURES_LIST;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return GET_PURCHASE_HISTORY_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return ERROR_DECODING_BILLING_CONFIG_DATA;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_AVAILABILITY;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return NULL_BUNDLE_FROM_CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return ERROR_DECODING_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return MISSING_ALTERNATIVE_BILLING_ONLY_DIALOG_RESULT_RECEIVER;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return RUNTIME_EXCEPTION_ON_LAUNCHING_ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return MISSING_USER_CHOICE_BILLING_LISTENER;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return NULL_BUNDLE_FROM_GET_BUY_INTENT_EXTRA_PARAMS_SERVICE_CALL;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return NULL_BUNDLE_FROM_GET_BUY_INTENT_TO_REPLACE_SKUS_SERVICE_CALL;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return NULL_BUNDLE_FROM_GET_BUY_INTENT_SERVICE_CALL;
            default:
                switch (i10) {
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        return NULL_BUNDLE_IN_EXTERNAL_PAYMENT_INFORMATION_DIALOG_RECEIVER;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        return SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION;
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        return RUNTIME_EXCEPTION_ON_LAUNCHING_EXTERNAL_PAYMENT_DIALOG_INTENT;
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        return IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                    case 100:
                        return IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                    case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                        return IS_BILLING_SUPPORTED_SECURITY_EXCEPTION;
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                        return EXTERNAL_OFFER_NOT_SUPPORTED;
                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        return ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                        return LICENSE_TESTER_BILLING_OVERRIDE;
                    case 105:
                        return BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY;
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        return BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                        return NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                        return ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA;
                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                        return NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL;
                    case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                        return MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE;
                    case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                        return ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT;
                    case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                        return MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                        return BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT;
                    case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                        return BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        return MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED;
                    case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                        return BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                    case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                        return SERVICE_CALL_EXCEPTION;
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        return SERVICE_RESET_TO_NULL;
                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                        return INVALID_BILLING_FLOW_PARAMS;
                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                        return SERVICE_DISCONNECTED;
                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                        return BINDING_DIED;
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        return FIRST_PARTY_CLIENT_MISSING_1P_LISTENER;
                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                        return FIRST_PARTY_CLIENT_MISSING_3P_LISTENER;
                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                    case 127:
                        return AUTO_PAY_NOT_SUPPORTED;
                    case 128:
                        return BILLING_PROGRAM_NOT_SUPPORTED;
                    case 129:
                        return LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED;
                    case 130:
                        return NULL_BUNDLE_RETURNED_BY_PHONESKY;
                    case 131:
                        return PBL_REASON_IN_DEVELOPMENT;
                    case 132:
                        return RUNTIME_EXCEPTION_WHEN_LAUNCHING_INTENT;
                    case 133:
                        return NULL_INTENT_RETURNED_BY_PHONESKY;
                    case 134:
                        return ERROR_IN_ACTIVITY_RESULT;
                    case 135:
                        return MISSING_RESPONSE_CODE_IN_PHONESKY_BUNDLE;
                    case 136:
                        return BILLING_API_VERSION_NOT_SET_IN_BUNDLE;
                    case 137:
                        return RESPONSE_CODE_NOT_SET_IN_BUNDLE;
                    case 138:
                        return NON_OK_CODE_RETURNED_BY_PHONESKY;
                    case 139:
                        return INITIALIZE_SERVICE_CALL_EXCEPTION;
                    case 140:
                        return INITIALIZE_DEAD_OBJECT_EXCEPTION;
                    case 141:
                        return INITIALIZE_SECURITY_EXCEPTION;
                    case 142:
                        return INITIALIZE_REMOTE_EXCEPTION;
                    case 143:
                        return PBL_REASON_IN_DEVELOPMENT2;
                    case 144:
                        return PBL_REASON_IN_DEVELOPMENT3;
                    case 145:
                        return NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                    case 146:
                        return NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                    case 147:
                        return NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
                    case 148:
                        return INTENT_SENDER_EXCEPTION;
                    case 149:
                        return INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this.zzbJ;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzbJ);
    }
}
