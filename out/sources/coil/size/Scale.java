package coil.size;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Scale.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Scale {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Scale f23143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Scale f23144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Scale[] f23145d;

    static {
        Scale scale = new Scale("FILL", 0);
        f23143b = scale;
        Scale scale2 = new Scale("FIT", 1);
        f23144c = scale2;
        Scale[] scaleArr = {scale, scale2};
        f23145d = scaleArr;
        a.a(scaleArr);
    }

    public Scale() {
        throw null;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f23145d.clone();
    }
}
