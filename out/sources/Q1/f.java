package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SpliceScheduleCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Q1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f4993a;

    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class a {
    }

    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f4994a;

        public b(ArrayList arrayList) {
            this.f4994a = Collections.unmodifiableList(arrayList);
        }
    }

    public f(ArrayList arrayList) {
        this.f4993a = Collections.unmodifiableList(arrayList);
    }
}
