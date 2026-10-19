package androidx.work.impl;

import H2.b;
import K2.C;
import K2.D;
import K2.E;
import K2.F;
import K2.G;
import K2.H;
import Q2.A;
import Q2.C0727d;
import Q2.C0737n;
import Q2.C0741s;
import Q2.C0747y;
import Q2.InterfaceC0725b;
import Q2.InterfaceC0729f;
import Q2.InterfaceC0731h;
import Q2.InterfaceC0733j;
import Q2.InterfaceC0740q;
import Q2.InterfaceC0743u;
import Q2.T;
import Q2.V;
import Q2.W;
import Q2.X;
import androidx.room.h;
import androidx.room.j;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p285x2.c;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile T f20363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile C0727d f20364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile b f20365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C0737n f20366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile C0741s f20367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile C0747y f20368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile K3.b f20369r;

    public class a extends j.a {
        public a() {
        }

        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            frameworkSQLiteDatabase.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        public final j.b b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new p236t2.a.C0533a(1, 1, "work_spec_id", "TEXT", null, true));
            map.put("prerequisite_id", new p236t2.a.C0533a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new t2.a.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new t2.a.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            p236t2.a aVar = new p236t2.a("Dependency", map, hashSet, hashSet2);
            p236t2.a aVarA = p236t2.a.a(frameworkSQLiteDatabase, "Dependency");
            if (!aVar.equals(aVarA)) {
                return new j.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar + "\n Found:\n" + aVarA);
            }
            HashMap map2 = new HashMap(30);
            map2.put("id", new p236t2.a.C0533a(1, 1, "id", "TEXT", null, true));
            map2.put("state", new p236t2.a.C0533a(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new p236t2.a.C0533a(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new p236t2.a.C0533a(0, 1, "input_merger_class_name", "TEXT", null, true));
            map2.put(MetricTracker.Object.INPUT, new p236t2.a.C0533a(0, 1, MetricTracker.Object.INPUT, "BLOB", null, true));
            map2.put("output", new p236t2.a.C0533a(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new p236t2.a.C0533a(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new p236t2.a.C0533a(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new p236t2.a.C0533a(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new p236t2.a.C0533a(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new p236t2.a.C0533a(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new p236t2.a.C0533a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("last_enqueue_time", new p236t2.a.C0533a(0, 1, "last_enqueue_time", "INTEGER", CreateTicketViewModelKt.EmailId, true));
            map2.put("minimum_retention_duration", new p236t2.a.C0533a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new p236t2.a.C0533a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new p236t2.a.C0533a(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new p236t2.a.C0533a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("period_count", new p236t2.a.C0533a(0, 1, "period_count", "INTEGER", "0", true));
            map2.put("generation", new p236t2.a.C0533a(0, 1, "generation", "INTEGER", "0", true));
            map2.put("next_schedule_time_override", new p236t2.a.C0533a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
            map2.put("next_schedule_time_override_generation", new p236t2.a.C0533a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
            map2.put("stop_reason", new p236t2.a.C0533a(0, 1, "stop_reason", "INTEGER", "-256", true));
            map2.put("required_network_type", new p236t2.a.C0533a(0, 1, "required_network_type", "INTEGER", null, true));
            map2.put("requires_charging", new p236t2.a.C0533a(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new p236t2.a.C0533a(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new p236t2.a.C0533a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new p236t2.a.C0533a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new p236t2.a.C0533a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new p236t2.a.C0533a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            map2.put("content_uri_triggers", new p236t2.a.C0533a(0, 1, "content_uri_triggers", "BLOB", null, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new t2.a.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new t2.a.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            p236t2.a aVar2 = new p236t2.a("WorkSpec", map2, hashSet3, hashSet4);
            p236t2.a aVarA2 = p236t2.a.a(frameworkSQLiteDatabase, "WorkSpec");
            if (!aVar2.equals(aVarA2)) {
                return new j.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar2 + "\n Found:\n" + aVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new p236t2.a.C0533a(1, 1, "tag", "TEXT", null, true));
            map3.put("work_spec_id", new p236t2.a.C0533a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new t2.a.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p236t2.a aVar3 = new p236t2.a("WorkTag", map3, hashSet5, hashSet6);
            p236t2.a aVarA3 = p236t2.a.a(frameworkSQLiteDatabase, "WorkTag");
            if (!aVar3.equals(aVarA3)) {
                return new j.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar3 + "\n Found:\n" + aVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new p236t2.a.C0533a(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("generation", new p236t2.a.C0533a(2, 1, "generation", "INTEGER", "0", true));
            map4.put("system_id", new p236t2.a.C0533a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p236t2.a aVar4 = new p236t2.a("SystemIdInfo", map4, hashSet7, new HashSet(0));
            p236t2.a aVarA4 = p236t2.a.a(frameworkSQLiteDatabase, "SystemIdInfo");
            if (!aVar4.equals(aVarA4)) {
                return new j.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar4 + "\n Found:\n" + aVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new p236t2.a.C0533a(1, 1, "name", "TEXT", null, true));
            map5.put("work_spec_id", new p236t2.a.C0533a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new t2.a.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p236t2.a aVar5 = new p236t2.a("WorkName", map5, hashSet8, hashSet9);
            p236t2.a aVarA5 = p236t2.a.a(frameworkSQLiteDatabase, "WorkName");
            if (!aVar5.equals(aVarA5)) {
                return new j.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar5 + "\n Found:\n" + aVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new p236t2.a.C0533a(1, 1, "work_spec_id", "TEXT", null, true));
            map6.put("progress", new p236t2.a.C0533a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new t2.a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p236t2.a aVar6 = new p236t2.a("WorkProgress", map6, hashSet10, new HashSet(0));
            p236t2.a aVarA6 = p236t2.a.a(frameworkSQLiteDatabase, "WorkProgress");
            if (!aVar6.equals(aVarA6)) {
                return new j.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar6 + "\n Found:\n" + aVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new p236t2.a.C0533a(1, 1, "key", "TEXT", null, true));
            map7.put("long_value", new p236t2.a.C0533a(0, 1, "long_value", "INTEGER", null, false));
            p236t2.a aVar7 = new p236t2.a("Preference", map7, new HashSet(0), new HashSet(0));
            p236t2.a aVarA7 = p236t2.a.a(frameworkSQLiteDatabase, "Preference");
            if (aVar7.equals(aVarA7)) {
                return new j.b(true, null);
            }
            return new j.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar7 + "\n Found:\n" + aVarA7);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final c e(androidx.room.b bVar) {
        return bVar.f20097c.a(new c.b(bVar.f20095a, bVar.f20096b, new j(bVar, new a()), false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C(13, 14), new D(14, 15), new E(16, 17), new F(17, 18), new G(18, 19), new H(19, 20));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<Object>> h() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap map = new HashMap();
        map.put(A.class, Collections.emptyList());
        map.put(InterfaceC0725b.class, Collections.emptyList());
        map.put(V.class, Collections.emptyList());
        map.put(InterfaceC0733j.class, Collections.emptyList());
        map.put(InterfaceC0740q.class, Collections.emptyList());
        map.put(InterfaceC0743u.class, Collections.emptyList());
        map.put(InterfaceC0729f.class, Collections.emptyList());
        map.put(InterfaceC0731h.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0725b o() {
        C0727d c0727d;
        if (this.f20364m != null) {
            return this.f20364m;
        }
        synchronized (this) {
            try {
                if (this.f20364m == null) {
                    this.f20364m = new C0727d(this);
                }
                c0727d = this.f20364m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0727d;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0729f p() {
        K3.b bVar;
        if (this.f20369r != null) {
            return this.f20369r;
        }
        synchronized (this) {
            try {
                if (this.f20369r == null) {
                    this.f20369r = new K3.b(this);
                }
                bVar = this.f20369r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0733j q() {
        C0737n c0737n;
        if (this.f20366o != null) {
            return this.f20366o;
        }
        synchronized (this) {
            try {
                if (this.f20366o == null) {
                    this.f20366o = new C0737n(this);
                }
                c0737n = this.f20366o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0737n;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0740q r() {
        C0741s c0741s;
        if (this.f20367p != null) {
            return this.f20367p;
        }
        synchronized (this) {
            try {
                if (this.f20367p == null) {
                    this.f20367p = new C0741s(this);
                }
                c0741s = this.f20367p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0741s;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0743u s() {
        C0747y c0747y;
        if (this.f20368q != null) {
            return this.f20368q;
        }
        synchronized (this) {
            try {
                if (this.f20368q == null) {
                    this.f20368q = new C0747y(this);
                }
                c0747y = this.f20368q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0747y;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final A t() {
        T t8;
        if (this.f20363l != null) {
            return this.f20363l;
        }
        synchronized (this) {
            try {
                if (this.f20363l == null) {
                    this.f20363l = new T(this);
                }
                t8 = this.f20363l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t8;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final V u() {
        b bVar;
        if (this.f20365n != null) {
            return this.f20365n;
        }
        synchronized (this) {
            try {
                if (this.f20365n == null) {
                    b bVar2 = new b();
                    bVar2.f3626b = this;
                    bVar2.f3627c = new W(this);
                    new X(this);
                    this.f20365n = bVar2;
                }
                bVar = this.f20365n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
