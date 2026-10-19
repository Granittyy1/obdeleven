package com.facebook.appevents.cloudbridge;

import com.facebook.LoggingBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.s;
import p293xa.r;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsConversionsAPITransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f24812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24813c;

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        /* JADX INFO: Fake field, exist only in values array */
        COUNTRY("data_processing_options_country"),
        /* JADX INFO: Fake field, exist only in values array */
        STATE("data_processing_options_state");

        private final String rawValue;

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static DataProcessingParameterName[] valuesCustom() {
            return (DataProcessingParameterName[]) Arrays.copyOf(values(), 3);
        }

        public final String a() {
            return this.rawValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class ValueTransformationType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ValueTransformationType f24817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ValueTransformationType f24818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ValueTransformationType f24819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ValueTransformationType[] f24820f;

        /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
        public static final class a {
        }

        static {
            ValueTransformationType valueTransformationType = new ValueTransformationType("ARRAY", 0);
            f24817c = valueTransformationType;
            ValueTransformationType valueTransformationType2 = new ValueTransformationType("BOOL", 1);
            f24818d = valueTransformationType2;
            ValueTransformationType valueTransformationType3 = new ValueTransformationType("INT", 2);
            f24819e = valueTransformationType3;
            f24820f = new ValueTransformationType[]{valueTransformationType, valueTransformationType2, valueTransformationType3};
            f24816b = new a();
        }

        public ValueTransformationType() {
            throw null;
        }

        public static ValueTransformationType valueOf(String value) {
            i.e(value, "value");
            return (ValueTransformationType) Enum.valueOf(ValueTransformationType.class, value);
        }

        public static ValueTransformationType[] values() {
            return (ValueTransformationType[]) Arrays.copyOf(f24820f, 3);
        }
    }

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConversionsAPISection f24821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConversionsAPICustomEventField f24822b;

        public a(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField field) {
            i.e(field, "field");
            this.f24821a = conversionsAPISection;
            this.f24822b = field;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24821a == aVar.f24821a && this.f24822b == aVar.f24822b;
        }

        public final int hashCode() {
            ConversionsAPISection conversionsAPISection = this.f24821a;
            return this.f24822b.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
        }

        public final String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f24821a + ", field=" + this.f24822b + ')';
        }
    }

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConversionsAPISection f24823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConversionsAPIUserAndAppDataField f24824b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24823a == bVar.f24823a && this.f24824b == bVar.f24824b;
        }

        public final int hashCode() {
            int iHashCode = this.f24823a.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.f24824b;
            return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final String toString() {
            return "SectionFieldMapping(section=" + this.f24823a + ", field=" + this.f24824b + ')';
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = ConversionsAPIUserAndAppDataField.ANON_ID;
        b bVar = new b();
        bVar.f24823a = conversionsAPISection;
        bVar.f24824b = conversionsAPIUserAndAppDataField;
        Pair pair = new Pair(appEventUserAndAppDataField, bVar);
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.APP_USER_ID;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField2 = ConversionsAPIUserAndAppDataField.FB_LOGIN_ID;
        b bVar2 = new b();
        bVar2.f24823a = conversionsAPISection;
        bVar2.f24824b = conversionsAPIUserAndAppDataField2;
        Pair pair2 = new Pair(appEventUserAndAppDataField2, bVar2);
        AppEventUserAndAppDataField appEventUserAndAppDataField3 = AppEventUserAndAppDataField.ADVERTISER_ID;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField3 = ConversionsAPIUserAndAppDataField.MAD_ID;
        b bVar3 = new b();
        bVar3.f24823a = conversionsAPISection;
        bVar3.f24824b = conversionsAPIUserAndAppDataField3;
        Pair pair3 = new Pair(appEventUserAndAppDataField3, bVar3);
        AppEventUserAndAppDataField appEventUserAndAppDataField4 = AppEventUserAndAppDataField.PAGE_ID;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField4 = ConversionsAPIUserAndAppDataField.PAGE_ID;
        b bVar4 = new b();
        bVar4.f24823a = conversionsAPISection;
        bVar4.f24824b = conversionsAPIUserAndAppDataField4;
        Pair pair4 = new Pair(appEventUserAndAppDataField4, bVar4);
        AppEventUserAndAppDataField appEventUserAndAppDataField5 = AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField5 = ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID;
        b bVar5 = new b();
        bVar5.f24823a = conversionsAPISection;
        bVar5.f24824b = conversionsAPIUserAndAppDataField5;
        Pair pair5 = new Pair(appEventUserAndAppDataField5, bVar5);
        AppEventUserAndAppDataField appEventUserAndAppDataField6 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField6 = ConversionsAPIUserAndAppDataField.ADV_TE;
        b bVar6 = new b();
        bVar6.f24823a = conversionsAPISection2;
        bVar6.f24824b = conversionsAPIUserAndAppDataField6;
        Pair pair6 = new Pair(appEventUserAndAppDataField6, bVar6);
        AppEventUserAndAppDataField appEventUserAndAppDataField7 = AppEventUserAndAppDataField.APP_TE;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField7 = ConversionsAPIUserAndAppDataField.APP_TE;
        b bVar7 = new b();
        bVar7.f24823a = conversionsAPISection2;
        bVar7.f24824b = conversionsAPIUserAndAppDataField7;
        Pair pair7 = new Pair(appEventUserAndAppDataField7, bVar7);
        AppEventUserAndAppDataField appEventUserAndAppDataField8 = AppEventUserAndAppDataField.CONSIDER_VIEWS;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField8 = ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS;
        b bVar8 = new b();
        bVar8.f24823a = conversionsAPISection2;
        bVar8.f24824b = conversionsAPIUserAndAppDataField8;
        Pair pair8 = new Pair(appEventUserAndAppDataField8, bVar8);
        AppEventUserAndAppDataField appEventUserAndAppDataField9 = AppEventUserAndAppDataField.DEVICE_TOKEN;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField9 = ConversionsAPIUserAndAppDataField.DEVICE_TOKEN;
        b bVar9 = new b();
        bVar9.f24823a = conversionsAPISection2;
        bVar9.f24824b = conversionsAPIUserAndAppDataField9;
        Pair pair9 = new Pair(appEventUserAndAppDataField9, bVar9);
        AppEventUserAndAppDataField appEventUserAndAppDataField10 = AppEventUserAndAppDataField.EXT_INFO;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField10 = ConversionsAPIUserAndAppDataField.EXT_INFO;
        b bVar10 = new b();
        bVar10.f24823a = conversionsAPISection2;
        bVar10.f24824b = conversionsAPIUserAndAppDataField10;
        Pair pair10 = new Pair(appEventUserAndAppDataField10, bVar10);
        AppEventUserAndAppDataField appEventUserAndAppDataField11 = AppEventUserAndAppDataField.INCLUDE_DWELL_DATA;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField11 = ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA;
        b bVar11 = new b();
        bVar11.f24823a = conversionsAPISection2;
        bVar11.f24824b = conversionsAPIUserAndAppDataField11;
        Pair pair11 = new Pair(appEventUserAndAppDataField11, bVar11);
        AppEventUserAndAppDataField appEventUserAndAppDataField12 = AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField12 = ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA;
        b bVar12 = new b();
        bVar12.f24823a = conversionsAPISection2;
        bVar12.f24824b = conversionsAPIUserAndAppDataField12;
        Pair pair12 = new Pair(appEventUserAndAppDataField12, bVar12);
        AppEventUserAndAppDataField appEventUserAndAppDataField13 = AppEventUserAndAppDataField.INSTALL_REFERRER;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField13 = ConversionsAPIUserAndAppDataField.INSTALL_REFERRER;
        b bVar13 = new b();
        bVar13.f24823a = conversionsAPISection2;
        bVar13.f24824b = conversionsAPIUserAndAppDataField13;
        Pair pair13 = new Pair(appEventUserAndAppDataField13, bVar13);
        AppEventUserAndAppDataField appEventUserAndAppDataField14 = AppEventUserAndAppDataField.INSTALLER_PACKAGE;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField14 = ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE;
        b bVar14 = new b();
        bVar14.f24823a = conversionsAPISection2;
        bVar14.f24824b = conversionsAPIUserAndAppDataField14;
        Pair pair14 = new Pair(appEventUserAndAppDataField14, bVar14);
        AppEventUserAndAppDataField appEventUserAndAppDataField15 = AppEventUserAndAppDataField.RECEIPT_DATA;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField15 = ConversionsAPIUserAndAppDataField.RECEIPT_DATA;
        b bVar15 = new b();
        bVar15.f24823a = conversionsAPISection2;
        bVar15.f24824b = conversionsAPIUserAndAppDataField15;
        Pair pair15 = new Pair(appEventUserAndAppDataField15, bVar15);
        AppEventUserAndAppDataField appEventUserAndAppDataField16 = AppEventUserAndAppDataField.URL_SCHEMES;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField16 = ConversionsAPIUserAndAppDataField.URL_SCHEMES;
        b bVar16 = new b();
        bVar16.f24823a = conversionsAPISection2;
        bVar16.f24824b = conversionsAPIUserAndAppDataField16;
        Pair pair16 = new Pair(appEventUserAndAppDataField16, bVar16);
        AppEventUserAndAppDataField appEventUserAndAppDataField17 = AppEventUserAndAppDataField.USER_DATA;
        b bVar17 = new b();
        bVar17.f24823a = conversionsAPISection;
        bVar17.f24824b = null;
        f24811a = y.s(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(appEventUserAndAppDataField17, bVar17));
        Pair pair17 = new Pair(CustomEventField.EVENT_TIME, new a(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pair18 = new Pair(CustomEventField.EVENT_NAME, new a(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        f24812b = y.s(pair17, pair18, new Pair(customEventField, new a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        f24813c = y.s(new Pair("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), new Pair("fb_mobile_rate", ConversionsAPIEventName.RATED), new Pair("fb_mobile_search", ConversionsAPIEventName.SEARCHED), new Pair("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        ValueTransformationType valueTransformationType;
        ValueTransformationType.f24816b.getClass();
        if (str.equals(AppEventUserAndAppDataField.EXT_INFO.a()) || str.equals(AppEventUserAndAppDataField.URL_SCHEMES.a()) || str.equals(CustomEventField.CONTENT_IDS.a()) || str.equals(CustomEventField.CONTENTS.a()) || str.equals(DataProcessingParameterName.OPTIONS.a())) {
            valueTransformationType = ValueTransformationType.f24817c;
        } else if (str.equals(AppEventUserAndAppDataField.ADV_TE.a()) || str.equals(AppEventUserAndAppDataField.APP_TE.a())) {
            valueTransformationType = ValueTransformationType.f24818d;
        } else {
            valueTransformationType = str.equals(CustomEventField.EVENT_TIME.a()) ? ValueTransformationType.f24819e : null;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (valueTransformationType == null || str2 == null) {
            return obj;
        }
        int iOrdinal = valueTransformationType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return l.A(obj.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer numA = l.A(str2.toString());
            if (numA != null) {
                return Boolean.valueOf(numA.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> arrayListG = s.g(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? G2 : arrayListG) {
                try {
                    try {
                        G2 = s.h(new JSONObject((String) G2));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    G2 = s.g(new JSONArray((String) G2));
                }
                arrayList.add(G2);
            }
            return arrayList;
        } catch (JSONException e10) {
            n4.l.a aVar = p165n4.l.f44910c;
            n4.l.a.b(LoggingBehavior.f24776d, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
            return r.f47939a;
        }
    }
}
