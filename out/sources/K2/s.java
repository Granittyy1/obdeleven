package K2;

import android.content.Context;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p224s2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4222c;

    public s(Context context, int i10, int i11) {
        super(i10, i11);
        this.f4222c = context;
    }

    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        if (this.f46884b >= 10) {
            frameworkSQLiteDatabase.b("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f4222c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
