package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DrawerValue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DrawerValue f11736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DrawerValue f11737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DrawerValue[] f11738d;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        f11736b = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        f11737c = drawerValue2;
        DrawerValue[] drawerValueArr = {drawerValue, drawerValue2};
        f11738d = drawerValueArr;
        kotlin.enums.a.a(drawerValueArr);
    }

    public DrawerValue() {
        throw null;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f11738d.clone();
    }
}
