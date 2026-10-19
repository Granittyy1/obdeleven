package com.google.firebase.sessions.settings;

import android.net.Uri;
import java.net.URL;
import kotlin.coroutines.e;

/* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.sessions.b f28762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f28763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28764c = "firebase-settings.crashlytics.com";

    public b(com.google.firebase.sessions.b bVar, e eVar) {
        this.f28762a = bVar;
        this.f28763b = eVar;
    }

    public static final URL a(b bVar) {
        bVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority(bVar.f28764c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        com.google.firebase.sessions.b bVar2 = bVar.f28762a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar2.f28678a).appendPath("settings");
        com.google.firebase.sessions.a aVar = bVar2.f28681d;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f28666c).appendQueryParameter("display_version", aVar.f28665b).build().toString());
    }
}
