package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil.decode.A;
import coil.decode.C1555b;
import coil.decode.DataSource;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import p318zb.v;

/* JADX INFO: compiled from: ContentUriFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22980b;

    /* JADX INFO: compiled from: ContentUriFetcher.kt */
    public static final class a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            Uri uri = (Uri) obj;
            if (kotlin.jvm.internal.i.a(uri.getScheme(), "content")) {
                return new d(uri, kVar);
            }
            return null;
        }
    }

    public d(Uri uri, coil.request.k kVar) {
        this.f22979a = uri;
        this.f22980b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        coil.request.k kVar = this.f22980b;
        ContentResolver contentResolver = kVar.f23098a.getContentResolver();
        Uri uri = this.f22979a;
        if (kotlin.jvm.internal.i.a(uri.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.i.a(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && kotlin.jvm.internal.i.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.i.a(pathSegments.get(size - 3), "audio") && kotlin.jvm.internal.i.a(pathSegments.get(size - 2), "albums")) {
            Z2.e eVar = kVar.f23101d;
            Z2.a aVar = eVar.f7732a;
            Z2.a.C0110a c0110a = aVar instanceof Z2.a.C0110a ? (Z2.a.C0110a) aVar : null;
            if (c0110a != null) {
                Z2.a aVar2 = eVar.f7733b;
                Z2.a.C0110a c0110a2 = aVar2 instanceof Z2.a.C0110a ? (Z2.a.C0110a) aVar2 : null;
                if (c0110a2 != null) {
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(c0110a.f7725a, c0110a2.f7725a));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new l(new A(v.b(v.g(inputStreamOpenInputStream)), new androidx.navigation.compose.v(kVar.f23098a, 1), new C1555b(uri)), contentResolver.getType(uri), DataSource.f22859d);
    }
}
