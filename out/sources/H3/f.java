package H3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class f<Data> implements q<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<Data> f3641a;

    /* JADX INFO: compiled from: FileLoader.java */
    public static class a<Data> implements r<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<Data> f3642a;

        public a(d<Data> dVar) {
            this.f3642a = dVar;
        }

        @Override // H3.r
        public final q<File, Data> a(u uVar) {
            return new f(this.f3642a);
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class e extends a<InputStream> {
    }

    public f(d<Data> dVar) {
        this.f3641a = dVar;
    }

    @Override // H3.q
    public final q.a a(File file, int i10, int i11, A3.d dVar) {
        File file2 = file;
        return new q.a(new W3.b(file2), new c(file2, this.f3641a));
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static final class c<Data> implements B3.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f3643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d<Data> f3644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Data f3645d;

        public c(File file, d<Data> dVar) {
            this.f3643b = file;
            this.f3644c = dVar;
        }

        @Override // B3.d
        public final Class<Data> a() {
            return this.f3644c.a();
        }

        @Override // B3.d
        public final void b() {
            Data data = this.f3645d;
            if (data != null) {
                try {
                    this.f3644c.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f3644c.c(this.f3643b);
                this.f3645d = dataC;
                aVar.d(dataC);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e10);
            }
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return DataSource.f24511b;
        }

        @Override // B3.d
        public final void cancel() {
        }
    }
}
