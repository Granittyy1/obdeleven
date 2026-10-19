package com.braze.support;

import Ia.l;
import android.os.Bundle;
import com.braze.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.y;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f24293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, JSONArray jSONArray) {
            super(0);
            this.f24292b = i10;
            this.f24293c = jSONArray;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get string for item at index: " + this.f24292b + " and array: " + this.f24293c;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24294b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve color integer from JSON";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f24295b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24296b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    public static final class e extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(1);
            this.f24297b = jSONArray;
        }

        public final Boolean a(int i10) {
            this.f24297b.opt(i10);
            kotlin.jvm.internal.i.l();
            throw null;
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class f extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray) {
            super(1);
            this.f24298b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            this.f24298b.get(i10);
            kotlin.jvm.internal.i.l();
            throw null;
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class g extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24299b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(1);
            this.f24299b = jSONObject;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            this.f24299b.opt(str);
            kotlin.jvm.internal.i.l();
            throw null;
        }
    }

    public static final class h extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(1);
            this.f24300b = jSONObject;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str) throws JSONException {
            this.f24300b.get(str);
            kotlin.jvm.internal.i.l();
            throw null;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f24301b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception merging JSON for old key " + this.f24301b;
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f24302b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception merging JSON for new key " + this.f24302b;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f24303b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.i.d(itKeys, "target.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object objOpt = jSONObject.opt(next);
            Object objOpt2 = jSONObject2.opt(next);
            if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) objOpt, (JSONObject) objOpt2)) {
                    return false;
                }
            } else if (objOpt != null && objOpt2 != null && !objOpt.equals(objOpt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().forJsonPut());
        }
        return jSONArray;
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return y.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.i.d(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            kotlin.jvm.internal.i.d(key, "key");
            String string = jSONObject.getString(key);
            kotlin.jvm.internal.i.d(string, "this.getString(key)");
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                String string = jSONArray.getString(i10);
                kotlin.jvm.internal.i.d(string, "this.getString(i)");
                arrayList.add(string);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new a(i10, jSONArray));
            }
        }
        return arrayList;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        if (str == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Ia.a<String>) b.f24294b);
            return null;
        }
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        String string = "";
        if (jSONObject != null) {
            try {
                string = jSONObject.toString(2);
            } catch (Throwable th) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Ia.a<String>) c.f24295b);
            }
            kotlin.jvm.internal.i.d(string, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return string;
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final <T> Iterator<T> iterator(JSONArray jSONArray) {
        if (jSONArray == null) {
            EmptyList.f42983b.getClass();
            return r.f43021b;
        }
        q.H(Na.l.J(0, jSONArray.length()));
        kotlin.jvm.internal.i.l();
        throw null;
    }

    public static final JSONObject mergeJsonObjects(JSONObject oldJson, JSONObject newJson) {
        kotlin.jvm.internal.i.e(oldJson, "oldJson");
        kotlin.jvm.internal.i.e(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = oldJson.keys();
        kotlin.jvm.internal.i.d(itKeys, "oldJson.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new i(next));
            }
        }
        Iterator<String> itKeys2 = newJson.keys();
        kotlin.jvm.internal.i.d(itKeys2, "newJson.keys()");
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e11) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e11, (Ia.a<String>) new j(next2));
            }
        }
        return jSONObject;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            kotlin.jvm.internal.i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String upperCase = string.toUpperCase(US);
            kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TargetEnum targetenum2 = (TargetEnum) com.braze.support.c.a(upperCase, targetEnumClass);
            return targetenum2 == null ? targetenum : targetenum2;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !n.S(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) k.f24303b);
            }
        }
        return bundle;
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject otherJson) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        kotlin.jvm.internal.i.e(otherJson, "otherJson");
        return mergeJsonObjects(jSONObject, otherJson);
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, TargetEnum defaultEnum) {
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(defaultEnum, "defaultEnum");
        try {
            com.braze.support.c cVar = com.braze.support.c.f24371a;
            String string = jsonObject.getString(key);
            kotlin.jvm.internal.i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            kotlin.jvm.internal.i.d(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            kotlin.jvm.internal.i.l();
            throw null;
        } catch (Exception unused) {
            return defaultEnum;
        }
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        kotlin.jvm.internal.i.e(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (T t8 : tArr) {
            jSONArray.put(t8);
        }
        return jSONArray;
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        String string = "";
        if (jSONArray != null) {
            try {
                string = jSONArray.toString(2);
            } catch (Throwable th) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Ia.a<String>) d.f24296b);
            }
            kotlin.jvm.internal.i.d(string, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return string;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key) {
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.i.e(key, "key");
        try {
            com.braze.support.c cVar = com.braze.support.c.f24371a;
            String string = jsonObject.getString(key);
            kotlin.jvm.internal.i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            kotlin.jvm.internal.i.d(string.toUpperCase(US), "this as java.lang.String).toUpperCase(locale)");
            kotlin.jvm.internal.i.l();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <T> Iterator<T> iterator(JSONObject jSONObject) {
        kotlin.jvm.internal.i.e(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.i.d(itKeys, "this.keys()");
        SequencesKt__SequencesKt.x(itKeys);
        kotlin.jvm.internal.i.l();
        throw null;
    }
}
