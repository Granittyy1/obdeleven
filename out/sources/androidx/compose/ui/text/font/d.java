package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15425b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f15426c = new n("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f15427d;

    /* JADX INFO: compiled from: FontFamily.kt */
    public interface a {
        w a(d dVar, l lVar, int i10, int i11);
    }

    static {
        new n("serif", "FontFamily.Serif");
        f15427d = new n("monospace", "FontFamily.Monospace");
        new n("cursive", "FontFamily.Cursive");
    }
}
