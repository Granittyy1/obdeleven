package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextFieldType f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextFieldType f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TextFieldType[] f12514d;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        f12512b = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        f12513c = textFieldType2;
        f12514d = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public TextFieldType() {
        throw null;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f12514d.clone();
    }
}
