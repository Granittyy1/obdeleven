package K2;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: K2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0718k extends p224s2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0718k f4197c = new C0718k(4, 5);

    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        frameworkSQLiteDatabase.q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
