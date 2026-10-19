package Fa;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
