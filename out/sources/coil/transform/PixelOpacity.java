package coil.transform;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PixelOpacity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PixelOpacity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PixelOpacity f23146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PixelOpacity f23147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PixelOpacity f23148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PixelOpacity[] f23149e;

    static {
        PixelOpacity pixelOpacity = new PixelOpacity("UNCHANGED", 0);
        f23146b = pixelOpacity;
        PixelOpacity pixelOpacity2 = new PixelOpacity("TRANSLUCENT", 1);
        f23147c = pixelOpacity2;
        PixelOpacity pixelOpacity3 = new PixelOpacity("OPAQUE", 2);
        f23148d = pixelOpacity3;
        PixelOpacity[] pixelOpacityArr = {pixelOpacity, pixelOpacity2, pixelOpacity3};
        f23149e = pixelOpacityArr;
        a.a(pixelOpacityArr);
    }

    public PixelOpacity() {
        throw null;
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) f23149e.clone();
    }
}
