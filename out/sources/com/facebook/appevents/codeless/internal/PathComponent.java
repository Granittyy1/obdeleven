package com.facebook.appevents.codeless.internal;

import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PathComponent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PathComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24930h;

    /* JADX INFO: compiled from: PathComponent.kt */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            return (MatchBitmaskType[]) Arrays.copyOf(values(), 5);
        }

        public final int a() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("class_name");
        i.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f24923a = string;
        this.f24924b = jSONObject.optInt("index", -1);
        this.f24925c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString(AttributeType.TEXT);
        i.d(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f24926d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        i.d(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f24927e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        i.d(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f24928f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        i.d(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f24929g = strOptString4;
        this.f24930h = jSONObject.optInt("match_bitmask");
    }
}
