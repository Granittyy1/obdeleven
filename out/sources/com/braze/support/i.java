package com.braze.support;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f24397a = new i();

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24398b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while trying to read BrazeLogger tag from system properties.";
        }
    }

    private i() {
    }

    public static final String a(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", key}).getInputStream();
            kotlin.jvm.internal.i.d(inputStream, "getRuntime()\n           …             .inputStream");
            String line = new BufferedReader(new InputStreamReader(inputStream, kotlin.text.a.f43120b), 8192).readLine();
            kotlin.jvm.internal.i.d(line, "{\n            Runtime.ge…er().readLine()\n        }");
            return line;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(f24397a, BrazeLogger.Priority.E, e10, a.f24398b);
            return "";
        }
    }
}
