package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CombineSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CombineSource f19222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CombineSource f19223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CombineSource f19224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CombineSource[] f19225e;

    static {
        CombineSource combineSource = new CombineSource("INITIAL", 0);
        f19222b = combineSource;
        CombineSource combineSource2 = new CombineSource("RECEIVER", 1);
        f19223c = combineSource2;
        CombineSource combineSource3 = new CombineSource("OTHER", 2);
        f19224d = combineSource3;
        f19225e = new CombineSource[]{combineSource, combineSource2, combineSource3};
    }

    public CombineSource() {
        throw null;
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) f19225e.clone();
    }
}
