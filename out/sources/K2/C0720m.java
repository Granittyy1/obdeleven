package K2;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: K2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0720m extends p224s2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0720m f4199c = new C0720m(7, 8);

    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
