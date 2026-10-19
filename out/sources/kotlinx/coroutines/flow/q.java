package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface q<T> extends A<T>, p<T> {
    boolean d(T t8, T t10);

    @Override // kotlinx.coroutines.flow.A
    T getValue();

    void setValue(T t8);
}
