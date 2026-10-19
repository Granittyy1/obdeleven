package D3;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: compiled from: DiskCacheStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f2747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2748c;

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class a extends h {
        @Override // D3.h
        public final boolean a() {
            return true;
        }

        @Override // D3.h
        public final boolean b() {
            return true;
        }

        @Override // D3.h
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f24512c;
        }

        @Override // D3.h
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.f24514e || dataSource == DataSource.f24515f) ? false : true;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class b extends h {
        @Override // D3.h
        public final boolean a() {
            return false;
        }

        @Override // D3.h
        public final boolean b() {
            return false;
        }

        @Override // D3.h
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // D3.h
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class c extends h {
        @Override // D3.h
        public final boolean a() {
            return true;
        }

        @Override // D3.h
        public final boolean b() {
            return false;
        }

        @Override // D3.h
        public final boolean c(DataSource dataSource) {
            return (dataSource == DataSource.f24513d || dataSource == DataSource.f24515f) ? false : true;
        }

        @Override // D3.h
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class d extends h {
        @Override // D3.h
        public final boolean a() {
            return false;
        }

        @Override // D3.h
        public final boolean b() {
            return true;
        }

        @Override // D3.h
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // D3.h
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.f24514e || dataSource == DataSource.f24515f) ? false : true;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class e extends h {
        @Override // D3.h
        public final boolean a() {
            return true;
        }

        @Override // D3.h
        public final boolean b() {
            return true;
        }

        @Override // D3.h
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f24512c;
        }

        @Override // D3.h
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z10 && dataSource == DataSource.f24513d) || dataSource == DataSource.f24511b) && encodeStrategy == EncodeStrategy.f24522c;
        }
    }

    static {
        new a();
        f2746a = new b();
        f2747b = new c();
        new d();
        f2748c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
