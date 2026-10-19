package p146l8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Continuation<String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.f f44465a;

    public u(i.f fVar) {
        this.f44465a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // com.parse.boltsinternal.Continuation
    public final String then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("71")) {
            if (result.startsWith("7F31")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
        String strSubstring = result.substring(8);
        i.f fVar = this.f44465a;
        i iVar = i.this;
        iVar.f44442f = iVar.l(strSubstring);
        i iVar2 = i.this;
        byte[] bArrK = iVar2.k(strSubstring);
        if (bArrK != null && bArrK.length != 0) {
            byte[] bArrCopyOf = new byte[0];
            int i10 = bArrK[0] & 255;
            if (1 < i10 - 1) {
                int i11 = 0;
                int i12 = 0;
                while (i10 != 255 && i10 != 0) {
                    int i13 = i11 + i10;
                    if (i13 >= bArrK.length) {
                        break;
                    }
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrK, i11 + 1, i13);
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + bArrCopyOfRange.length);
                    System.arraycopy(bArrCopyOfRange, 0, bArrCopyOf, bArrCopyOf.length - bArrCopyOfRange.length, bArrCopyOfRange.length);
                    if (i10 == 4) {
                        i12++;
                    } else if (i10 == 7) {
                        i12 += 2;
                    } else if (i10 == 10) {
                        i12 += 3;
                    } else if (i10 != 13) {
                        i12++;
                    } else {
                        i12 += 4;
                    }
                    i10 = bArrK[i13] & 255;
                    i11 = i13;
                }
                iVar2.f44440d.f(bArrCopyOf, 3, i12);
            }
        }
        if (!iVar2.f44444h) {
            iVar2.f44443g = iVar2.f44442f;
            iVar2.f44444h = true;
        }
        return iVar2.f44442f;
    }
}
