package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextToolbarStatus.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextToolbarStatus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextToolbarStatus f14967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextToolbarStatus f14968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TextToolbarStatus[] f14969d;

    static {
        TextToolbarStatus textToolbarStatus = new TextToolbarStatus("Shown", 0);
        f14967b = textToolbarStatus;
        TextToolbarStatus textToolbarStatus2 = new TextToolbarStatus("Hidden", 1);
        f14968c = textToolbarStatus2;
        TextToolbarStatus[] textToolbarStatusArr = {textToolbarStatus, textToolbarStatus2};
        f14969d = textToolbarStatusArr;
        kotlin.enums.a.a(textToolbarStatusArr);
    }

    public TextToolbarStatus() {
        throw null;
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f14969d.clone();
    }
}
