package kotlinx.coroutines;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineStart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CoroutineStart f43166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineStart f43167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CoroutineStart f43168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CoroutineStart f43169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CoroutineStart[] f43170f;

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        f43166b = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        f43167c = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        f43168d = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        f43169e = coroutineStart4;
        CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        f43170f = coroutineStartArr;
        kotlin.enums.a.a(coroutineStartArr);
    }

    public CoroutineStart() {
        throw null;
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f43170f.clone();
    }
}
