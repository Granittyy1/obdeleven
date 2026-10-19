package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DataSource f24511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DataSource f24512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DataSource f24513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DataSource f24514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DataSource f24515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ DataSource[] f24516g;

    static {
        DataSource dataSource = new DataSource("LOCAL", 0);
        f24511b = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        f24512c = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        f24513d = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        f24514e = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        f24515f = dataSource5;
        f24516g = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public DataSource() {
        throw null;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f24516g.clone();
    }
}
