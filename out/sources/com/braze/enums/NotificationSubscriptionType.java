package com.braze.enums;

import J4.n;
import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.e;

/* JADX INFO: loaded from: classes.dex */
public enum NotificationSubscriptionType implements IPutIntoJson<String> {
    OPTED_IN("opted_in"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed");

    public static final Companion Companion = new Companion(null);
    private static final Map<String, NotificationSubscriptionType> map;
    private final String key;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NotificationSubscriptionType fromValue(String str) {
            String strD;
            Map map = NotificationSubscriptionType.map;
            if (str != null) {
                Locale locale = Locale.US;
                strD = n.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                strD = null;
            }
            if (strD == null) {
                strD = "";
            }
            Object obj = map.get(strD);
            return (NotificationSubscriptionType) (obj != null ? obj : null);
        }

        private Companion() {
        }
    }

    static {
        NotificationSubscriptionType[] notificationSubscriptionTypeArrValues = values();
        int iN = x.n(notificationSubscriptionTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN < 16 ? 16 : iN);
        for (NotificationSubscriptionType notificationSubscriptionType : notificationSubscriptionTypeArrValues) {
            linkedHashMap.put(notificationSubscriptionType.key, notificationSubscriptionType);
        }
        map = linkedHashMap;
    }

    NotificationSubscriptionType(String str) {
        this.key = str;
    }

    public static final NotificationSubscriptionType fromValue(String str) {
        return Companion.fromValue(str);
    }

    public final String getKey() {
        return this.key;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.key;
    }
}
