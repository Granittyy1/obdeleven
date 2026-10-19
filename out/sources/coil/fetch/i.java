package coil.fetch;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.File;
import kotlin.text.n;
import p318zb.z;

/* JADX INFO: compiled from: FileFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22986a;

    /* JADX INFO: compiled from: FileFetcher.kt */
    public static final class a implements h.a<File> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            return new i((File) obj);
        }
    }

    public i(File file) {
        this.f22986a = file;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) {
        String str = z.f49122c;
        File file = this.f22986a;
        coil.decode.i iVar = new coil.decode.i(z.a.b(file), p318zb.l.f49101a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.i.d(name, "getName(...)");
        return new l(iVar, singleton.getMimeTypeFromExtension(n.l0('.', name, "")), DataSource.f22859d);
    }
}
