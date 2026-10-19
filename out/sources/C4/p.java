package C4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements E4.b<Executor> {

    /* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f2393a = new p();
    }

    @Override // p268va.a
    public final Object get() {
        return new r(Executors.newSingleThreadExecutor());
    }
}
