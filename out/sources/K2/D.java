package K2;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: WorkDatabase_AutoMigration_14_15_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class D extends p224s2.a {
    @Override // p224s2.a
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        frameworkSQLiteDatabase.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        frameworkSQLiteDatabase.q("DROP TABLE `WorkSpec`");
        frameworkSQLiteDatabase.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        frameworkSQLiteDatabase.q("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues values = new ContentValues(1);
        values.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        Object[] objArr = new Object[0];
        frameworkSQLiteDatabase.getClass();
        kotlin.jvm.internal.i.e("WorkSpec", "table");
        kotlin.jvm.internal.i.e(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(FrameworkSQLiteDatabase.f20138d[3]);
        sb2.append("WorkSpec");
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE ");
            sb2.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        p285x2.f fVarU = frameworkSQLiteDatabase.u(string);
        int length2 = objArr2.length;
        int i12 = 0;
        while (i12 < length2) {
            Object obj = objArr2[i12];
            i12++;
            if (obj == null) {
                fVarU.p0(i12);
            } else if (obj instanceof byte[]) {
                fVarU.X(i12, (byte[]) obj);
            } else if (obj instanceof Float) {
                fVarU.z(i12, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                fVarU.z(i12, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                fVarU.O(i12, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                fVarU.O(i12, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                fVarU.O(i12, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                fVarU.O(i12, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                fVarU.r(i12, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i12 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                fVarU.O(i12, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        ((androidx.sqlite.db.framework.e) fVarU).f20169c.executeUpdateDelete();
    }
}
