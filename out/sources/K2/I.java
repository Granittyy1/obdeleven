package K2;

/* JADX INFO: compiled from: WorkLauncher.kt */
/* JADX INFO: loaded from: classes.dex */
public interface I {
    void a(x xVar, int i10);

    default void b(x workSpecId) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        a(workSpecId, -512);
    }
}
