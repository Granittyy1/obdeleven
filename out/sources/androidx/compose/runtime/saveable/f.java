package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: SaveableStateRegistry.kt */
    public interface a {
        void a();
    }

    boolean a(Object obj);

    Map<String, List<Object>> b();

    Object c(String str);

    a e(Ia.a aVar, String str);
}
