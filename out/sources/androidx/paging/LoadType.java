package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoadType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LoadType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LoadType f19252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LoadType f19253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LoadType f19254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LoadType[] f19255e;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        f19252b = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        f19253c = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        f19254d = loadType3;
        f19255e = new LoadType[]{loadType, loadType2, loadType3};
    }

    public LoadType() {
        throw null;
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) f19255e.clone();
    }
}
