package C4;

import android.util.Base64;
import com.google.android.datatransport.Priority;

/* JADX INFO: compiled from: TransportContext.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public abstract String a();

    public abstract byte[] b();

    public abstract Priority c();

    public final l d(Priority priority) {
        String strA = a();
        if (strA == null) {
            throw new NullPointerException("Null backendName");
        }
        if (priority != null) {
            return new l(strA, b(), priority);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        String strA = a();
        Priority priorityC = c();
        String strEncodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(strA);
        sb2.append(", ");
        sb2.append(priorityC);
        sb2.append(", ");
        return Q8.d.a(sb2, strEncodeToString, ")");
    }
}
