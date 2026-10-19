package io.grpc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ConnectivityState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConnectivityState f36867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConnectivityState f36868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConnectivityState f36869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConnectivityState f36870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectivityState f36871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ConnectivityState[] f36872g;

    static {
        ConnectivityState connectivityState = new ConnectivityState("CONNECTING", 0);
        f36867b = connectivityState;
        ConnectivityState connectivityState2 = new ConnectivityState("READY", 1);
        f36868c = connectivityState2;
        ConnectivityState connectivityState3 = new ConnectivityState("TRANSIENT_FAILURE", 2);
        f36869d = connectivityState3;
        ConnectivityState connectivityState4 = new ConnectivityState("IDLE", 3);
        f36870e = connectivityState4;
        ConnectivityState connectivityState5 = new ConnectivityState("SHUTDOWN", 4);
        f36871f = connectivityState5;
        f36872g = new ConnectivityState[]{connectivityState, connectivityState2, connectivityState3, connectivityState4, connectivityState5};
    }

    public ConnectivityState() {
        throw null;
    }

    public static ConnectivityState valueOf(String str) {
        return (ConnectivityState) Enum.valueOf(ConnectivityState.class, str);
    }

    public static ConnectivityState[] values() {
        return (ConnectivityState[]) f36872g.clone();
    }
}
