package com.braze.ui.actions.brazeactions;

import B7.b;
import Ia.a;
import Q8.d;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C;
import org.json.JSONObject;

/* JADX INFO: compiled from: BrazeActionParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BrazeActionParser {
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";
    private static final String BRAZE_ACTIONS_V1 = "v1";
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();
    public static final String TYPE = "type";

    /* JADX INFO: compiled from: BrazeActionParser.kt */
    public enum ActionType {
        CONTAINER("container", ContainerStep.INSTANCE),
        LOG_CUSTOM_EVENT("logCustomEvent", LogCustomEventStep.INSTANCE),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE),
        REQUEST_PUSH_PERMISSION("requestPushPermission", RequestPushPermissionStep.INSTANCE),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", OpenLinkInWebViewStep.INSTANCE),
        OPEN_LINK_EXTERNALLY("openLink", OpenLinkExternallyStep.INSTANCE),
        INVALID("", NoOpStep.INSTANCE);

        public static final Companion Companion = new Companion(null);
        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;

        /* JADX INFO: compiled from: BrazeActionParser.kt */
        public static final class Companion {
            public /* synthetic */ Companion(e eVar) {
                this();
            }

            public final ActionType fromValue(String str) {
                Map map = ActionType.map;
                if (str == null) {
                    str = "";
                }
                Object obj = map.get(str);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }

            private Companion() {
            }
        }

        static {
            ActionType[] actionTypeArrValues = values();
            int iN = x.n(actionTypeArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iN < 16 ? 16 : iN);
            for (ActionType actionType : actionTypeArrValues) {
                linkedHashMap.put(actionType.key, actionType);
            }
            map = linkedHashMap;
        }

        ActionType(String str, IBrazeActionStep iBrazeActionStep) {
            this.key = str;
            this.impl = iBrazeActionStep;
        }

        public static final ActionType fromValue(String str) {
            return Companion.fromValue(str);
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }
    }

    private BrazeActionParser() {
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    public final void execute(Context context, final Uri uri, final Channel channel) {
        i.e(context, "context");
        i.e(uri, "uri");
        i.e(channel, "channel");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + '\'';
            }
        }, 2, (Object) null);
        try {
            Pair brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
            if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
                    }
                }, 2, (Object) null);
                return;
            }
            final String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.a();
            JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.b();
            if (!i.a(str, BRAZE_ACTIONS_V1)) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Braze Actions version "), str, " is unsupported. Version must be v1");
                    }
                }, 3, (Object) null);
            } else {
                parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Done handling Braze uri\n'" + uri + '\'';
                    }
                }, 2, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser.execute.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse uri as a Braze Action.\n'" + uri + '\'';
                }
            });
        }
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(final StepData data) {
        i.e(data, "data");
        final ActionType actionTypeFromValue = ActionType.Companion.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (actionTypeFromValue.getImpl().isValid(data)) {
            return actionTypeFromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getActionType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Cannot parse invalid action of type " + actionTypeFromValue + " and data " + data;
            }
        }, 3, (Object) null);
        return ActionType.INVALID;
    }

    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(final Uri uri) {
        JSONObject encodedActionToJson$android_sdk_ui_release;
        i.e(uri, "<this>");
        String host = uri.getHost();
        final String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, uri, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse version and encoded action from uri: " + uri;
                }
            }, 3, (Object) null);
            return null;
        }
        try {
            encodedActionToJson$android_sdk_ui_release = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(uri, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$json$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return b.g(new StringBuilder("Failed to decode action into json. Action:\n'"), lastPathSegment, '\'');
                }
            });
            encodedActionToJson$android_sdk_ui_release = null;
        }
        if (encodedActionToJson$android_sdk_ui_release == null) {
            return null;
        }
        return new Pair(host, encodedActionToJson$android_sdk_ui_release);
    }

    public final boolean isBrazeActionUri(Uri uri) {
        return i.a(uri != null ? uri.getScheme() : null, BRAZE_ACTIONS_SCHEME);
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, final StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        try {
            final ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Performing Braze Action type " + actionType$android_sdk_ui_release + " with data " + data;
                }
            }, 2, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, data);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to run with data " + data;
                }
            });
        }
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String action) {
        i.e(action, "action");
        byte[] bArrDecode = Base64.decode(action, 8);
        i.d(bArrDecode, "decode(action, Base64.URL_SAFE)");
        int length = bArrDecode.length / 2;
        int[] iArr = new int[length];
        int iN = C.n(0, bArrDecode.length - 1, 2);
        if (iN >= 0) {
            int i10 = 0;
            while (true) {
                iArr[i10 / 2] = (bArrDecode[i10] & 255) | ((bArrDecode[i10 + 1] & 255) << 8);
                if (i10 == iN) {
                    break;
                }
                i10 += 2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 < 0 || i12 > 65535) {
                throw new IllegalArgumentException(J4.i.b(i12, "Invalid Char code: "));
            }
            sb2.append((char) i12);
        }
        return new JSONObject(sb2.toString());
    }
}
