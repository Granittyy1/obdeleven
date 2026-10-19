package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextFieldType f11857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TextFieldType[] f11858c;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        f11857b = textFieldType;
        TextFieldType[] textFieldTypeArr = {textFieldType, new TextFieldType("Outlined", 1)};
        f11858c = textFieldTypeArr;
        kotlin.enums.a.a(textFieldTypeArr);
    }

    public TextFieldType() {
        throw null;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f11858c.clone();
    }
}
