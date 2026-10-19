package H3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class v<Data> implements q<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<Uri, Data> f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3693b;

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class a implements r<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3694a;

        public a(Resources resources) {
            this.f3694a = resources;
        }

        @Override // H3.r
        public final q<Integer, AssetFileDescriptor> a(u uVar) {
            return new v(this.f3694a, uVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class b implements r<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3695a;

        public b(Resources resources) {
            this.f3695a = resources;
        }

        @Override // H3.r
        public final q<Integer, ParcelFileDescriptor> a(u uVar) {
            return new v(this.f3695a, uVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class c implements r<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3696a;

        public c(Resources resources) {
            this.f3696a = resources;
        }

        @Override // H3.r
        public final q<Integer, InputStream> a(u uVar) {
            return new v(this.f3696a, uVar.a(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class d implements r<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f3697a;

        public d(Resources resources) {
            this.f3697a = resources;
        }

        @Override // H3.r
        public final q<Integer, Uri> a(u uVar) {
            return new v(this.f3697a, x.f3699a);
        }
    }

    public v(Resources resources, q<Uri, Data> qVar) {
        this.f3693b = resources;
        this.f3692a = qVar;
    }

    @Override // H3.q
    public final q.a a(Integer num, int i10, int i11, A3.d dVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f3693b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f3692a.a(uri, i10, i11, dVar);
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}
