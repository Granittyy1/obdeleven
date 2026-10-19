package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.t3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24356a = new a();

    /* JADX INFO: renamed from: com.braze.support.a$a, reason: collision with other inner class name */
    public static final class C0251a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0251a(String str) {
            super(0);
            this.f24357b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Unexpected system broadcast received ["), this.f24357b, ']');
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24358b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private a() {
    }

    public static final t3 a(Intent intent, ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.i.e(intent, "intent");
        kotlin.jvm.internal.i.e(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24356a, BrazeLogger.Priority.W, (Throwable) null, new C0251a(action), 2, (Object) null);
            return t3.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return t3.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1 || type == 6) {
                    return t3.GREAT;
                }
                return type != 9 ? t3.NONE : t3.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 3) {
                return (subtype == 13 || subtype == 20) ? t3.GREAT : t3.BAD;
            }
            return t3.GOOD;
        } catch (SecurityException e10) {
            BrazeLogger.INSTANCE.brazelog(f24356a, BrazeLogger.Priority.E, e10, b.f24358b);
            return t3.NONE;
        }
    }

    public static final t3 a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return t3.NONE;
        }
        int iMin = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (iMin > 14000) {
            return t3.GREAT;
        }
        if (iMin > 4000) {
            return t3.GOOD;
        }
        return t3.BAD;
    }
}
