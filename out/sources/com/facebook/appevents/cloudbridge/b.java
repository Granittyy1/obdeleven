package com.facebook.appevents.cloudbridge;

import Z3.q;
import android.content.SharedPreferences;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import p165n4.l;

/* JADX INFO: compiled from: AppEventsCAPIManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24905a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24906b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f24907c;

    public static void a(HashMap map) {
        SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.a());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.a());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.a());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(settingsAPIFields.a(), obj.toString());
        editorEdit.putString(settingsAPIFields2.a(), obj2.toString());
        editorEdit.putString(settingsAPIFields3.a(), obj3.toString());
        editorEdit.apply();
        l.a aVar = l.f44910c;
        l.a.b(LoggingBehavior.f24776d, f24906b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
