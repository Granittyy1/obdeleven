package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
public class Base64 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f43046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Base64 f43047e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43049b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Base64.kt */
    public static final class PaddingOption {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PaddingOption[] f43050b;

        /* JADX INFO: Fake field, exist only in values array */
        PaddingOption EF5;

        static {
            PaddingOption[] paddingOptionArr = {new PaddingOption("PRESENT", 0), new PaddingOption("ABSENT", 1), new PaddingOption("PRESENT_OPTIONAL", 2), new PaddingOption("ABSENT_OPTIONAL", 3)};
            f43050b = paddingOptionArr;
            kotlin.enums.a.a(paddingOptionArr);
        }

        public PaddingOption() {
            throw null;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) f43050b.clone();
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    public static final class a extends Base64 {
    }

    static {
        PaddingOption[] paddingOptionArr = PaddingOption.f43050b;
        f43045c = new a(false, false);
        f43046d = new byte[]{13, 10};
        f43047e = new Base64(true, false);
        new Base64(false, true);
    }

    public Base64(boolean z10, boolean z11) {
        PaddingOption[] paddingOptionArr = PaddingOption.f43050b;
        this.f43048a = z10;
        this.f43049b = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final int a(int i10) {
        int i11 = (i10 / 3) * 4;
        if (i10 % 3 != 0) {
            PaddingOption[] paddingOptionArr = PaddingOption.f43050b;
            i11 += 4;
        }
        if (this.f43049b) {
            i11 += ((i11 - 1) / 76) * 2;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
