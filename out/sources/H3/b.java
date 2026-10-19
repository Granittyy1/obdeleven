package H3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class b<Data> implements q<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0045b<Data> f3632a;

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class a implements r<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: H3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class C0044a implements InterfaceC0045b<ByteBuffer> {
            @Override // H3.b.InterfaceC0045b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // H3.b.InterfaceC0045b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // H3.r
        public final q<byte[], ByteBuffer> a(u uVar) {
            return new b(new C0044a());
        }
    }

    /* JADX INFO: renamed from: H3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface InterfaceC0045b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class d implements r<byte[], InputStream> {

        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class a implements InterfaceC0045b<InputStream> {
            @Override // H3.b.InterfaceC0045b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // H3.b.InterfaceC0045b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // H3.r
        public final q<byte[], InputStream> a(u uVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0045b<Data> interfaceC0045b) {
        this.f3632a = interfaceC0045b;
    }

    @Override // H3.q
    public final q.a a(byte[] bArr, int i10, int i11, A3.d dVar) {
        byte[] bArr2 = bArr;
        return new q.a(new W3.b(bArr2), new c(bArr2, this.f3632a));
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class c<Data> implements B3.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f3633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC0045b<Data> f3634c;

        public c(byte[] bArr, InterfaceC0045b<Data> interfaceC0045b) {
            this.f3633b = bArr;
            this.f3634c = interfaceC0045b;
        }

        @Override // B3.d
        public final Class<Data> a() {
            return this.f3634c.a();
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super Data> aVar) {
            aVar.d(this.f3634c.b(this.f3633b));
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
