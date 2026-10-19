package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
final class ScaffoldLayoutContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScaffoldLayoutContent f11801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScaffoldLayoutContent f11802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScaffoldLayoutContent f11803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScaffoldLayoutContent f11804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ScaffoldLayoutContent f11805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ScaffoldLayoutContent[] f11806g;

    static {
        ScaffoldLayoutContent scaffoldLayoutContent = new ScaffoldLayoutContent("TopBar", 0);
        f11801b = scaffoldLayoutContent;
        ScaffoldLayoutContent scaffoldLayoutContent2 = new ScaffoldLayoutContent("MainContent", 1);
        f11802c = scaffoldLayoutContent2;
        ScaffoldLayoutContent scaffoldLayoutContent3 = new ScaffoldLayoutContent("Snackbar", 2);
        f11803d = scaffoldLayoutContent3;
        ScaffoldLayoutContent scaffoldLayoutContent4 = new ScaffoldLayoutContent("Fab", 3);
        f11804e = scaffoldLayoutContent4;
        ScaffoldLayoutContent scaffoldLayoutContent5 = new ScaffoldLayoutContent("BottomBar", 4);
        f11805f = scaffoldLayoutContent5;
        ScaffoldLayoutContent[] scaffoldLayoutContentArr = {scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
        f11806g = scaffoldLayoutContentArr;
        kotlin.enums.a.a(scaffoldLayoutContentArr);
    }

    public ScaffoldLayoutContent() {
        throw null;
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f11806g.clone();
    }
}
