package H3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class w<Data> implements q<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<Uri, Data> f3698a;

    /* JADX INFO: compiled from: StringLoader.java */
    public static final class a implements r<String, AssetFileDescriptor> {
        @Override // H3.r
        public final q<String, AssetFileDescriptor> a(u uVar) {
            return new w(uVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class b implements r<String, ParcelFileDescriptor> {
        @Override // H3.r
        public final q<String, ParcelFileDescriptor> a(u uVar) {
            return new w(uVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class c implements r<String, InputStream> {
        @Override // H3.r
        public final q<String, InputStream> a(u uVar) {
            return new w(uVar.a(Uri.class, InputStream.class));
        }
    }

    public w(q<Uri, Data> qVar) {
        this.f3698a = qVar;
    }

    @Override // H3.q
    public final q.a a(String str, int i10, int i11, A3.d dVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile == null) {
            return null;
        }
        q<Uri, Data> qVar = this.f3698a;
        if (qVar.b(uriFromFile)) {
            return qVar.a(uriFromFile, i10, i11, dVar);
        }
        return null;
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}
