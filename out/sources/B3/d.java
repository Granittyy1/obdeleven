package B3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: DataFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public interface d<T> {

    /* JADX INFO: compiled from: DataFetcher.java */
    public interface a<T> {
        void c(Exception exc);

        void d(T t8);
    }

    Class<T> a();

    void b();

    void cancel();

    void e(Priority priority, a<? super T> aVar);

    DataSource getDataSource();
}
