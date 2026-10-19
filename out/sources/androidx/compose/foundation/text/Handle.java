package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Handle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handle f11113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handle f11114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Handle f11115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Handle[] f11116e;

    static {
        Handle handle = new Handle("Cursor", 0);
        f11113b = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        f11114c = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        f11115d = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        f11116e = handleArr;
        kotlin.enums.a.a(handleArr);
    }

    public Handle() {
        throw null;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f11116e.clone();
    }
}
