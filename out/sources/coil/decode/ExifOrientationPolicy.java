package coil.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ExifOrientationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExifOrientationPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExifOrientationPolicy f22862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ExifOrientationPolicy[] f22863c;

    /* JADX INFO: Fake field, exist only in values array */
    ExifOrientationPolicy EF0;

    static {
        ExifOrientationPolicy exifOrientationPolicy = new ExifOrientationPolicy("IGNORE", 0);
        ExifOrientationPolicy exifOrientationPolicy2 = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
        f22862b = exifOrientationPolicy2;
        ExifOrientationPolicy[] exifOrientationPolicyArr = {exifOrientationPolicy, exifOrientationPolicy2, new ExifOrientationPolicy("RESPECT_ALL", 2)};
        f22863c = exifOrientationPolicyArr;
        kotlin.enums.a.a(exifOrientationPolicyArr);
    }

    public ExifOrientationPolicy() {
        throw null;
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) f22863c.clone();
    }
}
