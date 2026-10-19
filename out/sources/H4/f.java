package H4;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: SchedulingConfigModule_ConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements E4.b<SchedulerConfig> {
    @Override // p268va.a
    public final Object get() {
        L4.b bVar = new L4.b();
        HashMap map = new HashMap();
        Priority priority = Priority.f25231b;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(priority, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(30000L, 86400000L, setEmptySet));
        Priority priority2 = Priority.f25233d;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(priority2, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(1000L, 86400000L, setEmptySet2));
        Priority priority3 = Priority.f25232c;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.f25276c)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(priority3, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(bVar, map);
    }
}
