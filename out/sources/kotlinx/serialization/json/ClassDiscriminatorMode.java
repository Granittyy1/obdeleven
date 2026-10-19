package kotlinx.serialization.json;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassDiscriminatorMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClassDiscriminatorMode f43961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ClassDiscriminatorMode f43962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ClassDiscriminatorMode[] f43963d;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode("NONE", 0);
        f43961b = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        f43962c = classDiscriminatorMode3;
        ClassDiscriminatorMode[] classDiscriminatorModeArr = {classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
        f43963d = classDiscriminatorModeArr;
        a.a(classDiscriminatorModeArr);
    }

    public ClassDiscriminatorMode() {
        throw null;
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) f43963d.clone();
    }
}
