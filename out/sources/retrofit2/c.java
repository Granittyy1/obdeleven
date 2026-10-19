package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BuiltInFactories.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: compiled from: BuiltInFactories.java */
    public static final class a extends c {
        @Override // retrofit2.c
        public final List a(ExecutorC2787a executorC2787a) {
            return Arrays.asList(new g(), new i(executorC2787a));
        }

        @Override // retrofit2.c
        public final List<? extends h.a> b() {
            return Collections.singletonList(new n());
        }
    }

    public List a(ExecutorC2787a executorC2787a) {
        return Collections.singletonList(new i(executorC2787a));
    }

    public List<? extends h.a> b() {
        return Collections.emptyList();
    }
}
