package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import p169n8.b;

/* JADX INFO: renamed from: k8.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2655v0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42861b;

    public C2655v0(ControlUnit controlUnit, boolean z10) {
        this.f42861b = controlUnit;
        this.f42860a = z10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        ArrayList arrayList;
        String strSubstring = task.getResult().substring(2);
        int length = strSubstring.length() / 6;
        ControlUnit controlUnit = this.f42861b;
        if (length == 0) {
            controlUnit.f29337t = false;
        } else {
            controlUnit.f29337t = true;
            int i10 = 0;
            while (true) {
                arrayList = controlUnit.f29330m;
                if (i10 >= length) {
                    break;
                }
                int i11 = i10 * 6;
                b bVar = new b(controlUnit, strSubstring.substring(i11, i11 + 6));
                if (!bVar.f29433d.equals("65535") || (bVar.f29433d.equals("65535") && bVar.f29436g != 8)) {
                    arrayList.add(bVar);
                }
                i10++;
            }
            if (arrayList.isEmpty()) {
                controlUnit.f29337t = false;
            }
        }
        if (this.f42860a) {
            FaultsUtils.e(controlUnit.f29330m, true);
        }
        return Boolean.TRUE;
    }
}
