package K2;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: WorkDatabase_AutoMigration_18_19_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class G extends p224s2.a {
    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
