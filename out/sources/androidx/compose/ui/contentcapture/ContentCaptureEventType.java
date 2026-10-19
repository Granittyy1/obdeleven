package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
final class ContentCaptureEventType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ContentCaptureEventType f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ContentCaptureEventType f13325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ContentCaptureEventType[] f13326d;

    static {
        ContentCaptureEventType contentCaptureEventType = new ContentCaptureEventType("VIEW_APPEAR", 0);
        f13324b = contentCaptureEventType;
        ContentCaptureEventType contentCaptureEventType2 = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        f13325c = contentCaptureEventType2;
        ContentCaptureEventType[] contentCaptureEventTypeArr = {contentCaptureEventType, contentCaptureEventType2};
        f13326d = contentCaptureEventTypeArr;
        kotlin.enums.a.a(contentCaptureEventTypeArr);
    }

    public ContentCaptureEventType() {
        throw null;
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) f13326d.clone();
    }
}
