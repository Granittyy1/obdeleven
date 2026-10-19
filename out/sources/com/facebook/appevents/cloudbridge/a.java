package com.facebook.appevents.cloudbridge;

import D2.V;
import Z3.q;
import Z3.r;
import Z3.x;
import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.l;
import p165n4.s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements r.b {
    @Override // Z3.r.b
    public final void b(x xVar) {
        b.f24905a.getClass();
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.ACCESSKEY;
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.DATASETID;
        LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
        String str = b.f24906b;
        Object obj = null;
        linkedHashMap = null;
        linkedHashMap = null;
        linkedHashMap = null;
        linkedHashMap = null;
        linkedHashMap = null;
        linkedHashMap = null;
        LinkedHashMap linkedHashMap = null;
        boolean zBooleanValue = false;
        FacebookRequestError facebookRequestError = xVar.f7905c;
        if (facebookRequestError != null) {
            l.a aVar = l.f44910c;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            l.a.b(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", facebookRequestError.toString(), String.valueOf(facebookRequestError.j));
            SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(settingsAPIFields3.a(), null);
                String string2 = sharedPreferences.getString(settingsAPIFields2.a(), null);
                String string3 = sharedPreferences.getString(settingsAPIFields.a(), null);
                if (string != null && !n.S(string) && string2 != null && !n.S(string2) && string3 != null && !n.S(string3)) {
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(settingsAPIFields2.a(), string2);
                    linkedHashMap.put(settingsAPIFields3.a(), string);
                    linkedHashMap.put(settingsAPIFields.a(), string3);
                    l.a.b(loggingBehavior, str.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                }
            }
            if (linkedHashMap != null) {
                URL url = new URL(String.valueOf(linkedHashMap.get(settingsAPIFields2.a())));
                HashSet<Integer> hashSet = d.f24909a;
                d.a(String.valueOf(linkedHashMap.get(settingsAPIFields3.a())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(linkedHashMap.get(settingsAPIFields.a())));
                b.f24907c = true;
                return;
            }
            return;
        }
        l.a aVar2 = l.f44910c;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        l.a.b(loggingBehavior, str, " \n\nGraph Response Received: \n================\n%s\n\n ", xVar);
        JSONObject jSONObject = xVar.f7904b;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("data");
            } catch (NullPointerException e10) {
                l.a aVar3 = l.f44910c;
                l.a.b(loggingBehavior, str, "CloudBridge Settings API response is not a valid json: \n%s ", V.t(e10));
                return;
            } catch (JSONException e11) {
                l.a aVar4 = l.f44910c;
                l.a.b(loggingBehavior, str, "CloudBridge Settings API response is not a valid json: \n%s ", V.t(e11));
                return;
            }
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        HashMap mapH = s.h(new JSONObject((String) kotlin.collections.q.P(s.g((JSONArray) obj))));
        String str2 = (String) mapH.get(settingsAPIFields2.a());
        String str3 = (String) mapH.get(settingsAPIFields3.a());
        String str4 = (String) mapH.get(settingsAPIFields.a());
        if (str2 == null || str3 == null || str4 == null) {
            l.a.a(loggingBehavior, str, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            d.a(str3, str2, str4);
            b.a(mapH);
            SettingsAPIFields settingsAPIFields4 = SettingsAPIFields.ENABLED;
            if (mapH.get(settingsAPIFields4.a()) != null) {
                Object obj2 = mapH.get(settingsAPIFields4.a());
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
            b.f24907c = zBooleanValue;
        } catch (MalformedURLException e12) {
            l.a aVar5 = l.f44910c;
            l.a.b(loggingBehavior, str, "CloudBridge Settings API response doesn't have valid url\n %s ", V.t(e12));
        }
    }
}
