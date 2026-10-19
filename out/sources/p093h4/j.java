package p093h4;

import Z3.q;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SessionInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f36164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UUID f36165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f36167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f36168f;

    public j(Long l10, Long l11) {
        UUID uuidRandomUUID = UUID.randomUUID();
        i.d(uuidRandomUUID, "randomUUID()");
        this.f36163a = l10;
        this.f36164b = l11;
        this.f36165c = uuidRandomUUID;
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(q.a()).edit();
        Long l10 = this.f36163a;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f36164b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f36166d);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f36165c.toString());
        editorEdit.apply();
        l lVar = this.f36168f;
        if (lVar == null || lVar == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(q.a()).edit();
        editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", lVar.f36172a);
        editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", lVar.f36173b);
        editorEdit2.apply();
    }
}
