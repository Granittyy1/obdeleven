package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: EventBinding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EventBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24920d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: EventBinding.kt */
    public static final class ActionType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f24921b = {new ActionType("CLICK", 0), new ActionType("SELECTED", 1), new ActionType("TEXT_CHANGED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ActionType EF5;

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String value) {
            i.e(value, "value");
            return (ActionType) Enum.valueOf(ActionType.class, value);
        }

        public static ActionType[] values() {
            return (ActionType[]) Arrays.copyOf(f24921b, 3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: EventBinding.kt */
    public static final class MappingMethod {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MappingMethod[] f24922b = {new MappingMethod("MANUAL", 0), new MappingMethod("INFERENCE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        MappingMethod EF5;

        public MappingMethod() {
            throw null;
        }

        public static MappingMethod valueOf(String value) {
            i.e(value, "value");
            return (MappingMethod) Enum.valueOf(MappingMethod.class, value);
        }

        public static MappingMethod[] values() {
            return (MappingMethod[]) Arrays.copyOf(f24922b, 2);
        }
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    public static final class a {
        public static EventBinding a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            String eventName = jSONObject.getString("event_name");
            String string = jSONObject.getString("method");
            i.d(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            i.d(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string2 = jSONObject.getString("event_type");
            i.d(string2, "mapping.getString(\"event_type\")");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            i.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String appVersion = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i11);
                    i.d(jsonPath, "jsonPath");
                    arrayList.add(new PathComponent(jsonPath));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String pathType = jSONObject.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i10);
                    i.d(jsonParameter, "jsonParameter");
                    arrayList2.add(new p043d4.a(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String componentId = jSONObject.optString("component_id");
            String activityName = jSONObject.optString("activity_name");
            i.d(eventName, "eventName");
            i.d(appVersion, "appVersion");
            i.d(componentId, "componentId");
            i.d(pathType, "pathType");
            i.d(activityName, "activityName");
            return new EventBinding(eventName, mappingMethodValueOf, actionTypeValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }
    }

    public EventBinding(String str, MappingMethod method, ActionType type, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        i.e(method, "method");
        i.e(type, "type");
        this.f24917a = str;
        this.f24918b = arrayList;
        this.f24919c = arrayList2;
        this.f24920d = str5;
    }
}
