package p140l1;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p078g1.i;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface d extends i {

    /* JADX INFO: compiled from: DataSource.java */
    public interface a {
    }

    void b(l lVar);

    void close() throws IOException;

    long f(e eVar) throws IOException;

    default Map<String, List<String>> g() {
        return Collections.emptyMap();
    }

    Uri getUri();
}
