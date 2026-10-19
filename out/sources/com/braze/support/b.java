package com.braze.support;

import com.braze.enums.BrazeDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.l;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24359a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f24360b = l.s("$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(0);
            this.f24361b = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error parsing date " + this.f24361b;
        }
    }

    /* JADX INFO: renamed from: com.braze.support.b$b, reason: collision with other inner class name */
    public static final class C0252b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0252b(Object obj) {
            super(0);
            this.f24362b = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Object size (" + this.f24362b.toString().length() + " bytes) exceeds 76800";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj) {
            super(0);
            this.f24363b = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Array size (" + this.f24363b.toString().length() + " bytes) exceeds 76800";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj) {
            super(0);
            this.f24364b = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not add unsupported custom attribute type with value: " + this.f24364b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24365b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24366b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24367b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f24367b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Nested Custom Attribute Key '"), this.f24367b, "' is invalid.");
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24368b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f24369b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Custom attribute key cannot be blocklisted attribute: "), this.f24369b, '.');
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24370b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private b() {
    }

    public static final boolean a(String str, Set blocklistedAttributes) {
        kotlin.jvm.internal.i.e(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24359a, BrazeLogger.Priority.W, (Throwable) null, h.f24368b, 2, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24359a, BrazeLogger.Priority.W, (Throwable) null, new i(str), 2, (Object) null);
        return false;
    }

    public static final boolean b(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24359a, BrazeLogger.Priority.W, (Throwable) null, j.f24370b, 2, (Object) null);
        return false;
    }

    private final boolean a(String str) {
        return (!f24360b.contains(str)) & (n.S(str) | n.J(str, "$", false) | n.J(str, ".", false));
    }

    private final JSONObject a(JSONObject jSONObject, int i10) throws JSONException {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.f24366b, 3, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.i.d(itKeys, "json.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            b bVar = f24359a;
            if (bVar.a(strEnsureBrazeFieldLength)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, bVar, BrazeLogger.Priority.W, (Throwable) null, new g(next), 2, (Object) null);
            }
            if (!n.S(strEnsureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    kotlin.jvm.internal.i.d(obj, "json.get(key)");
                    Object objA = bVar.a(obj, i10);
                    if (objA == null) {
                        return null;
                    }
                    jSONObject2.put(strEnsureBrazeFieldLength, objA);
                }
            }
        }
        return jSONObject2;
    }

    private final JSONArray a(JSONArray jSONArray, int i10) throws JSONException {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.f24365b, 3, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            kotlin.jvm.internal.i.d(obj, "jsonArray.get(i)");
            Object objA = a(obj, i10);
            if (objA == null) {
                return null;
            }
            jSONArray2.put(objA);
        }
        return jSONArray2;
    }

    public static /* synthetic */ Object a(b bVar, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return bVar.a(obj, i10);
    }

    public final Object a(Object value, int i10) {
        kotlin.jvm.internal.i.e(value, "value");
        if (value instanceof Boolean ? true : value instanceof Integer ? true : value instanceof Float ? true : value instanceof Long ? true : value instanceof Double) {
            return value;
        }
        if (value instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) value);
        }
        if (value instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a(value));
            }
        } else if (value instanceof JSONObject) {
            if (i10 == 0 && value.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new C0252b(value), 2, (Object) null);
            } else {
                return a((JSONObject) value, i10 + 1);
            }
        } else if (value instanceof JSONArray) {
            if (i10 == 0 && value.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new c(value), 2, (Object) null);
            } else {
                return a((JSONArray) value, i10 + 1);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(value), 2, (Object) null);
        }
        return null;
    }

    public static final String[] a(String[] values) {
        kotlin.jvm.internal.i.e(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        for (String str : values) {
            arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
