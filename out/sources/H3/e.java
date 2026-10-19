package H3;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class e<Model, Data> implements q<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f3636a;

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class b<Model> implements r<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f3640a = new a();

        /* JADX INFO: compiled from: DataUrlLoader.java */
        public class a {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // H3.r
        public final q<Model, InputStream> a(u uVar) {
            return new e(this.f3640a);
        }
    }

    public e(b.a aVar) {
        this.f3636a = aVar;
    }

    @Override // H3.q
    public final q.a<Data> a(Model model, int i10, int i11, A3.d dVar) {
        return new q.a<>(new W3.b(model), new a(model.toString(), this.f3636a));
    }

    @Override // H3.q
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class a<Data> implements B3.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b.a f3638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteArrayInputStream f3639d;

        public a(String str, b.a aVar) {
            this.f3637b = str;
            this.f3638c = aVar;
        }

        @Override // B3.d
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // B3.d
        public final void b() {
            try {
                this.f3639d.close();
            } catch (IOException unused) {
            }
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.f3638c.a(this.f3637b);
                this.f3639d = byteArrayInputStreamA;
                aVar.d(byteArrayInputStreamA);
            } catch (IllegalArgumentException e10) {
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
