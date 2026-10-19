package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: WorkInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WorkInfo$State {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WorkInfo$State f20306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WorkInfo$State f20307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WorkInfo$State f20308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WorkInfo$State f20309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WorkInfo$State f20310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WorkInfo$State f20311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ WorkInfo$State[] f20312h;

    static {
        WorkInfo$State workInfo$State = new WorkInfo$State("ENQUEUED", 0);
        f20306b = workInfo$State;
        WorkInfo$State workInfo$State2 = new WorkInfo$State("RUNNING", 1);
        f20307c = workInfo$State2;
        WorkInfo$State workInfo$State3 = new WorkInfo$State("SUCCEEDED", 2);
        f20308d = workInfo$State3;
        WorkInfo$State workInfo$State4 = new WorkInfo$State("FAILED", 3);
        f20309e = workInfo$State4;
        WorkInfo$State workInfo$State5 = new WorkInfo$State("BLOCKED", 4);
        f20310f = workInfo$State5;
        WorkInfo$State workInfo$State6 = new WorkInfo$State("CANCELLED", 5);
        f20311g = workInfo$State6;
        f20312h = new WorkInfo$State[]{workInfo$State, workInfo$State2, workInfo$State3, workInfo$State4, workInfo$State5, workInfo$State6};
    }

    public WorkInfo$State() {
        throw null;
    }

    public static WorkInfo$State valueOf(String str) {
        return (WorkInfo$State) Enum.valueOf(WorkInfo$State.class, str);
    }

    public static WorkInfo$State[] values() {
        return (WorkInfo$State[]) f20312h.clone();
    }

    public final boolean a() {
        return this == f20308d || this == f20309e || this == f20311g;
    }
}
