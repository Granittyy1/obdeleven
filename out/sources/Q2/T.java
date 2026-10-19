package Q2;

import android.database.Cursor;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase_Impl;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class T implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f4997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f4998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f4999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f5000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f5001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f5002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P f5003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q f5004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S f5005i;
    public final B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D f5006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E f5007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f5008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I f5009n;

    public T(WorkDatabase_Impl workDatabase_Impl) {
        this.f4997a = workDatabase_Impl;
        this.f4998b = new J(workDatabase_Impl);
        new K(workDatabase_Impl);
        this.f4999c = new L(workDatabase_Impl);
        this.f5000d = new M(workDatabase_Impl);
        this.f5001e = new N(workDatabase_Impl);
        this.f5002f = new O(workDatabase_Impl);
        this.f5003g = new P(workDatabase_Impl);
        this.f5004h = new Q(workDatabase_Impl);
        this.f5005i = new S(workDatabase_Impl);
        this.j = new B(workDatabase_Impl);
        new C(workDatabase_Impl);
        this.f5006k = new D(workDatabase_Impl);
        this.f5007l = new E(workDatabase_Impl);
        this.f5008m = new F(workDatabase_Impl);
        new G(workDatabase_Impl);
        new H(workDatabase_Impl);
        this.f5009n = new I(workDatabase_Impl);
    }

    @Override // Q2.A
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        L l10 = this.f4999c;
        p285x2.f fVarA = l10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            l10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final ArrayList b() {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        kVarH.p0(1);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.isNull(0) ? null : cursorK.getString(0));
            }
            return arrayList;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final ArrayList c() throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        kVarH.O(1, androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i40 = i23;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i10) ? null : cursorK.getString(i10);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i11));
                    String string2 = cursorK.isNull(i12) ? null : cursorK.getString(i12);
                    String string3 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    long j = cursorK.getLong(i16);
                    long j10 = cursorK.getLong(i17);
                    long j11 = cursorK.getLong(i18);
                    int i41 = cursorK.getInt(i19);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i20));
                    long j12 = cursorK.getLong(i21);
                    long j13 = cursorK.getLong(i22);
                    int i42 = i40;
                    long j14 = cursorK.getLong(i42);
                    int i43 = i10;
                    int i44 = i24;
                    long j15 = cursorK.getLong(i44);
                    i24 = i44;
                    i25 = i25;
                    boolean z10 = cursorK.getInt(i25) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i26));
                    i26 = i26;
                    int i45 = i27;
                    int i46 = cursorK.getInt(i45);
                    i27 = i45;
                    int i47 = i28;
                    int i48 = cursorK.getInt(i47);
                    i28 = i47;
                    int i49 = i29;
                    long j16 = cursorK.getLong(i49);
                    i29 = i49;
                    int i50 = i30;
                    int i51 = cursorK.getInt(i50);
                    i30 = i50;
                    int i52 = i31;
                    int i53 = cursorK.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i54));
                    i32 = i54;
                    i33 = i33;
                    boolean z11 = cursorK.getInt(i33) != 0;
                    boolean z12 = cursorK.getInt(i34) != 0;
                    boolean z13 = cursorK.getInt(i35) != 0;
                    boolean z14 = cursorK.getInt(i36) != 0;
                    long j17 = cursorK.getLong(i37);
                    i37 = i37;
                    int i55 = i38;
                    long j18 = cursorK.getLong(i55);
                    i38 = i55;
                    int i56 = i39;
                    i39 = i56;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j, j10, j11, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j17, j18, Y.a(cursorK.isNull(i56) ? null : cursorK.getBlob(i56))), i41, backoffPolicyB, j12, j13, j14, j15, z10, outOfQuotaPolicyD, i46, i48, j16, i51, i53));
                    i10 = i43;
                    i40 = i42;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final void d(z zVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f4998b.f(zVar);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.A
    public final void e(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        O o10 = this.f5002f;
        p285x2.f fVarA = o10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            o10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final int f(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        E e10 = this.f5007l;
        p285x2.f fVarA = e10.a();
        fVarA.O(1, j);
        if (str == null) {
            fVarA.p0(2);
        } else {
            fVarA.r(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            e10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final ArrayList g(long j) throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        kVarH.O(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i40 = i23;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i10) ? null : cursorK.getString(i10);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i11));
                    String string2 = cursorK.isNull(i12) ? null : cursorK.getString(i12);
                    String string3 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    long j10 = cursorK.getLong(i16);
                    long j11 = cursorK.getLong(i17);
                    long j12 = cursorK.getLong(i18);
                    int i41 = cursorK.getInt(i19);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i20));
                    long j13 = cursorK.getLong(i21);
                    long j14 = cursorK.getLong(i22);
                    int i42 = i40;
                    long j15 = cursorK.getLong(i42);
                    int i43 = i10;
                    int i44 = i24;
                    long j16 = cursorK.getLong(i44);
                    i24 = i44;
                    i25 = i25;
                    boolean z10 = cursorK.getInt(i25) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i26));
                    i26 = i26;
                    int i45 = i27;
                    int i46 = cursorK.getInt(i45);
                    i27 = i45;
                    int i47 = i28;
                    int i48 = cursorK.getInt(i47);
                    i28 = i47;
                    int i49 = i29;
                    long j17 = cursorK.getLong(i49);
                    i29 = i49;
                    int i50 = i30;
                    int i51 = cursorK.getInt(i50);
                    i30 = i50;
                    int i52 = i31;
                    int i53 = cursorK.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i54));
                    i32 = i54;
                    i33 = i33;
                    boolean z11 = cursorK.getInt(i33) != 0;
                    boolean z12 = cursorK.getInt(i34) != 0;
                    boolean z13 = cursorK.getInt(i35) != 0;
                    boolean z14 = cursorK.getInt(i36) != 0;
                    long j18 = cursorK.getLong(i37);
                    i37 = i37;
                    int i55 = i38;
                    long j19 = cursorK.getLong(i55);
                    i38 = i55;
                    int i56 = i39;
                    i39 = i56;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j10, j11, j12, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j18, j19, Y.a(cursorK.isNull(i56) ? null : cursorK.getBlob(i56))), i41, backoffPolicyB, j13, j14, j15, j16, z10, outOfQuotaPolicyD, i46, i48, j17, i51, i53));
                    i10 = i43;
                    i40 = i42;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final ArrayList h(int i10) throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        kVarH.O(1, i10);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i11 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i15 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i16 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i24 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i25 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i40 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i41 = i24;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i11) ? null : cursorK.getString(i11);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i12));
                    String string2 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    String string3 = cursorK.isNull(i14) ? null : cursorK.getString(i14);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i16) ? null : cursorK.getBlob(i16));
                    long j = cursorK.getLong(i17);
                    long j10 = cursorK.getLong(i18);
                    long j11 = cursorK.getLong(i19);
                    int i42 = cursorK.getInt(i20);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i21));
                    long j12 = cursorK.getLong(i22);
                    long j13 = cursorK.getLong(i23);
                    int i43 = i41;
                    long j14 = cursorK.getLong(i43);
                    int i44 = i11;
                    int i45 = i25;
                    long j15 = cursorK.getLong(i45);
                    i25 = i45;
                    i26 = i26;
                    boolean z10 = cursorK.getInt(i26) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i27));
                    i27 = i27;
                    int i46 = i28;
                    int i47 = cursorK.getInt(i46);
                    i28 = i46;
                    int i48 = i29;
                    int i49 = cursorK.getInt(i48);
                    i29 = i48;
                    int i50 = i30;
                    long j16 = cursorK.getLong(i50);
                    i30 = i50;
                    int i51 = i31;
                    int i52 = cursorK.getInt(i51);
                    i31 = i51;
                    int i53 = i32;
                    int i54 = cursorK.getInt(i53);
                    i32 = i53;
                    int i55 = i33;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i55));
                    i33 = i55;
                    i34 = i34;
                    boolean z11 = cursorK.getInt(i34) != 0;
                    boolean z12 = cursorK.getInt(i35) != 0;
                    boolean z13 = cursorK.getInt(i36) != 0;
                    boolean z14 = cursorK.getInt(i37) != 0;
                    long j17 = cursorK.getLong(i38);
                    i38 = i38;
                    int i56 = i39;
                    long j18 = cursorK.getLong(i56);
                    i39 = i56;
                    int i57 = i40;
                    i40 = i57;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j, j10, j11, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j17, j18, Y.a(cursorK.isNull(i57) ? null : cursorK.getBlob(i57))), i42, backoffPolicyB, j12, j13, j14, j15, z10, outOfQuotaPolicyD, i47, i49, j16, i52, i54));
                    i11 = i44;
                    i41 = i43;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final ArrayList i() {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        kVarH.p0(1);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                String id = cursorK.isNull(0) ? null : cursorK.getString(0);
                WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(1));
                kotlin.jvm.internal.i.e(id, "id");
                z.a aVar = new z.a();
                aVar.f5058a = id;
                aVar.f5059b = workInfo$StateE;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final int j(WorkInfo$State workInfo$State, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        M m7 = this.f5000d;
        p285x2.f fVarA = m7.a();
        fVarA.O(1, Y.f(workInfo$State));
        if (str == null) {
            fVarA.p0(2);
        } else {
            fVarA.r(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            m7.d(fVarA);
        }
    }

    @Override // Q2.A
    public final void k(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Q q10 = this.f5004h;
        p285x2.f fVarA = q10.a();
        fVarA.O(1, j);
        if (str == null) {
            fVarA.p0(2);
        } else {
            fVarA.r(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            q10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final void l(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        D d10 = this.f5006k;
        p285x2.f fVarA = d10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        fVarA.O(2, i10);
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            d10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final ArrayList m() throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i40 = i23;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i10) ? null : cursorK.getString(i10);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i11));
                    String string2 = cursorK.isNull(i12) ? null : cursorK.getString(i12);
                    String string3 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    long j = cursorK.getLong(i16);
                    long j10 = cursorK.getLong(i17);
                    long j11 = cursorK.getLong(i18);
                    int i41 = cursorK.getInt(i19);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i20));
                    long j12 = cursorK.getLong(i21);
                    long j13 = cursorK.getLong(i22);
                    int i42 = i40;
                    long j14 = cursorK.getLong(i42);
                    int i43 = i10;
                    int i44 = i24;
                    long j15 = cursorK.getLong(i44);
                    i24 = i44;
                    i25 = i25;
                    boolean z10 = cursorK.getInt(i25) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i26));
                    i26 = i26;
                    int i45 = i27;
                    int i46 = cursorK.getInt(i45);
                    i27 = i45;
                    int i47 = i28;
                    int i48 = cursorK.getInt(i47);
                    i28 = i47;
                    int i49 = i29;
                    long j16 = cursorK.getLong(i49);
                    i29 = i49;
                    int i50 = i30;
                    int i51 = cursorK.getInt(i50);
                    i30 = i50;
                    int i52 = i31;
                    int i53 = cursorK.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i54));
                    i32 = i54;
                    i33 = i33;
                    boolean z11 = cursorK.getInt(i33) != 0;
                    boolean z12 = cursorK.getInt(i34) != 0;
                    boolean z13 = cursorK.getInt(i35) != 0;
                    boolean z14 = cursorK.getInt(i36) != 0;
                    long j17 = cursorK.getLong(i37);
                    i37 = i37;
                    int i55 = i38;
                    long j18 = cursorK.getLong(i55);
                    i38 = i55;
                    int i56 = i39;
                    i39 = i56;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j, j10, j11, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j17, j18, Y.a(cursorK.isNull(i56) ? null : cursorK.getBlob(i56))), i41, backoffPolicyB, j12, j13, j14, j15, z10, outOfQuotaPolicyD, i46, i48, j16, i51, i53));
                    i10 = i43;
                    i40 = i42;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final void n(String str, androidx.work.d dVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        P p10 = this.f5003g;
        p285x2.f fVarA = p10.a();
        byte[] bArrB = androidx.work.d.b(dVar);
        if (bArrB == null) {
            fVarA.p0(1);
        } else {
            fVarA.X(1, bArrB);
        }
        if (str == null) {
            fVarA.p0(2);
        } else {
            fVarA.r(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            p10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final ArrayList o() throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i40 = i23;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i10) ? null : cursorK.getString(i10);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i11));
                    String string2 = cursorK.isNull(i12) ? null : cursorK.getString(i12);
                    String string3 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    long j = cursorK.getLong(i16);
                    long j10 = cursorK.getLong(i17);
                    long j11 = cursorK.getLong(i18);
                    int i41 = cursorK.getInt(i19);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i20));
                    long j12 = cursorK.getLong(i21);
                    long j13 = cursorK.getLong(i22);
                    int i42 = i40;
                    long j14 = cursorK.getLong(i42);
                    int i43 = i10;
                    int i44 = i24;
                    long j15 = cursorK.getLong(i44);
                    i24 = i44;
                    i25 = i25;
                    boolean z10 = cursorK.getInt(i25) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i26));
                    i26 = i26;
                    int i45 = i27;
                    int i46 = cursorK.getInt(i45);
                    i27 = i45;
                    int i47 = i28;
                    int i48 = cursorK.getInt(i47);
                    i28 = i47;
                    int i49 = i29;
                    long j16 = cursorK.getLong(i49);
                    i29 = i49;
                    int i50 = i30;
                    int i51 = cursorK.getInt(i50);
                    i30 = i50;
                    int i52 = i31;
                    int i53 = cursorK.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i54));
                    i32 = i54;
                    i33 = i33;
                    boolean z11 = cursorK.getInt(i33) != 0;
                    boolean z12 = cursorK.getInt(i34) != 0;
                    boolean z13 = cursorK.getInt(i35) != 0;
                    boolean z14 = cursorK.getInt(i36) != 0;
                    long j17 = cursorK.getLong(i37);
                    i37 = i37;
                    int i55 = i38;
                    long j18 = cursorK.getLong(i55);
                    i38 = i55;
                    int i56 = i39;
                    i39 = i56;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j, j10, j11, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j17, j18, Y.a(cursorK.isNull(i56) ? null : cursorK.getBlob(i56))), i41, backoffPolicyB, j12, j13, j14, j15, z10, outOfQuotaPolicyD, i46, i48, j16, i51, i53));
                    i10 = i43;
                    i40 = i42;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final void p(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        I i11 = this.f5009n;
        p285x2.f fVarA = i11.a();
        fVarA.O(1, i10);
        if (str == null) {
            fVarA.p0(2);
        } else {
            fVarA.r(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            i11.d(fVarA);
        }
    }

    @Override // Q2.A
    public final boolean q() {
        boolean z10 = false;
        androidx.room.k kVarH = androidx.room.k.h(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            if (cursorK.moveToFirst() && cursorK.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final ArrayList r() throws Throwable {
        androidx.room.k kVar;
        androidx.room.k kVarH = androidx.room.k.h(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                int i40 = i23;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.isNull(i10) ? null : cursorK.getString(i10);
                    WorkInfo$State workInfo$StateE = Y.e(cursorK.getInt(i11));
                    String string2 = cursorK.isNull(i12) ? null : cursorK.getString(i12);
                    String string3 = cursorK.isNull(i13) ? null : cursorK.getString(i13);
                    androidx.work.d dVarA = androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14));
                    androidx.work.d dVarA2 = androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15));
                    long j = cursorK.getLong(i16);
                    long j10 = cursorK.getLong(i17);
                    long j11 = cursorK.getLong(i18);
                    int i41 = cursorK.getInt(i19);
                    BackoffPolicy backoffPolicyB = Y.b(cursorK.getInt(i20));
                    long j12 = cursorK.getLong(i21);
                    long j13 = cursorK.getLong(i22);
                    int i42 = i40;
                    long j14 = cursorK.getLong(i42);
                    int i43 = i10;
                    int i44 = i24;
                    long j15 = cursorK.getLong(i44);
                    i24 = i44;
                    i25 = i25;
                    boolean z10 = cursorK.getInt(i25) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyD = Y.d(cursorK.getInt(i26));
                    i26 = i26;
                    int i45 = i27;
                    int i46 = cursorK.getInt(i45);
                    i27 = i45;
                    int i47 = i28;
                    int i48 = cursorK.getInt(i47);
                    i28 = i47;
                    int i49 = i29;
                    long j16 = cursorK.getLong(i49);
                    i29 = i49;
                    int i50 = i30;
                    int i51 = cursorK.getInt(i50);
                    i30 = i50;
                    int i52 = i31;
                    int i53 = cursorK.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    NetworkType networkTypeC = Y.c(cursorK.getInt(i54));
                    i32 = i54;
                    i33 = i33;
                    boolean z11 = cursorK.getInt(i33) != 0;
                    boolean z12 = cursorK.getInt(i34) != 0;
                    boolean z13 = cursorK.getInt(i35) != 0;
                    boolean z14 = cursorK.getInt(i36) != 0;
                    long j17 = cursorK.getLong(i37);
                    i37 = i37;
                    int i55 = i38;
                    long j18 = cursorK.getLong(i55);
                    i38 = i55;
                    int i56 = i39;
                    i39 = i56;
                    arrayList.add(new z(string, workInfo$StateE, string2, string3, dVarA, dVarA2, j, j10, j11, new androidx.work.c(networkTypeC, z11, z12, z13, z14, j17, j18, Y.a(cursorK.isNull(i56) ? null : cursorK.getBlob(i56))), i41, backoffPolicyB, j12, j13, j14, j15, z10, outOfQuotaPolicyD, i46, i48, j16, i51, i53));
                    i10 = i43;
                    i40 = i42;
                }
                cursorK.close();
                kVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final WorkInfo$State s(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        WorkInfo$State workInfo$StateE = null;
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            if (cursorK.moveToFirst()) {
                Integer numValueOf = cursorK.isNull(0) ? null : Integer.valueOf(cursorK.getInt(0));
                if (numValueOf != null) {
                    workInfo$StateE = Y.e(numValueOf.intValue());
                }
            }
            return workInfo$StateE;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final z t(String str) throws Throwable {
        androidx.room.k kVar;
        z zVar;
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i10 = kotlin.jvm.internal.n.i(cursorK, "id");
            int i11 = kotlin.jvm.internal.n.i(cursorK, "state");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "worker_class_name");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "input_merger_class_name");
            int i14 = kotlin.jvm.internal.n.i(cursorK, MetricTracker.Object.INPUT);
            int i15 = kotlin.jvm.internal.n.i(cursorK, "output");
            int i16 = kotlin.jvm.internal.n.i(cursorK, "initial_delay");
            int i17 = kotlin.jvm.internal.n.i(cursorK, "interval_duration");
            int i18 = kotlin.jvm.internal.n.i(cursorK, "flex_duration");
            int i19 = kotlin.jvm.internal.n.i(cursorK, "run_attempt_count");
            int i20 = kotlin.jvm.internal.n.i(cursorK, "backoff_policy");
            int i21 = kotlin.jvm.internal.n.i(cursorK, "backoff_delay_duration");
            int i22 = kotlin.jvm.internal.n.i(cursorK, "last_enqueue_time");
            int i23 = kotlin.jvm.internal.n.i(cursorK, "minimum_retention_duration");
            kVar = kVarH;
            try {
                int i24 = kotlin.jvm.internal.n.i(cursorK, "schedule_requested_at");
                int i25 = kotlin.jvm.internal.n.i(cursorK, "run_in_foreground");
                int i26 = kotlin.jvm.internal.n.i(cursorK, "out_of_quota_policy");
                int i27 = kotlin.jvm.internal.n.i(cursorK, "period_count");
                int i28 = kotlin.jvm.internal.n.i(cursorK, "generation");
                int i29 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override");
                int i30 = kotlin.jvm.internal.n.i(cursorK, "next_schedule_time_override_generation");
                int i31 = kotlin.jvm.internal.n.i(cursorK, "stop_reason");
                int i32 = kotlin.jvm.internal.n.i(cursorK, "required_network_type");
                int i33 = kotlin.jvm.internal.n.i(cursorK, "requires_charging");
                int i34 = kotlin.jvm.internal.n.i(cursorK, "requires_device_idle");
                int i35 = kotlin.jvm.internal.n.i(cursorK, "requires_battery_not_low");
                int i36 = kotlin.jvm.internal.n.i(cursorK, "requires_storage_not_low");
                int i37 = kotlin.jvm.internal.n.i(cursorK, "trigger_content_update_delay");
                int i38 = kotlin.jvm.internal.n.i(cursorK, "trigger_max_content_delay");
                int i39 = kotlin.jvm.internal.n.i(cursorK, "content_uri_triggers");
                if (cursorK.moveToFirst()) {
                    zVar = new z(cursorK.isNull(i10) ? null : cursorK.getString(i10), Y.e(cursorK.getInt(i11)), cursorK.isNull(i12) ? null : cursorK.getString(i12), cursorK.isNull(i13) ? null : cursorK.getString(i13), androidx.work.d.a(cursorK.isNull(i14) ? null : cursorK.getBlob(i14)), androidx.work.d.a(cursorK.isNull(i15) ? null : cursorK.getBlob(i15)), cursorK.getLong(i16), cursorK.getLong(i17), cursorK.getLong(i18), new androidx.work.c(Y.c(cursorK.getInt(i32)), cursorK.getInt(i33) != 0, cursorK.getInt(i34) != 0, cursorK.getInt(i35) != 0, cursorK.getInt(i36) != 0, cursorK.getLong(i37), cursorK.getLong(i38), Y.a(cursorK.isNull(i39) ? null : cursorK.getBlob(i39))), cursorK.getInt(i19), Y.b(cursorK.getInt(i20)), cursorK.getLong(i21), cursorK.getLong(i22), cursorK.getLong(i23), cursorK.getLong(i24), cursorK.getInt(i25) != 0, Y.d(cursorK.getInt(i26)), cursorK.getInt(i27), cursorK.getInt(i28), cursorK.getLong(i29), cursorK.getInt(i30), cursorK.getInt(i31));
                } else {
                    zVar = null;
                }
                cursorK.close();
                kVar.i();
                return zVar;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                kVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarH;
        }
    }

    @Override // Q2.A
    public final int u(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        B b10 = this.j;
        p285x2.f fVarA = b10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            b10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final int v(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        N n10 = this.f5001e;
        p285x2.f fVarA = n10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            n10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final ArrayList w(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(androidx.work.d.a(cursorK.isNull(0) ? null : cursorK.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final int x(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        S s10 = this.f5005i;
        p285x2.f fVarA = s10.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            s10.d(fVarA);
        }
    }

    @Override // Q2.A
    public final int y() {
        androidx.room.k kVarH = androidx.room.k.h(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            return cursorK.moveToFirst() ? cursorK.getInt(0) : 0;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.A
    public final int z() {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.b();
        F f10 = this.f5008m;
        p285x2.f fVarA = f10.a();
        workDatabase_Impl.c();
        try {
            int iT = fVarA.t();
            workDatabase_Impl.m();
            return iT;
        } finally {
            workDatabase_Impl.j();
            f10.d(fVarA);
        }
    }
}
