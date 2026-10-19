package I3;

import B3.j;
import H3.i;
import H3.o;
import H3.p;
import H3.q;
import H3.r;
import H3.u;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: HttpGlideUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q<i, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A3.c<Integer> f3813b = A3.c.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<i, i> f3814a;

    /* JADX INFO: renamed from: I3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpGlideUrlLoader.java */
    public static class C0048a implements r<i, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<i, i> f3815a = new p<>();

        @Override // H3.r
        public final q<i, InputStream> a(u uVar) {
            return new a(this.f3815a);
        }
    }

    public a(p<i, i> pVar) {
        this.f3814a = pVar;
    }

    @Override // H3.q
    public final q.a<InputStream> a(i iVar, int i10, int i11, A3.d dVar) {
        i iVar2 = iVar;
        p<i, i> pVar = this.f3814a;
        if (pVar != null) {
            p.a aVarA = p.a.a(iVar2);
            o oVar = pVar.f3664a;
            Object objA = oVar.a(aVarA);
            ArrayDeque arrayDeque = p.a.f3665b;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarA);
            }
            i iVar3 = (i) objA;
            if (iVar3 == null) {
                oVar.d(p.a.a(iVar2), iVar2);
            } else {
                iVar2 = iVar3;
            }
        }
        return new q.a<>(iVar2, new j(iVar2, ((Integer) dVar.c(f3813b)).intValue()));
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(i iVar) {
        return true;
    }
}
