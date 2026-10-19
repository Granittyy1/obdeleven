package coil.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DataSource f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DataSource f22858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DataSource f22859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DataSource f22860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DataSource[] f22861f;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        f22857b = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        f22858c = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        f22859d = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        f22860e = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        f22861f = dataSourceArr;
        kotlin.enums.a.a(dataSourceArr);
    }

    public DataSource() {
        throw null;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f22861f.clone();
    }
}
