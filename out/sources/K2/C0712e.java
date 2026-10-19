package K2;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: K2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0712e extends p224s2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0712e f4191c = new C0712e(11, 12);

    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
