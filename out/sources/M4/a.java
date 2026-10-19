package M4;

import J4.i;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: compiled from: PriorityMapping.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<Priority> f4564a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Priority, Integer> f4565b;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f4565b = map;
        map.put(Priority.f25231b, 0);
        map.put(Priority.f25232c, 1);
        map.put(Priority.f25233d, 2);
        for (Priority priority : map.keySet()) {
            f4564a.append(f4565b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = f4565b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i10) {
        Priority priority = f4564a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(i.b(i10, "Unknown Priority for value "));
    }
}
