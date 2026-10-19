package com.braze.support;

import Ia.l;
import com.braze.models.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f24373a = new d();

    public static final class a extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONArray jSONArray) {
            super(1);
            this.f24374b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f24374b.opt(i10) instanceof JSONObject);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class b extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24375b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(1);
            this.f24375b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f24375b.get(i10);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f24376b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize feature flag Json: " + this.f24376b;
        }
    }

    private d() {
    }

    public final List a(JSONArray featureFlagsJson) {
        kotlin.jvm.internal.i.e(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        kotlin.sequences.e eVarC = SequencesKt___SequencesKt.C(q.H(Na.l.J(0, featureFlagsJson.length())), new a(featureFlagsJson));
        b bVar = new b(featureFlagsJson);
        Iterator<T> it = eVarC.iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlagA = f24373a.a((JSONObject) bVar.invoke(it.next()));
            if (featureFlagA != null) {
                arrayList.add(featureFlagA);
            }
        }
        return arrayList;
    }

    public final FeatureFlag a(JSONObject featureFlagObject) {
        kotlin.jvm.internal.i.e(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString("id");
            kotlin.jvm.internal.i.d(string, "featureFlagObject.getString(FeatureFlag.ID)");
            boolean z10 = featureFlagObject.getBoolean(FeatureFlag.ENABLED);
            JSONObject jSONObjectOptJSONObject = featureFlagObject.optJSONObject(FeatureFlag.PROPERTIES);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z10, jSONObjectOptJSONObject, JsonUtils.getOptionalString(featureFlagObject, FeatureFlag.TRACKING_STRING));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new c(featureFlagObject));
            return null;
        }
    }
}
