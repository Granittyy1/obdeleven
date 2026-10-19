package p005a4;

import Z3.q;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import p165n4.s;

/* JADX INFO: compiled from: UserDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f8051c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f8049a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8050b = v.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f8052d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f8053e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f8054f = new ConcurrentHashMap<>();

    public final synchronized void a() {
        try {
            AtomicBoolean atomicBoolean = f8052d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(q.a());
            i.d(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f8051c = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f8051c;
            if (sharedPreferences == null) {
                i.m("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f8053e.putAll(s.A(string));
            f8054f.putAll(s.A(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            throw th;
        }
    }
}
