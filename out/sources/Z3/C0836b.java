package Z3;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: Z3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessTokenCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0836b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7795a;

    /* JADX INFO: renamed from: Z3.b$a */
    /* JADX INFO: compiled from: AccessTokenCache.kt */
    public static final class a {
    }

    public C0836b() {
        SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f7795a = sharedPreferences;
    }
}
