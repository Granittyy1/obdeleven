package m8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;

/* JADX INFO: compiled from: KWP1281BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Continuation<String, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.b f44629a;

    public j(h.b bVar) {
        this.f44629a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<String> task) throws Exception {
        int i10;
        byte[] bArrE = com.obdeleven.service.util.b.e(task.getResult());
        int i11 = bArrE[0] & 255;
        int i12 = 1;
        h.b bVar = this.f44629a;
        if (i11 == 2) {
            h hVar = h.this;
            hVar.j = true;
            hVar.f44625k.clear();
            h hVar2 = h.this;
            hVar2.f44626l.clear();
            int length = bArrE.length;
            while (i12 < length) {
                p194p8.k kVar = new p194p8.k();
                kVar.f45916a = bArrE[i12];
                int i13 = i12 + 2;
                kVar.f45917b = bArrE[i12 + 1];
                int i14 = i12 + 3;
                byte b10 = bArrE[i13];
                hVar2.f44626l.add(b10 == 0 ? new byte[0] : Arrays.copyOfRange(bArrE, i14, i14 + b10));
                i12 = i14 + b10;
                hVar2.f44625k.add(kVar);
            }
            return hVar2.d();
        }
        if (i11 == 10) {
            throw new CommandException(0);
        }
        if (i11 == 231) {
            h.this.f44624i = Arrays.copyOfRange(bArrE, 1, bArrE.length);
            h hVar3 = h.this;
            hVar3.f44623h = hVar3.f44624i.length / 3;
        } else {
            if (i11 != 244) {
                throw new CommandException(-1);
            }
            int length2 = bArrE.length;
            h hVar4 = h.this;
            hVar4.f44623h = 0;
            hVar4.f44624i = new byte[(length2 - 1) * 3];
            int i15 = 0;
            int i16 = 1;
            while (i16 < length2) {
                h hVar5 = h.this;
                if (hVar5.j) {
                    p194p8.k kVar2 = (p194p8.k) hVar5.f44625k.get(hVar5.f44623h);
                    byte[] bArr = hVar5.f44624i;
                    int i17 = i15 + 1;
                    bArr[i15] = kVar2.f45916a;
                    i10 = i15 + 2;
                    bArr[i17] = kVar2.f45917b;
                } else {
                    byte[] bArr2 = hVar5.f44624i;
                    int i18 = i15 + 1;
                    bArr2[i15] = 0;
                    i10 = i15 + 2;
                    bArr2[i18] = 0;
                }
                hVar5.f44624i[i10] = bArrE[i16];
                i16++;
                hVar5.f44623h++;
                i15 = i10 + 1;
            }
        }
        h hVar6 = h.this;
        boolean z10 = hVar6.j;
        h.a aVar = hVar6.f44622g;
        if (z10) {
            aVar.e(hVar6.f44623h, hVar6.f44624i, hVar6.f44626l);
        } else {
            aVar.f(hVar6.f44624i, 1, hVar6.f44623h);
        }
        return Task.forResult(0);
    }
}
