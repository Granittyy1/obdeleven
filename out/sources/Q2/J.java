package Q2;

import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class J extends androidx.room.d<z> {
    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.d
    public final void e(p285x2.f fVar, z zVar) throws Throwable {
        int i10;
        int i11;
        byte[] byteArray;
        z zVar2 = zVar;
        String str = zVar2.f5036a;
        int i12 = 1;
        if (str == null) {
            fVar.p0(1);
        } else {
            fVar.r(1, str);
        }
        fVar.O(2, Y.f(zVar2.f5037b));
        String str2 = zVar2.f5038c;
        if (str2 == null) {
            fVar.p0(3);
        } else {
            fVar.r(3, str2);
        }
        String str3 = zVar2.f5039d;
        if (str3 == null) {
            fVar.p0(4);
        } else {
            fVar.r(4, str3);
        }
        byte[] bArrB = androidx.work.d.b(zVar2.f5040e);
        if (bArrB == null) {
            fVar.p0(5);
        } else {
            fVar.X(5, bArrB);
        }
        byte[] bArrB2 = androidx.work.d.b(zVar2.f5041f);
        if (bArrB2 == null) {
            fVar.p0(6);
        } else {
            fVar.X(6, bArrB2);
        }
        fVar.O(7, zVar2.f5042g);
        fVar.O(8, zVar2.f5043h);
        fVar.O(9, zVar2.f5044i);
        fVar.O(10, zVar2.f5045k);
        BackoffPolicy backoffPolicy = zVar2.f5046l;
        kotlin.jvm.internal.i.e(backoffPolicy, "backoffPolicy");
        int iOrdinal = backoffPolicy.ordinal();
        if (iOrdinal == 0) {
            i10 = 0;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        fVar.O(11, i10);
        fVar.O(12, zVar2.f5047m);
        fVar.O(13, zVar2.f5048n);
        fVar.O(14, zVar2.f5049o);
        fVar.O(15, zVar2.f5050p);
        fVar.O(16, zVar2.f5051q ? 1L : 0L);
        OutOfQuotaPolicy policy = zVar2.f5052r;
        kotlin.jvm.internal.i.e(policy, "policy");
        int iOrdinal2 = policy.ordinal();
        if (iOrdinal2 == 0) {
            i11 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 1;
        }
        fVar.O(17, i11);
        fVar.O(18, zVar2.f5053s);
        fVar.O(19, zVar2.f5054t);
        fVar.O(20, zVar2.f5055u);
        fVar.O(21, zVar2.f5056v);
        fVar.O(22, zVar2.f5057w);
        androidx.work.c cVar = zVar2.j;
        if (cVar == null) {
            fVar.p0(23);
            fVar.p0(24);
            fVar.p0(25);
            fVar.p0(26);
            fVar.p0(27);
            fVar.p0(28);
            fVar.p0(29);
            fVar.p0(30);
            return;
        }
        NetworkType networkType = cVar.f20341a;
        kotlin.jvm.internal.i.e(networkType, "networkType");
        int iOrdinal3 = networkType.ordinal();
        if (iOrdinal3 == 0) {
            i12 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i12 = 2;
            } else if (iOrdinal3 == 3) {
                i12 = 3;
            } else if (iOrdinal3 == 4) {
                i12 = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.f20301g) {
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                i12 = 5;
            }
        }
        fVar.O(23, i12);
        fVar.O(24, cVar.f20342b ? 1L : 0L);
        fVar.O(25, cVar.f20343c ? 1L : 0L);
        fVar.O(26, cVar.f20344d ? 1L : 0L);
        fVar.O(27, cVar.f20345e ? 1L : 0L);
        fVar.O(28, cVar.f20346f);
        fVar.O(29, cVar.f20347g);
        Set<androidx.work.c.a> triggers = cVar.f20348h;
        kotlin.jvm.internal.i.e(triggers, "triggers");
        if (triggers.isEmpty()) {
            byteArray = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(triggers.size());
                    for (androidx.work.c.a aVar : triggers) {
                        objectOutputStream.writeUTF(aVar.f20349a.toString());
                        objectOutputStream.writeBoolean(aVar.f20350b);
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                    p241t7.b.n(objectOutputStream, null);
                    p241t7.b.n(byteArrayOutputStream, null);
                    byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.i.d(byteArray, "outputStream.toByteArray()");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p241t7.b.n(byteArrayOutputStream, th3);
                    throw th4;
                }
            }
        }
        fVar.X(30, byteArray);
    }
}
