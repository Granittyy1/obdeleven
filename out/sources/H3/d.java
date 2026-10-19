package H3;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q<File, ByteBuffer> {

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class b implements r<File, ByteBuffer> {
        @Override // H3.r
        public final q<File, ByteBuffer> a(u uVar) {
            return new d();
        }
    }

    @Override // H3.q
    public final q.a<ByteBuffer> a(File file, int i10, int i11, A3.d dVar) {
        File file2 = file;
        return new q.a<>(new W3.b(file2), new a(file2));
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static final class a implements B3.d<ByteBuffer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f3635b;

        public a(File file) {
            this.f3635b = file;
        }

        @Override // B3.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(X3.a.a(this.f3635b));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e10);
            }
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return DataSource.f24511b;
        }

        @Override // B3.d
        public final void b() {
        }

        @Override // B3.d
        public final void cancel() {
        }
    }
}
