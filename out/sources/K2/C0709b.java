package K2;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: K2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0709b extends RoomDatabase.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F8.a f4189a;

    public C0709b(F8.a clock) {
        kotlin.jvm.internal.i.e(clock, "clock");
        this.f4189a = clock;
    }

    @Override // androidx.room.RoomDatabase.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.l();
        try {
            StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f4189a.getClass();
            sb2.append(System.currentTimeMillis() - z.f4241a);
            sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            frameworkSQLiteDatabase.q(sb2.toString());
            frameworkSQLiteDatabase.P();
        } finally {
            frameworkSQLiteDatabase.g0();
        }
    }
}
