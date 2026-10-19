package coil.disk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.i;
import p318zb.AbstractC2843j;
import p318zb.F;
import p318zb.H;
import p318zb.k;
import p318zb.l;
import p318zb.t;
import p318zb.z;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f22951b;

    public b(t delegate) {
        i.e(delegate, "delegate");
        this.f22951b = delegate;
    }

    @Override // p318zb.l
    public final void a(z path) throws IOException {
        i.e(path, "path");
        this.f22951b.a(path);
    }

    @Override // p318zb.l
    public final List d(z dir) throws IOException {
        i.e(dir, "dir");
        List<z> listD = this.f22951b.d(dir);
        ArrayList arrayList = new ArrayList();
        for (z path : listD) {
            i.e(path, "path");
            arrayList.add(path);
        }
        p.F(arrayList);
        return arrayList;
    }

    @Override // p318zb.l
    public final k f(z path) throws IOException {
        i.e(path, "path");
        k kVarF = this.f22951b.f(path);
        if (kVarF == null) {
            return null;
        }
        z zVar = kVarF.f49095c;
        if (zVar == null) {
            return kVarF;
        }
        Map<Oa.c<?>, Object> extras = kVarF.f49100h;
        i.e(extras, "extras");
        return new k(kVarF.f49093a, kVarF.f49094b, zVar, kVarF.f49096d, kVarF.f49097e, kVarF.f49098f, kVarF.f49099g, extras);
    }

    @Override // p318zb.l
    public final AbstractC2843j g(z file) throws IOException {
        i.e(file, "file");
        return this.f22951b.g(file);
    }

    @Override // p318zb.l
    public final F h(z zVar) throws IOException {
        k kVarF;
        z zVarB = zVar.b();
        if (zVarB != null) {
            kotlin.collections.i<z> iVar = new kotlin.collections.i();
            while (zVarB != null && !c(zVarB)) {
                iVar.addFirst(zVarB);
                zVarB = zVarB.b();
            }
            for (z dir : iVar) {
                i.e(dir, "dir");
                t tVar = this.f22951b;
                tVar.getClass();
                if (!dir.e().mkdir() && ((kVarF = tVar.f(dir)) == null || !kVarF.f49094b)) {
                    throw new IOException("failed to create directory: " + dir);
                }
            }
        }
        return this.f22951b.h(zVar);
    }

    @Override // p318zb.l
    public final H i(z file) throws IOException {
        i.e(file, "file");
        return this.f22951b.i(file);
    }

    public final void j(z source, z target) throws IOException {
        i.e(source, "source");
        i.e(target, "target");
        this.f22951b.j(source, target);
    }

    public final String toString() {
        return kotlin.jvm.internal.l.a(getClass()).a() + '(' + this.f22951b + ')';
    }
}
