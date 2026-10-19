package B3;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclableBufferedInputStream f1516a;

    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E3.h f1517a;

        public a(E3.h hVar) {
            this.f1517a = hVar;
        }

        @Override // B3.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // B3.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f1517a);
        }
    }

    public k(InputStream inputStream, E3.h hVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, hVar);
        this.f1516a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // B3.e
    public final InputStream a() throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.f1516a;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }

    @Override // B3.e
    public final void b() {
        this.f1516a.c();
    }
}
