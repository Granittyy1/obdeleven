package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BufferOverflow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BufferOverflow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BufferOverflow f43243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BufferOverflow f43244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BufferOverflow f43245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BufferOverflow[] f43246e;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        f43243b = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        f43244c = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        f43245d = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        f43246e = bufferOverflowArr;
        kotlin.enums.a.a(bufferOverflowArr);
    }

    public BufferOverflow() {
        throw null;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f43246e.clone();
    }
}
