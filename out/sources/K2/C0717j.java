package K2;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: K2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0717j extends p224s2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0717j f4196c = new C0717j(3, 4);

    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
