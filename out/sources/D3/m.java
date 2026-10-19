package D3;

import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes.dex */
public final class m<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.a.c f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends g<Data, ResourceType, Transcode>> f2767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2768c;

    public m(Class cls, Class cls2, Class cls3, List list, Y3.a.c cVar) {
        this.f2766a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f2767b = list;
        this.f2768c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final o a(int i10, int i11, A3.d dVar, B3.e eVar, DecodeJob.a aVar) throws GlideException {
        Y3.a.c cVar = this.f2766a;
        List list = (List) cVar.a();
        try {
            List<? extends g<Data, ResourceType, Transcode>> list2 = this.f2767b;
            int size = list2.size();
            o oVarA = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    oVarA = list2.get(i12).a(i10, i11, dVar, eVar, aVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (oVarA != null) {
                    break;
                }
            }
            if (oVarA != null) {
                cVar.b(list);
                return oVarA;
            }
            throw new GlideException(this.f2768c, new ArrayList(list));
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2767b.toArray()) + '}';
    }
}
