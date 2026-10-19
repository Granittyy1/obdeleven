package p093h4;

import Z3.q;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (e.f36143g == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(q.a());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            j jVar = null;
            jVar = null;
            jVar = null;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j != 0 && j10 != 0 && string != null) {
                j jVar2 = new j(Long.valueOf(j), Long.valueOf(j10));
                jVar2.f36166d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(q.a());
                jVar2.f36168f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new l(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                jVar2.f36167e = Long.valueOf(System.currentTimeMillis());
                UUID uuidFromString = UUID.fromString(string);
                i.d(uuidFromString, "fromString(sessionIDStr)");
                jVar2.f36165c = uuidFromString;
                jVar = jVar2;
            }
            e.f36143g = jVar;
        }
    }
}
