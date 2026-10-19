package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SheetValue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SheetValue f12304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SheetValue f12305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SheetValue f12306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SheetValue[] f12307e;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        f12304b = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        f12305c = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        f12306d = sheetValue3;
        f12307e = new SheetValue[]{sheetValue, sheetValue2, sheetValue3};
    }

    public SheetValue() {
        throw null;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) f12307e.clone();
    }
}
