package com.braze.support;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;

/* JADX INFO: loaded from: classes.dex */
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24304b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Package name may not be blank";
        }
    }

    private PackageUtils() {
    }

    public static final String getResourcePackageName(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        String str = packageName;
        if (str != null) {
            return str;
        }
        String packageName2 = context.getPackageName();
        packageName = packageName2;
        return packageName2 == null ? "unknown.package" : packageName2;
    }

    public static final void setResourcePackageName(String packageName2) {
        kotlin.jvm.internal.i.e(packageName2, "packageName");
        if (n.S(packageName2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, a.f24304b, 2, (Object) null);
        } else {
            packageName = packageName2;
        }
    }
}
