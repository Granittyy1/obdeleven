package A1;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    void a();

    void f(long j, long j10);

    default List<J> g() {
        return ImmutableList.K();
    }

    int h(q qVar, E e10) throws IOException;

    boolean l(q qVar) throws IOException;

    void m(r rVar);

    default p b() {
        return this;
    }
}
