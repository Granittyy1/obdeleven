package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CrossStatus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CrossStatus f11530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CrossStatus f11531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CrossStatus f11532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CrossStatus[] f11533e;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        f11530b = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        f11531c = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        f11532d = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        f11533e = crossStatusArr;
        kotlin.enums.a.a(crossStatusArr);
    }

    public CrossStatus() {
        throw null;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) f11533e.clone();
    }
}
