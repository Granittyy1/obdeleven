package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionHandleAnchor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SelectionHandleAnchor f11537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SelectionHandleAnchor f11538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SelectionHandleAnchor f11539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SelectionHandleAnchor[] f11540e;

    static {
        SelectionHandleAnchor selectionHandleAnchor = new SelectionHandleAnchor("Left", 0);
        f11537b = selectionHandleAnchor;
        SelectionHandleAnchor selectionHandleAnchor2 = new SelectionHandleAnchor("Middle", 1);
        f11538c = selectionHandleAnchor2;
        SelectionHandleAnchor selectionHandleAnchor3 = new SelectionHandleAnchor("Right", 2);
        f11539d = selectionHandleAnchor3;
        SelectionHandleAnchor[] selectionHandleAnchorArr = {selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
        f11540e = selectionHandleAnchorArr;
        kotlin.enums.a.a(selectionHandleAnchorArr);
    }

    public SelectionHandleAnchor() {
        throw null;
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) f11540e.clone();
    }
}
