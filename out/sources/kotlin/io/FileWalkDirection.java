package kotlin.io;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FileWalkDirection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f43043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f43044c;

    /* JADX INFO: Fake field, exist only in values array */
    FileWalkDirection EF0;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        f43043b = fileWalkDirection2;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        f43044c = fileWalkDirectionArr;
        a.a(fileWalkDirectionArr);
    }

    public FileWalkDirection() {
        throw null;
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f43044c.clone();
    }
}
