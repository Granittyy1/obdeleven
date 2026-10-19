package A1;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtractorsFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface t {
    p[] c();

    default p[] d(Uri uri, Map<String, List<String>> map) {
        return c();
    }
}
