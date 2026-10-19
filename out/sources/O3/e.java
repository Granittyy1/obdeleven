package O3;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: GifDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends M3.b<c> {
    @Override // D3.o
    public final void a() {
        E3.h hVar;
        E3.h hVar2;
        E3.h hVar3;
        c cVar = (c) this.f4562b;
        cVar.stop();
        cVar.f4807e = true;
        g gVar = cVar.f4804b.f4813a;
        gVar.f4820c.clear();
        Bitmap bitmap = gVar.f4828l;
        if (bitmap != null) {
            gVar.f4822e.c(bitmap);
            gVar.f4828l = null;
        }
        gVar.f4823f = false;
        g.a aVar = gVar.f4826i;
        com.bumptech.glide.e eVar = gVar.f4821d;
        if (aVar != null) {
            eVar.l(aVar);
            gVar.f4826i = null;
        }
        g.a aVar2 = gVar.f4827k;
        if (aVar2 != null) {
            eVar.l(aVar2);
            gVar.f4827k = null;
        }
        g.a aVar3 = gVar.f4830n;
        if (aVar3 != null) {
            eVar.l(aVar3);
            gVar.f4830n = null;
        }
        p310z3.e eVar2 = gVar.f4818a;
        eVar2.f48818l = null;
        byte[] bArr = eVar2.f48816i;
        p310z3.a.InterfaceC0562a interfaceC0562a = eVar2.f48810c;
        if (bArr != null && (hVar3 = ((b) interfaceC0562a).f4803b) != null) {
            hVar3.h(bArr);
        }
        int[] iArr = eVar2.j;
        if (iArr != null && (hVar2 = ((b) interfaceC0562a).f4803b) != null) {
            hVar2.h(iArr);
        }
        Bitmap bitmap2 = eVar2.f48819m;
        if (bitmap2 != null) {
            ((b) interfaceC0562a).f4802a.c(bitmap2);
        }
        eVar2.f48819m = null;
        eVar2.f48811d = null;
        eVar2.f48825s = null;
        byte[] bArr2 = eVar2.f48812e;
        if (bArr2 != null && (hVar = ((b) interfaceC0562a).f4803b) != null) {
            hVar.h(bArr2);
        }
        gVar.j = true;
    }

    @Override // M3.b, D3.k
    public final void b() {
        ((c) this.f4562b).f4804b.f4813a.f4828l.prepareToDraw();
    }

    @Override // D3.o
    public final Class<c> c() {
        return c.class;
    }

    @Override // D3.o
    public final int getSize() {
        g gVar = ((c) this.f4562b).f4804b.f4813a;
        p310z3.e eVar = gVar.f4818a;
        return (eVar.j.length * 4) + eVar.f48811d.limit() + eVar.f48816i.length + gVar.f4831o;
    }
}
