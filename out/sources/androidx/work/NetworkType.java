package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NetworkType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NetworkType f20296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NetworkType f20297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final NetworkType f20298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final NetworkType f20299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final NetworkType f20300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final NetworkType f20301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f20302h;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        f20296b = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        f20297c = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        f20298d = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        f20299e = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        f20300f = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        f20301g = networkType6;
        f20302h = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public NetworkType() {
        throw null;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f20302h.clone();
    }
}
