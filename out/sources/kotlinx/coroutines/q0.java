package kotlinx.coroutines;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 extends AbstractC2712w {
    public abstract q0 d1();

    @Override // kotlinx.coroutines.AbstractC2712w
    public String toString() {
        q0 q0VarD1;
        String str;
        Sa.b bVar = N.f43198a;
        q0 q0Var = kotlinx.coroutines.internal.q.f43500a;
        if (this == q0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                q0VarD1 = q0Var.d1();
            } catch (UnsupportedOperationException unused) {
                q0VarD1 = null;
            }
            str = this == q0VarD1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C.l(this);
    }
}
