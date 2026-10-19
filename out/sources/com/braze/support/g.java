package com.braze.support;

import J4.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.q;
import kotlin.collections.x;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f24386a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f24387b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f24388b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not parse http-date value: " + this.f24388b;
        }
    }

    public static final Long a(String str) {
        Long lValueOf;
        if (str == null) {
            return null;
        }
        try {
            Double dY = l.y(str);
            if (dY != null) {
                lValueOf = Long.valueOf((long) (dY.doubleValue() * 1000));
            } else {
                Date date = f24387b.parse(str);
                if (date == null) {
                    return null;
                }
                lValueOf = Long.valueOf(date.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return lValueOf;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f24386a, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new a(str));
            return null;
        }
    }

    public static final String a(Object... requestArgs) {
        kotlin.jvm.internal.i.e(requestArgs, "requestArgs");
        long jHashCode = 1;
        for (Object obj : requestArgs) {
            jHashCode *= (long) obj.hashCode();
        }
        String hexString = Long.toHexString(jHashCode);
        kotlin.jvm.internal.i.d(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }

    public static final Map a(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.n(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            kotlin.jvm.internal.i.b(key);
            Locale locale = Locale.US;
            linkedHashMap2.put(n.d(locale, "US", (String) key, locale, "this as java.lang.String).toLowerCase(locale)"), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(x.n(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), q.U((Iterable) entry3.getValue(), null, null, null, null, 63));
        }
        return linkedHashMap3;
    }
}
