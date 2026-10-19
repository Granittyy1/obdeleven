package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
final class ScaffoldLayoutContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScaffoldLayoutContent f12292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScaffoldLayoutContent f12293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScaffoldLayoutContent f12294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScaffoldLayoutContent f12295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ScaffoldLayoutContent f12296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ScaffoldLayoutContent[] f12297g;

    static {
        ScaffoldLayoutContent scaffoldLayoutContent = new ScaffoldLayoutContent("TopBar", 0);
        f12292b = scaffoldLayoutContent;
        ScaffoldLayoutContent scaffoldLayoutContent2 = new ScaffoldLayoutContent("MainContent", 1);
        f12293c = scaffoldLayoutContent2;
        ScaffoldLayoutContent scaffoldLayoutContent3 = new ScaffoldLayoutContent("Snackbar", 2);
        f12294d = scaffoldLayoutContent3;
        ScaffoldLayoutContent scaffoldLayoutContent4 = new ScaffoldLayoutContent("Fab", 3);
        f12295e = scaffoldLayoutContent4;
        ScaffoldLayoutContent scaffoldLayoutContent5 = new ScaffoldLayoutContent("BottomBar", 4);
        f12296f = scaffoldLayoutContent5;
        f12297g = new ScaffoldLayoutContent[]{scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
    }

    public ScaffoldLayoutContent() {
        throw null;
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f12297g.clone();
    }
}
