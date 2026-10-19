package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Flag f25275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Flag f25276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Flag f25277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f25278e;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            f25275b = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            f25276c = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            f25277d = flag3;
            f25278e = new Flag[]{flag, flag2, flag3};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f25278e.clone();
        }
    }

    public static abstract class a {
        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public abstract L4.a a();

    public final long b(Priority priority, long j, int i10) {
        long jB = j - a().b();
        a aVar = c().get(priority);
        long jA = aVar.a();
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) i11)))), jB), aVar.c());
    }

    public abstract Map<Priority, a> c();
}
