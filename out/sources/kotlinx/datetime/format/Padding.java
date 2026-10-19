package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DateTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Padding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Padding f43773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Padding f43774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Padding f43775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Padding[] f43776e;

    static {
        Padding padding = new Padding("NONE", 0);
        f43773b = padding;
        Padding padding2 = new Padding("ZERO", 1);
        f43774c = padding2;
        Padding padding3 = new Padding("SPACE", 2);
        f43775d = padding3;
        Padding[] paddingArr = {padding, padding2, padding3};
        f43776e = paddingArr;
        kotlin.enums.a.a(paddingArr);
    }

    public Padding() {
        throw null;
    }

    public static Padding valueOf(String str) {
        return (Padding) Enum.valueOf(Padding.class, str);
    }

    public static Padding[] values() {
        return (Padding[]) f43776e.clone();
    }
}
