package com.braze.ui.inappmessage.jsinterface;

import Ia.a;
import Ia.l;
import J4.n;
import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.media3.exoplayer.E;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: InAppMessageUserJavascriptInterface.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageUserJavascriptInterface {
    public static final Companion Companion = new Companion(null);
    public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";
    private final Context context;

    /* JADX INFO: compiled from: InAppMessageUserJavascriptInterface.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, l<? super BrazeUser, r> lVar) {
            braze.getCurrentUser(new E(1, lVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(l block, BrazeUser it) {
            i.e(block, "$block");
            i.e(it, "it");
            block.invoke(it);
        }

        private Companion() {
        }
    }

    public InAppMessageUserJavascriptInterface(Context context) {
        i.e(context, "context");
        this.context = context;
    }

    @JavascriptInterface
    public final void addAlias(final String alias, final String label) {
        i.e(alias, "alias");
        i.e(label, "label");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addAlias.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.addAlias(alias, label);
            }
        });
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(final String key, final String value) {
        i.e(key, "key");
        i.e(value, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addToCustomAttributeArray.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.addToCustomAttributeArray(key, value);
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(final String subscriptionGroupId) {
        i.e(subscriptionGroupId, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.addToSubscriptionGroup.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.addToSubscriptionGroup(subscriptionGroupId);
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(final String attribute) {
        i.e(attribute, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.incrementCustomUserAttribute.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                BrazeUser.incrementCustomUserAttribute$default(it, attribute, 0, 2, null);
            }
        });
    }

    public final Month monthFromInt(int i10) {
        if (i10 < 1 || i10 > 12) {
            return null;
        }
        return Month.Companion.getMonth(i10 - 1);
    }

    public final Gender parseGender(String genderString) {
        i.e(genderString, "genderString");
        Locale locale = Locale.US;
        String strD = n.d(locale, "US", genderString, locale, "this as java.lang.String).toLowerCase(locale)");
        Gender gender = Gender.MALE;
        if (strD.equals(gender.forJsonPut())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (strD.equals(gender2.forJsonPut())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (strD.equals(gender3.forJsonPut())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (strD.equals(gender4.forJsonPut())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (strD.equals(gender5.forJsonPut())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (strD.equals(gender6.forJsonPut())) {
            return gender6;
        }
        return null;
    }

    public final String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.parseStringArrayFromJsonString.2
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse custom attribute array";
                }
            });
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(final String key, final String value) {
        i.e(key, "key");
        i.e(value, "value");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.removeFromCustomAttributeArray.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.removeFromCustomAttributeArray(key, value);
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(final String subscriptionGroupId) {
        i.e(subscriptionGroupId, "subscriptionGroupId");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.removeFromSubscriptionGroup.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.removeFromSubscriptionGroup(subscriptionGroupId);
            }
        });
    }

    @JavascriptInterface
    public final void setCountry(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCountry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setCountry(str);
            }
        });
    }

    public final void setCustomAttribute(BrazeUser user, final String key, final String jsonStringValue, boolean z10) {
        i.e(user, "user");
        i.e(key, "key");
        i.e(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
            } else if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, z10);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomAttribute.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to parse custom attribute type for key: " + key + " and json string value: " + jsonStringValue;
                    }
                }, 2, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomAttribute.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse custom attribute type for key: " + key + " and json string value: " + jsonStringValue;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(final String attribute, final double d10, final double d11) {
        i.e(attribute, "attribute");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomLocationAttribute.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setLocationCustomAttribute(attribute, d10, d11);
            }
        });
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(final String key, String str) {
        i.e(key, "key");
        final String[] stringArrayFromJsonString = parseStringArrayFromJsonString(str);
        if (stringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeArray.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to set custom attribute array for key " + key;
                }
            }, 2, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeArray.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    i.e(it, "it");
                    it.setCustomAttributeArray(key, stringArrayFromJsonString);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(final String key, final String jsonStringValue, final boolean z10) {
        i.e(key, "key");
        i.e(jsonStringValue, "jsonStringValue");
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setCustomUserAttributeJSON.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                InAppMessageUserJavascriptInterface.this.setCustomAttribute(it, key, jsonStringValue, z10);
            }
        });
    }

    @JavascriptInterface
    public final void setDateOfBirth(final int i10, final int i11, final int i12) {
        final Month monthMonthFromInt = monthFromInt(i11);
        if (monthMonthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setDateOfBirth.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse month for value " + i11;
                }
            }, 2, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setDateOfBirth.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    i.e(it, "it");
                    it.setDateOfBirth(i10, monthMonthFromInt, i12);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setEmail(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmail.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setEmail(str);
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(final String subscriptionType) {
        i.e(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmailNotificationSubscriptionType.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + subscriptionType;
                }
            }, 2, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setEmailNotificationSubscriptionType.2
                {
                    super(1);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    i.e(it, "it");
                    it.setEmailNotificationSubscriptionType(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setFirstName(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setFirstName.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setFirstName(str);
            }
        });
    }

    @JavascriptInterface
    public final void setGender(final String genderString) {
        i.e(genderString, "genderString");
        final Gender gender = parseGender(genderString);
        if (gender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setGender.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + genderString;
                }
            }, 2, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setGender.2
                {
                    super(1);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    i.e(it, "it");
                    it.setGender(gender);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setHomeCity(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setHomeCity.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setHomeCity(str);
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setLanguage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setLanguage(str);
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setLastName.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setLastName(str);
            }
        });
    }

    @JavascriptInterface
    public final void setPhoneNumber(final String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPhoneNumber.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.setPhoneNumber(str);
            }
        });
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(final String subscriptionType) {
        i.e(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPushNotificationSubscriptionType.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + subscriptionType;
                }
            }, 2, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new l<BrazeUser, r>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface.setPushNotificationSubscriptionType.2
                {
                    super(1);
                }

                @Override // Ia.l
                public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    i.e(it, "it");
                    it.setPushNotificationSubscriptionType(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString);
                }
            });
        }
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }
}
