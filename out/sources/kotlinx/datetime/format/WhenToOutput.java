package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WhenToOutput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WhenToOutput f43809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WhenToOutput f43810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WhenToOutput f43811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ WhenToOutput[] f43812e;

    static {
        WhenToOutput whenToOutput = new WhenToOutput("NEVER", 0);
        f43809b = whenToOutput;
        WhenToOutput whenToOutput2 = new WhenToOutput("IF_NONZERO", 1);
        f43810c = whenToOutput2;
        WhenToOutput whenToOutput3 = new WhenToOutput("ALWAYS", 2);
        f43811d = whenToOutput3;
        WhenToOutput[] whenToOutputArr = {whenToOutput, whenToOutput2, whenToOutput3};
        f43812e = whenToOutputArr;
        kotlin.enums.a.a(whenToOutputArr);
    }

    public WhenToOutput() {
        throw null;
    }

    public static WhenToOutput valueOf(String str) {
        return (WhenToOutput) Enum.valueOf(WhenToOutput.class, str);
    }

    public static WhenToOutput[] values() {
        return (WhenToOutput[]) f43812e.clone();
    }
}
