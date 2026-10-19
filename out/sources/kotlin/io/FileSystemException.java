package kotlin.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;
}
